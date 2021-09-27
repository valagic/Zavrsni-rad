
package projekt.zavrsnirad.controller;


import java.util.List;
import java.util.regex.Pattern;
import projekt.zavrsnirad.model.Statistika;
import projekt.zavrsnirad.util.NbaExepction;


public class ObradaStatistika extends Obrada<Statistika>{
    


    @Override
    public List<Statistika> read() {
        return session.createQuery("from Statistika").list();
        }

    @Override
    protected void kontrolaCreate() throws NbaExepction {
        kontrolaBrojPoena();
        kontrolaBrojAsistencija();
        kontrolaBrojSkokova();
        kontrolaBrojUkradenihLopti();
        kontrolaBrojBlokiranihSuteva();
        kontrolaBrojIzgubljenihLopti();
        }

    @Override
    protected void kontrolaUpdate() throws NbaExepction {
        }

    @Override
    protected void kontrolaDelete() throws NbaExepction {
        }

    private void kontrolaBrojPoena() {
        kontrolaSamoBrojevi(String str);
        }

    private void kontrolaBrojAsistencija() {
        
        }

    private void kontrolaBrojSkokova() {
        
        }

    private void kontrolaBrojUkradenihLopti() {
        
        }

    private void kontrolaBrojBlokiranihSuteva() {
        
        }

    private void kontrolaBrojIzgubljenihLopti() {
        
        }


    private void kontrolaSamoBrojevi(String str) throws NbaExepction{
        try {
               int integ = Integer.parseInt(str);
       } catch (Exception e) {
               throw new NbaExepction("Molim unesi broj");
       }      
 } 
    }
    


 
        
    

