package devin;
import java.util.Scanner;
/**
 *
 * @author d22tny
 */

public class Devin {
     
    public static void main(String args[])
    {
        int table1[] = {1,2,3,4}; 
        int table2[] = new int[4];
        int table3[] = new int[4];
        
        
        
        for (int i = 0; i<4; i++) {
            table2[i] = table1[i] * table1[i];
            table3[i] = table1[i] * table1[i] * table1[i];
        }
        
        System.out.println("a    a^2    a^3");
        for (int i = 0; i<4; i++) {
            if (table2[i] >= 10) {
                System.out.println(table1[i] + "    " + table2[i] + "     " + table3[i]);
            } else {
                System.out.println(table1[i] + "    " + table2[i] + "      " + table3[i]);
            }
            
        }
       
    }
    
}

