package test;

import action.PDFAction;
import util.DependencyInjector;

public class PDFActionTest {
    public static void main(String[] args) {
        DependencyInjector dependencyInjector = new DependencyInjector();
        dependencyInjector.start();
        PDFAction pdfAction = (PDFAction) dependencyInjector.getObject(
                PDFAction.class);
        pdfAction.createPDF("/home/janeexample/Downloads/1.pdf", 
                "Testing PDFAction....");
        dependencyInjector.shutDown();
    }
}
