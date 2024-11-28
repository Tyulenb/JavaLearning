package lesson13.Decorator;

public class TxtDecorator implements Text{
    protected Text decoratedText;

    public TxtDecorator(Text decoratedText){
        this.decoratedText = decoratedText;
    }

    public void display(){
        decoratedText.display();
    }
}
