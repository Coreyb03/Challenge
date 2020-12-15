import java.util.Scanner;
import java.io.*;
import java.util.NoSuchElementException;
import java.util.Random;

public class RpgTest{
    
    public static void main(String[] args)throws FileNotFoundException {
        int userInput = 0;
        Scanner userScanner = new Scanner(System.in);
        while (userInput != 4){
            System.out.println("What would you like to do?");
            System.out.println("\t 1. Create new game \n\t 2. Validate a save game \n\t 3. Reroll a character \n\t 4. Quit");
            userInput = userScanner.nextInt();
            if (userInput == 1){
                newGame();
            } else if (userInput == 2){
                validate();
            } else if (userInput == 3){
                reroll();
            }
        }



        
    }

    public static void newGame()throws FileNotFoundException{
        Scanner userScanner = new Scanner(System.in);
        Random rand = new Random();
        File file = new File("RpgData.md");
        PrintWriter output = new PrintWriter(file);

        System.out.println("What is this games name?");
        String gameName = userScanner.nextLine(); 
        int numOfChar = 0;
        int str = 0, tgn = 0, intel = 0, mag = 0, inf = 0;

        output.println(gameName);
        output.flush();

        while (numOfChar < 4){
            int roleNum = 0;
            System.out.println("\nCreating character " + (numOfChar + 1));
            while (roleNum < 1 || roleNum > 5){
                System.out.println("What role do you want this character to be?");
                System.out.println("\t 1. Knight \n\t 2. Peasant \n\t 3. Cleric \n\t 4. Mage \n\t 5. Courtier");
                System.out.println("\nEnter a number (1-5)");
                roleNum = userScanner.nextInt();
            }

            if (roleNum == 1 ){
                int statTotal = str + tgn + intel + mag + inf;
                int wantChar = 0;
                while (wantChar != 1){
                    statTotal = 0;
                    while ( statTotal < 8 || statTotal > 28){
                        str = 7 + rand.nextInt(4);
                        tgn = rand.nextInt(7);
                        intel  = rand.nextInt(7);
                        mag  = rand.nextInt(7);
                        inf = rand.nextInt(7);
                        statTotal = str + tgn + intel + mag + inf;
                    }
                    System.out.println("knight \nstr- " + str + "\ntgn- " + tgn + "\nint- " + intel
                    + "\nmag- " + mag + "\ninf- " + inf);
                    System.out.println("Do you want this character? 1 = yes 0 = no");
                    wantChar = userScanner.nextInt();
                }
                System.out.println("What is this characters name?");
                String name = userScanner.next();

                Rpg character = new Rpg(name, "Knight", str, tgn, intel, mag, inf);
                output.println(character);

            } else if (roleNum == 2){
                int statTotal = str + tgn + intel + mag + inf;
                int wantChar = 0;
                while (wantChar != 1){
                    statTotal = 0;
                    while ( statTotal < 8 || statTotal > 28){
                        str = rand.nextInt(7);
                        tgn = 7 + rand.nextInt(4);
                        intel  = rand.nextInt(7);
                        mag  = rand.nextInt(7);
                        inf = rand.nextInt(7);
                        statTotal = str + tgn + intel + mag + inf;
                    }
                    System.out.println("Peasant \nstr- " + str + "\ntgn- " + tgn + "\nint- " + intel
                    + "\nmag- " + mag + "\ninf- " + inf);
                    System.out.println("Do you want this character? 1 = yes 0 = no");
                    wantChar = userScanner.nextInt();
                }
                System.out.println("What is this characters name?");
                String name = userScanner.next();

                Rpg character = new Rpg(name, "Peasant", str, tgn, intel, mag, inf);
                output.println(character);

            } else if (roleNum ==3){
                int statTotal = str + tgn + intel + mag + inf;
                int wantChar = 0;
                while (wantChar != 1){
                    statTotal = 0;
                    while ( statTotal < 8 || statTotal > 28){
                        str = rand.nextInt(7);
                        tgn = rand.nextInt(7);
                        intel  = 7 + rand.nextInt(4);
                        mag  = rand.nextInt(7);
                        inf = rand.nextInt(7);
                        statTotal = str + tgn + intel + mag + inf;
                    }
                    System.out.println("Cleric \nstr- " + str + "\ntgn- " + tgn + "\nint- " + intel
                    + "\nmag- " + mag + "\ninf- " + inf);
                    System.out.println("Do you want this character? 1 = yes 0 = no");
                    wantChar = userScanner.nextInt();
                }
                System.out.println("What is this characters name?");
                String name = userScanner.next();

                Rpg character = new Rpg(name, "Cleric", str, tgn, intel, mag, inf);
                output.println(character);

            } else if (roleNum == 4){
                int statTotal = str + tgn + intel + mag + inf;
                int wantChar = 0;
                while (wantChar != 1){
                    statTotal = 0;
                    while ( statTotal < 8 || statTotal > 28){
                        str = rand.nextInt(7);
                        tgn = rand.nextInt(7);
                        intel  = rand.nextInt(7);
                        mag  = 7 + rand.nextInt(4);
                        inf = rand.nextInt(7);
                        statTotal = str + tgn + intel + mag + inf;
                    }
                    System.out.println("Mage \nstr- " + str + "\ntgn- " + tgn + "\nint- " + intel
                    + "\nmag- " + mag + "\ninf- " + inf);
                    System.out.println("Do you want this character? 1 = yes 0 = no");
                    wantChar = userScanner.nextInt();
                }
                System.out.println("What is this characters name?");
                String name = userScanner.next();

                Rpg character = new Rpg(name, "Mage", str, tgn, intel, mag, inf);
                output.println(character);

            } else if (roleNum == 5){
                int statTotal = str + tgn + intel + mag + inf;
                int wantChar = 0;
                while (wantChar != 1){
                    statTotal = 0;
                    while ( statTotal < 8 || statTotal > 28){
                        str = rand.nextInt(7);
                        tgn = rand.nextInt(7);
                        intel  = rand.nextInt(7);
                        mag  = rand.nextInt(7);
                        inf = 7 + rand.nextInt(4);
                        statTotal = str + tgn + intel + mag + inf;
                    }
                    System.out.println("Courtier \nstr- " + str + "\ntgn- " + tgn + "\nint- " + intel
                    + "\nmag- " + mag + "\ninf- " + inf);
                    System.out.println("Do you want this character? 1 = yes 0 = no");
                    wantChar = userScanner.nextInt();
                }
                System.out.println("What is this characters name?");
                String name = userScanner.next();

                Rpg character = new Rpg(name, "Courtier", str, tgn, intel, mag, inf);
                output.println(character);

            }
            numOfChar += 1;
            output.flush();
        }
        output.close();
    }

    public static void validate()throws FileNotFoundException{
        File file = new File("RpgData.md");
        Scanner dataScanner = new Scanner(file);
        int lineNum =0;
        int knightNum = 0, peasantNum =0, clericNum =0, mageNum =0, courtierNum =0;
            while(dataScanner.hasNextLine()){
                lineNum++;
                dataScanner.nextLine();
                //System.out.println(lineNum);
            }
        dataScanner = new Scanner(file);
            while (dataScanner.hasNext()){
                String roleCheck = dataScanner.next();
                if (roleCheck.equals("Knight")){
                    knightNum += 1;
                } else if (roleCheck.equals("Peasant")){
                    peasantNum += 1;
                } else if (roleCheck.equals("Cleric")){
                    clericNum += 1;
                } else if (roleCheck.equals("Mage")){
                    mageNum += 1;
                } else if (roleCheck.equals("Courtier")){
                    courtierNum += 1;
                }
            }
        if (lineNum != 5 || knightNum > 2 || peasantNum > 2 || clericNum > 2 || mageNum > 2 || courtierNum > 2){
            System.out.println("File not valid! creating new game...");
            newGame();
        } else {
            System.out.println("The game is valid! :)");
        }
    }

    public static void reroll()throws FileNotFoundException, NoSuchElementException{
        File file = new File("RpgData.md");
        File copyFile = new File("RpgDataCopy.md");
        Scanner dataScanner;
        Scanner userScanner = new Scanner(System.in);
        Random rand = new Random();
        
        dataScanner = new Scanner(file);
        while (dataScanner.hasNextLine()){
            String[] parameters = dataScanner.nextLine().split(",");
            if (parameters.length > 1){
                System.out.println("\t-" + parameters[0]);
            }
        }
        System.out.println("\nWhat is the name of the character you would like to reroll?");
        String name = userScanner.next();

        PrintWriter copy = new PrintWriter(copyFile);
        dataScanner = new Scanner(file);
        while(dataScanner.hasNextLine()){
            String characterData = dataScanner.nextLine();
            String[] parameters = characterData.split(",");
            int str = 0, tgn = 0, intel = 0, mag = 0, inf = 0;

            if (parameters[0].equals(name)){
                if (parameters[1].equals("Knight")){
                    int statTotal = 0;
                    while ( statTotal < 8 || statTotal > 28){
                        str = 7 + rand.nextInt(4);
                        tgn = rand.nextInt(7);
                        intel  = rand.nextInt(7);
                        mag  = rand.nextInt(7);
                        inf = rand.nextInt(7);
                        statTotal = str + tgn + intel + mag + inf;
                    }
                } else if (parameters[1].equals("Peasant")){
                    int statTotal = 0;
                    while ( statTotal < 8 || statTotal > 28){
                        str = rand.nextInt(7);
                        tgn = 7 + rand.nextInt(4);
                        intel  = rand.nextInt(7);
                        mag  = rand.nextInt(7);
                        inf = rand.nextInt(7);
                        statTotal = str + tgn + intel + mag + inf;
                    }
                } else if (parameters[1].equals("Cleric")){
                    int statTotal = 0;
                    while ( statTotal < 8 || statTotal > 28){
                        str = rand.nextInt(7);
                        tgn = rand.nextInt(7);
                        intel  = 7 + rand.nextInt(4);
                        mag  = rand.nextInt(7);
                        inf = rand.nextInt(4);
                        statTotal = str + tgn + intel + mag + inf;
                    }
                } else if (parameters[1].equals("Mage")){
                    int statTotal = 0;
                    while ( statTotal < 8 || statTotal > 28){
                        str = rand.nextInt(7);
                        tgn = rand.nextInt(7);
                        intel  = rand.nextInt(7);
                        mag  = 7+ rand.nextInt(4);
                        inf = rand.nextInt(7);
                        statTotal = str + tgn + intel + mag + inf;
                    }
                } else if (parameters[1].equals("Courtier")){
                    int statTotal = 0;
                    while ( statTotal < 8 || statTotal > 28){
                        str = rand.nextInt(7);
                        tgn = rand.nextInt(7);
                        intel  = rand.nextInt(7);
                        mag  = rand.nextInt(7);
                        inf = 7 + rand.nextInt(4);
                        statTotal = str + tgn + intel + mag + inf;
                    }
                }

                Rpg charReroll = new Rpg(parameters[0],parameters[1],str,tgn,intel,mag,inf);
                copy.println(charReroll);
            } else {
                copy.println(characterData);
            }
            copy.flush();
        }
        copy.close();
        
        PrintWriter output = new PrintWriter(file);
        dataScanner = new Scanner(copyFile);
        while (dataScanner.hasNextLine()){
            output.println(dataScanner.nextLine());
            output.flush();
        }
        output.close();
    }

}


