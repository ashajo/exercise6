package se.lexicon.se;

public class exercise6 {
    public static void main(String[] args) {

        double[] avg = {43, 5, 23, 17, 2, 14};
        double total = 0;

        for(int i=0; i<avg.length; i++){
            total = total + avg[i];
        }

        double average = total / avg.length;

        System.out.format("Average is: %.1f", average);
    }
}
