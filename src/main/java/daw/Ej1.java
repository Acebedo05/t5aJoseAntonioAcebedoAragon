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
        JOptionPane.showMessageDialog(null, palabrasTresVocales(arrayNumeroPalabras));
        JOptionPane.showMessageDialog(null, palabrasDosVocales(arrayNumeroPalabras));

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

    public static int contarVocales(String palabras) {
        int aux = 0;

        for (int i = 0; i < palabras.length(); i++) {
            if (palabras.charAt(i) == 'a' 
                || palabras.charAt(i) == 'e' 
                || palabras.charAt(i) == 'i' 
                || palabras.charAt(i) == 'o' 
                || palabras.charAt(i) == 'u') {
                aux++;
            }
        }

        return aux;
    }

    public static String[] palabrasTresVocales(String[] miarray) {
        int medidor = 0;

        for (int i = 0; i < miarray.length; i++) {
            if (contarVocales(miarray[i]) >= 3) {
                medidor++;
            }
        }

        String[] arrayFinal = new String[medidor];
        int j = 0;

        for (int o = 0; o < miarray.length; o++) {
            if (contarVocales(miarray[o]) >= 3) {
                arrayFinal[j] = miarray[o];
                j++;
            }
        }

        return arrayFinal;
    }

    public static String[] palabrasDosVocales(String[] miarray) {
        int medidor = 0;

        for (int i = 0; i < miarray.length; i++) {
            if (contarVocales(miarray[i]) <= 2) {
                medidor++;
            }
        }

        String[] arrayFinal = new String[medidor];
        int k = 0;

        for (int o = 0; o < miarray.length; o++) {
            if (contarVocales(miarray[o]) <= 2) {
                arrayFinal[k] = miarray[o];
                k++;
            }
        }

        return arrayFinal;
    }
}
