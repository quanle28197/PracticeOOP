package bai10;

public class Main {
    public static void main(String[] args) {
        Paragrapth para = new Paragrapth("Fpt SoftWare is amaZing       ");
        para.show();

        para.normalize();
        para.show();
        System.out.println("Word count in the text: " + para.wordCount());
        System.out.println("Char counter: " + para.charCount("S"));
    }
}
