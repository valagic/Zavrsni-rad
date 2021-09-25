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
        kontrolaIme();
        //kontrolaPrezime();
        //kontrolaNazivEkipe();
        
        }

    @Override
    protected void kontrolaUpdate() throws NbaExepction {
        }

    @Override
    protected void kontrolaDelete() throws NbaExepction {
        }

    private void kontrolaIme() throws NbaExepction{
        if(entitet.getIme() == null || entitet.getIme().trim().length() == 0) {
            throw new NbaExepction("Molim unesite ime");
        }}

    private void kontrolaPrezime() throws NbaExepction{
        if(entitet.getPrezime() == null || entitet.getPrezime().trim().length() == 0) {
            throw new NbaExepction("Molim unesite prezime");
        }}

    private void kontrolaNazivEkipe() throws NbaExepction{
        if(entitet.getNazivEkipaZaKojuIgra() == null || entitet.getPrezime().trim().length() == 0) {
            throw new NbaExepction("Unesite ispravni naziv ekipe");
        }}
    
}
