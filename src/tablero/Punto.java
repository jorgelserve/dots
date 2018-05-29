package tablero;

public class Punto {
    public String color;
    public String inicial;

    public Punto(int code) {
        switch (code) {
            case 1:
                this.color = "\033[0;33m";
                this.inicial = "A";
                break;

            case 2:
                this.color = "\033[0;36m";
                this.inicial = "A";
                break;

            case 3:
                this.color = "\033[0;31m";
                this.inicial = "R";
                break;

            case 4:
                this.color = "\033[0;32m";
                this.inicial = "V";
                break;

            case 5:
                this.color = "\033[0;35m";
                this.inicial = "M";
                break;
        }
    }
}

// @amarillo @azul @rojo @verde @morado