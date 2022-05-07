package decorator2;

public class ConverterTemperatureService implements  TemperatureService {

    private TemperatureService temperatureService;

    public ConverterTemperatureService(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @Override
    public float getTemperatureFor(String city, int days) {
        return temperatureService.getTemperatureFor(city, days) * 2;
    }
}
