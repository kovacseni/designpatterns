package prototype;

public class Address {

    private final String name;

    private final String email;

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

    public String getEmail() {
        return email;
    }
}
