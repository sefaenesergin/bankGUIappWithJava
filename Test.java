/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaodevi;

/**
 *
 * @author 123
 */
import java.util.ArrayList;

public class Test {
        
    private ArrayList <Kisi> bankaKisi;
    
    public Test(){
        bankaKisi=new ArrayList<Kisi>();
        
    }
    
    public  void addKisi(Kisi k){
        bankaKisi.add(k);
    } 
    
    public void show(){
        for(Kisi k: bankaKisi){
            System.out.println(k.toString());
        }
    }
    
    public void showKisi(){
        System.out.println("Hocalar:");
        for(Kisi m: bankaKisi){
            if(m instanceof Musteri){
                System.out.println("\n "+m.toString());
            }
        }
    }
    
}
