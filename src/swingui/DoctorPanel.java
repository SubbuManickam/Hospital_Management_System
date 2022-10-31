/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swingui;

import entity.Doctor;
import entity.DoctorDirectory;
import entity.Encounter;
import entity.EncouterHistory;
import entity.Hospital;
import entity.HospitalDirectory;
import entity.Patient;
import entity.PatientDirectory;
import entity.VitalSigns;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class DoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorPanel
     */
    PatientDirectory patientDirectory;
    EncouterHistory encouterHistory;
    DoctorDirectory doctorDirectory;

    public DoctorPanel(PatientDirectory patientDirectory, EncouterHistory encouterHistory, DoctorDirectory doctorDirectory) {
        initComponents();

        this.patientDirectory = patientDirectory;
        this.encouterHistory = encouterHistory;
        this.doctorDirectory = doctorDirectory;

        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);

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
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Enter Unique ID of Doctor:");

        jLabel2.setText("Enter Unique ID of Patient:");

        jLabel4.setText("Patient Gender:");

        jLabel5.setText("Patient Blood Group:");

        jLabel3.setText("Patient Name:");

        jLabel8.setText("Patient Community:");

        jLabel9.setText("Patient Age:");

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Encounter Date", "Patient Name", "Blood Pressure", "Breathing", "Pulse", "Temperature", "Doctor Name"
            }
        )
        {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        }
    );
    jScrollPane3.setViewportView(jTable1);

    jLabel6.setText("Enter New Vital Signs Record");

    jLabel10.setText("Encounter Date:");

    jLabel11.setText("Blood Pressure:");

    jLabel12.setText("Breathing:");

    jLabel13.setText("Pulse:");

    jLabel14.setText("Temperature:");

    jButton2.setText("Create");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(272, 272, 272)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(29, 29, 29)
                            .addComponent(jButton1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(87, 87, 87)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(jLabel9)
                                    .addGap(30, 30, 30))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(0, 62, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3)))
            .addContainerGap())
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel6)
            .addGap(395, 395, 395))
        .addGroup(layout.createSequentialGroup()
            .addGap(357, 357, 357)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14)
                        .addComponent(jLabel13)
                        .addComponent(jLabel12)
                        .addComponent(jLabel11)
                        .addComponent(jLabel10))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField7)
                        .addComponent(jTextField10)
                        .addComponent(jTextField11)
                        .addComponent(jTextField12)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(45, 45, 45)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1))
            .addGap(36, 36, 36)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(32, 32, 32)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jLabel6)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel10)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel14)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(80, Short.MAX_VALUE))
    );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            int patientId = Integer.parseInt(jTextField2.getText());

            Patient patient = patientDirectory.viewData(patientId);

            if (patient != null) {
                jTextField9.setText(patient.getPerson().getName());
                jTextField3.setText(String.valueOf(patient.getPerson().getAge()));
                jTextField4.setText(patient.getPerson().getGender());
                jTextField5.setText(patient.getBloodGroup());
                jTextField8.setText(String.valueOf(patient.getPerson().getHouse().getCommunity().getCommunityName()));

                showEncounterData();
            } else {
                JOptionPane.showMessageDialog(this, "Patient ID doesn't exist. Enter correct Patient ID");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter valid Patient ID");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            Encounter newEncounter = new Encounter();
            VitalSigns newVitalSigns = new VitalSigns();

            int patientId = Integer.parseInt(jTextField2.getText());
            Patient patient = patientDirectory.viewData(patientId);

            int doctorId = Integer.parseInt(jTextField1.getText());
            Doctor doctor = doctorDirectory.viewData(doctorId);

            if (patient != null && doctor != null) {
                newVitalSigns.setBloodPressure(jTextField10.getText());
                newVitalSigns.setBreathing(Integer.parseInt(jTextField11.getText()));
                newVitalSigns.setPulse(Integer.parseInt(jTextField12.getText()));
                newVitalSigns.setTemperature(Float.parseFloat(jTextField13.getText()));

                newEncounter.setDate(LocalDate.parse(jTextField7.getText()));
                newEncounter.setDoctor(doctor);
                newEncounter.setPatient(patient);
                newEncounter.setVitalSigns(newVitalSigns);

                encouterHistory.addEncounter(newEncounter);

                JOptionPane.showMessageDialog(this, "Encounter added successfully for patient " + patient.getPerson().getName());

                showEncounterData();
                jTextField7.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jTextField12.setText("");
                jTextField13.setText("");
            
            } else {
                
                JOptionPane.showMessageDialog(this, "Enter valid Doctor and Patient IDs");
                jTextField7.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jTextField12.setText("");
                jTextField13.setText("");
            }
        } catch (NumberFormatException | DateTimeParseException e) {
            
            JOptionPane.showMessageDialog(this, "Enter valid inputs");
            jTextField7.setText("");
            jTextField10.setText("");
            jTextField11.setText("");
            jTextField12.setText("");
            jTextField13.setText("");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void showEncounterData() {

        int patientId = Integer.parseInt(jTextField2.getText());
        ArrayList<Encounter> encounterHistory = encouterHistory.getEncounterData(patientId);

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        if (encounterHistory != null) {
            for (Encounter encounter : encounterHistory) {

                Object[] newRow = new Object[7];
                newRow[0] = encounter.getDate();
                newRow[1] = encounter;
                newRow[2] = encounter.getVitalSigns().getBloodPressure();
                newRow[3] = encounter.getVitalSigns().getBreathing();
                newRow[4] = encounter.getVitalSigns().getPulse();
                newRow[5] = encounter.getVitalSigns().getTemperature();
                newRow[6] = encounter.getDoctor().getPerson().getName();

                model.addRow(newRow);
            }
        }
    }
}
