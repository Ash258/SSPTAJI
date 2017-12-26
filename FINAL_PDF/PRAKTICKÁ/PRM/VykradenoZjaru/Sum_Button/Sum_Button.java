/*     */ package Sum_Button;
/*     */ 
/*     */ import java.awt.event.MouseEvent;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class Sum_Button extends javax.swing.JFrame
/*     */ {
/*     */   private int op1;
/*     */   private int op2;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JButton jButton3;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   
/*     */   public Sum_Button()
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
/*  38 */     this.jButton1 = new JButton();
/*  39 */     this.jLabel2 = new JLabel();
/*  40 */     this.jButton2 = new JButton();
/*  41 */     this.jLabel3 = new JLabel();
/*  42 */     this.jButton3 = new JButton();
/*     */     
/*  44 */     setDefaultCloseOperation(3);
/*  45 */     setTitle("Kalkulacka 1");
/*     */     
/*  47 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  48 */     this.jLabel1.setHorizontalAlignment(0);
/*  49 */     this.jLabel1.setText("0");
/*     */     
/*  51 */     this.jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  52 */     this.jButton1.setText("Op1");
/*  53 */     this.jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/*  55 */         Sum_Button.this.jButton1MouseClicked(evt);
/*     */       }
/*     */       
/*  58 */     });
/*  59 */     this.jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  60 */     this.jLabel2.setHorizontalAlignment(0);
/*  61 */     this.jLabel2.setText("0");
/*     */     
/*  63 */     this.jButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  64 */     this.jButton2.setText("Op2");
/*  65 */     this.jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/*  67 */         Sum_Button.this.jButton2MouseClicked(evt);
/*     */       }
/*     */       
/*  70 */     });
/*  71 */     this.jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  72 */     this.jLabel3.setHorizontalAlignment(0);
/*  73 */     this.jLabel3.setText("0");
/*     */     
/*  75 */     this.jButton3.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  76 */     this.jButton3.setText("Secti");
/*  77 */     this.jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/*  79 */         Sum_Button.this.jButton3MouseClicked(evt);
/*     */       }
/*     */       
/*  82 */     });
/*  83 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  84 */     getContentPane().setLayout(layout);
/*  85 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jButton1, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jLabel1, GroupLayout.Alignment.LEADING, -1, 93, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jButton2, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jLabel2, GroupLayout.Alignment.LEADING, -2, 93, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jButton3, GroupLayout.Alignment.LEADING, -1, -1, 32767).addComponent(this.jLabel3, GroupLayout.Alignment.LEADING, -2, 93, -2)).addContainerGap(-1, 32767)));
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
/* 102 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel3, -2, 62, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton3, -1, 73, 32767)).addGroup(layout.createSequentialGroup().addComponent(this.jLabel2, -2, 62, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton2, -1, 73, 32767)).addGroup(layout.createSequentialGroup().addComponent(this.jLabel1, -2, 62, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton1, -1, 73, 32767))).addContainerGap()));
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
/* 122 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1MouseClicked(MouseEvent evt) {
/* 126 */     this.op1 = ((this.op1 + 1) % 10);
/* 127 */     this.jLabel1.setText(Integer.toString(this.op1));
/*     */   }
/*     */   
/*     */   private void jButton2MouseClicked(MouseEvent evt) {
/* 131 */     this.op2 = ((this.op2 + 1) % 10);
/* 132 */     this.jLabel2.setText(Integer.toString(this.op2));
/*     */   }
/*     */   
/*     */   private void jButton3MouseClicked(MouseEvent evt) {
/* 136 */     int pom = this.op1 + this.op2;
/* 137 */     this.jLabel3.setText(Integer.toString(pom));
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
/* 150 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 151 */         if ("Nimbus".equals(info.getName())) {
/* 152 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 153 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 157 */       java.util.logging.Logger.getLogger(Sum_Button.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 159 */       java.util.logging.Logger.getLogger(Sum_Button.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 161 */       java.util.logging.Logger.getLogger(Sum_Button.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 163 */       java.util.logging.Logger.getLogger(Sum_Button.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/* 169 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 172 */         new Sum_Button().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Sum_Button\Sum_Button.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */