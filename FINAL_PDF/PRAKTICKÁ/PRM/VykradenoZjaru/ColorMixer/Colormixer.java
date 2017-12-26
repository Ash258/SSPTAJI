/*     */ package ColorMixer;
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
/*     */ public class Colormixer extends javax.swing.JFrame
/*     */ {
/*     */   private short red;
/*     */   private short green;
/*     */   private short blue;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   private JLabel jLabel5;
/*     */   private javax.swing.JPanel jPanel1;
/*     */   private JSlider jSlider1;
/*     */   private JSlider jSlider2;
/*     */   private JSlider jSlider3;
/*     */   
/*     */   public Colormixer()
/*     */   {
/*  27 */     this.red = 0;
/*  28 */     this.green = 0;
/*  29 */     this.blue = 0;
/*  30 */     initComponents();
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
/*  42 */     this.jSlider1 = new JSlider();
/*  43 */     this.jLabel3 = new JLabel();
/*  44 */     this.jSlider2 = new JSlider();
/*  45 */     this.jLabel4 = new JLabel();
/*  46 */     this.jSlider3 = new JSlider();
/*  47 */     this.jPanel1 = new javax.swing.JPanel();
/*  48 */     this.jLabel5 = new JLabel();
/*     */     
/*  50 */     setDefaultCloseOperation(3);
/*  51 */     setTitle("Colormixer");
/*     */     
/*  53 */     this.jSlider1.setMaximum(255);
/*  54 */     this.jSlider1.setValue(0);
/*  55 */     this.jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/*  57 */         Colormixer.this.jSlider1StateChanged(evt);
/*     */       }
/*     */       
/*  60 */     });
/*  61 */     this.jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  62 */     this.jLabel3.setForeground(new java.awt.Color(0, 0, 255));
/*  63 */     this.jLabel3.setText("Blue");
/*     */     
/*  65 */     this.jSlider2.setMaximum(255);
/*  66 */     this.jSlider2.setValue(0);
/*  67 */     this.jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/*  69 */         Colormixer.this.jSlider2StateChanged(evt);
/*     */       }
/*     */       
/*  72 */     });
/*  73 */     this.jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  74 */     this.jLabel4.setForeground(new java.awt.Color(0, 255, 0));
/*  75 */     this.jLabel4.setText("Green");
/*     */     
/*  77 */     this.jSlider3.setMaximum(255);
/*  78 */     this.jSlider3.setValue(0);
/*  79 */     this.jSlider3.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/*  81 */         Colormixer.this.jSlider3StateChanged(evt);
/*     */       }
/*     */       
/*  84 */     });
/*  85 */     this.jPanel1.setBackground(new java.awt.Color(0, 0, 0));
/*     */     
/*  87 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  88 */     this.jPanel1.setLayout(jPanel1Layout);
/*  89 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 305, 32767));
/*     */     
/*     */ 
/*     */ 
/*  93 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 80, 32767));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  98 */     this.jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  99 */     this.jLabel5.setForeground(new java.awt.Color(255, 0, 0));
/* 100 */     this.jLabel5.setText("Red");
/*     */     
/* 102 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 103 */     getContentPane().setLayout(layout);
/* 104 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, -1, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(this.jLabel3, -2, 79, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jSlider3, -1, -1, 32767)).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel5, -2, 79, -2).addComponent(this.jLabel4, -2, 79, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jSlider2, -1, -1, 32767).addComponent(this.jSlider1, -1, 214, 32767))))).addContainerGap()));
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
/* 125 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addGap(17, 17, 17).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel5, -2, 32, -2).addComponent(this.jSlider1, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel4, -2, 33, -2).addComponent(this.jSlider2, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel3, -2, 33, -2).addComponent(this.jSlider3, -2, -1, -2)).addContainerGap(23, 32767)));
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
/* 145 */     pack();
/*     */   }
/*     */   
/*     */   private void jSlider1StateChanged(ChangeEvent evt) {
/* 149 */     this.red = ((short)this.jSlider1.getValue());
/* 150 */     this.jPanel1.setBackground(new java.awt.Color(this.red, this.green, this.blue));
/*     */   }
/*     */   
/*     */   private void jSlider2StateChanged(ChangeEvent evt) {
/* 154 */     this.green = ((short)this.jSlider2.getValue());
/* 155 */     this.jPanel1.setBackground(new java.awt.Color(this.red, this.green, this.blue));
/*     */   }
/*     */   
/*     */   private void jSlider3StateChanged(ChangeEvent evt) {
/* 159 */     this.blue = ((short)this.jSlider3.getValue());
/* 160 */     this.jPanel1.setBackground(new java.awt.Color(this.red, this.green, this.blue));
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
/* 173 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 174 */         if ("Nimbus".equals(info.getName())) {
/* 175 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 176 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 180 */       Logger.getLogger(Colormixer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 182 */       Logger.getLogger(Colormixer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 184 */       Logger.getLogger(Colormixer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 186 */       Logger.getLogger(Colormixer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 191 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 194 */         new Colormixer().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\ColorMixer\Colormixer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */