/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.text.editor;

import java.awt.Font;

/**
 *
 * @author manoj
 */
public class Simple_Text_Editor extends javax.swing.JFrame {

    /**
     * Creates new form Simple_Text_Editor
     */
    public Simple_Text_Editor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        T1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        L1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        L2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        L3 = new javax.swing.JList<>();
        APPLY = new javax.swing.JButton();
        C1 = new javax.swing.JColorChooser();
        COLOUR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIMPLE TEXT EDITOR");

        L1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FONT\n", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        L1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        L1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "TIMES NEW ROMAN", "SCRIPT MT BOLD", "MONOTYPE CORSIVA", " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        L1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(L1);

        L2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "STYLE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        L2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        L2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "PLAIN", "BOLD ", "ITALIC", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        L2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(L2);

        L3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SIZE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        L3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        L3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "SIZE 12", "SIZE 14", "SIZE 16", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        L3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(L3);

        APPLY.setText("APPLY");
        APPLY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                APPLYActionPerformed(evt);
            }
        });

        COLOUR.setText("CHANGE COLOUR");
        COLOUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COLOURActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(COLOUR, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(APPLY, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(345, 345, 345))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(APPLY)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(COLOUR, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T1ActionPerformed

    private void APPLYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_APPLYActionPerformed
        // TODO add your handling code here:
        int a = L1.getSelectedIndex();
        int b = L2.getSelectedIndex();
        int c = L3.getSelectedIndex();
       
        if (a==0 & b==0 & c==0)
          {T1.setFont(new Font ("Times New Roman", Font.PLAIN, 12));}
        if (a==0 & b==0 & c==1)
          {T1.setFont(new Font ("Times New Roman", Font.PLAIN, 14));}
        if (a==0 & b==0 & c==2)
          {T1.setFont(new Font ("Times New Roman", Font.PLAIN, 16));}
      
        if (a==0 & b==1 & c==0)
          {T1.setFont(new Font ("Times New Roman", Font.BOLD, 12));}
        if (a==0 & b==1 & c==1)
          {T1.setFont(new Font ("Times New Roman", Font.BOLD, 14));}
        if (a==0 & b==1 & c==2)
          {T1.setFont(new Font ("Times New Roman", Font.BOLD, 16));}
     
         if (a==0 & b==2 & c==0)
          {T1.setFont(new Font ("Times New Roman", Font.ITALIC, 12));}
        if (a==0 & b==2 & c==1)
          {T1.setFont(new Font ("Times New Roman", Font.ITALIC, 14));}
        if (a==0 & b==2 & c==2)
          {T1.setFont(new Font ("Times New Roman", Font.ITALIC, 16));}
        
         if (a==1 & b==0 & c==0)
          {T1.setFont(new Font ("Script MT Bold", Font.BOLD, 12));}
        if (a==1 & b==0 & c==1)
          {T1.setFont(new Font ("Script MT Bold", Font.PLAIN, 14));}
        if (a==1 & b==0 & c==2)
          {T1.setFont(new Font ("Script MT Bold", Font.PLAIN, 16));}
      
        if (a==1 & b==1 & c==0)
          {T1.setFont(new Font ("Script MT Bold", Font.BOLD, 12));}
        if (a==1 & b==1 & c==1)
          {T1.setFont(new Font ("Script MT Bold", Font.BOLD, 14));}
        if (a==1 & b==1 & c==2)
          {T1.setFont(new Font ("Script MT Bold", Font.BOLD, 16));}
     
         if (a==01& b==2 & c==0)
          {T1.setFont(new Font ("Script MT Bold", Font.ITALIC, 12));}
        if (a==1 & b==2 & c==1)
          {T1.setFont(new Font ("Script MT Bold", Font.ITALIC, 14));}
        if (a==1 & b==2 & c==2)
          {T1.setFont(new Font ("Script MT Bold", Font.ITALIC, 16));}
        
         if (a==2 & b==0 & c==0)
          {T1.setFont(new Font ("Monotype Corsiva", Font.PLAIN, 12));}
        if (a==2 & b==0 & c==1)
          {T1.setFont(new Font ("Monotype Corsiva", Font.PLAIN, 14));}
        if (a==2 & b==0 & c==2)
          {T1.setFont(new Font ("Monotype Corsiva", Font.PLAIN, 16));}
      
        if (a==2 & b==1 & c==0)
          {T1.setFont(new Font ("Monotype Corsiva", Font.BOLD, 12));}
        if (a==2 & b==1 & c==1)
          {T1.setFont(new Font ("Monotype Corsiva", Font.BOLD, 14));}
        if (a==2 & b==1 & c==2)
          {T1.setFont(new Font ("Monotype Corsiva", Font.BOLD, 16));}
     
         if (a==2 & b==2 & c==0)
          {T1.setFont(new Font ("Monotype Corsiva", Font.ITALIC, 12));}
        if (a==2 & b==2 & c==1)
          {T1.setFont(new Font ("Monotype Corsiva", Font.ITALIC, 14));}
        if (a==2 & b==2 & c==2)
          {T1.setFont(new Font ("Monotype Corsiva", Font.ITALIC, 16));}
                
        
        
    }//GEN-LAST:event_APPLYActionPerformed

    private void COLOURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COLOURActionPerformed
        // TODO add your handling code here:
        T1.setForeground(C1.getColor());
    }//GEN-LAST:event_COLOURActionPerformed

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
            java.util.logging.Logger.getLogger(Simple_Text_Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simple_Text_Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simple_Text_Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simple_Text_Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simple_Text_Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton APPLY;
    private javax.swing.JColorChooser C1;
    private javax.swing.JButton COLOUR;
    private javax.swing.JList<String> L1;
    private javax.swing.JList<String> L2;
    private javax.swing.JList<String> L3;
    private javax.swing.JTextField T1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
