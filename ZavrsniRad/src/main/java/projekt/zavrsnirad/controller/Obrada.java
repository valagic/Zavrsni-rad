/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.controller;

import java.util.List;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import projekt.zavrsnirad.util.HibernateUtil;
import projekt.zavrsnirad.util.NbaExepction;

/**
 *
 * @author valagic
 */
public abstract class Obrada<T> {
    
    protected Session session;
    
    //vrsta klase
    protected T entitet;
    
    public abstract List<T> read();
    protected abstract void kontrolaCreate() throws NbaExepction;
    protected abstract void kontrolaUpdate() throws NbaExepction;
    protected abstract void kontrolaDelete() throws NbaExepction;
    
    //konstruktor kontrolera
    public Obrada(){
        this.session = HibernateUtil.getSession();
    }
    
     public T create() throws NbaExepction {
        kontrolaCreate();
        save();
        return entitet;
    }
    
    public T update() throws NbaExepction{
        kontrolaUpdate();
        save();
        return entitet;
    }
    
    public void delete() throws NbaExepction{
        kontrolaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
        
    }
  
    private void save() {
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }
        
        
        
        
    }
    
    

