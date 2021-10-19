/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author valagic
 */
@Entity
public class Igrac extends Osoba{
    

    
    @ManyToOne
    private Ekipa ekipa;


    public Ekipa getEkipa() {
        return ekipa;
    }

    public void setEkipa(Ekipa ekipa) {
        this.ekipa = ekipa;
    }

    @Override
    public String toString() {
        return getIme() + " " + getPrezime();
    }

  
    
    
    
}
