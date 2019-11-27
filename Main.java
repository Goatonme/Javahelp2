package P3;

import javax.swing.*;

public class Main {

    public static void main (String [] args){
        MainFrame mf = new MainFrame();
        Contact co = new Contact();
        Controller cont = new Controller(mf, co);
        cont.addListener();
        JOptionPane.showMessageDialog(null,mf);
    }
}
