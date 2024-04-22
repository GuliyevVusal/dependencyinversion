package dependency;

public class Yandex implements MailServer{
    @Override
    public void send() {
        System.out.println("Sending with Yandex.....");
    }
}
