/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Main {
    protected static float suhu;
    
    public static void main(String[] args) {
        int pilih;
        System.out.println("===========================");
        System.out.println("|Program Konversi Suhu Air|");
        System.out.println("===========================");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input data");
        System.out.println("----------");
        System.out.print("Suhu dalam celcius : ");
        suhu = input.nextFloat();
         
        Benda air = new Benda(suhu);
        
        while(true){
            System.out.println("\nOpsi");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            
            if(pilih == 1){
                System.out.println("");
                air.konversi();
            }
            else if(pilih == 2){
                System.out.println("\nInput data");
                System.out.println("----------");
                System.out.print("Suhu dalam celcius : ");
                suhu = input.nextFloat();
                air.EditData(suhu);
            }
            else if(pilih == 3){
                break;
            }
            else{
                System.out.println("\nOpsi tidak ada, mohon masukkan opsi dengan benar");
            }
        }
    }
}
