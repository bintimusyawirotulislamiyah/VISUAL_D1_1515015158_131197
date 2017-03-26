package Modul5;

import java.awt.*;
import java.awt.event.*;

public class KeyListenerTester extends Frame implements KeyListener 
{
    TextField t1;
    Label l1;
       
    public KeyListenerTester(String s ){
    super(s);
        Panel p = new Panel();
        l1 = new Label ("Key Listener!" ) ;
        p.add(l1);
        add(p);
        addKeyListener ( this );
        setSize ( 200,100 );
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {
        l1.setText("Key Typed");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        l1.setText("Key Pressed");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        l1.setText("Key Released");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main (String[]args){
        new KeyListenerTester ("Key Listener Tester");
    }
}