/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.controller;

import java.util.List;
import projekt.zavrsnirad.model.Ekipa;
import projekt.zavrsnirad.util.NbaExepction;

/**
 *
 * @author valagic
 */
public class ObradaEkipa extends Obrada<Ekipa>{

    @Override
    public List<Ekipa> read() {
        return session.createQuery("from Ekipa").list();
    }

    @Override
    protected void kontrolaCreate() throws NbaExepction {
        if(entitet.getNazivEkipe() == null || entitet.getNazivEkipe().trim().length() == 0)
        {
            
        }}

    @Override
    protected void kontrolaUpdate() throws NbaExepction {
        }

    @Override
    protected void kontrolaDelete() throws NbaExepction {
        }
    
    
    
}
