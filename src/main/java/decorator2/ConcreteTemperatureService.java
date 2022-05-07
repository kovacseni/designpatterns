package decorator2;

import java.util.Random;

public class ConcreteTemperatureService implements TemperatureService {

    public float getTemperatureFor(String city, int days) {
        // kimegy a hálózatra, html, kiolvassa a hőmérsékletet az adott városra
        Random random = new Random();
        int number = random.nextInt(3);
        if (number == 1) {
            throw new IllegalStateException("Hálózati hiba");
        }
        return 18;
    }
}
