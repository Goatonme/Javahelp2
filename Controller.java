package P3;
import java.lang.String;

public class Controller {
    private MainFrame mf ;
    private Contact co;
    private final String newline = "\n";

    public Controller ( MainFrame mf, Contact co){
        this.mf = mf;
        this.co = co;

    }



    public void addListener(){
        mf.getBtnAdd().addActionListener(e -> AddContact());
        mf.getBtnDelete().addActionListener(e -> DeleteContact());
        mf.getBtnChange().addActionListener(e -> ChangeContact());

    }



    public void AddContact(){
       String data = mf.getLasttxtfield() + ", " + mf.getFirsttxtfield() + newline
               + mf.getStreettxtfield() + newline + mf.getZiptxtfield() + "  " + mf.getCitytxtfield()
               + newline + newline + "Language: " + mf.getBtnEnglish().getActionCommand();
       mf.getInfo().setText(data);


    }
    public void DeleteContact(){
        String ddata = "";
        mf.getInfo().setText(ddata);
    }

    public void ChangeContact(){

        String cdata = "Name: " + mf.getLasttxtfield() + ", " + mf.getFirsttxtfield() + newline
                + mf.getStreettxtfield() + newline + mf.getZiptxtfield() + "  " + mf.getCitytxtfield()
                + newline + "Language: " + mf.getBtnEnglish().getActionCommand();
        mf.getInfo().setText(cdata);


    }

}
