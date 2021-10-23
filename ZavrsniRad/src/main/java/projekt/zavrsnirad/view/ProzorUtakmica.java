/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import projekt.zavrsnirad.controller.ObradaEkipa;
import projekt.zavrsnirad.controller.ObradaIgrac;
import projekt.zavrsnirad.controller.ObradaUtakmica;
import projekt.zavrsnirad.model.Ekipa;
import projekt.zavrsnirad.model.Utakmica;
import projekt.zavrsnirad.util.Aplikacija;
import projekt.zavrsnirad.util.NbaExepction;

/**
 *
 * @author valagic
 */
public class ProzorUtakmica extends javax.swing.JFrame implements ProzorSucelja{

    private ObradaUtakmica obrada;
    private ObradaEkipa obradaEkipa;
    private ObradaIgrac obradaIgrac;
    private int odabraniIndex;
    /**
     * Creates new form ProzorUtakmica
     */
    public ProzorUtakmica() {
        initComponents();
        obrada = new ObradaUtakmica();
        obradaEkipa = new ObradaEkipa();
        obradaIgrac = new ObradaIgrac();
        postavke();
        ucitaj();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEntiteti = new javax.swing.JList<>();
        lblNazivDvorane = new javax.swing.JLabel();
        txtNazivDvorane = new javax.swing.JTextField();
        lblDatumPocetka = new javax.swing.JLabel();
        dpDatumPocetka = new com.github.lgooddatepicker.components.DatePicker();
        lblDomacaEkipa = new javax.swing.JLabel();
        lblGostujucaEkipa = new javax.swing.JLabel();
        cmbEkipaDomacin = new javax.swing.JComboBox<>();
        cmbEkipaGost = new javax.swing.JComboBox<>();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        lblNazivDvorane.setText("Naziv Dvorane");

        lblDatumPocetka.setText("Datum pocetka");

        lblDomacaEkipa.setText("Domaca ekipa");

        lblGostujucaEkipa.setText("Gostujuce ekipa");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnObrisi))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbEkipaGost, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbEkipaDomacin, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDomacaEkipa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblGostujucaEkipa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dpDatumPocetka, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                        .addComponent(lblDatumPocetka, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNazivDvorane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNazivDvorane, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDatumPocetka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNazivDvorane)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNazivDvorane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDomacaEkipa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEkipaDomacin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGostujucaEkipa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEkipaGost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi))))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
     if (evt.getValueIsAdjusting() || lstEntiteti.getSelectedValue() == null) {
            return;
        }

        obrada.setEntitet(lstEntiteti.getSelectedValue());
        var e = obrada.getEntitet();
        txtNazivDvorane.setText(e.getNazivDvorane());
        
        if (e.getDatumPocetka() != null) {
            dpDatumPocetka.setDate(e.getDatumPocetka().toInstant().atZone(ZoneId.systemDefault()).
                    toLocalDate());
        }else{
            dpDatumPocetka.setDate(null);
        }
        
        cmbEkipaDomacin.setSelectedItem(e.getDomaca());
        cmbEkipaGost.setSelectedItem(e.getGost());
  
    }//GEN-LAST:event_lstEntitetiValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Utakmica());

        postaviVrijednostiUEntitet();
        try {
            
            obrada.create();
            ucitaj();
            pocistiPodatke();
            //pocistiPodatke(); -> trebam kreirati metodu koje ce obrisati podatke
        } catch (NbaExepction ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        // ne radi dobro
        if (obrada.getEntitet() == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberite ekipu");
            return;
        }
        postaviVrijednostiUEntitet();
        try {
            obrada.update();
            odabraniIndex = lstEntiteti.getSelectedIndex();
            ucitaj();
            lstEntiteti.setSelectedIndex(odabraniIndex);

        } catch (NbaExepction ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        try {
            obrada.delete();
            ucitaj();
        } catch (NbaExepction ex) {
            JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JComboBox<Ekipa> cmbEkipaDomacin;
    private javax.swing.JComboBox<Ekipa> cmbEkipaGost;
    private com.github.lgooddatepicker.components.DatePicker dpDatumPocetka;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDatumPocetka;
    private javax.swing.JLabel lblDomacaEkipa;
    private javax.swing.JLabel lblGostujucaEkipa;
    private javax.swing.JLabel lblNazivDvorane;
    private javax.swing.JList<Utakmica> lstEntiteti;
    private javax.swing.JTextField txtNazivDvorane;
    // End of variables declaration//GEN-END:variables

    @Override
    public void postaviVrijednostiUEntitet() { // datum radi, treba staviti HR datum
        var e = obrada.getEntitet();
        if (dpDatumPocetka.getDate() != null) {
            e.setDatumPocetka(Date.from(
                    dpDatumPocetka.getDate().atStartOfDay()
                            .atZone(ZoneId.systemDefault()).toInstant())
            );
        }
        e.setNazivDvorane(txtNazivDvorane.getText());
        
        e.setDomaca((Ekipa) cmbEkipaDomacin.getSelectedItem());
        e.setGost((Ekipa) cmbEkipaGost.getSelectedItem());
        
        
    }

    @Override
    public void postavke() {
        setTitle(Aplikacija.getNaslov("Utakmica"));
        DefaultComboBoxModel<Ekipa> m = new DefaultComboBoxModel<>();
        Ekipa e = new Ekipa();
        e.setId(Long.valueOf(0));
        e.setNazivEkipe("Nije odabrano");
        m.addElement(e);
        new ObradaEkipa().read().forEach(s -> {
            m.addElement(s);
        });
         cmbEkipaDomacin.setModel(m);
        
        DefaultComboBoxModel<Ekipa> m2 = new DefaultComboBoxModel<>();
        Ekipa e2 = new Ekipa();
        e2.setId(Long.valueOf(0));
        e2.setNazivEkipe("Nije odabrano");
        m2.addElement(e2);
        new ObradaEkipa().read().forEach(s -> {
            m2.addElement(s);
        });
        cmbEkipaGost.setModel(m2);
        
        DatePickerSettings dps = new DatePickerSettings(new Locale("hr", "HR"));
        dps.setFormatForDatesCommonEra("dd.MM.yyyy");

        dpDatumPocetka.setSettings(dps);
    }

    @Override
    public void ucitaj() {
       DefaultListModel<Utakmica> m = new DefaultListModel<>();
        obrada.read().forEach(g -> {
            m.addElement(g);
        });
        lstEntiteti.setModel(m);
    }

    private void pocistiPodatke() {
        dpDatumPocetka.setDateToToday();
        txtNazivDvorane.setText("");
        cmbEkipaDomacin.setSelectedIndex(0);
        cmbEkipaGost.setSelectedIndex(0);
        
    }
}
