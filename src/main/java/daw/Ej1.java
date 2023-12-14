package daw;

import javax.swing.JOptionPane;

/**
 *
 * @author acebedo
 */
public class Ej1 {

    public static void main(String[] args) {

    }

    public static int numeroPalabrasInicial() {
        int numeroPalabras = 0;
        boolean repetir = false;

        do {
            try {
                numeroPalabras = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de palabras que vas a meter."));
                repetir = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Introduce un valor correcto.");
            }
        } while (repetir);

        return numeroPalabrasInicial();
    }

    public static String crearArrayNumeroPalbras() {
        
        // Crear un array con el tamaño adecuado.
        String[] arrayPalabras = new [];
    }

}
