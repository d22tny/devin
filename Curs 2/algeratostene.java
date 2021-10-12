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
        System.out.println("Introduceti n: ") ;
        Scanner theInput = new Scanner(System.in);
        int n = theInput.nextInt();
        
        boolean nrPrim[] = new boolean[n+1];
        for(int i=0;i<=n;i++)
            nrPrim[i] = true;
         
        for(int k = 2; k <= Math.sqrt(n); k++)
        {
            if(nrPrim[k] == true)
            {
                for(int v = k*k; v <= n; v += k) {
                    nrPrim[v] = false;
                }
            }
        }

        for(int j = 2; j <= n; j++)
        {
            if(nrPrim[j] == true) {
                System.out.println(j + " ");
            }
        }
    }
    
}

