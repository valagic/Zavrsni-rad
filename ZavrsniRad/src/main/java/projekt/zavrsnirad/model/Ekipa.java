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

    private String nazivDomaceEkipe;
    private String nazivGostujuceEkipe;
    private Integer rezultatDomaceEkipe;
    private Integer rezultatGostujuceEkipe;
    
    @ManyToOne
    private Trener treneri;
    
    @ManyToOne
    private Igrac igraci;

    
    public Trener getTreneri() {
        return treneri;
    }

    public void setTreneri(Trener treneri) {
        this.treneri = treneri;
    }

    public Igrac getIgraci() {
        return igraci;
    }

    public void setIgraci(Igrac igraci) {
        this.igraci = igraci;
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
