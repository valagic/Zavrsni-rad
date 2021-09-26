/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.controller;

import java.util.List;
import projekt.zavrsnirad.model.Igrac;
import projekt.zavrsnirad.model.Osoba;
import projekt.zavrsnirad.util.NbaExepction;

/**
 *
 * @author valagic
 */
public class ObradaIgrac extends ObradaOsoba<Igrac>{

    @Override
    public List<Igrac> read() {
        return session.createQuery("from Igrac").list();
        }

    @Override
    protected void kontrolaCreate() throws NbaExepction {
        super.kontrolaCreate(); // s time odradimo sve kontrole vezane za osobu
        //kontrolaIme();
        //kontrolaPrezime();
        //kontrolaNazivEkipe();
        
        }

    @Override
    protected void kontrolaUpdate() throws NbaExepction {
        }

    @Override
    protected void kontrolaDelete() throws NbaExepction {
        }

    private void kontrolaNazivEkipe() throws NbaExepction{
        if(entitet.getNazivEkipaZaKojuIgra() == null || entitet.getPrezime().trim().length() == 0) {
            throw new NbaExepction("Unesite ispravni naziv ekipe");
        }}
    
}
