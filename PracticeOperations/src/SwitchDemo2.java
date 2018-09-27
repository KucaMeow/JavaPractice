public class SwitchDemo2{
    public static void main(String[] args) {
        java.util.Random rand = new java.util.Random();
        int month = 1 + rand.nextInt(12);

        int year = 1500 + rand.nextInt(700);
        int numDays = 0;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if(((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) numDays = 29;
                else numDays = 28;
                break;
            default:
                System.out.println("Invalid month");
                break;
        }

        System.out.println(month);
        System.out.println(year);
        System.out.println("Number of days = " + numDays);
    }
}
