/*     */ package FactorInteger;
/*     */ 
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.UIManager.LookAndFeelInfo;
/*     */ 
/*     */ public class FactorInteger_TextField extends javax.swing.JFrame
/*     */ {
/*     */   private JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JTextField jTextField1;
/*     */   
/*     */   public FactorInteger_TextField()
/*     */   {
/*  23 */     initComponents();
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
/*  35 */     this.jTextField1 = new JTextField();
/*  36 */     this.jButton1 = new JButton();
/*  37 */     this.jLabel1 = new JLabel();
/*     */     
/*  39 */     setDefaultCloseOperation(3);
/*     */     
/*  41 */     this.jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  42 */     this.jTextField1.setHorizontalAlignment(0);
/*     */     
/*  44 */     this.jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  45 */     this.jButton1.setText("Test");
/*  46 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  48 */         FactorInteger_TextField.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  51 */     });
/*  52 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  53 */     this.jLabel1.setHorizontalAlignment(0);
/*     */     
/*  55 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  56 */     getContentPane().setLayout(layout);
/*  57 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel1, GroupLayout.Alignment.LEADING, -1, 380, 32767).addComponent(this.jButton1, GroupLayout.Alignment.LEADING, -1, 380, 32767).addComponent(this.jTextField1, GroupLayout.Alignment.LEADING, -1, 380, 32767)).addContainerGap()));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jTextField1, -2, 77, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 81, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1, -2, 81, -2).addContainerGap(-1, 32767)));
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
/*  79 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/*  83 */     int cislo = 0;
/*     */     try {
/*  85 */       cislo = Integer.parseInt(this.jTextField1.getText());
/*     */     } catch (NumberFormatException e) {
/*  87 */       this.jTextField1.setBackground(java.awt.Color.red);
/*  88 */       return;
/*     */     }
/*  90 */     this.jTextField1.setBackground(java.awt.Color.white);
/*  91 */     String res = "";
/*  92 */     if (cislo < 1) {
/*  93 */       res = "nelze  ";
/*  94 */     } else if (cislo == 1) {
/*  95 */       res = "1  ";
/*     */     } else {
/*  97 */       int delitel = 2;
/*     */       do {
/*  99 */         if (cislo % delitel == 0) {
/* 100 */           res = res + delitel + " * ";
/* 101 */           cislo /= delitel;
/*     */         } else {
/* 103 */           delitel++;
/*     */         }
/* 105 */       } while (cislo != 1);
/*     */     }
/* 107 */     this.jLabel1.setText(res.substring(0, res.length() - 2));
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
/* 120 */       for (UIManager.LookAndFeelInfo info : ) {
/* 121 */         if ("Nimbus".equals(info.getName())) {
/* 122 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 123 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 127 */       Logger.getLogger(FactorInteger_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 129 */       Logger.getLogger(FactorInteger_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 131 */       Logger.getLogger(FactorInteger_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 133 */       Logger.getLogger(FactorInteger_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 139 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 142 */         new FactorInteger_TextField().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\FactorInteger\FactorInteger_TextField.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */