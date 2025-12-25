/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap_interface_practice;
import java.util.*;

/**
 *
 * @author Mahboob
 */
public class Hashset_interface_practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Set<Integer> numbers = new HashSet<>();

      numbers.add(44);
        
        
        numbers.add(43);
        numbers.add(47);
        numbers.add(34);
        
        
        
        Iterator<Integer> n= numbers.iterator();
        
        while(n.hasNext()){
            int a= n.next();
            if (a%2!=0)
            {
                n.remove();
            }
        }
        
        System.out.println(numbers);
        
    }
    
}
