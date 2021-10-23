/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.util;

/**
 *
 * @author valagic
 */
public class Aplikacija {
 
    public static final String NASLOV_APP = "NBA aplikacija";
    
    
    
    
    public static String getNaslov(String naziv){
        
        return Aplikacija.NASLOV_APP + " " + naziv;
    }
}
