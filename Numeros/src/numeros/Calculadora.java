package numeros;

/**
 * @author Hernández Marín Miguel Angel, Sánchez López Luis Ignacio 5IM6
 * @version 1.0, 22/08/2017
 */

public class Calculadora {
    
    int regresa = 1, resulta, cero = 0, uno = 1, dos = 1;
    String cadena = "";
    /**
     * Este método regresa el factorial del número que recibe
     * 
     * @param numero a factorial
     * @return regresa
     */
    public int factorial(int numero) {
        /**
         * la variable a regresar con cada repetición toma un nuevo valor que se multiplica 
         * a sí mismo por un número una unidad menor en cada repetición, iniciando
         * en el número que se recibió hasta que se llegue a un número mayor a cero (uno)
         */
        for (int i = numero; i > 0; i--) {
            regresa = regresa * i;
        }
        return regresa;
    }
    /**
     * Este método regresa la serie de Fibonacci en forma de una cadena de caracteres
     * 
     * @param numero a serie Fibonacci
     * @return cadena
     */
    public String serie(int numero) {
        /**
         * El bucle se repite desde la posición dos, hasta llegar a la posición recibida
         */
        for (int i = 2; i <= numero; ++i) {
            /**
             * Se le agrega un valor a la cadena en cada repetición
             */
            cadena += ", " + dos; 
            /**
             * Se actualizan los valores de los números que se van a sumar para regresar el valor
             */
            dos = uno + dos;
            uno = dos - uno;
        }
        return cadena;
    }
}
