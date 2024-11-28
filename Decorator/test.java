package lesson13.Decorator;

public class test {
    public static void main(String[] args) {
        Text txt = new txt();
        Text Notion = new MarkDown(new txt());

        System.out.println("file.txt");
        txt.display();
        System.out.println("\nfile.md");
        Notion.display();

        Text wordFile = new Word(new txt());
        System.out.println("\nfile.docx");
        wordFile.display();
    }
}
