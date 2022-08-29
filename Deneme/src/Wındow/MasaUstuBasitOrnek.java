package Wýndow;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MasaUstuBasitOrnek {
	public static void main(String[] args) {
		JFrame window=new JFrame();
		window.setVisible(true);
		window.setSize(800,600);
		window.setLocation(1000,800);
		
		JLabel etiket = new JLabel("MERHABA");
		window.add(etiket);
	}
}
