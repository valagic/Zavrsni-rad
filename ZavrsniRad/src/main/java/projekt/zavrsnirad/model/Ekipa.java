/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.model;

import java.util.List;
import java.util.Objects;
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

    @Override
    public String toString() {
        return getNazivEkipe();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.naziv);
        hash = 37 * hash + Objects.hashCode(this.treneri);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ekipa other = (Ekipa) obj;
        if (!Objects.equals(this.naziv, other.naziv)) {
            return false;
        }
        if (!Objects.equals(this.treneri, other.treneri)) {
            return false;
        }
        return true;
    }

    
}
