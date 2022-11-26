package java_projects.weather_monitoring_app;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(30.1, 74.1, 1024.13);
        weatherData.setMeasurements(29, 70.1, 1013.13);
        weatherData.setMeasurements(30.5, 74.5, 1024.13);
    }
}
