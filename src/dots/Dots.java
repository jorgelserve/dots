package dots;


import java.util.Scanner;
import java.io.*;

public class Dots {


    public static void main(final String[] args) {
        datos();
    }

    public static void datos() {
        try {

            File myFile = new File("puntajes.txt");

            if (myFile.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*Scanner console = new Scanner(System.in);
        while (true) {
            System.out.print("");
            String string = console.nextLine();

            System.out.println(string);
        }*/
    }
}