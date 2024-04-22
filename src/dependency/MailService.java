package dependency;

public class MailService {

    private final MailServer mailServer;

    public MailService(MailServer mailServer) {
        this.mailServer = mailServer;
    }

    public void sendMail(){
        mailServer.send();
    }

//    public void sendMail(MailServer mailServer) {
//        mailServer.send();
//    }
}
