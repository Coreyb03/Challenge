import java.util.Random;

public class Color{
    private int red;
    private int blue;
    private int green;
    Random rand = new Random();
    double percent;

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
        if (red <= 255 && red >= 0){
            this.red = red;
        } else if (red > 255){
            this.red = 255;
        } else if (red < 0){
            this.red = 0;
        }
    }

    public void setBlue(int blue){
        if (blue <= 255 && blue >= 0){
            this.blue = blue;
        } else if (blue > 255){
            this.blue = 255;
        } else if (blue < 0){
            this.blue = 0;
        }
    }

    public void setGreen(int green){
        if (green <= 255 && green >= 0){
            this.green = green;
        } else if (green > 255){
            this.green = 255;
        } else if (green < 0){
            this.green = 0;
        }
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

    public String printSummary(){
        return "RBG: " + red + "," + blue + "," + green;
    }

    //public double darken(double percent){
    //    red = red * 1.0 / percent;
    //}


}