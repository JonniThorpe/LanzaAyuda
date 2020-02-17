/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzaayuda;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;
public class LanzaAyuda extends JFrame{
    private JMenuBar mb;
    private JMenu menu1;
    private JMenuItem mi1;
    public LanzaAyuda() {
        setLayout(null);
        mb=new JMenuBar();
        setJMenuBar(mb);
        menu1=new JMenu("Opciones");
        mb.add(menu1);
        mi1=new JMenuItem("Ayuda");
        menu1.add(mi1);              
        
    try {
            // Carga el fichero de ayuda
            File fichero = new File("C:\\Users\\usuario\\Documents\\NetBeansProjects\\LanzaAyuda\\src\\help\\helpset.hs");
            URL hsURL = fichero.toURI().toURL();

            // Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

            // Pone ayuda a item de menu al pulsar F1. i1 es el JMenuitem
            mi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));

            hb.enableHelpOnButton(mi1, "clientes", helpset);

        } catch (Exception e) {
            System.out.println("No se ha podido cargar la Ayuda -> " + e);
        }
    
    
    }
    
    
    public static void main(String[] ar) {

        LanzaAyuda ay=new LanzaAyuda();
        ay.setBounds(10,20,300,200);
        ay.setVisible(true);
        ay.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }    
}
