package dependency;

public class Hotmail implements MailServer{
    @Override
    public void send() {
        System.out.println("Sending with Hotmail.....");
    }
}
