/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Lenovo
 */
public class Benda {
    protected float suhu;
    
    public Benda(float suhu){
        this.suhu = suhu;
    }
    
    public void kondisiAir(){
        if(this.suhu > 100){
            System.out.println("Kondisi air mendidih");
        }
        else if(this.suhu < 0){
            System.out.println("Kondisi air beku");
        }
        else{
            System.out.println("Kondisi air normal");
        }
    }
    
    public void konversi(){
        float r = (4 * this.suhu)/5;
        float f = (9 * this.suhu)/5 + 32;
        float k =  273.15f + this.suhu;
        
        System.out.println("Suhu dalam Celcius \t: " + this.suhu + "°C");
        System.out.println("Suhu dalam Fahrenheit \t: " + f +"°F");
        System.out.println("Suhu dalam Reamur \t: " + r + "°R");
        System.out.println("Suhu dalam Kelvin \t: " + k + "°K");
        kondisiAir();
    }
    
    public void EditData(float suhu){
        this.suhu = suhu;
    }
}
