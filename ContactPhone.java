package P3;

public class ContactPhone {


    private String phoneHome;
    private String phoneWork;
    private String phoneCommon;

    public ContactPhone(String phoneHome, String phoneWork, String phoneCommon){
        this.phoneHome = phoneHome;
        this.phoneWork = phoneWork;
        this.phoneCommon = phoneCommon;
    }

    public void setPhoneHome( String phoneHome){
        this.phoneHome = phoneHome;
    }
    public void setPhoneWork(String phoneWork){
        this.phoneWork = phoneWork;
    }
    public void setPhoneCommon(String phoneCommon){
        this.phoneCommon = phoneCommon;
    }

    public String getphoneHome(){
        return phoneHome;
    }
    public String getPhoneWork(){
        return phoneWork;
    }
    public String getPhoneCommon(){
        return phoneCommon;
    }
}