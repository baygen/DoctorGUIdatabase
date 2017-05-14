package com.main_frame.api;

import com.forDoctors.entity.Seanses;
import com.fordoctor.sqlimpl.HibernateUtil;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.HibernateException;
 
/**
 *
 * @author Buy
 */
public class MainFrame extends JFrame {

    private final HibernateUtil hibUtil;
    private final SimpleDateFormat sdfDateTime= new SimpleDateFormat("yyyy-MM-dd HH:mm");
    private final SimpleDateFormat sdfDate= new SimpleDateFormat("yyyy-MM-dd");
    public String date_time;
    

    public MainFrame() {
        hibUtil = new HibernateUtil();
        initComponents();
        runningClock();
        displayDataToTables();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUp = new javax.swing.JPanel();
        labelClock = new javax.swing.JLabel();
        forTableMainPanel = new javax.swing.JPanel();
        panelTodayTable = new javax.swing.JPanel();
        labelTodayDate = new javax.swing.JLabel();
        jScrollPaneToday = new javax.swing.JScrollPane();
        jTableToday = new javax.swing.JTable();
        panelTomorrowTable = new javax.swing.JPanel();
        jScrollPaneTomorrow = new javax.swing.JScrollPane();
        jTableNextDay = new javax.swing.JTable();
        labelNextDate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanelNewSeanse = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfPacFamily = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        jButNewPacient = new javax.swing.JButton();
        jComboTime = new javax.swing.JComboBox<>();
        labResult = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        RemoveChoosen = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelUp.setBackground(new java.awt.Color(245, 245, 245));
        panelUp.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        panelUp.setToolTipText("");

        labelClock.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        javax.swing.GroupLayout panelUpLayout = new javax.swing.GroupLayout(panelUp);
        panelUp.setLayout(panelUpLayout);
        panelUpLayout.setHorizontalGroup(
            panelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelClock, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelUpLayout.setVerticalGroup(
            panelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelClock, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        forTableMainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));

        panelTodayTable.setBackground(new java.awt.Color(204, 204, 204));
        panelTodayTable.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray));

        labelTodayDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTodayDate.setText(getFormattedDate(getStartSeanseDay()));

        jTableToday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableToday.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "10:00", null, null},
                {null, "10:40", null, null},
                {null, "11:20", null, null},
                {null, "12:00", null, null},
                {null, "12:40", null, null},
                {null, "14:00", null, null},
                {null, "14:40", null, null},
                {null, "15:20", null, null},
                {null, "16:00", null, null},
                {null, "16:40", null, null},
                {null, "17:20", null, null}
            },
            new String [] {
                "Date", "Time", "Pacient Name", "Pacient Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableToday.setAlignmentX(2.0F);
        jTableToday.setAlignmentY(2.0F);
        jTableToday.setAutoscrolls(false);
        jTableToday.setRowHeight(21);
        jTableToday.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTableToday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableTodayMousePressed(evt);
            }
        });
        jScrollPaneToday.setViewportView(jTableToday);

        javax.swing.GroupLayout panelTodayTableLayout = new javax.swing.GroupLayout(panelTodayTable);
        panelTodayTable.setLayout(panelTodayTableLayout);
        panelTodayTableLayout.setHorizontalGroup(
            panelTodayTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneToday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
            .addGroup(panelTodayTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTodayDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTodayTableLayout.setVerticalGroup(
            panelTodayTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodayTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTodayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneToday, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
        );

        panelTomorrowTable.setBackground(new java.awt.Color(204, 204, 204));
        panelTomorrowTable.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray));

        jTableNextDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableNextDay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "10:00", null, null},
                {null, "10:40", null, null},
                {null, "11:20", null, null},
                {null, "12:00", null, null},
                {null, "12:40", null, null},
                {null, "14:00", null, null},
                {null, "14:40", null, null},
                {null, "15:20", null, null},
                {null, "16:00", null, null},
                {null, "16:40", null, null},
                {null, "17:20", null, null}
            },
            new String [] {
                "Date", "Time", "Pacient Name", "Pacient Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableNextDay.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableNextDay.setRowHeight(21);
        jTableNextDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableNextDayMousePressed(evt);
            }
        });
        jScrollPaneTomorrow.setViewportView(jTableNextDay);

        labelNextDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNextDate.setText(getFormattedDate(getNextTableDate()));

        javax.swing.GroupLayout panelTomorrowTableLayout = new javax.swing.GroupLayout(panelTomorrowTable);
        panelTomorrowTable.setLayout(panelTomorrowTableLayout);
        panelTomorrowTableLayout.setHorizontalGroup(
            panelTomorrowTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTomorrow)
            .addGroup(panelTomorrowTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNextDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTomorrowTableLayout.setVerticalGroup(
            panelTomorrowTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTomorrowTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTomorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        jPanelNewSeanse.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Фамілія та ім'я:");

        tfPacFamily.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfPacFamily.setPreferredSize(new java.awt.Dimension(8, 23));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Номер телефону:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Дата прийому:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Виберіть годину:");

        tfPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButNewPacient.setText("Add seanse");
        jButNewPacient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButNewPacientActionPerformed(evt);
            }
        });

        jComboTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "10:40", "11:20", "12:00", "12:40","13:20","14:40","15:20","16:00","16:40","17:20" }));

        labResult.setText("jLabel5");

        //labResult.setText(jDateChooser1.getDateFormatString());
        jDateChooser1.setDateFormatString("dd-MM-yyyy");
        jDateChooser1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);

        RemoveChoosen.setText("Remove Choosen");
        RemoveChoosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveChoosenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNewSeanseLayout = new javax.swing.GroupLayout(jPanelNewSeanse);
        jPanelNewSeanse.setLayout(jPanelNewSeanseLayout);
        jPanelNewSeanseLayout.setHorizontalGroup(
            jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewSeanseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelNewSeanseLayout.createSequentialGroup()
                        .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPhone)
                            .addComponent(tfPacFamily, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jComboTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNewSeanseLayout.createSequentialGroup()
                        .addComponent(jButNewPacient)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(RemoveChoosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelNewSeanseLayout.setVerticalGroup(
            jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewSeanseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButNewPacient)
                    .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfPacFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labResult, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveChoosen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout forTableMainPanelLayout = new javax.swing.GroupLayout(forTableMainPanel);
        forTableMainPanel.setLayout(forTableMainPanelLayout);
        forTableMainPanelLayout.setHorizontalGroup(
            forTableMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forTableMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(forTableMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelNewSeanse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(forTableMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTodayTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTomorrowTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        forTableMainPanelLayout.setVerticalGroup(
            forTableMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forTableMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(forTableMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTodayTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelNewSeanse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(forTableMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTomorrowTable, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forTableMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(forTableMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jButNewPacientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButNewPacientActionPerformed
        
       Thread thread = new Thread("Saving seanses to DB"){
            
            @Override
            public void run(){
                Seanses seans = getSeanseFromGUI();
                if(seans.getSeansesTime().before(Calendar.getInstance())){
                    JOptionPane.showMessageDialog(null, "Can't do this operation");
                }else{
                    try{
                        hibUtil.addSeanse(seans,date_time);
                        JOptionPane.showMessageDialog(null, "Seanse is created");
                                       
                    }catch(HibernateException e){
                    }finally{
                        displayDataToTables();
                    }
                }
            }
       };
       thread.start();
      
    }//GEN-LAST:event_jButNewPacientActionPerformed

    private void RemoveChoosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveChoosenActionPerformed
        int choosenIndex;
        DefaultTableModel dtm;
            if(jTableToday.getSelectedRow()!=-1){
                dtm=(DefaultTableModel)jTableToday.getModel();
                choosenIndex=jTableToday.getSelectedRow();
            }else{
                dtm=(DefaultTableModel)jTableNextDay.getModel();
                choosenIndex=jTableNextDay.getSelectedRow();
            }
        Runnable runnable = () -> {
            DateTimeFormatter dtDateTime=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDate choosenDate= LocalDate.parse((""+dtm.getValueAt(choosenIndex, 0)));
            LocalTime choosenTime= LocalTime.parse((""+dtm.getValueAt(choosenIndex, 1)));
            
            LocalDateTime locDT=LocalDateTime.of(choosenDate, choosenTime);
            String dateTime=locDT.format(dtDateTime);
            hibUtil.removeByDate(dateTime);
            
            dtm.setValueAt(null, choosenIndex, 0);
            dtm.setValueAt(null, choosenIndex, 2);
            dtm.setValueAt(null, choosenIndex, 3);

            JOptionPane.showMessageDialog(null, "Deleted");
        };
        new Thread(runnable).start();
        
    }//GEN-LAST:event_RemoveChoosenActionPerformed

    private void jTableTodayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTodayMousePressed
        if(jTableNextDay.getSelectedRows().length>0){
            jTableNextDay.clearSelection();
        }
    }//GEN-LAST:event_jTableTodayMousePressed

    private void jTableNextDayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNextDayMousePressed
        
        if(jTableToday.getSelectedRows().length>0){
            jTableToday.clearSelection();
        }
    }//GEN-LAST:event_jTableNextDayMousePressed

    private String getStringDateFromCalendar(Calendar cal){
        
        return cal.get(Calendar.YEAR)+"-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DAY_OF_MONTH);
    }
    private void setSeanseFromDatabaseToTable(LocalDate date, JTable table){
//        LocalDateTime ldt= LocalDateTime.now();
//        ldt.
        String day=date.format(DateTimeFormatter.ISO_LOCAL_DATE);
                
        List lis=HibernateUtil.getListBy_Date(day);
            
            if(!lis.isEmpty()){ 
                DefaultTableModel dtm = (DefaultTableModel)table.getModel();
//              Set data to JTable
                lis.forEach((ob) -> {
                    Seanses s = (Seanses)ob;
                    String min=""+s.getSeansesTime().get(Calendar.MINUTE);
                        if(min.equals("0")){
                            min="00";
                        }
                    String sqlTime=s.getSeansesTime().get(Calendar.HOUR_OF_DAY)+":"+min;
                    for(int i = 0;i<dtm.getRowCount();i++){
                        String tableTime = (String)dtm.getValueAt(i, 1);
                        LocalDateTime ldt=LocalDateTime.ofInstant(s.getSeansesTime().toInstant(),ZoneId.systemDefault());
                            if(tableTime.equals(sqlTime)){
                                dtm.setValueAt(getFormattedDate(ldt.toLocalDate()), i, 0);
                                dtm.setValueAt(s.getPacientName(), i, 2);
                                dtm.setValueAt(s.getPacientPhone(), i, 3);
                            }
                    }
                });
            }
    }
    
    private void displayDataToTables(){
        setSeanseFromDatabaseToTable(getStartSeanseDay(), jTableToday);
        setSeanseFromDatabaseToTable(getNextTableDate(), jTableNextDay);
    }
    
    private void runningClock() {
        
        Thread thr = new Thread("clock"){
            private LocalTime getCurTime;
            
            @Override
            public void run(){
                for(;;){
                    getCurTime = LocalTime.now();
                    int minute =getCurTime.getMinute();
                    int secons = getCurTime.getSecond();
                    String mins =""+minute;
                    String sec = ""+secons;
                        if(minute<10){
                            mins = "0"+minute;
                        }
                        if(secons<10){
                            sec = "0"+secons;
                        }
                    labelClock.setText(getCurTime.getHour()+":"+mins+":"+sec);  

                }
            }   
        };
        thr.start();
    }

    public static LocalDate getStartSeanseDay() {
        LocalDate day;
        DayOfWeek todayOfWeek=LocalDate.now().getDayOfWeek();

            if(todayOfWeek.equals(DayOfWeek.TUESDAY)||todayOfWeek.equals(DayOfWeek.THURSDAY)||todayOfWeek.equals(DayOfWeek.SATURDAY)){
                day = LocalDate.now();
            }else{
                if(todayOfWeek.equals(DayOfWeek.SUNDAY)){
                   day = LocalDate.now().plusDays(2);
                }else{
                day = LocalDate.now().plusDays(1);
                }
            }        
        return day;
    }
    
    private String getFormattedDate(LocalDate date){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return date.format(dtf);
    }
    
    public static LocalDate getNextTableDate(){
        LocalDate next;
            if(DayOfWeek.SATURDAY.equals(LocalDate.now().getDayOfWeek())){
                next = getStartSeanseDay().plusDays(3);
            }else{
                next = getStartSeanseDay().plusDays(2);
            }
        return next;
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
                    
    }
    
    private Seanses getSeanseFromGUI() {
        Seanses seanse=null;
        try{
            
            if(!tfPacFamily.getText().trim().equals("")&&jDateChooser1.getDate()!=null){
                
                int id;
                List<?> list= hibUtil.getAllSeanse();
                System.out.println(""+list.size()+" null : "+list.isEmpty());
                
                if(!list.isEmpty()){
                    id = list.size()+1;
                    for(Object ob:list){
                        int count=0;
                        Seanses sea=(Seanses)ob;
                        if(id==sea.getSeansesID()){
                            count++;
                        }
                        id=id+count+1;
                    }
                }else{
                    id=1;                
                }
                System.out.println("id = "+id);

                date_time= sdfDate.format(jDateChooser1.getDate())+" "+jComboTime.getSelectedItem();
                sdfDateTime.parse(date_time);
                
                Calendar cal=sdfDateTime.getCalendar();
                seanse= new Seanses(cal, id,tfPacFamily.getText());
                seanse.setPacientPhone(tfPhone.getText());
            }else{
                JOptionPane.showMessageDialog(null, "Field can't be empty");
            }
        }catch(NullPointerException | HeadlessException | ParseException e){
            
        }
        return seanse;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RemoveChoosen;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel forTableMainPanel;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButNewPacient;
    private javax.swing.JComboBox<String> jComboTime;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelNewSeanse;
    private javax.swing.JScrollPane jScrollPaneToday;
    private javax.swing.JScrollPane jScrollPaneTomorrow;
    private javax.swing.JTable jTableNextDay;
    private javax.swing.JTable jTableToday;
    private javax.swing.JLabel labResult;
    private javax.swing.JLabel labelClock;
    private javax.swing.JLabel labelNextDate;
    private javax.swing.JLabel labelTodayDate;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JPanel panelTodayTable;
    private javax.swing.JPanel panelTomorrowTable;
    private javax.swing.JPanel panelUp;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextField tfPacFamily;
    private javax.swing.JTextField tfPhone;
    // End of variables declaration//GEN-END:variables

  
}
