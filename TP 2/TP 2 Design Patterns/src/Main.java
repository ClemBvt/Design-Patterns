public class Main {
    public static void main(String[] args) {
        // Test Singleton
        LogManager lm1 = LogManager.getInstance();
        LogManager lm2 = LogManager.getInstance();
        System.out.println("lm1 == lm2 ? " + (lm1 == lm2));
        lm1.log("Message via lm1", LogLevel.INFO);

        // Test Factory Method
        DocumentCreator pdfCreator = new PdfCreator();
        DocumentCreator wordCreator = new WordCreator();

        pdfCreator.generateAndSave("PDF_Test.pdf");
        wordCreator.generateAndSave("Word_Test.pdf");
    }
}