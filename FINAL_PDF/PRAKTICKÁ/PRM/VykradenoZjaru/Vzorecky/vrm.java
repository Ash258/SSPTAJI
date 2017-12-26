/*     */ package Vzorecky;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class vrm extends javax.swing.JFrame
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
/*     */   public vrm()
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
/*  35 */     this.jTextField2 = new JTextField();
/*  36 */     this.jTextField3 = new JTextField();
/*  37 */     this.jLabel1 = new javax.swing.JLabel();
/*  38 */     this.jLabel2 = new javax.swing.JLabel();
/*  39 */     this.jLabel3 = new javax.swing.JLabel();
/*  40 */     this.jButton1 = new javax.swing.JButton();
/*  41 */     this.jButton2 = new javax.swing.JButton();
/*  42 */     this.jTextField1 = new JTextField();
/*     */     
/*  44 */     setDefaultCloseOperation(3);
/*     */     
/*  46 */     this.jTextField2.setHorizontalAlignment(0);
/*  47 */     this.jTextField2.setName("vzdalenost");
/*     */     
/*  49 */     this.jTextField3.setHorizontalAlignment(0);
/*  50 */     this.jTextField3.setName("cas");
/*     */     
/*  52 */     this.jLabel1.setText("<html>hustota [kg/m<sup>3</sup>]</html>");
/*     */     
/*  54 */     this.jLabel2.setText("hmotnost [kg]");
/*     */     
/*  56 */     this.jLabel3.setText("<html>objem [m<sup>3</sup>]</html>");
/*     */     
/*  58 */     this.jButton1.setText("Pocitej");
/*  59 */     this.jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  61 */         vrm.this.jButton1MouseClicked(evt);
/*     */       }
/*     */       
/*  64 */     });
/*  65 */     this.jButton2.setText("Reset");
/*  66 */     this.jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  68 */         vrm.this.jButton2MouseClicked(evt);
/*     */       }
/*     */       
/*  71 */     });
/*  72 */     this.jTextField1.setHorizontalAlignment(0);
/*     */     
/*  74 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  75 */     getContentPane().setLayout(layout);
/*  76 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton1, -1, 178, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jLabel3, GroupLayout.Alignment.LEADING).addComponent(this.jLabel2, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jLabel1, GroupLayout.Alignment.LEADING, -1, 169, 32767))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextField1, -1, 186, 32767).addComponent(this.jButton2, -1, 186, 32767).addComponent(this.jTextField3, -1, 186, 32767).addComponent(this.jTextField2, GroupLayout.Alignment.TRAILING, -1, 186, 32767)).addContainerGap()));
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
/*  94 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTextField1, -1, 47, 32767).addComponent(this.jLabel1, -1, 47, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField2, -2, 46, -2).addComponent(this.jLabel2, -1, 48, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField3, -2, 45, -2).addComponent(this.jLabel3, -1, 48, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton2, -1, -1, 32767).addComponent(this.jButton1, -1, 70, 32767)).addContainerGap()));
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
/* 116 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
/* 120 */     this.jTextField1.setBackground(Color.WHITE);
/* 121 */     this.jTextField2.setBackground(Color.WHITE);
/* 122 */     this.jTextField3.setBackground(Color.WHITE);
/* 123 */     if ((this.jTextField1.getText().equals("")) && (!this.jTextField2.getText().equals("")) && (!this.jTextField3.getText().equals(""))) {
/*     */       float hmotnost;
/*     */       float objem;
/*     */       try {
/* 127 */         hmotnost = Float.parseFloat(this.jTextField2.getText());
/* 128 */         objem = Float.parseFloat(this.jTextField3.getText());
/*     */       } catch (NumberFormatException e) {
/* 130 */         this.jTextField2.setBackground(Color.RED);
/* 131 */         this.jTextField3.setBackground(Color.RED);
/* 132 */         return;
/*     */       }
/* 134 */       this.jTextField1.setText(Float.toString(hmotnost / objem));
/* 135 */       this.jTextField1.setBackground(Color.GREEN);
/* 136 */       this.jTextField2.setBackground(Color.WHITE);
/* 137 */       this.jTextField3.setBackground(Color.WHITE);
/* 138 */     } else if ((!this.jTextField1.getText().equals("")) && (this.jTextField2.getText().equals("")) && (!this.jTextField3.getText().equals(""))) {
/*     */       float hustota;
/*     */       float objem;
/*     */       try {
/* 142 */         hustota = Float.parseFloat(this.jTextField1.getText());
/* 143 */         objem = Float.parseFloat(this.jTextField3.getText());
/*     */       } catch (NumberFormatException e) {
/* 145 */         this.jTextField1.setBackground(Color.RED);
/* 146 */         this.jTextField3.setBackground(Color.RED);
/* 147 */         return;
/*     */       }
/* 149 */       this.jTextField2.setText(Float.toString(hustota * objem));
/* 150 */       this.jTextField1.setBackground(Color.WHITE);
/* 151 */       this.jTextField2.setBackground(Color.GREEN);
/* 152 */       this.jTextField3.setBackground(Color.WHITE);
/* 153 */     } else if ((!this.jTextField1.getText().equals("")) && (!this.jTextField2.getText().equals("")) && (this.jTextField3.getText().equals(""))) {
/*     */       float hustota;
/*     */       float hmotnost;
/*     */       try {
/* 157 */         hustota = Float.parseFloat(this.jTextField1.getText());
/* 158 */         hmotnost = Float.parseFloat(this.jTextField2.getText());
/*     */       } catch (NumberFormatException e) {
/* 160 */         this.jTextField1.setBackground(Color.RED);
/* 161 */         this.jTextField2.setBackground(Color.RED);
/* 162 */         return;
/*     */       }
/* 164 */       this.jTextField3.setText(Float.toString(hmotnost / hustota));
/* 165 */       this.jTextField1.setBackground(Color.WHITE);
/* 166 */       this.jTextField2.setBackground(Color.WHITE);
/* 167 */       this.jTextField3.setBackground(Color.GREEN);
/*     */     } else {
/* 169 */       this.jTextField1.setBackground(Color.RED);
/* 170 */       this.jTextField2.setBackground(Color.RED);
/* 171 */       this.jTextField3.setBackground(Color.RED);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
/* 176 */     this.jTextField1.setText("");
/* 177 */     this.jTextField2.setText("");
/* 178 */     this.jTextField3.setText("");
/* 179 */     this.jTextField1.setBackground(Color.WHITE);
/* 180 */     this.jTextField2.setBackground(Color.WHITE);
/* 181 */     this.jTextField3.setBackground(Color.WHITE);
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
/* 194 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 195 */         if ("Nimbus".equals(info.getName())) {
/* 196 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 197 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 201 */       java.util.logging.Logger.getLogger(vrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 203 */       java.util.logging.Logger.getLogger(vrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 205 */       java.util.logging.Logger.getLogger(vrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 207 */       java.util.logging.Logger.getLogger(vrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 212 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 215 */         new vrm().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Vzorecky\vrm.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */