/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.oop2.java_project.student;

import cse.oop2.java_project.professor.*;
import cse.oop2.java_project.login.LoginPage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 *
 * @author 배강훈
 */
public class PasswordChangeS extends javax.swing.JFrame {

    /**
     * Creates new form PasswordChange
     */
    public PasswordChangeS() {
        initComponents();
        setTitle("비밀번호 변경");
    }

    String URL = null;
    String Num = null;
    String name = null;

    public PasswordChangeS(String url) {
        JOptionPane.showMessageDialog(null, "학번 또는 아이디 값을 받지 못했습니다.", "에러", JOptionPane.ERROR_MESSAGE);
    }

    public PasswordChangeS(String url, String num) { //URL은 파일 경로, num은 ID 값
        initComponents();
        setTitle("비밀번호 변경");
        this.Num = num;
        if (url.contains("\\student.txt")) {
            URL = url.replaceAll("\\student.txt", "");
            URL = URL + "\\student.txt";
        } else {
            URL = url + "\\student.txt";
        }
        LoginID.setText(Num);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BUTT_Back = new javax.swing.JButton();
        BUTT_Close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ButtChange = new javax.swing.JButton();
        Input_CurrentPw = new javax.swing.JTextField();
        Input_NewPw = new javax.swing.JTextField();
        LoginID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BUTT_Back.setText("돌아가기");
        BUTT_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTT_BackActionPerformed(evt);
            }
        });

        BUTT_Close.setText("종료");
        BUTT_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTT_CloseActionPerformed(evt);
            }
        });

        jLabel1.setText("현재 비밀번호 변경");

        jLabel2.setText("현재 비밀번호");

        jLabel3.setText("새 비밀번호");

        ButtChange.setText("비밀번호 변경");
        ButtChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtChangeActionPerformed(evt);
            }
        });

        Input_NewPw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Input_NewPwActionPerformed(evt);
            }
        });

        LoginID.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Input_CurrentPw)
                            .addComponent(Input_NewPw)
                            .addComponent(LoginID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BUTT_Back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BUTT_Close)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LoginID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Input_CurrentPw)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Input_NewPw, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(ButtChange)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUTT_Back)
                    .addComponent(BUTT_Close))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ArrayList<String> jumin_list = new ArrayList<String>(); // 주민등록번호 리스트
    ArrayList<String> name_list = new ArrayList<String>(); // 이름 리스트
    ArrayList<String> num_list = new ArrayList<String>(); // 학번 리스트
    ArrayList<String> major_list = new ArrayList<String>(); // 학과 리스트
    ArrayList<String> password_list = new ArrayList<String>(); // 비밀번호 리스트
    ArrayList<String> edit_pw_list = new ArrayList<String>(); // 변경된 비밀번호

    int count = 0;

    private boolean CurrentPasswordCompare(String URL) {
        System.out.println(URL);
        try {
            String[] array = null;
            BufferedReader is = new BufferedReader(new FileReader(URL));

            Path path = Paths.get(URL);
            Charset cs = StandardCharsets.UTF_8;
            ArrayList<String> list = new ArrayList<String>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);

            ArrayList<String> list_temp = new ArrayList<String>(); // 임시 저장
            ArrayList<String> id_list = new ArrayList<String>(); // id_list
            ArrayList<String> pw_list_temp = new ArrayList<String>(); // 주민등록번호 앞 뒤 모두 저장
            ArrayList<String> pw_list = new ArrayList<String>(); // 초기 비밀번호로 사용하는 주민등록번호 뒷자리를 -로 구분하여 저장

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");
                id_list.add(temp[0]); // 학번
                pw_list_temp.add(temp[1]); // 주민등록번호
                if (temp.length == 5) {
                    edit_pw_list.add(temp[4]); // 변경된 비밀번호
                } else {
                    edit_pw_list.add(null);
                }
            }

            for (String i : pw_list_temp) {
                String[] temp = i.split("-");
                pw_list.add(temp[1]); // 초기 비밀번호 주민등록번호 뒷자리 저장
            }

            int check = 0; // 현재 비밀번호가 맞는지 확인하는 변수
            for (int i = 0; i < id_list.size(); i++) {
                if (edit_pw_list.get(i) == null) {
                    if (Input_CurrentPw.getText().equals(pw_list.get(i)) && Num.equals(id_list.get(i))) {
                        check = -1; // 비밀번호가 맞았을 때 함수
                        count = i;
                        is.close();
                        return true;
                    }
                } else {
                    if (Input_CurrentPw.getText().equals(edit_pw_list.get(i)) && Num.equals(id_list.get(i))) {
                        check = -1; // 비밀번호가 맞았을 때 함수
                        count = i;
                        is.close();
                        return true;
                    }
                }
            }
            if (check == 0) {
                JOptionPane.showMessageDialog(null, "비밀번호가 잘못 입력 되었습니다.", "잘못된 비밀번호", JOptionPane.ERROR_MESSAGE);
                Input_CurrentPw.setText(null);
                Input_NewPw.setText(null);
                is.close();
                return false;
            }
        } catch (IOException ex) {
            System.out.println("Error");
            JOptionPane.showMessageDialog(null, "CurrentPasswordCompare에서 에러", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    private void ReadFile() {
        try {
            String[] array = null;

            BufferedReader is = new BufferedReader(new FileReader(URL));

            Path path = Paths.get(URL);
            Charset cs = StandardCharsets.UTF_8;
            ArrayList<String> list = new ArrayList<String>();
            list = (ArrayList<String>) Files.readAllLines(path, cs);
            ArrayList<String> list_temp = new ArrayList<String>(); // 임시 저장
            is.close();

            for (String i : list) {
                array = i.split("\n");
                list_temp.add(array[0]);
            }

            for (String i : list_temp) {
                String[] temp = i.split("/");

                num_list.add(temp[0]);
                jumin_list.add(temp[1]);
                major_list.add(temp[2]);
                name_list.add(temp[3]);
                if (temp.length == 5) {
                    password_list.add(temp[4]); // 변경된 비밀번호
                } else {
                    password_list.add("");
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ReadFile에서 에러", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void EditFile() {
        try {
            File file = new File(URL);
            FileWriter writer;
            writer = new FileWriter(file, false);
            for (int i = 0; i < name_list.size(); i++) {
                String s = "/";
                String n = "\n";
                writer.write(num_list.get(i));
                writer.write(s);
                writer.write(jumin_list.get(i));
                writer.write(s);
                writer.write(major_list.get(i));
                writer.write(s);
                writer.write(name_list.get(i));

                if (password_list.get(i) == null) {
                    writer.write("");
                } else {
                    writer.write(s);
                    writer.write(password_list.get(i));
                }
                writer.write(n);

                writer.flush();// 출력은 버퍼에 쌓여있기에 쌓인 버퍼를 목적지로 보내줌
            }
            writer.close();

            jumin_list.clear();
            num_list.clear();
            major_list.clear();
            name_list.clear();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "EditFile에서 에러", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void BUTT_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTT_BackActionPerformed
        // TODO add your handling code here:
        StudentPage back = new StudentPage(URL, name, Num);
        back.setVisible(true);
        dispose();
    }//GEN-LAST:event_BUTT_BackActionPerformed

    private void BUTT_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTT_CloseActionPerformed
        // TODO add your handling code here:
        int goExit = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
        if (goExit == JOptionPane.CLOSED_OPTION) {

        } else if (goExit == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }

    }//GEN-LAST:event_BUTT_CloseActionPerformed

    private void ButtChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtChangeActionPerformed
        // TODO add your handling code here:
        boolean check = false;
        if (Input_NewPw.getText().equals("")) {
            System.out.println("NewPw is null");
            JOptionPane.showMessageDialog(null, "새 비밀번호가 입력되지 않았습니다.", "Error", JOptionPane.ERROR_MESSAGE);
            check = false;
        } else {
            check = CurrentPasswordCompare(URL);
        }
        if (check) {
            ReadFile();

            for (int i = 0; i < name_list.size(); i++) {
                password_list.set(i, edit_pw_list.get(i));
            }

            password_list.set(count, Input_NewPw.getText());
            name = name_list.get(count);

            EditFile();
            JOptionPane.showMessageDialog(null, "비밀번호 변경이 완료되었습니다.", "성공", JOptionPane.INFORMATION_MESSAGE);
            StudentPage back = new StudentPage(URL.replaceAll("\\student.txt", ""), name, Num);
            back.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "비밀번호 변경을 실패하였습니다.");
        }
    }//GEN-LAST:event_ButtChangeActionPerformed

    private void Input_NewPwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Input_NewPwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Input_NewPwActionPerformed

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
            java.util.logging.Logger.getLogger(PasswordChangeS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordChangeS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordChangeS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordChangeS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordChangeS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTT_Back;
    private javax.swing.JButton BUTT_Close;
    private javax.swing.JButton ButtChange;
    public javax.swing.JTextField Input_CurrentPw;
    public javax.swing.JTextField Input_NewPw;
    private javax.swing.JLabel LoginID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
