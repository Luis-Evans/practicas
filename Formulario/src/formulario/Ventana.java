/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Alumno
 */
public class Ventana extends JFrame implements ActionListener, KeyListener{
    
    JLabel uno,dos,tres;
    JTextField cuatro,cinco,seis;
    JButton boton;
    
    public Ventana () {
        setLayout(null);
        setBounds(50,50,500,500);
        setLocationRelativeTo(null);
        setVisible(true);
        
        boton = new JButton("Registrar");
        
        uno= new JLabel("Nombre:");
        uno.setBounds(50, 50, 60, 40);
        add(uno);
        
        dos = new JLabel("Apellido Paterno:");
        dos.setBounds(50, 100, 120, 40);
        add(dos);
        
        tres = new JLabel("Apellido Materno:");
        tres.setBounds(50,150,120,40);
        add(tres);
        
        cuatro = new JTextField();
        cuatro.setBounds(120,50,150,40);
        add(cuatro);
        cuatro.addKeyListener(this);
        
        cinco = new JTextField();
        cinco.setBounds(200, 100, 120, 40);
        add(cinco);
        cinco.addKeyListener(this);
        
        seis = new JTextField();
        seis.setBounds(200, 150, 120, 40);
        add(seis);
        seis.addKeyListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
