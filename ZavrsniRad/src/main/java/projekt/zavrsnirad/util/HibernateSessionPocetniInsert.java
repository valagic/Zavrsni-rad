/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.util;

import com.github.javafaker.Faker;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
        
        Faker faker = new Faker();
        Igrac igrac;
        List<Igrac> igraci = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            igrac = new Igrac();
            
            String fakerIme = faker.name().firstName();
            igrac.setIme(fakerIme);
            String fakerPrezime = faker.name().lastName();
            igrac.setPrezime(fakerPrezime);
            s.save(igrac);
            igraci.add(igrac);
        }
        
        Trener trener;
        List<Trener> treneri = new ArrayList<>();
        for(int i = 0; i<10; i++){
            trener = new Trener();
            
            String fakerIme = faker.name().firstName();
            trener.setIme(fakerIme);
            String fakerPrezime = faker.name().lastName();
            trener.setPrezime(fakerPrezime);
            s.save(trener);
            treneri.add(trener);
        }
        
        List<Ekipa> ekipe = new ArrayList<>();
        
        Ekipa ekipa = new Ekipa();
        ekipa.setNazivEkipe("Dallas");
        s.save(ekipa);
        ekipe.add(ekipa);
        
        Ekipa ekipaDva = new Ekipa();
        ekipaDva.setNazivEkipe("Miami");
        s.save(ekipaDva);
        ekipe.add(ekipaDva);
        
        Ekipa ekipaTri = new Ekipa();
        ekipaTri.setNazivEkipe("Boston");
        s.save(ekipaTri);
        ekipe.add(ekipaTri);
        
        Ekipa ekipaCetiri = new Ekipa();
        ekipaCetiri.setNazivEkipe("Toronto");
        s.save(ekipaCetiri);
        ekipe.add(ekipaCetiri);
        
        Ekipa ekipaPet = new Ekipa();
        ekipaPet.setNazivEkipe("Portland");
        s.save(ekipaPet);
        ekipe.add(ekipaPet);
        
        Ekipa ekipaSest = new Ekipa();
        ekipaSest.setNazivEkipe("LA Lakers");
        s.save(ekipaSest);
        ekipe.add(ekipaSest);
        
        s.getTransaction().commit();
    }
 
}
