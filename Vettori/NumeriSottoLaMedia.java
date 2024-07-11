/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetti;

import java.util.Scanner;

/**
 *
 * @author bonnot88
 */
public class NumeriSottoLaMedia {
     public static void main (String args []){
         Scanner input = new Scanner(System.in);
         double somma =0, media =0;
         int n=0, c=0;
         double [] temperature = new double[10];
         for(int t =0; t<temperature.length; t++){
             System.out.print("Inserisci temperatura giorno " +(t+1)+ ": " );
             temperature[t] = input.nextDouble();
             somma+=temperature[t];}
         
         n = temperature.length;
         media = somma/n;
         //n=0;
         
         for(double sotto : temperature){
             if(sotto<media) c+=1;
         }
         System.out.print("\nTemperatura media: " +media+ "\n");
         System.out.print("Giorni sotto la temperatura media: " +c+ "\n");
     
     }
}
