public class WordDocument extends Document {
    String generateContent() {
        return "Contenu Word généré";
    }

    void save(String filename) {
        System.out.printf("Document Word '%s' sauvegardé%n", filename);
    }
}
