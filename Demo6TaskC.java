public class Demo6TaskC {
    public static void main(String[] args) {
        
        final String HEADER = "%s|%s %s%-19s%s%s|%s %s%-13s%s%s|%s %s%11s%s %s|%s \n";
        final String ROW1 = "%s|%s %-19s%s|%s %-13s%s|%s %s%,11d%s %s|%s \n";
        final String ROW2 = "%s|%s %s%s%s %-15s%s|%s %s%s%s %-9s%s|%s %s%,11d%s %s|%s \n";
        

        final int pop1 = 3996936;
        final int pop2 = 8336817;

        String cityName1 = "Los Angeles";
        String cityName2 = "New";

        String state1 = "California";
        String state2 = "New York";

        final String BLUE = "\033[34m";
        final String DEFAULT = "\033[0m";
        final String BROWN = "\033[38;5;214m";
        final String PURPLE = "\033[35m";
        final String GREEN = "\033[32m";
        final String BOLD = "\033[1m";

        String line = "+--------------------+--------------+-------------+";

        //System.out.println(line);
        System.out.printf("%s%s%s\n",BROWN,line,DEFAULT);

        System.out.printf(HEADER,BROWN,DEFAULT,BOLD,"CITY",DEFAULT,BROWN,DEFAULT,BOLD,"STATE",DEFAULT,BROWN,DEFAULT,BOLD,"POPULATION",DEFAULT,BROWN,DEFAULT);

        System.out.printf("%s%s%s\n",BROWN,line,DEFAULT);

        System.out.printf(ROW1,BROWN,DEFAULT,cityName1,BROWN,DEFAULT,state1,BROWN,DEFAULT,PURPLE,pop1,DEFAULT,BROWN,DEFAULT);

        System.out.printf("%s%s%s\n",BROWN,line,DEFAULT);

        System.out.printf(ROW2,BROWN,DEFAULT,GREEN,"New",DEFAULT,"York",BROWN,DEFAULT,GREEN,"New",DEFAULT,"York",BROWN,DEFAULT,PURPLE,pop2,DEFAULT,BROWN,DEFAULT);

        System.out.printf("%s%s%s\n",BROWN,line,DEFAULT);

        
    }
}
