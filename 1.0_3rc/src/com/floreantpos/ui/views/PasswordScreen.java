/*
 * PasswordScreen.java
 *
 * Created on August 14, 2006, 11:01 PM
 */

package com.floreantpos.ui.views;

import java.awt.event.ActionEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;

import com.floreantpos.config.ui.DatabaseConfigurationDialog;
import com.floreantpos.main.Application;
import com.floreantpos.model.AttendenceHistory;
import com.floreantpos.model.Shift;
import com.floreantpos.model.User;
import com.floreantpos.model.UserType;
import com.floreantpos.model.dao.AttendenceHistoryDAO;
import com.floreantpos.model.dao.UserDAO;
import com.floreantpos.model.dao.UserTypeDAO;
import com.floreantpos.swing.MessageDialog;
import com.floreantpos.ui.dialog.POSMessageDialog;
import com.floreantpos.util.ShiftUtil;

/**
 *
 * @author  MShahriar
 */
public class PasswordScreen extends JPanel {
	private static PasswordScreen instance;

	/** Creates new form PasswordScreen */
	private PasswordScreen() {
		initComponents();

		//cbUserType.setModel(new DefaultComboBoxModel(new String[] {User.USER_TYPE_MANAGER, User.USER_TYPE_CASHIER, User.USER_TYPE_SERVER}));

		btnConfigureDatabase.setAction(goAction);
		btnConfigureDatabase.setActionCommand("DBCONFIG");
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

		buttonPanel = new javax.swing.JPanel();
		posButton4 = new com.floreantpos.swing.PosButton();
		posButton13 = new com.floreantpos.swing.PosButton();
		posButton12 = new com.floreantpos.swing.PosButton();
		posButton9 = new com.floreantpos.swing.PosButton();
		posButton10 = new com.floreantpos.swing.PosButton();
		posButton11 = new com.floreantpos.swing.PosButton();
		posButton8 = new com.floreantpos.swing.PosButton();
		posButton7 = new com.floreantpos.swing.PosButton();
		posButton6 = new com.floreantpos.swing.PosButton();
		posButton3 = new com.floreantpos.swing.PosButton();
		posButton1 = new com.floreantpos.swing.PosButton();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		tfPassword = new javax.swing.JPasswordField();
		tfUserId = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		cbUserType = new javax.swing.JComboBox();
		jPanel1 = new javax.swing.JPanel();
		jPanel3 = new javax.swing.JPanel();
		btnConfigureDatabase = new com.floreantpos.swing.PosButton();
		btnLogin = new com.floreantpos.swing.PosButton();
		jLabel3 = new javax.swing.JLabel();
		btnShutdown = new com.floreantpos.swing.PosButton();
		jPanel4 = new javax.swing.JPanel();

		setPreferredSize(new java.awt.Dimension(315, 400));
		setLayout(new java.awt.GridBagLayout());

		buttonPanel.setOpaque(false);
		buttonPanel.setPreferredSize(new java.awt.Dimension(280, 180));
		buttonPanel.setLayout(new java.awt.GridLayout(0, 3, 5, 5));

		posButton4.setAction(goAction);
		posButton4.setIcon(com.floreantpos.IconFactory.getIcon("7_32.png"));
		posButton4.setActionCommand("7");
		posButton4.setFocusable(false);
		buttonPanel.add(posButton4);

		posButton13.setAction(goAction);
		posButton13.setIcon(com.floreantpos.IconFactory.getIcon("8_32.png"));
		posButton13.setActionCommand("8");
		posButton13.setFocusable(false);
		buttonPanel.add(posButton13);

		posButton12.setAction(goAction);
		posButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9_32.png"))); // NOI18N
		posButton12.setActionCommand("9");
		posButton12.setFocusable(false);
		buttonPanel.add(posButton12);

		posButton9.setAction(goAction);
		posButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4_32.png"))); // NOI18N
		posButton9.setActionCommand("4");
		posButton9.setFocusable(false);
		buttonPanel.add(posButton9);

		posButton10.setAction(goAction);
		posButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5_32.png"))); // NOI18N
		posButton10.setActionCommand("5");
		posButton10.setFocusable(false);
		buttonPanel.add(posButton10);

		posButton11.setAction(goAction);
		posButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6_32.png"))); // NOI18N
		posButton11.setActionCommand("6");
		posButton11.setFocusable(false);
		buttonPanel.add(posButton11);

		posButton8.setAction(goAction);
		posButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1_32.png"))); // NOI18N
		posButton8.setActionCommand("1");
		posButton8.setFocusable(false);
		buttonPanel.add(posButton8);

		posButton7.setAction(goAction);
		posButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2_32.png"))); // NOI18N
		posButton7.setActionCommand("2");
		posButton7.setFocusable(false);
		buttonPanel.add(posButton7);

		posButton6.setAction(goAction);
		posButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3_32.png"))); // NOI18N
		posButton6.setActionCommand("3");
		posButton6.setFocusable(false);
		buttonPanel.add(posButton6);

		posButton3.setAction(goAction);
		posButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0_32.png"))); // NOI18N
		posButton3.setActionCommand("0");
		posButton3.setFocusable(false);
		buttonPanel.add(posButton3);

		posButton1.setAction(goAction);
		posButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear_32.png"))); // NOI18N
		posButton1.setText(com.floreantpos.POSConstants.CLEAR);
		posButton1.setFocusable(false);
		posButton1.setPreferredSize(new java.awt.Dimension(90, 50));
		buttonPanel.add(posButton1);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.ipady = 40;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.weightx = 1.0;
		add(buttonPanel, gridBagConstraints);

		jPanel2.setOpaque(false);

		jLabel1.setFont(new java.awt.Font("Simsun", 1, 24));
		jLabel1.setForeground(new java.awt.Color(204, 102, 0));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText(com.floreantpos.POSConstants.ENTER_YOUR_USER_ID);

		jLabel2.setFont(new java.awt.Font("Simsun", 1, 24));
		jLabel2.setForeground(new java.awt.Color(204, 102, 0));
		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText(com.floreantpos.POSConstants.ENTER_YOUR_PASSWORD);

		tfPassword.setFont(new java.awt.Font("Simsun", 1, 18));
		tfPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);

		tfUserId.setFont(new java.awt.Font("Simsun", 1, 18));

		jLabel4.setFont(new java.awt.Font("Simsun", 1, 24));
		jLabel4.setForeground(new java.awt.Color(204, 102, 0));
		jLabel4.setText(com.floreantpos.POSConstants.USER_TYPE + ":");

		cbUserType.setFont(new java.awt.Font("Simsun", 1, 18));

		org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE).add(
				jPanel2Layout.createSequentialGroup().addContainerGap().add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE).addContainerGap()).add(org.jdesktop.layout.GroupLayout.TRAILING, tfPassword, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE).add(tfUserId,
				org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE).add(jPanel2Layout.createSequentialGroup().add(jLabel4).add(18, 18, 18).add(cbUserType, 0, 225, Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(
				jPanel2Layout.createSequentialGroup().add(jLabel1).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(tfUserId, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(jLabel2)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).add(tfPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE).addPreferredGap(
								org.jdesktop.layout.LayoutStyle.RELATED).add(
								jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(jLabel4).add(cbUserType, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)).add(4, 4, 4)));

		jPanel2Layout.linkSize(new java.awt.Component[] { cbUserType, jLabel4 }, org.jdesktop.layout.GroupLayout.VERTICAL);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
		add(jPanel2, gridBagConstraints);

		jPanel1.setLayout(new java.awt.BorderLayout());

		jPanel3.setPreferredSize(new java.awt.Dimension(100, 105));
		jPanel3.setLayout(new java.awt.GridLayout(2, 0, 5, 5));

		btnConfigureDatabase.setAction(goAction);
		btnConfigureDatabase.setText(com.floreantpos.POSConstants.CONFIGURE_DATABASE);
		btnConfigureDatabase.setFocusable(false);
		jPanel3.add(btnConfigureDatabase);

		btnLogin.setAction(goAction);
		btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/log_in_32.png"))); // NOI18N
		btnLogin.setText(com.floreantpos.POSConstants.LOGIN);
		btnLogin.setFocusable(false);
		jPanel3.add(btnLogin);
		jPanel3.add(jLabel3);

		btnShutdown.setAction(goAction);
		btnShutdown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shut_down_32.png"))); // NOI18N
		btnShutdown.setText(com.floreantpos.POSConstants.SHUTDOWN);
		btnShutdown.setFocusable(false);
		jPanel3.add(btnShutdown);

		jPanel1.add(jPanel3, java.awt.BorderLayout.SOUTH);

		org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(0, 387, Short.MAX_VALUE));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(0, 64, Short.MAX_VALUE));

		jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
		gridBagConstraints.weightx = 1.0;
		gridBagConstraints.weighty = 1.0;
		add(jPanel1, gridBagConstraints);
	}// </editor-fold>//GEN-END:initComponents

	public void doLogin() {
		Application application = Application.getInstance();

		int userId = Integer.MAX_VALUE;
		try {
			userId = Integer.parseInt(tfUserId.getText());
		} catch (Exception x) {
			MessageDialog.showError(com.floreantpos.POSConstants.USER_ID_NOT_VALID);
			return;
		}
		char[] password = tfPassword.getPassword();
		String newPass = new String(password);

		UserType selectedUserType = (UserType) cbUserType.getSelectedItem();

		UserDAO dao = new UserDAO();
		Calendar currentTime = Calendar.getInstance();

		try {

			User user = null;
			
			user = dao.findUser(userId, selectedUserType);
			if(user == null) {
				MessageDialog.showError(com.floreantpos.POSConstants.USER_NOT_FOUND);
				return;
			}
			
			if (user.getNewUserType() != null) {
				if (user == null) {
					MessageDialog.showError(com.floreantpos.POSConstants.USER_NOT_FOUND);
					return;
				}

				if (user.getPassword() == null) {
					MessageDialog.showError(com.floreantpos.POSConstants.EMPTY_PASSWORD);
					return;
				}
				if (!user.getPassword().equalsIgnoreCase(newPass)) {
					MessageDialog.showError(com.floreantpos.POSConstants.WRONG_PASSWORD);
					return;
				}
			}
			else {
				user = dao.findUser(userId);
				if (user == null) {
					MessageDialog.showError(com.floreantpos.POSConstants.USER_NOT_FOUND);
					return;
				}

				if (user.getPassword() == null) {
					MessageDialog.showError(com.floreantpos.POSConstants.EMPTY_PASSWORD);
					return;
				}
				if (!user.getPassword().equalsIgnoreCase(newPass)) {
					MessageDialog.showError(com.floreantpos.POSConstants.WRONG_PASSWORD);
					return;
				}
				
			}

			Shift currentShift = ShiftUtil.getCurrentShift();
			if (currentShift == null) {
				POSMessageDialog.showError(this, com.floreantpos.POSConstants.NO_SHIFT_CONFIGURED);
				return;
			}

			if (user.isClockedIn() != null && user.isClockedIn().booleanValue()) {
				Shift userShift = user.getCurrentShift();
				Date userLastClockInTime = user.getLastClockInTime();
				long elaspedTimeSinceLastLogin = Math.abs(currentTime.getTimeInMillis() - userLastClockInTime.getTime());

				if (userShift != null) {
					if (!userShift.equals(currentShift)) {
						reClockInUser(currentTime, user, currentShift);
					}
					else if (userShift.getShiftLength() != null && (elaspedTimeSinceLastLogin >= userShift.getShiftLength())) {
						reClockInUser(currentTime, user, currentShift);
					}
				}
				else {
					user.doClockIn(application.getTerminal(), currentShift, currentTime);
				}
			}
			else {
				user.doClockIn(application.getTerminal(), currentShift, currentTime);
			}

			application.setCurrentUser(user);
			application.setCurrentShift(currentShift);

			tfUserId.setText("");
			tfPassword.setText("");
			application.getRootView().showView(SwitchboardView.VIEW_NAME);
		} catch (Exception e1) {
			MessageDialog.showError(e1);
		}
	}

	private void reClockInUser(Calendar currentTime, User user, Shift currentShift) {
		POSMessageDialog.showMessage("You will be clocked out from previous Shift");

		Application application = Application.getInstance();
		AttendenceHistoryDAO attendenceHistoryDAO = new AttendenceHistoryDAO();

		AttendenceHistory attendenceHistory = attendenceHistoryDAO.findHistoryByClockedInTime(user);
		if (attendenceHistory == null) {
			attendenceHistory = new AttendenceHistory();
			Date lastClockInTime = user.getLastClockInTime();
			Calendar c = Calendar.getInstance();
			c.setTime(lastClockInTime);
			attendenceHistory.setClockInTime(lastClockInTime);
			attendenceHistory.setClockInHour(Short.valueOf((short) c.get(Calendar.HOUR)));
			attendenceHistory.setUser(user);
			attendenceHistory.setTerminal(application.getTerminal());
			attendenceHistory.setShift(user.getCurrentShift());
		}

		user.doClockOut(attendenceHistory, currentShift, currentTime);

		user.doClockIn(application.getTerminal(), currentShift, currentTime);
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private com.floreantpos.swing.PosButton btnConfigureDatabase;
	private com.floreantpos.swing.PosButton btnLogin;
	private com.floreantpos.swing.PosButton btnShutdown;
	private javax.swing.JPanel buttonPanel;
	private javax.swing.JComboBox cbUserType;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private com.floreantpos.swing.PosButton posButton1;
	private com.floreantpos.swing.PosButton posButton10;
	private com.floreantpos.swing.PosButton posButton11;
	private com.floreantpos.swing.PosButton posButton12;
	private com.floreantpos.swing.PosButton posButton13;
	private com.floreantpos.swing.PosButton posButton3;
	private com.floreantpos.swing.PosButton posButton4;
	private com.floreantpos.swing.PosButton posButton6;
	private com.floreantpos.swing.PosButton posButton7;
	private com.floreantpos.swing.PosButton posButton8;
	private com.floreantpos.swing.PosButton posButton9;
	private javax.swing.JPasswordField tfPassword;
	private javax.swing.JTextField tfUserId;
	// End of variables declaration//GEN-END:variables

	Action goAction = new AbstractAction() {
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			if (com.floreantpos.POSConstants.CLEAR.equals(command)) {
				if (tfUserId.hasFocus()) {
					tfUserId.setText("");
				}
				else if (tfPassword.hasFocus()) {
					tfPassword.setText("");
				}
			}
			else if (com.floreantpos.POSConstants.LOGIN.equals(command)) {
				doLogin();
			}
			else if (com.floreantpos.POSConstants.SHUTDOWN.equals(command)) {
				Application.getInstance().shutdownPOS();
			}
			else if ("DBCONFIG".equalsIgnoreCase(command)) {
				DatabaseConfigurationDialog dialog = new DatabaseConfigurationDialog(Application.getPosWindow(), true);
				dialog.setTitle("Database connection error, please configure your database");
				dialog.setExitOnClose(true);
				dialog.pack();
				dialog.open();
			}
			else {
				if (tfUserId.hasFocus()) {
					tfUserId.setText(tfUserId.getText() + command);
				}
				else if (tfPassword.hasFocus()) {

					char[] password = tfPassword.getPassword();
					String newPass = new String(password);
					newPass += command;
					tfPassword.setText(newPass);
				}
			}
		}
	};

	public void setUserTypes() {
		try {
			UserTypeDAO dao = new UserTypeDAO();
			List<UserType> userTypes = dao.findAll();
			cbUserType.setModel(new DefaultComboBoxModel(userTypes.toArray()));
		} catch (Exception e) {
		}
	}

	@Override
	public void setVisible(boolean aFlag) {
		super.setVisible(aFlag);
		if (aFlag) {
			tfUserId.requestFocus();
		}
	}

	public static PasswordScreen getInstance() {
		if (instance == null) {
			instance = new PasswordScreen();
		}
		return instance;
	}
}