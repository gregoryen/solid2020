package pl.zzpj2020.solid.isp.contactbook.solution;

public class Contact implements Dialler, Emailer{
    private String name;
    private String address;
    private String emailAddress;
    private String telephone;

    public Contact(String name, String address, String emailAddress, String telephone) {
        this.name = name;
        this.address = address;
        this.emailAddress = emailAddress;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public void makeCall() {
        System.out.println("Calling the number: "
                            + this.telephone);
    }

    @Override
    public void sendEmail(String subject, String body ) {
        System.out.println("Sending email to: " + this.emailAddress
                            + "\nSubject: " + subject
                                + "\nbody:\n" + body);
    }
}
