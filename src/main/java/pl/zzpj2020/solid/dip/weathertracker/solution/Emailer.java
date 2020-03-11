package pl.zzpj2020.solid.dip.weathertracker.solution;

public class Emailer implements Device{
    private String emailAddress;

    public Emailer(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void generateWeatherAlert(String weatherDescription) {
        String alert = "Current weather state: "
                + weatherDescription
                + "sent on email address:  " + this.emailAddress;
        System.out.println(alert);
    }
}
