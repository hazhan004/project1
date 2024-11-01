/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

import java.util.Scanner;

/**
 *
 * @author Sherdll Store
 */
public class main {
   public static void main(String[]args){
    
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter The Hour");
        int ho=input.nextInt();
    
        System.out.println("Enter The Minute");
        int mi=input.nextInt();
    
        System.out.println("Enter The Second");
        int se=input.nextInt();
    
        
        watch obj1=new package1.watch();
        watch obj2=new package1.watch(ho,mi,se);
        watch obj3=new package1.watch(ho,mi);
        watch obj4=new package1.watch(ho);
        
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    } 
}
