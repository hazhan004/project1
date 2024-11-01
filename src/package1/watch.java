/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package package1;

/**
 *
 * @author Sherdll Store
 */
public class watch {
     private int hour;
    private int minute;
    private int second;
    
    
    public watch(){
    }
    
    public watch(int hour,int minute){
    
    this(hour,minute,0);
    
    }
    
    public watch(int hour,int minute,int second){
    this.hour=hour;
    this.minute=minute;
    this.second=second;
    }
    
    public watch(int hour){
    
    this(hour,0,0);
    
    }
    
    public int gethour(){
    return hour;
    }
    
    public int getminute(){
    return minute;
    }
    
    public int getsecond(){
    return second;
    }
    
    
    public void display(){
        System.out.println(gethour()+":"+getminute()+":"+getsecond());
    
    
    
    }
}
