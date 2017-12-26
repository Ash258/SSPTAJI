/*     */ package FactorInteger;
/*     */ 
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class FactorInteger_Slider extends javax.swing.JFrame
/*     */ {
/*     */   private javax.swing.JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private javax.swing.JSlider jSlider1;
/*     */   
/*     */   public FactorInteger_Slider()
/*     */   {
/*  18 */     initComponents();
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
/*  30 */     this.jSlider1 = new javax.swing.JSlider();
/*  31 */     this.jLabel1 = new JLabel();
/*  32 */     this.jButton1 = new javax.swing.JButton();
/*  33 */     this.jLabel2 = new JLabel();
/*     */     
/*  35 */     setDefaultCloseOperation(3);
/*     */     
/*  37 */     this.jSlider1.setMaximum(5000);
/*  38 */     this.jSlider1.setValue(0);
/*  39 */     this.jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(javax.swing.event.ChangeEvent evt) {
/*  41 */         FactorInteger_Slider.this.jSlider1StateChanged(evt);
/*     */       }
/*     */       
/*  44 */     });
/*  45 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  46 */     this.jLabel1.setHorizontalAlignment(0);
/*  47 */     this.jLabel1.setText("0");
/*     */     
/*  49 */     this.jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  50 */     this.jButton1.setText("Test");
/*  51 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  53 */         FactorInteger_Slider.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  56 */     });
/*  57 */     this.jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
/*  58 */     this.jLabel2.setHorizontalAlignment(0);
/*     */     
/*  60 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  61 */     getContentPane().setLayout(layout);
/*  62 */     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jSlider1, -1, 380, 32767).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jButton1, -2, 98, -2).addComponent(this.jLabel1, -2, 98, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel2, -1, -1, 32767))).addContainerGap()));
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
/*  76 */     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jSlider1, -2, 33, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addComponent(this.jLabel1, -2, 44, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 51, -2)).addComponent(this.jLabel2, -1, -1, 32767)).addContainerGap(-1, 32767)));
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
/*     */ 
/*  91 */     pack();
/*     */   }
/*     */   
/*     */   private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {
/*  95 */     this.jLabel1.setText(Integer.toString(this.jSlider1.getValue()));
/*     */   }
/*     */   
/*     */   private String factorInteger(int n) {
/*  99 */     String res = "";
/* 100 */     if (n < 1) {
/* 101 */       res = "nelze  ";
/* 102 */     } else if (n == 1) {
/* 103 */       res = "1  ";
/*     */     } else {
/* 105 */       int delitel = 2;
/*     */       do {
/* 107 */         if (n % delitel == 0) {
/* 108 */           res = res + delitel + " * ";
/* 109 */           n /= delitel;
/*     */         } else {
/* 111 */           delitel++;
/*     */         }
/* 113 */       } while (n != 1);
/*     */     }
/* 115 */     return res.substring(0, res.length() - 2);
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
/* 119 */     int n = this.jSlider1.getValue();
/* 120 */     this.jLabel2.setText(factorInteger(n));
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
/* 133 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 134 */         if ("Nimbus".equals(info.getName())) {
/* 135 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 136 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 140 */       Logger.getLogger(FactorInteger_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 142 */       Logger.getLogger(FactorInteger_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 144 */       Logger.getLogger(FactorInteger_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 146 */       Logger.getLogger(FactorInteger_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 151 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 153 */         new FactorInteger_Slider().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\FactorInteger\FactorInteger_Slider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */