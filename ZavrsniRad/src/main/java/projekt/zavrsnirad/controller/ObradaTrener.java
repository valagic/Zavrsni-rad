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
        kontrolaNazivEkipe();

        
        }

    @Override
    protected void kontrolaUpdate() throws NbaExepction {
        }

    @Override
    protected void kontrolaDelete() throws NbaExepction {
        }
    
    
    private void kontrolaNazivEkipe() throws NbaExepction{
        if(entitet.getNazivEkipeKojuTrenira()== null || entitet.getNazivEkipeKojuTrenira().trim().length() == 0) {
            throw new NbaExepction("Molim unesite ime ekipe");
        }}

    /*private void kontrolaBrojPobjedaUKarijeri(String s) throws NbaExepction{
        kontrolaSamoBrojevi(s);
        }

    private void kontrolaBrojPorazaUKarijeri(String s) throws NbaExepction{
        kontrolaSamoBrojevi(s);
        }

    private void kontrolaSamoBrojevi(String s) throws NbaExepction{
         try {
               int integ = Integer.parseInt(s);
       } catch (Exception e) {
               throw new NbaExepction("Molim unesi broj");
       }      
    }*/
    
}
