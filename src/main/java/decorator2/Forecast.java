package decorator2;

public class Forecast {

    private TemperatureService service;

    public Forecast(TemperatureService service) {
        this.service = service;
    }

    public float getForecast(String city) {
        int sum = 0;
        for (int i = -10; i < 0; i++) {
            float temp = service.getTemperatureFor(city, i);
            sum += temp;
        }
        return sum / 10;
    }

    public static void main(String[] args) {
        float result = new Forecast(
                new ConverterTemperatureService(
                        new RetryTemperatureService(
                                new ConcreteTemperatureService()))).getForecast("Budapest");
        System.out.println(result);
    }
}
