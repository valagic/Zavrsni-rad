/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekt.zavrsnirad.view;

import projekt.zavrsnirad.util.Aplikacija;

/**
 *
 * @author valagic
 */
public class GlavniIzbornik extends javax.swing.JFrame {

    /**
     * Creates new form GlavniIzbornik
     */
    public GlavniIzbornik() {
        initComponents();
        postavke();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jIzbornik = new javax.swing.JMenu();
        jIgrac = new javax.swing.JMenuItem();
        jTrener = new javax.swing.JMenuItem();
        jEkipa = new javax.swing.JMenuItem();
        jUtakmica = new javax.swing.JMenuItem();
        jStatistika = new javax.swing.JMenuItem();
        jIzlaz = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jIzbornik.setText("Izbornik");

        jIgrac.setText("Igrac");
        jIgrac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIgracActionPerformed(evt);
            }
        });
        jIzbornik.add(jIgrac);

        jTrener.setText("Trener");
        jTrener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTrenerActionPerformed(evt);
            }
        });
        jIzbornik.add(jTrener);

        jEkipa.setText("Ekipa");
        jEkipa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEkipaActionPerformed(evt);
            }
        });
        jIzbornik.add(jEkipa);

        jUtakmica.setText("Utakmica");
        jUtakmica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUtakmicaActionPerformed(evt);
            }
        });
        jIzbornik.add(jUtakmica);

        jStatistika.setText("Statistika");
        jStatistika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStatistikaActionPerformed(evt);
            }
        });
        jIzbornik.add(jStatistika);

        jIzlaz.setText("Izlaz iz programa");
        jIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIzlazActionPerformed(evt);
            }
        });
        jIzbornik.add(jIzlaz);

        jMenuBar1.add(jIzbornik);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jIgracActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIgracActionPerformed
        new ProzorIgrac().setVisible(true);
    }//GEN-LAST:event_jIgracActionPerformed

    private void jTrenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTrenerActionPerformed
        new ProzorTrener().setVisible(true);
    }//GEN-LAST:event_jTrenerActionPerformed

    private void jEkipaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEkipaActionPerformed
        new ProzorEkipa().setVisible(true);
    }//GEN-LAST:event_jEkipaActionPerformed

    private void jUtakmicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUtakmicaActionPerformed
        new ProzorUtakmica().setVisible(true);
    }//GEN-LAST:event_jUtakmicaActionPerformed

    private void jStatistikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStatistikaActionPerformed
        new ProzorStatistika().setVisible(true);
    }//GEN-LAST:event_jStatistikaActionPerformed

    private void jIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIzlazActionPerformed
        dispose();
    }//GEN-LAST:event_jIzlazActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GlavniIzbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GlavniIzbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GlavniIzbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GlavniIzbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GlavniIzbornik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jEkipa;
    private javax.swing.JMenuItem jIgrac;
    private javax.swing.JMenu jIzbornik;
    private javax.swing.JMenuItem jIzlaz;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jStatistika;
    private javax.swing.JMenuItem jTrener;
    private javax.swing.JMenuItem jUtakmica;
    // End of variables declaration//GEN-END:variables

    private void postavke() {
        setTitle(Aplikacija.getNaslov("Glavni izbornik"));
    }
}
