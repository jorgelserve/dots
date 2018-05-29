package tablero;

public class Tablero {
    public static final int size = 6;
    public Punto[][] tab = new Punto[size*4][size];

    public static final String cRESET = "\033[0;0m";

    public Tablero(int level) {
        for (int x = 0; x < tab.length; x++) {
            for (int y = 0; y < tab[x].length; y++) {
                tab[x][y] = new Punto((int)(Math.random() * (5 - 1) + 1));
                // System.out.println(tab[x][y].color + tab[x][y].inicial + cRESET);
            }
        }
    }
}

// @amarillo @azul @rojo @verde @mor5ado
