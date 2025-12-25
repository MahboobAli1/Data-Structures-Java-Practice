/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedhashset_practice;
import java.util.*;

/**
 *
 * @author Mahboob
 */
public class LinkedHashset_practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read= new Scanner( System.in);
       ArrayList<Integer> numberList = new ArrayList<>();
       
       
        numberList.add(66);
        numberList.add(55);
        numberList.add(55);
        
        
       LinkedHashSet<Integer> numbers = new LinkedHashSet<>(numberList);
        System.out.println("Input");
       numbers.add(read.nextInt()); 
        numbers.add(22);
        numbers.add(44);
        numbers.add(22);
        System.out.println(numbers);

        
        
    }
    
}
