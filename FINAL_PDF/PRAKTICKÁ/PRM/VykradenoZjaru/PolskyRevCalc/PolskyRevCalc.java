/*     */ package PolskyRevCalc;
/*     */ 
/*     */ import javax.swing.JButton;
/*     */ 
/*     */ public class PolskyRevCalc extends javax.swing.JFrame {
/*     */   Stack stack;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   
/*     */   public PolskyRevCalc() {
/*  11 */     initComponents();
/*     */     
/*  13 */     this.stack = new Stack();
/*     */   }
/*     */   
/*     */   private void reDrawStack()
/*     */   {
/*  18 */     String string = "";
/*  19 */     for (Element tmp = this.stack.top(); tmp != null; tmp = tmp.getNext()) {
/*  20 */       string = string + " |" + Double.toString(tmp.getValue()) + "| ";
/*     */     }
/*  22 */     this.jLabel1.setText(string);
/*     */   }
/*     */   
/*     */   private double getOperand() {
/*  26 */     Element tmp = this.stack.pop();
/*  27 */     if (tmp == null) {
/*  28 */       throw new NullPointerException();
/*     */     }
/*  30 */     return tmp.getValue();
/*     */   }
/*     */   
/*     */   private JButton jButton3;
/*     */   private JButton jButton4;
/*     */   private JButton jButton5;
/*     */   private JButton jButton6;
/*     */   private JButton jButton7;
/*     */   private JButton jButton8;
/*     */   private javax.swing.JLabel jLabel1;
/*     */   private javax.swing.JLabel jLabel2;
/*     */   private javax.swing.JTextField jTextField1;
/*  42 */   private void initComponents() { this.jLabel1 = new javax.swing.JLabel();
/*  43 */     this.jTextField1 = new javax.swing.JTextField();
/*  44 */     this.jButton1 = new JButton();
/*  45 */     this.jButton2 = new JButton();
/*  46 */     this.jLabel2 = new javax.swing.JLabel();
/*  47 */     this.jButton3 = new JButton();
/*  48 */     this.jButton4 = new JButton();
/*  49 */     this.jButton5 = new JButton();
/*  50 */     this.jButton6 = new JButton();
/*  51 */     this.jButton7 = new JButton();
/*  52 */     this.jButton8 = new JButton();
/*     */     
/*  54 */     setDefaultCloseOperation(3);
/*     */     
/*  56 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
/*  57 */     this.jLabel1.setHorizontalAlignment(2);
/*  58 */     this.jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
/*     */     
/*  60 */     this.jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14));
/*  61 */     this.jTextField1.setHorizontalAlignment(0);
/*     */     
/*  63 */     this.jButton1.setFont(new java.awt.Font("Tahoma", 1, 14));
/*  64 */     this.jButton1.setText("Push");
/*  65 */     this.jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  67 */         PolskyRevCalc.this.jButton1MouseClicked(evt);
/*     */       }
/*     */       
/*  70 */     });
/*  71 */     this.jButton2.setFont(new java.awt.Font("Tahoma", 1, 14));
/*  72 */     this.jButton2.setText("Pop");
/*  73 */     this.jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  75 */         PolskyRevCalc.this.jButton2MouseClicked(evt);
/*     */       }
/*     */       
/*  78 */     });
/*  79 */     this.jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
/*  80 */     this.jLabel2.setHorizontalAlignment(0);
/*  81 */     this.jLabel2.setText("Top");
/*     */     
/*  83 */     this.jButton3.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  84 */     this.jButton3.setText("+");
/*  85 */     this.jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  87 */         PolskyRevCalc.this.jButton3MouseClicked(evt);
/*     */       }
/*     */       
/*  90 */     });
/*  91 */     this.jButton4.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  92 */     this.jButton4.setText("-");
/*  93 */     this.jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  95 */         PolskyRevCalc.this.jButton4MouseClicked(evt);
/*     */       }
/*     */       
/*  98 */     });
/*  99 */     this.jButton5.setFont(new java.awt.Font("Tahoma", 1, 18));
/* 100 */     this.jButton5.setText("*");
/* 101 */     this.jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/* 103 */         PolskyRevCalc.this.jButton5MouseClicked(evt);
/*     */       }
/*     */       
/* 106 */     });
/* 107 */     this.jButton6.setFont(new java.awt.Font("Tahoma", 1, 18));
/* 108 */     this.jButton6.setText("/");
/* 109 */     this.jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/* 111 */         PolskyRevCalc.this.jButton6MouseClicked(evt);
/*     */       }
/*     */       
/* 114 */     });
/* 115 */     this.jButton7.setFont(new java.awt.Font("Tahoma", 1, 18));
/* 116 */     this.jButton7.setText("Pow");
/* 117 */     this.jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/* 119 */         PolskyRevCalc.this.jButton7MouseClicked(evt);
/*     */       }
/*     */       
/* 122 */     });
/* 123 */     this.jButton8.setFont(new java.awt.Font("Tahoma", 1, 18));
/* 124 */     this.jButton8.setText("Sqrt");
/* 125 */     this.jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/* 127 */         PolskyRevCalc.this.jButton8MouseClicked(evt);
/*     */       }
/*     */       
/* 130 */     });
/* 131 */     javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
/* 132 */     getContentPane().setLayout(layout);
/* 133 */     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel2, -2, 59, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel1, -2, 324, -2)).addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(this.jTextField1).addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addGap(4, 4, 4).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addComponent(this.jButton8, -2, 93, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton7, -2, 93, -2)).addGroup(layout.createSequentialGroup().addComponent(this.jButton3, -2, 93, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton4, -2, 93, -2))))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addComponent(this.jButton5, -2, 93, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton6, -2, 93, -2)).addComponent(this.jButton1, -1, -1, 32767).addComponent(this.jButton2, -1, -1, 32767)))).addContainerGap()));
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
/* 166 */     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jTextField1, -2, 39, -2).addComponent(this.jButton1, -1, 39, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2, -2, 34, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jButton3, -2, 46, -2).addComponent(this.jButton4, -2, 46, -2).addComponent(this.jButton5, -2, 46, -2).addComponent(this.jButton6, -2, 46, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jButton7, -2, 46, -2).addComponent(this.jButton8, -2, 46, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jLabel2, -1, 43, 32767).addComponent(this.jLabel1, -1, 43, 32767)).addContainerGap()));
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
/* 192 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
/* 196 */     double tmp = 0.0D;
/*     */     try {
/* 198 */       tmp = Double.parseDouble(this.jTextField1.getText());
/*     */     } catch (NumberFormatException e) {
/* 200 */       this.jTextField1.setBackground(java.awt.Color.red);
/* 201 */       return;
/*     */     }
/* 203 */     this.stack.push(new Element(tmp));
/* 204 */     reDrawStack();
/* 205 */     this.jTextField1.setBackground(java.awt.Color.white);
/* 206 */     this.jTextField1.setText("");
/*     */   }
/*     */   
/*     */   private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {
/* 210 */     this.stack.pop();
/* 211 */     reDrawStack();
/*     */   }
/*     */   
/*     */   private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {
/* 215 */     double op1 = 0.0D;
/* 216 */     double op2 = 0.0D;
/*     */     try {
/* 218 */       op1 = getOperand();
/*     */     } catch (NullPointerException e) {
/* 220 */       return;
/*     */     }
/*     */     try {
/* 223 */       op2 = getOperand();
/*     */     } catch (NullPointerException e) {
/* 225 */       this.stack.push(new Element(op1));
/* 226 */       return;
/*     */     }
/* 228 */     this.stack.push(new Element(op1 + op2));
/* 229 */     reDrawStack();
/*     */   }
/*     */   
/*     */   private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {
/* 233 */     double op1 = 0.0D;
/* 234 */     double op2 = 0.0D;
/*     */     try {
/* 236 */       op1 = getOperand();
/*     */     } catch (NullPointerException e) {
/* 238 */       return;
/*     */     }
/*     */     try {
/* 241 */       op2 = getOperand();
/*     */     } catch (NullPointerException e) {
/* 243 */       this.stack.push(new Element(op1));
/* 244 */       return;
/*     */     }
/* 246 */     this.stack.push(new Element(op1 - op2));
/* 247 */     reDrawStack();
/*     */   }
/*     */   
/*     */   private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {
/* 251 */     double op1 = 0.0D;
/* 252 */     double op2 = 0.0D;
/*     */     try {
/* 254 */       op1 = getOperand();
/*     */     } catch (NullPointerException e) {
/* 256 */       return;
/*     */     }
/*     */     try {
/* 259 */       op2 = getOperand();
/*     */     } catch (NullPointerException e) {
/* 261 */       this.stack.push(new Element(op1));
/* 262 */       return;
/*     */     }
/* 264 */     this.stack.push(new Element(op1 * op2));
/* 265 */     reDrawStack();
/*     */   }
/*     */   
/*     */   private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {
/* 269 */     double op1 = 0.0D;
/* 270 */     double op2 = 0.0D;
/*     */     try {
/* 272 */       op1 = getOperand();
/*     */     } catch (NullPointerException e) {
/* 274 */       return;
/*     */     }
/*     */     try {
/* 277 */       op2 = getOperand();
/*     */     } catch (NullPointerException e) {
/* 279 */       this.stack.push(new Element(op1));
/* 280 */       return;
/*     */     }
/* 282 */     this.stack.push(new Element(op1 / op2));
/* 283 */     reDrawStack();
/*     */   }
/*     */   
/*     */   private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {
/* 287 */     double op = 0.0D;
/*     */     try {
/* 289 */       op = getOperand();
/*     */     } catch (NullPointerException e) {
/* 291 */       return;
/*     */     }
/* 293 */     this.stack.push(new Element(Math.sqrt(op)));
/* 294 */     reDrawStack();
/*     */   }
/*     */   
/*     */   private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {
/* 298 */     double op = 0.0D;
/*     */     try {
/* 300 */       op = getOperand();
/*     */     } catch (NullPointerException e) {
/* 302 */       return;
/*     */     }
/* 304 */     this.stack.push(new Element(Math.pow(op, 2.0D)));
/* 305 */     reDrawStack();
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
/* 318 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 319 */         if ("Nimbus".equals(info.getName())) {
/* 320 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 321 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 325 */       java.util.logging.Logger.getLogger(PolskyRevCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 327 */       java.util.logging.Logger.getLogger(PolskyRevCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 329 */       java.util.logging.Logger.getLogger(PolskyRevCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 331 */       java.util.logging.Logger.getLogger(PolskyRevCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 336 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 339 */         new PolskyRevCalc().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\PolskyRevCalc\PolskyRevCalc.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */