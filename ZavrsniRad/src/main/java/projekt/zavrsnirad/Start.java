/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad;

import projekt.zavrsnirad.util.HibernateSessionPocetniInsert;
import projekt.zavrsnirad.util.HibernateUtil;
import projekt.zavrsnirad.view.SplashScreen;

/**
 *
 * @author valagic
 */
public class Start {
    
    public static void main(String[] args) {
        //HibernateUtil.getSession();
       // HibernateSessionPocetniInsert.unosUBazu();
       new SplashScreen().setVisible(true);
        
        
    }
    
}
