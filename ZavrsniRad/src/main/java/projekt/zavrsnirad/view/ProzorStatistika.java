/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.view;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import projekt.zavrsnirad.controller.ObradaIgrac;
import projekt.zavrsnirad.controller.ObradaStatistika;
import projekt.zavrsnirad.controller.ObradaUtakmica;
import projekt.zavrsnirad.model.Igrac;
import projekt.zavrsnirad.model.Statistika;
import projekt.zavrsnirad.model.Utakmica;
import projekt.zavrsnirad.util.NbaExepction;

/**
 *
 * @author valagic
 */
public class ProzorStatistika extends javax.swing.JFrame implements ProzorSucelja{

    private ObradaStatistika obrada;
    private ObradaIgrac igrac;
    private ObradaUtakmica utakmica;

    /**
     * Creates new form ProzorStatistika
     */
    public ProzorStatistika() {
        initComponents();
        obrada = new ObradaStatistika();
        igrac = new ObradaIgrac();
        utakmica = new ObradaUtakmica();
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
        lblBrojPoena = new javax.swing.JLabel();
        txtBrojPoena = new javax.swing.JTextField();
        lblBrojAsistencija = new javax.swing.JLabel();
        txtBrojAsistencija = new javax.swing.JTextField();
        lblBrojSkokova = new javax.swing.JLabel();
        txtBrojSkokova = new javax.swing.JTextField();
        lblBrojUkradenihLopti = new javax.swing.JLabel();
        txtBrojUkradenihLopti = new javax.swing.JTextField();
        lblBrojBlokiranihSuteva = new javax.swing.JLabel();
        txtBrojBlokiranihSuteva = new javax.swing.JTextField();
        lblBrojIzgubljenihLopti = new javax.swing.JLabel();
        txtBrojIzgubljenihLopti = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        lblIgraci = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstStatistikaIgraci = new javax.swing.JList<>();
        lblUtakmica = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstStatistikaUtakmica = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        lblBrojPoena.setText("Broj Poena");

        lblBrojAsistencija.setText("Broj Asistencija");

        txtBrojAsistencija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrojAsistencijaActionPerformed(evt);
            }
        });

        lblBrojSkokova.setText("Broj Skokova");

        lblBrojUkradenihLopti.setText("Broj ukradenih lopti");

        lblBrojBlokiranihSuteva.setText("Broj blokiranih suteva");

        lblBrojIzgubljenihLopti.setText("Broj izgubljenih lopti");

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

        lblIgraci.setText("Igraci");

        jScrollPane2.setViewportView(lstStatistikaIgraci);

        lblUtakmica.setText("Utakmica");

        jScrollPane3.setViewportView(lstStatistikaUtakmica);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtBrojPoena, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBrojAsistencija, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBrojPoena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBrojIzgubljenihLopti)
                        .addComponent(txtBrojBlokiranihSuteva)
                        .addComponent(lblBrojIzgubljenihLopti, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPromjeni)
                        .addGap(18, 18, 18)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtBrojUkradenihLopti, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBrojBlokiranihSuteva, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBrojAsistencija, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBrojSkokova, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBrojSkokova, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBrojUkradenihLopti, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblIgraci, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblUtakmica, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBrojPoena)
                            .addComponent(lblIgraci))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBrojPoena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBrojAsistencija)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBrojAsistencija, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBrojSkokova)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBrojSkokova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBrojUkradenihLopti)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBrojUkradenihLopti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBrojBlokiranihSuteva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBrojBlokiranihSuteva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBrojIzgubljenihLopti)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBrojIzgubljenihLopti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnObrisi)
                                    .addComponent(btnPromjeni)
                                    .addComponent(btnDodaj)))
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUtakmica)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBrojAsistencijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrojAsistencijaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrojAsistencijaActionPerformed

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
        if(evt.getValueIsAdjusting() || lstEntiteti.getSelectedValue()==null){
            return;
        }
        obrada.setEntitet(lstEntiteti.getSelectedValue());
        var e = obrada.getEntitet();
        txtBrojPoena.setText(String.valueOf(e.getBrojPoena()));
        txtBrojAsistencija.setText(String.valueOf(e.getBrojAsistencija()));
        txtBrojSkokova.setText(String.valueOf(e.getBrojSkokova()));
        txtBrojUkradenihLopti.setText(String.valueOf(e.getBrojUkradenihLopti()));
        txtBrojBlokiranihSuteva.setText(String.valueOf(e.getBrojBlokiranihSuteva()));
        txtBrojIzgubljenihLopti.setText(String.valueOf(e.getBrojIzgubljenihLopti()));
    }//GEN-LAST:event_lstEntitetiValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Statistika());
        postaviVrijednostiUEntitet();

        try {
            obrada.create();
            postaviStatistikuNaIgraca();
            //postaviStatistikuNaUtakmicu();
            ucitaj();
        } catch (NbaExepction ex) {
            JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
         postaviVrijednostiUEntitet();
        try {
            obrada.update();
            ucitaj();
        } catch (NbaExepction ex) {
            JOptionPane.showMessageDialog(getParent(), ex.getPoruka());
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBrojAsistencija;
    private javax.swing.JLabel lblBrojBlokiranihSuteva;
    private javax.swing.JLabel lblBrojIzgubljenihLopti;
    private javax.swing.JLabel lblBrojPoena;
    private javax.swing.JLabel lblBrojSkokova;
    private javax.swing.JLabel lblBrojUkradenihLopti;
    private javax.swing.JLabel lblIgraci;
    private javax.swing.JLabel lblUtakmica;
    private javax.swing.JList<Statistika> lstEntiteti;
    private javax.swing.JList<Igrac> lstStatistikaIgraci;
    private javax.swing.JList<Utakmica> lstStatistikaUtakmica;
    private javax.swing.JTextField txtBrojAsistencija;
    private javax.swing.JTextField txtBrojBlokiranihSuteva;
    private javax.swing.JTextField txtBrojIzgubljenihLopti;
    private javax.swing.JTextField txtBrojPoena;
    private javax.swing.JTextField txtBrojSkokova;
    private javax.swing.JTextField txtBrojUkradenihLopti;
    // End of variables declaration//GEN-END:variables

    @Override
    public void postaviVrijednostiUEntitet() {
        var e = obrada.getEntitet();
        e.setBrojPoena(Integer.parseInt(txtBrojPoena.getText()));
        e.setBrojSkokova(Integer.parseInt(txtBrojSkokova.getText()));
        e.setBrojAsistencija(Integer.parseInt(txtBrojAsistencija.getText()));
        e.setBrojUkradenihLopti(Integer.parseInt(txtBrojUkradenihLopti.getText()));
        e.setBrojBlokiranihSuteva(Integer.parseInt(txtBrojBlokiranihSuteva.getText()));
        e.setBrojIzgubljenihLopti(Integer.parseInt(txtBrojIzgubljenihLopti.getText()));
        
    }

    @Override
    public void postavke() {
        DefaultListModel<Igrac> mi = new DefaultListModel<>();
        igrac.read().forEach(s->{mi.addElement(s);});
        lstStatistikaIgraci.setModel(mi);
        
        DefaultListModel<Utakmica> mu = new DefaultListModel<>();
        utakmica.read().forEach(s->{mu.addElement(s);});
        lstStatistikaUtakmica.setModel(mu);
        
    }

    @Override
    public void ucitaj() {
        DefaultListModel<Statistika> m = new DefaultListModel<>();
        obrada.read().forEach(s->{m.addElement(s);});
        lstEntiteti.setModel(m);
    }
 
    private void postaviStatistikuNaIgraca() {
        for (Igrac i : lstStatistikaIgraci.getSelectedValuesList()) {
            i.setStatistika(obrada.getEntitet());
            ObradaIgrac obradaIgrac = new ObradaIgrac();
            obradaIgrac.setEntitet(i);
            try {
                obradaIgrac.update();
            } catch (NbaExepction ex) {
                JOptionPane.showMessageDialog(null, ex.getPoruka());
            }
        }
    }
    
      /*  private void postaviStatistikuNaUtakmicu() {
        for (Utakmica u : lstStatistikaUtakmica.getSelectedValuesList()) {
            u.setStatistika(obrada.getEntitet());
            ObradaUtakmica obradaUtakmica = new ObradaUtakmica();
            obradaUtakmica.setEntitet(u);
            try {
                obradaIgrac.update();
            } catch (NbaExepction ex) {
                JOptionPane.showMessageDialog(null, ex.getPoruka());
            }
        }
    }*/
    
}
