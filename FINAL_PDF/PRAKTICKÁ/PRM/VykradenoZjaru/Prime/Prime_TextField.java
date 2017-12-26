/*     */ package Prime;
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
/*     */ public class Prime_TextField extends javax.swing.JFrame
/*     */ {
/*     */   private JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JTextField jTextField1;
/*     */   
/*     */   public Prime_TextField()
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
/*  48 */         Prime_TextField.this.jButton1ActionPerformed(evt);
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
/*  67 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jTextField1, -2, 81, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 80, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1, -2, 78, -2).addContainerGap(-1, 32767)));
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
/*  91 */     if (cislo < 1) {
/*  92 */       this.jLabel1.setText("nelze");
/*  93 */     } else if (cislo == 1) {
/*  94 */       this.jLabel1.setText("neni prvocislo");
/*  95 */     } else if (cislo == 2) {
/*  96 */       this.jLabel1.setText("je prvocislo");
/*     */     } else {
/*  98 */       for (int i = 2; i <= Math.sqrt(cislo); i++) {
/*  99 */         if (cislo % i == 0) {
/* 100 */           this.jLabel1.setText("neni prvocislo");
/* 101 */           return;
/*     */         }
/*     */       }
/* 104 */       this.jLabel1.setText("je prvocislo");
/*     */     }
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
/* 118 */       for (UIManager.LookAndFeelInfo info : ) {
/* 119 */         if ("Nimbus".equals(info.getName())) {
/* 120 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 121 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 125 */       Logger.getLogger(Prime_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 127 */       Logger.getLogger(Prime_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 129 */       Logger.getLogger(Prime_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 131 */       Logger.getLogger(Prime_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 137 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 140 */         new Prime_TextField().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Prime\Prime_TextField.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */