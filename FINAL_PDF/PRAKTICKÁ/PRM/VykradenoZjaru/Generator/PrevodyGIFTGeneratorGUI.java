/*     */ package Generator;
/*     */ 
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.GroupLayout.ParallelGroup;
/*     */ import javax.swing.GroupLayout.SequentialGroup;
/*     */ import javax.swing.JLabel;
/*     */ 
/*     */ public class PrevodyGIFTGeneratorGUI extends javax.swing.JFrame
/*     */ {
/*     */   private javax.swing.JButton jButton1;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel2;
/*     */   private JLabel jLabel3;
/*     */   private JLabel jLabel4;
/*     */   private JLabel jLabel5;
/*     */   private JLabel jLabel6;
/*     */   private JLabel jLabel7;
/*     */   private javax.swing.JSpinner jSpinner1;
/*     */   private javax.swing.JSpinner jSpinner2;
/*     */   private javax.swing.JSpinner jSpinner3;
/*     */   private javax.swing.JSpinner jSpinner4;
/*     */   private javax.swing.JSpinner jSpinner5;
/*     */   private javax.swing.JTextField jTextField1;
/*     */   
/*     */   public PrevodyGIFTGeneratorGUI()
/*     */   {
/*  27 */     initComponents();
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
/*  39 */     this.jSpinner1 = new javax.swing.JSpinner();
/*  40 */     this.jSpinner2 = new javax.swing.JSpinner();
/*  41 */     this.jSpinner3 = new javax.swing.JSpinner();
/*  42 */     this.jLabel1 = new JLabel();
/*  43 */     this.jLabel2 = new JLabel();
/*  44 */     this.jLabel3 = new JLabel();
/*  45 */     this.jSpinner4 = new javax.swing.JSpinner();
/*  46 */     this.jLabel4 = new JLabel();
/*  47 */     this.jLabel5 = new JLabel();
/*  48 */     this.jSpinner5 = new javax.swing.JSpinner();
/*  49 */     this.jLabel6 = new JLabel();
/*  50 */     this.jTextField1 = new javax.swing.JTextField();
/*  51 */     this.jLabel7 = new JLabel();
/*  52 */     this.jButton1 = new javax.swing.JButton();
/*     */     
/*  54 */     setDefaultCloseOperation(3);
/*     */     
/*  56 */     this.jSpinner1.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*     */     
/*  58 */     this.jSpinner2.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*     */     
/*  60 */     this.jSpinner3.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*     */     
/*  62 */     this.jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  63 */     this.jLabel1.setText("Minimum");
/*     */     
/*  65 */     this.jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  66 */     this.jLabel2.setText("Maximum");
/*     */     
/*  68 */     this.jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  69 */     this.jLabel3.setText("Pocet");
/*     */     
/*  71 */     this.jSpinner4.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*     */     
/*  73 */     this.jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  74 */     this.jLabel4.setText("Do soustavy");
/*     */     
/*  76 */     this.jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  77 */     this.jLabel5.setText("Ze soustavy");
/*     */     
/*  79 */     this.jSpinner5.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*     */     
/*  81 */     this.jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  82 */     this.jLabel6.setText("Soubor");
/*     */     
/*  84 */     this.jTextField1.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*     */     
/*  86 */     this.jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  87 */     this.jLabel7.setHorizontalAlignment(0);
/*  88 */     this.jLabel7.setText("Spuštěno");
/*     */     
/*  90 */     this.jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18));
/*  91 */     this.jButton1.setText("Generovat");
/*  92 */     this.jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
/*     */       public void mouseClicked(java.awt.event.MouseEvent evt) {
/*  94 */         PrevodyGIFTGeneratorGUI.this.jButton1MouseClicked(evt);
/*     */       }
/*     */       
/*  97 */     });
/*  98 */     GroupLayout layout = new GroupLayout(getContentPane());
/*  99 */     getContentPane().setLayout(layout);
/* 100 */     layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.jButton1, javax.swing.GroupLayout.Alignment.LEADING, -1, 586, 32767).addComponent(this.jLabel7, javax.swing.GroupLayout.Alignment.LEADING, -1, 586, 32767).addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false).addComponent(this.jLabel2, javax.swing.GroupLayout.Alignment.LEADING, -1, 102, 32767).addComponent(this.jLabel1, javax.swing.GroupLayout.Alignment.LEADING, -1, 102, 32767).addComponent(this.jLabel3, javax.swing.GroupLayout.Alignment.LEADING, -1, 102, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(this.jSpinner3, -1, 68, 32767).addComponent(this.jSpinner2).addComponent(this.jSpinner1, -2, 112, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jLabel5, -1, 246, 32767).addComponent(this.jLabel4, -2, 141, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.jSpinner5, -1, 90, 32767).addComponent(this.jSpinner4, -2, 90, -2))).addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup().addComponent(this.jLabel6, -1, 273, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField1, -2, 301, -2))).addContainerGap()));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 131 */     layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jLabel1).addComponent(this.jSpinner1, -1, 47, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jSpinner3, -2, 40, -2).addComponent(this.jLabel2, -1, 40, 32767))).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jLabel5, -2, 31, -2).addComponent(this.jSpinner4, -2, 40, -2)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(this.jSpinner5, -1, 42, 32767).addComponent(this.jLabel4, -1, 42, 32767)))).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(this.jSpinner2, -2, 40, -2).addComponent(this.jLabel3, -1, 40, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(this.jTextField1).addComponent(this.jLabel6, -1, 31, 32767)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jLabel7, -2, 49, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton1, -2, 48, -2).addContainerGap()));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 167 */     pack();
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public static long power(int base, int exp)
/*     */   {
/* 175 */     long result = 1L;
/* 176 */     for (int i = 0; i < exp; i++) {
/* 177 */       result *= base;
/*     */     }
/* 179 */     return result;
/*     */   }
/*     */   
/*     */   public static String fromXToDec(String input, int from) {
/* 183 */     long tmp = 0L;
/* 184 */     for (int i = input.length() - 1; i >= 0; i--) {
/* 185 */       switch (input.charAt(i)) {
/*     */       case 'F': 
/* 187 */         tmp += 15L * power(from, input.length() - 1 - i);
/* 188 */         break;
/*     */       case 'E': 
/* 190 */         tmp += 14L * power(from, input.length() - 1 - i);
/* 191 */         break;
/*     */       case 'D': 
/* 193 */         tmp += 13L * power(from, input.length() - 1 - i);
/* 194 */         break;
/*     */       case 'C': 
/* 196 */         tmp += 12L * power(from, input.length() - 1 - i);
/* 197 */         break;
/*     */       case 'B': 
/* 199 */         tmp += 11L * power(from, input.length() - 1 - i);
/* 200 */         break;
/*     */       case 'A': 
/* 202 */         tmp += 10L * power(from, input.length() - 1 - i);
/* 203 */         break;
/*     */       default: 
/* 205 */         tmp += Long.parseLong(Character.toString(input.charAt(i))) * power(from, input.length() - 1 - i);
/*     */       }
/*     */       
/*     */     }
/* 209 */     return Long.toString(tmp);
/*     */   }
/*     */   
/*     */   public static String fromDecToX(String input, int to) {
/* 213 */     String res = "";
/* 214 */     long num = Long.parseLong(input);
/* 215 */     while (num > 0L) {
/* 216 */       int tmp = (int)(num % to);
/* 217 */       num /= to;
/* 218 */       switch (tmp) {
/*     */       case 15: 
/* 220 */         res = res + "F";
/* 221 */         break;
/*     */       case 14: 
/* 223 */         res = res + "E";
/* 224 */         break;
/*     */       case 13: 
/* 226 */         res = res + "D";
/* 227 */         break;
/*     */       case 12: 
/* 229 */         res = res + "C";
/* 230 */         break;
/*     */       case 11: 
/* 232 */         res = res + "B";
/* 233 */         break;
/*     */       case 10: 
/* 235 */         res = res + "A";
/* 236 */         break;
/*     */       default: 
/* 238 */         res = res + Long.toString(tmp);
/*     */       }
/*     */       
/*     */     }
/* 242 */     String rev = "";
/* 243 */     for (int i = res.length() - 1; i >= 0; i--) {
/* 244 */       rev = rev + res.charAt(i);
/*     */     }
/* 246 */     return rev;
/*     */   }
/*     */   
/*     */   private void jButton1MouseClicked(java.awt.event.MouseEvent evt)
/*     */   {
/* 251 */     int min = ((Integer)this.jSpinner1.getValue()).intValue();
/* 252 */     if (min < 0) {
/* 253 */       this.jLabel7.setForeground(java.awt.Color.red);
/* 254 */       this.jLabel7.setText("NELZE (pouze kladna cisla)");
/* 255 */       return;
/*     */     }
/*     */     
/* 258 */     int max = ((Integer)this.jSpinner3.getValue()).intValue();
/* 259 */     if (max < 0) {
/* 260 */       this.jLabel7.setForeground(java.awt.Color.red);
/* 261 */       this.jLabel7.setText("NELZE (pouze kladna cisla)");
/* 262 */       return;
/*     */     }
/*     */     
/* 265 */     if (min > max) {
/* 266 */       this.jLabel7.setForeground(java.awt.Color.red);
/* 267 */       this.jLabel7.setText("NELZE (spodni mez musi byt nizsi jak vrchni)");
/* 268 */       return;
/*     */     }
/*     */     
/* 271 */     int count = ((Integer)this.jSpinner2.getValue()).intValue();
/* 272 */     if (count > max - min) {
/* 273 */       this.jLabel7.setForeground(java.awt.Color.red);
/* 274 */       this.jLabel7.setText("NELZE (hodnoty by se opakovaly)");
/* 275 */       return;
/*     */     }
/*     */     
/* 278 */     int from = ((Integer)this.jSpinner4.getValue()).intValue();
/* 279 */     if ((from < 2) || (from > 16)) {
/* 280 */       this.jLabel7.setForeground(java.awt.Color.red);
/* 281 */       this.jLabel7.setText("NELZE (platne soustavy pouze od 2 do 16)");
/* 282 */       return;
/*     */     }
/* 284 */     String fromText = "";
/* 285 */     switch (from) {
/*     */     case 2: 
/* 287 */       fromText = "dvojkové";
/* 288 */       break;
/*     */     case 3: 
/* 290 */       fromText = "trojkové";
/* 291 */       break;
/*     */     case 4: 
/* 293 */       fromText = "čtyřkové";
/* 294 */       break;
/*     */     case 5: 
/* 296 */       fromText = "pětkové";
/* 297 */       break;
/*     */     case 6: 
/* 299 */       fromText = "šestkové";
/* 300 */       break;
/*     */     case 7: 
/* 302 */       fromText = "sedmičkové";
/* 303 */       break;
/*     */     case 8: 
/* 305 */       fromText = "osmičkové";
/* 306 */       break;
/*     */     case 9: 
/* 308 */       fromText = "devítkové";
/* 309 */       break;
/*     */     case 10: 
/* 311 */       fromText = "desítkové";
/* 312 */       break;
/*     */     case 11: 
/* 314 */       fromText = "jedenáctkové";
/* 315 */       break;
/*     */     case 12: 
/* 317 */       fromText = "dvanáctkové";
/* 318 */       break;
/*     */     case 13: 
/* 320 */       fromText = "třináctkové";
/* 321 */       break;
/*     */     case 14: 
/* 323 */       fromText = "čtrnáckové";
/* 324 */       break;
/*     */     case 15: 
/* 326 */       fromText = "patnáckové";
/* 327 */       break;
/*     */     case 16: 
/* 329 */       fromText = "šestnáckové";
/*     */     }
/*     */     
/*     */     
/* 333 */     int to = ((Integer)this.jSpinner5.getValue()).intValue();
/* 334 */     if ((to < 2) || (to > 16)) {
/* 335 */       this.jLabel7.setForeground(java.awt.Color.red);
/* 336 */       this.jLabel7.setText("NELZE (platne soustavy pouze od 2 do 16)");
/* 337 */       return;
/*     */     }
/* 339 */     String toText = "";
/* 340 */     switch (to) {
/*     */     case 2: 
/* 342 */       toText = "dvojkové";
/* 343 */       break;
/*     */     case 3: 
/* 345 */       toText = "trojkové";
/* 346 */       break;
/*     */     case 4: 
/* 348 */       toText = "čtyřkové";
/* 349 */       break;
/*     */     case 5: 
/* 351 */       toText = "pětkové";
/* 352 */       break;
/*     */     case 6: 
/* 354 */       toText = "šestkové";
/* 355 */       break;
/*     */     case 7: 
/* 357 */       toText = "sedmičkové";
/* 358 */       break;
/*     */     case 8: 
/* 360 */       toText = "osmičkové";
/* 361 */       break;
/*     */     case 9: 
/* 363 */       toText = "devítkové";
/* 364 */       break;
/*     */     case 10: 
/* 366 */       toText = "desítkové";
/* 367 */       break;
/*     */     case 11: 
/* 369 */       toText = "jedenáctkové";
/* 370 */       break;
/*     */     case 12: 
/* 372 */       toText = "dvanáctkové";
/* 373 */       break;
/*     */     case 13: 
/* 375 */       toText = "třináctkové";
/* 376 */       break;
/*     */     case 14: 
/* 378 */       toText = "čtrnáckové";
/* 379 */       break;
/*     */     case 15: 
/* 381 */       toText = "patnáckové";
/* 382 */       break;
/*     */     case 16: 
/* 384 */       toText = "šestnáckové";
/*     */     }
/*     */     
/*     */     
/* 388 */     java.io.File output = new java.io.File(this.jTextField1.getText());
/* 389 */     if (output.exists()) {
/* 390 */       this.jLabel7.setForeground(java.awt.Color.red);
/* 391 */       this.jLabel7.setText("NELZE (vstupni soubor existuje)"); return;
/*     */     }
/*     */     java.io.FileWriter fw;
/*     */     try
/*     */     {
/* 396 */       fw = new java.io.FileWriter(output);
/*     */     } catch (java.io.IOException ex) {
/* 398 */       this.jLabel7.setForeground(java.awt.Color.red);
/* 399 */       this.jLabel7.setText("NELZE (problem s vystupnim souborem)");
/* 400 */       return;
/*     */     }
/*     */     
/* 403 */     this.jLabel7.setForeground(java.awt.Color.black);
/* 404 */     this.jLabel7.setText("Provadim");
/*     */     
/* 406 */     int[] array = new int[max - min + 1];
/* 407 */     for (int i = min; i <= max; i++) {
/* 408 */       array[(i - min)] = i;
/*     */     }
/* 410 */     java.util.Random rd = new java.util.Random();
/* 411 */     for (int i = 0; i < max - min + 1; i++) {
/* 412 */       int tmp = rd.nextInt(max - min + 1);
/* 413 */       int tmp2 = array[i];
/* 414 */       array[i] = array[tmp];
/* 415 */       array[tmp] = tmp2;
/*     */     }
/* 417 */     for (int i = 0; i < count; i++) {
/*     */       try {
/* 419 */         fw.write("::Otázka " + String.format("%03d", new Object[] { Integer.valueOf(i + 1) }) + ":: Převeďte z " + fromText + " do " + toText + " soustavy.<br/>Zapisujte bez nevýznamných nul.<br/><br/> $$(" + fromDecToX(Integer.toString(array[i]), from) + ")_\\{" + from + "\\} = (?)_\\{" + to + "\\}$$ {=" + fromDecToX(Integer.toString(array[i]), to) + "}\n\n");
/*     */       }
/*     */       catch (java.io.IOException ex)
/*     */       {
/* 423 */         this.jLabel7.setForeground(java.awt.Color.red);
/* 424 */         this.jLabel7.setText("NELZE (problem s vystupnim souborem)");
/* 425 */         return;
/*     */       }
/*     */     }
/*     */     try
/*     */     {
/* 430 */       fw.close();
/*     */     } catch (java.io.IOException ex) {
/* 432 */       this.jLabel7.setForeground(java.awt.Color.red);
/* 433 */       this.jLabel7.setText("NELZE (problem s vystupnim souborem)");
/*     */     }
/* 435 */     this.jLabel7.setForeground(java.awt.Color.blue);
/* 436 */     this.jLabel7.setText("Hotovo");
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
/* 449 */       for (javax.swing.UIManager.LookAndFeelInfo info : ) {
/* 450 */         if ("Nimbus".equals(info.getName())) {
/* 451 */           javax.swing.UIManager.setLookAndFeel(info.getClassName());
/* 452 */           break;
/*     */         }
/*     */       }
/*     */     } catch (ClassNotFoundException ex) {
/* 456 */       java.util.logging.Logger.getLogger(PrevodyGIFTGeneratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (InstantiationException ex) {
/* 458 */       java.util.logging.Logger.getLogger(PrevodyGIFTGeneratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (IllegalAccessException ex) {
/* 460 */       java.util.logging.Logger.getLogger(PrevodyGIFTGeneratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
/* 462 */       java.util.logging.Logger.getLogger(PrevodyGIFTGeneratorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/* 467 */     java.awt.EventQueue.invokeLater(new Runnable()
/*     */     {
/*     */       public void run() {
/* 470 */         new PrevodyGIFTGeneratorGUI().setVisible(true);
/*     */       }
/*     */     });
/*     */   }
/*     */ }


/* Location:              G:\DOWN\MersPrime.jar!\Generator\PrevodyGIFTGeneratorGUI.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */