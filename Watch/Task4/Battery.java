package Task4;

public class Battery {
    private int capacity;
    public Battery(){
        this.capacity = 100;
    }
    public  Battery(int battery){
        this.capacity = battery;
    }

    public void decrease(int decreaseLevel){
        this.capacity -= decreaseLevel;
    }

    public  void charge(int chargeLevel){
        this.capacity += chargeLevel;
    }

    public int getCapacity(){
        return this.capacity;
    }
}
