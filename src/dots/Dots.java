package dots;


import javafx.scene.control.Tab;
import tablero.Tablero;
import usuario.Usuario;

import javax.print.DocFlavor;
import java.awt.desktop.SystemSleepEvent;
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
        System.out.println("Ingrese nombre de usuario");
        Scanner console = new Scanner(System.in);
        String response;
        try {
            response = console.nextLine();
            Usuario usr = buscarUsuario(response);
            jugar(usr);
            System.out.println(usr.username + " "  + usr.max_score + " " + usr.score + " " + usr.level + " " + usr.hash + " " + usr.control);
        } catch (Exception e) {
            System.out.println("PROBLEMA");
            e.printStackTrace();
        }

    }

    /*public static void nuevoJuego() {
        System.out.println("Nuevo Juego");
        System.out.print("Nombre de usuario: ");
        Scanner console = new Scanner(System.in);
        String str = console.next();
        File file = new datos.Datos().cargarDatos();
        try {
            Scanner input = new Scanner(file);
            input.nextLine();
            String username = input.next();
            if (str.equalsIgnoreCase(username)) {
                System.out.println("El usuario ya existe");
                System.out.println(username);
            } else {
                continuarJuego(new Usuario(username, 0, 0, 0, 0, true));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void continuarJuego(Usuario user) {
        System.out.println("Continuar juego");
        System.out.println(user.username + " " + user.level + " " + user.score);
    }*/

    public static Usuario buscarUsuario(String username) {
        File file = new datos.Datos().cargarDatos();
        int max_score;
        int score;
        int level;
        int hash;
        boolean control;
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String nombres = input.next();
                if (nombres.equals(username)) {
                    max_score = Integer.parseInt(input.next());
                    score = Integer.parseInt(input.next());
                    level = Integer.parseInt(input.next());
                    hash = Integer.parseInt(input.next());
                    control = (max_score * score * level) == hash;
                    return new Usuario(nombres, max_score, score, level, hash, control);
                }
            }
            return new Usuario(username , 0, 0 , 0, 0, true);
        } catch (IOException e) {
            System.out.println("ocurrio un problema");
        }
        return new Usuario("null", 0 , 0, 0, 0, false);
    }

    public static void jugar(Usuario usr) {
        String cRESET = "\033[0;0m";
        // int jugadas;
        // int nivel = usr.level;
        // System.out.println(usr.username + " jugando sdgdsgds");
        Tablero tab = new Tablero(usr.level);
        /* System.out.print("   ");
        for (int i = 1; i <= tab.tab.length; i++) {
            System.out.print("[" + i + "] ");
        }
        System.out.println();*/
        for (int x = 0; x < tab.tab.length; x++) {
            // System.out.print("[" + x + "] ");
            for (int y = 0; y < tab.tab.length; y++) {
                System.out.print(tab.tab[x][y].color + tab.tab[x][y].inicial + "   ");
            }
            System.out.println(cRESET);
        }

        /*do {
            generarTablero(nivel);
            do {

            } while (jugadas <= 30);
        } while (nivel <= 60);*/
    }



// @username @max_score @score @level @hash @control

}