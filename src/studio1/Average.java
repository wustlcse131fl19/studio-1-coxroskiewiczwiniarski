package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args){

        ArgsProcessor ap = new ArgsProcessor(args);

        double x = ap.nextDouble("Value for x?");
        double y = ap.nextDouble("Value for y?");

        System.out.print("The average of these numbers is " + ((x + y) / 2));

    }

}
