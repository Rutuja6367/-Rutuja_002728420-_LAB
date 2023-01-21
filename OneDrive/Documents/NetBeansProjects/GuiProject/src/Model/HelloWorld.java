/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author rutuj
 */
public class HelloWorld {
    public static int a=10;
    public static double d=2.0;
    public static float fl=4;
    public static String s="ABC";
    public static  boolean b=true;
    public static char c='a'; 
    public static int[] arr = {1,2};
    
    public static void main(String[] args)
    {
        System.out.println(a);
        System.out.println(d);
        System.out.println(fl);
        System.out.println(s);
        System.out.println(b);
        System.out.println(c);
        for(int i=0; i<2;i++){            //printing the array
           System.out.println(arr[i]);
        }
}
    
}


