package FinalMaturitaCodes;

public class _Mobil extends javax.swing.JFrame{

	private int     lastClick;
	private int     tlacitko;
	private boolean alphanum;
	private int     lastPos;

	/** Creates new form mobil */
	public _Mobil(){
		initComponents();
		this.lastPos = -1;
		this.lastClick = 0;
		this.alphanum = true;
	}

	private void displej(char[] znaky, int tlacitko){
		if((this.lastClick == tlacitko) && (this.alphanum)) {
			this.lastPos = (++this.lastPos) % znaky.length;
			String display = this.jLabel4.getText();
			display = display.substring(0, display.length() - 1) + znaky[this.lastPos];
			this.jLabel4.setText(display);
		} else {
			this.lastPos = 0;
			if(this.alphanum) {
				this.jLabel4.setText(this.jLabel4.getText() + znaky[0]);
			} else {
				this.jLabel4.setText(this.jLabel4.getText() + Integer.toString(tlacitko));
			}
			this.lastClick = tlacitko;
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
	 * content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents(){
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("1.,-");
		jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jLabel1.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent evt){
				jLabel1MouseClicked(evt);
			}
		});
		jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("2ABC");
		jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jLabel2.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent evt){
				jLabel2MouseClicked(evt);
			}
		});
		jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel3.setText("3DEF");
		jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jLabel3.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent evt){
				jLabel3MouseClicked(evt);
			}
		});
		jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel5.setText("4GHI");
		jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jLabel5.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent evt){
				jLabel5MouseClicked(evt);
			}
		});
		jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel6.setText("6MNO");
		jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jLabel6.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent evt){
				jLabel6MouseClicked(evt);
			}
		});
		jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setText("5JKL");
		jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jLabel7.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent evt){
				jLabel7MouseClicked(evt);
			}
		});
		jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel8.setText("7PQRS");
		jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jLabel8.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent evt){
				jLabel8MouseClicked(evt);
			}
		});
		jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel9.setText("8TUV");
		jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jLabel9.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent evt){
				jLabel9MouseClicked(evt);
			}
		});
		jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel10.setText("9WXYZ");
		jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jLabel10.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent evt){
				jLabel10MouseClicked(evt);
			}
		});
		jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel11.setText("*");
		jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jLabel11.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent evt){
				jLabel11MouseClicked(evt);
			}
		});
		jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel12.setText("0");
		jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jLabel12.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent evt){
				jLabel12MouseClicked(evt);
			}
		});
		jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
		jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel13.setText("#");
		jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		jLabel13.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent evt){
				jLabel13MouseClicked(evt);
			}
		});
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
												.addContainerGap()
												.addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
										.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
														.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
																.addContainerGap()
																.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
														.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
																.addGap(8, 8, 8)
																.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
														.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(layout.createSequentialGroup()
																.addGap(15, 15, 15)
																.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(layout.createSequentialGroup()
																.addGap(18, 18, 18)
																.addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))))
								.addContainerGap(17, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
								.addGap(18, 18, 18)
								.addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
								.addGap(14, 14, 14))
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
								.addGap(18, 18, 18)
								.addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
								.addGap(14, 14, 14))
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
												.addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
										.addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
										.addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
										.addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
										.addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
								.addGap(11, 11, 11))
		);
		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jLabel1MouseClicked(java.awt.event.MouseEvent evt){//GEN-FIRST:event_jLabel1MouseClicked
		char[] znaky = new char[]{'.', ',', '-'};
		displej(znaky, 1);
	}//GEN-LAST:event_jLabel1MouseClicked

	private void jLabel2MouseClicked(java.awt.event.MouseEvent evt){//GEN-FIRST:event_jLabel2MouseClicked
		char[] znaky = new char[]{'A', 'B', 'C'};
		displej(znaky, 2);
	}//GEN-LAST:event_jLabel2MouseClicked

	private void jLabel3MouseClicked(java.awt.event.MouseEvent evt){//GEN-FIRST:event_jLabel3MouseClicked
		char[] znaky = new char[]{'D', 'E', 'F'};
		displej(znaky, 3);
	}//GEN-LAST:event_jLabel3MouseClicked

	private void jLabel5MouseClicked(java.awt.event.MouseEvent evt){//GEN-FIRST:event_jLabel5MouseClicked
		char[] znaky = new char[]{'G', 'H', 'I'};
		displej(znaky, 4);
	}//GEN-LAST:event_jLabel5MouseClicked

	private void jLabel7MouseClicked(java.awt.event.MouseEvent evt){//GEN-FIRST:event_jLabel7MouseClicked
		char[] znaky = new char[]{'J', 'K', 'L'};
		displej(znaky, 5);
	}//GEN-LAST:event_jLabel7MouseClicked

	private void jLabel6MouseClicked(java.awt.event.MouseEvent evt){//GEN-FIRST:event_jLabel6MouseClicked
		char[] znaky = new char[]{'M', 'N', 'O'};
		displej(znaky, 6);
	}//GEN-LAST:event_jLabel6MouseClicked

	private void jLabel8MouseClicked(java.awt.event.MouseEvent evt){//GEN-FIRST:event_jLabel8MouseClicked
		char[] znaky = new char[]{'P', 'Q', 'R', 'S'};
		displej(znaky, 7);
	}//GEN-LAST:event_jLabel8MouseClicked

	private void jLabel9MouseClicked(java.awt.event.MouseEvent evt){//GEN-FIRST:event_jLabel9MouseClicked
		char[] znaky = new char[]{'T', 'U', 'V'};
		displej(znaky, 8);
	}//GEN-LAST:event_jLabel9MouseClicked

	private void jLabel10MouseClicked(java.awt.event.MouseEvent evt){//GEN-FIRST:event_jLabel10MouseClicked
		char[] znaky = new char[]{'W', 'X', 'Y', 'Z'};
		displej(znaky, 9);
	}//GEN-LAST:event_jLabel10MouseClicked

	private void jLabel11MouseClicked(java.awt.event.MouseEvent evt){//GEN-FIRST:event_jLabel11MouseClicked
		this.alphanum = !this.alphanum;
	}//GEN-LAST:event_jLabel11MouseClicked

	private void jLabel12MouseClicked(java.awt.event.MouseEvent evt){//GEN-FIRST:event_jLabel12MouseClicked
		char[] znaky = new char[]{' '};
		displej(znaky, 0);
	}//GEN-LAST:event_jLabel12MouseClicked

	private void jLabel13MouseClicked(java.awt.event.MouseEvent evt){//GEN-FIRST:event_jLabel13MouseClicked
		this.lastClick = -1;
	}//GEN-LAST:event_jLabel13MouseClicked

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]){
	    /* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
	     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
		try {
			for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch(ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(_Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch(InstantiationException ex) {
			java.util.logging.Logger.getLogger(_Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch(IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(_Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch(javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(_Mobil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

        /* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable(){

			public void run(){
				new _Mobil().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	// End of variables declaration//GEN-END:variables
}
