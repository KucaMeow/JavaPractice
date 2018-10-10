package Task4;

public class Watch {
    private Battery battery;
    private int time = 0;
    public Watch(Battery battery){
        this.battery = battery;
    }

    void tick(){
        if(this.battery.getCapacity() > 0) {
            this.time += 1;
            this.battery.decrease(1);
            System.out.println("Watch ticked");
            System.out.println("Time from watch started: " + this.time);
            System.out.println("Battery capacity: " + this.battery.getCapacity());
        }
        else System.out.println("Battery is too low. Need charge");
    }
    void chargeBattery(int chargeLevel){
        this.battery.charge(chargeLevel);
    }
}
