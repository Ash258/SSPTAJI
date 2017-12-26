/*     */ package KladneZaporne;
/*     */ 
/*     */ import java.awt.event.MouseEvent;
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
/*     */ public class KladneZaporne_TextField extends javax.swing.JFrame
/*     */ {
/*     */   private JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JTextField jTextField1;
/*     */   
/*     */   public KladneZaporne_TextField()
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
/*  41 */     this.jTextField1.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  42 */     this.jTextField1.setHorizontalAlignment(0);
/*  43 */     this.jTextField1.setToolTipText("");
/*     */     
/*  45 */     this.jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  46 */     this.jButton1.setText("Test");
/*  47 */     this.jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/*  49 */         KladneZaporne_TextField.this.jButton1MouseClicked(evt);
/*     */       }
/*     */       
/*  52 */     });
/*  53 */     this.jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  54 */     this.jLabel1.setHorizontalAlignment(0);
/*     */     
/*  56 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  57 */     getContentPane().setLayout(layout);
/*  58 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel1, GroupLayout.Alignment.LEADING, -1, 376, 32767).addComponent(this.jButton1, GroupLayout.Alignment.LEADING, -1, 376, 32767).addComponent(this.jTextField1, GroupLayout.Alignment.LEADING, -1, 376, 32767)).addContainerGap()));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  68 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jTextField1, -2, 74, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 78, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1, -2, 77, -2).addContainerGap(-1, 32767)));
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
/*  80 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1MouseClicked(MouseEvent evt) {
/*  84 */     int tmp = 0;
/*     */     try {
/*  86 */       tmp = Integer.parseInt(this.jTextField1.getText());
/*     */     } catch (NumberFormatException e) {
/*  88 */       this.jLabel1.setText("Chyba");
/*  89 */       return;
/*     */     }
/*  91 */     if (tmp > 0) {
/*  92 */       this.jLabel1.setText("Kladne cislo");
/*  93 */     } else if (tmp < 0) {
/*  94 */       this.jLabel1.setText("Zaporne cislo");
/*     */     } else {
/*  96 */       this.jLabel1.setText("Nula");
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
/* 110 */       for (UIManager.LookAndFeelInfo info : ) {
/* 111 */         if ("Nimbus".equals(info.getName())) {
/* 112 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 113 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 117 */       Logger.getLogger(KladneZaporne_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 119 */       Logger.getLogger(KladneZaporne_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 121 */       Logger.getLogger(KladneZaporne_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 123 */       Logger.getLogger(KladneZaporne_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 134 */         new KladneZaporne_TextField().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\KladneZaporne\KladneZaporne_TextField.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */