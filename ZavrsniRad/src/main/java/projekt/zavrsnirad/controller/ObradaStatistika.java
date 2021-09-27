
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
        }

    private void kontrolaBrojSkokova(String s) throws NbaExepction {
        kontrolaSamoBrojevi(s);
        }

    private void kontrolaBrojUkradenihLopti(String s) throws NbaExepction {
        kontrolaSamoBrojevi(s);
        }

    private void kontrolaBrojBlokiranihSuteva(String s) throws NbaExepction {
        kontrolaSamoBrojevi(s);
        }

    private void kontrolaBrojIzgubljenihLopti(String s) throws NbaExepction {
        kontrolaSamoBrojevi(s);
        }

 } 
        
    


 
        
    

