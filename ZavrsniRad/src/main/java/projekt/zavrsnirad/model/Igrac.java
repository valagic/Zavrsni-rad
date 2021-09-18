/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.model;

import javax.persistence.Entity;

/**
 *
 * @author valagic
 */
@Entity
public class Igrac extends Osoba{
    
    private String nazivEkipeZaKojuIgra;

    public String getNazivEkipeZaKojuIgra() {
        return nazivEkipeZaKojuIgra;
    }

    public void setNazivEkipeZaKojuIgra(String nazivEkipeZaKojuIgra) {
        this.nazivEkipeZaKojuIgra = nazivEkipeZaKojuIgra;
    }
    
    
}
