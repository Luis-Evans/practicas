package numeros;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 * @author Hernández Marín Miguel Angel, Sánchez López Luis Ignacio 5IM6
 * @version 1.0, 22/08/2017
 */
public class Ventana extends JFrame implements ActionListener, KeyListener {

    JLabel num, obt, adb;
    JTextField text;
    JButton fibo, facto;

    public Ventana() {
        setBounds(500, 500, 500, 500);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        num = new JLabel("Número:");
        num.setBounds(100, 50, 100, 40);
        add(num);

        obt = new JLabel("Obtener");
        obt.setBounds(200, 200, 100, 40);
        add(obt);
        /**
         * Cada que se presiona una tecla valida que solo entren números
         */
        text = new JTextField();
        text.setBounds(300, 50, 100, 40);
        add(text);
        text.addKeyListener(this);
        /**
         * Cuando se hace clic en el botón, nos manda a calcular la serie de
         * Fibonacci hasta la posición tecleada en el TextField
         */
        fibo = new JButton("Serie Fibonacci");
        fibo.setBounds(150, 250, 200, 40);
        add(fibo);
        fibo.addActionListener(this);
        /**
         * Cuando se hace clic en el botón, nos manda a calcular el factorial
         * del número tecleado en el TextField
         */
        facto = new JButton("Factorial");
        facto.setBounds(150, 350, 200, 40);
        add(facto);
        facto.addActionListener(this);

        adb = new JLabel("*La serie de Fibonacci comienza desde la posición 0.");
        adb.setBounds(85, 125, 400, 40);
        add(adb);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /**
         * Creamos un objeto a la clase calculadora, donde se hacen las
         * ´operaciones
         */
        Calculadora obj = new Calculadora();
        /**
         * Si el clic corresponde al botón "Serie Fibonacci" se ejecutan éstas
         * instrucciones
         */
        if (e.getActionCommand().equals("Serie Fibonacci")) {
            /**
             * Es la variable que tomará el valor que regresa el método, o bien,
             * que se mostrará al usuario
             */
            String respuesta;
            /**
             * Esta variable obtiene el valor del JTextField 
             */
            int solic = Integer.parseInt(text.getText());
            /**
             * Si la posición tecleada es la cero, entonces el número es cero, sino
             * la respuesta toma otro valor
             */
            if (solic == 0) 
                respuesta = "0";
            else 
                /**
                 * Si la posición tecleada es uno, entonces el número que está en la
                 * posición uno es el número uno, sino la variable tomará el valor
                 * que regresa el método, que es la cadena de la serie completa
                 * 
                 * @param solic a serie
                 */
                if (solic == 1)
                    respuesta = "1";
                else 
                    respuesta = "0, 1" + obj.serie(solic);
            /**
             * Se muestra el resultado final en una notifición
             */
            JOptionPane.showMessageDialog(null, "La serie es: " + respuesta);
        } else {
            /**
             * Como solo son dos botones, es innecesario verificar que sea el otro botón,
             * sino es uno es otro
             * 
             * La variable respuesta adquiere el valor que regresa el método factorial() 
             * 
             * @param valor a factorial
             */
            int respuesta, valor = Integer.parseInt(text.getText());
            respuesta = obj.factorial(valor);
            JOptionPane.showMessageDialog(null, "El factorial de " + text.getText() + " es: " + respuesta);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        /**
         * Cada que esbriben obtienes el caracter tecleado
         */
        char key = e.getKeyChar();
        /**
         * Se verifica que sea el cuadro de texto deseado 
         */
        if (e.getSource() == text) {
            /**
             * Si el caracter no se encuentra en el rango especificado no se permite
             * su escritura en el cuadro de texto
             */
            if (!((key >= '0') && (key <= '9'))) {
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
