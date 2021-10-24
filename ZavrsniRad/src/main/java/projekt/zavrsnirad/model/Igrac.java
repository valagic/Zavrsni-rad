/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.model;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
/**
 *
 * @author valagic
 */
@Entity
public class Igrac extends Osoba{
    
    private String ime;
    private String prezime;
    
    @ManyToOne
    private Ekipa ekipa;
    
    @OneToOne(mappedBy = "igrac")
    private Statistika statistika;
    
    public Ekipa getEkipa() {
        return ekipa;
    }
    public void setEkipa(Ekipa ekipa) {
        this.ekipa = ekipa;
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public String getPrezime() {
        return prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Statistika getStatistika() {
        return statistika;
    }

    public void setStatistika(Statistika statistika) {
        this.statistika = statistika;
    }
    
    
    
    @Override
    public String toString() {
        return getIme() + " " + getPrezime();
    }
}