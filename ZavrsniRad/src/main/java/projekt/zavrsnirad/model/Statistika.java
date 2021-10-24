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
public class Statistika extends Entitet{
    
    private Integer brojPoena;
    private Integer brojAsistencija;
    private Integer brojSkokova;
    private Integer brojUkradenihLopti;
    private Integer brojBlokiranihSuteva;
    private Integer brojIzgubljenihLopti;
    
 
    
    /*@OneToMany(mappedBy = "statistika")
    private List<Igrac> igraci;*/
    @ManyToOne
    private Igrac igrac;
    
    @ManyToOne
    private Utakmica utakmica;


    public Integer getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(Integer brojPoena) {
        this.brojPoena = brojPoena;
    }

    public Integer getBrojAsistencija() {
        return brojAsistencija;
    }

    public void setBrojAsistencija(Integer brojAsistencija) {
        this.brojAsistencija = brojAsistencija;
    }

    public Integer getBrojSkokova() {
        return brojSkokova;
    }

    public void setBrojSkokova(Integer brojSkokova) {
        this.brojSkokova = brojSkokova;
    }

    public Integer getBrojUkradenihLopti() {
        return brojUkradenihLopti;
    }

    public void setBrojUkradenihLopti(Integer brojUkradenihLopti) {
        this.brojUkradenihLopti = brojUkradenihLopti;
    }

    public Integer getBrojBlokiranihSuteva() {
        return brojBlokiranihSuteva;
    }

    public void setBrojBlokiranihSuteva(Integer brojBlokiranihSuteva) {
        this.brojBlokiranihSuteva = brojBlokiranihSuteva;
    }

    public Integer getBrojIzgubljenihLopti() {
        return brojIzgubljenihLopti;
    }

    public void setBrojIzgubljenihLopti(Integer brojIzgubljenihLopti) {
        this.brojIzgubljenihLopti = brojIzgubljenihLopti;
    }


    

    /*public List<Igrac> getIgraci() {
    return igraci;
    }
    public void setIgraci(List<Igrac> igraci) {
    this.igraci = igraci;*/

    public Igrac getIgrac() {
        return igrac;
    }

    public void setIgrac(Igrac igrac) {
        this.igrac = igrac;
    }

    public Utakmica getUtakmica() {
        return utakmica;
    }

    public void setUtakmica(Utakmica utakmica) {
        this.utakmica = utakmica;
    }

    @Override
    public String toString() {
        return getBrojPoena() + " " + getBrojSkokova() + " " + getBrojAsistencija() + " " + getBrojUkradenihLopti()
                + " " + getBrojBlokiranihSuteva() + " " + getBrojIzgubljenihLopti();
    }
    
    
}
