/*     */ package Counter_SliderButton;
/*     */ 
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JSlider;
/*     */ 
/*     */ public class Counter_SliderButton extends javax.swing.JFrame
/*     */ {
/*     */   private int count;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private javax.swing.JLabel jLabel1;
/*     */   private javax.swing.JPanel jPanel1;
/*     */   private JSlider jSlider1;
/*     */   
/*     */   public Counter_SliderButton()
/*     */   {
/*  23 */     initComponents();
/*  24 */     this.count = 0;
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
/*  36 */     this.jSlider1 = new JSlider();
/*  37 */     this.jButton1 = new JButton();
/*  38 */     this.jButton2 = new JButton();
/*  39 */     this.jPanel1 = new javax.swing.JPanel();
/*  40 */     this.jLabel1 = new javax.swing.JLabel();
/*     */     
/*  42 */     setDefaultCloseOperation(3);
/*     */     
/*  44 */     this.jSlider1.setMaximum(1);
/*  45 */     this.jSlider1.setOrientation(1);
/*  46 */     this.jSlider1.setValue(0);
/*     */     
/*  48 */     this.jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  49 */     this.jButton1.setText("+");
/*  50 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  52 */         Counter_SliderButton.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  55 */     });
/*  56 */     this.jButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  57 */     this.jButton2.setText("-");
/*  58 */     this.jButton2.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  60 */         Counter_SliderButton.this.jButton2ActionPerformed(evt);
/*     */       }
/*     */       
/*  63 */     });
/*  64 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  65 */     this.jLabel1.setHorizontalAlignment(0);
/*  66 */     this.jLabel1.setText("0");
/*     */     
/*  68 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  69 */     this.jPanel1.setLayout(jPanel1Layout);
/*  70 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1, -1, 144, 32767).addContainerGap()));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  77 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1, -1, -1, 32767).addContainerGap()));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  86 */     getContentPane().setLayout(layout);
/*  87 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jSlider1, -2, 31, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton1, -2, 97, -2).addComponent(this.jButton2, -2, 97, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
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
/* 100 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jPanel1, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jSlider1, GroupLayout.Alignment.LEADING, 0, 0, 32767).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(this.jButton1, -2, 65, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2, -2, 65, -2))).addContainerGap(-1, 32767)));
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
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 118 */     if ((this.jSlider1.getValue() == this.jSlider1.getMaximum()) && (this.count < 10)) {
/* 119 */       this.count += 1;
/*     */     }
/* 121 */     this.jLabel1.setText(Integer.toString(this.count));
/*     */   }
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 125 */     if ((this.jSlider1.getValue() == this.jSlider1.getMinimum()) && (this.count > -10)) {
/* 126 */       this.count -= 1;
/*     */     }
/* 128 */     this.jLabel1.setText(Integer.toString(this.count));
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
/* 141 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 142 */         if ("Nimbus".equals(info.getName())) {
/* 143 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 144 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 148 */       Logger.getLogger(Counter_SliderButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 150 */       Logger.getLogger(Counter_SliderButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 152 */       Logger.getLogger(Counter_SliderButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 154 */       Logger.getLogger(Counter_SliderButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 160 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 163 */         new Counter_SliderButton().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Counter_SliderButton\Counter_SliderButton.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */