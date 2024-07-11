/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetti;

import java.util.Scanner;
/*
 * @author bonnot88
 */

public class FrequenzaCarattere {
    public static void main (String args []){
    
    int[] frequenza = new int [10];
    int t=0;
    boolean contieneCaratteri = false;
    String numero;
    Scanner input = new Scanner(System.in);
   
    do{
    
    System.out.print("Inserisci il numero telefonico: ");
    numero = input.nextLine();
       
    for(int c=0; c<numero.length(); c++){
        if(Character.isLetter(numero.charAt(c)))  contieneCaratteri= true;
        else contieneCaratteri = false;
        }
        if(contieneCaratteri==true) System.out.print("\n** ATTENZIONE NUMERO NON CORRETTO ** "
                +" presenti dei caratteri\n\n");
    
   }while(contieneCaratteri!=false);

  
    for(int j=0; j<numero.length(); j++){
        t = (int)  numero.charAt(j)-48;
            for(int k =0; k<frequenza.length; k++){
                if(k==t) frequenza[k]+=1; 
            }
    }
    
    for(int n=0; n<frequenza.length; n++) {     
         System.out.print("\nOCCORRENZE DEL NUMERO "+n+": " +frequenza[n]+ "\n");   
   }
  }
}

