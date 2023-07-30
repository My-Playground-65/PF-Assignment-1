public class Demo3 {
    public static void main(String[] args) {
        //Create integer varables
        int num1 = 123;
        int num2 = 456;
        int num3 = 7890;

        //Display the telephone number with standard format and apply blue color to area code

        final String BLUE = "\033[34m";
        final String RESET = "\033[0m";

        System.out.printf("%s(%03d) %s%d-%d\n",BLUE,num1,RESET,num2,num3);
    }
}
