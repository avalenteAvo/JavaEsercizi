/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetti;

import java.util.Scanner;

/**
 * @author bonnot88
 */
public class ContaFamiglia {
     public static void main (String args []){
        Scanner input = new Scanner(System.in);
        int k=0, r=0;
        double max =0;
        System.out.print("Inserisci il numero di famiglie da conteggiare: ");
        k = input.nextInt();
        
        double [] redditi = new double [k];
        
        for(int i=0; i<redditi.length; i++){
            System.out.print("\nInserisci reddito famiglia " +(i+1)+ ": ");
            redditi[i]= input.nextDouble(); }
        for (double reddito : redditi){
            if(max<reddito) max = reddito;}
        for(int f=0; f<redditi.length;f++){
           if(redditi[f]<max*0.9) {
                r+=1;
                System.out.println("Famiglia " +(f+1)+ " con reddito inferiore pari a: " +redditi[f]);
                }
            }
        System.out.print("Famiglie con reddito inferiore: " +r+ "\n");}
}