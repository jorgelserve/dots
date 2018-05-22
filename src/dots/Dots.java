package dots;


import javax.print.DocFlavor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Dots {

    public static void main(final String[] args) {

        iniciar();
        // ArrayList<usuario.Usuario> list = new ArrayList<>();

        // usuarios.add(new Usuario("jorge", 350, 100, 0, 0, true));

        /*File file = new datos.Datos().cargarDatos();
        try {
            Scanner input = new Scanner(file);
            input.nextLine();
            System.out.println(input.next());
        } catch (FileNotFoundException e) {
            System.out.println("PROBLEMA");
        }*/

    }

    public static void iniciar() {
        System.out.println("Desea continuar un nuevo juego ? (S o N)");
        Scanner console = new Scanner(System.in);
        String response;
        try {
            response = console.nextLine();
            while(!(response.equals("S") || response.equals("s") || response.equals("N") ||response.equals("n"))) {
                System.out.println("Solo se permiten las respuestas S o N");
                response = console.nextLine();
            }

            if (response.equals("S") || response.equals("s")) {
                nuevoJuego();
            } else {
                continuarJuego();
            }
        } catch (Exception e) {
            System.out.println("PROBLEMA");
        }

    }

    public static void nuevoJuego() {
        System.out.println("Nuevo Juego");
        System.out.print("Nombre de usuario: ");
        Scanner console = new Scanner(System.in);
        String str = console.next();



    }

    public static void continuarJuego() {
        System.out.println("Continuar juego");
    }




}