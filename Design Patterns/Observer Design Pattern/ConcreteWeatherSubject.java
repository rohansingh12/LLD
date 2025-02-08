import java.util.List;
import java.util.ArrayList;

public class ConcreteWeatherSubject implements WeatherSubject {
    private List<WeatherObserver> observerList = new ArrayList<>();
    private String weather;
    

    @Override
    public void addSubscriber(WeatherObserver observer){
        observerList.add(observer);
    }

    @Override
    public void removeSubscriber(WeatherObserver observer){
        observerList.remove(observer);
    }


    @Override
    public void updateWeather(String weather){
        this.weather=weather;
        notifyObserver(weather);
    }

    @Override
    public void notifyObserver(String weather){
        for(WeatherObserver observer : observerList){
            observer.update(weather);
        }
    }
}
