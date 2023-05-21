import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "car")
    public Car getCarBean() {
        return new Car();
    }

    @Bean(name = "bus")
    public Bus getBusBean() {
        return new Bus();
    }

    @Bean(name = "pickup")
    public Pickup getPickupBean() {
        return new Pickup();
    }

    @Bean(name = "driver1")
    public Driver getDriver1Bean() {
        return new Driver("driver1", getCarBean());
    }

    @Bean(name = "driver2")
    public Driver getDriver2Bean() {
        return new Driver("driver2", getBusBean());
    }

    @Bean(name = "driver3")
    public Driver getDriver3Bean() {
        return new Driver("driver3", getPickupBean());
    }


}
