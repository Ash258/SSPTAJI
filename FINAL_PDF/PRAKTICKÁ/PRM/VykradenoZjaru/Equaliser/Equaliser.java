/*     */ package Equaliser;
/*     */ 
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JSlider;
/*     */ import javax.swing.event.ChangeEvent;
/*     */ 
/*     */ public class Equaliser extends javax.swing.JFrame
/*     */ {
/*     */   private int lastLeft;
/*     */   private int lastRight;
/*     */   private boolean leftClicked;
/*     */   private boolean rightClicked;
/*     */   private javax.swing.JCheckBox jCheckBox1;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JSlider jSlider1;
/*     */   private JSlider jSlider2;
/*     */   
/*     */   public Equaliser()
/*     */   {
/*  25 */     initComponents();
/*  26 */     this.lastLeft = 0;
/*  27 */     this.lastRight = 0;
/*  28 */     this.leftClicked = false;
/*  29 */     this.rightClicked = false;
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
/*  41 */     this.jSlider1 = new JSlider();
/*  42 */     this.jSlider2 = new JSlider();
/*  43 */     this.jLabel1 = new JLabel();
/*  44 */     this.jLabel2 = new JLabel();
/*  45 */     this.jCheckBox1 = new javax.swing.JCheckBox();
/*     */     
/*  47 */     setDefaultCloseOperation(3);
/*     */     
/*  49 */     this.jSlider1.setOrientation(1);
/*  50 */     this.jSlider1.setValue(0);
/*  51 */     this.jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/*  53 */         Equaliser.this.jSlider1StateChanged(evt);
/*     */       }
/*     */       
/*  56 */     });
/*  57 */     this.jSlider2.setOrientation(1);
/*  58 */     this.jSlider2.setValue(0);
/*  59 */     this.jSlider2.addChangeListener(new javax.swing.event.ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/*  61 */         Equaliser.this.jSlider2StateChanged(evt);
/*     */       }
/*     */       
/*  64 */     });
/*  65 */     this.jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  66 */     this.jLabel1.setHorizontalAlignment(0);
/*  67 */     this.jLabel1.setText("0");
/*     */     
/*  69 */     this.jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  70 */     this.jLabel2.setHorizontalAlignment(0);
/*  71 */     this.jLabel2.setText("0");
/*     */     
/*  73 */     this.jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 18));
/*  74 */     this.jCheckBox1.setText("All");
/*     */     
/*  76 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  77 */     getContentPane().setLayout(layout);
/*  78 */     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel1, -1, -1, 32767).addComponent(this.jSlider1, -1, 56, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel2, -1, -1, 32767).addComponent(this.jSlider2, -1, 56, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jCheckBox1).addContainerGap(-1, 32767)));
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
/*  93 */     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jCheckBox1).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jSlider2, -2, -1, -2).addComponent(this.jSlider1, -2, -1, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jLabel2, -2, 42, -2).addComponent(this.jLabel1, -2, 42, -2)))).addContainerGap(-1, 32767)));
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
/* 110 */     pack();
/*     */   }
/*     */   
/*     */   private void jSlider1StateChanged(ChangeEvent evt) {
/* 114 */     this.leftClicked = true;
/* 115 */     if (!this.rightClicked) {
/* 116 */       if (this.jCheckBox1.isSelected())
/*     */       {
/* 118 */         int diff = this.jSlider1.getValue() - this.lastLeft;
/* 119 */         if (diff > 0)
/*     */         {
/* 121 */           if (this.jSlider2.getValue() + diff > this.jSlider2.getMaximum())
/*     */           {
/*     */ 
/* 124 */             this.jSlider1.setValue(this.lastLeft);
/*     */           }
/*     */           else
/*     */           {
/* 128 */             this.lastLeft = this.jSlider1.getValue();
/*     */             
/* 130 */             this.jSlider2.setValue(this.jSlider2.getValue() + diff);
/*     */             
/* 132 */             this.lastRight = this.jSlider2.getValue();
/*     */           }
/*     */           
/*     */         }
/* 136 */         else if (this.jSlider2.getValue() + diff < this.jSlider2.getMinimum())
/*     */         {
/*     */ 
/* 139 */           this.jSlider1.setValue(this.lastLeft);
/*     */         }
/*     */         else
/*     */         {
/* 143 */           this.lastLeft = this.jSlider1.getValue();
/*     */           
/* 145 */           this.jSlider2.setValue(this.jSlider2.getValue() + diff);
/*     */           
/* 147 */           this.lastRight = this.jSlider2.getValue();
/*     */         }
/*     */       }
/*     */       else
/*     */       {
/* 152 */         this.lastLeft = this.jSlider1.getValue();
/*     */       }
/* 154 */       this.jLabel1.setText(Integer.toString(this.lastLeft));
/* 155 */       this.jLabel2.setText(Integer.toString(this.lastRight));
/*     */     }
/* 157 */     this.leftClicked = false;
/*     */   }
/*     */   
/*     */   private void jSlider2StateChanged(ChangeEvent evt) {
/* 161 */     this.rightClicked = true;
/* 162 */     if (!this.leftClicked) {
/* 163 */       if (this.jCheckBox1.isSelected())
/*     */       {
/* 165 */         int diff = this.jSlider2.getValue() - this.lastRight;
/* 166 */         if (diff > 0)
/*     */         {
/* 168 */           if (this.jSlider1.getValue() + diff > this.jSlider1.getMaximum())
/*     */           {
/*     */ 
/* 171 */             this.jSlider2.setValue(this.lastRight);
/*     */           }
/*     */           else
/*     */           {
/* 175 */             this.lastRight = this.jSlider2.getValue();
/*     */             
/* 177 */             this.jSlider1.setValue(this.jSlider1.getValue() + diff);
/*     */             
/* 179 */             this.lastLeft = this.jSlider1.getValue();
/*     */           }
/*     */           
/*     */         }
/* 183 */         else if (this.jSlider1.getValue() + diff < this.jSlider1.getMinimum())
/*     */         {
/*     */ 
/* 186 */           this.jSlider2.setValue(this.lastRight);
/*     */         }
/*     */         else
/*     */         {
/* 190 */           this.lastRight = this.jSlider2.getValue();
/*     */           
/* 192 */           this.jSlider1.setValue(this.jSlider1.getValue() + diff);
/*     */           
/* 194 */           this.lastLeft = this.jSlider1.getValue();
/*     */         }
/*     */       }
/*     */       else
/*     */       {
/* 199 */         this.lastRight = this.jSlider2.getValue();
/*     */       }
/* 201 */       this.jLabel1.setText(Integer.toString(this.lastLeft));
/* 202 */       this.jLabel2.setText(Integer.toString(this.lastRight));
/*     */     }
/* 204 */     this.rightClicked = false;
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
/* 217 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 218 */         if ("Nimbus".equals(info.getName())) {
/* 219 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 220 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 224 */       Logger.getLogger(Equaliser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 226 */       Logger.getLogger(Equaliser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 228 */       Logger.getLogger(Equaliser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 230 */       Logger.getLogger(Equaliser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 235 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 238 */         Equaliser e = new Equaliser();
/* 239 */         e.setLocationRelativeTo(null);
/* 240 */         e.setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Equaliser\Equaliser.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */