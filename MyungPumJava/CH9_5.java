package MyungPumJava;

import javax.swing.*;

public class CH9_5 extends JFrame {
    public CH9_5(){

        super("colorframe");
        setSize(400,200);
        setVisible(true);

        for(int i=0; i<16; i++){
            JLabel jla[i] = new JLabel(COLOR.math.RANDOM);
        }

    }

    public static void main(String[] args) {
        new CH9_5();
    }
}
