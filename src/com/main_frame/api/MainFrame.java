package com.main_frame.api;

import com.forDoctors.entity.Seanse;
import com.fordoctor.sqlimpl.HibernateUtil;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Buy
 */
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        runningClock();
        setSeanseFromDatabaseToTable(getTodayForTable(), jTableToday);
        setSeanseFromDatabaseToTable(getDayForNextTable(), jTableNextDay);
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
        tfDate = new javax.swing.JTextField();
        jButNewPacient = new javax.swing.JButton();
        jComboTime = new javax.swing.JComboBox<>();
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
                .addContainerGap(878, Short.MAX_VALUE)
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

        forTableMainPanel.setBackground(new java.awt.Color(240, 240, 240));
        forTableMainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));

        panelTodayTable.setBackground(new java.awt.Color(204, 204, 204));
        panelTodayTable.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray));

        labelTodayDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTodayDate.setText(getTodayForTable());

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
        jScrollPaneTomorrow.setViewportView(jTableNextDay);

        labelNextDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNextDate.setText(getDayForNextTable());

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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelNewSeanse.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Pacient Family:");

        tfPacFamily.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Pacient phone:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Date:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Time:");

        tfPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButNewPacient.setText("Add seanse");
        jButNewPacient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButNewPacientActionPerformed(evt);
            }
        });

        jComboTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "10:40", "11:20", "12:00", "12:40","13:20","14:40","15:20","16:00","16:40","17:20" }));

        javax.swing.GroupLayout jPanelNewSeanseLayout = new javax.swing.GroupLayout(jPanelNewSeanse);
        jPanelNewSeanse.setLayout(jPanelNewSeanseLayout);
        jPanelNewSeanseLayout.setHorizontalGroup(
            jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewSeanseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfPacFamily)
                    .addComponent(tfPhone)
                    .addComponent(tfDate)
                    .addComponent(jComboTime, 0, 130, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButNewPacient)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelNewSeanseLayout.setVerticalGroup(
            jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewSeanseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButNewPacient)
                    .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfPacFamily, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfDate, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboTime, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        forTableMainPanelLayout.setVerticalGroup(
            forTableMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forTableMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(forTableMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTodayTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelNewSeanse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jButNewPacientActionPerformed

    private void setSeanseFromDatabaseToTable(String day, JTable table){
        
        List lis=HibernateUtil.getListBy_Date(day);
        
        if(!lis.isEmpty()){ 
            DefaultTableModel dtm= (DefaultTableModel)table.getModel();
//      Set data to JTable
            lis.forEach((ob) -> {
                Seanse s = (Seanse)ob;
                for(int i = 0;i<dtm.getRowCount();i++){
                    String tableTime = (String)dtm.getValueAt(i, 1);
                    if(tableTime.equals(s.getTime())){
                        dtm.setValueAt(s.getSDate(), i, 0);
                        dtm.setValueAt(s.getPacientName(), i, 2);
                        dtm.setValueAt(s.getPacientPhone(), i, 3);
                    }
                }
            });
        }
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

    private LocalDate getSeanseDay() {
        LocalDate day=LocalDate.now();
        DayOfWeek todayOfWeek=day.getDayOfWeek();
//        String today=LocalDate.now().getDayOfMonth()+"."+LocalDate.now().getMonthValue()+"."+LocalDate.now().getYear();
            if(todayOfWeek.equals(DayOfWeek.TUESDAY)||todayOfWeek.equals(DayOfWeek.THURSDAY)||todayOfWeek.equals(DayOfWeek.SATURDAY)){
                day = LocalDate.now();
            }else{
                if(todayOfWeek.equals(DayOfWeek.MONDAY)){
                   day = day.minusDays(2);
                }else{
                day = day.minusDays(1);
                }
            }        
        return day;
    }
    
    private String getTodayForTable(){
        String today= getSeanseDay().getDayOfMonth()+"."+getSeanseDay().getMonthValue()+"."+getSeanseDay().getYear();
        today = getSeanseDay().toString();
        return today;
    }
    
    private String getDayForNextTable(){
        String next="";
            if(LocalDate.now().getDayOfWeek().SATURDAY.equals(LocalDate.now().getDayOfWeek())){
                next = (getSeanseDay().getDayOfMonth()+3)+"."+getSeanseDay().getMonthValue()+"."+getSeanseDay().getYear();
            }else{
                next = (getSeanseDay().getDayOfMonth()+2)+"."+getSeanseDay().getMonthValue()+"."+getSeanseDay().getYear();
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
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfPacFamily;
    private javax.swing.JTextField tfPhone;
    // End of variables declaration//GEN-END:variables



}
