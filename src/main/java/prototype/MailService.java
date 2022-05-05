package prototype;

import java.util.Arrays;
import java.util.List;

public class MailService {

    private Mail mail = new Mail(
            Arrays.asList(new Address("Mindenki", "all@training360.com")),
            new Address("Training360", "info@training360.com"),
            "Körlevél",
            new MailContent("text/plain", "Kedves Mindenki!\nVárunk mindenkit a havi megbeszélésre! Training360")
    );

    private MailSender mailSender;

    public MailService(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void send(Address to) {
        Mail newMail = new Mail(mail);
        newMail.setTo(Arrays.asList(to));
        mailSender.send(newMail);
    }

    public void send(Address to, String mimeType, String content) {
        Mail newMail = new Mail(mail);
        newMail.setTo(List.of(to));
        newMail.setMailContent(new MailContent(mimeType, content));
        mailSender.send(newMail);
    }
}
