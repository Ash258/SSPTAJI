/*     */ package CifCount;
/*     */ 
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class CifCount_TextField extends javax.swing.JFrame
/*     */ {
/*     */   private JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JTextField jTextField1;
/*     */   
/*     */   public CifCount_TextField()
/*     */   {
/*  21 */     initComponents();
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
/*  33 */     this.jTextField1 = new JTextField();
/*  34 */     this.jButton1 = new JButton();
/*  35 */     this.jLabel1 = new JLabel();
/*     */     
/*  37 */     setDefaultCloseOperation(3);
/*     */     
/*  39 */     this.jTextField1.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  40 */     this.jTextField1.setHorizontalAlignment(0);
/*     */     
/*  42 */     this.jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  43 */     this.jButton1.setText("Test");
/*  44 */     this.jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  46 */         CifCount_TextField.this.jButton1MouseClicked(evt);
/*     */       }
/*     */       
/*  49 */     });
/*  50 */     this.jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  51 */     this.jLabel1.setHorizontalAlignment(0);
/*     */     
/*  53 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  54 */     getContentPane().setLayout(layout);
/*  55 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel1, GroupLayout.Alignment.LEADING, -1, 376, 32767).addComponent(this.jButton1, -1, 376, 32767).addComponent(this.jTextField1, GroupLayout.Alignment.LEADING, -1, 376, 32767)).addContainerGap()));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  65 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jTextField1, -2, 75, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 80, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1, -2, 72, -2).addContainerGap(-1, 32767)));
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
/*  77 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
/*  81 */     int tmp = 0;
/*     */     try {
/*  83 */       tmp = Integer.parseInt(this.jTextField1.getText());
/*     */     } catch (NumberFormatException e) {
/*  85 */       this.jLabel1.setText("Chyba");
/*  86 */       return;
/*     */     }
/*  88 */     if (tmp / 10 == 0) {
/*  89 */       this.jLabel1.setText("Jednociferne cislo");
/*  90 */     } else if (tmp / 100 == 0) {
/*  91 */       this.jLabel1.setText("Dvojciferne cislo");
/*     */     } else {
/*  93 */       this.jLabel1.setText("Viceciferne cislo");
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
/* 107 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 108 */         if ("Nimbus".equals(info.getName())) {
/* 109 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 110 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 114 */       Logger.getLogger(CifCount_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 116 */       Logger.getLogger(CifCount_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 118 */       Logger.getLogger(CifCount_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 120 */       Logger.getLogger(CifCount_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 126 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 129 */         new CifCount_TextField().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\CifCount\CifCount_TextField.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */