package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
	public static void main(String[] args) {
		for (int i = 0; i < 100000000; i++) {
			
		
		String sign = JOptionPane.showInputDialog("what is your zodiac sign?");

		if (sign.equals("aries")) {
			JOptionPane.showMessageDialog(null, "you are Courageous, energetic, willful, commanding, leading. Often "
					+ "leads when following would be best course of action.");
			break;
		} else if (sign.equals("taurus")) {
			JOptionPane.showMessageDialog(null,
					"you are a Pleasure seeking, loves control, dependable, grounded, provokes "
							+ "slowly, and highly sensual in nature.");
			break;
		} else if (sign.equals("gemini")) {
			JOptionPane.showMessageDialog(null,
					"you are Cerebral, chatty, loves learning and education, charming, " + "and adventurous.");
			break;
		}

		else if (sign.equals("cancer")) {
			JOptionPane.showMessageDialog(null, "you are Emotional, group oriented, seeks security, family.");
			break;
		}

		else if (sign.equals("leo")) {
			JOptionPane.showMessageDialog(null, "you are Generous, organized, protective, beautiful.");
			break;
		}

		else if (sign.equals("virgo")) {
			JOptionPane.showMessageDialog(null, "you are Particular, logical, practical, sense of duty, critical.");
			break;
		}

		else if (sign.equals("libra")) {
			JOptionPane.showMessageDialog(null, "you are Balanced, seeks beauty, sense of justice.");
			break;
		}

		else if (sign.equals("scorpio")) {
			JOptionPane.showMessageDialog(null, "you are Passionate, exacting, loves extremes, combative, reflective.");
			break;
		}

		else if (sign.equals("sagittarius")) {
			JOptionPane.showMessageDialog(null, "you are Happy, absent minded, creative, adventurous.");
			break;
		}

		else if (sign.equals("capricorn")) {
			JOptionPane.showMessageDialog(null, "you are Timeless, driven, calculating, ambitious.");
			break;
		}

		else if (sign.equals("aquarius")) {
			JOptionPane.showMessageDialog(null,
					"you are Forward thinking, communicative, people oriented, stubborn, generous, "
							+ "and dedicated.");
			break;
		}

		else if (sign.equals("pisces")) {
			JOptionPane.showMessageDialog(null, "you are Likeable, energetic, passionate, sensitive.");
			break;
		}	
		else {
			JOptionPane.showMessageDialog(null,"oops spelled it incorrectly try again");
		}
		}
	}
}