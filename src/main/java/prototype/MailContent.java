package prototype;

public class MailContent {

    private String mimeType;

    private String text;

    public MailContent(String mimeType, String text) {
        this.mimeType = mimeType;
        this.text = text;
    }

    public MailContent(MailContent mailContent) {
        this.mimeType = mailContent.mimeType;
        this.text = mailContent.text;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
