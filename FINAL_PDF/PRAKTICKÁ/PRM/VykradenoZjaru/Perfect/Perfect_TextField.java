/*     */ package Perfect;
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
/*     */ public class Perfect_TextField extends javax.swing.JFrame
/*     */ {
/*     */   private JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JTextField jTextField1;
/*     */   
/*     */   public Perfect_TextField()
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
/*  48 */         Perfect_TextField.this.jButton1ActionPerformed(evt);
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
/*  67 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jTextField1, -2, 82, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 74, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1, -2, 68, -2).addContainerGap(-1, 32767)));
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
/*  91 */     int divSum = 0;
/*  92 */     for (int i = 1; i < cislo; i++) {
/*  93 */       if (cislo % i == 0) {
/*  94 */         divSum += i;
/*     */       }
/*     */     }
/*  97 */     if (cislo == divSum) {
/*  98 */       this.jLabel1.setText("je dokonale");
/*     */     } else {
/* 100 */       this.jLabel1.setText("neni dokonale");
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
/* 114 */       for (UIManager.LookAndFeelInfo info : ) {
/* 115 */         if ("Nimbus".equals(info.getName())) {
/* 116 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 117 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 121 */       Logger.getLogger(Perfect_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 123 */       Logger.getLogger(Perfect_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 125 */       Logger.getLogger(Perfect_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 127 */       Logger.getLogger(Perfect_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 133 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 136 */         new Perfect_TextField().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Perfect\Perfect_TextField.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */