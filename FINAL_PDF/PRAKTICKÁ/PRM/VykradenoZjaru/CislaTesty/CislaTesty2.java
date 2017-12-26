/*     */ package CislaTesty;
/*     */ 
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JRadioButton;
/*     */ 
/*     */ public class CislaTesty2 extends javax.swing.JFrame
/*     */ {
/*     */   private javax.swing.ButtonGroup buttonGroup1;
/*     */   private javax.swing.JButton jButton1;
/*     */   private javax.swing.JLabel jLabel1;
/*     */   private JRadioButton jRadioButton1;
/*     */   private JRadioButton jRadioButton2;
/*     */   private JRadioButton jRadioButton3;
/*     */   private JRadioButton jRadioButton4;
/*     */   private javax.swing.JTextField jTextField1;
/*     */   
/*     */   public CislaTesty2()
/*     */   {
/*  20 */     initComponents();
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
/*  32 */     this.buttonGroup1 = new javax.swing.ButtonGroup();
/*  33 */     this.jTextField1 = new javax.swing.JTextField();
/*  34 */     this.jRadioButton1 = new JRadioButton();
/*  35 */     this.jRadioButton2 = new JRadioButton();
/*  36 */     this.jRadioButton3 = new JRadioButton();
/*  37 */     this.jRadioButton4 = new JRadioButton();
/*  38 */     this.jButton1 = new javax.swing.JButton();
/*  39 */     this.jLabel1 = new javax.swing.JLabel();
/*     */     
/*  41 */     setDefaultCloseOperation(3);
/*     */     
/*  43 */     this.jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  44 */     this.jTextField1.setHorizontalAlignment(0);
/*     */     
/*  46 */     this.buttonGroup1.add(this.jRadioButton1);
/*  47 */     this.jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  48 */     this.jRadioButton1.setSelected(true);
/*  49 */     this.jRadioButton1.setText("kladna/zaporna");
/*     */     
/*  51 */     this.buttonGroup1.add(this.jRadioButton2);
/*  52 */     this.jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  53 */     this.jRadioButton2.setText("suda/licha");
/*     */     
/*  55 */     this.buttonGroup1.add(this.jRadioButton3);
/*  56 */     this.jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  57 */     this.jRadioButton3.setText("pocet cifer");
/*     */     
/*  59 */     this.buttonGroup1.add(this.jRadioButton4);
/*  60 */     this.jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  61 */     this.jRadioButton4.setText("soucet cifer");
/*     */     
/*  63 */     this.jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  64 */     this.jButton1.setText("Test");
/*  65 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  67 */         CislaTesty2.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  70 */     });
/*  71 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  72 */     this.jLabel1.setHorizontalAlignment(0);
/*     */     
/*  74 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  75 */     getContentPane().setLayout(layout);
/*  76 */     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jLabel1, -1, -1, 32767).addComponent(this.jTextField1, javax.swing.GroupLayout.Alignment.TRAILING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addComponent(this.jButton1, -1, 205, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.jRadioButton4).addComponent(this.jRadioButton3).addComponent(this.jRadioButton2).addComponent(this.jRadioButton1)))).addContainerGap()));
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
/*  93 */     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jTextField1, -2, 79, -2).addGap(18, 18, 18).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addComponent(this.jRadioButton1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jRadioButton2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jRadioButton3).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jRadioButton4)).addComponent(this.jButton1, -1, -1, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1, -1, 73, 32767).addContainerGap()));
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
/* 114 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
/* 118 */     this.jTextField1.setBackground(java.awt.Color.white);
/* 119 */     this.jLabel1.setText("");
/* 120 */     int cislo = 0;
/*     */     try {
/* 122 */       cislo = Integer.parseInt(this.jTextField1.getText());
/*     */     } catch (NumberFormatException e) {
/* 124 */       this.jTextField1.setBackground(java.awt.Color.red);
/* 125 */       return;
/*     */     }
/* 127 */     if (this.jRadioButton1.isSelected()) {
/* 128 */       if (cislo > 0) {
/* 129 */         this.jLabel1.setText("Kladne");
/* 130 */       } else if (cislo < 0) {
/* 131 */         this.jLabel1.setText("Zaporne");
/*     */       } else {
/* 133 */         this.jLabel1.setText("Nula");
/*     */       }
/* 135 */     } else if (this.jRadioButton2.isSelected()) {
/* 136 */       if (cislo % 2 == 0) {
/* 137 */         this.jLabel1.setText("Sude");
/*     */       } else {
/* 139 */         this.jLabel1.setText("Liche");
/*     */       }
/* 141 */     } else if (this.jRadioButton3.isSelected()) {
/* 142 */       int pocet = 0;
/* 143 */       cislo = Math.abs(cislo);
/* 144 */       if (cislo == 0) {
/* 145 */         this.jLabel1.setText("1");
/*     */       } else {
/* 147 */         while (cislo > 0) {
/* 148 */           pocet++;
/* 149 */           cislo /= 10;
/*     */         }
/* 151 */         this.jLabel1.setText(Integer.toString(pocet));
/*     */       }
/* 153 */     } else if (this.jRadioButton4.isSelected()) {
/* 154 */       int soucet = 0;
/* 155 */       cislo = Math.abs(cislo);
/* 156 */       while (cislo > 0) {
/* 157 */         soucet += cislo % 10;
/* 158 */         cislo /= 10;
/*     */       }
/* 160 */       this.jLabel1.setText(Integer.toString(soucet));
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
/* 174 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 175 */         if ("Nimbus".equals(info.getName())) {
/* 176 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 177 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 181 */       java.util.logging.Logger.getLogger(CislaTesty2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 183 */       java.util.logging.Logger.getLogger(CislaTesty2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 185 */       java.util.logging.Logger.getLogger(CislaTesty2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 187 */       java.util.logging.Logger.getLogger(CislaTesty2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 192 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 194 */         new CislaTesty2().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\CislaTesty\CislaTesty2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */