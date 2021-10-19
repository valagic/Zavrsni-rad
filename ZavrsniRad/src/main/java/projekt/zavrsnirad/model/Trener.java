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

    
    
    @Override
    public String toString() {
        return getIme() + " " + getPrezime();
    }
    
    
}