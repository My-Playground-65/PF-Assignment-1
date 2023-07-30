public class Demo4 {
    public static void main(String[] args) {
        //Create date time variables
        int day = 28;
        int month = 12;
        int year = 2023;
        int hour = 23;
        int minute = 59;
        int second = 59;

        //Cretae color code varables
        final String RED = "\033[31m";
        final String BLUE = "\033[34m";
        final String GREEN = "\033[32m";
        final String PURPLE = "\033[35m";
        final String BROWN = "\033[33m";
        final String DEFAULT = "\033[0m";

        //Display date time with standard format
        System.out.printf("%s%d/%s%d/%s%d %s%d:%s%d:%s%d\n",RED,day,BLUE,month,GREEN,year,PURPLE,hour,BROWN,minute,DEFAULT,second);

    }
}
