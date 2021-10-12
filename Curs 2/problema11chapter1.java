package devin;
import java.util.Scanner;
/**
 *
 * @author d22tny
 */

public class Devin {
     
    public static void main(String args[])
    {
        double startingPop = 312032486;
        double diff = (int)(((60/13) * 60 * 24 * 365) + ((60/45) * 60 * 24 * 365) + ((60/7) * 60 * 24 * 365));
        System.out.println("Populatia initiala: " + (int) startingPop);
        System.out.println("Populatia dupa 1 an " + (int) (startingPop + diff));
        startingPop = startingPop + diff;
        System.out.println("Populatia dupa 2 ani " + (int) (startingPop + diff));
        startingPop = startingPop + diff;
        System.out.println("Populatia dupa 3 ani " + (int) (startingPop + diff));
        startingPop = startingPop + diff;
        System.out.println("Populatia dupa 4 ani " + (int) (startingPop + diff));
        startingPop = startingPop + diff;
        System.out.println("Populatia dupa 5 ani " + (int) (startingPop + diff));
    }
    
}

