/*     */ package ColorMixer2;
/*     */ 
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JRadioButton;
/*     */ import javax.swing.JSlider;
/*     */ import javax.swing.event.ChangeEvent;
/*     */ 
/*     */ public class ColorMixer2 extends javax.swing.JFrame
/*     */ {
/*     */   private int red;
/*     */   private int green;
/*     */   private int blue;
/*     */   private JLabel jLabel1;
/*     */   private javax.swing.JPanel jPanel1;
/*     */   private JRadioButton jRadioButton1;
/*     */   private JRadioButton jRadioButton2;
/*     */   private JRadioButton jRadioButton3;
/*     */   private JSlider jSlider1;
/*     */   
/*     */   public ColorMixer2()
/*     */   {
/*  27 */     initComponents();
/*  28 */     this.red = 0;
/*  29 */     this.green = 0;
/*  30 */     this.blue = 0;
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
/*  42 */     this.jRadioButton1 = new JRadioButton();
/*  43 */     this.jRadioButton2 = new JRadioButton();
/*  44 */     this.jRadioButton3 = new JRadioButton();
/*  45 */     this.jPanel1 = new javax.swing.JPanel();
/*  46 */     this.jLabel1 = new JLabel();
/*  47 */     this.jSlider1 = new JSlider();
/*     */     
/*  49 */     setDefaultCloseOperation(3);
/*     */     
/*  51 */     this.jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  52 */     this.jRadioButton1.setForeground(new java.awt.Color(255, 0, 0));
/*  53 */     this.jRadioButton1.setSelected(true);
/*  54 */     this.jRadioButton1.setText("Red");
/*  55 */     this.jRadioButton1.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/*  57 */         ColorMixer2.this.jRadioButton1StateChanged(evt);
/*     */       }
/*     */       
/*  60 */     });
/*  61 */     this.jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  62 */     this.jRadioButton2.setForeground(new java.awt.Color(0, 0, 255));
/*  63 */     this.jRadioButton2.setText("Blue");
/*  64 */     this.jRadioButton2.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/*  66 */         ColorMixer2.this.jRadioButton2StateChanged(evt);
/*     */       }
/*     */       
/*  69 */     });
/*  70 */     this.jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  71 */     this.jRadioButton3.setForeground(new java.awt.Color(0, 255, 0));
/*  72 */     this.jRadioButton3.setText("Green");
/*  73 */     this.jRadioButton3.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/*  75 */         ColorMixer2.this.jRadioButton3StateChanged(evt);
/*     */       }
/*     */       
/*  78 */     });
/*  79 */     this.jPanel1.setBackground(new java.awt.Color(0, 0, 0));
/*     */     
/*  81 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  82 */     this.jPanel1.setLayout(jPanel1Layout);
/*  83 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 289, 32767));
/*     */     
/*     */ 
/*     */ 
/*  87 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 100, 32767));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  92 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  93 */     this.jLabel1.setHorizontalAlignment(0);
/*  94 */     this.jLabel1.setText("0");
/*     */     
/*  96 */     this.jSlider1.setMaximum(255);
/*  97 */     this.jSlider1.setValue(0);
/*  98 */     this.jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/* 100 */         ColorMixer2.this.jSlider1StateChanged(evt);
/*     */       }
/*     */       
/* 103 */     });
/* 104 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 105 */     getContentPane().setLayout(layout);
/* 106 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jLabel1, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jRadioButton3, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jRadioButton2, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jRadioButton1, GroupLayout.Alignment.LEADING, -1, -1, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jSlider1, -1, 289, 32767).addComponent(this.jPanel1, -1, -1, 32767)).addContainerGap()));
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
/* 121 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -2, -1, -2).addGroup(layout.createSequentialGroup().addComponent(this.jRadioButton1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jRadioButton2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jRadioButton3))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jSlider1, -1, -1, 32767).addComponent(this.jLabel1, -1, 37, 32767))));
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
/* 139 */     pack();
/*     */   }
/*     */   
/*     */   private void jRadioButton1StateChanged(ChangeEvent evt) {
/* 143 */     if (this.jRadioButton1.isSelected()) {
/* 144 */       this.jRadioButton2.setSelected(false);
/* 145 */       this.jRadioButton3.setSelected(false);
/* 146 */       this.jSlider1.setValue(this.red);
/* 147 */       this.jLabel1.setText(Integer.toString(this.red));
/*     */     }
/*     */   }
/*     */   
/*     */   private void jRadioButton2StateChanged(ChangeEvent evt) {
/* 152 */     if (this.jRadioButton2.isSelected()) {
/* 153 */       this.jRadioButton1.setSelected(false);
/* 154 */       this.jRadioButton3.setSelected(false);
/* 155 */       this.jSlider1.setValue(this.blue);
/* 156 */       this.jLabel1.setText(Integer.toString(this.blue));
/*     */     }
/*     */   }
/*     */   
/*     */   private void jRadioButton3StateChanged(ChangeEvent evt) {
/* 161 */     if (this.jRadioButton3.isSelected()) {
/* 162 */       this.jRadioButton1.setSelected(false);
/* 163 */       this.jRadioButton2.setSelected(false);
/* 164 */       this.jSlider1.setValue(this.green);
/* 165 */       this.jLabel1.setText(Integer.toString(this.green));
/*     */     }
/*     */   }
/*     */   
/*     */   private void jSlider1StateChanged(ChangeEvent evt) {
/* 170 */     if (this.jRadioButton1.isSelected()) {
/* 171 */       this.red = this.jSlider1.getValue();
/* 172 */       this.jLabel1.setText(Integer.toString(this.red));
/* 173 */     } else if (this.jRadioButton2.isSelected()) {
/* 174 */       this.blue = this.jSlider1.getValue();
/* 175 */       this.jLabel1.setText(Integer.toString(this.blue));
/* 176 */     } else if (this.jRadioButton3.isSelected()) {
/* 177 */       this.green = this.jSlider1.getValue();
/* 178 */       this.jLabel1.setText(Integer.toString(this.green));
/*     */     }
/* 180 */     this.jPanel1.setBackground(new java.awt.Color(this.red, this.green, this.blue));
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
/* 193 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 194 */         if ("Nimbus".equals(info.getName())) {
/* 195 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 196 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 200 */       Logger.getLogger(ColorMixer2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 202 */       Logger.getLogger(ColorMixer2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 204 */       Logger.getLogger(ColorMixer2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 206 */       Logger.getLogger(ColorMixer2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 211 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 214 */         new ColorMixer2().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\ColorMixer2\ColorMixer2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */