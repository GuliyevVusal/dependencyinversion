package dependency;

public class Main {

    public static void main(String[] args) {

        MailService mailService1 = new MailService(new Gmail());
        mailService1.sendMail();  // Sending with Gmail.....

        MailService mailService2 = new MailService(new Yandex());
        mailService2.sendMail(); // Sending with Yandex.....

        MailService mailService3 = new MailService(new Hotmail());
        mailService3.sendMail(); // Sending with Hotmail.....




//        MailService mailService = new MailService();
//        mailService.sendMail(new Gmail()); // Sending with Gmail.....
//        mailService.sendMail(new Hotmail()); // Sending with Hotmail.....
//        mailService.sendMail(new Yandex()); // Sending with Yandex.....
    }
}
