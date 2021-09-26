/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.controller;

import java.util.List;
import projekt.zavrsnirad.model.Trener;
import projekt.zavrsnirad.util.NbaExepction;

/**
 *
 * @author valagic
 */
public class ObradaTrener extends ObradaOsoba<Trener>{

    @Override
    public List<Trener> read() {
        return session.createQuery("from Trener").list();
    }

    @Override
    protected void kontrolaCreate() throws NbaExepction {
        super.kontrolaCreate(); // s time odradimo sve kontrole vezane za osobu
        //kontrolaPrezime();
        //kontrolaNazivEkipeKojuTrenira();
        //kontrolaBrojPobjedaUKarijeri();
        //kontrolaBrojPorazaUKarijeri();
        
        }

    @Override
    protected void kontrolaUpdate() throws NbaExepction {
        }

    @Override
    protected void kontrolaDelete() throws NbaExepction {
        }
    
    
    private void kontrolaNazivEkipeKojuTrenira() throws NbaExepction{
        if(entitet.getIme() == null || entitet.getIme().trim().length() == 0) {
            throw new NbaExepction("Molim unesite ime");
        }}

    private void kontrolaBrojPobjedaUKarijeri() throws NbaExepction{
        }

    private void kontrolaBrojPorazaUKarijeri() throws NbaExepction{
        }
    
}
