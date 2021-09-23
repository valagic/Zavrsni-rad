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
    
 
    
    @ManyToOne
    private Igrac igraci;
    
    @ManyToOne
    private Utakmica utakmice;


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

    public Igrac getIgraci() {
        return igraci;
    }

    public void setIgraci(Igrac igraci) {
        this.igraci = igraci;
    }

    public Utakmica getUtakmice() {
        return utakmice;
    }

    public void setUtakmice(Utakmica utakmice) {
        this.utakmice = utakmice;
    }

    
}
