package lesson13.Decorator;

public class MarkDown extends TxtDecorator{
    public MarkDown(Text decoratedText){
        super(decoratedText);
    }

    public void display(){
        decoratedText.display();
        setMarkDown(decoratedText);
    }

    public void setMarkDown(Text decoratedText){
        System.out.println("Text with markdown");
    }
}
