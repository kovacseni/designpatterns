package decorator2;

public class RetryTemperatureService implements TemperatureService {

    private TemperatureService target;

    public RetryTemperatureService() {
    }

    public RetryTemperatureService(TemperatureService target) {
        this.target = target;
    }

    @Override
    public float getTemperatureFor(String city, int days) {
        float result = 0;
        int counter = 0;
        do {
            try {
                result = target.getTemperatureFor(city, days);
            } catch (IllegalStateException ise) {
                result = 0;
            }
            counter++;
        } while (result == 0);
        return result;
    }
}
