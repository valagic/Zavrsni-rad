/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author valagic
 */
@Entity
public class Ekipa extends Entitet{

    private String naziv;
    
    
    @ManyToOne
    private Trener treneri;
    
   
    
 
    public String getNazivEkipe() {
        return naziv;
    }

    public void setNazivEkipe(String nazivEkipe) {
        this.naziv = nazivEkipe;
    }

    public Trener getTreneri() {
        return treneri;
    }

    public void setTreneri(Trener treneri) {
        this.treneri = treneri;
    }

    
}
