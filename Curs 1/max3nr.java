package devin;
import java.util.*;
/**
 *
 * @author d22tny
 */

public class Devin {

    public static void main(String[] args) {
        System.out.println("Introduceti primul numar: ") ;
        Scanner theInput = new Scanner(System.in);
        int n = theInput.nextInt();
        System.out.println("Introduceti al doilea numar") ;
        int x = theInput.nextInt();
        System.out.println("Introduceti al treilea numar") ;
        int y = theInput.nextInt();
        int max = n;
        if (max<x) {
            max = x; 
        }
        if (max<y) {
            max = y;
        }
        
        System.out.println("Numarul maxim este " + max);
        
    }
    
}
