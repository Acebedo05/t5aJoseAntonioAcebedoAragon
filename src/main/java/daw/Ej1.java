package daw;

import javax.swing.JOptionPane;

/**
 *
 * @author acebedo
 */
public class Ej1 {

    public static void main(String[] args) {

        String arrayNumeroPalabras[] = crearArrayNumeroPalabras();
        mostrarArrayNumeroPalabras(arrayNumeroPalabras);

    }

    public static int numeroPalabrasInicial() {
        int numeroPalabras = 0;
        boolean repetir = true;

        do {
            try {
                numeroPalabras = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de palabras que vas a meter."));
                repetir = false;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Introduce un valor correcto.");
            }
        } while (repetir);

        return numeroPalabras;
    }

    public static String[] crearArrayNumeroPalabras() {

        // Crear un array con el tamaño adecuado.
        String[] arrayPalabras = new String[numeroPalabrasInicial()];

        for (int i = 0; i < arrayPalabras.length; i++) {
            arrayPalabras[i] = JOptionPane.showInputDialog(null, "Introduce una palabra.");
        }
        return arrayPalabras;
    }

    public static void mostrarArrayNumeroPalabras(String[] arrayPalabras) {
        String aux = "";

        for (int i = 0; i < arrayPalabras.length; i++) {
            aux += "Posicion" + i + " - Palabra: " + arrayPalabras[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, aux);
    }
}
