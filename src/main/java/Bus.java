public class Bus extends Transport {
    public Bus() {
    }

    @Override
    public void readyToWork() {
        System.out.println(getType() + " готов к работе");

    }

    @Override
    public Type getType() {
        return Type.BUS;
    }
}
