/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import projekt.zavrsnirad.controller.ObradaEkipa;
import projekt.zavrsnirad.controller.ObradaIgrac;
import projekt.zavrsnirad.controller.ObradaTrener;
import projekt.zavrsnirad.model.Ekipa;
import projekt.zavrsnirad.model.Igrac;
import projekt.zavrsnirad.model.Trener;
import projekt.zavrsnirad.util.NbaExepction;

/**
 *
 * @author valagic
 */

        // napravljen unos, potrebno doraditi kada unosim za gostujuce ekipu da sprema
        // u listu za gosta, isto tako i buttone za gosta



public class ProzorEkipa extends javax.swing.JFrame implements ProzorSucelja{
    
    private ObradaEkipa obrada;
    private ObradaIgrac igrac;
    private ObradaTrener trener;

    /**
     * Creates new form ProzorEkipa
     */
    public ProzorEkipa() {
        initComponents();
        obrada = new ObradaEkipa();
        igrac = new ObradaIgrac();
        trener = new ObradaTrener();
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
        lvlEkipaNazivDomace = new javax.swing.JLabel();
        txtEkipaNazivDomace = new javax.swing.JTextField();
        btnEkipaDomacaDodaj = new javax.swing.JButton();
        btnEkipaDomacaPromjeni = new javax.swing.JButton();
        btnEkipaDomacaObrisi = new javax.swing.JButton();
        lblEkipaIgraci = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstEkipaIgraci = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstEkipaTreneri = new javax.swing.JList<>();
        lblEkipaTreneri = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        lvlEkipaNazivDomace.setText("Naziv ekipe");

        btnEkipaDomacaDodaj.setText("Dodaj");
        btnEkipaDomacaDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkipaDomacaDodajActionPerformed(evt);
            }
        });

        btnEkipaDomacaPromjeni.setText("Promjeni");
        btnEkipaDomacaPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkipaDomacaPromjeniActionPerformed(evt);
            }
        });

        btnEkipaDomacaObrisi.setText("Obirši");
        btnEkipaDomacaObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkipaDomacaObrisiActionPerformed(evt);
            }
        });

        lblEkipaIgraci.setText("Igraci");

        jScrollPane2.setViewportView(lstEkipaIgraci);

        jScrollPane3.setViewportView(lstEkipaTreneri);

        lblEkipaTreneri.setText("Treneri");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lvlEkipaNazivDomace, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(txtEkipaNazivDomace)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEkipaDomacaPromjeni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEkipaDomacaDodaj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEkipaDomacaObrisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblEkipaIgraci))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblEkipaTreneri, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lblEkipaTreneri)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lvlEkipaNazivDomace)
                            .addComponent(lblEkipaIgraci))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEkipaNazivDomace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEkipaDomacaDodaj)
                                .addGap(18, 18, 18)
                                .addComponent(btnEkipaDomacaPromjeni)
                                .addGap(18, 18, 18)
                                .addComponent(btnEkipaDomacaObrisi))
                            .addComponent(jScrollPane2)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        if(evt.getValueIsAdjusting() || lstEntiteti.getSelectedValue()==null){
            return;
        }
       obrada.setEntitet(lstEntiteti.getSelectedValue());
       var e = obrada.getEntitet();
       txtEkipaNazivDomace.setText(e.getNazivEkipe());
    }//GEN-LAST:event_lstEntitetiValueChanged

    private void btnEkipaDomacaDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkipaDomacaDodajActionPerformed
        obrada.setEntitet(new Ekipa());
        postaviVrijednostiUEntitet();

        try {
            obrada.create();
            ucitaj();
        } catch (NbaExepction ex) {
            JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnEkipaDomacaDodajActionPerformed

    private void btnEkipaDomacaPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkipaDomacaPromjeniActionPerformed
        postaviVrijednostiUEntitet();
        try {
            obrada.update();
            ucitaj();
        } catch (NbaExepction ex) {
            JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnEkipaDomacaPromjeniActionPerformed

    private void btnEkipaDomacaObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkipaDomacaObrisiActionPerformed
        try {
            obrada.delete();
            ucitaj();
        } catch (NbaExepction ex) {
            JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnEkipaDomacaObrisiActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkipaDomacaDodaj;
    private javax.swing.JButton btnEkipaDomacaObrisi;
    private javax.swing.JButton btnEkipaDomacaPromjeni;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblEkipaIgraci;
    private javax.swing.JLabel lblEkipaTreneri;
    private javax.swing.JList<Igrac> lstEkipaIgraci;
    private javax.swing.JList<Trener> lstEkipaTreneri;
    private javax.swing.JList<Ekipa> lstEntiteti;
    private javax.swing.JLabel lvlEkipaNazivDomace;
    private javax.swing.JTextField txtEkipaNazivDomace;
    // End of variables declaration//GEN-END:variables

    @Override
    public void postaviVrijednostiUEntitet() {
        var e = obrada.getEntitet();
        e.setNazivEkipe(txtEkipaNazivDomace.getText());
        
        /*DefaultListModel<Igrac> m = (DefaultListModel<Igrac>) lstEkipaIgraci.getModel();
        for (Igrac i : lstEkipaIgraci.getSelectedValuesList()) {
           
                Igrac ig = new Igrac();
                
            }
        }
        lstEkipaIgraci.repaint();*/
        
    }

    @Override
    public void postavke() {
        DefaultListModel<Igrac> m = new DefaultListModel<>();
        igrac.read().forEach(p -> {m.addElement(p);});
        lstEkipaIgraci.setModel(m);
        
        DefaultListModel<Trener> mt = new DefaultListModel<>();
        trener.read().forEach(p -> {mt.addElement(p);});
        lstEkipaTreneri.setModel(mt);
    }

    @Override
    public void ucitaj() {
        DefaultListModel<Ekipa> m = new DefaultListModel<>();
        obrada.read().forEach(s->{m.addElement(s);});
        lstEntiteti.setModel(m);
    }

    
}
