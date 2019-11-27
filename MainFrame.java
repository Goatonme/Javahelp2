package P3;

import javax.swing.*;
import java.awt.*;
import java.util.Enumeration;

public class MainFrame extends JPanel {

    private Controller controller;

    public MainFrame(Controller controller){
        this.controller = controller;
    }

    private JPanel pnlLeft = new JPanel(new GridLayout(2,1));
    private JPanel pnlRight = new JPanel(new GridLayout(1,1));
    private JPanel pnlLeftNorth = new JPanel(new GridLayout(5,2));
    private JPanel pnlLeftSouth = new JPanel(new GridLayout(2,3));
    private JPanel pnlRightNorth = new JPanel();

    private JLabel Firstname = new JLabel ( "First name");
    private JLabel Lastname = new JLabel("Last name");
    private JLabel Streetname = new JLabel( "Street");
    private JLabel Cityname = new JLabel("City");
    private JLabel Zipcode = new JLabel("Zipcode");
    private JRadioButton BtnEnglish = new JRadioButton("English");
    private JRadioButton BtnSwedish = new JRadioButton("Swedish");
    private JRadioButton BtnOther = new JRadioButton("Other");
    private JButton BtnAdd = new JButton("Add");
    private JButton BtnChange = new JButton("Change");
    private JButton BtnDelete = new JButton("Delete");
    private JTextArea info = new JTextArea();

    private JTextField Firsttxtfield = new JTextField();
    private JTextField Lasttxtfield = new JTextField();
    private JTextField streettxtfield = new JTextField();
    private JTextField citytxtfield = new JTextField();
    private JTextField Ziptxtfield = new JTextField();





    public MainFrame(){
        setPreferredSize(new Dimension(850,360));
        setLayout(new GridLayout(1,2)); // Hela bakgrunden. Delar bakgrnúnden i höger o vänster halva

        pnlLeftNorth.add(Firstname);
        pnlLeftNorth.add(Firsttxtfield);
        pnlLeftNorth.add(Lastname);
        pnlLeftNorth.add(Lasttxtfield);
        pnlLeftNorth.add(Streetname);
        pnlLeftNorth.add(streettxtfield);
        pnlLeftNorth.add(Cityname);
        pnlLeftNorth.add(citytxtfield);
        pnlLeftNorth.add(Zipcode);
        pnlLeftNorth.add(Ziptxtfield);
        pnlLeftSouth.add(BtnEnglish);
        pnlLeftSouth.add(BtnSwedish);
        pnlLeftSouth.add(BtnOther);
        pnlLeftSouth.add(BtnAdd);
        pnlLeftSouth.add(BtnChange);
        pnlLeftSouth.add(BtnDelete);

        pnlLeft.add(pnlLeftNorth);
        pnlLeft.add(pnlLeftSouth);
        pnlRight.add(info);
        add(pnlLeft);
        add(pnlRight);

    }




    public String getFirsttxtfield() {
        return Firsttxtfield.getText();
    }

    public String getLasttxtfield() {
        return Lasttxtfield.getText();
    }

    public String getStreettxtfield() {
        return streettxtfield.getText();
    }

    public String getCitytxtfield() {
        return citytxtfield.getText();
    }

    public String getZiptxtfield() {
        return Ziptxtfield.getText();
    }

    public JButton getBtnAdd() {
        return BtnAdd;
    }

    public JButton getBtnChange() {
        return BtnChange;
    }

    public JButton getBtnDelete() {
        return BtnDelete;
    }

    public JRadioButton getBtnEnglish() {
        return BtnEnglish;
    }

    public JRadioButton getBtnSwedish() {
        return BtnSwedish;
    }

    public JRadioButton getBtnOther() {
        return BtnOther;
    }

    public JTextArea getInfo() {
        return info;
    }
}