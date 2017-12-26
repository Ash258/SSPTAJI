/*     */ package Generator;
/*     */ 
/*     */ import java.awt.Font;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.util.Random;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.UIManager.LookAndFeelInfo;
/*     */ import javax.swing.event.ChangeEvent;
/*     */ 
/*     */ public class GeneratorZkouseniPRM extends javax.swing.JFrame
/*     */ {
/*  21 */   String[] jmena = { "Baloun", "Havlicek", "Herbrych", "Kalina", "Kasaly", "Koutny", "Maca", "Malek", "Prokupek", "Schrek", "Sedlacek", "Teply", "Vanek", "Zych" };
/*     */   private JButton jButton1;
/*     */   private JCheckBox jCheckBox1;
/*     */   
/*  25 */   public GeneratorZkouseniPRM() { initComponents(); }
/*     */   
/*     */ 
/*     */ 
/*     */   private JLabel jLabel1;
/*     */   
/*     */ 
/*     */   private JTextField jTextField1;
/*     */   
/*     */ 
/*     */   private void initComponents()
/*     */   {
/*  37 */     this.jLabel1 = new JLabel();
/*  38 */     this.jButton1 = new JButton();
/*  39 */     this.jCheckBox1 = new JCheckBox();
/*  40 */     this.jTextField1 = new JTextField();
/*     */     
/*  42 */     setDefaultCloseOperation(3);
/*     */     
/*  44 */     this.jLabel1.setFont(new Font("Dialog", 1, 18));
/*  45 */     this.jLabel1.setHorizontalAlignment(0);
/*     */     
/*  47 */     this.jButton1.setFont(new Font("Dialog", 1, 18));
/*  48 */     this.jButton1.setLabel("Generuj");
/*  49 */     this.jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/*  51 */         GeneratorZkouseniPRM.this.jButton1MouseClicked(evt);
/*     */       }
/*     */       
/*  54 */     });
/*  55 */     this.jCheckBox1.setText("Cheat mode");
/*  56 */     this.jCheckBox1.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/*  58 */         GeneratorZkouseniPRM.this.jCheckBox1StateChanged(evt);
/*     */       }
/*     */       
/*  61 */     });
/*  62 */     this.jTextField1.setEditable(false);
/*  63 */     this.jTextField1.setFont(new Font("Dialog", 1, 18));
/*     */     
/*  65 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  66 */     getContentPane().setLayout(layout);
/*  67 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox1).addComponent(this.jButton1, -1, 376, 32767).addComponent(this.jLabel1, GroupLayout.Alignment.TRAILING, -1, 376, 32767).addComponent(this.jTextField1, -1, 376, 32767)).addContainerGap()));
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
/*  78 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jButton1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel1, -2, 80, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jCheckBox1).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField1, -1, 79, 32767).addContainerGap()));
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
/*     */   private void jCheckBox1StateChanged(ChangeEvent evt) {
/*  96 */     if (this.jTextField1.isEditable()) {
/*  97 */       this.jTextField1.setEditable(false);
/*     */     } else {
/*  99 */       this.jTextField1.setEditable(true);
/* 100 */       this.jTextField1.setText("");
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton1MouseClicked(MouseEvent evt) {
/* 105 */     Random rd = new Random();
/*     */     String student;
/* 107 */     String student; if (this.jCheckBox1.isSelected()) { String student;
/* 108 */       if (this.jTextField1.getText().equals("supi leti casto")) {
/* 109 */         student = "Sedlacek"; } else { String student;
/* 110 */         if (this.jTextField1.getText().equals("ondreji cvic please")) {
/* 111 */           student = "Teply"; } else { String student;
/* 112 */           if (this.jTextField1.getText().equals("vzdycky")) {
/* 113 */             student = "Vanek";
/*     */           } else
/* 115 */             student = this.jmena[rd.nextInt(this.jmena.length)];
/*     */         }
/*     */       }
/* 118 */     } else { student = this.jmena[rd.nextInt(this.jmena.length)];
/*     */     }
/*     */     
/* 121 */     String otazka = Integer.toString(rd.nextInt(26) + 1);
/* 122 */     this.jLabel1.setText(student + " : " + otazka);
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
/* 135 */       for (UIManager.LookAndFeelInfo info : ) {
/* 136 */         if ("Nimbus".equals(info.getName())) {
/* 137 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 138 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 142 */       Logger.getLogger(GeneratorZkouseniPRM.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 144 */       Logger.getLogger(GeneratorZkouseniPRM.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 146 */       Logger.getLogger(GeneratorZkouseniPRM.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 148 */       Logger.getLogger(GeneratorZkouseniPRM.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 153 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 156 */         new GeneratorZkouseniPRM().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Generator\GeneratorZkouseniPRM.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */