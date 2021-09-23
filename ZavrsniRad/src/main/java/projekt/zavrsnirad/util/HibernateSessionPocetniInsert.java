/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.util;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.hibernate.Session;
import projekt.zavrsnirad.model.Ekipa;
import projekt.zavrsnirad.model.Igrac;
import projekt.zavrsnirad.model.Trener;
import projekt.zavrsnirad.model.Utakmica;

/**
 *
 * @author valagic
 */
public class HibernateSessionPocetniInsert {
    
  
    
    public static void unosUBazu(){
        
        Session s = HibernateUtil.getSession();
        
        s.beginTransaction();
        
        Igrac i = new Igrac();
        i.setIme("Luka");
        i.setPrezime("Doncic");
        i.setPlaca(20000000);

        s.save(i);
        
        Trener t = new Trener();
        t.setIme("Pero");
        t.setPrezime("Perić");
        t.setBrojPobjedaUKarijeri(987);
        t.setBrojPorazaUKarijeri(678);
        s.save(t);
        
        Ekipa e = new Ekipa();
        e.setNazivDomaceEkipe("Chicago");
        e.setNazivGostujuceEkipe("Memphis");
        e.setRezultatDomaceEkipe(112);
        e.setRezultatGostujuceEkipe(108);
        e.setIgraci(i);
        e.setTreneri(t);
        s.save(e);
        
        Utakmica u = new Utakmica();
        
        
        u.setDatumPocetka(new Date());
        u.setNazivDvorane("Gradski vrt");
        u.setEkipe(e);
        s.save(u);
        
        s.getTransaction().commit();
    }

}
