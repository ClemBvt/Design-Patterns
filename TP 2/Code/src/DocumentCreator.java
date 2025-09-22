abstract class DocumentCreator {
    abstract Document createDocument();

    public void generateAndSave(String filename){
        Document doc = createDocument();
        String content = doc.generateContent();
        doc.save(filename);

        LogManager.getInstance().log(
                String.format("Document %s créé et sauvegardé : %s%n",
                        doc.getClass().getSimpleName(), filename),
                LogLevel.INFO
        );
    }
}