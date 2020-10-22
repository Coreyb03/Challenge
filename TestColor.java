import java.util.Random;

public class TestColor{
    public static void main(String[] args) {
        Random rand = new Random();
        
        
        Color color1 = new Color();
        System.out.println(color1.printSummary());

        color1.setBlue(1112);
        color1.setRandomRed();
        System.out.println(color1.printSummary());

    }
}