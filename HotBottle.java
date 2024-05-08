public class HotBottle extends Product {



    private int temp;
    private int volume;


    public HotBottle(String name, int price, int temp, int volume) {
        super(name, price);
        this.temp = temp;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;

    }
    public int getTemp() {
        return temp;
    }
    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotBottle{" +
                "temp=" + temp + ", volume=" + volume + ",name=" + getname() +
                        '}';

    }
}
