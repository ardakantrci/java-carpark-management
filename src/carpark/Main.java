/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpark;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author lenovo
 */
public class Main extends javax.swing.JFrame {

    
    public boolean ifthereis(String str, ArrayList<String> arr){
        
        boolean result = false;
        
        for(int i = 0; i < arr.size(); i++){
            
            if( arr.get(i).equals(str) )
                result = true;
            
        }
        
        return result;
        
    }
    
    /**
     * Creates new form Main
     */
    public Main() {
        
        initComponents();
        
        Timer t = new Timer(250, updateClockAction);
        t.start();

        try{
                    
            Database db = new Database();
            Connection conn = db.Connect();

            PreparedStatement ps = conn.prepareStatement("select * from cars");
            ResultSet rs = ps.executeQuery();
            
            ArrayList<String> alanlar = new ArrayList<String>();

            while(rs.next()){
                
                int alan = Integer.parseInt(rs.getString("alan"));
                
                alanlar.add(alan+"");

            }
            
            for(int x = 1; x <= 16; x++){

                if( ifthereis(x+"", alanlar) )
                    arac_girisi.addItem(""+ x +" Nolu Alan - DOLU");
                else
                    arac_girisi.addItem(""+ x +" Nolu Alan");
                
            }
            
            for(int x = 1; x <= 16; x++){

                if( ifthereis(x+"", alanlar) )
                    arac_bilgisi.addItem(""+ x +" Nolu Alan");
                else
                    arac_bilgisi.addItem(""+ x +" Nolu Alan - BOŞ");
                
            }

        }catch(Exception error){
            System.out.println("Anasayfada hata:" + error);
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

        jPanel1 = new javax.swing.JPanel();
        arac_girisi = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        arac_kayit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        arac_bilgisi = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        arac_getir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        arac_cikisi = new javax.swing.JTextField();
        cikisbutonu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        sistemi_sifirla = new javax.swing.JButton();
        araclari_sifirla = new javax.swing.JButton();
        personel_cikisi = new javax.swing.JButton();
        sistemi_kapat = new javax.swing.JButton();
        date_time_current = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Otopark Yönetim Sistemi");
        setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Yeni Araç Girişi"));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 90));

        arac_girisi.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        arac_girisi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                arac_girisiİtemStateChanged(evt);
            }
        });
        arac_girisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arac_girisiMouseClicked(evt);
            }
        });
        arac_girisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arac_girisiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        jLabel1.setText("Alan Seçiniz:");

        arac_kayit.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        arac_kayit.setText("Ekle");
        arac_kayit.setToolTipText("Buraya tıklayarak seçtiğiniz alana yeni araç girişi yapabilirsiniz.");
        arac_kayit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arac_kayitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(arac_girisi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arac_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arac_kayit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arac_girisi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Alan Bilgisi"));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 90));

        arac_bilgisi.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        arac_bilgisi.setPreferredSize(new java.awt.Dimension(52, 40));
        arac_bilgisi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                arac_bilgisiİtemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        jLabel2.setText("Alan Seçiniz:");

        arac_getir.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        arac_getir.setText("Görüntüle");
        arac_getir.setToolTipText("Bu buton, seçilen alandaki aracın detaylarını göstermeye yarar.");
        arac_getir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arac_getirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(arac_bilgisi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arac_getir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arac_getir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arac_bilgisi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Araç Çıkışı"));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 90));

        jLabel3.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        jLabel3.setText("Plaka Giriniz:");

        arac_cikisi.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        arac_cikisi.setToolTipText("Plakayı eklediğiniz şekilde girin.");
        arac_cikisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arac_cikisiActionPerformed(evt);
            }
        });

        cikisbutonu.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        cikisbutonu.setText("Çıkış Al");
        cikisbutonu.setToolTipText("Bu buton plakası girilen aracın faturasını görüntüleyerek çıkışını vermenizi sağlar.");
        cikisbutonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisbutonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(arac_cikisi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cikisbutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arac_cikisi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cikisbutonu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jLabel4.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpark/images/anasayfa.png"))); // NOI18N
        jLabel4.setText("  OTOPARK YÖNETİM SİSTEMİ");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Sistem Ayarları"));

        sistemi_sifirla.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        sistemi_sifirla.setText("Kurulumu Temizle");
        sistemi_sifirla.setToolTipText("Dikkat! Bu işlem, otoparktaki tüm alanları boşaltır ve tüm araçların çıkışını yapar. Not: Admin yetkilendirmesi gerekir!");
        sistemi_sifirla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sistemi_sifirlaActionPerformed(evt);
            }
        });

        araclari_sifirla.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        araclari_sifirla.setText("Otoparkı Temizle");
        araclari_sifirla.setToolTipText("Dikkat! Bu işlem, otoparktaki tüm alanları boşaltır ve tüm araçların çıkışını yapar. Not: Admin yetkilendirmesi gerekir!");
        araclari_sifirla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araclari_sifirlaActionPerformed(evt);
            }
        });

        personel_cikisi.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        personel_cikisi.setText("Personel Çıkışı");
        personel_cikisi.setToolTipText("Lütfen bilgisayarınızdan kalkarken çıkış yapınız.");
        personel_cikisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personel_cikisiActionPerformed(evt);
            }
        });

        sistemi_kapat.setFont(new java.awt.Font("Avenir Next", 0, 14)); // NOI18N
        sistemi_kapat.setText("Sistemi Kapat");
        sistemi_kapat.setToolTipText("Dikkat! Bu işlem, otoparktaki tüm alanları boşaltır ve tüm araçların çıkışını yapar. Not: Admin yetkilendirmesi gerekir!");
        sistemi_kapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sistemi_kapatActionPerformed(evt);
            }
        });

        date_time_current.setFont(new java.awt.Font("Avenir Next", 0, 13)); // NOI18N
        date_time_current.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date_time_current.setText("Tarih & Saat");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(personel_cikisi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sistemi_kapat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(araclari_sifirla, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sistemi_sifirla, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_time_current, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(date_time_current, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(personel_cikisi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sistemi_kapat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(araclari_sifirla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sistemi_sifirla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52))))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void arac_kayitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arac_kayitActionPerformed
        // TODO add your handling code here:
        
        int selected_item = arac_girisi.getSelectedIndex();
        
        NewCar nc = new NewCar(selected_item);
        nc.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_arac_kayitActionPerformed

    private void arac_getirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arac_getirActionPerformed
        // TODO add your handling code here:
        
        int selected_area = arac_bilgisi.getSelectedIndex();
            
        ShowDetails sd = new ShowDetails(selected_area);
        sd.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_arac_getirActionPerformed

    private void arac_cikisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arac_cikisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arac_cikisiActionPerformed
    
    private void arac_girisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arac_girisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arac_girisiActionPerformed

    private void araclari_sifirlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araclari_sifirlaActionPerformed
        // TODO add your handling code here:
        
        String islem = "Araçları Temizle";
        AdminAuthorization au = new AdminAuthorization(islem);
        au.setVisible(true);
        dispose();
        new Main().setVisible(false);
        dispose();
        
    }//GEN-LAST:event_araclari_sifirlaActionPerformed

    private void cikisbutonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisbutonuActionPerformed
        // TODO add your handling code here:  
                
        String plakano = arac_cikisi.getText();
        
        if( plakano.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Lütfen geçerli bir plaka giriniz!", "HATA", JOptionPane.ERROR_MESSAGE);
        }else{
            
            try{

                Database db = new Database();
                Connection conn = db.Connect();

                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM cars WHERE plaka='"+plakano+"'");

                int count = 0;

                while (rs.next()) {
                    ++count;
                }

                if (count == 0) {
                    JOptionPane.showMessageDialog(this, "Bu plakaya ait araç bulunamadı!", "HATA", JOptionPane.ERROR_MESSAGE);
                }else{
                    CarExit ce = new CarExit(plakano);
                    ce.setVisible(true);
                    dispose();
                }
            
            }catch(Exception error){
                System.out.println("Anasayfada hata: " + error);
            }
            
        }

    }//GEN-LAST:event_cikisbutonuActionPerformed

    ActionListener updateClockAction = new ActionListener(){
        public void actionPerformed(ActionEvent e){
            java.util.Date date = new java.util.Date();
            SimpleDateFormat timestamp = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String datetime = timestamp.format(date);
            date_time_current.setText(datetime); 
        }
    };
    
    private void personel_cikisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personel_cikisiActionPerformed
        // TODO add your handling code here:
        
        new Main().setVisible(false);
        dispose();
        new Login().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_personel_cikisiActionPerformed

    private void arac_girisiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arac_girisiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_arac_girisiMouseClicked

    private void arac_girisiİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_arac_girisiİtemStateChanged
        // TODO add your handling code here:
        
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            
            try {
                
                int a = ((Number)NumberFormat.getInstance().parse(item+"")).intValue();
                
                try{
                    
                    Database db = new Database();
                    Connection conn = db.Connect();

                    PreparedStatement ps = conn.prepareStatement("select * from cars");
                    ResultSet rs = ps.executeQuery();

                    ArrayList<String> alanlar = new ArrayList<String>();

                    while(rs.next()){

                        int alan = Integer.parseInt(rs.getString("alan"));

                        alanlar.add(alan+"");

                    }

                    if( ifthereis(a+"", alanlar) ){
                        this.arac_kayit.setEnabled(false);
                    }else{
                        this.arac_kayit.setEnabled(true);
                    }

                }catch(Exception error){
                    System.out.println("Anasayfada hata:" + error);
                }
                
            } catch (ParseException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_arac_girisiİtemStateChanged

    private void arac_bilgisiİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_arac_bilgisiİtemStateChanged
        // TODO add your handling code here:
        
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            
            try {
                
                int a = ((Number)NumberFormat.getInstance().parse(item+"")).intValue();
                
                try{
                    
                    Database db = new Database();
                    Connection conn = db.Connect();

                    PreparedStatement ps = conn.prepareStatement("select * from cars");
                    ResultSet rs = ps.executeQuery();

                    ArrayList<String> alanlar = new ArrayList<String>();

                    while(rs.next()){

                        int alan = Integer.parseInt(rs.getString("alan"));

                        alanlar.add(alan+"");

                    }

                    if( ifthereis(a+"", alanlar) ){
                        this.arac_getir.setEnabled(true);
                    }else{
                        this.arac_getir.setEnabled(false);
                    }

                }catch(Exception error){
                    System.out.println("Anasayfada hata:" + error);
                }
                
            } catch (ParseException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_arac_bilgisiİtemStateChanged

    private void sistemi_sifirlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sistemi_sifirlaActionPerformed
        // TODO add your handling code here:

        new Main().setVisible(false);
        new AdminAuthorization("Kurulumu Temizle").setVisible(true);
        dispose();
        
    }//GEN-LAST:event_sistemi_sifirlaActionPerformed

    private void sistemi_kapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sistemi_kapatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
        return;
    }//GEN-LAST:event_sistemi_kapatActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> arac_bilgisi;
    private javax.swing.JTextField arac_cikisi;
    private javax.swing.JButton arac_getir;
    private javax.swing.JComboBox<String> arac_girisi;
    private javax.swing.JButton arac_kayit;
    private javax.swing.JButton araclari_sifirla;
    private javax.swing.JButton cikisbutonu;
    private javax.swing.JLabel date_time_current;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton personel_cikisi;
    private javax.swing.JButton sistemi_kapat;
    private javax.swing.JButton sistemi_sifirla;
    // End of variables declaration//GEN-END:variables
}
