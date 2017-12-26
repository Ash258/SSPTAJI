/*     */ package CislaTesty;
/*     */ 
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class CislaTesty extends javax.swing.JFrame
/*     */ {
/*     */   private javax.swing.JButton jButton1;
/*     */   private JComboBox jComboBox1;
/*     */   private JLabel jLabel1;
/*     */   private JTextField jTextField1;
/*     */   
/*     */   public CislaTesty()
/*     */   {
/*  20 */     initComponents();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   private void initComponents()
/*     */   {
/*  32 */     this.jTextField1 = new JTextField();
/*  33 */     this.jButton1 = new javax.swing.JButton();
/*  34 */     this.jComboBox1 = new JComboBox();
/*  35 */     this.jLabel1 = new JLabel();
/*     */     
/*  37 */     setDefaultCloseOperation(3);
/*     */     
/*  39 */     this.jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  40 */     this.jTextField1.setHorizontalAlignment(0);
/*     */     
/*  42 */     this.jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  43 */     this.jButton1.setText("Test");
/*  44 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  46 */         CislaTesty.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  49 */     });
/*  50 */     this.jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  51 */     this.jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kladne / Zaporne", "Sude / Liche", "Pocet cifer", "Soucet cifer" }));
/*     */     
/*  53 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  54 */     this.jLabel1.setHorizontalAlignment(0);
/*     */     
/*  56 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  57 */     getContentPane().setLayout(layout);
/*  58 */     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jLabel1, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.jButton1, -2, 196, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jComboBox1, 0, 178, 32767)).addComponent(this.jTextField1)).addContainerGap()));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  71 */     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jTextField1, -2, 78, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(this.jButton1, -1, 66, 32767).addComponent(this.jComboBox1)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1, -1, 68, 32767).addContainerGap()));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
/*  89 */     this.jTextField1.setBackground(java.awt.Color.white);
/*  90 */     this.jLabel1.setText("");
/*  91 */     int cislo = 0;
/*     */     try {
/*  93 */       cislo = Integer.parseInt(this.jTextField1.getText());
/*     */     } catch (NumberFormatException e) {
/*  95 */       this.jTextField1.setBackground(java.awt.Color.red);
/*  96 */       return;
/*     */     }
/*  98 */     String volba = (String)this.jComboBox1.getSelectedItem();
/*  99 */     switch (volba) {
/*     */     case "Kladne / Zaporne": 
/* 101 */       if (cislo > 0) {
/* 102 */         this.jLabel1.setText("Kladne");
/* 103 */       } else if (cislo < 0) {
/* 104 */         this.jLabel1.setText("Zaporne");
/*     */       } else {
/* 106 */         this.jLabel1.setText("Nula");
/*     */       }
/* 108 */       break;
/*     */     case "Sude / Liche": 
/* 110 */       if (cislo % 2 == 0) {
/* 111 */         this.jLabel1.setText("Sude");
/*     */       } else {
/* 113 */         this.jLabel1.setText("Liche");
/*     */       }
/* 115 */       break;
/*     */     case "Pocet cifer": 
/* 117 */       int pocet = 0;
/* 118 */       cislo = Math.abs(cislo);
/* 119 */       if (cislo == 0) {
/* 120 */         this.jLabel1.setText("1");
/*     */       } else {
/* 122 */         while (cislo > 0) {
/* 123 */           pocet++;
/* 124 */           cislo /= 10;
/*     */         }
/* 126 */         this.jLabel1.setText(Integer.toString(pocet));
/*     */       }
/* 128 */       break;
/*     */     case "Soucet cifer": 
/* 130 */       int soucet = 0;
/* 131 */       cislo = Math.abs(cislo);
/* 132 */       while (cislo > 0) {
/* 133 */         soucet += cislo % 10;
/* 134 */         cislo /= 10;
/*     */       }
/* 136 */       this.jLabel1.setText(Integer.toString(soucet));
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public static void main(String[] args)
/*     */   {
/*     */     try
/*     */     {
/* 151 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 152 */         if ("Nimbus".equals(info.getName())) {
/* 153 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 154 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 158 */       Logger.getLogger(CislaTesty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 160 */       Logger.getLogger(CislaTesty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 162 */       Logger.getLogger(CislaTesty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 164 */       Logger.getLogger(CislaTesty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 169 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 171 */         new CislaTesty().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\CislaTesty\CislaTesty.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */