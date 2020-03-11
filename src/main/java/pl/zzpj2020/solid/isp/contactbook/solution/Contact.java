package pl.zzpj2020.solid.isp.contactbook.solution;

public class Contact implements Dialable, Emailable {
    private String name;
    private String address;
    private String emailAddress;
    private String phoneNumber;

    public Contact(String name, String address, String emailAddress, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String getEmailAddress() {
        return this.emailAddress;
    }
}
