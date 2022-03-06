
import com.sun.xml.internal.ws.api.streaming.XMLStreamWriterFactory;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.N;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class Form extends javax.swing.JFrame {

    public Form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableImport = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Import = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableTrain = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableCheck = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Check = new javax.swing.JButton();
        Train = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableTrain1 = new javax.swing.JTable();
        HuanLuyen = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        KiemTra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Hs = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NganhNghe = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Root = new javax.swing.JLabel();
        SoThich = new javax.swing.JLabel();
        KiNangMem = new javax.swing.JLabel();
        NangKhieu = new javax.swing.JLabel();
        HocLuc = new javax.swing.JLabel();
        NN = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        IG = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        Tree = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Test = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        DuDoan = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Kha = new javax.swing.JRadioButton();
        Gioi = new javax.swing.JRadioButton();
        TrungBinh = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Khong = new javax.swing.JRadioButton();
        Co = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        NghePhuHop = new javax.swing.JLabel();
        C = new javax.swing.JRadioButton();
        Java = new javax.swing.JRadioButton();
        JavaCript = new javax.swing.JRadioButton();
        Python = new javax.swing.JRadioButton();
        KhoaHoc = new javax.swing.JRadioButton();
        LuotWeb = new javax.swing.JRadioButton();
        ChoiGame = new javax.swing.JRadioButton();
        Khac = new javax.swing.JRadioButton();
        PhanTich = new javax.swing.JRadioButton();
        ThietKe = new javax.swing.JRadioButton();
        ThuyetTrinh = new javax.swing.JRadioButton();
        GiaoTiep = new javax.swing.JRadioButton();
        Khac1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        Yes = new javax.swing.JRadioButton();
        No = new javax.swing.JRadioButton();
        Pic = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableImport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numerical Order", "Academic ability ", "Interest", "Gifted", "Soft skills ", "Programming language ", "Work experience ", "Job"
            }
        ));
        jTableImport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableImportMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableImport);

        jLabel1.setText("Input Data");

        Import.setText("Import");
        Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        TableTrain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numerical Order", "Academic Ability", "Interest", "Gifted", "Soft Skill", "Programming language", "Work experience", "Job"
            }
        ));
        jScrollPane2.setViewportView(TableTrain);

        TableCheck.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numerical order", "Academic ability", "Interest", "Gifted", "Soft skills", "Programming language", "Work experience", "Job"
            }
        ));
        jScrollPane3.setViewportView(TableCheck);

        jLabel2.setText("Data Training");

        jLabel3.setText("Test Data");

        Check.setText("Check");
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });

        Train.setText("Train");
        Train.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane2)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Import, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(498, 498, 498))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(508, 508, 508)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(Check)
                        .addGap(332, 332, 332)
                        .addComponent(Train)))
                .addContainerGap(376, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Check)
                    .addComponent(Train))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Import, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data processing", jPanel1);

        TableTrain1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                " Numerical order", "Academic ability", "Interest", "Gifted", "Kỹ năng mềm", "Programming language", "Kinh Nghiệm Làm Việc", "Job"
            }
        ));
        jScrollPane4.setViewportView(TableTrain1);

        HuanLuyen.setText("Huấn Luyện Dữ Liệu");
        HuanLuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuanLuyenActionPerformed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\C4.5\\Pictures\\11.png")); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\C4.5\\Pictures\\rsz_1rsz_1312.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1043, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HuanLuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163)
                        .addComponent(jLabel20)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(HuanLuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91))))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Huấn Luyện", jPanel2);

        jTabbedPane1.addTab("Data training ", jTabbedPane2);

        KiemTra.setText("Check");
        KiemTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KiemTraActionPerformed(evt);
            }
        });

        jLabel4.setText("Information Gain");

        jLabel5.setText("H(S) =");

        jLabel6.setText("Generating or Creating Tree");

        jLabel7.setText("All attributes of dataset");

        NganhNghe.setText("........");

        jLabel8.setText("Root");

        Root.setText("........");

        SoThich.setText(".......");

        KiNangMem.setText("........");

        NangKhieu.setText(".......");

        HocLuc.setText("........");

        NN.setText(".......");

        IG.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane5.setViewportView(IG);

        Tree.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane6.setViewportView(Tree);

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\C4.5\\Pictures\\rsz_212.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NganhNghe)
                                    .addComponent(KiNangMem)
                                    .addComponent(HocLuc)
                                    .addComponent(jLabel5))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Hs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(193, 193, 193)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NangKhieu)
                                            .addComponent(SoThich)
                                            .addComponent(NN)))))
                            .addComponent(jLabel7))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(Root))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(KiemTra, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Hs, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Root))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SoThich)
                                    .addComponent(NganhNghe))
                                .addGap(83, 83, 83)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(KiNangMem)
                                    .addComponent(NangKhieu))
                                .addGap(98, 98, 98)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(HocLuc)
                                    .addComponent(NN))))
                        .addGap(10, 10, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(KiemTra, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Test Data", jPanel3);

        jTabbedPane1.addTab("Test data", jTabbedPane3);
        jTabbedPane3.getAccessibleContext().setAccessibleName("Kiểm tra dữ liệu");

        Test.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", ""
            }
        ));
        jScrollPane7.setViewportView(Test);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setText("Decision tree");

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\C4.5\\Pictures\\11.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jLabel10)
                .addGap(78, 78, 78)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(100, 100, 100))))
        );

        jTabbedPane1.addTab("Tree", jPanel5);

        DuDoan.setText("SUITABLE JOB FOR YOU");
        DuDoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DuDoanActionPerformed(evt);
            }
        });

        jLabel13.setText("Academic ability");

        Kha.setText("Good");
        Kha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KhaActionPerformed(evt);
            }
        });

        Gioi.setText("Very good");
        Gioi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GioiActionPerformed(evt);
            }
        });

        TrungBinh.setText("Ordinary");
        TrungBinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrungBinhActionPerformed(evt);
            }
        });

        jLabel14.setText("Interest");

        jLabel15.setText("Gifted");

        Khong.setText("No");
        Khong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KhongActionPerformed(evt);
            }
        });

        Co.setText("Yes");
        Co.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoActionPerformed(evt);
            }
        });

        jLabel16.setText("Soft skills");

        jLabel17.setText("Programming language");

        jLabel18.setText("Suitable profession");

        NghePhuHop.setText(".............................");

        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        Java.setText("Java");
        Java.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JavaActionPerformed(evt);
            }
        });

        JavaCript.setText("JavaScript");
        JavaCript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JavaCriptActionPerformed(evt);
            }
        });

        Python.setText("Python");
        Python.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PythonActionPerformed(evt);
            }
        });

        KhoaHoc.setText("SCIENCE");
        KhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KhoaHocActionPerformed(evt);
            }
        });

        LuotWeb.setText("Bowsing The Internet.");
        LuotWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuotWebActionPerformed(evt);
            }
        });

        ChoiGame.setText("PLAY GAMES");
        ChoiGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoiGameActionPerformed(evt);
            }
        });

        Khac.setText("OTHERS");
        Khac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KhacActionPerformed(evt);
            }
        });

        PhanTich.setText("DISSOCIATE");
        PhanTich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhanTichActionPerformed(evt);
            }
        });

        ThietKe.setText("DESIGN");
        ThietKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThietKeActionPerformed(evt);
            }
        });

        ThuyetTrinh.setText("GIVE A TALK");
        ThuyetTrinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThuyetTrinhActionPerformed(evt);
            }
        });

        GiaoTiep.setText("COMMUNICATE");
        GiaoTiep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GiaoTiepActionPerformed(evt);
            }
        });

        Khac1.setText("OTHERS");
        Khac1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Khac1ActionPerformed(evt);
            }
        });

        jLabel9.setText("Work experience");

        Yes.setText("Yes");
        Yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YesActionPerformed(evt);
            }
        });

        No.setText("No");
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });

        pic1.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\C4.5\\Pictures\\10.png")); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\C4.5\\Pictures\\10.jpg")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(KhoaHoc)
                                        .addGap(36, 36, 36)
                                        .addComponent(LuotWeb)
                                        .addGap(40, 40, 40)
                                        .addComponent(ChoiGame)
                                        .addGap(41, 41, 41)
                                        .addComponent(Khac))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(Khong)
                                        .addGap(18, 18, 18)
                                        .addComponent(Co))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Kha)
                                            .addComponent(Gioi)
                                            .addComponent(TrungBinh))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(254, 254, 254)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel17)
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(JavaCript)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(Python))
                                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(C)
                                                                .addGap(45, 45, 45)
                                                                .addComponent(Java))))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Yes)
                                                .addGap(27, 27, 27)
                                                .addComponent(No)
                                                .addGap(18, 18, 18))))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PhanTich)
                                    .addComponent(ThietKe))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ThuyetTrinh)
                                    .addComponent(GiaoTiep)))
                            .addComponent(jLabel16)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(Khac1)
                        .addGap(268, 268, 268)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(NghePhuHop))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(pic1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(DuDoan, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(KhoaHoc)
                            .addComponent(LuotWeb)
                            .addComponent(ChoiGame)
                            .addComponent(Khac))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(Khong)
                            .addComponent(Co)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C)
                            .addComponent(Java))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JavaCript)
                            .addComponent(Python)
                            .addComponent(jLabel13)
                            .addComponent(Gioi))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Kha)
                                .addGap(18, 18, 18)
                                .addComponent(TrungBinh))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(8, 8, 8)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Yes)
                                    .addComponent(No))))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhanTich)
                            .addComponent(ThuyetTrinh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ThietKe)
                            .addComponent(GiaoTiep))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Khac1)
                                    .addComponent(jLabel18)
                                    .addComponent(NghePhuHop))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                .addComponent(pic1))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DuDoan, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Choose a career", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Khac1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Khac1ActionPerformed
        if (Khac1.isSelected()) {
            ThietKe.setSelected(false);
            ThuyetTrinh.setSelected(false);
            GiaoTiep.setSelected(false);
            PhanTich.setSelected(false);
        }
    }//GEN-LAST:event_Khac1ActionPerformed

    private void GiaoTiepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GiaoTiepActionPerformed
        if (GiaoTiep.isSelected()) {
            ThietKe.setSelected(false);
            ThuyetTrinh.setSelected(false);
            PhanTich.setSelected(false);
            Khac1.setSelected(false);
        }
    }//GEN-LAST:event_GiaoTiepActionPerformed

    private void ThuyetTrinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThuyetTrinhActionPerformed
        if (ThuyetTrinh.isSelected()) {
            ThietKe.setSelected(false);
            PhanTich.setSelected(false);
            GiaoTiep.setSelected(false);
            Khac1.setSelected(false);
        }
    }//GEN-LAST:event_ThuyetTrinhActionPerformed

    private void ThietKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThietKeActionPerformed
        if (ThietKe.isSelected()) {
            PhanTich.setSelected(false);
            ThuyetTrinh.setSelected(false);
            GiaoTiep.setSelected(false);
            Khac1.setSelected(false);
        }
    }//GEN-LAST:event_ThietKeActionPerformed

    private void PhanTichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhanTichActionPerformed
        if (PhanTich.isSelected()) {
            ThietKe.setSelected(false);
            ThuyetTrinh.setSelected(false);
            GiaoTiep.setSelected(false);
            Khac1.setSelected(false);
        }
    }//GEN-LAST:event_PhanTichActionPerformed

    private void KhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhacActionPerformed
        if (Khac.isSelected()) {
            KhoaHoc.setSelected(false);
            LuotWeb.setSelected(false);
            ChoiGame.setSelected(false);
        }
    }//GEN-LAST:event_KhacActionPerformed

    private void ChoiGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoiGameActionPerformed
        if (ChoiGame.isSelected()) {
            KhoaHoc.setSelected(false);
            LuotWeb.setSelected(false);
            Khac.setSelected(false);
        }
    }//GEN-LAST:event_ChoiGameActionPerformed

    private void LuotWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuotWebActionPerformed
        if (LuotWeb.isSelected()) {
            KhoaHoc.setSelected(false);
            ChoiGame.setSelected(false);
            Khac.setSelected(false);
        }
    }//GEN-LAST:event_LuotWebActionPerformed

    private void KhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhoaHocActionPerformed
        if (KhoaHoc.isSelected()) {
            LuotWeb.setSelected(false);
            ChoiGame.setSelected(false);
            Khac.setSelected(false);
        }
    }//GEN-LAST:event_KhoaHocActionPerformed

    private void PythonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PythonActionPerformed
        if (Python.isSelected()) {
            Java.setSelected(false);
            JavaCript.setSelected(false);
            C.setSelected(false);

        }
    }//GEN-LAST:event_PythonActionPerformed

    private void JavaCriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JavaCriptActionPerformed
        if (JavaCript.isSelected()) {
            Java.setSelected(false);
            C.setSelected(false);
            Python.setSelected(false);

        }
    }//GEN-LAST:event_JavaCriptActionPerformed

    private void JavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JavaActionPerformed
        if (Java.isSelected()) {
            C.setSelected(false);
            JavaCript.setSelected(false);
            Python.setSelected(false);

        }
    }//GEN-LAST:event_JavaActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        if (C.isSelected()) {
            Java.setSelected(false);
            JavaCript.setSelected(false);
            Python.setSelected(false);

        }
    }//GEN-LAST:event_CActionPerformed

    private void CoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoActionPerformed
        if (Co.isSelected()) {
            Khong.setSelected(false);

        }
    }//GEN-LAST:event_CoActionPerformed

    private void KhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhongActionPerformed
        if (Khong.isSelected()) {
            Co.setSelected(false);

        }
    }//GEN-LAST:event_KhongActionPerformed

    private void TrungBinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrungBinhActionPerformed
        if (TrungBinh.isSelected()) {
            Kha.setSelected(false);
            Gioi.setSelected(false);
        }
    }//GEN-LAST:event_TrungBinhActionPerformed

    private void GioiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GioiActionPerformed
        if (Gioi.isSelected()) {
            Kha.setSelected(false);
            TrungBinh.setSelected(false);
        }
    }//GEN-LAST:event_GioiActionPerformed

    private void KhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhaActionPerformed
        if (Kha.isSelected()) {
            Gioi.setSelected(false);
            TrungBinh.setSelected(false);
        }
    }//GEN-LAST:event_KhaActionPerformed
    ImageIcon image1 = new ImageIcon("./Pictures/1.jpg");
    ImageIcon image2 = new ImageIcon("./Pictures/2.jpg");
    ImageIcon image3 = new ImageIcon("./Pictures/3.jpg");
    ImageIcon image4 = new ImageIcon("./Pictures/4.jpg");
    ImageIcon image5 = new ImageIcon("./Pictures/5.jpg");
    ImageIcon image6 = new ImageIcon("./Pictures/6.jpg");
    ImageIcon image7 = new ImageIcon("./Pictures/7.jpg");
    ImageIcon image8 = new ImageIcon("./Pictures/8.jpg");
    ImageIcon image9 = new ImageIcon("./Pictures/9.png");


    public void PictureFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        Pic.setText("");
    }
    private void DuDoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DuDoanActionPerformed
        if (evt.getSource() == DuDoan) {
            if (flag2 == true) {
                if (Python.isSelected()) {
                    if (KhoaHoc.isSelected()) {
                        NghePhuHop.setText("Lập Trình An Ninh Mạng");
                        Pic.setIcon(image5);
                    } else if (Khac.isSelected()) {
                        NghePhuHop.setText("Tester");
                        Pic.setIcon(image8);
                    } else if (LuotWeb.isSelected()) {
                        NghePhuHop.setText("Kỹ Sư Cầu Nối");
                        Pic.setIcon(image9);
                    } else if (ChoiGame.isSelected()) {
                        NghePhuHop.setText("Thiết Kế Game");
                        Pic.setIcon(image7);
                    }
                } else if (JavaCript.isSelected()) {
                    if (PhanTich.isSelected()) {
                        NghePhuHop.setText("Tester");
                        Pic.setIcon(image8);
                    } else if (ThietKe.isSelected()) {
                        NghePhuHop.setText("Lập Trình Game");
                        Pic.setIcon(image3);
                    } else if (ThuyetTrinh.isSelected()) {
                        NghePhuHop.setText("Tư Vấn Viên");
                        Pic.setIcon(image4);
                    } else if (GiaoTiep.isSelected()) {
                        NghePhuHop.setText("Kỹ Sư Cầu Nối");
                        Pic.setIcon(image9);
                    } else if (Khac1.isSelected()) {
                        NghePhuHop.setText("Tester");
                        Pic.setIcon(image8);
                    }
                } else if (Java.isSelected()) {
                    if (Khong.isSelected()) {
                        NghePhuHop.setText("Tester");
                        Pic.setIcon(image8);
                    } else if (Co.isSelected()) {
                        NghePhuHop.setText("Thiết Kế Game");
                        Pic.setIcon(image7);
                    }
                } else if (C.isSelected()) {
                    if (Yes.isSelected()) {
                        NghePhuHop.setText("Thiết Kế Game");
                        Pic.setIcon(image7);
                    } else if (No.isSelected()) {

                        String[] a = {"Tester", "Trí Tuệ Nhân Tạo"};
                        Random rand = new Random();
                        int ranNum = rand.nextInt(2);

                        NghePhuHop.setText(a[ranNum]);
                        if (ranNum == 1) {
                            Pic.setIcon(image1);
                        } else {
                            Pic.setIcon(image8);
                        }
                    }
                }
                if (PhanTich.isSelected() == false && ThuyetTrinh.isSelected() == false && ThietKe.isSelected() == false && GiaoTiep.isSelected() == false && Khac1.isSelected() == false && Kha.isSelected() == false && Gioi.isSelected() == false && TrungBinh.isSelected() == false && Yes.isSelected() == false && No.isSelected() == false && Khong.isSelected() == false && Co.isSelected() == false && KhoaHoc.isSelected() == false && LuotWeb.isSelected() == false && ChoiGame.isSelected() == false && Khac.isSelected() == false && C.isSelected() == false && Java.isSelected() == false && JavaCript.isSelected() == false && Python.isSelected() == false) {
                    JFrame frame = new JFrame("JOptionPane showMessageDialog fail");
                    JOptionPane.showMessageDialog(frame,
                            "No criteria selected",
                            "Notification",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (C.isSelected() == false && Java.isSelected() == false && JavaCript.isSelected() == false && Python.isSelected() == false) {
                    JFrame frame = new JFrame("JOptionPane showMessageDialog fail");
                    JOptionPane.showMessageDialog(frame,
                            "Programming language is not selected",
                            "Notification",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (KhoaHoc.isSelected() == false && LuotWeb.isSelected() == false && ChoiGame.isSelected() == false && Khac.isSelected() == false) {
                    JFrame frame = new JFrame("JOptionPane showMessageDialog fail");
                    JOptionPane.showMessageDialog(frame,
                            "Hobby is not selected",
                            "Notification",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (Khong.isSelected() == false && Co.isSelected() == false) {
                    JFrame frame = new JFrame("JOptionPane showMessageDialog fail");
                    JOptionPane.showMessageDialog(frame,
                            "Talent is not selected",
                            "Notification",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (Yes.isSelected() == false && No.isSelected() == false) {
                    JFrame frame = new JFrame("JOptionPane showMessageDialog fail");
                    JOptionPane.showMessageDialog(frame,
                            "Unselected work experience",
                            "Notification",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (Kha.isSelected() == false && Gioi.isSelected() == false && TrungBinh.isSelected() == false) {
                    JFrame frame = new JFrame("JOptionPane showMessageDialog fail");
                    JOptionPane.showMessageDialog(frame,
                            "Academic qualifications have not been selected",
                            "Notification",
                            JOptionPane.INFORMATION_MESSAGE);
                } else if (PhanTich.isSelected() == false && ThuyetTrinh.isSelected() == false && ThietKe.isSelected() == false && GiaoTiep.isSelected() == false && Khac1.isSelected() == false) {
                    JFrame frame = new JFrame("JOptionPane showMessageDialog fail");
                    JOptionPane.showMessageDialog(frame,
                            "Unselected soft skills",
                            "Notification",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JFrame frame = new JFrame("JOptionPane showMessageDialog fail");
                JOptionPane.showMessageDialog(frame,
                        "System Error",
                        "Notification",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_DuDoanActionPerformed

    private void KiemTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KiemTraActionPerformed
        if (evt.getSource() == KiemTra) {
            if (flag2 == true) {
                ID3_calculation obj = new ID3_calculation(table);
                obj.calculate_class();
                obj.calculate_attribute();
                Hs.setText(Double.toString(obj.calculate_entropy()));
                obj.information_gain();

                List<Node> node = obj.getNode();
                HashMap<String, Double> information_gain = obj.getInformationGain();
                HashMap<String, String> information_gain_subAttribute = obj.getInformationGain_of_subAttribute();

                Vector attributes = obj.getlistofAttributes();
                GenerateTree tree = new GenerateTree(attributes, node, information_gain, information_gain_subAttribute);
                tree.create_tree();
                tree.Display_attribute();
                tree.display_tree();
                IsSpace();
            } else {
                JFrame frame = new JFrame("JOptionPane showMessageDialog fail");
                JOptionPane.showMessageDialog(frame,
                        "System Error",
                        "Notification",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_KiemTraActionPerformed

    private void HuanLuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuanLuyenActionPerformed
        if (evt.getSource() == HuanLuyen) {

            if (flag == true) {
                readCSV("./Data/Data2.csv");
                JFrame frame = new JFrame("JOptionPane showMessageDialog success");
                JOptionPane.showMessageDialog(frame,
                        "Successful Training",
                        "Notification",
                        JOptionPane.INFORMATION_MESSAGE);
                flag2 = true;
            } else {
                JFrame frame = new JFrame("JOptionPane showMessageDialog fail");
                JOptionPane.showMessageDialog(frame,
                        "Fail Training",
                        "Notification",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_HuanLuyenActionPerformed

    private void TrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrainActionPerformed
        if (evt.getSource() == Train) {
            if (Dataimport == true) {
                int[] index = jTableImport.getSelectedRows();
                Object[] newRows = new Object[8];
                DefaultTableModel Import = (DefaultTableModel) jTableImport.getModel();
                DefaultTableModel Train = (DefaultTableModel) TableTrain.getModel();
                DefaultTableModel Train1 = (DefaultTableModel) TableTrain1.getModel();
                for (int i = 0; i < index.length; i++) {
                    newRows[0] = Import.getValueAt(index[i], 0);
                    newRows[1] = Import.getValueAt(index[i], 1);
                    newRows[2] = Import.getValueAt(index[i], 2);
                    newRows[3] = Import.getValueAt(index[i], 3);
                    newRows[4] = Import.getValueAt(index[i], 4);
                    newRows[5] = Import.getValueAt(index[i], 5);
                    newRows[6] = Import.getValueAt(index[i], 6);
                    newRows[7] = Import.getValueAt(index[i], 7);
                    Train.addRow(newRows);
                    Train1.addRow(newRows);
                }
                flag = true;
            } else {
                JFrame frame = new JFrame("JOptionPane showMessageDialog fail");
                JOptionPane.showMessageDialog(frame,
                        "System Error",
                        "Notification",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_TrainActionPerformed

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        if (evt.getSource() == Check) {
            if (Dataimport == true) {
                int[] index = jTableImport.getSelectedRows();
                Object[] newRows = new Object[8];
                DefaultTableModel Import = (DefaultTableModel) jTableImport.getModel();
                DefaultTableModel Check = (DefaultTableModel) TableCheck.getModel();
                for (int i = 0; i < index.length; i++) {
                    newRows[0] = Import.getValueAt(index[i], 0);
                    newRows[1] = Import.getValueAt(index[i], 1);
                    newRows[2] = Import.getValueAt(index[i], 2);
                    newRows[3] = Import.getValueAt(index[i], 3);
                    newRows[4] = Import.getValueAt(index[i], 4);
                    newRows[5] = Import.getValueAt(index[i], 5);
                    newRows[6] = Import.getValueAt(index[i], 6);
                    newRows[7] = Import.getValueAt(index[i], 7);
                    Check.addRow(newRows);
                }
            } else {
                JFrame frame = new JFrame("JOptionPane showMessageDialog fail");
                JOptionPane.showMessageDialog(frame,
                        "System Error",
                        "Notification",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_CheckActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportActionPerformed
        String filePath = "C:\\Users\\admin\\OneDrive\\Documents\\NetBeansProjects\\C4.5\\Data";
        JFileChooser file1 = new JFileChooser(filePath);

        FileNameExtensionFilter fnef = new FileNameExtensionFilter("TEXT FILES", "txt", "text");
        file1.setFileFilter(fnef);
        int excelChooser = file1.showOpenDialog(null);

        if (excelChooser == JFileChooser.APPROVE_OPTION) {
            try {
                File file = file1.getSelectedFile();
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                DefaultTableModel model = (DefaultTableModel) jTableImport.getModel();
                Object[] lines = br.lines().toArray();

                for (int i = 0; i < lines.length; i++) {
                    String[] row = lines[i].toString().split(" ");
                    model.addRow(row);
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Form.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
        Dataimport = true;
    }//GEN-LAST:event_ImportActionPerformed

    private void jTableImportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableImportMouseClicked
        int index = jTableImport.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTableImport.getModel();
        int value1 = Integer.parseInt(model.getValueAt(index, 0).toString());
        String value2 = model.getValueAt(index, 1).toString();
        String value3 = model.getValueAt(index, 2).toString();
        String value4 = model.getValueAt(index, 3).toString();
        String value5 = model.getValueAt(index, 4).toString();
        String value6 = model.getValueAt(index, 5).toString();
        String value7 = model.getValueAt(index, 6).toString();
        String value8 = model.getValueAt(index, 7).toString();
    }//GEN-LAST:event_jTableImportMouseClicked

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        if (No.isSelected()) {
            Yes.setSelected(false);

        }
    }//GEN-LAST:event_NoActionPerformed

    private void YesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YesActionPerformed
        if (Yes.isSelected()) {
            No.setSelected(false);

        }
    }//GEN-LAST:event_YesActionPerformed
    private boolean Dataimport = false;
    private boolean flag = false;
    private boolean flag2 = false;
    static Scanner in = new Scanner(System.in);
    static String[][] table = null;

    public class GenerateTree {

        Vector listofattributes;
        List<Node> node;
        HashMap<String, Double> information_gain;
        HashMap<String, String> information_gain_subAttribute;
        TreeNode treenode = new TreeNode();
        HashMap<String, List<String>> Main_Attribute = new HashMap<String, List<String>>();
        List<String> sort;

        public GenerateTree(Vector listofattributes, List<Node> node, HashMap<String, Double> information_gain, HashMap<String, String> information_gain_subAttribute) {

            this.listofattributes = listofattributes;
            this.node = node;
            this.information_gain = information_gain;
            this.information_gain_subAttribute = information_gain_subAttribute;
        }

        public void Display_attribute() {

            System.out.println("\nAll attributes of dataset\n");

            for (int i = 0; i < sort.size(); i++) {

                System.out.print((i + 1) + " " + sort.get(i) + " ");
            }
            NganhNghe.setText(1 + "  " + sort.get(0));
            SoThich.setText(2 + "  " + sort.get(1));
            KiNangMem.setText(3 + "  " + sort.get(2));
            NangKhieu.setText(4 + "  " + sort.get(3));
            HocLuc.setText(5 + "  " + sort.get(4));
            NN.setText(6 + "  " + sort.get(5));

        }

        public void create_tree() {

            System.out.println("\nGenerating or Creating Tree .... \n");
            sort = new ArrayList();
            double aa = 0;
            String loc = "";

            // for sorting , finding root
            for (int i = 0; i < information_gain.size(); i++) {

                for (String jj : information_gain.keySet()) {

                    if (!sort.contains(jj)) {

                        if (aa < information_gain.get(jj)) {

                            aa = information_gain.get(jj);
                            loc = jj;
                        }

                    }
                }

                if (!loc.equals("")) {
                    sort.add(loc);
                }

                aa = 0;
                loc = "";

            }

            System.out.println(sort);
            // get all main or sub attribute stored
            for (int i = 0; i < node.size(); i++) {

                String main = node.get(i).getAttribute();
                List<String> rel = node.get(i).getListofattribute();
                Main_Attribute.put(main, rel);

            }

            // set root
            treenode.Set_root(sort.get(0));
            int count = 1;
            // traverse and create tree
            for (int i = 0; i < sort.size() - 1; i++) {

                String parent = sort.get(i);
                List<String> rel = Main_Attribute.get(parent);
                List<String> child = new ArrayList<String>();
                // setting childs
                for (int j = 0; j < rel.size(); j++) {
                    if (this.information_gain_subAttribute.get(rel.get(j)).equals("0")) {
                        child.add(information_gain_subAttribute.get((rel.get(j) + "1")));
                    } else {
                        if (count < sort.size() - 1) {
                            child.add(sort.get(count));
                            count++;
                        } else {
                            child.add(information_gain_subAttribute.get((rel.get(j))));
                        }
                    }
                }

                treenode.add_parent_child(parent, child);
                treenode.add_relation(parent, rel);

            }

        }

        public void display_tree() {
            DefaultTableModel model = (DefaultTableModel) Tree.getModel();
            System.out.println("\n\nRoot == " + treenode.get_root() + "\n");
            Root.setText(treenode.get_root());
            System.out.println(treenode.get_root());
            model.addRow(new Object[]{treenode.get_root()});
            gofor_child(treenode.get_root(), "");

        }

        public int gofor_child(String parent, String space) {
            DefaultTableModel model = (DefaultTableModel) Tree.getModel();
            List<String> rel = treenode.getRelation(parent);
            List<String> child = treenode.getChild(parent);
            if (child == null) {
                return 0;
            } else {
                int c = rel.size();

                for (int i = 0; i < c; i++) {

                    System.out.println(space + " " + rel.get(i) + ":");//1
                    model.addRow(new Object[]{space + " " + rel.get(i) + ":"});

                    System.out.println(space + "   " + child.get(i));//3
                    model.addRow(new Object[]{space + "   " + child.get(i)});
                    if (treenode.getChild(child.get(i)) == null) {
                    } else {

                        String temp = space + "     ";//5
                        gofor_child(child.get(i), temp);
                    }

                }

            }

            return 0;
        }

    }

    public void IsSpace() {
        DefaultTableModel tree = (DefaultTableModel) Tree.getModel();
        DefaultTableModel test = (DefaultTableModel) Test.getModel();

        int start2 = 0;
        int start3 = 0;
        for (int i = 0; i < tree.getRowCount(); i++) {
            String a = (String.valueOf(tree.getValueAt(i, 0)));
            countString(a);
            System.out.println(a + " : " + countString(a));
            if (countString(a) == 0) {
                test.setValueAt(a, start2, 0);
            }
            if (countString(a) == 7 || countString(a) == 6) {

                test.setValueAt(a, start2, 3);
                start2++;
            }
            if (countString(a) == 8) {

                test.setValueAt(a, start3, 4);
                start3++;
            }
            if (countString(a) == 1) {

                test.setValueAt(a, start2, 1);

            }
            if (countString(a) == 3) {

                test.setValueAt(a, start2, 2);

            }
        }
    }

    int countString(String input) {
        int spaceCount = 0;
        for (char c : input.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        return spaceCount;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);

            }
        });
    }

    public class ID3_calculation {

        HashMap<String, Double> information_gain = new HashMap<String, Double>();
        HashMap<String, String> gain_per_subattribute = new HashMap<String, String>();
        Vector attributes = new Vector();
        Vector classification = new Vector();
        List<Node> node = new ArrayList<Node>();

        double morethan_onezero = 0.009;

        //H(S)
        double entropy = 0;

        List< List<String>> list_of_attributes = new ArrayList();
        String[][] table;

        public ID3_calculation(String[][] table) {
            this.table = table;
        }

        public List<Node> getNode() {
            return node;
        }

        public Vector getlistofAttributes() {
            return attributes;
        }

        public HashMap<String, Double> getInformationGain() {

            return information_gain;

        }

        public HashMap<String, String> getInformationGain_of_subAttribute() {

            return gain_per_subattribute;

        }

        public void calculate_attribute() {

            for (int j = 0; j < table[0].length - 1; j++) {

                if (!attributes.contains(table[0][j])) {
                    attributes.addElement(table[0][j]);
                }

            }

        }

        public void calculate_class() {

            for (int i = 1; i < table.length; i++) {

                for (int j = (table[i].length - 1); j < table[i].length; j++) {

                    if (!classification.contains(table[i][j])) {
                        classification.addElement(table[i][j]);

                    }

                }

            }

        }

        public double calculate_entropy() {

            List<Integer> total_classification_num = new ArrayList<Integer>();
            double total_entropy = 0;

            double total_rows = table.length - 1;
            int count = 0;

            // part 1 for H(S)
            for (int z = 0; z < classification.size(); z++) {

                for (int i = 1; i < table.length; i++) {

                    if (classification.get(z).toString().equals(table[i][(table[i].length - 1)])) {
                        count++;
                    }

                }
                total_classification_num.add(count);
                count = 0;

            }
            // part 2 for H(S)

            for (int z = 0; z < total_classification_num.size(); z++) {

                double ps = total_classification_num.get(z);
                double cls_entropy = -1 * ((ps / total_rows) * log(ps / total_rows, 2));
                entropy = entropy + cls_entropy;
            }

            DecimalFormat df2 = new DecimalFormat(".##");
            String change = df2.format(entropy);

            if (change.contains(",")) {
                change = change.replace(",", ".");
            }

            entropy = Double.parseDouble(change);
            System.out.println("\nH( S ) = " + entropy + "\n");
            return entropy;

        }

        public void information_gain() {

            HashMap<String, Integer> frequency;
            HashMap<String, List<String>> frequency_index;

            HashMap<String, List<classification>> classifies;

            List<HashMap<String, List<classification>>> listofclassifies = new ArrayList();

            List<HashMap<String, Integer>> listoffrequency = new ArrayList();

            List<HashMap<String, List<String>>> listoffrequency_index = new ArrayList();
            // initial values
            for (int i = 0; i < attributes.size(); i++) {

                classifies = new HashMap<String, List<classification>>();
                frequency = new HashMap<String, Integer>();

                for (int j = 1; j < table.length; j++) {

                    if (!frequency.containsKey(table[j][i])) {
                        frequency.put(table[j][i], 0);
                    }

                    if (classifies.containsKey(table[j][i])) {

                        List<classification> temp = classifies.get(table[j][i]);
                        int flag = 0;

                        for (int z = 0; z < temp.size(); z++) {

                            if (temp.get(z).getClassification_attributes().equals(table[j][table[j].length - 1])) {

                                String sub_attri = temp.get(z).getClassification_attributes();
                                int sub_attri_rep = temp.get(z).getRepetition();
                                flag = 1;
                                sub_attri_rep++;
                                temp.remove(z);
                                temp.add(new classification(sub_attri, sub_attri_rep));
                                classifies.put(table[j][i], temp);
                                break;
                            }

                        }

                        if (flag == 0) {

                            temp.add(new classification(table[j][table[j].length - 1], 1));
                            classifies.put(table[j][i], temp);

                        }

                    } else {

                        List<classification> temp = classifies.get(table[j][i]);

                        if (temp == null) {
                            temp = new ArrayList<classification>();
                            temp.add(new classification(table[j][table[j].length - 1], 1));
                            classifies.put(table[j][i], temp);

                        }

                    }

                }

                listofclassifies.add(classifies);
                listoffrequency.add(frequency);
            }

            // pre calculated
            for (int i = 0; i < attributes.size(); i++) {

                List<String> attri = new ArrayList<String>();
                frequency_index = new HashMap<String, List<String>>();
                for (int j = 1; j < table.length; j++) {

                    if (!attri.contains(table[j][i])) {
                        attri.add(table[j][i]);
                    }

                    if (listoffrequency.get(i).containsKey(table[j][i])) {

                        int count = listoffrequency.get(i).get(table[j][i]);
                        count++;
                        listoffrequency.get(i).put(table[j][i], count);
                        List<String> index = frequency_index.get(table[j][i]);
                        if (index == null) {
                            index = new ArrayList<String>();
                            index.add(table[j][table[j].length - 1]);
                            frequency_index.put(table[j][i], index);

                        } else {
                            index.add(table[j][table[j].length - 1]);
                            frequency_index.put(table[j][i], index);

                        }
                    }

                }
                listoffrequency_index.add(frequency_index);
                node.add(new Node(attributes.get(i).toString(), attri, listoffrequency.get(i), listoffrequency_index.get(i), listofclassifies.get(i)));

            }

            for (int i = 0; i < node.size(); i++) {

                for (int j = 0; j < node.get(i).getListofattribute().size(); j++) {
                    // System.out.println( node.get(i).listofattribute.get(j) +" = "+node.get(i).getFrequency().get(node.get(i).listofattribute.get(j) ));
                    // System.out.println( node.get(i).listofattribute.get(j) +" = "+node.get(i).getFrequency_index() .get(node.get(i).listofattribute.get(j) ));

                }

            }

            System.out.println("Information Gain\n");

            // calculation
            DefaultTableModel model = (DefaultTableModel) IG.getModel();
            for (int i = 0; i < attributes.size(); i++) {

                for (int j = 0; j < node.size(); j++) {

                    if (attributes.get(i).equals(node.get(j).getAttribute())) {

                        double average_entro = 0;
                        double total_rows = table.length - 1;
                        List<String> parts = node.get(j).getListofattribute();
                        // System.out.println(" "+ attributes.get(i) );
                        double[] sub1 = new double[parts.size()];
                        double[] sub2 = new double[parts.size()];
                        double sum = 0;
                        List<String> addd = new ArrayList<String>();
                        // is ma sub attributes
                        for (int z = 0; z < parts.size(); z++) {

                            double sub_total_attribute = node.get(j).getFrequency().get(parts.get(z));
                            double sum2 = 0;

                            List<classification> ty = node.get(j).getClassifies().get(parts.get(z));
                            //  System.out.println(" "+ parts.get(z) );

                            // initial value
                            int cc = ty.get(0).getRepetition();
                            String str = ty.get(0).getClassification_attributes();

                            // is ma yes no batayaga
                            for (int q = 0; q < ty.size(); q++) {

                                if (q >= 1) {
                                    if (cc == ty.get(q).getRepetition()) {
                                        if (addd.contains(ty.get(q).getClassification_attributes())) {

                                            for (int k = 0; k < ty.size(); k++) {

                                                if (addd.contains(ty.get(k).getClassification_attributes())) {

                                                } else {
                                                    //cc = ty.get(q).getRepetition();
                                                    //str = ty.get(q).getClassification_attributes();
                                                    //addd.add(str);
                                                    //System.out.println(str +" 222");
                                                    //break;
                                                }

                                            }

                                        } else {
                                            cc = ty.get(q).getRepetition();
                                            str = ty.get(q).getClassification_attributes();
                                            addd.add(str);

                                        }

                                    } else if (cc < ty.get(q).getRepetition()) {

                                        cc = ty.get(q).getRepetition();
                                        str = ty.get(q).getClassification_attributes();
                                        addd.add(str);

                                    }

                                }

                                // System.out.println( sub_total_attribute +" "+ty.get(q).getClassification_attributes() +" = "+ ty.get(q).getRepetition());
                                double nu = ty.get(q).getRepetition();
                                sum2 = sum2 + (-1 * (nu / sub_total_attribute * log(nu / sub_total_attribute, 2)));
                                //sum  = sum + (sub_total_attribute/total_rows) *  ;
                            }
                            sub1[z] = sum2;
                            sub2[z] = sub_total_attribute / total_rows;
                            //System.out.println( parts.get(z)+" "+ str  );
                            gain_per_subattribute.put(parts.get(z), str);
                            sum2 = 0;

                        }

                        for (int z = 0; z < parts.size(); z++) {
                            sum = sum + (sub1[z] * sub2[z]);
                            //System.out.println(parts.get(z)+ " "+(sub1[z] * sub2[z]) );
                            if ((sub1[z] * sub2[z]) == 0) {
                                gain_per_subattribute.put(parts.get(z) + "1", gain_per_subattribute.get(parts.get(z)));
                                gain_per_subattribute.put(parts.get(z), "0");
                            }

                            // System.out.println(parts.get(z)+" change "+ (sub1[z] * sub2[z]) );
                        }

                        DecimalFormat df2 = new DecimalFormat(".###");
                        String change = df2.format(sum);
                        if (change.contains(",")) {
                            change = change.replace(",", ".");
                        }

                        sum = Double.parseDouble(change);

                        //System.out.println("sum "+ sum);
                        // System.out.println(attributes.get(i).toString()+" sum "+ sum);
                        double gain = entropy - sum;
                        DecimalFormat df3 = new DecimalFormat(".####");
                        change = df3.format(gain);
                        if (change.contains(",")) {
                            change = change.replace(",", ".");
                        }

                        gain = Double.parseDouble(change);

                        if (gain == 0.0) {
                            gain = morethan_onezero;
                            morethan_onezero = morethan_onezero - 0.001;
                        }

                        information_gain.put(attributes.get(i).toString(), gain);
                        System.out.println(attributes.get(i).toString() + " = " + gain);
                        model.addRow(new Object[]{attributes.get(i).toString(), gain});
                        // if more than one value is 
                    }

                }

            }

            // for(String i :  gain_per_subattribute.keySet()  ){
            //     System.out.println(i +" "+gain_per_subattribute.get(i));
            //  }
        }

        double log(double x, int base) {
            return (double) (Math.log(x) / Math.log(base));
        }

    }

    public static void readCSV(String filename) {

        String csvFile = filename;
        BufferedReader br = null;
        BufferedReader pre_count = null;

        String line = "";
        String csvSplitBy = ",";

        int row = 0;
        int col = 0;

        try {
            pre_count = new BufferedReader(new FileReader(csvFile));
            while ((line = pre_count.readLine()) != null) {

                // use comma as separator
                String[] attributes = line.split(csvSplitBy);
                col = attributes.length - 1;
                row++;
            }

            // size of table
            table = new String[row][col];

            int rows = 0;

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] attributes = line.split(csvSplitBy);

                for (int i = 1; i < col + 1; i++) {
                    table[rows][i - 1] = attributes[i];

                }

                rows++;

            }

        } catch (IOException e) {
            System.out.println("File not found Exception");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("File not found Exception Finally");
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton C;
    private javax.swing.JButton Check;
    private javax.swing.JRadioButton ChoiGame;
    private javax.swing.JRadioButton Co;
    private javax.swing.JButton DuDoan;
    private javax.swing.JButton Exit;
    private javax.swing.JRadioButton GiaoTiep;
    private javax.swing.JRadioButton Gioi;
    private javax.swing.JLabel HocLuc;
    private javax.swing.JLabel Hs;
    private javax.swing.JButton HuanLuyen;
    private javax.swing.JTable IG;
    private javax.swing.JButton Import;
    private javax.swing.JRadioButton Java;
    private javax.swing.JRadioButton JavaCript;
    private javax.swing.JRadioButton Kha;
    private javax.swing.JRadioButton Khac;
    private javax.swing.JRadioButton Khac1;
    private javax.swing.JRadioButton KhoaHoc;
    private javax.swing.JRadioButton Khong;
    private javax.swing.JLabel KiNangMem;
    private javax.swing.JButton KiemTra;
    private javax.swing.JRadioButton LuotWeb;
    private javax.swing.JLabel NN;
    private javax.swing.JLabel NangKhieu;
    private javax.swing.JLabel NganhNghe;
    private javax.swing.JLabel NghePhuHop;
    private javax.swing.JRadioButton No;
    private javax.swing.JRadioButton PhanTich;
    private javax.swing.JLabel Pic;
    private javax.swing.JRadioButton Python;
    private javax.swing.JLabel Root;
    private javax.swing.JLabel SoThich;
    private javax.swing.JTable TableCheck;
    private javax.swing.JTable TableTrain;
    private javax.swing.JTable TableTrain1;
    private javax.swing.JTable Test;
    private javax.swing.JRadioButton ThietKe;
    private javax.swing.JRadioButton ThuyetTrinh;
    private javax.swing.JButton Train;
    private javax.swing.JTable Tree;
    private javax.swing.JRadioButton TrungBinh;
    private javax.swing.JRadioButton Yes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable jTableImport;
    private javax.swing.JLabel pic1;
    // End of variables declaration//GEN-END:variables
}
