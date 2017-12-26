/*     */ package SudeLiche;
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
/*     */ public class SudeLiche_TextField extends javax.swing.JFrame
/*     */ {
/*     */   private JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JTextField jTextField1;
/*     */   
/*     */   public SudeLiche_TextField()
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
/*     */     
/*  44 */     this.jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  45 */     this.jButton1.setText("Test");
/*  46 */     this.jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/*  48 */         SudeLiche_TextField.this.jButton1MouseClicked(evt);
/*     */       }
/*     */       
/*  51 */     });
/*  52 */     this.jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  53 */     this.jLabel1.setHorizontalAlignment(0);
/*     */     
/*  55 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  56 */     getContentPane().setLayout(layout);
/*  57 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel1, GroupLayout.Alignment.LEADING, -1, 376, 32767).addComponent(this.jButton1, GroupLayout.Alignment.LEADING, -1, 376, 32767).addComponent(this.jTextField1, GroupLayout.Alignment.LEADING, -1, 376, 32767)).addContainerGap()));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  67 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jTextField1, -2, 77, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 78, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1, -2, 69, -2).addContainerGap(-1, 32767)));
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
/*     */   private void jButton1MouseClicked(MouseEvent evt) {
/*  83 */     int tmp = 0;
/*     */     try {
/*  85 */       tmp = Integer.parseInt(this.jTextField1.getText());
/*     */     } catch (NumberFormatException e) {
/*  87 */       this.jLabel1.setText("Chyba");
/*  88 */       return;
/*     */     }
/*  90 */     if (tmp == 0) {
/*  91 */       this.jLabel1.setText("Nula");
/*  92 */     } else if (tmp % 2 == 0) {
/*  93 */       this.jLabel1.setText("Sude cislo");
/*     */     } else {
/*  95 */       this.jLabel1.setText("Liche cislo");
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
/* 109 */       for (UIManager.LookAndFeelInfo info : ) {
/* 110 */         if ("Nimbus".equals(info.getName())) {
/* 111 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 112 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 116 */       Logger.getLogger(SudeLiche_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 118 */       Logger.getLogger(SudeLiche_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 120 */       Logger.getLogger(SudeLiche_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 122 */       Logger.getLogger(SudeLiche_TextField.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 130 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 133 */         new SudeLiche_TextField().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\SudeLiche\SudeLiche_TextField.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */