/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.userProfiles.Student;
import utils.Manager;

/**
 *
 * @author nehadevarapalli
 */
public class StudentDashboardJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentDashboardJPanel
     */
    
    private JPanel workArea;
    private Student s;
    private Manager m;
    
    public StudentDashboardJPanel(JPanel workArea, Student s, Manager m) {
        initComponents();
        this.workArea = workArea;
        this.s = s;
        s.toString();
        this.m = m;
        if (s.getSelectedDegree() == null) {
            btnDegreeAudit.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnStuProfile = new javax.swing.JButton();
        btnTranscript = new javax.swing.JButton();
        btnCourses = new javax.swing.JButton();
        btnDegreeAudit = new javax.swing.JButton();
        btnFindAJob = new javax.swing.JButton();
        btnProfessorReview = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Student Dashboard");

        splitPane.setDividerLocation(30);
        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnStuProfile.setText("My Profile");
        btnStuProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStuProfileActionPerformed(evt);
            }
        });

        btnTranscript.setText("Transcript");
        btnTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTranscriptActionPerformed(evt);
            }
        });

        btnCourses.setText("Courses");
        btnCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoursesActionPerformed(evt);
            }
        });

        btnDegreeAudit.setText("Degree Audit");
        btnDegreeAudit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDegreeAuditActionPerformed(evt);
            }
        });

        btnFindAJob.setText("Find a Job");

        btnProfessorReview.setText("Professor Review");
        btnProfessorReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfessorReviewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnStuProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTranscript)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCourses)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDegreeAudit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFindAJob)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProfessorReview)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCourses, btnDegreeAudit, btnFindAJob, btnProfessorReview, btnTranscript});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStuProfile)
                    .addComponent(btnTranscript)
                    .addComponent(btnCourses)
                    .addComponent(btnDegreeAudit)
                    .addComponent(btnFindAJob)
                    .addComponent(btnProfessorReview))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCourses, btnDegreeAudit, btnFindAJob, btnProfessorReview, btnStuProfile, btnTranscript});

        splitPane.setTopComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 828, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(jPanel2);

        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 828, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLogOut)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnLogOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(splitPane)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoursesActionPerformed
        // TODO add your handling code here:
        StudentCourseJPanel coursePanel = new StudentCourseJPanel(s, m);
        splitPane.setBottomComponent(coursePanel);
    }//GEN-LAST:event_btnCoursesActionPerformed

    private void btnStuProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStuProfileActionPerformed
        // TODO add your handling code here:
        StudentProfileJPanel studentProfilePanel = new StudentProfileJPanel();
        splitPane.setBottomComponent(studentProfilePanel);
    }//GEN-LAST:event_btnStuProfileActionPerformed

    private void btnTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTranscriptActionPerformed
        // TODO add your handling code here:
        TranscriptJPanel transcriptPanel = new TranscriptJPanel();
        splitPane.setBottomComponent(transcriptPanel);
    }//GEN-LAST:event_btnTranscriptActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnDegreeAuditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDegreeAuditActionPerformed
        // TODO add your handling code here:
        DegreeAuditJPanel auditPanel = new DegreeAuditJPanel(s, m);
        splitPane.setBottomComponent(auditPanel);
    }//GEN-LAST:event_btnDegreeAuditActionPerformed

    private void btnProfessorReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfessorReviewActionPerformed
        // TODO add your handling code here:
        StudentReviewJPanel reviewPanel = new StudentReviewJPanel(s, m);
        splitPane.setBottomComponent(reviewPanel);
    }//GEN-LAST:event_btnProfessorReviewActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourses;
    private javax.swing.JButton btnDegreeAudit;
    private javax.swing.JButton btnFindAJob;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnProfessorReview;
    private javax.swing.JButton btnStuProfile;
    private javax.swing.JButton btnTranscript;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
