public class Demo6TaskB {
    public static void main(String[] args) {
        
        
        final String HEADER = "%s|%s %s%s %s%-14s%s|%s%s%5s %s%s|%s \n";
        final String RECORD2 = "%s|%s %s %-13s%s|%s%5d %s|%s \n";
        final String RECORD3 = "%s|%s %s %-15s%s|%s%5d %s|%s \n";

        final int age1 = 24;
        final int age2 = 30;

        String name1 = "Alice";
        String name2 = "Bob";

        final String BLUE = "\033[34m";
        final String DEFAULT = "\033[0m";
        final String BROWN = "\033[38;5;214m";

        String line = "+--------------------+------+";

        //System.out.println("+--------------------+------+");
        System.out.printf("%s%s%s\n",BROWN,line,DEFAULT);
        System.out.printf(HEADER,BROWN,DEFAULT,BLUE,"NAME",DEFAULT,"",BROWN,DEFAULT,BLUE,"AGE",DEFAULT,BROWN,DEFAULT);
        System.out.printf("%s%s%s\n",BROWN,line,DEFAULT);
        //System.out.println("+--------------------+------+");
        System.out.printf(RECORD2,BROWN,DEFAULT,name1,"",BROWN,DEFAULT,age1,BROWN,DEFAULT);
        System.out.printf(RECORD3,BROWN,DEFAULT,name2,"",BROWN,DEFAULT,age2,BROWN,DEFAULT);
        System.out.printf("%s%s%s\n",BROWN,line,DEFAULT);
        
        
        

        
    
    }
}
