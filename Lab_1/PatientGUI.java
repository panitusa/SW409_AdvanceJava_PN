import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PatientGUI extends JFrame {
	
	ArrayList<Patient> plist;

	public PatientGUI() {

		createPatientUI();

	}
	
	JFrame frame;
	JTextField textField;
	JTextField textField_1;
	JTextField textField_2;
	JTextField textField_3;
	JTextField textField_4;
	
	public void createPatientUI() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPatientId = new JLabel("Patient ID :");
		lblPatientId.setBounds(48, 22, 91, 16);
		frame.getContentPane().add(lblPatientId);
		
		JLabel lblPatientName = new JLabel("Name :");
		lblPatientName.setBounds(48, 50, 104, 16);
		frame.getContentPane().add(lblPatientName);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setBounds(48, 78, 61, 16);
		frame.getContentPane().add(lblGender);
		
		JLabel lblAge = new JLabel("Age :");
		lblAge.setBounds(48, 106, 61, 16);
		frame.getContentPane().add(lblAge);
		
		JLabel lblDoctor = new JLabel("Doctor :");
		lblDoctor.setBounds(48, 134, 61, 16);
		frame.getContentPane().add(lblDoctor);
		
		JLabel lblSymptoms = new JLabel("Symptoms :");
		lblSymptoms.setBounds(48, 162, 104, 16);
		frame.getContentPane().add(lblSymptoms);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnExit.setBounds(315, 206, 117, 29);
		frame.getContentPane().add(btnExit);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(139, 18, 132, 27);
		frame.getContentPane().add(comboBox);
		comboBox.addItem("one");
		comboBox.addItem("two");
		comboBox.addItem("three");
		comboBox.addItem("four");
		comboBox.addItem("five");
		comboBox.addItem("six");
		
		textField = new JTextField();
		textField.setBounds(97, 50, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(97, 78, 130, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(97, 106, 130, 26);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(97, 129, 130, 26);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(125, 157, 130, 26);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnPrint = new JButton("Print to File");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//button print to file to here
				try {
					
					PrintWriter Outfile = new PrintWriter(textField.getText() +"detail.txt");
					Outfile.println("Name :" + textField.getText());
					Outfile.println("Gender :" +textField_1.getText());
					Outfile.println("Age :" + textField_2.getText());
					Outfile.println("Doctor :" + textField_3.getText());
					Outfile.println("Symptom :" +textField_4.getText());
					Outfile.close();
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnPrint.setBounds(22, 206, 117, 29);
		frame.getContentPane().add(btnPrint);
		
		JButton btnShowDetail = new JButton("Show Patient Detail");
		btnShowDetail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Button show detail go here

				try {
					Scanner	Infile = new Scanner(new FileReader("/Users/panitnakajitti/Documents/Java Programing (2019)/FallLab1/src/PatientList.txt"));
					//Please check file Path 
					
					Patient[] PatientArray = new Patient[10];
					
					for (int i = 0; i < PatientArray.length; i++) {
						String ID = Infile.next();
						String Name = Infile.next();
						String Gender = Infile.next();
						int Age = Infile.nextInt();
						String Doctor = Infile.next();
						String Symp = Infile.next();
						
						PatientArray[i] = new Patient(ID, Name, Gender, Age, Doctor, Symp);
						
						String slected = (String) comboBox.getSelectedItem();
						
						
						if (slected.equals(ID)) {
							
							textField.setText(Name);
							textField_1.setText(Gender);
							textField_2.setText(Age + " ");
							textField_3.setText(Doctor);
							textField_4.setText(Symp);							
							
						}												
						
					}
						Infile.close();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				

			}
		});
		btnShowDetail.setBounds(151, 206, 165, 29);
		frame.getContentPane().add(btnShowDetail);	
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
