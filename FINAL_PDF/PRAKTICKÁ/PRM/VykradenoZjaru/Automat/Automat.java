/*     */ package Automat;
/*     */ 
/*     */ import java.awt.Font;
/*     */ import java.util.Random;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class Automat extends javax.swing.JFrame
/*     */ {
/*     */   private long score;
/*     */   private long max_score;
/*     */   Random rd;
/*     */   private JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   
/*     */   public Automat()
/*     */   {
/*  26 */     initComponents();
/*  27 */     this.score = 10L;
/*  28 */     this.max_score = 10L;
/*  29 */     this.rd = new Random();
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
/*  41 */     this.jLabel1 = new JLabel();
/*  42 */     this.jLabel2 = new JLabel();
/*  43 */     this.jLabel3 = new JLabel();
/*  44 */     this.jButton1 = new JButton();
/*  45 */     this.jLabel4 = new JLabel();
/*     */     
/*  47 */     setDefaultCloseOperation(3);
/*     */     
/*  49 */     this.jLabel1.setFont(new Font("Tahoma", 1, 18));
/*  50 */     this.jLabel1.setHorizontalAlignment(0);
/*  51 */     this.jLabel1.setText("?");
/*     */     
/*  53 */     this.jLabel2.setFont(new Font("Tahoma", 1, 18));
/*  54 */     this.jLabel2.setHorizontalAlignment(0);
/*  55 */     this.jLabel2.setText("?");
/*     */     
/*  57 */     this.jLabel3.setFont(new Font("Tahoma", 1, 18));
/*  58 */     this.jLabel3.setHorizontalAlignment(0);
/*  59 */     this.jLabel3.setText("?");
/*     */     
/*  61 */     this.jButton1.setFont(new Font("Tahoma", 1, 18));
/*  62 */     this.jButton1.setText("Play");
/*  63 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  65 */         Automat.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  68 */     });
/*  69 */     this.jLabel4.setFont(new Font("Tahoma", 1, 18));
/*  70 */     this.jLabel4.setHorizontalAlignment(0);
/*  71 */     this.jLabel4.setText("10");
/*     */     
/*  73 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  74 */     getContentPane().setLayout(layout);
/*  75 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jButton1, -1, -1, 32767).addComponent(this.jLabel3, -1, 90, 32767)).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.jLabel1, -2, 90, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jLabel2, -2, 90, -2).addGap(0, 0, 32767)).addGroup(layout.createSequentialGroup().addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel4, -1, -1, 32767))).addContainerGap()));
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
/*  94 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel1, -2, 90, -2).addComponent(this.jLabel2, -2, 90, -2).addComponent(this.jLabel3, -2, 90, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton1, -1, 57, 32767).addComponent(this.jLabel4, -1, -1, 32767)).addContainerGap(-1, 32767)));
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
/* 109 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
/* 113 */     int val1 = this.rd.nextInt(6) + 1;
/* 114 */     int val2 = this.rd.nextInt(6) + 1;
/* 115 */     int val3 = this.rd.nextInt(6) + 1;
/* 116 */     this.jLabel1.setText(Integer.toString(val1));
/* 117 */     this.jLabel2.setText(Integer.toString(val2));
/* 118 */     this.jLabel3.setText(Integer.toString(val3));
/* 119 */     if ((val1 == val2) && (val2 == val3))
/*     */     {
/* 121 */       this.score *= 3L;
/* 122 */       javax.swing.JOptionPane.showMessageDialog(this, "TRIPPLE", "Tripple", 2);
/* 123 */     } else if ((val1 == val2) || (val2 == val3) || (val1 == val3))
/*     */     {
/* 125 */       this.score *= 2L;
/* 126 */       javax.swing.JOptionPane.showMessageDialog(this, "DOUBLE", "Double", 1);
/*     */     }
/*     */     else {
/* 129 */       this.score /= 2L;
/* 130 */       javax.swing.JOptionPane.showMessageDialog(this, "LOOSE", "Loose", 0);
/*     */     }
/* 132 */     this.jLabel4.setText(Long.toString(this.score));
/* 133 */     if (this.score > this.max_score) {
/* 134 */       this.max_score = this.score;
/*     */     }
/* 136 */     if (this.score == 0L) {
/* 137 */       this.jLabel4.setText("<html>Konec<br />Max: score: " + this.max_score + "</html>");
/* 138 */       this.jButton1.setEnabled(false);
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
/* 152 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 153 */         if ("Nimbus".equals(info.getName())) {
/* 154 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 155 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 159 */       Logger.getLogger(Automat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 161 */       Logger.getLogger(Automat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 163 */       Logger.getLogger(Automat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 165 */       Logger.getLogger(Automat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 170 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 172 */         new Automat().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Automat\Automat.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */