/*     */ package Sum_Slider;
/*     */ 
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JSlider;
/*     */ import javax.swing.event.ChangeEvent;
/*     */ 
/*     */ public class Sum_Slider extends javax.swing.JFrame
/*     */ {
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private javax.swing.JPanel jPanel1;
/*     */   private JSlider jSlider3;
/*     */   private JSlider jSlider4;
/*     */   
/*     */   public Sum_Slider()
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
/*  35 */     this.jSlider3 = new JSlider();
/*  36 */     this.jLabel1 = new JLabel();
/*  37 */     this.jLabel2 = new JLabel();
/*  38 */     this.jSlider4 = new JSlider();
/*  39 */     this.jPanel1 = new javax.swing.JPanel();
/*  40 */     this.jLabel3 = new JLabel();
/*     */     
/*  42 */     setDefaultCloseOperation(3);
/*     */     
/*  44 */     this.jSlider3.setMaximum(1000);
/*  45 */     this.jSlider3.setOrientation(1);
/*  46 */     this.jSlider3.setValue(0);
/*  47 */     this.jSlider3.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/*  49 */         Sum_Slider.this.jSlider3StateChanged(evt);
/*     */       }
/*     */       
/*  52 */     });
/*  53 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18));
/*  54 */     this.jLabel1.setHorizontalAlignment(0);
/*  55 */     this.jLabel1.setText("0");
/*     */     
/*  57 */     this.jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18));
/*  58 */     this.jLabel2.setHorizontalAlignment(0);
/*  59 */     this.jLabel2.setText("0");
/*     */     
/*  61 */     this.jSlider4.setMaximum(1000);
/*  62 */     this.jSlider4.setOrientation(1);
/*  63 */     this.jSlider4.setValue(0);
/*  64 */     this.jSlider4.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/*  66 */         Sum_Slider.this.jSlider4StateChanged(evt);
/*     */       }
/*     */       
/*  69 */     });
/*  70 */     this.jPanel1.setBackground(new java.awt.Color(0, 0, 255));
/*     */     
/*  72 */     this.jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24));
/*  73 */     this.jLabel3.setHorizontalAlignment(0);
/*  74 */     this.jLabel3.setText("0");
/*     */     
/*  76 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  77 */     this.jPanel1.setLayout(jPanel1Layout);
/*  78 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(64, 64, 64).addComponent(this.jLabel3, -2, 84, -2).addContainerGap(66, 32767)));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  85 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel3, -2, 44, -2).addContainerGap(12, 32767)));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  93 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  94 */     getContentPane().setLayout(layout);
/*  95 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jPanel1, GroupLayout.Alignment.LEADING, -1, -1, 32767).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel1, GroupLayout.Alignment.TRAILING, -1, 47, 32767).addComponent(this.jSlider3, GroupLayout.Alignment.TRAILING, -1, -1, 32767)).addGap(120, 120, 120).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jSlider4, -1, -1, 32767).addComponent(this.jLabel2, -1, 47, 32767)))).addContainerGap()));
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
/* 111 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jSlider4, -2, 140, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel2, -2, 29, -2)).addGroup(layout.createSequentialGroup().addComponent(this.jSlider3, -2, 140, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1, -2, 29, -2))).addGap(11, 11, 11).addComponent(this.jPanel1, -2, -1, -2).addContainerGap(-1, 32767)));
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
/*     */   private void jSlider3StateChanged(ChangeEvent evt) {
/* 133 */     this.jLabel1.setText(Integer.toString(this.jSlider3.getValue()));
/* 134 */     int tmp = this.jSlider3.getValue() + this.jSlider4.getValue();
/* 135 */     this.jLabel3.setText(Integer.toString(tmp));
/* 136 */     if (tmp < 1001) {
/* 137 */       this.jPanel1.setBackground(java.awt.Color.BLUE);
/*     */     } else {
/* 139 */       this.jPanel1.setBackground(java.awt.Color.RED);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jSlider4StateChanged(ChangeEvent evt)
/*     */   {
/* 145 */     this.jLabel2.setText(Integer.toString(this.jSlider4.getValue()));
/* 146 */     int tmp = this.jSlider3.getValue() + this.jSlider4.getValue();
/* 147 */     this.jLabel3.setText(Integer.toString(tmp));
/* 148 */     if (tmp < 1001) {
/* 149 */       this.jPanel1.setBackground(java.awt.Color.BLUE);
/*     */     } else {
/* 151 */       this.jPanel1.setBackground(java.awt.Color.RED);
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
/* 165 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 166 */         if ("Nimbus".equals(info.getName())) {
/* 167 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 168 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 172 */       Logger.getLogger(Sum_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 174 */       Logger.getLogger(Sum_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 176 */       Logger.getLogger(Sum_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 178 */       Logger.getLogger(Sum_Slider.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 184 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 187 */         new Sum_Slider().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Sum_Slider\Sum_Slider.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */