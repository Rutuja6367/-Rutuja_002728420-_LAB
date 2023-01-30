/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;
import java.util.ArrayList;
/**
 *
 * @author rutuj
 */
public class ArrayClass {
 


public static void func(int arr[]){
    
    int l = arr.length;
    for(int i=0;i<l;i++){
        if(i%2 == 0){
            arr[i]=arr[i]*2;
            
        }
        else{
            arr[i]=arr[i]*3;
        }
    }
    
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int[] a = {1,2,5,6,7};
      func(a);
      for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
      }
        // TODO code application logic here
    }
    
}
