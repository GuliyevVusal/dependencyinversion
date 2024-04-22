package dependency;

public class Gmail implements MailServer{
    @Override
    public void send() {
        System.out.println("Sending with Gmail.....");
    }
}
