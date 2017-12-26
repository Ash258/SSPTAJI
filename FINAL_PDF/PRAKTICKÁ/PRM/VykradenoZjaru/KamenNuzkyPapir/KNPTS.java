/*     */ package KamenNuzkyPapir;
/*     */ 
/*     */ import java.awt.Container;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.util.Random;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.DefaultComboBoxModel;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.LayoutStyle.ComponentPlacement;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.UIManager.LookAndFeelInfo;
/*     */ import javax.swing.UnsupportedLookAndFeelException;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class KNPTS
/*     */   extends JFrame
/*     */ {
/*  34 */   private final String[] choices = { "Kamen", "Nuzky", "Papir", "Tapir", "Spock" };
/*     */   Choice[] ArrayOfChoice;
/*     */   private int player_score;
/*     */   private int pc_score;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   
/*     */   public KNPTS()
/*     */   {
/*  43 */     initComponents();
/*     */     
/*  45 */     this.player_move.setModel(new DefaultComboBoxModel(this.choices));
/*     */     
/*  47 */     this.player_score = 0;
/*  48 */     this.pc_score = 0;
/*     */     
/*  50 */     this.ArrayOfChoice = new Choice[] { new Choice("Kamen", new String[] { "Tapir", "Nuzky" }), new Choice("Nuzky", new String[] { "Tapir", "Papir" }), new Choice("Papir", new String[] { "Kamen", "Spock" }), new Choice("Tapir", new String[] { "Spock", "Papir" }), new Choice("Spock", new String[] { "Nuzky", "Kamen" }) };
/*     */   }
/*     */   
/*     */ 
/*     */   private JLabel jLabel1;
/*     */   
/*     */   private JLabel jLabel3;
/*     */   
/*     */   private JLabel pc_move;
/*     */   
/*     */   private JComboBox player_move;
/*     */   
/*     */   private JLabel result1;
/*     */   
/*     */   private JLabel score;
/*     */   
/*     */   private void initComponents()
/*     */   {
/*  68 */     this.jLabel1 = new JLabel();
/*  69 */     this.pc_move = new JLabel();
/*  70 */     this.jLabel3 = new JLabel();
/*  71 */     this.player_move = new JComboBox();
/*  72 */     this.jButton1 = new JButton();
/*  73 */     this.jButton2 = new JButton();
/*  74 */     this.score = new JLabel();
/*  75 */     this.result1 = new JLabel();
/*     */     
/*  77 */     setDefaultCloseOperation(3);
/*     */     
/*  79 */     this.jLabel1.setFont(new Font("Tahoma", 1, 18));
/*  80 */     this.jLabel1.setHorizontalAlignment(0);
/*  81 */     this.jLabel1.setText("Hrac");
/*     */     
/*  83 */     this.pc_move.setFont(new Font("Tahoma", 1, 18));
/*  84 */     this.pc_move.setHorizontalAlignment(0);
/*     */     
/*  86 */     this.jLabel3.setFont(new Font("Tahoma", 1, 18));
/*  87 */     this.jLabel3.setHorizontalAlignment(0);
/*  88 */     this.jLabel3.setText("PC");
/*     */     
/*  90 */     this.player_move.setFont(new Font("Tahoma", 1, 18));
/*     */     
/*  92 */     this.jButton1.setFont(new Font("Tahoma", 1, 18));
/*  93 */     this.jButton1.setText("Hraj");
/*  94 */     this.jButton1.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/*  96 */         KNPTS.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  99 */     });
/* 100 */     this.jButton2.setFont(new Font("Tahoma", 1, 18));
/* 101 */     this.jButton2.setText("Reset");
/* 102 */     this.jButton2.addActionListener(new ActionListener() {
/*     */       public void actionPerformed(ActionEvent evt) {
/* 104 */         KNPTS.this.jButton2ActionPerformed(evt);
/*     */       }
/*     */       
/* 107 */     });
/* 108 */     this.score.setFont(new Font("Tahoma", 1, 18));
/* 109 */     this.score.setHorizontalAlignment(0);
/* 110 */     this.score.setText("hrac 0 : 0 pc");
/*     */     
/* 112 */     this.result1.setFont(new Font("Tahoma", 1, 14));
/* 113 */     this.result1.setHorizontalAlignment(0);
/*     */     
/* 115 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 116 */     getContentPane().setLayout(layout);
/* 117 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.score, -1, -1, 32767).addGroup(layout.createSequentialGroup().addComponent(this.jLabel1, -2, 150, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.player_move, 0, -1, 32767)).addGroup(layout.createSequentialGroup().addComponent(this.jLabel3, -2, 150, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.pc_move, -1, -1, 32767)).addGroup(layout.createSequentialGroup().addComponent(this.jButton1, -2, 175, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton2, -2, 175, -2).addGap(0, 0, 32767)).addComponent(this.result1, -1, -1, 32767)).addContainerGap()));
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
/* 139 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel1, -1, -1, 32767).addComponent(this.player_move, -1, 49, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel3, -1, 44, 32767).addComponent(this.pc_move, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton1, -2, 58, -2).addComponent(this.jButton2, -2, 58, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.result1, -2, 51, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.score, -1, 55, 32767).addContainerGap()));
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
/* 161 */     pack();
/*     */   }
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 165 */     this.player_score = 0;
/* 166 */     this.pc_score = 0;
/* 167 */     this.score.setText("hrac 0 : 0 pc");
/* 168 */     this.result1.setText("");
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt)
/*     */   {
/* 173 */     String hrac = (String)this.player_move.getSelectedItem();
/*     */     
/* 175 */     Random rd = new Random();
/* 176 */     String pc = this.choices[rd.nextInt(this.choices.length)];
/* 177 */     this.pc_move.setText(pc);
/*     */     
/* 179 */     for (int i = 0; i < this.ArrayOfChoice.length; i++) {
/* 180 */       if (hrac.equals(pc))
/*     */       {
/* 182 */         this.result1.setText("REMIZA");
/* 183 */         return;
/*     */       }
/* 185 */       if (this.ArrayOfChoice[i].name.equals(hrac)) {
/* 186 */         for (int j = 0; j < this.ArrayOfChoice[i].winAgainst.length; j++) {
/* 187 */           if (pc.equals(this.ArrayOfChoice[i].winAgainst[j]))
/*     */           {
/* 189 */             this.result1.setText("VYHRA");
/* 190 */             this.player_score += 1;
/* 191 */             this.score.setText("hrac " + this.player_score + " : " + this.pc_score + " pc");
/* 192 */             return;
/*     */           }
/*     */         }
/*     */         
/* 196 */         this.result1.setText("PROHRA");
/* 197 */         this.pc_score += 1;
/* 198 */         this.score.setText("hrac " + this.player_score + " : " + this.pc_score + " pc");
/*     */       }
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
/* 213 */       for (UIManager.LookAndFeelInfo info : ) {
/* 214 */         if ("Nimbus".equals(info.getName())) {
/* 215 */           UIManager.setLookAndFeel(info.getClassName());
/* 216 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 220 */       Logger.getLogger(KNPTS.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 222 */       Logger.getLogger(KNPTS.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 224 */       Logger.getLogger(KNPTS.class.getName()).log(Level.SEVERE, null, ex);
/*     */     } catch (UnsupportedLookAndFeelException ex) {
/* 226 */       Logger.getLogger(KNPTS.class.getName()).log(Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 231 */     EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 233 */         new KNPTS().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\KamenNuzkyPapir\KNPTS.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */