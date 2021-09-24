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
import projekt.zavrsnirad.model.Statistika;
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
        i.setNazivEkipaZaKojuIgra("Dallas Mavericks");

        s.save(i);
        
        Trener t = new Trener();
        t.setIme("Pero");
        t.setPrezime("Perić");
        t.setNazivEkipeKojuTrenira("Dallas Mavericks");
        t.setBrojPobjedaUKarijeri(987);
        t.setBrojPorazaUKarijeri(678);
        s.save(t);
        
        Ekipa e = new Ekipa();
        e.setNazivEkipe("Dallas Mavericks");
        e.setIgraci(i);
        e.setTreneri(t);

        s.save(e);
        
        Utakmica u = new Utakmica();
 
        u.setDatumPocetka(new Date());
        u.setNazivDvorane("Gradski vrt");
        u.setEkipe(e);
       
        s.save(u);
        
        Statistika ss = new Statistika();
        ss.setBrojPoena(33);
        ss.setBrojSkokova(8);
        ss.setBrojAsistencija(4);
        ss.setBrojUkradenihLopti(2);
        ss.setBrojBlokiranihSuteva(1);
        ss.setBrojIzgubljenihLopti(0);
        ss.setIgraci(i);
        //ss.setUtakmice(u);
        s.save(ss);
       
        s.getTransaction().commit();
    }

}
