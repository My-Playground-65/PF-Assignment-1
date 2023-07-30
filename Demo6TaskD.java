public class Demo6TaskD {
    public static void main(String[] args) {
        final String HEADER = "%s|%s %s%-11s%s%s|%s %s%8s%s%s |%s %s%7s%s %s|%s \n";
        final String ROW1 = "%s|%s %-11s%s|%s %s%8s%s%s |%s %s%3s%s%s%.2f%s %s|%s \n";
        

        double price1 = 0.99;
        double price2 = 1.49;

        String item1 = "Apples";
        String item2 = "Oranges";

        int qty1 = 5;
        int qty2 = 10;

        final String BLUE = "\033[34m";
        final String DEFAULT = "\033[0m";
        final String BROWN = "\033[38;5;214m";
        final String PURPLE = "\033[35m";
        final String GREEN = "\033[32m";
        final String BOLD = "\033[1m";

        String line = "+------------+----------+---------+";

        //System.out.println(line);
        System.out.printf("%s%s%s\n",BROWN,line,DEFAULT);

        System.out.printf(HEADER,BROWN,DEFAULT,BOLD,"ITEM",DEFAULT,BROWN,DEFAULT,BOLD,"QUANTITY",DEFAULT,BROWN,DEFAULT,BOLD,"PRICE",DEFAULT,BROWN,DEFAULT);

        String line1 = "\033[32m+------------+\033[38;5;214m---------+\033[32m----------+\033[0m";

        System.out.printf("%s%s%s\n",BROWN,line1,DEFAULT);
        
        System.out.printf(ROW1,BROWN,DEFAULT,item1,BROWN,DEFAULT,BLUE,qty1,DEFAULT,BROWN,DEFAULT,GREEN,"$",DEFAULT,PURPLE,price1,DEFAULT,BROWN,DEFAULT);

        System.out.printf(ROW1,BROWN,DEFAULT,item2,BROWN,DEFAULT,BLUE,qty2,DEFAULT,BROWN,DEFAULT,GREEN,"$",DEFAULT,PURPLE,price2,DEFAULT,BROWN,DEFAULT);

        System.out.printf("%s%s%s\n",BROWN,line1,DEFAULT);

    }
}
