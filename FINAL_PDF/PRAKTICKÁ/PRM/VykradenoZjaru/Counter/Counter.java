/*     */ package Counter;
/*     */ 
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class Counter extends javax.swing.JFrame
/*     */ {
/*     */   private int counter;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JButton jButton3;
/*     */   private JLabel jLabel1;
/*     */   
/*     */   public Counter()
/*     */   {
/*  23 */     this.counter = 0;
/*  24 */     initComponents();
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
/*  36 */     this.jLabel1 = new JLabel();
/*  37 */     this.jButton1 = new JButton();
/*  38 */     this.jButton2 = new JButton();
/*  39 */     this.jButton3 = new JButton();
/*     */     
/*  41 */     setDefaultCloseOperation(3);
/*  42 */     setTitle("Counter");
/*     */     
/*  44 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  45 */     this.jLabel1.setHorizontalAlignment(0);
/*  46 */     this.jLabel1.setText("Kliknuto 0 krat");
/*     */     
/*  48 */     this.jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  49 */     this.jButton1.setLabel("Pridat");
/*  50 */     this.jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/*  52 */         Counter.this.jButton1MouseClicked(evt);
/*     */       }
/*     */       
/*  55 */     });
/*  56 */     this.jButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  57 */     this.jButton2.setText("Ubrat");
/*  58 */     this.jButton2.setToolTipText("");
/*  59 */     this.jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/*  61 */         Counter.this.jButton2MouseClicked(evt);
/*     */       }
/*     */       
/*  64 */     });
/*  65 */     this.jButton3.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  66 */     this.jButton3.setText("Vynulovat");
/*  67 */     this.jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(MouseEvent evt) {
/*  69 */         Counter.this.jButton3MouseClicked(evt);
/*     */       }
/*     */       
/*  72 */     });
/*  73 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  74 */     getContentPane().setLayout(layout);
/*  75 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton3, -1, 380, 32767).addGroup(layout.createSequentialGroup().addComponent(this.jButton1, -2, 186, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2, -1, 188, 32767)).addComponent(this.jLabel1, -1, 380, 32767)).addContainerGap()));
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
/*  88 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.jLabel1, -2, 70, -2).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton2, -1, 64, 32767).addComponent(this.jButton1, -2, 64, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton3, -2, 66, -2).addContainerGap(65, 32767)));
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
/* 102 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1MouseClicked(MouseEvent evt) {
/* 106 */     this.counter += 1;
/* 107 */     this.jLabel1.setText("Kliknuto " + this.counter + " krat");
/*     */   }
/*     */   
/*     */   private void jButton2MouseClicked(MouseEvent evt) {
/* 111 */     this.counter -= 1;
/* 112 */     this.jLabel1.setText("Kliknuto " + this.counter + " krat");
/*     */   }
/*     */   
/*     */   private void jButton3MouseClicked(MouseEvent evt) {
/* 116 */     this.counter = 0;
/* 117 */     this.jLabel1.setText("Kliknuto " + this.counter + " krat");
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
/* 130 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 131 */         if ("Nimbus".equals(info.getName())) {
/* 132 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 133 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 137 */       Logger.getLogger(Counter.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 139 */       Logger.getLogger(Counter.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 141 */       Logger.getLogger(Counter.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 143 */       Logger.getLogger(Counter.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 148 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 151 */         new Counter().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Counter\Counter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */