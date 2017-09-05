package binomio;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author 5IM6 Hernández Marín Miguel Angel, Sánchez López Luis Ignacio
 * @version 1.0 25/08/2017
 */
public class Ventana extends JFrame implements ActionListener, KeyListener {

    JLabel uno, dos;
    JButton tres;
    JTextField cuatro, cinco;

    public Ventana() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
        uno = new JLabel("TCP");
        uno.setBounds(230, 30, 40, 35);
        add(uno);

        dos = new JLabel("Ingrese los términos: (Recibe y números letras)");
        dos.setBounds(50, 75, 120, 35);
        add(dos);
        /**
         * @see keyListener()
         * Para validaciones de los campos de texto
         */
        cuatro = new JTextField();
        cuatro.setBounds(50, 150, 120, 35);
        add(cuatro);
        cuatro.addKeyListener(this);

        cinco = new JTextField();
        cinco.setBounds(285, 150, 120, 35);
        add(cinco);
        cinco.addKeyListener(this);
        /**
         * @see actionListner()
         * Para acciones on click
         */
        tres = new JButton("Calcular TCP");
        tres.setBounds(300, 250, 150, 35);
        add(tres);
        tres.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TCP algo = new TCP();
        String uno, tres, doss;
        uno = algo.T(cuatro.getText());
        tres = algo.P(cinco.getText());
        doss = algo.C();
        JOptionPane.showMessageDialog(null, uno + " + " + doss + " + " + tres);
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        /**
         * la variable key obtiene el caracter tecleado
         */
        char key = ke.getKeyChar();
        /**
         * Éste if verifica que el caracter se encuentre en el rango
         * especificado y sino no permite la entrada de este a los campos de
         * texto
         */
        if ((!((key >= 'a') && (key <= 'z'))) && (!(key >= '0') && (key <= '9')) && (key != '-')) {
            ke.consume();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

}
