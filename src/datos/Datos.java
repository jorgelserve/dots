package datos;

import usuario.Usuario;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Datos {

    public File cargarDatos() {
        try {

            File myFile = new File("puntajes.txt");
            if (myFile.createNewFile()){
                // System.out.println("File is created!");
                return myFile;
            }else{
                // System.out.println("Fie is loaded");
                return myFile;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
