package view;

import Classes.ChiTietHDN;
import Classes.ChiTietHDX;
import Classes.DonVi;
import Classes.HDXuat;
import Classes.Kho;
import Classes.SanPham;
import Classes.HDNhap;
import Controller.KhoGUI;

import Controller.NhapGUI;
import Controller.XuatGUI;
import CustomTable.CustomTable_Nhap;
import CustomTable.CustomTable_Xuat;
import CustomTable.CustomTable_kho;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TrangChu extends java.awt.Frame {

    public TrangChu() throws Exception {
        initComponents();
        jlbAccName.setText(DangNhap.name);
        lockHD(true);
        lockSP(false);
        lockHDN(true);
        lockSPN(false);
        loadKho();
        loadXuat();
        loadNhap();
        clearHDX();
        clearHDN();

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home = new javax.swing.JTabbedPane();
        formXuat = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jtngayxuat = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jtmaHDX = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jtmaspxuat = new javax.swing.JTextField();
        jttenspxuat = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtthongsoxuat = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtsoluongxuat = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jtgiaxuat = new javax.swing.JTextField();
        jtmausacxuat = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jtmadvxuat = new javax.swing.JTextField();
        jttendvxuat = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtdiachixuat = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jtsodtxuat = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jtemailxuat = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jtSoSPX = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jbtnXoa = new javax.swing.JButton();
        jbtnSuaXuat = new javax.swing.JButton();
        jjbtnXuat = new javax.swing.JButton();
        jbtnNhapSP = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblOut = new javax.swing.JTable();
        jcbxLock = new javax.swing.JCheckBox();
        formNhap = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblIn = new javax.swing.JTable();
        aaaa = new javax.swing.JPanel();
        jbtnSuaHDN = new javax.swing.JButton();
        jbtnNhap = new javax.swing.JButton();
        jbtnXoaHD = new javax.swing.JButton();
        jbtnNhapSPN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtmaspnhap = new javax.swing.JTextField();
        jttenspnhap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtthongsonhap = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtsoluongnhap = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtmausacnhap = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtgianhap = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtmadvnhap = new javax.swing.JTextField();
        jttendvnhap = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtdiachinhap = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtsodtnhap = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtemailnhap = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jtSlSPN = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jtngaynhap = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jtfMaHD = new javax.swing.JTextField();
        jcbxLockNhap = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblKho = new javax.swing.JTable();
        jcbSearch = new javax.swing.JCheckBox();
        jbtnThemKho = new javax.swing.JButton();
        jbtnSuaKhoa = new javax.swing.JButton();
        jbtnReloadKho = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jtmaspkho = new javax.swing.JTextField();
        jttenspkho = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jtmausackho = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jtthongsokho = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jtXuLy = new javax.swing.JTextField();
        jtTinhTrang = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jsSoNgayTon = new javax.swing.JSpinner();
        jsSoLuongTon = new javax.swing.JSpinner();
        jsSoLuongXL = new javax.swing.JSpinner();
        jsChietKhau = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jbtnLogout = new javax.swing.JButton();
        jlbAccName = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setToolTipText("Nhập");
        Home.setAutoscrolls(true);
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        formXuat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Ngày xuất:");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 20));
        jPanel6.add(jtngayxuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 147, -1));

        jLabel26.setText("Mã hoá đơn:");
        jLabel26.setToolTipText("");
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 80, 20));

        jtmaHDX.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtmaHDXFocusLost(evt);
            }
        });
        jPanel6.add(jtmaHDX, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 110, -1));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Sản phẩm"));
        jPanel8.setToolTipText("Đơn vị nhập");

        jLabel15.setText("Mã SP");

        jtmaspxuat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtmaspxuatFocusLost(evt);
            }
        });

        jLabel16.setText("Tên SP");

        jLabel17.setText("Thông số");

        jLabel18.setText("Số lượng xuất");

        jLabel19.setText("Màu sắc");

        jLabel20.setText("Giá xuất");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtmaspxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtthongsoxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jttenspxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtsoluongxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtmausacxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtgiaxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtmaspxuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jttenspxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19)
                                .addComponent(jtmausacxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtthongsoxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17))
                            .addComponent(jLabel18)
                            .addComponent(jtsoluongxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtgiaxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Đơn vị nhập"));
        jPanel9.setToolTipText("");

        jLabel21.setText("Mã DV");

        jtmadvxuat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtmadvxuatFocusLost(evt);
            }
        });

        jLabel22.setText("Tên DV");

        jLabel23.setText("Địa chỉ");

        jLabel24.setText("Số DT");

        jLabel25.setText("Email");

        jLabel33.setText("Số SP");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtdiachixuat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtmadvxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jttendvxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel25))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jtsodtxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel33)))
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtemailxuat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtSoSPX, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtmadvxuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jttendvxuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtemailxuat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel23)
                    .addComponent(jtdiachixuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jtsodtxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtSoSPX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setLayout(new java.awt.GridBagLayout());

        jbtnXoa.setText("Xoá");
        jbtnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXoaActionPerformed(evt);
            }
        });

        jbtnSuaXuat.setText("Sửa");
        jbtnSuaXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSuaXuatActionPerformed(evt);
            }
        });

        jjbtnXuat.setText("Xuất");
        jjbtnXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jjbtnXuatActionPerformed(evt);
            }
        });

        jbtnNhapSP.setText("Nhập SP");
        jbtnNhapSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnNhapSPMouseClicked(evt);
            }
        });
        jbtnNhapSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNhapSPActionPerformed(evt);
            }
        });

        jtblOut.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtblOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblOutMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtblOut);

        jcbxLock.setText("Lock");
        jcbxLock.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbxLockItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout formXuatLayout = new javax.swing.GroupLayout(formXuat);
        formXuat.setLayout(formXuatLayout);
        formXuatLayout.setHorizontalGroup(
            formXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formXuatLayout.createSequentialGroup()
                .addGroup(formXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formXuatLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(formXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(formXuatLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formXuatLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formXuatLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jcbxLock))
                    .addGroup(formXuatLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jbtnNhapSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jjbtnXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jbtnSuaXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        formXuatLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbtnNhapSP, jbtnSuaXuat, jbtnXoa, jjbtnXuat});

        formXuatLayout.setVerticalGroup(
            formXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formXuatLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(formXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(formXuatLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formXuatLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbxLock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(formXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnNhapSP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnSuaXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jjbtnXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        formXuatLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbtnSuaXuat, jbtnXoa, jjbtnXuat});

        Home.addTab("Xuât", formXuat);

        formNhap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblIn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtblIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblInMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblIn);

        jbtnSuaHDN.setText("Sửa");
        jbtnSuaHDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSuaHDNActionPerformed(evt);
            }
        });

        jbtnNhap.setText("Nhập");
        jbtnNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNhapActionPerformed(evt);
            }
        });

        jbtnXoaHD.setText("Xoá");
        jbtnXoaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnXoaHDActionPerformed(evt);
            }
        });

        jbtnNhapSPN.setText("Nhập SP");
        jbtnNhapSPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNhapSPNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aaaaLayout = new javax.swing.GroupLayout(aaaa);
        aaaa.setLayout(aaaaLayout);
        aaaaLayout.setHorizontalGroup(
            aaaaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aaaaLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jbtnNhapSPN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jbtnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jbtnSuaHDN)
                .addGap(29, 29, 29)
                .addComponent(jbtnXoaHD)
                .addGap(130, 130, 130))
        );

        aaaaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbtnNhap, jbtnSuaHDN, jbtnXoaHD});

        aaaaLayout.setVerticalGroup(
            aaaaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aaaaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jbtnNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jbtnSuaHDN)
                .addComponent(jbtnXoaHD)
                .addComponent(jbtnNhapSPN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        aaaaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbtnNhap, jbtnSuaHDN, jbtnXoaHD});

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(aaaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(aaaa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        formNhap.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, 220));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sản phẩm"));
        jPanel1.setToolTipText("Đơn vị nhập");

        jLabel3.setText("Mã SP");

        jtmaspnhap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtmaspnhapFocusLost(evt);
            }
        });

        jLabel4.setText("Tên SP");

        jLabel5.setText("Thông số");

        jLabel6.setText("Số lượng nhập");

        jLabel7.setText("Màu sắc");

        jLabel13.setText("Giá nhập");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtthongsonhap, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtmaspnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jttenspnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtsoluongnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtmausacnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtmaspnhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jttenspnhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jtthongsonhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jtsoluongnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtmausacnhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        formNhap.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 760, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Đơn vị nhập"));
        jPanel2.setToolTipText("");

        jLabel8.setText("Mã DV");

        jtmadvnhap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtmadvnhapFocusLost(evt);
            }
        });

        jLabel9.setText("Tên DV");

        jLabel10.setText("Địa chỉ");

        jLabel11.setText("Số DT");

        jLabel12.setText("Email");

        jLabel34.setText("Số SP");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtdiachinhap, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtmadvnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jttendvnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtsodtnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jtemailnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtSlSPN, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtmadvnhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jttendvnhap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jtemailnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jtdiachinhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jtsodtnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(jtSlSPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        formNhap.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 50, 750, -1));

        jLabel2.setText("Ngày nhập:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtngaynhap, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.CENTER)
            .addComponent(jtngaynhap, javax.swing.GroupLayout.Alignment.CENTER)
        );

        formNhap.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jLabel32.setText("Mã hoá đơn:");
        jLabel32.setToolTipText("");
        formNhap.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 80, 20));

        jtfMaHD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfMaHDFocusLost(evt);
            }
        });
        formNhap.add(jtfMaHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 140, -1));

        jcbxLockNhap.setText("Lock");
        jcbxLockNhap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbxLockNhapItemStateChanged(evt);
            }
        });
        formNhap.add(jcbxLockNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        Home.addTab("Nhập", formNhap);

        jtblKho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtblKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblKhoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtblKho);

        jcbSearch.setText("Search");

        jbtnThemKho.setText("Thêm");
        jbtnThemKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnThemKhoActionPerformed(evt);
            }
        });

        jbtnSuaKhoa.setText("Sửa");
        jbtnSuaKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSuaKhoaActionPerformed(evt);
            }
        });

        jbtnReloadKho.setText("Reload");
        jbtnReloadKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnReloadKhoMouseClicked(evt);
            }
        });
        jbtnReloadKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnReloadKhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jcbSearch)
                        .addGap(28, 28, 28)
                        .addComponent(jbtnThemKho)
                        .addGap(39, 39, 39)
                        .addComponent(jbtnSuaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(jbtnReloadKho)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbtnReloadKho, jbtnSuaKhoa, jbtnThemKho});

        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnSuaKhoa, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addComponent(jbtnReloadKho)
                        .addComponent(jbtnThemKho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jcbSearch))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel12Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbtnReloadKho, jbtnSuaKhoa, jbtnThemKho});

        jLabel27.setText("Mã sản phẩm");

        jtmaspkho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtmaspkhoKeyReleased(evt);
            }
        });

        jttenspkho.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jttenspkhoFocusLost(evt);
            }
        });
        jttenspkho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jttenspkhoKeyReleased(evt);
            }
        });

        jLabel28.setText("Tên sản phẩm");

        jtmausackho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtmausackhoKeyReleased(evt);
            }
        });

        jLabel29.setText("Màu sắc");

        jtthongsokho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtthongsokhoKeyReleased(evt);
            }
        });

        jLabel30.setText("Thông số kỹ thuật");

        jLabel31.setText("Số lượng");

        jLabel35.setText("Số ngày tồn");

        jtXuLy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtXuLyKeyReleased(evt);
            }
        });

        jtTinhTrang.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtTinhTrangKeyReleased(evt);
            }
        });

        jLabel36.setText("Tình trạng");

        jLabel37.setText("Chiết khấu");

        jLabel38.setText("Cách xử lý");

        jLabel39.setText("Số lượng xử lý");

        jsSoNgayTon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsSoNgayTonStateChanged(evt);
            }
        });
        jsSoNgayTon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jsSoNgayTonKeyReleased(evt);
            }
        });

        jsSoLuongTon.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsSoLuongTonStateChanged(evt);
            }
        });

        jsSoLuongXL.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsSoLuongXLStateChanged(evt);
            }
        });

        jsChietKhau.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jsChietKhauStateChanged(evt);
            }
        });
        jsChietKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jsChietKhauKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel35)
                    .addComponent(jLabel37))
                .addGap(32, 32, 32)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtmaspkho, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                    .addComponent(jttenspkho, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jtmausackho, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jsSoNgayTon)
                    .addComponent(jsChietKhau))
                .addGap(116, 116, 116)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel36)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39))
                .addGap(37, 37, 37)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtthongsokho, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jtTinhTrang, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jtXuLy, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(jsSoLuongTon, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jsSoLuongXL, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jtmaspkho, jtmausackho, jttenspkho});

        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtmaspkho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtthongsokho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel28)
                    .addComponent(jttenspkho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(jsSoLuongTon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtmausackho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtTinhTrang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel38)
                    .addComponent(jtXuLy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jsSoNgayTon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jsChietKhau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jsSoLuongXL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        Home.addTab("Kho", jPanel11);

        add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 840, 550));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Công ty phân phối diện thoại HQT");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 320, -1));

        jbtnLogout.setText("Đăng xuất");
        jbtnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnLogoutMouseClicked(evt);
            }
        });
        jbtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogoutActionPerformed(evt);
            }
        });
        add(jbtnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 128, 48));

        jlbAccName.setText("nv01");
        add(jlbAccName, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lockHD(boolean sate) {
        jtmaHDX.setEditable(sate);
        jtngayxuat.setEditable(sate);
        jtmadvxuat.setEditable(sate);
        jttendvxuat.setEditable(sate);
        jtemailxuat.setEditable(sate);
        jtdiachixuat.setEditable(sate);
        jtsodtxuat.setEditable(sate);
        jtSoSPX.setEditable(sate);
    }

    private void lockSP(boolean sate) {
        jtmaspxuat.setEditable(sate);
        jttenspxuat.setEditable(sate);
        jtsoluongxuat.setEditable(sate);
        jtmausacxuat.setEditable(sate);
        jtthongsoxuat.setEditable(sate);
        jtgiaxuat.setEditable(sate);
    }

    private void lockHDN(boolean sate) {
        jtfMaHD.setEditable(sate);
        jtngaynhap.setEditable(sate);
        jtmadvnhap.setEditable(sate);
        jttendvnhap.setEditable(sate);
        jtemailnhap.setEditable(sate);
        jtdiachinhap.setEditable(sate);
        jtsodtnhap.setEditable(sate);
        jtSlSPN.setEditable(sate);
    }

    private void lockSPN(boolean sate) {
        jtmaspnhap.setEditable(sate);
        jttenspnhap.setEditable(sate);
        jtsoluongnhap.setEditable(sate);
        jtmausacnhap.setEditable(sate);
        jtthongsonhap.setEditable(sate);
        jtgianhap.setEditable(sate);
    }

    private ArrayList<Kho> listKhoSP;
    private KhoGUI khoGUI = new KhoGUI();

    private void loadKho() throws Exception {
        listKhoSP = new ArrayList<>();

        listKhoSP = khoGUI.getSP();
        jtblKho.setModel(new CustomTable_kho(listKhoSP));
    }

    private void loadKho(ArrayList<Kho> list) throws Exception {
        jtblKho.setModel(new CustomTable_kho(list));
    }

    XuatGUI xuatGUI = new XuatGUI();

    private void loadXuat() throws Exception {
        ArrayList<SanPham> dsspx = new ArrayList<>();
        dsspx = xuatGUI.getSP(jtmaHDX.getText().trim());
        jtblOut.setModel(new CustomTable_Xuat(new ChiTietHDX(new HDXuat(), dsspx)));
    }

    NhapGUI nhapGUI = new NhapGUI();

    private void loadNhap() throws Exception {
        ArrayList<SanPham> dsspn = new ArrayList<>();
        dsspn = nhapGUI.getSP(jtfMaHD.getText().trim());
        jtblIn.setModel(new CustomTable_Nhap(new ChiTietHDN(new HDNhap(), dsspn)));

    }

    private void clearHDX() {
        jtmaHDX.setText("");
        jtmaHDX.requestFocus();
        jtmadvxuat.setText("");
        jttendvxuat.setText("");
        jtemailxuat.setText("");
        jtdiachixuat.setText("");
        jtsodtxuat.setText("");
        jtmaspxuat.setText("");
        jtmaspxuat.requestFocus();
        jttenspxuat.setText("");
        jtmausacxuat.setText("");
        jtthongsoxuat.setText("");
        jtsoluongxuat.setText("");
        jtgiaxuat.setText("");

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        Date a = cal.getTime();
        jtngayxuat.setText(f.format(a));
        lockHD(true);
        lockSP(false);
    }

    private void clearHDN() {
        jtfMaHD.setText("");
        jtfMaHD.requestFocus();
        jtmadvnhap.setText("");
        jttendvnhap.setText("");
        jtemailnhap.setText("");
        jtdiachinhap.setText("");
        jtsodtnhap.setText("");
        jtmaspnhap.setText("");
        jtmaspnhap.requestFocus();
        jttenspnhap.setText("");
        jtmausacnhap.setText("");
        jtthongsonhap.setText("");
        jtsoluongnhap.setText("");
        jtgianhap.setText("");

        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        Date a = cal.getTime();
        jtngaynhap.setText(f.format(a));
        lockHDN(true);
        lockSPN(false);
    }

    private HDXuat getHDXuat() {
        String mHDX = jtmaHDX.getText().trim();
        String ngayXuat = jtngayxuat.getText().trim();
        String maDVX = jtmadvxuat.getText().trim();
        String tenDVX = jttendvxuat.getText().trim();
        String email = jtemailxuat.getText().trim();
        String sdt = jtsodtxuat.getText().trim();
        String diachi = jtdiachixuat.getText().trim();
        int soSP = Integer.parseInt(jtSoSPX.getText());
        DonVi dvn = new DonVi(maDVX, tenDVX, diachi, sdt, email);
        return new HDXuat(mHDX, ngayXuat, soSP, dvn, DangNhap.name, 0);
    }

    private HDNhap getHDNhap() {
        String mHDN = jtfMaHD.getText().trim();
        String ngayNhap = jtngaynhap.getText().trim();
        String maDVN = jtmadvnhap.getText().trim();
        String tenDVN = jttendvnhap.getText().trim();
        String emailN = jtemailnhap.getText().trim();
        String sdtN = jtsodtnhap.getText().trim();
        String diachiN = jtdiachinhap.getText().trim();
        int soSPN = Integer.parseInt(jtSlSPN.getText());
        DonVi dvn = new DonVi(maDVN, tenDVN, diachiN, sdtN, emailN);
        return new HDNhap(mHDN, ngayNhap, DangNhap.name, soSPN, dvn);

    }

    private SanPham getSanPhamX() {
        String maSP = jtmaspxuat.getText().trim();
        String tenSp = jttenspxuat.getText().trim();
        String mauSac = jtmausacxuat.getText().trim();
        String thongSo = jtthongsoxuat.getText().trim();
        int slXuat = Integer.parseInt(jtsoluongxuat.getText());
        double giaXuat = Double.parseDouble(jtgiaxuat.getText());
        return new SanPham(maSP, tenSp, mauSac, thongSo, slXuat, giaXuat);
    }

    private SanPham getSanPhamN() {
        String maSP = jtmaspnhap.getText().trim();
        String tenSp = jttenspnhap.getText().trim();
        String mauSac = jtmausacnhap.getText().trim();
        String thongSo = jtthongsonhap.getText().trim();
        int slXuat = Integer.parseInt(jtsoluongnhap.getText());
        double giaXuat = Double.parseDouble(jtgianhap.getText());
        return new SanPham(maSP, tenSp, mauSac, thongSo, slXuat, giaXuat);
    }

    private void clearSPX() {
        jtmaspxuat.setText("");
        jtmaspxuat.requestFocus();
        jttenspxuat.setText("");
        jtmausacxuat.setText("");
        jtthongsoxuat.setText("");
        jtsoluongxuat.setText("");
        jtgiaxuat.setText("");
    }

    private void clearSPK() {
        jtmaspkho.setText("");
        jtmaspkho.requestFocus();
        jttenspkho.setText("");
        jtmausackho.setText("");
        jtthongsokho.setText("");
        jsSoLuongTon.setValue(0);
        jtTinhTrang.setText("");
        jsSoNgayTon.setValue(0);
        jtXuLy.setText("");
        jsSoLuongXL.setValue(0);
        jsChietKhau.setValue(0);
    }

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm
    int row;
    private void jtblOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblOutMouseClicked
        row = jtblOut.getSelectedRow();
        jtmaspxuat.setText(loadSP.get(row).getMaSP());
        jttenspxuat.setText(loadSP.get(row).getTenSP());
        jtmausacxuat.setText(loadSP.get(row).getMauSac());
        jtthongsoxuat.setText(loadSP.get(row).getThongso());
        jtsoluongxuat.setText(String.valueOf(loadSP.get(row).getSoLuong()));
        jtgiaxuat.setText(String.valueOf(loadSP.get(row).getGia()));

    }//GEN-LAST:event_jtblOutMouseClicked

    private void jbtnNhapSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnNhapSPMouseClicked

    }//GEN-LAST:event_jbtnNhapSPMouseClicked

    private void jtblInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblInMouseClicked
        row = jtblIn.getSelectedRow();
        jtmaspnhap.setText(loadSPN.get(row).getMaSP());
        jttenspnhap.setText(loadSPN.get(row).getTenSP());
        jtmausacnhap.setText(loadSPN.get(row).getMauSac());
        jtthongsonhap.setText(loadSPN.get(row).getThongso());
        jtsoluongnhap.setText(String.valueOf(loadSPN.get(row).getSoLuong()));
        jtgianhap.setText(String.valueOf(loadSPN.get(row).getGia()));
    }//GEN-LAST:event_jtblInMouseClicked

    private void jtblKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblKhoMouseClicked
        int row = jtblKho.getSelectedRow();
        jtmaspkho.setText(listKhoSP.get(row).getMaSP().trim());
        jtmaspkho.requestFocus();
        jttenspkho.setText(listKhoSP.get(row).getTenSP().trim());
        jtmausackho.setText(listKhoSP.get(row).getMauSac().trim());
        jtthongsokho.setText(listKhoSP.get(row).getThongso().trim());
        jsSoLuongTon.setValue(listKhoSP.get(row).getSoLuong());
        jtTinhTrang.setText(listKhoSP.get(row).getTinhTrang().trim());
        jsSoNgayTon.setValue(listKhoSP.get(row).getSoNgayton());
        jtXuLy.setText(listKhoSP.get(row).getCachXuLy().trim());
        jsSoLuongXL.setValue(listKhoSP.get(row).getSlXuLy());
        jsChietKhau.setValue(listKhoSP.get(row).getPtGiamGia());
    }//GEN-LAST:event_jtblKhoMouseClicked

    private void jbtnReloadKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnReloadKhoMouseClicked

    }//GEN-LAST:event_jbtnReloadKhoMouseClicked

    private void jbtnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnLogoutMouseClicked


    }//GEN-LAST:event_jbtnLogoutMouseClicked

    private void jbtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogoutActionPerformed
        int click = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng xuất?", "Thông Báo", JOptionPane.OK_CANCEL_OPTION);
        if (click == JOptionPane.OK_OPTION) {
            new DangNhap().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jbtnLogoutActionPerformed
    ArrayList<SanPham> loadSP = new ArrayList<>();
    ChiTietHDX ctHDX = new ChiTietHDX();
    private void jbtnNhapSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNhapSPActionPerformed

        try {
            int slSPX = Integer.parseInt(jtSoSPX.getText());
            int spxcout = loadSP.size() + 1;

            boolean check = false;
            for (SanPham item : loadSP) {
                if (item.getMaSP().trim().equals(jtmaspxuat.getText().trim())) {
                    check = true;
                    break;
                }
            }
            if (check) {
                loadSP.set(row, getSanPhamX());
            } else {
                if (spxcout <= slSPX) {
                    loadSP.add(getSanPhamX());
                } else {
                    JOptionPane.showMessageDialog(null, "Đã đủ số lượng");
                }
            }
            ctHDX.setListSP(loadSP);
            jtblOut.setModel(new CustomTable_Xuat(ctHDX));
        } catch (Exception ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnNhapSPActionPerformed

    private void jcbxLockItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbxLockItemStateChanged

        if (jcbxLock.isSelected()) {
            lockHD(false);
            lockSP(true);
        } else {
            lockHD(true);
            lockSP(false);
        }
    }//GEN-LAST:event_jcbxLockItemStateChanged

    private void jtmaHDXFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtmaHDXFocusLost
        try {

            loadXuat();
        } catch (Exception ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtmaHDXFocusLost

    private void jtfMaHDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfMaHDFocusLost
        try {
            loadNhap();
        } catch (Exception ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtfMaHDFocusLost
    public static ChiTietHDX hdxEnd;
    private void jjbtnXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jjbtnXuatActionPerformed
        try {
            HDXuat hDXuat = new HDXuat();
            hDXuat = getHDXuat();
            SanPham sPX = new SanPham();
            sPX = getSanPhamX();
            if (xuatGUI.checkHDX(hDXuat.getMaHDX())) {
                JOptionPane.showMessageDialog(null, "Mã hoá đơn đã tồn tại");
                return;
            }
            if (!xuatGUI.checkDVX(hDXuat.getDvn().getMaDV())) {
                xuatGUI.themDVX(hDXuat.getDvn());
            }
            if (!xuatGUI.checkSPX(sPX.getMaSP(), sPX.getSoLuong())) {
                JOptionPane.showMessageDialog(null, "Sản phẩm không tồn tại hoặc không đủ");
                return;
            } else {
                hdxEnd = new ChiTietHDX(hDXuat, loadSP);
                new HoaDonxuat().setVisible(true);
            }

        } catch (Exception ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jjbtnXuatActionPerformed

    private void jbtnSuaXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSuaXuatActionPerformed
        try {
            HDXuat hDXuat = new HDXuat();
            hDXuat = getHDXuat();
            SanPham sPX = new SanPham();
            sPX = getSanPhamX();

            if (!xuatGUI.checkHDX(hDXuat.getMaHDX())) {
                JOptionPane.showMessageDialog(null, "Mã hoá đơn không tồn tại");
                return;
            }
            if (!xuatGUI.checkDVX(hDXuat.getDvn().getMaDV())) {
                xuatGUI.themDVX(hDXuat.getDvn());
            }
            if (!xuatGUI.checkSPX(sPX.getMaSP(), sPX.getSoLuong())) {
                JOptionPane.showMessageDialog(null, "Sản phẩm không tồn tại hoặc không đủ");
                return;
            }
            if (xuatGUI.updateHDX(hDXuat.getMaHDX(), hDXuat.getDvn().getMaDV(), hDXuat.getNgayXuat(), hDXuat.getManvString(), hDXuat.getSlSPX())) {

                JOptionPane.showMessageDialog(null, "Sửa thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Sửa thất bại");

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Sửa thất bại" + ex.toString());

        }


    }//GEN-LAST:event_jbtnSuaXuatActionPerformed

    private void jbtnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXoaActionPerformed
        try {
            if (xuatGUI.deleteXuat(jtmaHDX.getText().trim())) {
                JOptionPane.showMessageDialog(null, "Xoá thành công");
            } else {
                JOptionPane.showConfirmDialog(null, "Xoá thất bại");
            }
        } catch (Exception ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnXoaActionPerformed

    private void jbtnReloadKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnReloadKhoActionPerformed
        try {
            loadKho();
        } catch (Exception ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnReloadKhoActionPerformed
    private Kho kho = new Kho();

    public Kho getKho() {
        String masp = jtmaspkho.getText().trim();
        String tenSP = jttenspkho.getText().trim();
        String mauSac = jtmausackho.getText().trim();
        String thongSo = jtthongsokho.getText().trim();
        int soLuongTon = Integer.parseInt(jsSoLuongTon.getValue().toString());
        String tinhTrang = jtTinhTrang.getText().trim();
        int soNgayton = Integer.parseInt(jsSoNgayTon.getValue().toString());
        String xuLy = jtXuLy.getText().trim();
        int slXuLy = Integer.parseInt(jsSoLuongXL.getValue().toString());
        int chietKhau = Integer.parseInt(jsChietKhau.getValue().toString());

        return new Kho(masp, tenSP, mauSac, thongSo, soLuongTon, tinhTrang, soNgayton, xuLy, slXuLy, chietKhau);

    }
    private void jbtnThemKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnThemKhoActionPerformed
        try {
            if (khoGUI.checkSPX(jtmaspkho.getText().trim())) {
                JOptionPane.showMessageDialog(null, "Sản phẩm đã tồn tại!");
                return;
            }
            kho = getKho();
            if (khoGUI.themsp(kho.getMaSP(), kho.getTenSP(), kho.getMauSac(), kho.getThongso(), kho.getSoLuong(), kho.getTinhTrang(), kho.getSoNgayton(), kho.getCachXuLy(), kho.getSlXuLy(), kho.getPtGiamGia())) {
                JOptionPane.showMessageDialog(null, "Thêm sản phẩm thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Thêm sản phẩm thất bại!");
            }
            loadKho();
        } catch (Exception ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
        clearSPK();

    }//GEN-LAST:event_jbtnThemKhoActionPerformed

    private void jbtnSuaKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSuaKhoaActionPerformed
        try {
            if (!khoGUI.checkSPX(jtmaspkho.getText().trim())) {
                JOptionPane.showMessageDialog(null, "Sản phẩm không tồn tại!");
                return;
            }
            kho = getKho();
            if (khoGUI.updatesp(kho.getMaSP(), kho.getTenSP(), kho.getMauSac(), kho.getThongso(), kho.getSoLuong(), kho.getTinhTrang(), kho.getSoNgayton(), kho.getCachXuLy(), kho.getSlXuLy(), kho.getPtGiamGia())) {
                JOptionPane.showMessageDialog(null, "Sửa sản phẩm thành công!");
            } else {
                JOptionPane.showMessageDialog(null, "Sửa sản phẩm thất bại!");
            }
            loadKho();
        } catch (Exception ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
        clearSPK();

    }//GEN-LAST:event_jbtnSuaKhoaActionPerformed

    private void jtmaspkhoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtmaspkhoKeyReleased
        if (jcbSearch.isSelected() && !jtmaspkho.getText().trim().equals("")) {
            try {
                jtmaspkho.setText(jtmaspkho.getText().trim());
                ArrayList<Kho> ds = khoGUI.searchKho("masp", jtmaspkho.getText().trim());
                loadKho(ds);
            } catch (Exception ex) {
                Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jtmaspkhoKeyReleased

    private void jcbxLockNhapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbxLockNhapItemStateChanged
        if (jcbxLockNhap.isSelected()) {
            lockHDN(false);
            lockSPN(true);
        } else {
            lockHDN(true);
            lockSPN(false);
        }
    }//GEN-LAST:event_jcbxLockNhapItemStateChanged
    public static ChiTietHDN hdnEnd;
    private void jbtnNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNhapActionPerformed
        try {
            HDNhap hDNhap = new HDNhap();
            hDNhap = getHDNhap();
            SanPham sPX = new SanPham();
            sPX = getSanPhamN();
            if (nhapGUI.checkHDN(hDNhap.getMaHDN())) {
                JOptionPane.showMessageDialog(null, "Mã hoá đơn đã tồn tại");
                return;
            }
            if (!nhapGUI.checkDVN(hDNhap.getDvn().getMaDV())) {
                nhapGUI.themDVN(hDNhap.getDvn());
            }
            if (!nhapGUI.checkSPN(sPX.getMaSP())) {
                JOptionPane.showMessageDialog(null, "Sản phẩm không tồn tại!");
                return;
            } else {
                hdnEnd = new ChiTietHDN(hDNhap, loadSPN);
                new HoaDonNhap().setVisible(true);
            }

        } catch (Exception ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnNhapActionPerformed

    ArrayList<SanPham> loadSPN = new ArrayList<>();
    ChiTietHDN ctHDN = new ChiTietHDN();
    private void jbtnNhapSPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNhapSPNActionPerformed
        int slSPN = Integer.parseInt(jtSlSPN.getText());
        int spncout = loadSPN.size() + 1;

        boolean check = false;
        for (SanPham item : loadSPN) {
            if (item.getMaSP().trim().equals(jtmaspnhap.getText().trim())) {
                check = true;
                break;
            }
        }
        if (check) {
            loadSPN.set(row, getSanPhamN());
        } else {
            if (spncout <= slSPN) {
                loadSPN.add(getSanPhamN());
            } else {
                JOptionPane.showMessageDialog(null, "Đã đủ số lượng");
            }
        }
        ctHDN.setListSP(loadSPN);
        jtblIn.setModel(new CustomTable_Nhap(ctHDN));
    }//GEN-LAST:event_jbtnNhapSPNActionPerformed

    private void jbtnXoaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnXoaHDActionPerformed

        try {
            if (nhapGUI.deleteNhap(jtfMaHD.getText().trim())) {
                JOptionPane.showMessageDialog(null, "Xoá thành công");
            } else {
                JOptionPane.showConfirmDialog(null, "Xoá thất bại");
            }
        } catch (Exception ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbtnXoaHDActionPerformed

    private void jbtnSuaHDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSuaHDNActionPerformed

        try {
            HDNhap hDNhap = new HDNhap();
            hDNhap = getHDNhap();
            SanPham sPX = new SanPham();
            sPX = getSanPhamN();
            if (!nhapGUI.checkHDN(hDNhap.getMaHDN())) {
                JOptionPane.showMessageDialog(null, "Mã hoá đơn không tồn tại");
                return;
            }
            if (!nhapGUI.checkDVN(hDNhap.getDvn().getMaDV())) {
                nhapGUI.themDVN(hDNhap.getDvn());
            }
            if (!nhapGUI.checkSPN(sPX.getMaSP())) {
                JOptionPane.showMessageDialog(null, "Sản phẩm không tồn tại");
                return;
            }
            if (nhapGUI.updateHDN(hDNhap.getMaHDN(), hDNhap.getDvn().getMaDV(), hDNhap.getNgayN(), hDNhap.getMaNV(), hDNhap.getSlSPN())) {
                JOptionPane.showMessageDialog(null, "Sửa thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Sửa thất bại");

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Sửa thất bại" + ex.toString());

        }

    }//GEN-LAST:event_jbtnSuaHDNActionPerformed

    private void jttenspkhoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jttenspkhoFocusLost

    }//GEN-LAST:event_jttenspkhoFocusLost

    private void jttenspkhoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jttenspkhoKeyReleased
        if (jcbSearch.isSelected() && !jttenspkho.getText().trim().equals("")) {
            try {

                ArrayList<Kho> ds = khoGUI.searchKho("tensanpham", jttenspkho.getText().trim());
                loadKho(ds);
            } catch (Exception ex) {
                Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jttenspkhoKeyReleased

    private void jtmausackhoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtmausackhoKeyReleased
        if (jcbSearch.isSelected() && !jtmausackho.getText().trim().equals("")) {
            try {

                ArrayList<Kho> ds = khoGUI.searchKho("mausac", jtmausackho.getText().trim());
                loadKho(ds);
            } catch (Exception ex) {
                Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jtmausackhoKeyReleased

    private void jtthongsokhoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtthongsokhoKeyReleased
        if (jcbSearch.isSelected() && !jtthongsokho.getText().trim().equals("")) {
            try {

                ArrayList<Kho> ds = khoGUI.searchKho("thongsokythuat", jtthongsokho.getText().trim());
                loadKho(ds);
            } catch (Exception ex) {
                Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jtthongsokhoKeyReleased

    private void jtTinhTrangKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTinhTrangKeyReleased
        if (jcbSearch.isSelected() && !jtTinhTrang.getText().trim().equals("")) {
            try {

                ArrayList<Kho> ds = khoGUI.searchKho("tinhtrang", jtTinhTrang.getText().trim());
                loadKho(ds);
            } catch (Exception ex) {
                Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jtTinhTrangKeyReleased

    private void jtXuLyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtXuLyKeyReleased
        if (jcbSearch.isSelected() && !jtXuLy.getText().trim().equals("")) {
            try {

                ArrayList<Kho> ds = khoGUI.searchKho("cachxuly", jtXuLy.getText().trim());
                loadKho(ds);
            } catch (Exception ex) {
                Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jtXuLyKeyReleased

    private void jsSoNgayTonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jsSoNgayTonKeyReleased
        
    }//GEN-LAST:event_jsSoNgayTonKeyReleased

    private void jsChietKhauKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jsChietKhauKeyReleased
        
    }//GEN-LAST:event_jsChietKhauKeyReleased

    private void jsSoLuongTonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsSoLuongTonStateChanged
        if (jcbSearch.isSelected() && !jsSoLuongTon.getValue().toString().equals("")) {
            try {

                ArrayList<Kho> ds = khoGUI.searchKho("soluongton", jsSoLuongTon.getValue().toString().trim());
                loadKho(ds);
            } catch (Exception ex) {
                Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jsSoLuongTonStateChanged

    private void jsSoNgayTonStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsSoNgayTonStateChanged
        if (jcbSearch.isSelected() && !jsSoNgayTon.getValue().toString().equals("")) {
            try {

                ArrayList<Kho> ds = khoGUI.searchKho("songayton", jsSoNgayTon.getValue().toString().trim());
                loadKho(ds);
            } catch (Exception ex) {
                Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jsSoNgayTonStateChanged

    private void jsChietKhauStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsChietKhauStateChanged
        if (jcbSearch.isSelected() && !jsChietKhau.getValue().toString().equals("")) {
            try {

                ArrayList<Kho> ds = khoGUI.searchKho("ptgiamgia", jsChietKhau.getValue().toString());
                loadKho(ds);
            } catch (Exception ex) {
                Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jsChietKhauStateChanged

    private void jsSoLuongXLStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jsSoLuongXLStateChanged
        if (jcbSearch.isSelected() && !jsSoLuongXL.getValue().toString().equals("")) {
            try {

                ArrayList<Kho> ds = khoGUI.searchKho("slxuly", jsSoLuongXL.getValue().toString());
                loadKho(ds);
            } catch (Exception ex) {
                Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jsSoLuongXLStateChanged

    private void jtmadvxuatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtmadvxuatFocusLost
        // TODO add your handling code here:
       String madv=jtmadvxuat.getText().trim();
        if(!madv.equals(""))
        {
               DonVi dvx = new DonVi();
               try
               {
               dvx=xuatGUI.getDVX(madv);
               jttendvxuat.setText(dvx.getTenDV());
               jtdiachixuat.setText(dvx.getDiachi());
               jtsodtxuat.setText(dvx.getSdt());
               jtemailxuat.setText(dvx.getEmail());
               jtSoSPX.requestFocus();
               }
               catch(Exception e)
               {
                   System.out.println("warring: "+e.toString());
               }
        }
        else
            JOptionPane.showMessageDialog(null,"Mã đơn vị không để trống");
    }//GEN-LAST:event_jtmadvxuatFocusLost

    private void jtmaspxuatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtmaspxuatFocusLost
        // TODO add your handling code here:
        String masp=jtmaspxuat.getText().trim();
        if(!masp.equals(""))
        {
               Kho kh = new Kho();
               try
               {
               kh=khoGUI.getSP(masp);
               jttenspxuat.setText(kh.getTenSP());
               jtmausacxuat.setText(kh.getMauSac());
               jtthongsoxuat.setText(kh.getThongso());
               jtsoluongxuat.requestFocus();
               }
               catch(Exception e)
               {
                   System.out.println("warring: "+e.toString());
               }
        }
        else
            JOptionPane.showMessageDialog(null,"Mã sản phẩm không để trống");
    }//GEN-LAST:event_jtmaspxuatFocusLost

    private void jtmadvnhapFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtmadvnhapFocusLost
        // TODO add your handling code here:
        String madv=jtmadvnhap.getText().trim();
        if(!madv.equals(""))
        {
               DonVi dvn = new DonVi();
               try
               {
               dvn=nhapGUI.getDVN(madv);
               jttendvnhap.setText(dvn.getTenDV());
               jtdiachinhap.setText(dvn.getDiachi());
               jtsodtnhap.setText(dvn.getSdt());
               jtemailnhap.setText(dvn.getEmail());
               jtSlSPN.requestFocus();
               }
               catch(Exception e)
               {
                   System.out.println("warring: "+e.toString());
               }
	 }
        else
            JOptionPane.showMessageDialog(null,"Mã đơn vị không để trống");
    }//GEN-LAST:event_jtmadvnhapFocusLost

    private void jtmaspnhapFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtmaspnhapFocusLost
        // TODO add your handling code here:
        String masp=jtmaspnhap.getText().trim();
        if(!masp.equals(""))
        {
               Kho kh = new Kho();
               try
               {
               kh=khoGUI.getSP(masp);
               jttenspnhap.setText(kh.getTenSP());
               jtmausacnhap.setText(kh.getMauSac());
               jtthongsonhap.setText(kh.getThongso());
               jtsoluongnhap.requestFocus();
               }
               catch(Exception e)
               {
                   System.out.println("warring: "+e.toString());
               }
        }
        else
            JOptionPane.showMessageDialog(null,"Mã sản phẩm không để trống");
    }//GEN-LAST:event_jtmaspnhapFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TrangChu().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Home;
    private javax.swing.JPanel aaaa;
    private javax.swing.JPanel formNhap;
    private javax.swing.JPanel formXuat;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtnLogout;
    private javax.swing.JButton jbtnNhap;
    private javax.swing.JButton jbtnNhapSP;
    private javax.swing.JButton jbtnNhapSPN;
    private javax.swing.JButton jbtnReloadKho;
    private javax.swing.JButton jbtnSuaHDN;
    private javax.swing.JButton jbtnSuaKhoa;
    private javax.swing.JButton jbtnSuaXuat;
    private javax.swing.JButton jbtnThemKho;
    private javax.swing.JButton jbtnXoa;
    private javax.swing.JButton jbtnXoaHD;
    private javax.swing.JCheckBox jcbSearch;
    private javax.swing.JCheckBox jcbxLock;
    private javax.swing.JCheckBox jcbxLockNhap;
    private javax.swing.JButton jjbtnXuat;
    private javax.swing.JLabel jlbAccName;
    private javax.swing.JSpinner jsChietKhau;
    private javax.swing.JSpinner jsSoLuongTon;
    private javax.swing.JSpinner jsSoLuongXL;
    private javax.swing.JSpinner jsSoNgayTon;
    private javax.swing.JTextField jtSlSPN;
    private javax.swing.JTextField jtSoSPX;
    private javax.swing.JTextField jtTinhTrang;
    private javax.swing.JTextField jtXuLy;
    private javax.swing.JTable jtblIn;
    private javax.swing.JTable jtblKho;
    private javax.swing.JTable jtblOut;
    private javax.swing.JTextField jtdiachinhap;
    private javax.swing.JTextField jtdiachixuat;
    private javax.swing.JTextField jtemailnhap;
    private javax.swing.JTextField jtemailxuat;
    private javax.swing.JTextField jtfMaHD;
    private javax.swing.JTextField jtgianhap;
    private javax.swing.JTextField jtgiaxuat;
    private javax.swing.JTextField jtmaHDX;
    private javax.swing.JTextField jtmadvnhap;
    private javax.swing.JTextField jtmadvxuat;
    private javax.swing.JTextField jtmaspkho;
    private javax.swing.JTextField jtmaspnhap;
    private javax.swing.JTextField jtmaspxuat;
    private javax.swing.JTextField jtmausackho;
    private javax.swing.JTextField jtmausacnhap;
    private javax.swing.JTextField jtmausacxuat;
    private javax.swing.JTextField jtngaynhap;
    private javax.swing.JTextField jtngayxuat;
    private javax.swing.JTextField jtsodtnhap;
    private javax.swing.JTextField jtsodtxuat;
    private javax.swing.JTextField jtsoluongnhap;
    private javax.swing.JTextField jtsoluongxuat;
    private javax.swing.JTextField jttendvnhap;
    private javax.swing.JTextField jttendvxuat;
    private javax.swing.JTextField jttenspkho;
    private javax.swing.JTextField jttenspnhap;
    private javax.swing.JTextField jttenspxuat;
    private javax.swing.JTextField jtthongsokho;
    private javax.swing.JTextField jtthongsonhap;
    private javax.swing.JTextField jtthongsoxuat;
    // End of variables declaration//GEN-END:variables
}
