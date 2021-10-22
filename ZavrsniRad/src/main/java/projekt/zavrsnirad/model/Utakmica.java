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


    @ManyToOne
    private Ekipa domacin;
    
    @ManyToOne
    private Ekipa gost;

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

    public Ekipa getDomaca() {
        return domacin;
    }

    public void setDomaca(Ekipa domaca) {
        this.domacin = domaca;
    }

    public Ekipa getGost() {
        return gost;
    }

    public void setGost(Ekipa gost) {
        this.gost = gost;
    }

    @Override
    public String toString() {
        return getNazivDvorane() + " " + getDatumPocetka() + " " + getDomaca() + " - " + getGost();
    }
    
    

}
