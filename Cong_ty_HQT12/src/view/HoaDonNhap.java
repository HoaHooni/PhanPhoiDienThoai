package view;

import Classes.ChiTietHDN;
import Classes.ChiTietHDX;
import Classes.SanPham;
import Controller.NhapGUI;
import Controller.XuatGUI;
import CustomTable.CustomTable_Nhap;
import CustomTable.CustomTable_Xuat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Anchor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class HoaDonNhap extends javax.swing.JFrame {

    public HoaDonNhap() {
        initComponents();
        loadfForm();
    }
    ChiTietHDN hdn = TrangChu.hdnEnd;

    public void loadfForm() {
        jtblSP.setModel(new CustomTable_Nhap(hdn));
        jlbMaNV.setText(hdn.getHdn().getMaNV());
        jlbDate.setText(hdn.getHdn().getNgayN());
        jlbTen.setText(hdn.getHdn().getDvn().getMaDV());
        jlbSDT.setText(hdn.getHdn().getDvn().getSdt());
        jlbEmail.setText(hdn.getHdn().getDvn().getEmail());
        jlbDiaChi.setText(hdn.getHdn().getDvn().getDiachi());
        double sum = 0;
        for (int index = 0; index < hdn.getListSP().size(); index++) {
            sum += hdn.getListSP().get(index).getSoLuong() * hdn.getListSP().get(index).getGia();
        }
        jlbTongTien.setText(String.valueOf(sum));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlbMaNV = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlbDate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlbTen = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlbSDT = new javax.swing.JLabel();
        jlbEmail = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jlbDiaChi = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblSP = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jlbTongTien = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbtnInhd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Công ty phân phối điện thoại");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mã nhân viên");

        jlbMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbMaNV.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ngày lập:");

        jlbDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbDate.setText("jLabel5");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Tên đơn vị");

        jlbTen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbTen.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Số điện thoại");

        jlbSDT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbSDT.setText("jLabel7");

        jlbEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbEmail.setText("jLabel7");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Email");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Địa chỉ");

        jlbDiaChi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbDiaChi.setText("jLabel7");

        jtblSP.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtblSP);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Tổng tiền");

        jlbTongTien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbTongTien.setText("jLabel15");

        jButton1.setText("Thoát");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Thanh Toán");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbtnInhd.setText("In hoa đơn");
        jbtnInhd.setEnabled(false);
        jbtnInhd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnInhdMouseClicked(evt);
            }
        });
        jbtnInhd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInhdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(36, 36, 36)
                .addComponent(jlbTongTien)
                .addGap(158, 158, 158))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbMaNV)
                                .addGap(145, 145, 145)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jlbDate))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jlbTen)
                            .addComponent(jlbSDT)
                            .addComponent(jlbEmail)
                            .addComponent(jlbDiaChi)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jbtnInhd, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jbtnInhd});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbMaNV)
                            .addComponent(jLabel4)
                            .addComponent(jlbDate))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jlbTen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jlbDiaChi))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jlbSDT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jlbEmail))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jlbTongTien))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnInhd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    NhapGUI nhapGUI = new NhapGUI();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            double sum = Double.parseDouble(jlbTongTien.getText());
            double congNo = 0;

            if (nhapGUI.themHDN(hdn.getHdn())) {
                for (int index = 0; index < hdn.getListSP().size(); index++) {
                    nhapGUI.themCTPN(hdn.getHdn().getMaHDN(), hdn.getListSP().get(index).getMaSP(),
                            hdn.getListSP().get(index).getSoLuong(), hdn.getListSP().get(index).getGia());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Thêm thất bại");
            }
            jbtnInhd.setEnabled(true);
        } catch (Exception ex) {
            Logger.getLogger(HoaDonxuat.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            new TrangChu().setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(HoaDonNhap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtnInhdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInhdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnInhdActionPerformed

    private void jbtnInhdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnInhdMouseClicked
        // TODO add your handling code here:
        Document document = new Document(PageSize.A4, 50, 50, 50, 50);

        try {

            // Tạo đối tượng PdfWriter
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Admin\\Desktop" + hdn.getHdn().getMaHDN() + ".pdf"));

            // Mở file để thực hiện ghi
            document.open();

            // Thêm nội dung sử dụng add function
            document.add(new Paragraph("HQT CORPORATION"));

            Anchor anchorTarget = new Anchor("Ma nhan vien: " + hdn.getHdn().getMaNV() + "           Ngay lap: " + hdn.getHdn().getNgayN());
            Anchor anchorTarget1 = new Anchor("\nTen don vi: " + hdn.getHdn().getDvn().getTenDV());
            Anchor anchorTarget2 = new Anchor("\ndia chi: " + hdn.getHdn().getDvn().getDiachi());
            Anchor anchorTarget3 = new Anchor("\nSo đien thoai: " + hdn.getHdn().getDvn().getSdt());
            Anchor anchorTarget4 = new Anchor("\nEmail: " + hdn.getHdn().getDvn().getEmail());
            anchorTarget.setName("BackToTop");
            document.add(anchorTarget);
            document.add(anchorTarget1);
            document.add(anchorTarget2);
            document.add(anchorTarget3);
            document.add(anchorTarget4);
            PdfPTable t = new PdfPTable(6);
            t.setSpacingBefore(25);
            t.setSpacingAfter(25);

            PdfPCell c1 = new PdfPCell(new Phrase("Ma san pham"));
            t.addCell(c1);
            PdfPCell c2 = new PdfPCell(new Phrase("Ten san pham"));
            t.addCell(c2);
            PdfPCell c3 = new PdfPCell(new Phrase("Mau sac"));
            t.addCell(c3);
            PdfPCell c4 = new PdfPCell(new Phrase("Thong so ky thuat"));
            t.addCell(c4);
            PdfPCell c5 = new PdfPCell(new Phrase("So luong"));
            t.addCell(c5);
            PdfPCell c6 = new PdfPCell(new Phrase("Gia xuat"));
            t.addCell(c6);

            for (SanPham item : hdn.getListSP()) {
               t.addCell(item.getMaSP().trim().toString());
                t.addCell(item.getTenSP().trim().toString());
                t.addCell(item.getMauSac().trim().toString());
                t.addCell(item.getThongso().trim().toString());
                t.addCell(String.valueOf(item.getSoLuong()));
                t.addCell(String.valueOf(item.getGia()));

            }

            document.add(t);
             Anchor anchorTarget7 = new Anchor("\nTong tien: " + jlbTongTien.getText().trim());
             document.add(anchorTarget7);
            // Đóng File
            document.close();
            System.out.println("Write file succes!");
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jbtnInhdMouseClicked

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
            java.util.logging.Logger.getLogger(HoaDonNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnInhd;
    private javax.swing.JLabel jlbDate;
    private javax.swing.JLabel jlbDiaChi;
    private javax.swing.JLabel jlbEmail;
    private javax.swing.JLabel jlbMaNV;
    private javax.swing.JLabel jlbSDT;
    private javax.swing.JLabel jlbTen;
    private javax.swing.JLabel jlbTongTien;
    private javax.swing.JTable jtblSP;
    // End of variables declaration//GEN-END:variables
}
