import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryConverter implements MouseListener{
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JTextField textField = new JTextField(16);
JButton button = new JButton();
JLabel label = new JLabel("    ");
	public static void main(String[] args) {
	binaryConverter B = new binaryConverter();
	B.gui();
} 
	public void gui(){
		panel.add(textField);
		frame.add(panel);
		panel.add(button);
		button.setPreferredSize(new Dimension(60, 20));
		button.setText("convert");
		panel.add(label);
		button.addMouseListener(this);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		String userInput = textField.getText();
		label.setText(convert(userInput));
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	 String convert(String input) {
         if(input.length() != 8){
              JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
              return "-";
         }
         String binary = "[0-1]+";    //must contain numbers in the given range
         if (!input.matches(binary)) {
              JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
              return "-";
         }
         try {
              int asciiValue = Integer.parseInt(input, 2);
              char theLetter = (char) asciiValue;
              return "" + theLetter;
         } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
              return "-";
         }
    }
}
