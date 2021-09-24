/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author valagic
 */
@Entity
public class Igrac extends Osoba{
    
    private String nazivEkipaZaKojuIgra;

    public String getNazivEkipaZaKojuIgra() {
        return nazivEkipaZaKojuIgra;
    }

    public void setNazivEkipaZaKojuIgra(String nazivEkipaZaKojuIgra) {
        this.nazivEkipaZaKojuIgra = nazivEkipaZaKojuIgra;
    }
    
    
    
}
