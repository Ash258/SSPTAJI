/*     */ package KamenNuzkyPapir;
/*     */ 
/*     */ import java.awt.Font;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class KamenNuzkyPapir extends javax.swing.JFrame
/*     */ {
/*     */   private javax.swing.JButton jButton1;
/*     */   private JComboBox jComboBox1;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   
/*     */   public KamenNuzkyPapir()
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
/*  35 */     this.jLabel1 = new JLabel();
/*  36 */     this.jComboBox1 = new JComboBox();
/*  37 */     this.jLabel2 = new JLabel();
/*  38 */     this.jLabel3 = new JLabel();
/*  39 */     this.jButton1 = new javax.swing.JButton();
/*  40 */     this.jLabel4 = new JLabel();
/*     */     
/*  42 */     setDefaultCloseOperation(3);
/*  43 */     setCursor(new java.awt.Cursor(0));
/*  44 */     setResizable(false);
/*     */     
/*  46 */     this.jLabel1.setFont(new Font("Ubuntu", 1, 18));
/*  47 */     this.jLabel1.setHorizontalAlignment(0);
/*  48 */     this.jLabel1.setText("PC");
/*     */     
/*  50 */     this.jComboBox1.setFont(new Font("Ubuntu", 1, 18));
/*  51 */     this.jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kámen", "Nůžky", "Papír" }));
/*  52 */     this.jComboBox1.addItemListener(new java.awt.event.ItemListener() {
/*     */       public void itemStateChanged(java.awt.event.ItemEvent evt) {
/*  54 */         KamenNuzkyPapir.this.jComboBox1ItemStateChanged(evt);
/*     */       }
/*     */       
/*  57 */     });
/*  58 */     this.jLabel2.setFont(new Font("Ubuntu", 1, 18));
/*  59 */     this.jLabel2.setHorizontalAlignment(0);
/*  60 */     this.jLabel2.setText("Hráč");
/*     */     
/*  62 */     this.jLabel3.setFont(new Font("Ubuntu", 1, 18));
/*     */     
/*  64 */     this.jButton1.setFont(new Font("Ubuntu", 1, 18));
/*  65 */     this.jButton1.setText("Hraj");
/*  66 */     this.jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  68 */         KamenNuzkyPapir.this.jButton1MouseClicked(evt);
/*     */       }
/*     */       
/*  71 */     });
/*  72 */     this.jLabel4.setFont(new Font("Ubuntu", 1, 18));
/*  73 */     this.jLabel4.setHorizontalAlignment(0);
/*     */     
/*  75 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  76 */     getContentPane().setLayout(layout);
/*  77 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel4, GroupLayout.Alignment.LEADING, -1, 376, 32767).addComponent(this.jButton1, GroupLayout.Alignment.LEADING, -1, 376, 32767).addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jLabel1, GroupLayout.Alignment.LEADING, -1, 157, 32767).addComponent(this.jLabel2, GroupLayout.Alignment.LEADING, -1, 157, 32767)).addGap(18, 18, 18).addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jComboBox1, -2, 201, -2).addComponent(this.jLabel3, -1, -1, 32767)))).addContainerGap()));
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
/*  94 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel2, -1, 31, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)).addGroup(layout.createSequentialGroup().addComponent(this.jComboBox1, -2, -1, -2).addGap(12, 12, 12))).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel3, -1, 30, 32767).addComponent(this.jLabel1, GroupLayout.Alignment.TRAILING, -1, 30, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton1, -2, 45, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel4, -2, 49, -2).addContainerGap()));
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
/* 115 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {
/* 119 */     String hrac = (String)this.jComboBox1.getSelectedItem();
/* 120 */     java.util.Random rd = new java.util.Random();
/* 121 */     String cpu = (String)this.jComboBox1.getItemAt(rd.nextInt(this.jComboBox1.getItemCount()));
/* 122 */     this.jLabel3.setText(cpu);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 170 */     if (hrac.equals("Kámen")) {
/* 171 */       if (cpu.equals("Kámen")) {
/* 172 */         this.jLabel4.setText("REMÍZA");
/* 173 */       } else if (cpu.equals("Nůžky")) {
/* 174 */         this.jLabel4.setText("VÝHRA");
/*     */       } else {
/* 176 */         this.jLabel4.setText("PROHRA");
/*     */       }
/* 178 */     } else if (hrac.equals("Nůžky")) {
/* 179 */       if (cpu.equals("Kámen")) {
/* 180 */         this.jLabel4.setText("PROHRA");
/* 181 */       } else if (cpu.equals("Nůžky")) {
/* 182 */         this.jLabel4.setText("REMÍZA");
/*     */       } else {
/* 184 */         this.jLabel4.setText("VÝHRA");
/*     */       }
/*     */     }
/* 187 */     else if (cpu.equals("Kámen")) {
/* 188 */       this.jLabel4.setText("VÝHRA");
/* 189 */     } else if (cpu.equals("Nůžky")) {
/* 190 */       this.jLabel4.setText("PROHRA");
/*     */     } else {
/* 192 */       this.jLabel4.setText("REMÍZA");
/*     */     }
/*     */   }
/*     */   
/*     */   private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt)
/*     */   {
/* 198 */     this.jLabel3.setText("");
/* 199 */     this.jLabel4.setText("");
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
/* 212 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 213 */         if ("Nimbus".equals(info.getName())) {
/* 214 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 215 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 219 */       Logger.getLogger(KamenNuzkyPapir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 221 */       Logger.getLogger(KamenNuzkyPapir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 223 */       Logger.getLogger(KamenNuzkyPapir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 225 */       Logger.getLogger(KamenNuzkyPapir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 230 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 233 */         new KamenNuzkyPapir().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\KamenNuzkyPapir\KamenNuzkyPapir.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */