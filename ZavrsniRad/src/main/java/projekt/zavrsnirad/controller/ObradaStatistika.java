
package projekt.zavrsnirad.controller;


import java.util.List;
import projekt.zavrsnirad.model.Statistika;
import projekt.zavrsnirad.util.NbaExepction;


public class ObradaStatistika extends Obrada<Statistika>{
    


    @Override
    public List<Statistika> read() {
        return session.createQuery("from Statistika").list();
        }

    @Override
    protected void kontrolaCreate() throws NbaExepction {
        kontrolaBrojPoena(String.valueOf(entitet.getBrojPoena()));
        kontrolaBrojAsistencija(String.valueOf(entitet.getBrojAsistencija()));
        kontrolaBrojSkokova(String.valueOf(entitet.getBrojSkokova()));
        kontrolaBrojUkradenihLopti(String.valueOf(entitet.getBrojUkradenihLopti()));
        kontrolaBrojBlokiranihSuteva(String.valueOf(entitet.getBrojBlokiranihSuteva()));
        kontrolaBrojIzgubljenihLopti(String.valueOf(entitet.getBrojIzgubljenihLopti()));
        }

    @Override
    protected void kontrolaUpdate() throws NbaExepction {
        }

    @Override
    protected void kontrolaDelete() throws NbaExepction {
        }

    private void kontrolaBrojPoena(String s) throws NbaExepction{
        kontrolaSamoBrojevi(s);
        if(entitet.getBrojPoena()<0 || entitet.getBrojPoena()>150){
            throw new NbaExepction("Uneseni broj ne moze biti manji od 0 i veci od 150");
        }
       }

    private void kontrolaSamoBrojevi(String s) throws NbaExepction{
         try {
               int integ = Integer.parseInt(s);
       } catch (Exception e) {
               throw new NbaExepction("Molim unesi broj");
       }      
    }
        

    private void kontrolaBrojAsistencija(String s) throws NbaExepction {
        kontrolaSamoBrojevi(s);
        if(entitet.getBrojAsistencija()<0 || entitet.getBrojAsistencija()>50){
            throw new NbaExepction("Uneseni broj ne moze biti manji od 0 i veci od 50");
        }
        }

    private void kontrolaBrojSkokova(String s) throws NbaExepction {
        kontrolaSamoBrojevi(s);
        if(entitet.getBrojSkokova()<0 || entitet.getBrojSkokova()>70){
            throw new NbaExepction("Uneseni broj ne moze biti manji od 0 i veci od 70");
        }
        }

    private void kontrolaBrojUkradenihLopti(String s) throws NbaExepction {
        kontrolaSamoBrojevi(s);
        if(entitet.getBrojUkradenihLopti()<0 || entitet.getBrojUkradenihLopti()>30){
            throw new NbaExepction("Uneseni broj ne moze biti manji od 0 i veci od 30");
        }
        }

    private void kontrolaBrojBlokiranihSuteva(String s) throws NbaExepction {
        kontrolaSamoBrojevi(s);
        if(entitet.getBrojBlokiranihSuteva()<0 || entitet.getBrojBlokiranihSuteva()>30){
            throw new NbaExepction("Uneseni broj ne moze biti manji od 0 i veci od 30");
        }
        }

    private void kontrolaBrojIzgubljenihLopti(String s) throws NbaExepction {
        kontrolaSamoBrojevi(s);
        if(entitet.getBrojIzgubljenihLopti()<0 || entitet.getBrojIzgubljenihLopti()>35){
            throw new NbaExepction("Uneseni broj ne moze biti manji od 0 i veci od 35");
        }
        }

 } 
        
    


 
        
    

