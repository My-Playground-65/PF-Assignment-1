public class Demo3 {
    public static void main(String[] args) {
        //Create integer varables
        int num1 = 123;
        int num2 = 456;
        int num3 = 7890;

        //Display the telephone number with standard format and apply blue color to area code

        System.out.printf("\033[34m(%03d) \033[0m%d-%d\n",num1,num2,num3);
    }
}
