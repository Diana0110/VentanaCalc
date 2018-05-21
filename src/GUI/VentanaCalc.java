/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author LN710Q
 */
public class VentanaCalc extends JPanel {

    public int WIDTH = 300, widthTF = 50, widthB = 80;
    public int HEIGTH = 300, heigthTF = 30, heigthB = 30;
    public JTextField textF1, textF2, textF3;
    public JButton button1, button2, button3;

    public VentanaCalc() {
        textF1 = new JTextField();
        textF1.setBounds(new Rectangle(50, 30, widthTF, heigthTF));

        textF2 = new JTextField();
        textF2.setBounds(new Rectangle(150, 30, widthTF, heigthTF));

        textF3 = new JTextField();
        textF3.setBounds(new Rectangle(200, 200, widthTF, heigthTF));

        button1 = new JButton("+");
        button1.setBounds(new Rectangle(120, 80, widthB, heigthB));

        button2 = new JButton("-");
        button2.setBounds(new Rectangle(120, 150, widthB, heigthB));

        button3 = new JButton("Binario");
        button3.setBounds(new Rectangle(120, 115, widthB, heigthB));

        textF1.setEditable(true);
        textF2.setEditable(true);
        textF3.setEditable(false);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String cadena1, cadena2, resultado;
                int res;
                cadena1 = textF1.getSelectedText();
                cadena2 = textF2.getSelectedText();
                //textF3.setText(textF1.getSelectedText());
                res = Integer.parseInt(cadena1) + Integer.parseInt(cadena2);
                resultado = Integer.toString(res);
                textF3.setText(resultado);
            }
        });
        add(textF1);
        add(textF2);
        add(textF3);
        add(button1);
        add(button2);
        add(button3);
        setLayout(null);
        setPreferredSize(new Dimension (WIDTH, HEIGTH));
    }
}
