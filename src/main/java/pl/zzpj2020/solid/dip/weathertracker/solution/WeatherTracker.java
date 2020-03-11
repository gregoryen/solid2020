package pl.zzpj2020.solid.dip.weathertracker.solution;

public class WeatherTracker {
    private String currentConditions;
    private Device device;

    public String getCurrentConditions() {
        return currentConditions;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        device.generateWeatherAlert(weatherDescription);
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
