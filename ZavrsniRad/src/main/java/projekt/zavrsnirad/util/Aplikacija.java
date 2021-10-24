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
    private static final String LINK_GITHUB = "https://github.com/valagic/Zavrsni-rad";
    private static final String LINK_ER_DIAGRAM = "https://github.com/valagic/Zavrsni-rad/blob/main/ZavrsniRad/src/main/eraDijagram.png";
    
    
    public static String getNaslov(String naziv){
        
        return Aplikacija.NASLOV_APP + " " + naziv;
    }
    public static String githubLink(){
        return Aplikacija.LINK_GITHUB;
    }
    
    public static String getErDiagramLink(){
        return Aplikacija.LINK_ER_DIAGRAM;
    }
}
