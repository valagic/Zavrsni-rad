/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.util;

import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.Session;
import projekt.zavrsnirad.model.Igrac;

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
        
        s.getTransaction().commit();
    }

}
