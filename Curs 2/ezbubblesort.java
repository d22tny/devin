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
        int numere[] ={5,2,15,1,7};  
        int n = numere.length;           
        System.out.println("Elementele nesortate: ");  
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

        System.out.println("Elementele sortate:");  
        for(int i=0; i < n; i++){  
            System.out.print(numere[i] + " ");  
        }  
    }
    
}

