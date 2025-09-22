public class PdfDocument extends Document {
    String generateContent() {
        return "Contenu PDF généré";
    }

    void save(String filename) {
        System.out.printf("Document PDF '%s' sauvegardé%n", filename);
    }
}
