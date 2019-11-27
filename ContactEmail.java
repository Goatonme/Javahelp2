package P3;

public class ContactEmail {


    private String emailHome;
    private String emailWork;
    private String emailCommon;


    public ContactEmail(String emailHome, String emailWork, String emailCommon){
        this.emailHome = emailHome;
        this.emailWork = emailWork;
        this.emailCommon = emailCommon;
    }

    public void setEmailHome( String emailHome){
        this.emailHome = emailHome;
    }
    public void setEmailWork( String emailWork){
        this.emailWork = emailWork;
    }
    public void setEmailCommon(String emailCommon){
        this.emailCommon = emailCommon;
    }

    public String getEmailHome(){
        return emailHome;
    }
    public String getEmailWork(){
        return emailWork;
    }
    public String getEmailCommon(){
        return emailCommon;
    }
}


