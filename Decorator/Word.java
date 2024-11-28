package lesson13.Decorator;

public class Word extends TxtDecorator{
    public Word(Text decoratedText){
       super(decoratedText);
    }

    @Override
    public void display() {
        super.display();
        GOST(decoratedText);
    }

    private void GOST(Text decoratedText){
        System.out.println("Text in GOST format.");
    }
}
