/*     */ package CifCount;
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
/*     */ public class CifCount_TextField2 extends javax.swing.JFrame
/*     */ {
/*     */   private JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JTextField jTextField1;
/*     */   
/*     */   public CifCount_TextField2()
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
/*  48 */         CifCount_TextField2.this.jButton1ActionPerformed(evt);
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
/*  67 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jTextField1, -2, 79, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 77, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1, -2, 71, -2).addContainerGap(-1, 32767)));
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
/*  91 */     int cifCount = 1;
/*  92 */     while (cislo >= 10) {
/*  93 */       cislo /= 10;
/*  94 */       cifCount++;
/*     */     }
/*  96 */     this.jLabel1.setText(Integer.toString(cifCount));
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
/* 109 */       for (UIManager.LookAndFeelInfo info : ) {
/* 110 */         if ("Nimbus".equals(info.getName())) {
/* 111 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 112 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 116 */       Logger.getLogger(CifCount_TextField2.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 118 */       Logger.getLogger(CifCount_TextField2.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 120 */       Logger.getLogger(CifCount_TextField2.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 122 */       Logger.getLogger(CifCount_TextField2.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 128 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 131 */         new CifCount_TextField2().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\CifCount\CifCount_TextField2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */