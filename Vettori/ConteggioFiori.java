/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetti;

import java.util.Scanner;

/**
 *
 * @author utente
 */
public class ConteggioFiori {
    public static void main (String args []){
    
    Scanner input = new Scanner(System.in);
    String [] fiori = new String [5];
    fiori[0]="petunie";
    fiori[1]="viole";
    fiori[2]="rose";
    fiori[3]="violette";
    fiori[4]="garofani";
    
    double [] prezzi = new double[5];
    prezzi[0]=0.50;
    prezzi[1]=0.75;
    prezzi[2]=1.50;
    prezzi[3]=0.50;
    prezzi[4]=0.80;
    
    String inputfiore;
    System.out.print("Inserisci i fiori che vuoi acquistare (testo minuscolo): ");
    inputfiore = input.nextLine();
    int qta;
    System.out.print("\nInserisci la quantità: ");
    qta = input.nextInt();
    double prezzo =0;
    
   
    
    for(int i =0; i<fiori.length; i++){
    
    if(fiori[i].equals(inputfiore)) {prezzo = prezzi[i]*qta;}
   
        }
    
    if(prezzo==0) System.out.print("Nessuna corrispondenza trovata con il fiore\n");
    else System.out.print("\nIl prezzo totale e': " +prezzo+ "EUR\n");
    
    
    
    }
}
