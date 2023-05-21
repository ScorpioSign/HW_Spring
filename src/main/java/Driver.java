import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class Driver {
    private String name;

    private Transport transport;

    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public String getName() {
        return name;
    }

      public void transportIsDriven() {
        System.out.println("Водитель " + getName() + " управляет транспортным средством " + transport.getType());
    }
}
