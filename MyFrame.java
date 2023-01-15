//Importing packages
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Creating class
public class MyFrame extends JFrame implements ActionListener{
	
	//Initializing and Declaring Variables
	JComboBox<?> mainOption, option1, option2;
	JLabel lab[] = new JLabel[4];
	JTextField op1, op2;
	JButton[] but = new JButton[3];
	String temp[] = {"Celsius", "Fahrenheit", "Kelvin"};
	String time[] = {"Millisecond", "Second", "Minute", "Hour",};
	String data[] = {"Bit", "Byte", "Kilobyte", "Megabyte", "Gigabyte", "Terabyte"};
	String length[] = {"Nanometer", "Millimeter", "Centimeter", "Meter", "Kilometer", "Inch", "Foot"};
	String frequency[] = {"Hertz", "Kilohertz", "Megahertz", "Gigahertz"};
	String force[] = {"Newton", "Kilonewton", "Dyne"};
	String power[] = {"Watt", "Kilowatt", "Megawatt", "Horsepower"};
	String mass[] = {"Gram", "Kilogram", "Metric Ton", "Metric Quintal"};
	String speed[] = {"Meter/Second", "Km/Hour", "Mile/Hour"};
	boolean num;
	
	//Function consisting of all the conversion formulas
	void checkResult() {
		//If selected quantities are same
		if(option1.getSelectedItem().equals(option2.getSelectedItem())) {
			op2.setText(op1.getText());
		}
		
		//Logic for time conversion
		if(mainOption.getSelectedItem().equals("Time")) {
			if(option1.getSelectedItem().equals("Hour")) {
				if(option2.getSelectedItem().equals("Minute"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*60));
				else if(option2.getSelectedItem().equals("Second"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*3600));
				else if(option2.getSelectedItem().equals("Millisecond"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*3600000));
			}
			if(option1.getSelectedItem().equals("Minute")) {
				if(option2.getSelectedItem().equals("Hour"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/60));
				else if(option2.getSelectedItem().equals("Second"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*60));
				else if(option2.getSelectedItem().equals("Millisecond"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*60000));
			}
			if(option1.getSelectedItem().equals("Second")) {
				if(option2.getSelectedItem().equals("Hour"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/3600));
				else if(option2.getSelectedItem().equals("Minute"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/60));
				else if(option2.getSelectedItem().equals("Millisecond"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000));
			}
			if(option1.getSelectedItem().equals("Millisecond")) {
				if(option2.getSelectedItem().equals("Hour"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(3.6000E+6)));
				else if(option2.getSelectedItem().equals("Minute"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/60000));
				else if(option2.getSelectedItem().equals("Second"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000));
			}
		}
		
		//Logic for temperature conversion
		else if(mainOption.getSelectedItem().equals("Temperature")) {
			if(option1.getSelectedItem().equals("Celsius")) {
				if(option2.getSelectedItem().equals("Fahrenheit"))
					op2.setText(String.valueOf((Double.parseDouble(op1.getText())*(1.8)+32)));
				if(option2.getSelectedItem().equals("Kelvin"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())+273.15));
			}
			else if(option1.getSelectedItem().equals("Fahrenheit")) {
				if(option2.getSelectedItem().equals("Celsius"))
					op2.setText((String.valueOf((Double.parseDouble(op1.getText())-32)/(1.8))));
				if(option2.getSelectedItem().equals("Kelvin"))
					op2.setText((String.valueOf((Double.parseDouble(op1.getText())+459.67)/(1.8))));
			}
			if(option1.getSelectedItem().equals("Kelvin")) {
				if(option2.getSelectedItem().equals("Fahrenheit"))
					op2.setText((String.valueOf((Double.parseDouble(op1.getText())-273.15)*(1.8)+32)));
				if(option2.getSelectedItem().equals("Celsius"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())-273.15));
			}
		}
		
		//Logic for digital data conversion
		else if(mainOption.getSelectedItem().equals("Data")) {
			if(option1.getSelectedItem().equals("Bit")) {
				if(option2.getSelectedItem().equals("Byte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/8));
				else if(option2.getSelectedItem().equals("Kilobyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/8000));
				else if(option2.getSelectedItem().equals("Megabyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/8000000));
				else if(option2.getSelectedItem().equals("Gigabyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(8.0000E+9)));
				else if(option2.getSelectedItem().equals("Terabyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(8.0000E+12)));
			}
			else if(option1.getSelectedItem().equals("Byte")) {
				if(option2.getSelectedItem().equals("Bit"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*8));
				else if(option2.getSelectedItem().equals("Kilobyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000));
				else if(option2.getSelectedItem().equals("Megabyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000000));
				else if(option2.getSelectedItem().equals("Gigabyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(1.0000E+9)));
				else if(option2.getSelectedItem().equals("Terabyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(1.0000E+12)));
			}
			else if(option1.getSelectedItem().equals("Kilobyte")) {
				if(option2.getSelectedItem().equals("Bit"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*8000));
				else if(option2.getSelectedItem().equals("Byte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000));
				else if(option2.getSelectedItem().equals("Megabyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000));
				else if(option2.getSelectedItem().equals("Gigabyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(1000000)));
				else if(option2.getSelectedItem().equals("Terabyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(1.0000E+9)));
			}
			else if(option1.getSelectedItem().equals("Megabyte")) {
				if(option2.getSelectedItem().equals("Bit"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*8000000));
				else if(option2.getSelectedItem().equals("Byte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000000));
				else if(option2.getSelectedItem().equals("Kilobyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000));
				else if(option2.getSelectedItem().equals("Gigabyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(1000)));
				else if(option2.getSelectedItem().equals("Terabyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(1000000)));
			}
			else if(option1.getSelectedItem().equals("Gigabyte")) {
				if(option2.getSelectedItem().equals("Bit"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(8.0000E+9)));
				else if(option2.getSelectedItem().equals("Byte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(1.0000E+9)));
				else if(option2.getSelectedItem().equals("Kilobyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000000));
				else if(option2.getSelectedItem().equals("Megabyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(1000)));
				else if(option2.getSelectedItem().equals("Terabyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(1000)));
			}
			else if(option1.getSelectedItem().equals("Terabyte")) {
				if(option2.getSelectedItem().equals("Bit"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(8.0000E+12)));
				else if(option2.getSelectedItem().equals("Byte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(1.0000E+12)));
				else if(option2.getSelectedItem().equals("Kilobyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(1.0000E+9)));
				else if(option2.getSelectedItem().equals("Megabyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(1000000)));
				else if(option2.getSelectedItem().equals("Gigabyte"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(1000)));
			}
		}
		
		//Logic for length conversion
		else if(mainOption.getSelectedItem().equals("Length")) {
			if(option1.getSelectedItem().equals("Kilometer")) {
				if(option2.getSelectedItem().equals("Meter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000));
				else if(option2.getSelectedItem().equals("Centimeter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*100000));
				else if(option2.getSelectedItem().equals("Millimeter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000000));
				else if(option2.getSelectedItem().equals("Nanometer"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(1.0000E+12)));
				else if(option2.getSelectedItem().equals("Foot"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(3280.8399)));
				else if(option2.getSelectedItem().equals("Inch"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(39370.0787)));
			}
			else if(option1.getSelectedItem().equals("Meter")) {
				if(option2.getSelectedItem().equals("Kilometer"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000));
				else if(option2.getSelectedItem().equals("Centimeter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*100));
				else if(option2.getSelectedItem().equals("Millimeter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000));
				else if(option2.getSelectedItem().equals("Nanometer"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(1.0000E+9)));
				else if(option2.getSelectedItem().equals("Foot"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(3.2808399)));
				else if(option2.getSelectedItem().equals("Inch"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(39.3700787)));
			}
			else if(option1.getSelectedItem().equals("Centimeter")) {
				if(option2.getSelectedItem().equals("Kilometer"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/100000));
				else if(option2.getSelectedItem().equals("Meter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/100));
				else if(option2.getSelectedItem().equals("Millimeter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*10));
				else if(option2.getSelectedItem().equals("Nanometer"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(10000000)));
				else if(option2.getSelectedItem().equals("Foot"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(30.48)));
				else if(option2.getSelectedItem().equals("Inch"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(2.54)));
			}
			else if(option1.getSelectedItem().equals("Millimeter")) {
				if(option2.getSelectedItem().equals("Kilometer"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000000));
				else if(option2.getSelectedItem().equals("Meter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000));
				else if(option2.getSelectedItem().equals("Centimeter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/10));
				else if(option2.getSelectedItem().equals("Nanometer"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(1000000)));
				else if(option2.getSelectedItem().equals("Foot"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(304.8)));
				else if(option2.getSelectedItem().equals("Inch"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(25.4)));
			}
			else if(option1.getSelectedItem().equals("Nanometer")) {
				if(option2.getSelectedItem().equals("Kilometer"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(1.0000E+12)));
				else if(option2.getSelectedItem().equals("Meter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(1.0000E+9)));
				else if(option2.getSelectedItem().equals("Centimeter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/10000000));
				else if(option2.getSelectedItem().equals("Millimeter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(1000000)));
				else if(option2.getSelectedItem().equals("Foot"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(3.0480E+8)));
				else if(option2.getSelectedItem().equals("Inch"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(2.5400E+7)));
			}
			else if(option1.getSelectedItem().equals("Foot")) {
				if(option2.getSelectedItem().equals("Kilometer"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(3280.8399)));
				else if(option2.getSelectedItem().equals("Meter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(3.2808399)));
				else if(option2.getSelectedItem().equals("Centimeter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*30.48));
				else if(option2.getSelectedItem().equals("Millimeter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(304.8)));
				else if(option2.getSelectedItem().equals("Nanometer"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(3.0480E+8)));
				else if(option2.getSelectedItem().equals("Inch"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(12)));
			}
			else if(option1.getSelectedItem().equals("Inch")) {
				if(option2.getSelectedItem().equals("Kilometer"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(39370.0787)));
				else if(option2.getSelectedItem().equals("Meter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(39.3700787)));
				else if(option2.getSelectedItem().equals("Centimeter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*2.54));
				else if(option2.getSelectedItem().equals("Millimeter"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(25.4)));
				else if(option2.getSelectedItem().equals("Nanometer"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(2.5400E+7)));
				else if(option2.getSelectedItem().equals("Foot"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(12)));
			}
			
		}
		
		//Logic for frequency conversion
		else if(mainOption.getSelectedItem().equals("Frequency")) {
			if(option1.getSelectedItem().equals("Hertz")) {
				if(option2.getSelectedItem().equals("Kilohertz"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000));
				else if(option2.getSelectedItem().equals("Megahertz"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000000));
				else if(option2.getSelectedItem().equals("Gigahertz"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(1.0000E+9)));
			}
			else if(option1.getSelectedItem().equals("Kilohertz")) {
				if(option2.getSelectedItem().equals("Hertz"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000));
				else if(option2.getSelectedItem().equals("Megahertz"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000000));
				else if(option2.getSelectedItem().equals("Gigahertz"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(1000000)));
			}
			else if(option1.getSelectedItem().equals("Megahertz")) {
				if(option2.getSelectedItem().equals("Hertz"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000000));
				else if(option2.getSelectedItem().equals("Kilohertz"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000));
				else if(option2.getSelectedItem().equals("Gigahertz"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/(1000)));
			}
			else if(option1.getSelectedItem().equals("Gigahertz")) {
				if(option2.getSelectedItem().equals("Hertz"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(1.0000E+9)));
				else if(option2.getSelectedItem().equals("Kilohertz"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000000));
				else if(option2.getSelectedItem().equals("Megahertz"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(1000)));
			}
		}
		
		//Logic for force conversion
		else if(mainOption.getSelectedItem().equals("Force")) {
			if(option1.getSelectedItem().equals("Newton")) {
				if(option2.getSelectedItem().equals("Kilonewton"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000));
				else if(option2.getSelectedItem().equals("Dyne"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*100000));
			}
			else if(option1.getSelectedItem().equals("Kilonewton")) {
				if(option2.getSelectedItem().equals("Newton"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000));
				else if(option2.getSelectedItem().equals("Dyne"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*(1.0000E+8)));
			}
			else if(option1.getSelectedItem().equals("Dyne")) {
				if(option2.getSelectedItem().equals("Kilonewton"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/100000000));
				else if(option2.getSelectedItem().equals("Newton"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/100000));
			}
		}
		
		//Logic for power conversion
		else if(mainOption.getSelectedItem().equals("Power")) {
			if(option1.getSelectedItem().equals("Watt")) {
				if(option2.getSelectedItem().equals("Kilowatt"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000));
				else if(option2.getSelectedItem().equals("Megawatt"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000000));
				else if(option2.getSelectedItem().equals("Horsepower"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/745.699872));
			}
			else if(option1.getSelectedItem().equals("Kilowatt")) {
				if(option2.getSelectedItem().equals("Watt"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000));
				else if(option2.getSelectedItem().equals("Megawatt"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000));
				else if(option2.getSelectedItem().equals("Horsepower"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1.34102209));
			}
			else if(option1.getSelectedItem().equals("Megawatt")) {
				if(option2.getSelectedItem().equals("Watt"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000000));
				else if(option2.getSelectedItem().equals("Kilowatt"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000));
				else if(option2.getSelectedItem().equals("Horsepower"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1341.02209));
			}
			else if(option1.getSelectedItem().equals("Horsepower")) {
				if(option2.getSelectedItem().equals("Watt"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*745.699872));
				else if(option2.getSelectedItem().equals("Kilowatt"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1.34102209));
				else if(option2.getSelectedItem().equals("Megawatt"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1341.02209));
			}
		}
		
		//Logic for mass conversion
		else if(mainOption.getSelectedItem().equals("Mass")) {
			if(option1.getSelectedItem().equals("Kilogram")) {
				if(option2.getSelectedItem().equals("Gram"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000));
				else if(option2.getSelectedItem().equals("Metric Ton"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000));
				else if(option2.getSelectedItem().equals("Metric Quintal"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/100));
			}
			else if(option1.getSelectedItem().equals("Gram")) {
				if(option2.getSelectedItem().equals("Kilogram"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000));
				else if(option2.getSelectedItem().equals("Metric Ton"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1000000));
				else if(option2.getSelectedItem().equals("Metric Quintal"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/100000));
			}
			else if(option1.getSelectedItem().equals("Metric Ton")) {
				if(option2.getSelectedItem().equals("Kilogram"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000));
				else if(option2.getSelectedItem().equals("Gram"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1000000));
				else if(option2.getSelectedItem().equals("Metric Quintal"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*10));
			}
			else if(option1.getSelectedItem().equals("Metric Quintal")) {
				if(option2.getSelectedItem().equals("Kilogram"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*100));
				else if(option2.getSelectedItem().equals("Gram"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*100000));
				else if(option2.getSelectedItem().equals("Metric Ton"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/10));
			}
		}
		
		//Logic for speed conversion
		else if(mainOption.getSelectedItem().equals("Speed")) {
			if(option1.getSelectedItem().equals("Mile/Hour")) {
				if(option2.getSelectedItem().equals("Km/Hour"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*1.609344));
				else if(option2.getSelectedItem().equals("Meter/Second"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/2.23693629));
			}
			else if(option1.getSelectedItem().equals("Km/Hour")) {
				if(option2.getSelectedItem().equals("Mile/Hour"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/1.609344));
				else if(option2.getSelectedItem().equals("Meter/Second"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())/3.6));
			}
			else if(option1.getSelectedItem().equals("Meter/Second")) {
				if(option2.getSelectedItem().equals("Mile/Hour"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*2.23693629));
				else if(option2.getSelectedItem().equals("Km/Hour"))
					op2.setText(String.valueOf(Double.parseDouble(op1.getText())*3.6));
			}
		}
	}
	
	private static final long serialVersionUID = 1L;

	MyFrame(){
		
		//Item list
		String mainItems[] = {"Mass", "Temperature", "Speed", "Time", "Data", "Length", "Frequency", "Force", "Power"};
		mainOption = new JComboBox(mainItems);
		mainOption.setSelectedItem("Mass");
		mainOption.addActionListener(this);
		mainOption.setBounds(20, 70, 250, 25);
		
		//Quantity selector
		option1 = new JComboBox(mass);
		option2 = new JComboBox(mass);
		
		//Label an =d Buttons
		String labels[] = {"Converter", "Value:", "Result:", ""};
		String buttons[] = {"Convert", "Theme: Light", "↑↓"};
		for(int i=0; i<4; i++) {
			lab[i] = new JLabel(labels[i]);
			lab[i].setFont(new Font("MV Boli", Font.PLAIN, 15));
			lab[i].setForeground(Color.RED);
			lab[i].setVisible(true);
			this.add(lab[i]);
			if(i<3) {
				but[i] = new JButton(buttons[i]);
				but[i].setForeground(Color.BLACK);
				but[i].setBackground(new Color(123,100,255));
				if(i<2)
					but[i].setFont(new Font("MV Boli", Font.PLAIN, 15));
				but[i].setFocusable(false);
				but[i].setVisible(true);
				but[i].addActionListener(this);
				this.add(but[i]);
			}
		}
		
		//Space for value of 1st quantity
		op1 = new JTextField();
		op1.setBounds(20, 145, 250, 30);
		op1.setFont(new Font("MV Boli", Font.PLAIN, 15));
		
		//2nd quantity or result
		op2 = new JTextField();
		op2.setEditable(false);
		op2.setBounds(20, 225, 250, 30);
		op2.setFont(new Font("MV Boli", Font.PLAIN, 15));
		
		//Setting positions and other parameters
		lab[0].setFont(new Font("MV Boli", Font.PLAIN, 20));
		lab[0].setBounds(85, 10, 250, 30);
		lab[3].setBounds(20, 35, 250, 30);
		lab[1].setBounds(20, 110, 100, 30);
		lab[2].setBounds(20, 190, 100, 30);
		lab[1].setForeground(Color.BLACK);
		lab[2].setForeground(Color.BLACK);
		option1.setBounds(80, 115, 85, 20);
		option2.setBounds(80, 195, 85, 20);
		but[0].setBounds(20, 270, 117, 25);
		but[1].setBounds(143, 270, 127, 25);
		but[2].setBackground(Color.WHITE);
		but[2].setForeground(Color.BLUE);
		but[2].setBorder(null);
		but[2].setBounds(115, 176, 50, 17);
		
		//Main Frame
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		this.setSize(new Dimension(300,350));
		this.getContentPane().setBackground(Color.WHITE);
		this.add(mainOption);
		this.add(option1);
		this.add(option2);
		this.add(op1);
		this.add(op2);
		this.setVisible(true);
	}

	//Action performed method for main item selection and button
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//Main drop-down list
		if(e.getSource()==mainOption) {
			if(mainOption.getSelectedItem().equals("Time")) {
				option1.setModel(new javax.swing.DefaultComboBoxModel(time));
				option2.setModel(new javax.swing.DefaultComboBoxModel(time));
			}
			else if(mainOption.getSelectedItem().equals("Temperature")) {
				option1.setModel(new javax.swing.DefaultComboBoxModel(temp));
				option2.setModel(new javax.swing.DefaultComboBoxModel(temp));
			}
			else if(mainOption.getSelectedItem().equals("Data")) {
				option1.setModel(new javax.swing.DefaultComboBoxModel(data));
				option2.setModel(new javax.swing.DefaultComboBoxModel(data));
			}
			else if(mainOption.getSelectedItem().equals("Length")) {
				option1.setModel(new javax.swing.DefaultComboBoxModel(length));
				option2.setModel(new javax.swing.DefaultComboBoxModel(length));
			}
			else if(mainOption.getSelectedItem().equals("Frequency")) {
				option1.setModel(new javax.swing.DefaultComboBoxModel(frequency));
				option2.setModel(new javax.swing.DefaultComboBoxModel(frequency));
			}
			else if(mainOption.getSelectedItem().equals("Force")) {
				option1.setModel(new javax.swing.DefaultComboBoxModel(force));
				option2.setModel(new javax.swing.DefaultComboBoxModel(force));
			}
			else if(mainOption.getSelectedItem().equals("Power")) {
				option1.setModel(new javax.swing.DefaultComboBoxModel(power));
				option2.setModel(new javax.swing.DefaultComboBoxModel(power));
			}
			else if(mainOption.getSelectedItem().equals("Mass")) {
				option1.setModel(new javax.swing.DefaultComboBoxModel(mass));
				option2.setModel(new javax.swing.DefaultComboBoxModel(mass));
			}
			else if(mainOption.getSelectedItem().equals("Speed")) {
				option1.setModel(new javax.swing.DefaultComboBoxModel(speed));
				option2.setModel(new javax.swing.DefaultComboBoxModel(speed));
			}
		}
		
		//Conversion button
		if(e.getSource()==but[0]) {
			try {
				Double a = Double.parseDouble(op1.getText());
				num=true;
				lab[3].setText("");
			}
			catch(NumberFormatException e1){
				num=false;
			}
			if(num && !op1.getText().contains("f"))
				checkResult();
			else {
				op2.setText("");
				lab[3].setText("Enter numbers only!");
			}
		}
		
		//Theme button
		if(e.getSource()==but[1]) {
			if(but[1].getText().equals("Theme: Light")) {
				this.getContentPane().setBackground(Color.BLACK);
				lab[1].setForeground(Color.WHITE);
				lab[2].setForeground(Color.WHITE);
				but[2].setBackground(Color.BLACK);
				but[1].setText("Theme: Dark");
			}
			else {
				this.getContentPane().setBackground(Color.WHITE);
				lab[1].setForeground(Color.BLACK);
				lab[2].setForeground(Color.BLACK);
				but[2].setBackground(Color.WHITE);
				but[1].setText("Theme: Light");
			}
		}
		
		//Quantity exchange button
		if(e.getSource()==but[2]) {
			String temp = (String) option1.getSelectedItem();
			option1.setSelectedItem(option2.getSelectedItem());
			option2.setSelectedItem(temp);
		}
	}
	
}
