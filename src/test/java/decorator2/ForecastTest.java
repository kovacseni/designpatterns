package decorator2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForecastTest {

    @Test
    void testGetForecastRetry() {
        float result = new Forecast(
                new RetryTemperatureService(
                        new ConcreteTemperatureService())).getForecast("Budapest");

        assertEquals(18, result);
    }

    @Test
    void testGetForecastConverter() {
        float result = new Forecast(
                new ConverterTemperatureService(
                        new RetryTemperatureService(
                                new ConcreteTemperatureService()))).getForecast("Budapest");

        assertEquals(36, result);
    }
}