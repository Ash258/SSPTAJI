/*     */ package Adresar;
/*     */ 
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.util.ArrayList;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ public class Adresar extends javax.swing.JFrame
/*     */ {
/*     */   private ArrayList<Kontakt> kontakty;
/*     */   private int position;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JButton jButton3;
/*     */   private JButton jButton4;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JTextField jTextField1;
/*     */   private JTextField jTextField2;
/*     */   
/*     */   public Adresar()
/*     */   {
/*  30 */     initComponents();
/*     */     try {
/*  32 */       java.io.FileInputStream fis = new java.io.FileInputStream("./DB.bin");
/*  33 */       java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
/*  34 */       this.kontakty = ((ArrayList)ois.readObject());
/*  35 */       ois.close();
/*  36 */       fis.close();
/*     */     } catch (Exception ex) {
/*  38 */       this.kontakty = new ArrayList();
/*     */     }
/*  40 */     this.position = 0;
/*  41 */     if (this.kontakty.isEmpty()) {
/*  42 */       this.jLabel1.setText("Zadny kontakt");
/*     */     } else {
/*  44 */       this.jLabel1.setText(((Kontakt)this.kontakty.get(this.position)).toString());
/*     */     }
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
/*  57 */     this.jLabel1 = new JLabel();
/*  58 */     this.jButton1 = new JButton();
/*  59 */     this.jButton2 = new JButton();
/*  60 */     this.jLabel2 = new JLabel();
/*  61 */     this.jLabel3 = new JLabel();
/*  62 */     this.jTextField1 = new JTextField();
/*  63 */     this.jTextField2 = new JTextField();
/*  64 */     this.jButton3 = new JButton();
/*  65 */     this.jButton4 = new JButton();
/*     */     
/*  67 */     setDefaultCloseOperation(3);
/*  68 */     addWindowListener(new java.awt.event.WindowAdapter() {
/*     */       public void windowClosing(java.awt.event.WindowEvent evt) {
/*  70 */         Adresar.this.formWindowClosing(evt);
/*     */       }
/*     */       
/*  73 */     });
/*  74 */     this.jLabel1.setFont(new Font("Tahoma", 1, 18));
/*  75 */     this.jLabel1.setHorizontalAlignment(0);
/*  76 */     this.jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
/*     */     
/*  78 */     this.jButton1.setFont(new Font("Tahoma", 1, 18));
/*  79 */     this.jButton1.setText(">>");
/*  80 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  82 */         Adresar.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  85 */     });
/*  86 */     this.jButton2.setFont(new Font("Tahoma", 1, 18));
/*  87 */     this.jButton2.setText("<<");
/*  88 */     this.jButton2.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  90 */         Adresar.this.jButton2ActionPerformed(evt);
/*     */       }
/*     */       
/*  93 */     });
/*  94 */     this.jLabel2.setFont(new Font("Tahoma", 1, 18));
/*  95 */     this.jLabel2.setText("Prijmeni");
/*     */     
/*  97 */     this.jLabel3.setFont(new Font("Tahoma", 1, 18));
/*  98 */     this.jLabel3.setText("Jmeno");
/*     */     
/* 100 */     this.jTextField1.setFont(new Font("Tahoma", 1, 18));
/*     */     
/* 102 */     this.jTextField2.setFont(new Font("Tahoma", 1, 18));
/*     */     
/* 104 */     this.jButton3.setFont(new Font("Tahoma", 1, 18));
/* 105 */     this.jButton3.setText("Pridej");
/* 106 */     this.jButton3.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 108 */         Adresar.this.jButton3ActionPerformed(evt);
/*     */       }
/*     */       
/* 111 */     });
/* 112 */     this.jButton4.setFont(new Font("Tahoma", 1, 18));
/* 113 */     this.jButton4.setText("Odeber");
/* 114 */     this.jButton4.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 116 */         Adresar.this.jButton4ActionPerformed(evt);
/*     */       }
/*     */       
/* 119 */     });
/* 120 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 121 */     getContentPane().setLayout(layout);
/* 122 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton3, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.jLabel1, -2, 248, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jButton1, -1, -1, 32767).addComponent(this.jButton2, GroupLayout.Alignment.TRAILING, -1, 128, 32767))).addGroup(layout.createSequentialGroup().addComponent(this.jLabel2, -2, 174, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField2)).addGroup(layout.createSequentialGroup().addComponent(this.jLabel3, -2, 174, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField1)).addComponent(this.jButton4, GroupLayout.Alignment.TRAILING, -1, -1, 32767)).addContainerGap()));
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
/* 145 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel1, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.jButton1, -2, 54, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2, -2, 54, -2))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jTextField1).addComponent(this.jLabel3, -1, 51, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField2, -2, 45, -2).addComponent(this.jLabel2, -2, 45, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton3, -2, 49, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton4, -2, 49, -2).addContainerGap(30, 32767)));
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
/* 170 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton3ActionPerformed(ActionEvent evt) {
/* 174 */     String jmeno = this.jTextField1.getText().trim();
/* 175 */     String prijmeni = this.jTextField2.getText().trim();
/* 176 */     if ((!jmeno.equals("")) && (!prijmeni.equals(""))) {
/* 177 */       this.kontakty.add(new Kontakt(jmeno, prijmeni));
/* 178 */       this.position = (this.kontakty.size() - 1);
/* 179 */       this.jLabel1.setText(((Kontakt)this.kontakty.get(this.position)).toString());
/* 180 */       this.jTextField1.setText("");
/* 181 */       this.jTextField2.setText("");
/*     */     }
/*     */   }
/*     */   
/*     */   private void formWindowClosing(java.awt.event.WindowEvent evt) {
/*     */     try {
/* 187 */       java.io.FileOutputStream fos = new java.io.FileOutputStream("./DB.bin");
/* 188 */       java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(fos);
/* 189 */       oos.writeObject(this.kontakty);
/* 190 */       oos.close();
/* 191 */       fos.close();
/*     */     } catch (Exception ex) {
/* 193 */       javax.swing.JOptionPane.showMessageDialog(this, "Zapis se nezdaril", "Kontakty", 2);
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 198 */     if (!this.kontakty.isEmpty()) {
/* 199 */       this.position += 1;
/* 200 */       if (this.position >= this.kontakty.size()) {
/* 201 */         this.position = 0;
/*     */       }
/* 203 */       this.jLabel1.setText(((Kontakt)this.kontakty.get(this.position)).toString());
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 208 */     if (!this.kontakty.isEmpty()) {
/* 209 */       this.position -= 1;
/* 210 */       if (this.position < 0) {
/* 211 */         this.position = (this.kontakty.size() - 1);
/*     */       }
/* 213 */       this.jLabel1.setText(((Kontakt)this.kontakty.get(this.position)).toString());
/*     */     }
/*     */   }
/*     */   
/*     */   private void jButton4ActionPerformed(ActionEvent evt) {
/* 218 */     if (this.kontakty.size() <= 0)
/*     */     {
/* 220 */       return;
/*     */     }
/*     */     
/* 223 */     this.kontakty.remove(this.position);
/* 224 */     if (this.kontakty.size() == 0)
/*     */     {
/* 226 */       this.jLabel1.setText("Zadny zaznam");
/*     */     }
/*     */     else {
/* 229 */       if (this.position != 0)
/*     */       {
/* 231 */         this.position -= 1;
/*     */       }
/* 233 */       this.jLabel1.setText(((Kontakt)this.kontakty.get(this.position)).toString());
/*     */     }
/*     */   }
/*     */   
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
/* 248 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 249 */         if ("Nimbus".equals(info.getName())) {
/* 250 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 251 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 255 */       java.util.logging.Logger.getLogger(Adresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 257 */       java.util.logging.Logger.getLogger(Adresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 259 */       java.util.logging.Logger.getLogger(Adresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 261 */       java.util.logging.Logger.getLogger(Adresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 266 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 268 */         new Adresar().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Adresar\Adresar.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */