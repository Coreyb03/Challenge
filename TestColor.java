import java.util.Random;

public class TestColor{
    public static void main(String[] args) {
        Random rand = new Random();
        
        
        Color color1 = new Color();
        color1.printSummary();

        color1.setBlue(1112);
        color1.clamp();
        color1.setRandomRed();
        color1.printSummary();

        color1.darken(66.7);
        color1.clamp();
        color1.printSummary();

    }
}