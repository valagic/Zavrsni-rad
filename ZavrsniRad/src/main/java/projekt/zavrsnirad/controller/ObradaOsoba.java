/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.controller;

import projekt.zavrsnirad.model.Osoba;
import projekt.zavrsnirad.util.NbaExepction;

/**
 *
 * @author valagic
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T>{
    
    @Override
    protected void kontrolaCreate() throws NbaExepction {
        kontrolaIme();
        kontrolaPrezime();
        
        }
    
    private void kontrolaIme() throws NbaExepction{
        if(entitet.getIme() == null || entitet.getIme().trim().length() == 0) {
            throw new NbaExepction("Molim unesite ime");
        }}

    private void kontrolaPrezime() throws NbaExepction{
        if(entitet.getPrezime() == null || entitet.getPrezime().trim().length() == 0) {
            throw new NbaExepction("Molim unesite prezime");
        }}
    
    
}
