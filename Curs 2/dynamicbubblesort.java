package devin;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author d22tny
 */

public class Devin {
     
    public static void main(String args[])
    {
         
        System.out.println("Introduceti nr de elemente din vector: ") ;
        Scanner theInput = new Scanner(System.in);
        int y = theInput.nextInt();
        int numere[] = new int[y]; 
        for(int x=0; x< y; x++) {
            System.out.println("Introduceti nr de pe pozitia ["+x+"]");
            int numar = theInput.nextInt();
            numere[x] = numar;
        }
        
        int n = numere.length;           
        System.out.println("Numerele nesortate: ");  
        for(int i=0; i < n; i++){  
                System.out.print(numere[i] + " ");  
        }  
        System.out.println();  

        
        int aux = 0;  
        for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(numere[j-1] > numere[j]){  
                    aux = numere[j-1];  
                    numere[j-1] = numere[j];  
                    numere[j] = aux;  
                }  
            } 
        }

        System.out.println("Numerele sortate:");  
        for(int i=0; i < n; i++){  
            System.out.print(numere[i] + " ");  
        }  
    }
    
}

