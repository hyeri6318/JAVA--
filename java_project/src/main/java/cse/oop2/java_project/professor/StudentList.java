/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.java_project.professor;

import cse.oop2.java_project.professor.ProfessorPage;
import static cse.oop2.java_project.professor.ProfessorPage.lecture_num;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 이혜리, 정민수
 */
public class StudentList extends javax.swing.JFrame {

    /**
     * Creates new form StudentList
     */
    public StudentList() {
        initComponents();
    }
    
    String URL = null;
    public StudentList(String URL) {
        initComponents();
        setTitle("교수 - 학생 명단 조회");
        this.URL = URL + "\\stcourse.txt";
    }

    // 강좌 일치 비교
    
    ArrayList<String> num_list = new ArrayList<>();

    private boolean CourseCompare() {
        try {
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader(URL));

            Path path = Paths.get(URL);
            Charset cs = StandardCharsets.UTF_8;

            ArrayList<String> list = new ArrayList<>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);

            ArrayList<String> list_temp = new ArrayList<>();

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");
                num_list.add((temp[2])); // 강좌번호
            }

            for (int i = 0; i < num_list.size(); i++) {
                if (ProfessorPage.lecture_num.equals(num_list.get(i))) {                    
                    return true;
                }
            }

            is.close();
        } catch (Exception ex) {
            ex.getStackTrace();
        }
        return false;
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
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BUTT_Close = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "학번", "이름"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("학생명단");

        BUTT_Close.setText("닫기");
        BUTT_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTT_CloseActionPerformed(evt);
            }
        });

        jButton1.setText("조회");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 584, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BUTT_Close)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(BUTT_Close)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUTT_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTT_CloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_BUTT_CloseActionPerformed

    private boolean CompareName(String[] cmp_temp) {

        String[] cmp = cmp_temp;

        try {

            for (int j = 0; j < jTable1.getRowCount(); j++) {
                if (cmp[0].equals(jTable1.getValueAt(j, 0).toString()) && cmp[1].equals(jTable1.getValueAt(j, 1).toString())) {
                    return false;
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return true;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // 교수 첫번째 페이지에서 클릭한 강좌번호와 stcourse에 저장되어있는 강좌번호가 일치하는 조건 추가
        String filePath = URL;
        File file = new File(filePath);

        try {
            BufferedReader read = new BufferedReader(new FileReader(file));
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            // 텍스트파일에서 한 줄씩 읽어옴.
            Object[] tableline = read.lines().toArray();

            if (CourseCompare()) {

                for (int i = 0; i < tableline.length; i++) {
                    if (ProfessorPage.lecture_num.equals(num_list.get(i))) {
                        String line = tableline[i].toString().trim();
                        String[] dataRow = line.split("/");
                        ArrayList arr = new ArrayList<>();

                        if (jTable1.getRowCount() == 0) {
                            arr.add(dataRow[0]);
                            arr.add(dataRow[1]);

                            model.addRow(new Object[]{arr.get(0), arr.get(1)});
                        } else {
                            if (CompareName(dataRow)) {
                                arr.add(dataRow[0]);
                                arr.add(dataRow[1]);

                                model.addRow(new Object[]{arr.get(0), arr.get(1)});
                            }
                        }
                    }

                }

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTT_Close;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
