/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager.ui;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import manager.control.RegisterModuleControl;
import manager.entity.RegisterModuleEntity;

/**
 *
 * @author Dell
 */
public class RegisterModulePanel extends javax.swing.JPanel {
    private String mssv;
    private RegisterModuleControl registerModuleControl;
    private ArrayList<RegisterModuleEntity> dataTable = new ArrayList<RegisterModuleEntity>();

    /**
     * Creates new form RegisterModulePanel
     */
    public RegisterModulePanel() {
        initComponents();
        initRegisterModuleTable();
    }

    public void reset() {
        statusLabel.setText(null);
        semesterComboBox.removeAllItems();
        moduleCodeTextField.setText("");
    }
    
    public RegisterModulePanel(String mssv) {
        this.mssv = mssv;
        registerModuleControl = new RegisterModuleControl();
        initComponents();
        tableHeader.setText("Bảng đăng ký học phần kỳ 20172 của sinh viên " + mssv);
        initRegisterModuleTable();
    }

    public void addSemesterList() {
        List<String> semesterList = registerModuleControl.getSemesterList();
        for (String semester : semesterList) {
            semesterComboBox.addItem(semester);
        }
        semesterComboBox.setSelectedIndex(0);
    }

    public void initRegisterModuleTable() {
        JTableHeader header = registerTable.getTableHeader();
        header.setOpaque(false);
        header.setBackground(new Color(72, 3, 111));
        header.setForeground(Color.white);
        header.setFont(new java.awt.Font("SansSerif", 1, 14));
        registerModuleScroll.getViewport().setBackground(Color.WHITE);
        Border border = BorderFactory.createEmptyBorder(0, 0, 0, 0);
        registerModuleScroll.setViewportBorder(border);
        registerModuleScroll.setBorder(border);
        TableColumn tc = registerTable.getColumnModel().getColumn(5);
        tc.setHeaderRenderer(new HeaderRenderer(header, 5));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        termLabel = new javax.swing.JLabel();
        curriculumnLabel = new javax.swing.JLabel();
        moduleCodeLabel = new javax.swing.JLabel();
        moduleCodeTextField = new javax.swing.JTextField();
        tableHeader = new javax.swing.JLabel();
        sumLabel = new javax.swing.JLabel();
        registerButton = new manager.ui.ButtonLabel(new java.awt.Color(85,55,118), null);
        removeButton = new manager.ui.ButtonLabel(new java.awt.Color(85,55,118), null);
        sendButton = new manager.ui.ButtonLabel(new java.awt.Color(85,55,118), null);
        registerModuleScroll = new javax.swing.JScrollPane();
        registerTable = new javax.swing.JTable();
        semesterComboBox = new javax.swing.JComboBox<>();
        statusLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1020, 565));

        headerPanel.setBackground(new java.awt.Color(110, 89, 222));
        headerPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 13));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đăng ký học phần");
        headerPanel.add(jLabel1);

        termLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        termLabel.setForeground(new java.awt.Color(54, 33, 89));
        termLabel.setText("Học kỳ:");

        curriculumnLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        curriculumnLabel.setForeground(new java.awt.Color(54, 33, 89));
        curriculumnLabel.setText("Học chương trình:");

        moduleCodeLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        moduleCodeLabel.setForeground(new java.awt.Color(54, 33, 89));
        moduleCodeLabel.setText("Mã học phần đăng ký:");

        moduleCodeTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        moduleCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moduleCodeTextFieldActionPerformed(evt);
            }
        });

        tableHeader.setBackground(new java.awt.Color(255, 255, 255));
        tableHeader.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        tableHeader.setForeground(new java.awt.Color(54, 33, 89));
        tableHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tableHeader.setText("Bảng đăng ký học phần kỳ 20172 của sinh viên ");

        sumLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        sumLabel.setForeground(new java.awt.Color(54, 33, 89));
        sumLabel.setText("Tổng số TC đăng ký = 0");

        registerButton.setBackground(new java.awt.Color(64, 43, 100));
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registerButton.setText("Đăng ký");
        registerButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        registerButton.setOpaque(true);
        registerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                registerButtonMousePressed(evt);
            }
        });

        removeButton.setBackground(new java.awt.Color(64, 43, 100));
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        removeButton.setText("Xóa các HP chọn");
        removeButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        removeButton.setOpaque(true);
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                removeButtonMousePressed(evt);
            }
        });

        sendButton.setBackground(new java.awt.Color(64, 43, 100));
        sendButton.setForeground(new java.awt.Color(255, 255, 255));
        sendButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sendButton.setText("Gửi đăng ký");
        sendButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        sendButton.setOpaque(true);
        sendButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sendButtonMousePressed(evt);
            }
        });

        registerModuleScroll.setBorder(null);

        registerTable.setAutoCreateRowSorter(true);
        registerTable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        registerTable.setForeground(new java.awt.Color(54, 33, 89));
        registerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HP", "Tên HP", "Ngày đăng ký", "TT đăng ký", "Số TC", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        registerTable.setGridColor(new java.awt.Color(204, 204, 255));
        registerModuleScroll.setViewportView(registerTable);
        if (registerTable.getColumnModel().getColumnCount() > 0) {
            registerTable.getColumnModel().getColumn(0).setResizable(false);
            registerTable.getColumnModel().getColumn(1).setResizable(false);
            registerTable.getColumnModel().getColumn(2).setResizable(false);
            registerTable.getColumnModel().getColumn(3).setResizable(false);
            registerTable.getColumnModel().getColumn(4).setResizable(false);
            registerTable.getColumnModel().getColumn(5).setResizable(false);
        }

        semesterComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        semesterComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                semesterComboBoxItemStateChanged(evt);
            }
        });

        statusLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(termLabel)
                        .addGap(18, 18, 18)
                        .addComponent(semesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(curriculumnLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(moduleCodeLabel)
                                .addGap(18, 18, 18)
                                .addComponent(moduleCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(165, Short.MAX_VALUE))
            .addComponent(tableHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(registerModuleScroll, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(termLabel)
                    .addComponent(curriculumnLabel)
                    .addComponent(semesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moduleCodeLabel)
                            .addComponent(moduleCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sumLabel)
                            .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(tableHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerModuleScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void moduleCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moduleCodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_moduleCodeTextFieldActionPerformed

    private void displayModuleList(String semester) {
        List<RegisterModuleEntity> resultList = registerModuleControl.getRegisteredModule(mssv, semester);

        for (int i = 0; i < resultList.size(); i++) {
            addModule(resultList.get(i));
            registerTable.getModel().setValueAt("Thành công", i, 3);
        }
    }

    public int getSum() {
        int sum = 0;
        for (RegisterModuleEntity module : dataTable) {
            sum += module.getTinChi();
        }
        return sum;
    }

    public void addModule(RegisterModuleEntity module) {
        TableModel model = registerTable.getModel();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        ((DefaultTableModel) model).addRow(new Object[]{module.getMaHp(), module.getTenHp(),
            dateFormat.format(module.getNgayDk()), null, module.getTinChi()});
        dataTable.add(module);
        sumLabel.setText("Tổng số TC đăng ký = " + getSum());
    }

    public boolean checkModuleExist(String moduleCode) {
        for (RegisterModuleEntity module : dataTable) {
            if (module.getMaHp().equals(moduleCode)) {
                return true;
            }
        }
        return false;
    }

    private void registerButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonMousePressed
        String moduleCode = moduleCodeTextField.getText();
        if (moduleCode.matches("^[a-zA-Z]{1,}\\d{1,}$")) {
            if (!checkModuleExist(moduleCode)) {
                String status = registerModuleControl.checkModuleConstraint(moduleCode, mssv);
                if (status.equals("")) {
                    RegisterModuleEntity module = registerModuleControl.getModule(moduleCode);
                    if (module == null) {
                        statusLabel.setText("Mã học phần không tồn tại.");
                        return;
                    }
                    module.setMssv(mssv);
                    module.setHocKy(semesterComboBox.getItemAt(semesterComboBox.getSelectedIndex()));
                    addModule(module);
                } else {
                    statusLabel.setForeground(Color.red);
                    statusLabel.setText(status);
                }
            } else {
                statusLabel.setForeground(Color.red);
                statusLabel.setText("Mã học phần đã tồn tại.");
            }
        } else {
            statusLabel.setForeground(Color.red);
            statusLabel.setText("Không phải mã học phần.");
        }
    }//GEN-LAST:event_registerButtonMousePressed

    private void sendButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendButtonMousePressed
        int n = dataTable.size();
        if (n > 0) {
            registerModuleControl.removeOldRegister(mssv, dataTable.get(0).getHocKy());
        }

        for (int i = 0; i < n; i++) {
            if (registerModuleControl.registerModule(dataTable.get(i))) {
                registerTable.getModel().setValueAt("Thành công", i, 3);
            }
        }
    }//GEN-LAST:event_sendButtonMousePressed

    private void removeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMousePressed
        TableModel model = registerTable.getModel();
        int rowCount = model.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            Boolean check = (Boolean) model.getValueAt(i, 5);
            if (check != null && check == true) {
                ((DefaultTableModel) model).removeRow(i);
                dataTable.remove(i);
                i--;
                rowCount--;
                sumLabel.setText("Tổng số TC đăng ký = " + getSum());
            }
        }
    }//GEN-LAST:event_removeButtonMousePressed

    private void resetTable() {
        dataTable.clear();
        DefaultTableModel dm = (DefaultTableModel) registerTable.getModel();
        int rowCount = dm.getRowCount();

        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }

    private void semesterComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_semesterComboBoxItemStateChanged
        resetTable();
        displayModuleList(semesterComboBox.getItemAt(semesterComboBox.getSelectedIndex()));
    }//GEN-LAST:event_semesterComboBoxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel curriculumnLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel moduleCodeLabel;
    private javax.swing.JTextField moduleCodeTextField;
    private manager.ui.ButtonLabel registerButton;
    private javax.swing.JScrollPane registerModuleScroll;
    private javax.swing.JTable registerTable;
    private manager.ui.ButtonLabel removeButton;
    private javax.swing.JComboBox<String> semesterComboBox;
    private manager.ui.ButtonLabel sendButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel sumLabel;
    private javax.swing.JLabel tableHeader;
    private javax.swing.JLabel termLabel;
    // End of variables declaration//GEN-END:variables
}
