/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.util;

import java.util.Scanner;
import projekt.zavrsnirad.controller.ObradaIgrac;
import projekt.zavrsnirad.model.Igrac;

/**
 *
 * @author valagic
 */
public class KonzolaUnosIgraca {
    
    public static void main(String[] args) {
        
        Scanner ulaz = new Scanner(System.in);
        ObradaIgrac oi = new ObradaIgrac();
        Igrac i = new Igrac();
        oi.setEntitet(i); 
        while(true){
            System.out.println("Unesi naziv igraca: ");
            i.setIme(ulaz.nextLine());
            try {
                oi.create();
                break;
            } catch (NbaExepction ex) {
                System.out.println(ex.getPoruka());
            }
        }
    }
    
    
    
}
