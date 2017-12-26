/*     */ package Perfect;
/*     */ 
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class Perfect_Slider extends javax.swing.JFrame
/*     */ {
/*     */   private javax.swing.JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private javax.swing.JSlider jSlider1;
/*     */   
/*     */   public Perfect_Slider()
/*     */   {
/*  18 */     initComponents();
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
/*  30 */     this.jSlider1 = new javax.swing.JSlider();
/*  31 */     this.jLabel1 = new JLabel();
/*  32 */     this.jButton1 = new javax.swing.JButton();
/*  33 */     this.jLabel2 = new JLabel();
/*     */     
/*  35 */     setDefaultCloseOperation(3);
/*     */     
/*  37 */     this.jSlider1.setMaximum(5000);
/*  38 */     this.jSlider1.setValue(0);
/*  39 */     this.jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(javax.swing.event.ChangeEvent evt) {
/*  41 */         Perfect_Slider.this.jSlider1StateChanged(evt);
/*     */       }
/*     */       
/*  44 */     });
/*  45 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  46 */     this.jLabel1.setHorizontalAlignment(0);
/*  47 */     this.jLabel1.setText("0");
/*     */     
/*  49 */     this.jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  50 */     this.jButton1.setText("Test");
/*  51 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  53 */         Perfect_Slider.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  56 */     });
/*  57 */     this.jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  58 */     this.jLabel2.setHorizontalAlignment(0);
/*     */     
/*  60 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  61 */     getContentPane().setLayout(layout);
/*  62 */     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jSlider1, -1, 380, 32767).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jLabel1, -2, 113, -2).addComponent(this.jButton1, -2, 113, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel2, -1, -1, 32767))).addContainerGap()));
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
/*  76 */     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jSlider1, -2, 34, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addComponent(this.jLabel1, -2, 41, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 53, -2)).addComponent(this.jLabel2, -1, -1, 32767)).addContainerGap(-1, 32767)));
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
/*  91 */     pack();
/*     */   }
/*     */   
/*     */   private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {
/*  95 */     this.jLabel1.setText(Integer.toString(this.jSlider1.getValue()));
/*     */   }
/*     */   
/*     */   private boolean isPerfect(int n) {
/*  99 */     if (n < 1) {
/* 100 */       return false;
/*     */     }
/* 102 */     int divSum = 0;
/* 103 */     for (int i = 1; i < n; i++) {
/* 104 */       if (n % i == 0) {
/* 105 */         divSum += i;
/*     */       }
/*     */     }
/* 108 */     if (divSum == n) {
/* 109 */       return true;
/*     */     }
/* 111 */     return false;
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
/*     */   {
/* 116 */     int n = this.jSlider1.getValue();
/* 117 */     if (isPerfect(n)) {
/* 118 */       this.jLabel2.setText("Cislo: " + n + " JE Dokonale");
/*     */     } else {
/* 120 */       this.jLabel2.setText("Cislo: " + n + " NENI Dokonale");
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
/* 134 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 135 */         if ("Nimbus".equals(info.getName())) {
/* 136 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 137 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 141 */       Logger.getLogger(Perfect_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 143 */       Logger.getLogger(Perfect_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 145 */       Logger.getLogger(Perfect_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 147 */       Logger.getLogger(Perfect_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 152 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 154 */         new Perfect_Slider().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Perfect\Perfect_Slider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */