/*     */ package Prime;
/*     */ 
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class Prime_Slider extends javax.swing.JFrame
/*     */ {
/*     */   private javax.swing.JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private javax.swing.JSlider jSlider1;
/*     */   
/*     */   public Prime_Slider()
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
/*  41 */         Prime_Slider.this.jSlider1StateChanged(evt);
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
/*  53 */         Prime_Slider.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  56 */     });
/*  57 */     this.jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  58 */     this.jLabel2.setHorizontalAlignment(0);
/*     */     
/*  60 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  61 */     getContentPane().setLayout(layout);
/*  62 */     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jSlider1, -1, 380, 32767).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jButton1, -2, 110, -2).addComponent(this.jLabel1, -2, 110, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel2, -1, -1, 32767))).addContainerGap()));
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
/*  76 */     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jSlider1, -2, 45, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addComponent(this.jLabel1, -2, 44, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 47, -2)).addComponent(this.jLabel2, -1, -1, 32767)).addContainerGap(-1, 32767)));
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
/*     */   private boolean isPrime(int n) {
/*  99 */     if (n < 2)
/* 100 */       return false;
/* 101 */     if (n == 2)
/* 102 */       return true;
/* 103 */     if (n % 2 == 0) {
/* 104 */       return false;
/*     */     }
/* 106 */     int sqrt = (int)Math.sqrt(n) + 1;
/* 107 */     for (int i = 3; i < sqrt; i += 2) {
/* 108 */       if (n % i == 0) {
/* 109 */         return false;
/*     */       }
/*     */     }
/* 112 */     return true;
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
/*     */   {
/* 117 */     int n = this.jSlider1.getValue();
/* 118 */     if (isPrime(n)) {
/* 119 */       this.jLabel2.setText("Cislo: " + n + " JE Provocislo");
/*     */     } else {
/* 121 */       this.jLabel2.setText("Cislo: " + n + " NENI Provocislo");
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
/* 135 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 136 */         if ("Nimbus".equals(info.getName())) {
/* 137 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 138 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 142 */       Logger.getLogger(Prime_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 144 */       Logger.getLogger(Prime_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 146 */       Logger.getLogger(Prime_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 148 */       Logger.getLogger(Prime_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 153 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 155 */         new Prime_Slider().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Prime\Prime_Slider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */