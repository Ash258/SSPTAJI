/*     */ package Horner;
/*     */ 
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ 
/*     */ public class Horner
/*     */   extends javax.swing.JFrame
/*     */ {
/*     */   private javax.swing.JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   private JLabel jLabel5;
/*     */   private JTextField jTextField1;
/*     */   private JTextField jTextField10;
/*     */   private JTextField jTextField11;
/*     */   
/*  23 */   public Horner() { initComponents(); }
/*     */   
/*     */   private JTextField jTextField12;
/*     */   private JTextField jTextField2;
/*     */   private JTextField jTextField3;
/*     */   private JTextField jTextField4;
/*     */   private JTextField jTextField5;
/*     */   private JTextField jTextField6;
/*     */   private JTextField jTextField7;
/*     */   private JTextField jTextField8;
/*     */   private JTextField jTextField9;
/*     */   private void initComponents() {
/*  35 */     this.jLabel1 = new JLabel();
/*  36 */     this.jLabel2 = new JLabel();
/*  37 */     this.jLabel3 = new JLabel();
/*  38 */     this.jLabel4 = new JLabel();
/*  39 */     this.jLabel5 = new JLabel();
/*  40 */     this.jTextField1 = new JTextField();
/*  41 */     this.jTextField2 = new JTextField();
/*  42 */     this.jTextField3 = new JTextField();
/*  43 */     this.jTextField4 = new JTextField();
/*  44 */     this.jTextField5 = new JTextField();
/*  45 */     this.jTextField6 = new JTextField();
/*  46 */     this.jTextField7 = new JTextField();
/*  47 */     this.jTextField8 = new JTextField();
/*  48 */     this.jTextField9 = new JTextField();
/*  49 */     this.jTextField10 = new JTextField();
/*  50 */     this.jTextField11 = new JTextField();
/*  51 */     this.jTextField12 = new JTextField();
/*  52 */     this.jButton1 = new javax.swing.JButton();
/*     */     
/*  54 */     setDefaultCloseOperation(3);
/*     */     
/*  56 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  57 */     this.jLabel1.setHorizontalAlignment(0);
/*  58 */     this.jLabel1.setText("X0");
/*     */     
/*  60 */     this.jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  61 */     this.jLabel2.setHorizontalAlignment(0);
/*  62 */     this.jLabel2.setText("X^0");
/*     */     
/*  64 */     this.jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  65 */     this.jLabel3.setHorizontalAlignment(0);
/*  66 */     this.jLabel3.setText("X^3");
/*     */     
/*  68 */     this.jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  69 */     this.jLabel4.setHorizontalAlignment(0);
/*  70 */     this.jLabel4.setText("X^1");
/*     */     
/*  72 */     this.jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  73 */     this.jLabel5.setHorizontalAlignment(0);
/*  74 */     this.jLabel5.setText("X^2");
/*     */     
/*  76 */     this.jTextField1.setHorizontalAlignment(0);
/*  77 */     this.jTextField1.setName("x");
/*     */     
/*  79 */     this.jTextField2.setHorizontalAlignment(0);
/*  80 */     this.jTextField2.setName("x31");
/*     */     
/*  82 */     this.jTextField3.setHorizontalAlignment(0);
/*  83 */     this.jTextField3.setName("x21");
/*     */     
/*  85 */     this.jTextField4.setHorizontalAlignment(0);
/*  86 */     this.jTextField4.setName("x11");
/*     */     
/*  88 */     this.jTextField5.setHorizontalAlignment(0);
/*  89 */     this.jTextField5.setName("x01");
/*     */     
/*  91 */     this.jTextField6.setEditable(false);
/*  92 */     this.jTextField6.setHorizontalAlignment(0);
/*  93 */     this.jTextField6.setName("x12");
/*     */     
/*  95 */     this.jTextField7.setEditable(false);
/*  96 */     this.jTextField7.setHorizontalAlignment(0);
/*  97 */     this.jTextField7.setName("x22");
/*     */     
/*  99 */     this.jTextField8.setEditable(false);
/* 100 */     this.jTextField8.setHorizontalAlignment(0);
/* 101 */     this.jTextField8.setName("x02");
/*     */     
/* 103 */     this.jTextField9.setEditable(false);
/* 104 */     this.jTextField9.setHorizontalAlignment(0);
/* 105 */     this.jTextField9.setName("x03");
/*     */     
/* 107 */     this.jTextField10.setEditable(false);
/* 108 */     this.jTextField10.setHorizontalAlignment(0);
/* 109 */     this.jTextField10.setName("x13");
/*     */     
/* 111 */     this.jTextField11.setEditable(false);
/* 112 */     this.jTextField11.setHorizontalAlignment(0);
/* 113 */     this.jTextField11.setName("x23");
/*     */     
/* 115 */     this.jTextField12.setEditable(false);
/* 116 */     this.jTextField12.setHorizontalAlignment(0);
/* 117 */     this.jTextField12.setName("x33");
/*     */     
/* 119 */     this.jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
/* 120 */     this.jButton1.setText("Pocitej");
/* 121 */     this.jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/* 123 */         Horner.this.jButton1MouseClicked(evt);
/*     */       }
/*     */       
/* 126 */     });
/* 127 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 128 */     getContentPane().setLayout(layout);
/* 129 */     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.jButton1, javax.swing.GroupLayout.Alignment.LEADING, -1, 475, 32767).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.jTextField1, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, 32767).addComponent(this.jLabel1, javax.swing.GroupLayout.Alignment.LEADING, -2, 48, -2)).addGap(60, 60, 60).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(this.jTextField9).addComponent(this.jTextField2).addComponent(this.jLabel3, -1, 48, 32767)).addGap(60, 60, 60).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(this.jTextField3).addComponent(this.jLabel5, -1, 48, 32767).addComponent(this.jTextField10, javax.swing.GroupLayout.Alignment.LEADING, -1, 48, 32767).addComponent(this.jTextField6)).addGap(60, 60, 60).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(this.jTextField11).addComponent(this.jTextField7).addComponent(this.jTextField4).addComponent(this.jLabel4, -1, 48, 32767)).addGap(55, 55, 55).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(this.jTextField12).addComponent(this.jTextField8, javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jTextField5).addComponent(this.jLabel2, -1, 48, 32767)))).addContainerGap()));
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
/* 164 */     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1, -2, 48, -2).addComponent(this.jLabel3, -2, 48, -2).addComponent(this.jLabel5, -2, 48, -2).addComponent(this.jLabel4, -2, 48, -2).addComponent(this.jLabel2, -2, 48, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jTextField1, -2, 42, -2).addComponent(this.jTextField2, -2, 42, -2).addComponent(this.jTextField3, -2, 42, -2).addComponent(this.jTextField4, -2, 42, -2).addComponent(this.jTextField5, -2, 42, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jTextField8, -2, 42, -2).addComponent(this.jTextField6, -2, 42, -2).addComponent(this.jTextField7, -2, 42, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jTextField12, -2, 42, -2).addComponent(this.jTextField9, -2, 42, -2).addComponent(this.jTextField10, -2, 42, -2).addComponent(this.jTextField11, -2, 42, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 41, -2).addContainerGap(-1, 32767)));
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
/* 197 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
/* 201 */     float x = 0.0F;
/* 202 */     float x3 = 0.0F;
/* 203 */     float x2 = 0.0F;
/* 204 */     float x1 = 0.0F;
/* 205 */     float x0 = 0.0F;
/*     */     try
/*     */     {
/* 208 */       x = Float.parseFloat(this.jTextField1.getText());
/*     */     } catch (NumberFormatException e) {
/* 210 */       this.jTextField1.setBackground(java.awt.Color.red);
/* 211 */       return;
/*     */     }
/*     */     try {
/* 214 */       x3 = Float.parseFloat(this.jTextField2.getText());
/*     */     } catch (NumberFormatException e) {
/* 216 */       this.jTextField2.setBackground(java.awt.Color.red);
/* 217 */       return;
/*     */     }
/*     */     try {
/* 220 */       x2 = Float.parseFloat(this.jTextField3.getText());
/*     */     } catch (NumberFormatException e) {
/* 222 */       this.jTextField3.setBackground(java.awt.Color.red);
/* 223 */       return;
/*     */     }
/*     */     try {
/* 226 */       x1 = Float.parseFloat(this.jTextField4.getText());
/*     */     } catch (NumberFormatException e) {
/* 228 */       this.jTextField4.setBackground(java.awt.Color.red);
/* 229 */       return;
/*     */     }
/*     */     try {
/* 232 */       x0 = Float.parseFloat(this.jTextField5.getText());
/*     */     } catch (NumberFormatException e) {
/* 234 */       this.jTextField5.setBackground(java.awt.Color.red);
/* 235 */       return;
/*     */     }
/*     */     
/* 238 */     this.jTextField9.setText(Float.toString(x3));
/* 239 */     this.jTextField6.setText(Float.toString(x * Float.parseFloat(this.jTextField9.getText())));
/* 240 */     this.jTextField10.setText(Float.toString(Float.parseFloat(this.jTextField3.getText()) + Float.parseFloat(this.jTextField6.getText())));
/* 241 */     this.jTextField7.setText(Float.toString(x * Float.parseFloat(this.jTextField10.getText())));
/* 242 */     this.jTextField11.setText(Float.toString(Float.parseFloat(this.jTextField4.getText()) + Float.parseFloat(this.jTextField7.getText())));
/* 243 */     this.jTextField8.setText(Float.toString(x * Float.parseFloat(this.jTextField11.getText())));
/* 244 */     this.jTextField12.setText(Float.toString(Float.parseFloat(this.jTextField5.getText()) + Float.parseFloat(this.jTextField8.getText())));
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
/* 257 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 258 */         if ("Nimbus".equals(info.getName())) {
/* 259 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 260 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 264 */       java.util.logging.Logger.getLogger(Horner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 266 */       java.util.logging.Logger.getLogger(Horner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 268 */       java.util.logging.Logger.getLogger(Horner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 270 */       java.util.logging.Logger.getLogger(Horner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 275 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 278 */         new Horner().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Horner\Horner.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */