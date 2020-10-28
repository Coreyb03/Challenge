import java.util.Random;

public class TestColor{
    public static void main(String[] args) {
        Random rand = new Random();
        
        
        Color color1 = new Color();
        color1.printSummary();

        color1.setBlue(1112);
        color1.setRandomRed();
        color1.setGreen(-33);
        color1.clamp();
        color1.printSummary();

        color1.darken(66.7);
        color1.clamp();
        color1.printSummary();

        color1.setRandom();
        color1.printSummary();
        
        color1.lighten(300);
        color1.clamp();
        color1.printSummary();

        color1.setBlue(99);
        color1.setRandomGreen();
        color1.setRed(123);
        color1.darken(9);
        color1.printSummary();

        Color color2 = new Color(100,25,255);
        color2.printSummary();


    }
}