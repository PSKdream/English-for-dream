/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnglishForDream;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;


 /**
 *
 * @author ptmna
 */
public class GUI_ADDvocabtodata extends javax.swing.JFrame {

   
    public GUI_ADDvocabtodata() {
     
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        next = new javax.swing.JButton();
        translate = new javax.swing.JButton();
        translatedLabel = new javax.swing.JLabel();
        texttospeech = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addword = new javax.swing.JTextField();
        addvocabtodata = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setMaximumSize(new java.awt.Dimension(450, 720));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setForeground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next.setBackground(new java.awt.Color(255,153,153));
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/next.png"))); // NOI18N
        next.setBorder(null);
        jPanel2.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 230, 110, 90));

        translate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/bttran.png"))); // NOI18N
        translate.setBorder(null);
        jPanel2.add(translate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 190, 160));

        translatedLabel.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        translatedLabel.setForeground(new java.awt.Color(255, 255, 255));
        translatedLabel.setText("Answer");
        jPanel2.add(translatedLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 410, 120));

        texttospeech.setBackground(new java.awt.Color(255,153,153));
        texttospeech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/speechbt.png"))); // NOI18N
        texttospeech.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        texttospeech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                texttospeechMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                texttospeechMouseExited(evt);
            }
        });
        texttospeech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texttospeechActionPerformed(evt);
            }
        });
        jPanel2.add(texttospeech, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 190, 160));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1150, 330));

        jPanel5.setBackground(new java.awt.Color(255, 153, 153));
        jPanel5.setForeground(new java.awt.Color(255, 153, 153));
        jPanel5.setToolTipText("");
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setBackground(new java.awt.Color(255,153,153));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/arLeft.png"))); // NOI18N
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel5.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/fonttranslate.png"))); // NOI18N
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 330, 60));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 80));

        addword.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        addword.setForeground(new java.awt.Color(102, 51, 0));
        addword.setText("Answer");
        addword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 39, 0), 7, true));
        addword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addwordActionPerformed(evt);
            }
        });
        jPanel3.add(addword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 430, 70));

        addvocabtodata.setText("Addvocabtodata");
        addvocabtodata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addvocabtodataActionPerformed(evt);
            }
        });
        jPanel3.add(addvocabtodata, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texttospeechMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texttospeechMouseEntered
        setMouseEntered_Exited(texttospeech,"speechover");
    }//GEN-LAST:event_texttospeechMouseEntered

    private void texttospeechMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_texttospeechMouseExited
        setMouseEntered_Exited(texttospeech,"speechbt");
    }//GEN-LAST:event_texttospeechMouseExited

    private void addvocabtodataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addvocabtodataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addvocabtodataActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       setVisible(false);
        new GUI_Epg().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void texttospeechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texttospeechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texttospeechActionPerformed

    private void addwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addwordActionPerformed
    public void setMouseEntered_Exited(JButton a,String Imagefile){
        ImageIcon icon = new ImageIcon("src/EnglishForDream/"+Imagefile+".png");
        a.setIcon(icon);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox addvocabtodata;
    private javax.swing.JTextField addword;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton next;
    private javax.swing.JButton texttospeech;
    private javax.swing.JButton translate;
    private javax.swing.JLabel translatedLabel;
    // End of variables declaration//GEN-END:variables
}
