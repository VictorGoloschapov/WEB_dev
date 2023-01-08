package java_projects.weather_monitoring_app;

public interface Observer {
    void update(double temperature, double humidity, double pressure);
}
