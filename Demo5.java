public class Demo5 {
    public static void main(String[] args) {

        // Given ISBN number as four separate integer variables
        int block1 = 978;
        int block2 = 3;
        int block3 = 16;
        int block4 = 1484100;

        //Cretae color code varables
        final String RED = "\033[31m";
        final String BLUE = "\033[34m";
        final String GREEN = "\033[32m";
        final String PURPLE = "\033[35m";

        // Print the ISBN number in the standard format with color-coded blocks

        System.out.printf("%s%d-%s%d-%s%d-%s%d\n",RED,block1,BLUE,block2,GREEN,block3,PURPLE,block4);


    }
}
