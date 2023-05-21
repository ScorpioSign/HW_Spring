public class Pickup extends Transport {
    public Pickup() {
    }


    @Override
    public void readyToWork() {
        System.out.println(getType() + " готов к работе");

    }

    @Override
    public Type getType() {
        return Type.PICKUP;
    }
}
