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
public class NbaExepction extends Exception{
    
    private String poruka;
    
    public NbaExepction(String poruka){
        super();
        this.poruka = poruka;
    }

    public String getPoruka() {
        return poruka;
    }
    
}
