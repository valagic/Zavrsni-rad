/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.controller;

import java.util.List;
import projekt.zavrsnirad.model.Utakmica;
import projekt.zavrsnirad.util.NbaExepction;

/**
 *
 * @author valagic
 */
public class ObradaUtakmica extends Obrada<Utakmica>{

    @Override
    public List<Utakmica> read() {
        return session.createQuery("from Utakmica").list();
    }

    @Override
    protected void kontrolaCreate() throws NbaExepction {
        
        }

    @Override
    protected void kontrolaUpdate() throws NbaExepction {
        
        }

    @Override
    protected void kontrolaDelete() throws NbaExepction {
        
        }
    
    
    
}
