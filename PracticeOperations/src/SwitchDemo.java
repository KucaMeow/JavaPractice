public class SwitchDemo {
    public static void main(String[] args) {
        java.util.Random rand = new java.util.Random();
        int month = 1 + rand.nextInt(12);

        String stringMonth;
        switch (month){
            case 1: stringMonth = "January";
                break;
            case 2: stringMonth = "February";
                break;
            case 3: stringMonth = "March";
                break;
            case 4: stringMonth = "April";
                break;
            case 5: stringMonth = "May";
                break;
            case 6: stringMonth = "June";
                break;
            case 7: stringMonth = "July";
                break;
            case 8: stringMonth = "August";
                break;
            case 9: stringMonth = "September";
                break;
            case 10: stringMonth = "October";
                break;
            case 11: stringMonth = "November";
                break;
            case 12: stringMonth = "December";
                break;
            default: stringMonth = "Invalid month";
                break;
        }

        System.out.println(stringMonth);
        System.out.println(month);
    }
}
