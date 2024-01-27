import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
/*import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;*/
public class Main {
	public static void main(String[] args) {
		/* Simple Output
		System.out.println("Hello World!");
		System.out.print("\tI'm Ahmed.\n");
		System.out.print("\"This is a double quoted sentence\".");
		System.out.println(); = sysout + ctrl + space
		############################################################*/
		// This is a comment
		/* This is
		 a multiple
		 line comment
		############################################################*/
		/* Variables
		String name = "Ahmed";
		int age = 19;
		double gpa = 2.89;
		boolean student = true;
		char letter = 'A';
		System.out.println("Hello, My name is "+name+".");
		System.out.println("I'm "+age+" years old.");
		System.out.println("My GPA is "+gpa);
		System.out.println("Student Status: "+student);
		System.out.println("And my name begins with letter "+letter+".");
		############################################################*/
		/* Swap
		String x = "Water";
		String y = "Milk";
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		String temp=x;
		x=y;
		y=temp;
		System.out.println("----------");
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		############################################################*/
		/* Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String name = scanner.nextLine();
		System.out.println("Enter Your Age: ");
		int age = scanner.nextInt();
		scanner.nextLine(); // Cleans the scanner from the extra '\n' as scanner.nextInt(); doesn't read it.
		System.out.println("Enter Your Favorite Food: ");
		String favFood = scanner.nextLine();
		System.out.println("Hello "+name+"!");
		System.out.println("You're "+age+" years old.");
		System.out.println("Your favorite food is "+favFood+".");
		############################################################*/
		/* Arithmetic Operators: The same as the rest of languages.
		############################################################*/
		/* GUI Intro
		String username = JOptionPane.showInputDialog("Enter Your Name:");
		JOptionPane.showMessageDialog(null,"Hello "+username+"!");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age:"));
		JOptionPane.showMessageDialog(null,"You're "+age+" years old.");
		Double gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter Your GPA:"));
		JOptionPane.showMessageDialog(null,"Your GPA is "+gpa);
		############################################################*/
		/* Hypotenous
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the side A: ");
		double a = scanner.nextDouble();
		System.out.println("Enter the length of the side B: ");
		double b = scanner.nextDouble();
		double c = Math.sqrt((a*a)+(b*b));
		System.out.println("Length of hypotenous = "+c);
		############################################################*/
		/* Random
		Random random = new Random();
		System.out.println(random.nextInt(6)+1);
		############################################################*/
		/* if statements: The same as the rest of languages.
		############################################################*/
		/* Switches: The same as the rest of languages.
		############################################################*/
		/* Logical Operators: The same as the rest of languages.(XOR: ^)
		############################################################*/
		/* Loops
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a symbol: ");
		String symbol = scanner.next();
		System.out.println("Enter the number of rows: ");
		int rows = scanner.nextInt();
		System.out.println("Enter the number of columns: ");
		int columns = scanner.nextInt();
		for(int i=1 ; i<=rows ; i++) {
			for(int j=1 ; j<=columns ; j++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
		############################################################*/
		/* Arrays
		String[] fruits = {"Mango" , "Banana" , "Strawberry" , "Watermelon" , "Graps"};
		fruits[4] = "Orange";
		for(int i=0 ; i<fruits.length ; i++) {
			System.out.println(fruits[i]);
		}
		############################################################*/
		/* 2D Arrays
		String[][] cars = {
            				{"Huyundai " , "Wolkswagen " , "Peagout"},
            				{"Mercedes " , "BMW " , "MG"},
            				{"Buggati " , "Ferrari " , "Lambourghini"},
		                  };
		for(int i=0 ; i<cars.length ; i++) {
			for(int j=0 ; j<cars[i].length ; j++) {
				System.out.print(cars[i][j]);
			}
			System.out.println();
		}
		############################################################*/
		/* ArrayList
		ArrayList<String> food = new ArrayList<String>();
		food.add("Herring");
		food.add("Pizza");
		food.add("Burger");
		food.set(0,"Fried Chicken");
		//food.remove(2);
		//food.clear();
		for(int i=0 ; i<food.size() ; i++) {
			System.out.println(food.get(i));
		}
		############################################################*/
		/* 2D ArrayList
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Mercedes");
		cars.add("BMW");
		cars.add("MG");
		ArrayList<String> laptops = new ArrayList<String>();
		laptops.add("Macbook");
		laptops.add("HP");
		laptops.add("Dell");
		ArrayList<String> clothes = new ArrayList<String>();
		clothes.add("Lacoste");
		clothes.add("Calvin Klein");
		clothes.add("American Eagle");
		ArrayList<ArrayList<String>> brands = new ArrayList();
		brands.add(cars);
		brands.add(laptops);
		brands.add(clothes);
		//System.out.println(brands.get(0).get(0));
		for(int i=0 ; i<brands.size() ; i++) {
			System.out.println(brands.get(i));
		}
		############################################################*/
		/* foreach
		String[] fruits = {"Mango" , "Banana" , "Strawberry" , "Watermelon" , "Graps"};
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Mercedes");
		cars.add("BMW");
		cars.add("MG");
		for(String x:fruits) {
			System.out.println(x);
		}
		System.out.println("----------");
		for(String x:cars) {
			System.out.println(x);
		}
		############################################################*/
		/* Methods
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Length: ");
		double length = scanner.nextDouble();
		System.out.println("Enter Width: ");
		double width = scanner.nextDouble();
		System.out.println("Area = "+area(length,width)+" cm^2.");
		############################################################*/
		/* printf
		String name = "Ahmed";
		int age = 1999999;
		double gpa = 2.8900000;
		boolean student = true;
		char letter = 'A';
		System.out.printf("Hello, My name is %10s.\n",name);
		System.out.printf("I'm %,d years old.\n",age);
		System.out.printf("My GPA is %.2f\n",gpa);
		System.out.printf("Student Status: %b\n",student);
		System.out.printf("And my name begins with letter %c.\n",letter);
		############################################################*/
		/* final
		final double pi = 3.14;
		System.out.println(pi);
		############################################################*/
		/* Classes
		Car mycar = new Car();
		System.out.println(mycar.model);
		mycar.drive();
		############################################################*/
		/* Constructors
		Human human1 = new Human("Ahmed" , 19 , 72);
		Human human2 = new Human("Drakola" , 1000 , 72);
		System.out.println(human1.name);
		System.out.println(human2.age);
		human1.eat();
		human2.drink();
		############################################################*/
		/* toString method
		Car car = new Car("Mercedes", "CLA-250", 2024);
		System.out.println(car);
		System.out.println(car.toString());
        ############################################################*/
		/* To declare a variable or a method in a class
		   to be general for all constructs
		   you just add the "static" keyword before declaration.
		############################################################*/
		/* To inherit class1(parent) into class2(child) you just need to type:
		   "class class2 extends class1{}".
		############################################################*/
		/* Method Overriding (@Override)
		   You can write the same method twice
		   the first is in the parent class and the second is in the child class
		   in order to let the child class have it's own implementation on this method.
		############################################################*/
		/* super(****,****) : a keyword refers to the superclass (parent) of an object
		   (very similar to "this" keyword) to take over parent attributes.
		############################################################*/
		/* Abstract keyword is a non-access modifier, used for classes and methods.
		   Abstract class: is a restricted class that cannot be used to create objects
		   (to access it, it must be inherited from another class). 
		   Abstract method: can only be used in an abstract class, and it does not have a body(must be overrode).
		############################################################*/
		/* Encapsulation
		Car car = new Car("Mercedes" , "CLA-250" , 2023);
		car.setYear(2024);
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		############################################################*/
		/* An interface in Java is a blueprint of a class.
		   It has static constants and abstract methods.
		   The interface in Java is a mechanism to achieve abstraction.
		   There can be only abstract methods in the Java interface, not method body.
		############################################################*/
		/* try & catch
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Enter a number to divide: ");
		double x = scanner.nextDouble();
		System.out.println("Enter a number to divide by: ");
		double y = scanner.nextDouble();
		System.out.printf("Result = %.3f",x/y);
		}
		catch(ArithmeticException E) {
			System.out.println("You can not divide by Zero, fkn idiot!");
		}
		catch(InputMismatchException E) {
			System.out.println("Please Enter a Number!");
		}
		catch(Exception E) {
			System.out.println("ERROR!");
		}
		finally {
			scanner.close();
		}
		############################################################*/
		/* Files Intro
		File file = new File("C:\\Users\\Hassan\\Desktop\\Codes//CMD.txt");
		if(file.exists()) {
			System.out.println("This File Exists!");
			//System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			//file.delete();
		}
		else {
			System.out.println("This File Doesn't Exist!");
		}
		############################################################*/
		/* Write & Append
		try {
			FileWriter writer = new FileWriter("writer.txt");
			writer.write("Hello World!\n");
			writer.append("I'm Ahmed Hassan.");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		############################################################*/
		/* Read
      try {
		FileReader reader = new FileReader("writer.txt");
		int data = reader.read();
		while(data!=-1) {
			System.out.print((char)data);
			data=reader.read(); // To move the cursor to the next char
		}
		reader.close();
      }
      catch(FileNotFoundException e) {
    	// TODO Auto-generated catch block
    	e.printStackTrace();
      }
      catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		############################################################*/
		/* GUI
		JFrame frame = new JFrame();
		JLabel label = new JLabel("Hello World!");
		frame.setVisible(true);
		frame.setSize(420,420);
		//frame.setResizable(false);
		frame.setTitle("JFrame Title Goes Here");
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon image = new ImageIcon("C:\\Users\\Hassan\\Desktop\\Codes\\HTML & CSS\\img\\HK.jpg");
		frame.setIconImage(image.getImage());
		frame.getContentPane().setBackground(Color.BLUE);
		frame.add(label);
		//label.setIcon(image);
		############################################################*/
		/* JOptionPane
		JOptionPane.showMessageDialog(null,"This is a useless message.","Title",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null,"Here is some useless info!","Title",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Really?","Title",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null,"Your PC has a Virous!","Title",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null,"Something Went Wrong!","Title",JOptionPane.ERROR_MESSAGE);
		JOptionPane.showConfirmDialog(null,"Download File?","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);
		String[] responses = {"Pay a Ransom" , "Call The Police (I'll Kill You)" , "Give UP!"};
		ImageIcon icon = new ImageIcon("C:\\Users\\Hassan\\Desktop\\Codes\\HTML & CSS\\img\\HK.jpg");
		JOptionPane.showOptionDialog(
				null,
				"You've Been Hacked!",
				"Secret Message",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				icon,
				responses,
				0);
	    ############################################################*/
		/* 	CheckBox (class4)
		new MyFrame1();
		############################################################*/
		/* 	RadioButtons (class5)
		new MyFrame2();
		############################################################*/
		/* 	ComboBox (class6)
		new MyFrame3();
		############################################################*/
		/* ProgressBar (class7)
		ProgressBarDemo demo = new ProgressBarDemo();
		############################################################*/
		/* MenuBar (class8)
		new menuBar();
		############################################################*/
		/* SelectFile (class9)
		new files();
		############################################################*/
		/* KeyListener (class10)
		new key();
		############################################################*/
		/* MouseListener (class11)
		new mouse();
		############################################################*/
		/* Generic Methods
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
		Character[] charArray = {'A','B','C','D','E'};
		String[] stringArray = {"Ahmed","Hassan","Ahmed","Mohamed","Emara"};
		displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
		displayArray(stringArray);
		############################################################*/
		
	}
	/* Area Method
	   static double area(double l, double w) {
		double a = l*w;
		return a;
	} */
	/* Generic Methods
	static <Thing> void displayArray(Thing[] array) {
		for(Thing x : array) {System.out.print(x+" ");}
	System.out.println();
	}*/
}
/* class1
class Car{
	String make = "Mercedes";
	String model = "CLA-250";
	int year = 2024;
	String color = "Black";
	double price = 5000000;
	void drive() {
		System.out.println("You Drive The Car!");
	}
	void brake() {
		System.out.println("You Step On The Brake!");
	}
	public String toString(){
		return make+"\n"+model+"\n"+year+"\n"+color;
	}
}*/
/* class2
class Human{
    // Arguments must be declared first in the class outside the constructor.
	String name;
	int age;
	double weight;
	// Constructor must have the same name as the class.
	Human(String name , int age , double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	void eat() {
		System.out.println(name+" is eating.");
	}
	void drink() {
		System.out.println(name+" is drinking.");
	}
}*/
/* class3
class Car{
	private String make;
	private String model;
	private int year;
	Car(String make , String model , int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(int year) {
		this.year = year;
	}
}*/
/* class4
class MyFrame1 extends JFrame implements ActionListener{
	JCheckBox checkBox;
	JButton button;
	ImageIcon right;
	ImageIcon wrong;
	MyFrame1(){
		wrong = new ImageIcon("C:\\Users\\Hassan\\Desktop\\Codes\\HTML & CSS\\img\\false.png");
		right = new ImageIcon("C:\\Users\\Hassan\\Desktop\\Codes\\HTML & CSS\\img\\true.png");
		checkBox = new JCheckBox();
		this.add(checkBox);
		checkBox.setText(" I'm not a Robot.");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("consolas" , Font.PLAIN , 35));
		checkBox.setIcon(wrong);
		checkBox.setSelectedIcon(right);
		button = new JButton();
		this.add(button);
		button.setText("Submit");
		button.setFocusable(false);
		button.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button){
			System.out.println(checkBox.isSelected());
		}
	}
}*/
/* class5
class MyFrame2 extends JFrame implements ActionListener{
	JRadioButton pizza;
	JRadioButton burger;
	JRadioButton steak;
	MyFrame2(){
		pizza = new JRadioButton("Pizza");
		pizza.setFocusable(false);
		burger = new JRadioButton("Burger");
		burger.setFocusable(false);
		steak = new JRadioButton("Steak");
		steak.setFocusable(false);
		ButtonGroup group = new ButtonGroup();     // To make only one choice available.
		group.add(pizza);
		group.add(burger);
		group.add(steak);
		pizza.addActionListener(this);
		burger.addActionListener(this);
		steak.addActionListener(this);
		this.add(pizza);
		this.add(burger);
		this.add(steak);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==pizza) {System.out.println("You've Ordered Pizza!");}
		else if(e.getSource()==burger) {System.out.println("You've Ordered Burger!");}
		else if(e.getSource()==steak) {System.out.println("You've Ordered Steak!");}
	}
}*/
/* class6
class MyFrame3 extends JFrame implements ActionListener{
	JComboBox comboBox;
	MyFrame3(){
		String[] payMethods = {"VISA" , "MasterCard" , "PayPal"};
		comboBox = new JComboBox(payMethods);
		comboBox.addActionListener(this);
		comboBox.setEditable(true);
		comboBox.addItem("FESA");
		comboBox.removeItem("FESA");
		//comboBox.removeAllItems();
		this.add(comboBox);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==comboBox){
			System.out.println(comboBox.getSelectedItem());
		}
	}
}*/
/* class7
class ProgressBarDemo{
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	ProgressBarDemo(){
		bar.setValue(0);
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true);
		bar.setFont(new Font("consolas" , Font.PLAIN , 25));
		bar.setForeground(Color.black);
		bar.setBackground(Color.DARK_GRAY);
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		fill();
	}
	void fill(){
		int counter=0;
		while(counter<=100) {
			bar.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter+=1;
		}
		bar.setString("Virus Downloaded!");
	}
}*/
/* class8
class menuBar extends JFrame implements ActionListener{
	JMenuBar menuBar;
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	menuBar(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		fileMenu.setMnemonic(KeyEvent.VK_F); // Alt + f for File.
		editMenu.setMnemonic(KeyEvent.VK_E); // Alt + e for Edit.
		helpMenu.setMnemonic(KeyEvent.VK_H); // Alt + h for Help.
		loadItem.setMnemonic(KeyEvent.VK_L); // Alt + l for Load.
		saveItem.setMnemonic(KeyEvent.VK_S); // Alt + s for Save.
		exitItem.setMnemonic(KeyEvent.VK_E); // Alt + e for Exit.
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		this.setJMenuBar(menuBar);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loadItem){System.out.println("File Loaded!");}
		if(e.getSource()==saveItem){System.out.println("File Saved!");}
		if(e.getSource()==exitItem){System.exit(0);}
	}
}*/
/* class9
class files extends JFrame implements ActionListener{
	JButton button;
	files(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		button = new JButton("Select File");
		button.addActionListener(this);
		this.add(button);
		this.pack();
		this.setVisible(true);
		button.setFocusable(false);
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setCurrentDirectory(new File("C:\\Users\\Hassan\\Desktop"));
			int response1 = fileChooser.showOpenDialog(null); // Select File to Open.
			int response2 = fileChooser.showSaveDialog(null); // Select File to Save.
			if(response2 == JFileChooser.APPROVE_OPTION){
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
	}
}*/
/* class10
class key extends JFrame implements KeyListener{
	key(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		this.addKeyListener(this);
		this.setVisible(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You pressed char '"+e.getKeyChar()+"' and it's code is "+e.getKeyCode()+".");
	}
}*/
/* class11
class mouse extends JFrame implements MouseListener{
	JLabel label;
	mouse(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		this.add(label);
		this.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("You Clicked The Mouse!");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You Pressed The Mouse!");
		label.setBackground(Color.yellow);
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You Released The Mouse!");
		label.setBackground(Color.green);
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You Entered The Component!");
		label.setBackground(Color.blue);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You Exited The Component!");
		label.setBackground(Color.red);
	}
}*/