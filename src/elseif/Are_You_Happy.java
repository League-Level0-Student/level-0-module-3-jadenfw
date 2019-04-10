package elseif;

import javax.swing.JOptionPane;

public class Are_You_Happy {

	public static void main(String[] args) {

		String qone = JOptionPane.showInputDialog("are you happy");

		if (qone.equals("yes")) {
			JOptionPane.showMessageDialog(null, "keep doing what your doing");
		} else if (qone.equals("no")) {
			String qtwo = JOptionPane.showInputDialog("do you want to be happy?");

			if (qtwo.equals("no")) {
				JOptionPane.showMessageDialog(null, "keep doing what your doing");
			} else if (qtwo.equals("yes")) {
				JOptionPane.showMessageDialog(null, "you better change something");
			}
		}

	}
}
