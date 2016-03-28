- change <servlet-mapping> to map all requests to the DispatcherServlet

    <servlet-mapping>
        <servlet-name>springmvc</servlet-name>
        <!-- map all requests to the DispatcherServlet -->
        <url-pattern>/</url-pattern>
    </servlet-mapping>

- Use @Controller, there is now only one controller class , app04a.ProductController

 - add id property to Product
 - add     <context:component-scan base-package="app04a.service"/>
 