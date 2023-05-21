import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    //Создайте Spring-проект. Добавьте нужные зависимости для работы с бинами, контекстом и аннотациями.
    //Создайте абстрактный класс Transport и его наследников Car, Bus, Pickup.
    //Создайте класс Driver с полем «транспорт» типа Transport.
    //Сконфигурируйте Spring таким образом, чтобы он создал бин для каждого класса-наследника Transport.
    //Сразу после создания бинов распечатайте в консоль <тип транспорта> готов к работе.
    //Реализуйте из класса Driver Spring-бин так, чтобы в Spring Сontext у вас находилось три бина типа Driver (по одному для каждого типа транспорта).
    //Распечатайте в удобочитаемом виде в консоли все три Spring-бина типа Driver

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = context.getBean("car", Car.class);
        car.readyToWork();
        Bus bus = context.getBean("bus", Bus.class);
        bus.readyToWork();
        Pickup pickup = context.getBean("pickup", Pickup.class);
        pickup.readyToWork();
        System.out.println();

        Driver driver1 = context.getBean("driver1", Driver.class);
        driver1.transportIsDriven();
        Driver driver2 = context.getBean("driver2", Driver.class);
        driver2.transportIsDriven();
        Driver driver3 = context.getBean("driver3", Driver.class);
        driver3.transportIsDriven();
    }
}
