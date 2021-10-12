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
        int y = theInput.nextInt();
        int numere[] = new int[y]; 
        for(int pozitie=0; pozitie< y; pozitie++) {
            System.out.println("Introduceti nr de pe pozitia ["+pozitie+"]");
            int numar = theInput.nextInt();
            numere[pozitie] = numar;
        }
        
        int length = numere.length;           
        System.out.println("Numerele nesortate: ");  
        for(int i=0; i < length; i++){  
                System.out.print(numere[i] + " ");  
        }  
        System.out.println();  

        boolean ok = true;
        int aux = 0;  
        while (ok == true) {
            ok = false;
            for(int j=1; j < length; j++){  
                if(numere[j-1] > numere[j]){  
                    aux = numere[j-1];  
                    numere[j-1] = numere[j];  
                    numere[j] = aux;  
                    ok = true;
                }  
            } 
        }

        System.out.println("Numerele sortate:");  
        for(int i=0; i < length; i++){  
            System.out.print(numere[i] + " ");  
        }  
    }
    
}

