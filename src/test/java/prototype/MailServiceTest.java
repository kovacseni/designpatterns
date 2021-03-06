package prototype;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class MailServiceTest {

    @Mock
    MailSender mailSender;

    @InjectMocks
    MailService mailService;

    @Test
    void testSend() {
        ArgumentCaptor<Mail> argumentCaptor = ArgumentCaptor.forClass(Mail.class);
        mailService.send(new Address("test", "test@training360.com"));
        verify(mailSender).send(argumentCaptor.capture());

        assertEquals("info@training360.com", argumentCaptor.getValue().getFrom().getEmail());
        assertEquals("Körlevél", argumentCaptor.getValue().getSubject());
        assertEquals("Kedves Mindenki!\nVárunk mindenkit a havi megbeszélésre! Training360",
                argumentCaptor.getValue().getMailContent().getText());

        assertEquals("test@training360.com", argumentCaptor.getValue().getTo().get(0).getEmail());
    }

    @Test
    void testSendWithNewContent() {
        ArgumentCaptor<Mail> argumentCaptor = ArgumentCaptor.forClass(Mail.class);
        mailService.send(new Address("test", "test@training360.com"),
                "text/html", "<html><body>test</body></html>");
        verify(mailSender).send(argumentCaptor.capture());

        assertEquals("info@training360.com", argumentCaptor.getValue().getFrom().getEmail());
        assertEquals("Körlevél", argumentCaptor.getValue().getSubject());
        assertEquals("text/html", argumentCaptor.getValue().getMailContent().getMimeType());
        assertEquals("<html><body>test</body></html>",
                argumentCaptor.getValue().getMailContent().getText());

        assertEquals("test@training360.com", argumentCaptor.getValue().getTo().get(0).getEmail());
    }
}
