import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
/*
 * Done by devhub34155.
 * Date: 12/23/18
 * 
 */
public class Main {
	static int num1 = 0;					//Takes first number to be used in an operation.
	static int num2 = 0;					//Takes second number to be used in an operation.
	static int total = 0;					//Takes the total from an operation performed.
	static String checkOp = "";				//Will store a string symbol for a specified operation e.g +.
	static int checkOpNum = 0;				//Will assign an integer to a certain operation symbol to be checked.
	static String typedNums = "";			//Will store the value of typed numbers inside the text field.

	public static void main(String[] args) {


		JFrame calcFrame = new JFrame ();						// Creates a new Frame.
		JPanel panel = new JPanel ();							//Creates a new Panel to be added to the Frame.
		//Creates a button for each number, operation.
		JButton button_1, button_2,button_3,button_4,button_5,button_6,
		button_7,button_8,button_9,button_0,button_add,button_sub,button_mul,button_div,
		button_Equal,button_Clear;

		// Creates a text field or box where numbers will be entered.
		JTextField boxField = new JTextField ();
		Font fontText = new Font ("Serif", Font.PLAIN, 24);					// Sets text on box field.

		calcFrame.setTitle("Calculator");				// Sets title for the frame.
		calcFrame.setSize(270, 370);					// Sets frame size.
		calcFrame.setLocation(450, 150);				// Sets location of frame on User Screen.
		calcFrame.add(panel);
		calcFrame.setVisible(true);						// Sets frame to true to be visible.
		button_1 = new JButton("1");					// Creates a button with #1 inside.
		button_2 = new JButton("2");					// Creates a button with #2 inside.
		button_3 = new JButton("3");					// Creates a button with #3 inside.
		button_4 = new JButton("4");					// Creates a button with #4 inside.
		button_5 = new JButton("5");					// Creates a button with #5 inside.
		button_6 = new JButton("6");					// Creates a button with #6 inside.
		button_7 = new JButton("7");					// Creates a button with #7 inside.
		button_8 = new JButton("8");					// Creates a button with #8 inside.
		button_9 = new JButton("9");					// Creates a button with #9 inside.
		button_0 = new JButton("0");					// Creates a button with #0 inside.
		button_add = new JButton("+");					// Creates a button with "+" inside.
		button_sub = new JButton("-");					// Creates a button with "-" inside.
		button_mul = new JButton("*");					// Creates a button with "*" inside.
		button_div = new JButton("/");					// Creates a button with "/" inside.
		button_Equal = new JButton("=");				// Creates a button with "=" inside.
		button_Clear = new JButton("C");				// Creates a button with "C" inside.


		// Will set the size and location of each button inside frame.
		button_1.setBounds(4, 80, 60, 60);
		button_2.setBounds(66, 80, 60, 60);
		button_3.setBounds(128, 80, 60, 60);
		button_4.setBounds(4, 142, 60, 60);
		button_5.setBounds(66, 142, 60, 60);
		button_6.setBounds(128, 142, 60, 60);
		button_7.setBounds(4, 202, 60, 60);
		button_8.setBounds(66, 202, 60, 60);
		button_9.setBounds(128, 202, 60, 60);
		button_0.setBounds(66, 262, 60, 60);
		button_add.setBounds(190, 80, 60, 60);
		button_sub.setBounds(190, 142, 60, 60);
		button_mul.setBounds(190, 202, 60, 60);
		button_div.setBounds(190, 262, 60, 60);
		button_Equal.setBounds(128, 262, 60, 60);
		button_Clear.setBounds(4, 262, 60, 60);
		boxField.setBounds(4, 8, 246, 60);

		// Sets text field to the right and font.
		boxField.setHorizontalAlignment(SwingConstants.RIGHT);
		boxField.setFont(fontText);

		// Adds each button and field to the panel to be added to the frame.
		panel.add(boxField);
		panel.add(button_1);
		panel.add(button_2);
		panel.add(button_3);
		panel.add(button_4);
		panel.add(button_5);
		panel.add(button_6);
		panel.add(button_7);
		panel.add(button_8);
		panel.add(button_9);
		panel.add(button_0);
		panel.add(button_add);
		panel.add(button_sub);
		panel.add(button_mul);
		panel.add(button_div);
		panel.add(button_Equal);
		panel.add(button_Clear);


		/*
		 * Will listen to the button pressed. Once pressed it will get number of the button, and 
		 * it will be stored in typedNums to be displayed inside the text field.
		 */
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				typedNums = boxField.getText() + button_1.getText();
				boxField.setText(typedNums); 
			}

		});
		/*
		 * Will listen to the button pressed. Once pressed it will get number of the button, and 
		 * it will be stored in typedNums to be displayed inside the text field.
		 */		button_2.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 typedNums = boxField.getText() + button_2.getText();
				 boxField.setText(typedNums); 
			 }

		 });

		 /*
		  * Will listen to the button pressed. Once pressed it will get number of the button, and 
		  * it will be stored in typedNums to be displayed inside the text field.
		  */
		 button_3.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 typedNums = boxField.getText() + button_3.getText();
				 boxField.setText(typedNums); 		}

		 });
		 /*
		  * Will listen to the button pressed. Once pressed it will get number of the button, and 
		  * it will be stored in typedNums to be displayed inside the text field.
		  */
		 button_4.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 typedNums = boxField.getText() + button_4.getText();
				 boxField.setText(typedNums); 		}

		 });
		 /*
		  * Will listen to the button pressed. Once pressed it will get number of the button, and 
		  * it will be stored in typedNums to be displayed inside the text field.
		  */
		 button_5.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 typedNums = boxField.getText() + button_5.getText();
				 boxField.setText(typedNums); 		}

		 });
		 /*
		  * Will listen to the button pressed. Once pressed it will get number of the button, and 
		  * it will be stored in typedNums to be displayed inside the text field.
		  */
		 button_6.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 typedNums = boxField.getText() + button_6.getText();
				 boxField.setText(typedNums); 		}

		 });
		 /*
		  * Will listen to the button pressed. Once pressed it will get number of the button, and 
		  * it will be stored in typedNums to be displayed inside the text field.
		  */
		 button_7.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 typedNums = boxField.getText() + button_7.getText();
				 boxField.setText(typedNums); 		}

		 });
		 /*
		  * Will listen to the button pressed. Once pressed it will get number of the button, and 
		  * it will be stored in typedNums to be displayed inside the text field.
		  */
		 button_8.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 typedNums = boxField.getText() + button_8.getText();
				 boxField.setText(typedNums); 		}

		 });
		 /*
		  * Will listen to the button pressed. Once pressed it will get number of the button, and 
		  * it will be stored in typedNums to be displayed inside the text field.
		  */
		 button_9.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 typedNums = boxField.getText() + button_9.getText();
				 boxField.setText(typedNums); 		}

		 });
		 /*
		  * Will listen to the button pressed. Once pressed it will get number of the button, and 
		  * it will be stored in typedNums to be displayed inside the text field.
		  */
		 button_0.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 typedNums = boxField.getText() + button_0.getText();
				 boxField.setText(typedNums); 		}

		 });

		 /*
		  * Will listen to addition button pressed. Once pressed it will assigned "+" to the variable
		  * checkOp to be later used to check the operation needed to done. It
		  * will also parse the string obtained and store in num1 to be used for the operation.
		  */
		 button_add.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 checkOp = "+";
				 checkOpNum = 1;
				 num1 = Integer.parseInt(typedNums);
				 boxField.setText("");
			 }

		 });
		 /*
		  * Will listen to the subtraction button pressed. Once pressed it will assigned "-" to the variable
		  * checkOp to be later used to check the operation needed to done. It
		  * will also parse the string obtained and store in num1 to be used for the operation.
		  */
		 button_sub.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 checkOp = "-";
				 checkOpNum = 2;
				 num1 = Integer.parseInt(typedNums);
				 boxField.setText("");
			 }

		 });
		 /*
		  * Will listen to the multiplication button pressed. Once pressed it will assigned "*" to the variable
		  * checkOp to be later used to check the operation needed to done. It
		  * will also parse the string obtained and store in num1 to be used for the operation.
		  */
		 button_mul.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 checkOp = "*";
				 checkOpNum = 3;
				 num1 = Integer.parseInt(typedNums);
				 boxField.setText("");
			 }

		 });
		 /*
		  * Will listen to the divison button pressed. Once pressed it will assigned "/" to the variable
		  * checkOp to be later used to check the operation needed to done. It
		  * will also parse the string obtained and store in num1 to be used for the operation.
		  */
		 button_div.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 checkOp = "/";
				 checkOpNum = 4;
				 num1 = Integer.parseInt(typedNums);
				 boxField.setText("");
			 }

		 });

		 /*
		  * Will listen to the equal button being pressed. Once pressed, it will check for the operation
		  * needed to be done. Then, it will check which case it is. After checking, it parse the second
		  * number to be used for the specified operation, and it will set the total to the text field displaying 
		  * the total.
		  */
		 button_Equal.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 switch (checkOpNum) {
				 case 1: checkOp.equals("+");
				 num2 = Integer.parseInt(typedNums);
				 total = num1 + num2;
				 boxField.setText(Integer.toString(total));
				 break;
				 case 2: checkOp.equals("-");
				 num2 = Integer.parseInt(typedNums);
				 total = num1 - num2;
				 boxField.setText(Integer.toString(total));
				 break;
				 case 3: checkOp.equals("*");
				 num2 = Integer.parseInt(typedNums);
				 total = num1 * num2;
				 boxField.setText(Integer.toString(total));
				 break;
				 case 4: checkOp.equals("/");
				 num2 = Integer.parseInt(typedNums);
				 total = num1 / num2;
				 boxField.setText(Integer.toString(total));
				 break;
				 }
			 }

		 });

		 /*
		  * Will listen to the Clear button being pressed. Once pressed, it will
		  * clear the text field and set all variables to 0 or null;
		  */

		 button_Clear.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 boxField.setText("");
				 num1 = 0;
				 num2 = 0;
				 total = 0;
				 typedNums = "";
			 }

		 });

		 calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				// Closes frame.

	} // main method

} //class Main
