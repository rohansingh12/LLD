public interface WeatherSubject {
    void addSubscriber(WeatherObserver observer);

    void removeSubscriber(WeatherObserver observer);

    void updateWeather(String weather);

    void notifyObserver(String weather);
}
