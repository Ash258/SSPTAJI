/*     */ package Prime;
/*     */ 
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class MersenePrime_Slider extends javax.swing.JFrame
/*     */ {
/*     */   private javax.swing.JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private javax.swing.JSlider jSlider1;
/*     */   
/*     */   public MersenePrime_Slider()
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
/*  32 */     this.jLabel2 = new JLabel();
/*  33 */     this.jButton1 = new javax.swing.JButton();
/*     */     
/*  35 */     setDefaultCloseOperation(3);
/*     */     
/*  37 */     this.jSlider1.setMaximum(5000);
/*  38 */     this.jSlider1.setValue(0);
/*  39 */     this.jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(javax.swing.event.ChangeEvent evt) {
/*  41 */         MersenePrime_Slider.this.jSlider1StateChanged(evt);
/*     */       }
/*     */       
/*  44 */     });
/*  45 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  46 */     this.jLabel1.setHorizontalAlignment(0);
/*  47 */     this.jLabel1.setText("0");
/*     */     
/*  49 */     this.jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  50 */     this.jLabel2.setHorizontalAlignment(0);
/*     */     
/*  52 */     this.jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  53 */     this.jButton1.setText("Test");
/*  54 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  56 */         MersenePrime_Slider.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  59 */     });
/*  60 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  61 */     getContentPane().setLayout(layout);
/*  62 */     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jSlider1, -1, 380, 32767).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jButton1, -2, 118, -2).addComponent(this.jLabel1, -2, 118, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel2, -1, -1, 32767))).addContainerGap()));
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
/*  76 */     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jSlider1, -2, 44, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel1, -2, 46, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 50, -2).addGap(0, 0, 32767)).addComponent(this.jLabel2, -1, -1, 32767)).addContainerGap()));
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
/*  92 */     pack();
/*     */   }
/*     */   
/*     */   private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {
/*  96 */     this.jLabel1.setText(Integer.toString(this.jSlider1.getValue()));
/*     */   }
/*     */   
/*     */   private int power(int a, int b) {
/* 100 */     int result = 1;
/* 101 */     for (int i = 0; i < b; i++) {
/* 102 */       result *= a;
/*     */     }
/* 104 */     return result;
/*     */   }
/*     */   
/*     */   private boolean isMersenne(int n) {
/* 108 */     for (int i = 0; power(2, i) < n; i++) {
/* 109 */       if (n == power(2, i + 1) - 1) {
/* 110 */         return true;
/*     */       }
/*     */     }
/* 113 */     return false;
/*     */   }
/*     */   
/*     */   private boolean isPrime(int n) {
/* 117 */     if (n < 2)
/* 118 */       return false;
/* 119 */     if (n == 2)
/* 120 */       return true;
/* 121 */     if (n % 2 == 0) {
/* 122 */       return false;
/*     */     }
/* 124 */     int sqrt = (int)Math.sqrt(n) + 1;
/* 125 */     for (int i = 3; i < sqrt; i += 2) {
/* 126 */       if (n % i == 0) {
/* 127 */         return false;
/*     */       }
/*     */     }
/* 130 */     return true;
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
/*     */   {
/* 135 */     int n = this.jSlider1.getValue();
/* 136 */     if ((isMersenne(n)) && (isPrime(n))) {
/* 137 */       this.jLabel2.setText("<html>Cislo: " + n + "<br />JE Mersenovo prvocislo</html>");
/*     */     } else {
/* 139 */       this.jLabel2.setText("<html>Cislo: " + n + "<br />NENI Mersenovo prvocislo</hmml>");
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
/* 153 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 154 */         if ("Nimbus".equals(info.getName())) {
/* 155 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 156 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 160 */       Logger.getLogger(MersenePrime_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 162 */       Logger.getLogger(MersenePrime_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 164 */       Logger.getLogger(MersenePrime_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 166 */       Logger.getLogger(MersenePrime_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 171 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 173 */         new MersenePrime_Slider().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Prime\MersenePrime_Slider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */