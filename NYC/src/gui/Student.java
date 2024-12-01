package gui;

import java.sql.Date;
import javax.swing.JOptionPane;
import model.MySQL2;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

public class Student extends javax.swing.JPanel {

    private static HashMap<String, String> studentBatchMap = new HashMap<>();
    private static HashMap<String, String> studentGenderMap = new HashMap<>();

    public Student() {
        initComponents();
        loadBatch();
        loadGender();
    }

    public void loadBatch() {

        try {
            ResultSet resultSet = MySQL2.executeSearch("SELECT *FROM `batch`");

            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("name"));
                studentBatchMap.put(resultSet.getString("name"), resultSet.getString("id"));
            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            jComboBox1.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadGender() {

        try {

            ResultSet resultSet = MySQL2.executeSearch("SELECT *FROM `gender`");

            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("gender"));
                studentGenderMap.put(resultSet.getString("gender"), resultSet.getString("id"));
            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            jComboBox2.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void loadStudents(){
    
      
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1110, 770));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabel1.setText("Student Registration");

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setText("Date Of Birth");

        jLabel5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel6.setText("Mobile");

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel7.setText("Batch");

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel8.setText("Email");

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel9.setText("Gender");

        jTextField2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jButton2.setText("Update Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jButton3.setText("Clear All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setText("NIC");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(41, 41, 41)))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField1)
                                            .addComponent(jTextField5)
                                            .addComponent(jTextField6)
                                            .addComponent(jTextField8)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );

        jTable1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Date Of Birth", "Address", "Mobile", "Email", "Batch", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel11.setText("Search :");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            String firstName = jTextField2.getText();
            String lastName = jTextField3.getText();
            String nic = jTextField4.getText();
            String dob = jTextField1.getText();
            String address = jTextField8.getText();
            String mobile = jTextField5.getText();
            String email = jTextField6.getText();
            String batch = String.valueOf(jComboBox1.getSelectedItem());
            String gender = String.valueOf(jComboBox2.getSelectedItem());

            if (firstName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your first name", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (lastName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your last name", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (nic.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your nic", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (dob.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your Date Of Birth", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (address.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your address", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (mobile.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your mobile", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!mobile.matches("^07[01245678]{1}[0-9]{7}$")) {
                JOptionPane.showMessageDialog(this, "Please enter valid mobile", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your email", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!email.matches("^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@[^-][A-Za-z0-9\\+-]+"
                    + "(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$")) {
                JOptionPane.showMessageDialog(this, "Invalid email", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (batch.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please select a gender", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (gender.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please select a type", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {

                ResultSet resultSet = MySQL2.executeSearch("SELECT * FROM `student` WHERE `email` = '" + email + "' OR  `nic` = '" + nic + "' OR `mobile`='" + mobile + "'");

                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(this, "This user already registered", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {

                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

                    MySQL2.executeIUD("INSERT INTO `employee`(`email`,`password`,`first_name`,`last_name`,`nic`,`mobile`,`date_registered`,`employee_type_id`,`gender_id`)"
                            + "VALUES('" + email + "','" + password + "','" + firstName + "','" + lastName + "','" + nic + "','" + mobile + "',"
                            + "'" + sdf.format(date) + "','" + employeeTypeMap.get(type) + "','" + employeeGenderMap.get(gender) + "')");

                    loadEmployees();
                    reset();

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String firstName = jTextField3.getText();
            String lastName = jTextField4.getText();
            String nic = jTextField5.getText();
            String mobile = jTextField6.getText();
            String password = String.valueOf(jPasswordField1.getPassword());
            String gender = String.valueOf(jComboBox1.getSelectedItem());
            String type = String.valueOf(jComboBox2.getSelectedItem());
            String email = jTextField2.getText();

            if (firstName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your first name", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (lastName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your last name", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (nic.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your nic", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (mobile.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your mobile", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!mobile.matches("^07[01245678]{1}[0-9]{7}$")) {
                JOptionPane.showMessageDialog(this, "Please enter valid mobile", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter your password", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!password.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$")) {
                JOptionPane.showMessageDialog(this, "Please enter minimum eight characters, at least one letter and one number", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (gender.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please select a gender", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (type.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please select a type", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {

                ResultSet resultSet = MySQL2.executeSearch("SELECT * FROM `employee` WHERE `nic` = '" + nic + "' OR `mobile`='" + mobile + "'");

                boolean canUpdate = false;

                if (resultSet.next()) {

                    if (!resultSet.getString("email").equals(email)) {
                        JOptionPane.showMessageDialog(this, "This Mobile number or NIC already used", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        canUpdate = true;
                    }

                } else {
                    canUpdate = true;
                }

                if (canUpdate) {

                    MySQL2.executeIUD("UPDATE `employee` SET `password` = '" + password + "', `first_name`='" + firstName + "', `last_name` = '" + lastName + "',"
                            + "`nic`='" + nic + "', `mobile`= '" + mobile + "',"
                            + "`employee_type_id` = '" + employeeTypeMap.get(type) + "',`gender_id` = '" + employeeGenderMap.get(gender) + "'"
                            + "WHERE `email` = '" + email + "'");

                    loadEmployees();
                    reset();
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jTextField2.setEditable(true);
        jTable1.clearSelection();
        reset();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int row = jTable1.getSelectedRow();

        String email = String.valueOf(jTable1.getValueAt(row, 0));
        jTextField2.setText(email);
        jTextField2.setEditable(false);

        String firstName = String.valueOf(jTable1.getValueAt(row, 1));
        jTextField3.setText(firstName);

        String lastName = String.valueOf(jTable1.getValueAt(row, 2));
        jTextField4.setText(lastName);

        String nic = String.valueOf(jTable1.getValueAt(row, 3));
        jTextField5.setText(nic);

        String mobile = String.valueOf(jTable1.getValueAt(row, 4));
        jTextField6.setText(mobile);

        String password = String.valueOf(jTable1.getValueAt(row, 5));
        jPasswordField1.setText(password);

        String gender = String.valueOf(jTable1.getValueAt(row, 6));
        jComboBox1.setSelectedItem(gender);

        String type = String.valueOf(jTable1.getValueAt(row, 7));
        jComboBox2.setSelectedItem(type);

        if (evt.getClickCount() == 2) {

            int row1 = jTable1.getSelectedRow();
            String email1 = String.valueOf(jTable1.getValueAt(row1, 0));

            AddressView addressView = new AddressView(this, true, email1);
            addressView.setVisible(true);

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
