/*     */ package Vzorecky;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class vst extends javax.swing.JFrame
/*     */ {
/*     */   private javax.swing.JButton jButton1;
/*     */   private javax.swing.JButton jButton2;
/*     */   private javax.swing.JLabel jLabel1;
/*     */   private javax.swing.JLabel jLabel2;
/*     */   private javax.swing.JLabel jLabel3;
/*     */   private JTextField jTextField1;
/*     */   private JTextField jTextField2;
/*     */   private JTextField jTextField3;
/*     */   
/*     */   public vst()
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
/*  36 */     this.jTextField2 = new JTextField();
/*  37 */     this.jTextField3 = new JTextField();
/*  38 */     this.jLabel1 = new javax.swing.JLabel();
/*  39 */     this.jLabel2 = new javax.swing.JLabel();
/*  40 */     this.jLabel3 = new javax.swing.JLabel();
/*  41 */     this.jButton1 = new javax.swing.JButton();
/*  42 */     this.jButton2 = new javax.swing.JButton();
/*     */     
/*  44 */     setDefaultCloseOperation(3);
/*     */     
/*  46 */     this.jTextField1.setHorizontalAlignment(0);
/*  47 */     this.jTextField1.setName("rychlost");
/*  48 */     this.jTextField1.setOpaque(false);
/*     */     
/*  50 */     this.jTextField2.setHorizontalAlignment(0);
/*  51 */     this.jTextField2.setName("vzdalenost");
/*     */     
/*  53 */     this.jTextField3.setHorizontalAlignment(0);
/*  54 */     this.jTextField3.setName("cas");
/*     */     
/*  56 */     this.jLabel1.setText("rychlost [m/s]");
/*     */     
/*  58 */     this.jLabel2.setText("vzdalenost [m]");
/*     */     
/*  60 */     this.jLabel3.setText("cas [s]");
/*     */     
/*  62 */     this.jButton1.setText("Pocitej");
/*  63 */     this.jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  65 */         vst.this.jButton1MouseClicked(evt);
/*     */       }
/*     */       
/*  68 */     });
/*  69 */     this.jButton2.setText("Reset");
/*  70 */     this.jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  72 */         vst.this.jButton2MouseClicked(evt);
/*     */       }
/*     */       
/*  75 */     });
/*  76 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  77 */     getContentPane().setLayout(layout);
/*  78 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jButton1, GroupLayout.Alignment.LEADING, -1, 175, 32767).addComponent(this.jLabel1, -1, 175, 32767).addComponent(this.jLabel2, -1, 175, 32767).addComponent(this.jLabel3, GroupLayout.Alignment.LEADING, -1, 175, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton2, -1, -1, 32767).addComponent(this.jTextField3).addComponent(this.jTextField2).addComponent(this.jTextField1, -1, 189, 32767)).addContainerGap()));
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
/*     */ 
/*     */ 
/*  95 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jLabel1, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jTextField1, GroupLayout.Alignment.LEADING, -1, 48, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField2, -2, 46, -2).addComponent(this.jLabel2, -1, 48, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField3, -2, 45, -2).addComponent(this.jLabel3, -1, 48, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton2, -1, -1, 32767).addComponent(this.jButton1, -1, 70, 32767)).addContainerGap()));
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 117 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1MouseClicked(java.awt.event.MouseEvent evt)
/*     */   {
/* 122 */     if ((this.jTextField1.getText().equals("")) && (!this.jTextField2.getText().equals("")) && (!this.jTextField3.getText().equals(""))) {
/*     */       float vzdalenost;
/*     */       float cas;
/*     */       try {
/* 126 */         vzdalenost = Float.parseFloat(this.jTextField2.getText());
/* 127 */         cas = Float.parseFloat(this.jTextField3.getText());
/*     */       } catch (NumberFormatException e) {
/* 129 */         return;
/*     */       }
/* 131 */       this.jTextField1.setText(Float.toString(vzdalenost / cas));
/* 132 */       this.jTextField1.setBackground(Color.GREEN);
/* 133 */       this.jTextField2.setBackground(Color.WHITE);
/* 134 */       this.jTextField3.setBackground(Color.WHITE);
/* 135 */     } else if ((!this.jTextField1.getText().equals("")) && (this.jTextField2.getText().equals("")) && (!this.jTextField3.getText().equals(""))) {
/*     */       float rychlost;
/*     */       float cas;
/*     */       try {
/* 139 */         rychlost = Float.parseFloat(this.jTextField1.getText());
/* 140 */         cas = Float.parseFloat(this.jTextField3.getText());
/*     */       } catch (NumberFormatException e) {
/* 142 */         return;
/*     */       }
/* 144 */       this.jTextField2.setText(Float.toString(rychlost * cas));
/* 145 */       this.jTextField1.setBackground(Color.WHITE);
/* 146 */       this.jTextField2.setBackground(Color.GREEN);
/* 147 */       this.jTextField3.setBackground(Color.WHITE);
/* 148 */     } else if ((!this.jTextField1.getText().equals("")) && (!this.jTextField2.getText().equals("")) && (this.jTextField3.getText().equals(""))) {
/*     */       float rychlost;
/*     */       float vzdalenost;
/*     */       try {
/* 152 */         rychlost = Float.parseFloat(this.jTextField1.getText());
/* 153 */         vzdalenost = Float.parseFloat(this.jTextField2.getText());
/*     */       } catch (NumberFormatException e) {
/* 155 */         return;
/*     */       }
/* 157 */       this.jTextField3.setText(Float.toString(vzdalenost / rychlost));
/* 158 */       this.jTextField1.setBackground(Color.WHITE);
/* 159 */       this.jTextField2.setBackground(Color.WHITE);
/* 160 */       this.jTextField3.setBackground(Color.GREEN);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
/* 165 */     this.jTextField1.setText("");
/* 166 */     this.jTextField2.setText("");
/* 167 */     this.jTextField3.setText("");
/* 168 */     this.jTextField1.setBackground(Color.WHITE);
/* 169 */     this.jTextField2.setBackground(Color.WHITE);
/* 170 */     this.jTextField3.setBackground(Color.WHITE);
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
/* 183 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 184 */         if ("Nimbus".equals(info.getName())) {
/* 185 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 186 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 190 */       java.util.logging.Logger.getLogger(vst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 192 */       java.util.logging.Logger.getLogger(vst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 194 */       java.util.logging.Logger.getLogger(vst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 196 */       java.util.logging.Logger.getLogger(vst.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 201 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 204 */         new vst().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Vzorecky\vst.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */