package com.orenan.basics;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface {

	//Variables for the SWING things Buttons and Frame.
	private JFrame frame;
	private JTextField display;
	private JButton button1;
	private JButton button8;
	private JButton button5;
	private JButton btnC;
	private JButton button2;
	private JButton button9;
	private JButton button6;
	private JButton button3;
	private JButton button0;
	private JButton buttonDivide;
	private JButton buttonMultiply;
	private JButton buttonAdd;
	private JButton buttonSubtract;
	private JButton buttonEquals;


	//Variables to store the inputs as strings and/or Integer.
	String firstNumber = "";
	String secondNumber = "";
	int firstNumberInt;
	int secondNumberInt;


	//Boolean variables to store which operation the calculator is doing and result variable.
	boolean addition = false;
	boolean subtraction = false;
	boolean multiplication = false;
	boolean division = false;
	boolean operation = false;

	int result;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 267, 365);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		display = new JTextField();
		display.setBounds(12, 11, 229, 47);
		frame.getContentPane().add(display);
		display.setColumns(10);

		//Buttons for numbers and respective listeners to assign the values.

		//Buttton 0.
		button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = firstNumber + "0";
				display.setText(firstNumber);
				if(operation == true) {
					display.setText("");
					secondNumber = secondNumber + "0";
					display.setText(secondNumber);
				}
			}
		});
		button0.setBounds(12, 257, 113, 47);
		frame.getContentPane().add(button0);

		//Buttton 1.
		button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = firstNumber + "1";
				display.setText(firstNumber);
				if(operation == true) {
					display.setText("");
					secondNumber = secondNumber + "1";
					display.setText(secondNumber);
				}
			}
		});
		button1.setBounds(12, 185, 56, 58);
		frame.getContentPane().add(button1);

		//Buttton 2.
		button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = firstNumber + "2";
				display.setText(firstNumber);
				if(operation == true) {
					display.setText("");
					secondNumber = secondNumber + "2";
					display.setText(secondNumber);
				}
			}
		});
		button2.setBounds(70, 185, 56, 58);
		frame.getContentPane().add(button2);

		//Buttton 3.
		button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = firstNumber + "3";
				display.setText(firstNumber);
				if(operation == true) {
					display.setText("");
					secondNumber = secondNumber + "3";
					display.setText(secondNumber);
				}
			}
		});
		button3.setBounds(128, 185, 56, 58);
		frame.getContentPane().add(button3);

		//Buttton 4.
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = firstNumber + "4";
				display.setText(firstNumber);
				if(operation == true) {
					display.setText("");
					secondNumber = secondNumber + "4";
					display.setText(secondNumber);
				}
			}
		});
		button4.setBounds(12, 123, 56, 58);
		frame.getContentPane().add(button4);

		//Buttton 5.
		button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = firstNumber + "5";
				display.setText(firstNumber);
				if(operation == true) {
					display.setText("");
					secondNumber = secondNumber + "5";
					display.setText(secondNumber);
				}
			}
		});
		button5.setBounds(70, 123, 56, 58);
		frame.getContentPane().add(button5);

		//Buttton 6.
		button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = firstNumber + "6";
				display.setText(firstNumber);
				if(operation == true) {
					display.setText("");
					secondNumber = secondNumber + "6";
					display.setText(secondNumber);
				}
			}
		});
		button6.setBounds(128, 123, 56, 58);
		frame.getContentPane().add(button6);

		//Buttton 7.
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = firstNumber + "7";
				display.setText(firstNumber);
				if(operation == true) {
					display.setText("");
					secondNumber = secondNumber + "7";
					display.setText(secondNumber);
				}
			}
		});
		button7.setBounds(12, 64, 56, 58);
		frame.getContentPane().add(button7);

		//Buttton 8.
		button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = firstNumber + "8";
				display.setText(firstNumber);
				if(operation == true) {
					display.setText("");
					secondNumber = secondNumber + "8";
					display.setText(secondNumber);
				}
			}
		});
		button8.setBounds(71, 64, 56, 58);
		frame.getContentPane().add(button8);

		//Buttton 9.
		button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = firstNumber + "9";
				display.setText(firstNumber);
				if(operation == true) {
					display.setText("");
					secondNumber = secondNumber + "9";
					display.setText(secondNumber);
				}
			}
		});
		button9.setBounds(128, 64, 56, 58);
		frame.getContentPane().add(button9);

		//Buttton Clear All.
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Invokes the method clearAll.
				clearAll();
			}
		});
		btnC.setBounds(128, 257, 56, 47);
		frame.getContentPane().add(btnC);

		//Buttons for math operations with listeners that will store the inputs and do the operations with them.

		//Button for Division.
		buttonDivide = new JButton("/");
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationDivision();
			}
		});
		buttonDivide.setBounds(185, 64, 56, 47);
		frame.getContentPane().add(buttonDivide);

		//Button for Multiplication.
		buttonMultiply = new JButton("*");
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationMultiplication();
			}
		});
		buttonMultiply.setBounds(185, 111, 56, 47);
		frame.getContentPane().add(buttonMultiply);

		//Button for Addition.		
		buttonAdd = new JButton("+");
		buttonAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationAddition();
			}
		});
		buttonAdd.setBounds(185, 158, 56, 47);
		frame.getContentPane().add(buttonAdd);

		//Button for Subtraction.
		buttonSubtract = new JButton("-");
		buttonSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationSubtraction();
			}
		});
		buttonSubtract.setBounds(185, 205, 56, 47);
		frame.getContentPane().add(buttonSubtract);

		//Button For Equals (to get the result).
		buttonEquals = new JButton("=");
		buttonEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operationEquals();	
			}
		});
		buttonEquals.setBounds(186, 257, 56, 47);
		frame.getContentPane().add(buttonEquals);
	}
	private void clearAll() {
		firstNumber = "";
		firstNumber = "";
		secondNumber = "";
		firstNumberInt = 0;
		secondNumberInt = 0;
		display.setText("");
		addition = false;
		subtraction = false;
		multiplication = false;
		division = false;
		operation = false;
		return;

	}private void operationDivision() {
		firstNumberInt = Integer.parseInt(firstNumber); 
		division = true;
		operation = true;
		display.setText("");
		return;

	}private void operationMultiplication() {
		firstNumberInt = Integer.parseInt(firstNumber); 
		multiplication = true;
		operation = true;
		display.setText("");
		return;

	}private void operationAddition() {
		firstNumberInt = Integer.parseInt(firstNumber); 
		addition = true;
		operation = true;
		display.setText("");
		return;

	}private void operationSubtraction() {
		firstNumberInt = Integer.parseInt(firstNumber); 
		subtraction = true;
		operation = true;
		display.setText("");
		return;

	}private void operationEquals() {

		//The if statements are checking the operation that is being done and doing the operation parsing the STRING of the SECOND INPUT to a INT and resets the display to show only the result.	
		if(addition == true && subtraction == false && multiplication == false && division == false) { 
			secondNumberInt = Integer.parseInt(secondNumber);
			result = firstNumberInt + secondNumberInt; 
			firstNumber = "";
			secondNumber = "";
			firstNumberInt = 0;
			secondNumberInt = 0;
			display.setText(Integer.toString(result));

		}else if(addition == false && subtraction == true && multiplication == false && division == false) {
			secondNumberInt = Integer.parseInt(secondNumber);
			result = firstNumberInt - secondNumberInt;
			firstNumber = "";
			secondNumber = "";
			firstNumberInt = 0;
			secondNumberInt = 0;
			display.setText(Integer.toString(result));

		}else if(addition == false && subtraction == false && multiplication == true && division == false) {
			secondNumberInt = Integer.parseInt(secondNumber);
			result = firstNumberInt * secondNumberInt; 
			firstNumber = "";
			secondNumber = "";
			firstNumberInt = 0;
			secondNumberInt = 0;
			display.setText(Integer.toString(result));

		}else if(addition == false && subtraction == false && multiplication == false && division == true) {
			secondNumberInt = Integer.parseInt(secondNumber);
			if(firstNumberInt % secondNumberInt == 0) {
				result = firstNumberInt / secondNumberInt;
				display.setText(Integer.toString(result));
				firstNumber = "";
				secondNumber = "";
				firstNumberInt = 0;
				secondNumberInt = 0;

			}else {
				result = firstNumberInt / secondNumberInt;
				int remainder = firstNumberInt % secondNumberInt;
				display.setText(Integer.toString(result) + " Remainder of: " + remainder);
				firstNumber = "";
				secondNumber = "";
				firstNumberInt = 0;
				secondNumberInt = 0;	
			}
		}else {
			display.setText("INVALID OPERATION!!!");
		}
		return;
	}
}
