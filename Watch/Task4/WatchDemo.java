package Task4;

public class WatchDemo {
    private static Battery battery = new Battery(10);
    private static Watch watch = new Watch(battery);
    public static void Work(){
        for(int i = 0; i < 15; i++){
            watch.tick();
        }
    }
}
