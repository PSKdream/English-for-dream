/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnglishForDream;

import Database.Database;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import TranslateTTS.TextToSpeech;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author ptmna
 */
public class GUI_Listening extends javax.swing.JFrame {

    private ArrayList<ArrayList<Object>> data = new ArrayList();
    private ArrayList<ArrayList<Object>> wrongAns = new ArrayList();
    private int point = 0;
    private int choice_total;

    public GUI_Listening() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        this.answer.setText(" ");

        this.randVocab();
        this.choice_total = this.data.size();
        this.choiceNum.setText((this.choice_total - this.data.size() + 1) + " out of " + this.choice_total);
    }

    private void randVocab() {
        Database db = new Database("jdbc:sqlite:data.db");
        db.connect();
        this.data = db.select.query("SELECT vocab,meaning FROM DATA ORDER BY random() LIMIT 10"); //retrun ArrayList type Object
        db.close();
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
        answer = new javax.swing.JTextField();
        check = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        speech = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        choiceNum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));
        jPanel3.setMaximumSize(new java.awt.Dimension(450, 720));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setForeground(new java.awt.Color(255, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        answer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        answer.setForeground(new java.awt.Color(102, 51, 0));
        answer.setToolTipText("");
        answer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(79, 39, 0), 7, true));
        answer.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        answer.setName("inputAns"); // NOI18N
        answer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                answerKeyPressed(evt);
            }
        });
        jPanel2.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 500, 70));
        answer.getAccessibleContext().setAccessibleName("");

        check.setBackground(new java.awt.Color(255,153,153));
        check.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/checkfbt.png"))); // NOI18N
        check.setBorder(null);
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        jPanel2.add(check, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 190, 160));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/fontlistening.png"))); // NOI18N
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 340, 60));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 80));

        speech.setBackground(new java.awt.Color(255,204,204));
        speech.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/speechbt.png"))); // NOI18N
        speech.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        speech.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                speechMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                speechMouseExited(evt);
            }
        });
        speech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speechActionPerformed(evt);
            }
        });
        jPanel3.add(speech, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 190, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/hive.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 280, 310));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EnglishForDream/yellowbeargif.gif"))); // NOI18N
        jLabel3.setText(" ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 234, 190, 160));

        choiceNum.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        choiceNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        choiceNum.setText("jLabel5");
        jPanel3.add(choiceNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 340, 360, -1));
        choiceNum.getAccessibleContext().setAccessibleName("choice");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        setVisible(false);
        new GUI_Home().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void speechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        TextToSpeech tts = new TextToSpeech();
        tts.speak((String) this.data.get(0).get(0));
        this.answer.requestFocus();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //System.out.println(this.jTextField1.getText());
        //System.out.println((String)this.dataNow.get(1));
        //System.out.println(data.get(0).get(0));

        if (this.answer.getText().trim().toLowerCase().equals(((String) this.data.get(0).get(0)).trim().toLowerCase())) {
            System.out.println("true");
            this.point++;
        } else {
            this.wrongAns.add(this.data.get(0));
        }
        
        if (this.data.size()>1) {
            this.data.remove(0);
        } else if (this.data.size() == 1) {
            this.answer.setEditable(false);
            setVisible(false);
            new GUI_Score(this.wrongAns,this.point+"/"+this.choice_total).setVisible(true);
        }
        this.choiceNum.setText((this.choice_total - this.data.size() + 1) + " out of " + this.choice_total);
        this.answer.setText(" ");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void answerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_answerKeyPressed
        //System.out.println(evt.getKeyCode());
        if (evt.getKeyCode() == 10) {
            this.checkActionPerformed(null);
        }
    }//GEN-LAST:event_answerKeyPressed

    private void speechMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speechMouseEntered
        setMouseEntered_Exited(speech, "speechover");
    }//GEN-LAST:event_speechMouseEntered

    private void speechMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_speechMouseExited
        setMouseEntered_Exited(speech, "speechbt");
    }//GEN-LAST:event_speechMouseExited
    private void setMouseEntered_Exited(JButton a, String Imagefile) {
        ImageIcon icon = new ImageIcon("src/EnglishForDream/" + Imagefile + ".png");
        a.setIcon(icon);
    }
    private void Exit() {
        setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answer;
    private javax.swing.JButton back;
    private javax.swing.JButton check;
    private javax.swing.JLabel choiceNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton speech;
    // End of variables declaration//GEN-END:variables
}
