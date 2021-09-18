/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author valagic
 */
@MappedSuperclass
public abstract class Entitet {
    //abstraktna klasa je klasa koje ne moze nikoga nasljedivati ali njih se moze
    //nasljedivati i ne moze se koristiti za stvaranje objekata
    
    @Id //oznacava primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ovo je isto kao auto_increment u mysql-u
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    
}
