package binomio;

/**
 * @author 5IM6 Hernández Marín Miguel Angel, Sánchez López Luis Ignacio
 * @version 1.0 25/08/2017
 */
public class TCP {
    
    String regresa = "", num = "", letritas = "", num2 = "", let2 = "", regresa2 = "", regresa3 = "", op1, op2;
    int unos, resulta, unos2, resulta2, opera1, opera2, resulta3 = 2;
    /**
     * Éste método eleva al cuadrado el término del primer cuadro de texto
     * @param uno primer campo de texto
     * @return regresa una cadena
     */
    public String T(String uno) {
        for (int i = 0; i < uno.length(); ++i) {
            if (!((uno.charAt(i) >= '0') && (uno.charAt(i) >= '9'))) {
                num += uno.charAt(i);
            } else {
                letritas += uno.charAt(i);
            }
        }
        unos = Integer.parseInt(num);
        resulta3 *= unos;
        resulta = (int) Math.pow(unos, 2);
        regresa = Integer.toString(resulta) + " " + letritas + "2";
        return regresa;
    }
    /**
     * Éste método eleva el cuadrado el término del segundo campo de texto
     * @param dos redibe el valor del segundo campo de texto
     * @return regresa una cadena
     */
    public String P(String dos) {
        for (int i = 0; i < dos.length(); ++i) {
            if (!((dos.charAt(i) >= '0') && (dos.charAt(i) >= '9'))) {
                num2 += dos.charAt(i);
            } else {
                let2 += dos.charAt(i);
            }
        }
        unos2 = Integer.parseInt(num2);
        opera2 = unos2;
        resulta3 *= unos2;
        resulta2 = (int) Math.pow(unos2, 2);
        regresa2 = Integer.toString(resulta2) + " " + let2 + "2";
        return regresa2;
    }
    /**
     * Éste método multiplica ambos términos 
     * @return primer término por el segundo por dos
     * @see T() y P()
     */ 
    public String C() {
        regresa3 = Integer.toString(resulta3) + " " + letritas + " " + let2 + " ";
        return regresa3;
    }
}
