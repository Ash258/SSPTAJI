/*     */ package Counter_Color;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ 
/*     */ public class Counter_Color extends javax.swing.JFrame
/*     */ {
/*     */   private byte count;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JLabel jLabel1;
/*     */   private JPanel jPanel1;
/*     */   
/*     */   public Counter_Color()
/*     */   {
/*  24 */     this.count = 0;
/*  25 */     initComponents();
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
/*  37 */     this.jButton1 = new JButton();
/*  38 */     this.jButton2 = new JButton();
/*  39 */     this.jPanel1 = new JPanel();
/*  40 */     this.jLabel1 = new JLabel();
/*     */     
/*  42 */     setDefaultCloseOperation(3);
/*     */     
/*  44 */     this.jButton1.setText("Pridat");
/*  45 */     this.jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/*  47 */         Counter_Color.this.jButton1MouseClicked(evt);
/*     */       }
/*     */       
/*  50 */     });
/*  51 */     this.jButton2.setText("Ubrat");
/*  52 */     this.jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/*  54 */         Counter_Color.this.jButton2MouseClicked(evt);
/*     */       }
/*     */       
/*  57 */     });
/*  58 */     this.jPanel1.setBackground(new Color(255, 255, 0));
/*     */     
/*  60 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
/*  61 */     this.jLabel1.setHorizontalAlignment(0);
/*  62 */     this.jLabel1.setText("0");
/*     */     
/*  64 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  65 */     this.jPanel1.setLayout(jPanel1Layout);
/*  66 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(-1, 32767).addComponent(this.jLabel1, -2, 136, -2).addGap(76, 76, 76)));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  73 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(42, 32767).addComponent(this.jLabel1, -2, 57, -2).addGap(33, 33, 33)));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  81 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  82 */     getContentPane().setLayout(layout);
/*  83 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jButton1, -2, 146, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jButton2, -2, 146, -2)).addComponent(this.jPanel1, GroupLayout.Alignment.TRAILING, -1, -1, 32767)).addContainerGap()));
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
/*  95 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -1, -1, 32767).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1, -2, 56, -2).addComponent(this.jButton2, -2, 56, -2)).addContainerGap()));
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
/* 107 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1MouseClicked(MouseEvent evt) {
/* 111 */     if (this.count < 10) {
/* 112 */       this.count = ((byte)(this.count + 1));
/*     */     }
/* 114 */     this.jLabel1.setText(Integer.toString(this.count));
/* 115 */     if (this.count < -3) {
/* 116 */       this.jPanel1.setBackground(Color.CYAN);
/* 117 */     } else if (this.count < 4) {
/* 118 */       this.jPanel1.setBackground(Color.YELLOW);
/*     */     } else {
/* 120 */       this.jPanel1.setBackground(Color.MAGENTA);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton2MouseClicked(MouseEvent evt) {
/* 125 */     if (this.count > -10) {
/* 126 */       this.count = ((byte)(this.count - 1));
/*     */     }
/* 128 */     this.jLabel1.setText(Integer.toString(this.count));
/* 129 */     if (this.count < -3) {
/* 130 */       this.jPanel1.setBackground(Color.CYAN);
/* 131 */     } else if (this.count < 4) {
/* 132 */       this.jPanel1.setBackground(Color.YELLOW);
/*     */     } else {
/* 134 */       this.jPanel1.setBackground(Color.MAGENTA);
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
/* 148 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 149 */         if ("Nimbus".equals(info.getName())) {
/* 150 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 151 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 155 */       Logger.getLogger(Counter_Color.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 157 */       Logger.getLogger(Counter_Color.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 159 */       Logger.getLogger(Counter_Color.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 161 */       Logger.getLogger(Counter_Color.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 167 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 170 */         new Counter_Color().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Counter_Color\Counter_Color.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */