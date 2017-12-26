/*     */ package Mobil;
/*     */ 
/*     */ import javax.swing.JButton;
/*     */ 
/*     */ public class Mobil extends javax.swing.JFrame {
/*     */   private int lastClick;
/*     */   private int lastPos;
/*     */   private boolean alphanum;
/*     */   private JButton jButton1;
/*     */   private JButton jButton10;
/*     */   private JButton jButton11;
/*     */   private JButton jButton12;
/*     */   private JButton jButton2;
/*     */   private JButton jButton3;
/*     */   private JButton jButton4;
/*     */   private JButton jButton5;
/*     */   private JButton jButton6;
/*     */   private JButton jButton7;
/*     */   private JButton jButton8;
/*     */   private JButton jButton9;
/*     */   private javax.swing.JLabel jLabel1;
/*     */   
/*     */   public Mobil() {
/*  24 */     initComponents();
/*  25 */     this.lastClick = -1;
/*  26 */     this.lastPos = 0;
/*  27 */     this.alphanum = true;
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
/*  39 */     this.jLabel1 = new javax.swing.JLabel();
/*  40 */     this.jButton1 = new JButton();
/*  41 */     this.jButton2 = new JButton();
/*  42 */     this.jButton3 = new JButton();
/*  43 */     this.jButton4 = new JButton();
/*  44 */     this.jButton5 = new JButton();
/*  45 */     this.jButton6 = new JButton();
/*  46 */     this.jButton7 = new JButton();
/*  47 */     this.jButton8 = new JButton();
/*  48 */     this.jButton9 = new JButton();
/*  49 */     this.jButton10 = new JButton();
/*  50 */     this.jButton11 = new JButton();
/*  51 */     this.jButton12 = new JButton();
/*     */     
/*  53 */     setDefaultCloseOperation(3);
/*  54 */     setTitle("mobil");
/*     */     
/*  56 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  57 */     this.jLabel1.setHorizontalAlignment(0);
/*     */     
/*  59 */     this.jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  60 */     this.jButton1.setText("1.,-");
/*  61 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  63 */         Mobil.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  66 */     });
/*  67 */     this.jButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  68 */     this.jButton2.setText("2ABC");
/*  69 */     this.jButton2.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  71 */         Mobil.this.jButton2ActionPerformed(evt);
/*     */       }
/*     */       
/*  74 */     });
/*  75 */     this.jButton3.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  76 */     this.jButton3.setText("3DEF");
/*  77 */     this.jButton3.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  79 */         Mobil.this.jButton3ActionPerformed(evt);
/*     */       }
/*     */       
/*  82 */     });
/*  83 */     this.jButton4.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  84 */     this.jButton4.setText("4GHI");
/*  85 */     this.jButton4.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  87 */         Mobil.this.jButton4ActionPerformed(evt);
/*     */       }
/*     */       
/*  90 */     });
/*  91 */     this.jButton5.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  92 */     this.jButton5.setText("5JKL");
/*  93 */     this.jButton5.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  95 */         Mobil.this.jButton5ActionPerformed(evt);
/*     */       }
/*     */       
/*  98 */     });
/*  99 */     this.jButton6.setFont(new java.awt.Font("Tahoma", 1, 18));
/* 100 */     this.jButton6.setText("6MNO");
/* 101 */     this.jButton6.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 103 */         Mobil.this.jButton6ActionPerformed(evt);
/*     */       }
/*     */       
/* 106 */     });
/* 107 */     this.jButton7.setFont(new java.awt.Font("Tahoma", 1, 18));
/* 108 */     this.jButton7.setText("7PQRS");
/* 109 */     this.jButton7.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 111 */         Mobil.this.jButton7ActionPerformed(evt);
/*     */       }
/*     */       
/* 114 */     });
/* 115 */     this.jButton8.setFont(new java.awt.Font("Tahoma", 1, 18));
/* 116 */     this.jButton8.setText("8TUV");
/* 117 */     this.jButton8.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 119 */         Mobil.this.jButton8ActionPerformed(evt);
/*     */       }
/*     */       
/* 122 */     });
/* 123 */     this.jButton9.setFont(new java.awt.Font("Tahoma", 1, 18));
/* 124 */     this.jButton9.setText("9WXYZ");
/* 125 */     this.jButton9.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 127 */         Mobil.this.jButton9ActionPerformed(evt);
/*     */       }
/*     */       
/* 130 */     });
/* 131 */     this.jButton10.setFont(new java.awt.Font("Tahoma", 1, 18));
/* 132 */     this.jButton10.setText("*");
/* 133 */     this.jButton10.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 135 */         Mobil.this.jButton10ActionPerformed(evt);
/*     */       }
/*     */       
/* 138 */     });
/* 139 */     this.jButton11.setFont(new java.awt.Font("Tahoma", 1, 18));
/* 140 */     this.jButton11.setText("0");
/* 141 */     this.jButton11.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 143 */         Mobil.this.jButton11ActionPerformed(evt);
/*     */       }
/*     */       
/* 146 */     });
/* 147 */     this.jButton12.setFont(new java.awt.Font("Tahoma", 1, 18));
/* 148 */     this.jButton12.setText("#");
/* 149 */     this.jButton12.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/* 151 */         Mobil.this.jButton12ActionPerformed(evt);
/*     */       }
/*     */       
/* 154 */     });
/* 155 */     javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
/* 156 */     getContentPane().setLayout(layout);
/* 157 */     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jButton1, -2, 106, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2, -2, 106, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton3, -2, 106, -2)).addComponent(this.jLabel1, -1, -1, 32767).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jButton4, -2, 106, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton5, -2, 106, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton6, -2, 106, -2)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jButton7, -2, 106, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton8, -2, 106, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton9, -2, 106, -2)).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jButton10, -2, 106, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton11, -2, 106, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton12, -2, 106, -2))).addContainerGap()));
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
/* 189 */     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1, -2, 91, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jButton1, -2, 47, -2).addComponent(this.jButton2, -2, 47, -2).addComponent(this.jButton3, -2, 47, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jButton4, -2, 47, -2).addComponent(this.jButton6, -2, 47, -2).addComponent(this.jButton5, -2, 47, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jButton7, -2, 47, -2).addComponent(this.jButton9, -2, 47, -2).addComponent(this.jButton8, -2, 47, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jButton10, -2, 47, -2).addComponent(this.jButton12, -2, 47, -2).addComponent(this.jButton11, -2, 47, -2)).addContainerGap(-1, 32767)));
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
/* 217 */     pack();
/*     */   }
/*     */   
/*     */   private void displej(char[] znaky, int tlacitko) {
/* 221 */     if ((this.lastClick == tlacitko) && (this.alphanum)) {
/* 222 */       this.lastPos = (++this.lastPos % znaky.length);
/* 223 */       String display = this.jLabel1.getText();
/* 224 */       display = display.substring(0, display.length() - 1) + znaky[this.lastPos];
/* 225 */       this.jLabel1.setText(display);
/*     */     } else {
/* 227 */       this.lastPos = 0;
/* 228 */       if (this.alphanum) {
/* 229 */         this.jLabel1.setText(this.jLabel1.getText() + znaky[0]);
/*     */       } else {
/* 231 */         this.jLabel1.setText(this.jLabel1.getText() + Integer.toString(tlacitko));
/*     */       }
/* 233 */       this.lastClick = tlacitko;
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
/* 238 */     char[] znaky = { '.', ',', '-' };
/* 239 */     displej(znaky, 1);
/*     */   }
/*     */   
/*     */   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
/* 243 */     char[] znaky = { 'a', 'b', 'c' };
/* 244 */     displej(znaky, 2);
/*     */   }
/*     */   
/*     */   private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
/* 248 */     char[] znaky = { 'd', 'e', 'f' };
/* 249 */     displej(znaky, 3);
/*     */   }
/*     */   
/*     */   private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
/* 253 */     char[] znaky = { 'g', 'h', 'i' };
/* 254 */     displej(znaky, 4);
/*     */   }
/*     */   
/*     */   private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
/* 258 */     char[] znaky = { 'j', 'k', 'l' };
/* 259 */     displej(znaky, 5);
/*     */   }
/*     */   
/*     */   private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
/* 263 */     char[] znaky = { 'm', 'n', 'o' };
/* 264 */     displej(znaky, 6);
/*     */   }
/*     */   
/*     */   private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
/* 268 */     char[] znaky = { 'p', 'q', 'r', 's' };
/* 269 */     displej(znaky, 7);
/*     */   }
/*     */   
/*     */   private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
/* 273 */     char[] znaky = { 't', 'u', 'v' };
/* 274 */     displej(znaky, 8);
/*     */   }
/*     */   
/*     */   private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
/* 278 */     char[] znaky = { 'w', 'x', 'y', 'z' };
/* 279 */     displej(znaky, 9);
/*     */   }
/*     */   
/*     */   private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
/* 283 */     this.lastClick = -1;
/*     */   }
/*     */   
/*     */   private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
/* 287 */     char[] znaky = { ' ' };
/* 288 */     displej(znaky, 0);
/*     */   }
/*     */   
/*     */   private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
/* 292 */     this.alphanum = (!this.alphanum);
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
/* 305 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 306 */         if ("Nimbus".equals(info.getName())) {
/* 307 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 308 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 312 */       java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 314 */       java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 316 */       java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 318 */       java.util.logging.Logger.getLogger(Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 323 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 326 */         new Mobil().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Mobil\Mobil.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */