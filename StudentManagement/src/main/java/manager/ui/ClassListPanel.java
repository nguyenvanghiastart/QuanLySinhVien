/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager.ui;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import manager.control.ClassListControl;
import manager.entity.ClassListEntity;

/**
 *
 * @author Dell
 */
public class ClassListPanel extends javax.swing.JPanel {
    private ClassListControl classListControl;
    private String className;

    /**
     * Creates new form ClassList
     */
    public ClassListPanel() {
        classListControl = new ClassListControl();
        initComponents();
        initTable();
    }
    
    public void initTable() {
        pagination.setVisible(false);
        JTableHeader header = classListTable.getTableHeader();
        header.setOpaque(false);
        header.setBackground(new Color(72, 3, 111));
        header.setForeground(Color.white);
        header.setFont(new java.awt.Font("SansSerif", 1, 14));
        classListScroll.getViewport().setBackground(Color.WHITE);
        Border border = BorderFactory.createEmptyBorder( 0, 0, 0, 0 );
        classListScroll.setViewportBorder(border);
        classListScroll.setBorder(border);
    }
    
    public void reset() {
        classComboBox.removeAllItems();
        termComboBox.removeAllItems();
        facultyComboBox.removeAllItems();
        studentCodeTextField.setText(null);
        studentNameTextField.setText(null);
        DefaultTableModel dm = (DefaultTableModel) classListTable.getModel();
        int rowCount = dm.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
    }
    
    private void displayClassList(List resultList, int firstResult) {
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        tableHeaders.add("Mã SV");
        tableHeaders.add("Họ");
        tableHeaders.add("Đệm");
        tableHeaders.add("Tên");
        tableHeaders.add("Tên lớp");
        
        for (int i = 0; i < resultList.size(); i++) {
            ClassListEntity student = (ClassListEntity) resultList.get(i);
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(student.getMssv());
            oneRow.add(student.getHo());
            oneRow.add(student.getDem());
            oneRow.add(student.getTen());
            oneRow.add(student.getTenLop());
            tableData.add(oneRow);
        }
        classListTable.setModel(new DefaultTableModel(tableData, tableHeaders));
    }
    
    public void addTermComboBox() {
        List<String> classList = classListControl.getTermList();
        for (String clas : classList) {
            termComboBox.addItem(clas);
        }
        termComboBox.setSelectedIndex(0);
    }
    
    public void addFacultyComboBox() {
        List<String> facultyList = classListControl.getFacultyList();
        for (String faculty : facultyList) {
            facultyComboBox.addItem(faculty);
        }
        facultyComboBox.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchClassList = new javax.swing.JPanel();
        termLabel = new javax.swing.JLabel();
        facultyLabel = new javax.swing.JLabel();
        classNameLabel = new javax.swing.JLabel();
        studentNameTextField = new javax.swing.JTextField();
        studentNameLabel = new javax.swing.JLabel();
        studentCodeTextField = new javax.swing.JTextField();
        studentCodeLabel = new javax.swing.JLabel();
        termComboBox = new javax.swing.JComboBox<>();
        facultyComboBox = new javax.swing.JComboBox<>();
        classComboBox = new javax.swing.JComboBox<>();
        tableClassList = new javax.swing.JPanel();
        pagination = new manager.ui.Pagination(new Table() {
            public void displayData(int firstResult) {
                List resultList = classListControl.getClassList(className, firstResult);
                displayClassList(resultList, firstResult);
            }
        });
        classListScroll = new javax.swing.JScrollPane();
        classListTable = new javax.swing.JTable();
        headerClassList = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(54, 33, 89));
        setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(1020, 565));

        searchClassList.setBackground(new java.awt.Color(255, 255, 255));
        searchClassList.setForeground(new java.awt.Color(54, 33, 89));
        searchClassList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        termLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        termLabel.setForeground(new java.awt.Color(54, 33, 89));
        termLabel.setText("Khóa học:");

        facultyLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        facultyLabel.setForeground(new java.awt.Color(54, 33, 89));
        facultyLabel.setText("Khoa/viện:");

        classNameLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        classNameLabel.setForeground(new java.awt.Color(54, 33, 89));
        classNameLabel.setText("Lớp sinh viên:");

        studentNameTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        studentNameTextField.setForeground(new java.awt.Color(54, 33, 89));
        studentNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                studentNameTextFieldKeyPressed(evt);
            }
        });

        studentNameLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        studentNameLabel.setForeground(new java.awt.Color(54, 33, 89));
        studentNameLabel.setText("hoặc tên sinh viên:");

        studentCodeTextField.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        studentCodeTextField.setForeground(new java.awt.Color(54, 33, 89));
        studentCodeTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                studentCodeTextFieldKeyPressed(evt);
            }
        });

        studentCodeLabel.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        studentCodeLabel.setForeground(new java.awt.Color(54, 33, 89));
        studentCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        studentCodeLabel.setText("hoặc mã sinh viên:");

        termComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        termComboBox.setForeground(new java.awt.Color(54, 33, 89));
        termComboBox.setBorder(null);
        termComboBox.setEditor(null);
        termComboBox.setOpaque(false);
        termComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                termComboBoxItemStateChanged(evt);
            }
        });

        facultyComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        facultyComboBox.setForeground(new java.awt.Color(54, 33, 89));
        facultyComboBox.setOpaque(false);
        facultyComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                facultyComboBoxItemStateChanged(evt);
            }
        });
        facultyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyComboBoxActionPerformed(evt);
            }
        });

        classComboBox.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        classComboBox.setForeground(new java.awt.Color(54, 33, 89));
        classComboBox.setOpaque(false);
        classComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout searchClassListLayout = new javax.swing.GroupLayout(searchClassList);
        searchClassList.setLayout(searchClassListLayout);
        searchClassListLayout.setHorizontalGroup(
            searchClassListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchClassListLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(termLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(termComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(searchClassListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classNameLabel)
                    .addGroup(searchClassListLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(facultyLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchClassListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(searchClassListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentNameLabel)
                    .addComponent(studentCodeLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(searchClassListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studentCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        searchClassListLayout.setVerticalGroup(
            searchClassListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchClassListLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(searchClassListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchClassListLayout.createSequentialGroup()
                        .addComponent(facultyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(classNameLabel))
                    .addGroup(searchClassListLayout.createSequentialGroup()
                        .addGroup(searchClassListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(termLabel)
                            .addComponent(termComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentNameLabel)
                            .addComponent(studentNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(searchClassListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(studentCodeLabel)
                            .addComponent(studentCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(classComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        tableClassList.setBackground(new java.awt.Color(255, 255, 255));

        pagination.setOpaque(false);

        classListScroll.setBackground(new java.awt.Color(255, 255, 255));
        classListScroll.setBorder(null);
        classListScroll.setForeground(new java.awt.Color(54, 33, 89));
        classListScroll.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        classListScroll.setOpaque(false);

        classListTable.setAutoCreateRowSorter(true);
        classListTable.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        classListTable.setForeground(new java.awt.Color(54, 33, 89));
        classListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Họ", "Đệm", "Tên", "Ngày sinh", "Tên lớp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        classListTable.setGridColor(new java.awt.Color(204, 204, 255));
        classListTable.setOpaque(false);
        classListTable.setSelectionBackground(new java.awt.Color(110, 89, 222));
        classListScroll.setViewportView(classListTable);

        javax.swing.GroupLayout tableClassListLayout = new javax.swing.GroupLayout(tableClassList);
        tableClassList.setLayout(tableClassListLayout);
        tableClassListLayout.setHorizontalGroup(
            tableClassListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(classListScroll)
            .addGroup(tableClassListLayout.createSequentialGroup()
                .addComponent(pagination, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tableClassListLayout.setVerticalGroup(
            tableClassListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableClassListLayout.createSequentialGroup()
                .addComponent(classListScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pagination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        headerClassList.setBackground(new java.awt.Color(110, 89, 222));
        headerClassList.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 13));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Danh sách lớp sinh viên");
        headerClassList.add(jLabel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(searchClassList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(headerClassList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tableClassList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerClassList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(searchClassList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tableClassList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
            
    private void termComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_termComboBoxItemStateChanged
        classComboBox.removeAllItems();
        List<String> nameList = classListControl.getClassNameList(
                termComboBox.getItemAt(termComboBox.getSelectedIndex()),
                facultyComboBox.getItemAt(facultyComboBox.getSelectedIndex()));
        for (String name : nameList) {
            classComboBox.addItem(name);
        }
    }//GEN-LAST:event_termComboBoxItemStateChanged

    private void facultyComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_facultyComboBoxItemStateChanged
        classComboBox.removeAllItems();
        List<String> nameList = classListControl.getClassNameList(
                termComboBox.getItemAt(termComboBox.getSelectedIndex()),
                facultyComboBox.getItemAt(facultyComboBox.getSelectedIndex()));
        for (String name : nameList) {
            classComboBox.addItem(name);
        }
    }//GEN-LAST:event_facultyComboBoxItemStateChanged

    private void classComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classComboBoxItemStateChanged
        className = classComboBox.getItemAt(classComboBox.getSelectedIndex());
        classListControl.setTotalByClass(className);
        classListControl.setMaxResult(20);
        int size = classListControl.getTotalByClass();
        pagination.setSize(size);
        pagination.setTable(new Table() {
            public void displayData(int firstResult) {
                List resultList = classListControl.getClassList(className, firstResult);
                displayClassList(resultList, firstResult);
            }
        });
        List resultList = classListControl.getClassList(className, 0);
        displayClassList(resultList, 0);
        if (size < 20) {
            pagination.setVisible(false);
        } else {
            pagination.setVisible(true);
        }
    }//GEN-LAST:event_classComboBoxItemStateChanged

    private void facultyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_facultyComboBoxActionPerformed

    private void studentNameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentNameTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String studentName = studentNameTextField.getText();
            classListControl.setTotalByStudentName(studentName);
            classListControl.setMaxResult(20);
            int size = classListControl.getTotalByStudentName();
            pagination.setSize(size);
            List resultList = classListControl.getListByStudentName(studentName, 0);
            displayClassList(resultList, 0);
            if (size < 20) {
                pagination.setVisible(false);
            } else {
                pagination.setVisible(true);
            }
            pagination.setTable(new Table() {
                public void displayData(int firstResult) {
                    List resultList = classListControl.getListByStudentName(studentName, firstResult);
                    displayClassList(resultList, firstResult);
                }
            });
        }
    }//GEN-LAST:event_studentNameTextFieldKeyPressed

    private void studentCodeTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentCodeTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String studentCode = studentCodeTextField.getText();
            List resultList = classListControl.getListByStudentCode(studentCode);
            displayClassList(resultList, 0);
            pagination.setVisible(false);
        }
    }//GEN-LAST:event_studentCodeTextFieldKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> classComboBox;
    private javax.swing.JScrollPane classListScroll;
    private javax.swing.JTable classListTable;
    private javax.swing.JLabel classNameLabel;
    private javax.swing.JComboBox<String> facultyComboBox;
    private javax.swing.JLabel facultyLabel;
    private javax.swing.JPanel headerClassList;
    private javax.swing.JLabel jLabel1;
    private manager.ui.Pagination pagination;
    private javax.swing.JPanel searchClassList;
    private javax.swing.JLabel studentCodeLabel;
    private javax.swing.JTextField studentCodeTextField;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JTextField studentNameTextField;
    private javax.swing.JPanel tableClassList;
    private javax.swing.JComboBox<String> termComboBox;
    private javax.swing.JLabel termLabel;
    // End of variables declaration//GEN-END:variables
}
