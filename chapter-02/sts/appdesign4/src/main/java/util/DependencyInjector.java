package util;

import action.PDFAction;
import service.PDFService;

public class DependencyInjector {
 
    public void start() {
        // initialization code
    }
 
    public void shutDown() {
        // clean-up code
    }
 
    /*
     * Returns an instance of type. type is of type Class
     * and not String because it's easy to misspell a class name
     */
    public Object getObject(Class type) {
        if (type == PDFService.class) {
            return new PDFService();
        } else if (type == PDFAction.class) {
            PDFService pdfService = (PDFService) 
                    getObject(PDFService.class);
            PDFAction action = new PDFAction();
            action.setPDFService(pdfService);
            return action;
        }
        return null;
    }
}