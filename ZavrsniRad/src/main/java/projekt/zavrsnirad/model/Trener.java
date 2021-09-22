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
public class Trener extends Osoba{

    private Integer brojPobjedaUKarijeri;
    private Integer brojPorazaUKarijeri;

    public Integer getBrojPobjedaUKarijeri() {
        return brojPobjedaUKarijeri;
    }

    public void setBrojPobjedaUKarijeri(Integer brojPobjedaUKarijeri) {
        this.brojPobjedaUKarijeri = brojPobjedaUKarijeri;
    }

    public Integer getBrojPorazaUKarijeri() {
        return brojPorazaUKarijeri;
    }

    public void setBrojPorazaUKarijeri(Integer brojPorazaUKarijeri) {
        this.brojPorazaUKarijeri = brojPorazaUKarijeri;
    }
    
    
    
}