/*     */ package Roulette;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.util.logging.Logger;
/*     */ import javax.swing.DefaultComboBoxModel;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.Alignment;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JSlider;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.LayoutStyle.ComponentPlacement;
/*     */ import javax.swing.event.ChangeEvent;
/*     */ import javax.swing.event.ChangeListener;
/*     */ 
/*     */ public class Roulette extends javax.swing.JFrame
/*     */ {
/*     */   private int bank;
/*  23 */   private int[] reds = { 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36 };
/*  24 */   private int[] blacks = { 2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35 };
/*     */   private JLabel bankLabel;
/*     */   private JComboBox column;
/*     */   private JLabel columnLabel;
/*     */   private JLabel columnResult;
/*     */   private JSlider columnSlider;
/*     */   private JComboBox dozen;
/*     */   private JLabel dozenLabel;
/*     */   private JLabel dozenResult;
/*     */   
/*     */   public Roulette()
/*     */   {
/*  27 */     initComponents();
/*  28 */     this.bank = 1000;
/*     */   }
/*     */   
/*     */   private JSlider dozenSlider;
/*     */   private JComboBox evenOdd;
/*     */   private JLabel evenOddLabel;
/*     */   private JLabel evenOddResult;
/*     */   private JSlider evenOddSlider;
/*     */   private JButton jButton1;
/*     */   
/*     */   private void initComponents()
/*     */   {
/*  40 */     this.roulette = new JLabel();
/*  41 */     this.jButton1 = new JButton();
/*  42 */     this.jLabel2 = new JLabel();
/*  43 */     this.jLabel3 = new JLabel();
/*  44 */     this.jLabel4 = new JLabel();
/*  45 */     this.jLabel5 = new JLabel();
/*  46 */     this.jLabel6 = new JLabel();
/*  47 */     this.jLabel7 = new JLabel();
/*  48 */     this.evenOdd = new JComboBox();
/*  49 */     this.smallBig = new JComboBox();
/*  50 */     this.redBlack = new JComboBox();
/*  51 */     this.dozen = new JComboBox();
/*  52 */     this.column = new JComboBox();
/*  53 */     this.number = new JTextField();
/*  54 */     this.jLabel8 = new JLabel();
/*  55 */     this.bankLabel = new JLabel();
/*  56 */     this.evenOddSlider = new JSlider();
/*  57 */     this.smallBigSlider = new JSlider();
/*  58 */     this.redBlackSlider = new JSlider();
/*  59 */     this.dozenSlider = new JSlider();
/*  60 */     this.columnSlider = new JSlider();
/*  61 */     this.smallBigLabel = new JLabel();
/*  62 */     this.redBlackResult = new JLabel();
/*  63 */     this.dozenResult = new JLabel();
/*  64 */     this.evenOddLabel = new JLabel();
/*  65 */     this.columnResult = new JLabel();
/*  66 */     this.numberLabel = new JLabel();
/*  67 */     this.numberSlider = new JSlider();
/*  68 */     this.numberResult = new JLabel();
/*  69 */     this.evenOddResult = new JLabel();
/*  70 */     this.smallBigResult = new JLabel();
/*  71 */     this.redBlackLabel = new JLabel();
/*  72 */     this.dozenLabel = new JLabel();
/*  73 */     this.columnLabel = new JLabel();
/*     */     
/*  75 */     setDefaultCloseOperation(3);
/*     */     
/*  77 */     this.roulette.setFont(new Font("Tahoma", 1, 18));
/*  78 */     this.roulette.setHorizontalAlignment(0);
/*  79 */     this.roulette.setText("0");
/*  80 */     this.roulette.setName("Roulette");
/*     */     
/*  82 */     this.jButton1.setFont(new Font("Tahoma", 1, 18));
/*  83 */     this.jButton1.setText("Play");
/*  84 */     this.jButton1.addActionListener(new java.awt.event.ActionListener() {
/*     */       public void actionPerformed(java.awt.event.ActionEvent evt) {
/*  86 */         Roulette.this.jButton1ActionPerformed(evt);
/*     */       }
/*     */       
/*  89 */     });
/*  90 */     this.jLabel2.setFont(new Font("Tahoma", 1, 18));
/*  91 */     this.jLabel2.setText("Even / Odd");
/*     */     
/*  93 */     this.jLabel3.setFont(new Font("Tahoma", 1, 18));
/*  94 */     this.jLabel3.setText("Small / Big");
/*     */     
/*  96 */     this.jLabel4.setFont(new Font("Tahoma", 1, 18));
/*  97 */     this.jLabel4.setText("Red / Black");
/*     */     
/*  99 */     this.jLabel5.setFont(new Font("Tahoma", 1, 18));
/* 100 */     this.jLabel5.setText("Number");
/*     */     
/* 102 */     this.jLabel6.setFont(new Font("Tahoma", 1, 18));
/* 103 */     this.jLabel6.setText("Dozen");
/*     */     
/* 105 */     this.jLabel7.setFont(new Font("Tahoma", 1, 18));
/* 106 */     this.jLabel7.setText("Column");
/*     */     
/* 108 */     this.evenOdd.setFont(new Font("Tahoma", 1, 18));
/* 109 */     this.evenOdd.setModel(new DefaultComboBoxModel(new String[] { "Even", "Odd" }));
/* 110 */     this.evenOdd.setName("evenOdd");
/*     */     
/* 112 */     this.smallBig.setFont(new Font("Tahoma", 1, 18));
/* 113 */     this.smallBig.setModel(new DefaultComboBoxModel(new String[] { "Small", "Big" }));
/* 114 */     this.smallBig.setName("smallBig");
/*     */     
/* 116 */     this.redBlack.setFont(new Font("Tahoma", 1, 18));
/* 117 */     this.redBlack.setModel(new DefaultComboBoxModel(new String[] { "Red", "Black" }));
/* 118 */     this.redBlack.setName("redBlack");
/*     */     
/* 120 */     this.dozen.setFont(new Font("Tahoma", 1, 18));
/* 121 */     this.dozen.setModel(new DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd" }));
/* 122 */     this.dozen.setName("dozen");
/*     */     
/* 124 */     this.column.setFont(new Font("Tahoma", 1, 18));
/* 125 */     this.column.setModel(new DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd" }));
/* 126 */     this.column.setName("column");
/*     */     
/* 128 */     this.number.setFont(new Font("Tahoma", 1, 18));
/*     */     
/* 130 */     this.jLabel8.setFont(new Font("Tahoma", 1, 18));
/* 131 */     this.jLabel8.setText("Bank");
/*     */     
/* 133 */     this.bankLabel.setFont(new Font("Tahoma", 1, 18));
/* 134 */     this.bankLabel.setHorizontalAlignment(0);
/* 135 */     this.bankLabel.setText("1000");
/* 136 */     this.bankLabel.setName("bank");
/*     */     
/* 138 */     this.evenOddSlider.setMaximum(1000);
/* 139 */     this.evenOddSlider.setValue(0);
/* 140 */     this.evenOddSlider.setName("evenOddSlider");
/* 141 */     this.evenOddSlider.addChangeListener(new ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/* 143 */         Roulette.this.evenOddSliderStateChanged(evt);
/*     */       }
/*     */       
/* 146 */     });
/* 147 */     this.smallBigSlider.setMaximum(1000);
/* 148 */     this.smallBigSlider.setValue(0);
/* 149 */     this.smallBigSlider.setName("smallBigSlider");
/* 150 */     this.smallBigSlider.addChangeListener(new ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/* 152 */         Roulette.this.smallBigSliderStateChanged(evt);
/*     */       }
/*     */       
/* 155 */     });
/* 156 */     this.redBlackSlider.setMaximum(1000);
/* 157 */     this.redBlackSlider.setValue(0);
/* 158 */     this.redBlackSlider.setName("redBlackSlider");
/* 159 */     this.redBlackSlider.addChangeListener(new ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/* 161 */         Roulette.this.redBlackSliderStateChanged(evt);
/*     */       }
/*     */       
/* 164 */     });
/* 165 */     this.dozenSlider.setMaximum(1000);
/* 166 */     this.dozenSlider.setValue(0);
/* 167 */     this.dozenSlider.setName("dozenSlider");
/* 168 */     this.dozenSlider.addChangeListener(new ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/* 170 */         Roulette.this.dozenSliderStateChanged(evt);
/*     */       }
/*     */       
/* 173 */     });
/* 174 */     this.columnSlider.setMaximum(1000);
/* 175 */     this.columnSlider.setValue(0);
/* 176 */     this.columnSlider.setName("columnSlider");
/* 177 */     this.columnSlider.addChangeListener(new ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/* 179 */         Roulette.this.columnSliderStateChanged(evt);
/*     */       }
/*     */       
/* 182 */     });
/* 183 */     this.smallBigLabel.setFont(new Font("Tahoma", 1, 18));
/* 184 */     this.smallBigLabel.setHorizontalAlignment(0);
/* 185 */     this.smallBigLabel.setText("0");
/* 186 */     this.smallBigLabel.setName("bigSmallLabel");
/*     */     
/* 188 */     this.redBlackResult.setFont(new Font("Tahoma", 1, 18));
/* 189 */     this.redBlackResult.setHorizontalAlignment(0);
/* 190 */     this.redBlackResult.setText("N/A");
/* 191 */     this.redBlackResult.setName("redBlackResult");
/*     */     
/* 193 */     this.dozenResult.setFont(new Font("Tahoma", 1, 18));
/* 194 */     this.dozenResult.setHorizontalAlignment(0);
/* 195 */     this.dozenResult.setText("N/A");
/* 196 */     this.dozenResult.setName("dozenResult");
/*     */     
/* 198 */     this.evenOddLabel.setFont(new Font("Tahoma", 1, 18));
/* 199 */     this.evenOddLabel.setHorizontalAlignment(0);
/* 200 */     this.evenOddLabel.setText("0");
/* 201 */     this.evenOddLabel.setName("evenOddLabel");
/*     */     
/* 203 */     this.columnResult.setFont(new Font("Tahoma", 1, 18));
/* 204 */     this.columnResult.setHorizontalAlignment(0);
/* 205 */     this.columnResult.setText("N/A");
/* 206 */     this.columnResult.setName("columnResult");
/*     */     
/* 208 */     this.numberLabel.setFont(new Font("Tahoma", 1, 18));
/* 209 */     this.numberLabel.setHorizontalAlignment(0);
/* 210 */     this.numberLabel.setText("0");
/* 211 */     this.numberLabel.setName("numberLabel");
/*     */     
/* 213 */     this.numberSlider.setMaximum(1000);
/* 214 */     this.numberSlider.setValue(0);
/* 215 */     this.numberSlider.setName("numberSlider");
/* 216 */     this.numberSlider.addChangeListener(new ChangeListener() {
/*     */       public void stateChanged(ChangeEvent evt) {
/* 218 */         Roulette.this.numberSliderStateChanged(evt);
/*     */       }
/*     */       
/* 221 */     });
/* 222 */     this.numberResult.setFont(new Font("Tahoma", 1, 18));
/* 223 */     this.numberResult.setHorizontalAlignment(0);
/* 224 */     this.numberResult.setText("N/A");
/* 225 */     this.numberResult.setName("numberResult");
/*     */     
/* 227 */     this.evenOddResult.setFont(new Font("Tahoma", 1, 18));
/* 228 */     this.evenOddResult.setHorizontalAlignment(0);
/* 229 */     this.evenOddResult.setText("N/A");
/* 230 */     this.evenOddResult.setName("evenOddResult");
/*     */     
/* 232 */     this.smallBigResult.setFont(new Font("Tahoma", 1, 18));
/* 233 */     this.smallBigResult.setHorizontalAlignment(0);
/* 234 */     this.smallBigResult.setText("N/A");
/* 235 */     this.smallBigResult.setName("bigSmallResult");
/*     */     
/* 237 */     this.redBlackLabel.setFont(new Font("Tahoma", 1, 18));
/* 238 */     this.redBlackLabel.setHorizontalAlignment(0);
/* 239 */     this.redBlackLabel.setText("0");
/* 240 */     this.redBlackLabel.setName("redBlackLabel");
/*     */     
/* 242 */     this.dozenLabel.setFont(new Font("Tahoma", 1, 18));
/* 243 */     this.dozenLabel.setHorizontalAlignment(0);
/* 244 */     this.dozenLabel.setText("0");
/* 245 */     this.dozenLabel.setName("dozenLabel");
/*     */     
/* 247 */     this.columnLabel.setFont(new Font("Tahoma", 1, 18));
/* 248 */     this.columnLabel.setHorizontalAlignment(0);
/* 249 */     this.columnLabel.setText("0");
/* 250 */     this.columnLabel.setName("columnLabel");
/*     */     
/* 252 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 253 */     getContentPane().setLayout(layout);
/* 254 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jButton1, -1, 77, 32767).addComponent(this.roulette, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jLabel8, -2, 110, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.bankLabel, -1, -1, 32767)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(layout.createSequentialGroup().addComponent(this.jLabel5, -2, 110, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.number)).addGroup(layout.createSequentialGroup().addComponent(this.jLabel2, -2, 110, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.evenOdd, -2, 131, -2)).addGroup(layout.createSequentialGroup().addComponent(this.jLabel4, -2, 110, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.redBlack, -2, 131, -2)).addGroup(layout.createSequentialGroup().addComponent(this.jLabel3, -2, 110, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.smallBig, -2, 131, -2)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addComponent(this.jLabel6, -1, -1, 32767).addComponent(this.jLabel7, -1, 110, 32767)).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.column, -2, 131, -2)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(10, 10, 10).addComponent(this.dozen, -2, 131, -2))))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.evenOddSlider, -2, 160, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.evenOddLabel, -2, 81, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.evenOddResult, -2, 81, -2)).addGroup(layout.createSequentialGroup().addComponent(this.numberSlider, -2, 160, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.numberLabel, -2, 81, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.numberResult, -2, 81, -2)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.smallBigSlider, -2, 160, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.smallBigLabel, -2, 81, -2)).addGroup(layout.createSequentialGroup().addComponent(this.redBlackSlider, -2, 160, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.redBlackLabel, -2, 81, -2)).addGroup(layout.createSequentialGroup().addComponent(this.dozenSlider, -2, 160, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.dozenLabel, -2, 81, -2)).addGroup(layout.createSequentialGroup().addComponent(this.columnSlider, -2, 160, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.columnLabel, -2, 81, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.columnResult, -2, 81, -2).addComponent(this.dozenResult, -2, 81, -2).addComponent(this.redBlackResult, -2, 81, -2).addComponent(this.smallBigResult, -2, 81, -2)))).addGap(0, 0, 32767))).addContainerGap()));
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
/* 337 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.roulette, -2, 74, -2).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton1, -2, 77, -2).addGap(0, 0, 32767)).addGroup(layout.createSequentialGroup().addGap(5, 5, 5).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel5, -1, -1, 32767).addComponent(this.number, -2, 40, -2)).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.numberSlider, -1, -1, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.numberLabel, -2, 40, -2).addComponent(this.numberResult, -2, 40, -2)))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.evenOddSlider, -1, -1, 32767).addComponent(this.evenOdd).addComponent(this.jLabel2, -1, -1, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.evenOddLabel, -1, 40, 32767).addComponent(this.evenOddResult, -1, 40, 32767))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.smallBigSlider, -1, -1, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel3, -2, 40, -2).addComponent(this.smallBig, -2, 40, -2)).addComponent(this.smallBigLabel, -1, -1, 32767).addComponent(this.smallBigResult, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.redBlackSlider, -1, -1, 32767).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel4, -2, 40, -2).addComponent(this.redBlack, -2, 40, -2)).addComponent(this.redBlackLabel, GroupLayout.Alignment.TRAILING, -1, -1, 32767).addComponent(this.redBlackResult, GroupLayout.Alignment.TRAILING, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.dozenSlider, -2, 40, -2).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.dozenResult, -2, 40, -2).addComponent(this.dozenLabel, -2, 40, -2))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.columnSlider, -1, -1, 32767).addComponent(this.columnLabel, -1, -1, 32767).addComponent(this.columnResult, -1, -1, 32767))).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.dozen, -2, 40, -2).addComponent(this.jLabel6, -2, 40, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.column, -2, 40, -2)).addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jLabel7, -2, 40, -2))).addGap(11, 11, 11))).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel8, -1, 40, 32767).addComponent(this.bankLabel, -1, -1, 32767)).addContainerGap()));
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
/* 411 */     pack(); }
/*     */   
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/* 415 */   private void numberSliderStateChanged(ChangeEvent evt) { int bet = this.numberSlider.getValue();
/* 416 */     this.numberLabel.setText(Integer.toString(bet)); }
/*     */   
/*     */   private JLabel jLabel4;
/*     */   
/* 420 */   private void evenOddSliderStateChanged(ChangeEvent evt) { int bet = this.evenOddSlider.getValue();
/* 421 */     this.evenOddLabel.setText(Integer.toString(bet)); }
/*     */   
/*     */   private JLabel jLabel5;
/*     */   
/* 425 */   private void smallBigSliderStateChanged(ChangeEvent evt) { int bet = this.smallBigSlider.getValue();
/* 426 */     this.smallBigLabel.setText(Integer.toString(bet)); }
/*     */   
/*     */   private JLabel jLabel6;
/*     */   
/* 430 */   private void redBlackSliderStateChanged(ChangeEvent evt) { int bet = this.redBlackSlider.getValue();
/* 431 */     this.redBlackLabel.setText(Integer.toString(bet)); }
/*     */   
/*     */   private JLabel jLabel7;
/*     */   
/* 435 */   private void dozenSliderStateChanged(ChangeEvent evt) { int bet = this.dozenSlider.getValue();
/* 436 */     this.dozenLabel.setText(Integer.toString(bet));
/*     */   }
/*     */   
/*     */   private JLabel jLabel8;
/* 440 */   private void columnSliderStateChanged(ChangeEvent evt) { int bet = this.columnSlider.getValue();
/* 441 */     this.columnLabel.setText(Integer.toString(bet));
/*     */   }
/*     */   
/*     */   private boolean isIn(int[] array, int search) {
/* 445 */     for (int i = 0; i < array.length; i++) {
/* 446 */       if (array[i] == search) {
/* 447 */         return true;
/*     */       }
/*     */     }
/* 450 */     return false;
/*     */   }
/*     */   
/*     */   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
/*     */   {
/* 455 */     int totalBet = this.numberSlider.getValue() + this.evenOddSlider.getValue() + this.smallBigSlider.getValue() + this.redBlackSlider.getValue() + this.dozenSlider.getValue() + this.columnSlider.getValue();
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 461 */     if (totalBet > this.bank) {
/* 462 */       javax.swing.JOptionPane.showMessageDialog(this, "Nemuzes tolik vsadit", "Chyba", 0);
/* 463 */       return;
/*     */     }
/*     */     
/* 466 */     java.util.Random rd = new java.util.Random();
/* 467 */     int roulette = rd.nextInt(37);
/* 468 */     if (isIn(this.reds, roulette)) {
/* 469 */       this.roulette.setForeground(Color.red);
/*     */     } else {
/* 471 */       this.roulette.setForeground(Color.black);
/*     */     }
/* 473 */     this.roulette.setText(Integer.toString(roulette));
/*     */     
/* 475 */     int totalWin = 0;
/*     */     
/* 477 */     if (this.numberSlider.getValue() > 0) {
/* 478 */       int number = 0;
/*     */       try {
/* 480 */         number = Integer.parseInt(this.number.getText());
/*     */       } catch (NumberFormatException e) {
/* 482 */         this.number.setBackground(Color.red);
/* 483 */         this.roulette.setText("");
/* 484 */         return;
/*     */       }
/* 486 */       this.number.setBackground(Color.white);
/* 487 */       if (roulette == number) {
/* 488 */         int win = this.numberSlider.getValue() * 35;
/* 489 */         this.numberResult.setText(Integer.toString(win));
/* 490 */         totalWin += win;
/*     */       } else {
/* 492 */         this.numberResult.setText("Loose");
/* 493 */         this.bank -= this.numberSlider.getValue();
/*     */       }
/*     */     } else {
/* 496 */       this.numberResult.setText("N/A");
/*     */     }
/*     */     
/* 499 */     if (roulette != 0)
/*     */     {
/* 501 */       if (this.evenOddSlider.getValue() > 0) {
/* 502 */         String evenOdd = (String)this.evenOdd.getSelectedItem();
/* 503 */         if ((evenOdd.equals("Even")) && (roulette % 2 == 0)) {
/* 504 */           int win = this.evenOddSlider.getValue();
/* 505 */           this.evenOddResult.setText(Integer.toString(win));
/* 506 */           totalWin += win;
/* 507 */         } else if ((evenOdd.equals("Odd")) && (roulette % 2 == 1)) {
/* 508 */           int win = this.evenOddSlider.getValue();
/* 509 */           this.evenOddResult.setText(Integer.toString(win));
/* 510 */           totalWin += win;
/*     */         } else {
/* 512 */           this.evenOddResult.setText("Loose");
/* 513 */           this.bank -= this.evenOddSlider.getValue();
/*     */         }
/*     */       } else {
/* 516 */         this.evenOddResult.setText("N/A");
/*     */       }
/*     */       
/* 519 */       if (this.smallBigSlider.getValue() > 0) {
/* 520 */         String smallBig = (String)this.smallBig.getSelectedItem();
/* 521 */         if ((smallBig.equals("Small")) && (roulette < 19)) {
/* 522 */           int win = this.smallBigSlider.getValue();
/* 523 */           this.smallBigResult.setText(Integer.toString(win));
/* 524 */           totalWin += win;
/* 525 */         } else if ((smallBig.equals("Big")) && (roulette > 18)) {
/* 526 */           int win = this.smallBigSlider.getValue();
/* 527 */           this.smallBigResult.setText(Integer.toString(win));
/* 528 */           totalWin += win;
/*     */         } else {
/* 530 */           this.smallBigResult.setText("Loose");
/* 531 */           this.bank -= this.smallBigSlider.getValue();
/*     */         }
/*     */       } else {
/* 534 */         this.smallBigResult.setText("N/A");
/*     */       }
/*     */       
/* 537 */       if (this.redBlackSlider.getValue() > 0) {
/* 538 */         String redBlack = (String)this.redBlack.getSelectedItem();
/* 539 */         if ((redBlack.equals("Red")) && (isIn(this.reds, roulette))) {
/* 540 */           int win = this.redBlackSlider.getValue();
/* 541 */           this.redBlackResult.setText(Integer.toString(win));
/* 542 */           totalWin += win;
/* 543 */         } else if ((redBlack.equals("Black")) && (isIn(this.blacks, roulette))) {
/* 544 */           int win = this.redBlackSlider.getValue();
/* 545 */           this.redBlackResult.setText(Integer.toString(win));
/* 546 */           totalWin += win;
/*     */         } else {
/* 548 */           this.redBlackResult.setText("Loose");
/* 549 */           this.bank -= this.redBlackSlider.getValue();
/*     */         }
/*     */       } else {
/* 552 */         this.redBlackResult.setText("N/A");
/*     */       }
/*     */       
/* 555 */       if (this.dozenSlider.getValue() > 0) {
/* 556 */         String dozen = (String)this.dozen.getSelectedItem();
/* 557 */         if ((dozen.equals("1st")) && (roulette < 13)) {
/* 558 */           int win = this.dozenSlider.getValue() * 2;
/* 559 */           this.dozenResult.setText(Integer.toString(win));
/* 560 */           totalWin += win;
/* 561 */         } else if ((dozen.equals("2nd")) && (roulette > 12) && (roulette < 25)) {
/* 562 */           int win = this.dozenSlider.getValue() * 2;
/* 563 */           this.dozenResult.setText(Integer.toString(win));
/* 564 */           totalWin += win;
/* 565 */         } else if ((dozen.equals("3rd")) && (roulette > 24)) {
/* 566 */           int win = this.dozenSlider.getValue() * 2;
/* 567 */           this.dozenResult.setText(Integer.toString(win));
/* 568 */           totalWin += win;
/*     */         } else {
/* 570 */           this.dozenResult.setText("Loose");
/* 571 */           this.bank -= this.dozenSlider.getValue();
/*     */         }
/*     */       } else {
/* 574 */         this.dozenResult.setText("N/A");
/*     */       }
/*     */       
/* 577 */       if (this.columnSlider.getValue() > 0) {
/* 578 */         String column = (String)this.column.getSelectedItem();
/* 579 */         if ((column.equals("1st")) && (roulette % 3 == 1)) {
/* 580 */           int win = this.columnSlider.getValue() * 2;
/* 581 */           this.columnResult.setText(Integer.toString(win));
/* 582 */           totalWin += win;
/* 583 */         } else if ((column.equals("2nd")) && (roulette % 3 == 2)) {
/* 584 */           int win = this.columnSlider.getValue() * 2;
/* 585 */           this.columnResult.setText(Integer.toString(win));
/* 586 */           totalWin += win;
/* 587 */         } else if ((column.equals("3rd")) && (roulette % 3 == 0)) {
/* 588 */           int win = this.columnSlider.getValue() * 2;
/* 589 */           this.columnResult.setText(Integer.toString(win));
/* 590 */           totalWin += win;
/*     */         } else {
/* 592 */           this.columnResult.setText("Loose");
/* 593 */           this.bank -= this.columnSlider.getValue();
/*     */         }
/*     */       } else {
/* 596 */         this.columnResult.setText("N/A");
/*     */       }
/*     */     }
/*     */     else {
/* 600 */       if (this.evenOddSlider.getValue() > 0) {
/* 601 */         this.evenOddResult.setText("Loose");
/* 602 */         this.bank -= this.evenOddSlider.getValue();
/*     */       }
/* 604 */       if (this.smallBigSlider.getValue() > 0) {
/* 605 */         this.smallBigResult.setText("Loose");
/* 606 */         this.bank -= this.smallBigSlider.getValue();
/*     */       }
/* 608 */       if (this.redBlackSlider.getValue() > 0) {
/* 609 */         this.redBlackResult.setText("Loose");
/* 610 */         this.bank -= this.redBlackSlider.getValue();
/*     */       }
/* 612 */       if (this.dozenSlider.getValue() > 0) {
/* 613 */         this.dozenResult.setText("Loose");
/* 614 */         this.bank -= this.dozenSlider.getValue();
/*     */       }
/* 616 */       if (this.columnSlider.getValue() > 0) {
/* 617 */         this.columnResult.setText("Loose");
/* 618 */         this.bank -= this.columnSlider.getValue();
/*     */       }
/*     */     }
/* 621 */     this.bank += totalWin;
/* 622 */     this.bankLabel.setText(Integer.toString(this.bank));
/* 623 */     if (this.bank == 0)
/* 624 */       this.jButton1.setEnabled(false); }
/*     */   
/*     */   private JTextField number;
/*     */   private JLabel numberLabel;
/*     */   private JLabel numberResult;
/*     */   private JSlider numberSlider;
/*     */   private JComboBox redBlack;
/*     */   private JLabel redBlackLabel;
/*     */   private JLabel redBlackResult;
/*     */   private JSlider redBlackSlider;
/*     */   private JLabel roulette;
/*     */   private JComboBox smallBig;
/*     */   private JLabel smallBigLabel;
/*     */   private JLabel smallBigResult;
/* 638 */   private JSlider smallBigSlider; public static void main(String[] args) { try { for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 639 */         if ("Nimbus".equals(info.getName())) {
/* 640 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 641 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 645 */       Logger.getLogger(Roulette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 647 */       Logger.getLogger(Roulette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 649 */       Logger.getLogger(Roulette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 651 */       Logger.getLogger(Roulette.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 656 */     java.awt.EventQueue.invokeLater(new Runnable() {
/*     */       public void run() {
/* 658 */         new Roulette().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Roulette\Roulette.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */