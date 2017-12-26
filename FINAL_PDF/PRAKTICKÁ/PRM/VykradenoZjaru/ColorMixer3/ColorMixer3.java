/*     */ package ColorMixer3;
/*     */ 
/*     */ import java.awt.event.ActionEvent;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JSlider;
/*     */ 
/*     */ public class ColorMixer3 extends javax.swing.JFrame
/*     */ {
/*     */   private int red;
/*     */   private int green;
/*     */   private int blue;
/*     */   private JCheckBox jCheckBox1;
/*     */   private JCheckBox jCheckBox2;
/*     */   private JCheckBox jCheckBox3;
/*     */   private JLabel jLabel1;
/*     */   private javax.swing.JPanel jPanel1;
/*     */   private JSlider jSlider1;
/*     */   
/*     */   public ColorMixer3()
/*     */   {
/*  26 */     initComponents();
/*  27 */     this.red = 0;
/*  28 */     this.green = 0;
/*  29 */     this.blue = 0;
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
/*  41 */     this.jCheckBox1 = new JCheckBox();
/*  42 */     this.jCheckBox2 = new JCheckBox();
/*  43 */     this.jCheckBox3 = new JCheckBox();
/*  44 */     this.jPanel1 = new javax.swing.JPanel();
/*  45 */     this.jLabel1 = new JLabel();
/*  46 */     this.jSlider1 = new JSlider();
/*     */     
/*  48 */     setDefaultCloseOperation(3);
/*     */     
/*  50 */     this.jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  51 */     this.jCheckBox1.setForeground(new java.awt.Color(255, 0, 0));
/*  52 */     this.jCheckBox1.setText("Red");
/*  53 */     this.jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  55 */         ColorMixer3.this.jCheckBox1ActionPerformed(evt);
/*     */       }
/*     */       
/*  58 */     });
/*  59 */     this.jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  60 */     this.jCheckBox2.setForeground(new java.awt.Color(0, 255, 0));
/*  61 */     this.jCheckBox2.setText("Green");
/*  62 */     this.jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  64 */         ColorMixer3.this.jCheckBox2ActionPerformed(evt);
/*     */       }
/*     */       
/*  67 */     });
/*  68 */     this.jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  69 */     this.jCheckBox3.setForeground(new java.awt.Color(0, 0, 255));
/*  70 */     this.jCheckBox3.setText("Blue");
/*  71 */     this.jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  73 */         ColorMixer3.this.jCheckBox3ActionPerformed(evt);
/*     */       }
/*     */       
/*  76 */     });
/*  77 */     this.jPanel1.setBackground(java.awt.Color.black);
/*     */     
/*  79 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  80 */     this.jPanel1.setLayout(jPanel1Layout);
/*  81 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 295, 32767));
/*     */     
/*     */ 
/*     */ 
/*  85 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 99, 32767));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  90 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  91 */     this.jLabel1.setHorizontalAlignment(0);
/*  92 */     this.jLabel1.setText("0");
/*     */     
/*  94 */     this.jSlider1.setMaximum(255);
/*  95 */     this.jSlider1.setValue(0);
/*  96 */     this.jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(javax.swing.event.ChangeEvent evt) {
/*  98 */         ColorMixer3.this.jSlider1StateChanged(evt);
/*     */       }
/*     */       
/* 101 */     });
/* 102 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 103 */     getContentPane().setLayout(layout);
/* 104 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jLabel1, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jCheckBox1, GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox2, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jCheckBox3, GroupLayout.Alignment.LEADING)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jPanel1, -1, -1, 32767).addComponent(this.jSlider1, -1, 295, 32767)).addContainerGap()));
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
/* 119 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jPanel1, GroupLayout.Alignment.LEADING, -1, -1, 32767).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(this.jCheckBox1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jCheckBox2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jCheckBox3))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jSlider1, -1, -1, 32767).addComponent(this.jLabel1, -1, 41, 32767)).addContainerGap(-1, 32767)));
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
/* 138 */     pack();
/*     */   }
/*     */   
/*     */   private void jCheckBox1ActionPerformed(ActionEvent evt) {
/* 142 */     this.jCheckBox2.setSelected(false);
/* 143 */     this.jCheckBox3.setSelected(false);
/* 144 */     this.jSlider1.setValue(this.red);
/* 145 */     this.jLabel1.setText(Integer.toString(this.red));
/*     */   }
/*     */   
/*     */   private void jCheckBox2ActionPerformed(ActionEvent evt) {
/* 149 */     this.jCheckBox1.setSelected(false);
/* 150 */     this.jCheckBox3.setSelected(false);
/* 151 */     this.jSlider1.setValue(this.green);
/* 152 */     this.jLabel1.setText(Integer.toString(this.green));
/*     */   }
/*     */   
/*     */   private void jCheckBox3ActionPerformed(ActionEvent evt) {
/* 156 */     this.jCheckBox1.setSelected(false);
/* 157 */     this.jCheckBox2.setSelected(false);
/* 158 */     this.jSlider1.setValue(this.blue);
/* 159 */     this.jLabel1.setText(Integer.toString(this.blue));
/*     */   }
/*     */   
/*     */   private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {
/* 163 */     int value = this.jSlider1.getValue();
/* 164 */     if (this.jCheckBox1.isSelected()) {
/* 165 */       this.red = value;
/* 166 */       this.jLabel1.setText(Integer.toString(this.red));
/* 167 */     } else if (this.jCheckBox2.isSelected()) {
/* 168 */       this.green = value;
/* 169 */       this.jLabel1.setText(Integer.toString(this.green));
/* 170 */     } else if (this.jCheckBox3.isSelected()) {
/* 171 */       this.blue = value;
/* 172 */       this.jLabel1.setText(Integer.toString(this.blue));
/*     */     }
/* 174 */     this.jPanel1.setBackground(new java.awt.Color(this.red, this.green, this.blue));
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
/* 187 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 188 */         if ("Nimbus".equals(info.getName())) {
/* 189 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 190 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 194 */       java.util.logging.Logger.getLogger(ColorMixer3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 196 */       java.util.logging.Logger.getLogger(ColorMixer3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 198 */       java.util.logging.Logger.getLogger(ColorMixer3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 200 */       java.util.logging.Logger.getLogger(ColorMixer3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 205 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 208 */         new ColorMixer3().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\ColorMixer3\ColorMixer3.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */