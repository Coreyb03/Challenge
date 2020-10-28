import java.util.Random;

public class Color{
    private int red;
    private int blue;
    private int green;
    Random rand = new Random();


    public Color(int red, int blue, int green){
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    public Color(){
        red = rand.nextInt(255);
        blue = rand.nextInt(255);
        green = rand.nextInt(255);
    }

    public void setRed(int red){
        this.red = red;
    }

    public void setBlue(int blue){
        this.blue = blue;
    }

    public void setGreen(int green){
        this.green = green;
    }

    public void setRandomRed(){
        red = rand.nextInt(256);
    }

    public void setRandomBlue(){
        blue = rand.nextInt(256);
    }

    public void setRandomGreen(){
        green = rand.nextInt(256);
    }

    public void setRandom(){
        red = rand.nextInt(256);
        blue = rand.nextInt(256);
        green = rand.nextInt(256);
    }

    public void printSummary(){
        System.out.println( "RBG: " + Integer.toString(red) + "," + Integer.toString(blue) + "," + Integer.toString(green));
    }

    public void darken(double percent){
        red = (int) (red * (1.0 - percent/100.0));
        blue = (int) (blue * (1.0 - percent/100.0));
        green = (int) (green * (1.0 - percent/100.0));
    }

    public void lighten(double percent){
        red = (int) (red * (1.0 + percent/100.0));
        blue = (int) (blue * (1.0 + percent/100.0));
        green = (int) (green * (1.0 + percent/100.0));
    }

    public void clamp(){
        if (red <= 255 && red >= 0){
            this.red = red;
        } else if (red > 255){
            this.red = 255;
        } else if (red < 0){
            this.red = 0;
        }
    
        if (blue <= 255 && blue >= 0){
            this.blue = blue;
        } else if (blue > 255){
            this.blue = 255;
        } else if (blue < 0){
            this.blue = 0;
        }

        if (green <= 255 && green >= 0){
            this.green = green;
        } else if (green > 255){
            this.green = 255;
        } else if (green < 0){
            this.green = 0;
        }
    }


}