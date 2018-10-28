package Task7;

public class Task1 {
    public static void main(String[] args) {
        showByteBorders();
        showDoubleBorders();
        showFloatBorders();
        showIntBorders();
        showLongBorders();
        showShortBorders();
    }

    public static void showByteBorders(){
        System.out.printf("Byte max = %d%n", Byte.MAX_VALUE);
        System.out.printf("Byte min = %d%n", Byte.MIN_VALUE);
    }
    public static void showShortBorders(){
        System.out.printf("Short max = %d%n", Short.MAX_VALUE);
        System.out.printf("Short min = %d%n", Short.MIN_VALUE);
    }
    public static void showIntBorders(){
        System.out.printf("Int max = %d%n", Integer.MAX_VALUE);
        System.out.printf("Int min = %d%n", Integer.MIN_VALUE);
    }
    public static void showLongBorders(){
        System.out.printf("Long max = %d%n", Long.MAX_VALUE);
        System.out.printf("Long min = %d%n", Long.MIN_VALUE);
    }
    public static void showFloatBorders(){
        System.out.printf("Float max = %f%n", Float.MAX_VALUE);
        System.out.printf("Float min = %f%n", Float.MIN_VALUE);
    }
    public static void showDoubleBorders(){
        System.out.printf("Double max = %f%n", Double.MAX_VALUE);
        System.out.printf("Double min = %f%n", Double.MIN_VALUE);
    }
}
