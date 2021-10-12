package devin;
import java.util.Scanner;
/**
 *
 * @author d22tny
 */

public class Devin {
     
    public static void main(String args[])
    {
         
        System.out.println("Introduceti nr de elemente din vector: ") ;
        Scanner theInput = new Scanner(System.in);
        int n = theInput.nextInt();
        boolean found = false;
        int numere[] = new int[n]; 
        for(int pozitie=0; pozitie< n; pozitie++) {
            System.out.println("Introduceti nr de pe pozitia ["+(pozitie+1)+"]");
            int numar = theInput.nextInt();
            numere[pozitie] = numar;
        }
        System.out.println("Introduceti nr de cautat: ") ;
        int x = theInput.nextInt();
        for(int pozitie=0; pozitie< n; pozitie++) {
            if (numere[pozitie] == x) {
                found = true;
                System.out.println("Numarul cautat ["+x+"] a fost gasit in vector!");
                System.out.println("Pozitia sa este in vector este " + (pozitie+1));
                break;
            }
        }
        if (found == false) {
            System.out.println("Numarul dat nu se regaseste in vector");
        }
       
    }
    
}

