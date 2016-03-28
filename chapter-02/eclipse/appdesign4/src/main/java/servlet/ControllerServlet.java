package servlet;

import action.PDFAction;
import java.io.IOException;
import javax.servlet.ReadListener;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import util.DependencyInjector;

@WebServlet(name = "ControllerServlet", urlPatterns = {
    "/form", "/pdf"})
public class ControllerServlet extends HttpServlet {
private static final long serialVersionUID = 6679L;
    private DependencyInjector dependencyInjector;
 
    @Override
    public void init() {
        dependencyInjector = new DependencyInjector();
        dependencyInjector.start();
    }
 
    @Override
    public void destroy() {
        dependencyInjector.shutDown();
    }
    protected void process(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        ReadListener r = null;
        String uri = request.getRequestURI();
        /*
         * uri is in this form: /contextName/resourceName,
         * for example: /app10a/product_input.
         * However, in the case of a default context, the
         * context name is empty, and uri has this form
         * /resourceName, e.g.: /product_input
         */
        int lastIndex = uri.lastIndexOf("/");
        String action = uri.substring(lastIndex + 1);
        if ("form".equals(action)) {
            String dispatchUrl = "/jsp/Form.jsp";
            RequestDispatcher rd = 
                    request.getRequestDispatcher(dispatchUrl);
            rd.forward(request, response);
        } else if ("pdf".equals(action)) {
            HttpSession session = request.getSession(true);
            String sessionId = session.getId();
            PDFAction pdfAction = (PDFAction) dependencyInjector
                    .getObject(PDFAction.class);
            String text = request.getParameter("text");
            String path = request.getServletContext()
                    .getRealPath("/result") + sessionId + ".pdf";
            pdfAction.createPDF(path, text);
            
            // redirect to the new pdf
            StringBuilder redirect = new 
                    StringBuilder();
            redirect.append(request.getScheme() + "://");
            redirect.append(request.getLocalName());
            int port = request.getLocalPort();
            if (port != 80) {
                redirect.append(":" + port);
            }
            String contextPath = request.getContextPath();
            if (!"/".equals(contextPath)) {
                redirect.append(contextPath);
            }
            redirect.append("/result/" + sessionId + ".pdf");
            response.sendRedirect(redirect.toString());
        }
    }

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        process(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        process(request, response);
    }

}
