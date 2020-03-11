package pl.zzpj2020.solid.dip.weathertracker.solution;

public class Phone implements Device {
    private String phoneNumber;

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void generateWeatherAlert(String weatherDescription) {
        String alert =  "Current weather state: "
                + weatherDescription
                + "sent on phone number:  " + this.phoneNumber;
        System.out.println(alert);
    }
}
