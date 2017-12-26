/*     */ package Sum_Slider;
/*     */ 
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JSlider;
/*     */ 
/*     */ public class Sum_Slider2 extends javax.swing.JFrame
/*     */ {
/*     */   private int op1;
/*     */   private int op2;
/*     */   private javax.swing.JButton jButton3;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JSlider jSlider1;
/*     */   private JSlider jSlider2;
/*     */   
/*     */   public Sum_Slider2()
/*     */   {
/*  23 */     this.op1 = 0;
/*  24 */     this.op2 = 0;
/*  25 */     initComponents();
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
/*  37 */     this.jLabel1 = new JLabel();
/*  38 */     this.jButton3 = new javax.swing.JButton();
/*  39 */     this.jLabel3 = new JLabel();
/*  40 */     this.jLabel2 = new JLabel();
/*  41 */     this.jSlider1 = new JSlider();
/*  42 */     this.jSlider2 = new JSlider();
/*     */     
/*  44 */     setDefaultCloseOperation(3);
/*  45 */     setTitle("Kalkulacka 2");
/*     */     
/*  47 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  48 */     this.jLabel1.setHorizontalAlignment(0);
/*  49 */     this.jLabel1.setText("0");
/*     */     
/*  51 */     this.jButton3.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  52 */     this.jButton3.setText("Secti");
/*  53 */     this.jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  55 */         Sum_Slider2.this.jButton3MouseClicked(evt);
/*     */       }
/*     */       
/*  58 */     });
/*  59 */     this.jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  60 */     this.jLabel3.setHorizontalAlignment(0);
/*  61 */     this.jLabel3.setText("0");
/*     */     
/*  63 */     this.jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  64 */     this.jLabel2.setHorizontalAlignment(0);
/*  65 */     this.jLabel2.setText("0");
/*     */     
/*  67 */     this.jSlider1.setMaximum(10);
/*  68 */     this.jSlider1.setOrientation(1);
/*  69 */     this.jSlider1.setValue(0);
/*  70 */     this.jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(javax.swing.event.ChangeEvent evt) {
/*  72 */         Sum_Slider2.this.jSlider1StateChanged(evt);
/*     */       }
/*     */       
/*  75 */     });
/*  76 */     this.jSlider2.setMaximum(10);
/*  77 */     this.jSlider2.setOrientation(1);
/*  78 */     this.jSlider2.setValue(0);
/*  79 */     this.jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(javax.swing.event.ChangeEvent evt) {
/*  81 */         Sum_Slider2.this.jSlider2StateChanged(evt);
/*     */       }
/*     */       
/*  84 */     });
/*  85 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  86 */     getContentPane().setLayout(layout);
/*  87 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1, -2, 93, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel2, -2, 93, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)).addGroup(layout.createSequentialGroup().addGap(43, 43, 43).addComponent(this.jSlider1, -2, 29, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jSlider2, -2, 29, -2).addGap(39, 39, 39))).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton3, -1, 93, 32767).addComponent(this.jLabel3, -2, 93, -2)).addContainerGap(18, 32767)));
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
/* 108 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 157, 32767).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel3, -2, 62, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton3, -1, 62, 32767)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel2, -2, 62, -2).addComponent(this.jLabel1, -2, 62, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jSlider2, -2, 67, -2).addComponent(this.jSlider1, -2, 67, -2)))).addContainerGap(-1, 32767)));
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
/* 129 */     pack();
/*     */   }
/*     */   
/*     */   private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {
/* 133 */     this.op1 = this.jSlider1.getValue();
/* 134 */     this.jLabel1.setText(Integer.toString(this.op1));
/*     */   }
/*     */   
/*     */   private void jSlider2StateChanged(javax.swing.event.ChangeEvent evt) {
/* 138 */     this.op2 = this.jSlider2.getValue();
/* 139 */     this.jLabel2.setText(Integer.toString(this.op2));
/*     */   }
/*     */   
/*     */   private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {
/* 143 */     this.jLabel3.setText(Integer.toString(this.op1 + this.op2));
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
/* 156 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 157 */         if ("Nimbus".equals(info.getName())) {
/* 158 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 159 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 163 */       java.util.logging.Logger.getLogger(Sum_Slider2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 165 */       java.util.logging.Logger.getLogger(Sum_Slider2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 167 */       java.util.logging.Logger.getLogger(Sum_Slider2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 169 */       java.util.logging.Logger.getLogger(Sum_Slider2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 175 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 178 */         new Sum_Slider2().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Sum_Slider\Sum_Slider2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */