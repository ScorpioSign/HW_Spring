public class Car extends Transport{

    public Car() {
    }

    @Override
    public void readyToWork() {
        System.out.println(getType() + " готов к работе");
    }

    @Override
    public Type getType() {
        return Type.CAR;
    }
}
