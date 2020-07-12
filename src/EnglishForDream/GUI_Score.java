/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnglishForDream;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
/**
 *
 * @author ptmna
 */
public class GUI_Score extends javax.swing.JFrame {

    /**
     * Creates new form GUI_score
     */
   public GUI_Score(ArrayList<ArrayList<Object>> wrongAns, String point) {
        setUndecorated(true); 
        initComponents();
        System.out.println("result: "+isUndecorated());      
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        String text = "";
        for (int i = 0; i < wrongAns.size(); i++) {
            text = text + wrongAns.get(i).get(0) + " - " + wrongAns.get(i).get(1) + "\n";
        }
        this.wrongWordArea.setText(text);
        this.scoreText.setText("Your Score: " + point);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ToMainMenu = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        scoreText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        wrongWordArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Wrong word : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 370, 40));

        ToMainMenu.setText("Main Menu");
        ToMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToMainMenuActionPerformed(evt);
            }
        });
        jPanel1.add(ToMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 100, 70));

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 100, 70));

        scoreText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        scoreText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreText.setText("Your Score");
        jPanel1.add(scoreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 270, 50));

        wrongWordArea.setEditable(false);
        wrongWordArea.setColumns(20);
        wrongWordArea.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        wrongWordArea.setRows(5);
        jScrollPane1.setViewportView(wrongWordArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 270, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToMainMenuActionPerformed
        setVisible(false);
        new GUI_Home().setVisible(true);
    }//GEN-LAST:event_ToMainMenuActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(1);
    }//GEN-LAST:event_exitActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ToMainMenu;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel scoreText;
    private javax.swing.JTextArea wrongWordArea;
    // End of variables declaration//GEN-END:variables
}
