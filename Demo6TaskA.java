public class Demo6TaskA {
    public static void main(String[] args) {

        // final String RED = "\033[31m";
        
        // System.out.printf("[%8s%d%d%-8s]\n","",5,0,"%");

        final String RED_BG = "\033[41m";
        final String GREEN_BG = "\033[42m";
        final String WHITE = "\033[37m";
        final String RESET = "\033[0m";

        

        System.out.printf("%s[%s%-8s%s%d%s%-8s%s]%s\n", RED_BG, WHITE, " ", WHITE, 5, GREEN_BG, "0%", GREEN_BG, RESET);//Method 1

        System.out.println();

        System.out.printf("%s[%-8s%d%s%-8s]\n",RED_BG," ",5,GREEN_BG ,"0%");//Method 2

        
    }
    }

