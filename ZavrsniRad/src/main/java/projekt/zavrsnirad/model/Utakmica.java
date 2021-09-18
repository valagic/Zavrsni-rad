/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author valagic
 */
@Entity
public class Utakmica extends Entitet{
    
    private String nazivDvorane;
    private String nazivDomaceEkipe;
    private String nazivGostujuceEkipe;
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

    public String getNazivDomaceEkipe() {
        return nazivDomaceEkipe;
    }

    public void setNazivDomaceEkipe(String nazivDomaceEkipe) {
        this.nazivDomaceEkipe = nazivDomaceEkipe;
    }

    public String getNazivGostujuceEkipe() {
        return nazivGostujuceEkipe;
    }

    public void setNazivGostujuceEkipe(String nazivGostujuceEkipe) {
        this.nazivGostujuceEkipe = nazivGostujuceEkipe;
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
    
    
    
}
