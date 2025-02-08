public class GadgetObserver implements WeatherObserver {
    private String weather;

    @Override
    public void update(String weather){
        this.weather=weather;
        System.out.println("Notified Gadget observer.");
        System.out.println("Gadget system updated weather : "+weather);
    }
}
