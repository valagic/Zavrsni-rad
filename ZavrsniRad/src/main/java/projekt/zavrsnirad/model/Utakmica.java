/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author valagic
 */
@Entity
public class Utakmica extends Entitet{
    
    
    private String nazivDvorane;
    private Date DatumPocetka;
    private Integer rezultatDomaceEkipe;
    private Integer rezultatGostujuceEkipe;

    @ManyToOne
    private Ekipa ekipe;
   
    public String getNazivDvorane() {
        
        return nazivDvorane;
    }

    public void setNazivDvorane(String nazivDvorane) {
        this.nazivDvorane = nazivDvorane;
    }

    public Date getDatumPocetka() {
        return DatumPocetka;
    }

    public void setDatumPocetka(Date DatumPocetka) {
        this.DatumPocetka = DatumPocetka;
    }

    public Integer getRezultatDomaceEkipe() {
        return rezultatDomaceEkipe;
    }

    public void setRezultatDomaceEkipe(Integer rezultatDomaceEkipe) {
        this.rezultatDomaceEkipe = rezultatDomaceEkipe;
    }

    public Integer getRezultatGostujuceEkipe() {
        return rezultatGostujuceEkipe;
    }

    public void setRezultatGostujuceEkipe(Integer rezultatGostujuceEkipe) {
        this.rezultatGostujuceEkipe = rezultatGostujuceEkipe;
    }

    public Ekipa getEkipe() {
        return ekipe;
    }

    public void setEkipe(Ekipa ekipe) {
        this.ekipe = ekipe;
    }
    

}
