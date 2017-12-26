/*     */ package ColorMixer_GreyScale;
/*     */ 
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JSlider;
/*     */ 
/*     */ public class ColorMixer_GreyScale extends javax.swing.JFrame
/*     */ {
/*     */   private JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JPanel jPanel1;
/*     */   private JSlider jSlider1;
/*     */   
/*     */   public ColorMixer_GreyScale()
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
/*  35 */     this.jPanel1 = new JPanel();
/*  36 */     this.jSlider1 = new JSlider();
/*  37 */     this.jButton1 = new JButton();
/*  38 */     this.jLabel1 = new JLabel();
/*     */     
/*  40 */     setDefaultCloseOperation(3);
/*     */     
/*  42 */     this.jPanel1.setBackground(new java.awt.Color(0, 0, 0));
/*     */     
/*  44 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/*  45 */     this.jPanel1.setLayout(jPanel1Layout);
/*  46 */     jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 380, 32767));
/*     */     
/*     */ 
/*     */ 
/*  50 */     jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 92, 32767));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  55 */     this.jSlider1.setMaximum(255);
/*  56 */     this.jSlider1.setValue(0);
/*  57 */     this.jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(javax.swing.event.ChangeEvent evt) {
/*  59 */         ColorMixer_GreyScale.this.jSlider1StateChanged(evt);
/*     */       }
/*     */       
/*  62 */     });
/*  63 */     this.jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  64 */     this.jButton1.setText("Reset");
/*  65 */     this.jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  67 */         ColorMixer_GreyScale.this.jButton1MouseClicked(evt);
/*     */       }
/*     */       
/*  70 */     });
/*  71 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  72 */     this.jLabel1.setHorizontalAlignment(0);
/*  73 */     this.jLabel1.setText("0");
/*     */     
/*  75 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  76 */     getContentPane().setLayout(layout);
/*  77 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jPanel1, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jSlider1, GroupLayout.Alignment.LEADING, -1, 380, 32767).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(this.jButton1, -2, 281, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1, -1, 95, 32767))).addContainerGap()));
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
/*  90 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jPanel1, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jSlider1, -2, -1, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel1, -1, 55, 32767).addComponent(this.jButton1, -1, 55, 32767)).addContainerGap()));
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
/* 104 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
/* 108 */     this.jSlider1.setValue(0);
/*     */   }
/*     */   
/*     */   private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {
/* 112 */     this.jPanel1.setBackground(new java.awt.Color(this.jSlider1.getValue(), this.jSlider1.getValue(), this.jSlider1.getValue()));
/* 113 */     this.jLabel1.setText(Integer.toString(this.jSlider1.getValue()));
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
/* 126 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 127 */         if ("Nimbus".equals(info.getName())) {
/* 128 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 129 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 133 */       Logger.getLogger(ColorMixer_GreyScale.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 135 */       Logger.getLogger(ColorMixer_GreyScale.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 137 */       Logger.getLogger(ColorMixer_GreyScale.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 139 */       Logger.getLogger(ColorMixer_GreyScale.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 145 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 148 */         new ColorMixer_GreyScale().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\ColorMixer_GreyScale\ColorMixer_GreyScale.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */