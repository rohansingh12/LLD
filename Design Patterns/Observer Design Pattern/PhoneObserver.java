public class PhoneObserver implements WeatherObserver {
    private String weather;

    @Override
    public void update(String weather){
        this.weather=weather;
        System.out.println("Notified phone observer");
        System.out.println("Phone system updated weather: "+weather);
    }
}
