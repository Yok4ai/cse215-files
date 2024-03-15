package FileDemo;

public class NewFile {
    private String filename;
    private String text;
    class NoFileException extends Exception{
        public NoFileException(String message) {
            super(message);
        }
    }

    public NewFile(String filename, String text) throws NoFileException{
        this.filename = filename;
        this.text = text;
        if(filename == "hello"){
            throw new NoFileException("Cant be file name");
        }
        else {
            System.out.println("File is created");
        }
    }
}
