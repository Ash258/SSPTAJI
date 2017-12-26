/*     */ package Slider_Color;
/*     */ 
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JSlider;
/*     */ 
/*     */ public class Slider_Color extends javax.swing.JFrame
/*     */ {
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JLabel jLabel1;
/*     */   private javax.swing.JPanel jPanel1;
/*     */   private JSlider jSlider1;
/*     */   
/*     */   public Slider_Color()
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
/*  35 */     this.jButton1 = new JButton();
/*  36 */     this.jButton2 = new JButton();
/*  37 */     this.jSlider1 = new JSlider();
/*  38 */     this.jPanel1 = new javax.swing.JPanel();
/*  39 */     this.jLabel1 = new JLabel();
/*     */     
/*  41 */     setDefaultCloseOperation(3);
/*     */     
/*  43 */     this.jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  44 */     this.jButton1.setText("Min");
/*  45 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  47 */         Slider_Color.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  50 */     });
/*  51 */     this.jButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  52 */     this.jButton2.setText("Max");
/*  53 */     this.jButton2.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  55 */         Slider_Color.this.jButton2ActionPerformed(evt);
/*     */       }
/*     */       
/*  58 */     });
/*  59 */     this.jSlider1.setMaximum(10);
/*  60 */     this.jSlider1.setValue(0);
/*  61 */     this.jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(javax.swing.event.ChangeEvent evt) {
/*  63 */         Slider_Color.this.jSlider1StateChanged(evt);
/*     */       }
/*     */       
/*  66 */     });
/*  67 */     this.jPanel1.setBackground(new java.awt.Color(0, 0, 255));
/*     */     
/*  69 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  70 */     this.jLabel1.setHorizontalAlignment(0);
/*  71 */     this.jLabel1.setText("0");
/*     */     
/*  73 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  74 */     this.jPanel1.setLayout(jPanel1Layout);
/*  75 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1, -1, 360, 32767).addContainerGap()));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  82 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1, -1, 78, 32767).addContainerGap()));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  90 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  91 */     getContentPane().setLayout(layout);
/*  92 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.jButton1, -2, 88, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jSlider1, -1, 192, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2, -2, 88, -2))).addContainerGap()));
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
/* 106 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(7, 7, 7).addComponent(this.jPanel1, -2, -1, -2).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1, -2, 54, -2).addComponent(this.jButton2, -2, 54, -2)).addGroup(layout.createSequentialGroup().addGap(22, 22, 22).addComponent(this.jSlider1, -2, -1, -2))).addContainerGap(-1, 32767)));
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
/* 121 */     pack();
/*     */   }
/*     */   
/*     */   private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {
/* 125 */     if (this.jSlider1.getValue() > 5) {
/* 126 */       this.jPanel1.setBackground(java.awt.Color.RED);
/*     */     } else {
/* 128 */       this.jPanel1.setBackground(java.awt.Color.BLUE);
/*     */     }
/* 130 */     this.jLabel1.setText(Integer.toString(this.jSlider1.getValue()));
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 134 */     this.jSlider1.setValue(this.jSlider1.getMinimum());
/*     */   }
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 138 */     this.jSlider1.setValue(this.jSlider1.getMaximum());
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
/* 151 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 152 */         if ("Nimbus".equals(info.getName())) {
/* 153 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 154 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 158 */       Logger.getLogger(Slider_Color.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 160 */       Logger.getLogger(Slider_Color.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 162 */       Logger.getLogger(Slider_Color.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 164 */       Logger.getLogger(Slider_Color.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 170 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 173 */         new Slider_Color().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Slider_Color\Slider_Color.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */