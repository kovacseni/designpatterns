package prototype;

public class Address {

    private String name;

    private String email;

    public Address(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Address(Address address) {
        this.name = address.name;
        this.email = address.email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
