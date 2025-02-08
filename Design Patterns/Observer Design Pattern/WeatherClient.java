public class WeatherClient {
    public static void main(String[] args){
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();

        PhoneObserver phoneObserver = new PhoneObserver();
        GadgetObserver gadgetObserver = new GadgetObserver();

        subject.addSubscriber(phoneObserver);
        subject.addSubscriber(gadgetObserver);

        subject.updateWeather("50 Degree");
    }
}
