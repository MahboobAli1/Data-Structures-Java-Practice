/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listinterface_score_practice;

/**
 *
 * @author Mahboob
 */
import java.util.*;
public class Listinterface_Score_practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        List<Integer>score= new  ArrayList<>(); 
        int ad=0;
       
        score.add(44);
           score.add(33);
           score.add(32);
           score.add(11);
           score.add(13);

           for( int a: score){
               
             ad+=a;  
               
           }
           double avg = ad / score.size();
      
        System.out.println(" avg"+avg);
         System.out.println(" Max "+ Collections.max(score));
         
       Iterator<Integer> num= score.iterator();
       while(num.hasNext())
       {int n= num.next();
           if( n>40)
           {
               num.remove();
           }
               
       }
        System.out.println(" num"+ score); // TODO code application logic here
    }
    
}
