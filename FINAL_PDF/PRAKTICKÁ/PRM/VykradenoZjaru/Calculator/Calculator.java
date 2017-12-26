/*     */ package Calculator;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.event.MouseEvent;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class Calculator extends javax.swing.JFrame
/*     */ {
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JButton jButton3;
/*     */   private JButton jButton4;
/*     */   private javax.swing.JLabel jLabel1;
/*     */   private JTextField jTextField1;
/*     */   private JTextField jTextField2;
/*     */   
/*     */   public Calculator()
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
/*  37 */     this.jLabel1 = new javax.swing.JLabel();
/*  38 */     this.jButton1 = new JButton();
/*  39 */     this.jButton2 = new JButton();
/*  40 */     this.jButton3 = new JButton();
/*  41 */     this.jButton4 = new JButton();
/*     */     
/*  43 */     setDefaultCloseOperation(3);
/*     */     
/*  45 */     this.jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  46 */     this.jTextField1.setHorizontalAlignment(0);
/*     */     
/*  48 */     this.jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  49 */     this.jTextField2.setHorizontalAlignment(0);
/*     */     
/*  51 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  52 */     this.jLabel1.setHorizontalAlignment(0);
/*     */     
/*  54 */     this.jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  55 */     this.jButton1.setText("Rozdil");
/*  56 */     this.jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/*  58 */         Calculator.this.jButton1MouseClicked(evt);
/*     */       }
/*     */       
/*  61 */     });
/*  62 */     this.jButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  63 */     this.jButton2.setText("Soucet");
/*  64 */     this.jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/*  66 */         Calculator.this.jButton2MouseClicked(evt);
/*     */       }
/*     */       
/*  69 */     });
/*  70 */     this.jButton3.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  71 */     this.jButton3.setText("Podil");
/*  72 */     this.jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/*  74 */         Calculator.this.jButton3MouseClicked(evt);
/*     */       }
/*     */       
/*  77 */     });
/*  78 */     this.jButton4.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  79 */     this.jButton4.setText("Soucin");
/*  80 */     this.jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/*  82 */         Calculator.this.jButton4MouseClicked(evt);
/*     */       }
/*     */       
/*  85 */     });
/*  86 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  87 */     getContentPane().setLayout(layout);
/*  88 */     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jLabel1, -1, 462, 32767).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jTextField2, -2, 162, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, 32767).addComponent(this.jTextField1, -2, 162, -2)).addGroup(layout.createSequentialGroup().addComponent(this.jButton2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 98, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, 32767).addComponent(this.jButton4, -2, 102, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton3, -2, 103, -2))).addContainerGap()));
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
/* 108 */     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jTextField1, -2, 60, -2).addComponent(this.jTextField2, -2, 60, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel1, -2, 52, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jButton1, -2, 58, -2).addComponent(this.jButton2, -2, 58, -2).addComponent(this.jButton3, -2, 58, -2).addComponent(this.jButton4, -2, 58, -2)).addContainerGap(17, 32767)));
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
/* 126 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton2MouseClicked(MouseEvent evt) {
/*     */     float pom1;
/*     */     try {
/* 132 */       pom1 = Float.parseFloat(this.jTextField2.getText());
/*     */     } catch (NumberFormatException e) {
/* 134 */       this.jTextField2.setBackground(Color.RED); return;
/*     */     }
/*     */     float pom2;
/*     */     try
/*     */     {
/* 139 */       pom2 = Float.parseFloat(this.jTextField1.getText());
/*     */     } catch (NumberFormatException e) {
/* 141 */       this.jTextField1.setBackground(Color.RED);
/* 142 */       return;
/*     */     }
/* 144 */     this.jLabel1.setText(Float.toString(pom1 + pom2));
/* 145 */     this.jTextField1.setBackground(Color.WHITE);
/* 146 */     this.jTextField2.setBackground(Color.WHITE);
/*     */   }
/*     */   
/*     */   private void jButton1MouseClicked(MouseEvent evt) {
/*     */     float pom1;
/*     */     try {
/* 152 */       pom1 = Float.parseFloat(this.jTextField2.getText());
/*     */     } catch (NumberFormatException e) {
/* 154 */       this.jTextField2.setBackground(Color.RED);
/* 155 */       return;
/*     */     }
/* 157 */     this.jTextField2.setBackground(Color.WHITE);
/*     */     float pom2;
/*     */     try {
/* 160 */       pom2 = Float.parseFloat(this.jTextField1.getText());
/*     */     } catch (NumberFormatException e) {
/* 162 */       this.jTextField1.setBackground(Color.RED);
/* 163 */       return;
/*     */     }
/* 165 */     this.jTextField1.setBackground(Color.WHITE);
/* 166 */     this.jLabel1.setText(Float.toString(pom1 - pom2));
/*     */   }
/*     */   
/*     */   private void jButton4MouseClicked(MouseEvent evt) {
/* 170 */     float pom1 = 0.0F;
/*     */     try {
/* 172 */       pom1 = Float.parseFloat(this.jTextField2.getText());
/*     */     } catch (NumberFormatException e) {
/* 174 */       this.jTextField2.setBackground(Color.RED);
/* 175 */       return;
/*     */     }
/* 177 */     this.jTextField2.setBackground(Color.WHITE);
/* 178 */     float pom2 = 0.0F;
/*     */     try {
/* 180 */       pom2 = Float.parseFloat(this.jTextField1.getText());
/*     */     } catch (NumberFormatException e) {
/* 182 */       this.jTextField1.setBackground(Color.RED);
/* 183 */       return;
/*     */     }
/* 185 */     this.jTextField1.setBackground(Color.WHITE);
/* 186 */     this.jLabel1.setText(Float.toString(pom1 * pom2));
/*     */   }
/*     */   
/*     */   private void jButton3MouseClicked(MouseEvent evt) {
/*     */     float pom1;
/*     */     try {
/* 192 */       pom1 = Float.parseFloat(this.jTextField2.getText());
/*     */     } catch (NumberFormatException e) {
/* 194 */       this.jTextField2.setBackground(Color.RED);
/* 195 */       return;
/*     */     }
/* 197 */     this.jTextField2.setBackground(Color.WHITE);
/*     */     float pom2;
/*     */     try {
/* 200 */       pom2 = Float.parseFloat(this.jTextField1.getText());
/*     */     } catch (NumberFormatException e) {
/* 202 */       this.jTextField1.setBackground(Color.RED);
/* 203 */       return;
/*     */     }
/* 205 */     this.jTextField1.setBackground(Color.WHITE);
/* 206 */     this.jLabel1.setText(Float.toString(pom1 / pom2));
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
/* 219 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 220 */         if ("Nimbus".equals(info.getName())) {
/* 221 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 222 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 226 */       java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 228 */       java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 230 */       java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 232 */       java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 237 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 240 */         new Calculator().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Calculator\Calculator.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */