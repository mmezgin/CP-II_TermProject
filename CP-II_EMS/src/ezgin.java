import java.awt.EventQueue;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.print.DocFlavor.STRING;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.List;
import java.awt.Button;

public class ezgin {
    private ArrayList<String> liste =new ArrayList<String>();
	private ArrayList<String> employeeData = new ArrayList<String>();
	private JFrame frame;
	private JPasswordField passwordField1;
	private JTextField textField1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ezgin window = new ezgin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ezgin() {
		initialize();
	}
	
	
	
	public static class Employee {
		private String name;
		private String surname;
		private int Age;
		private String Gender;
		private String Domain;
		private double Salary;
		private String Country;
		private String Phone;
		
		public Employee() {
			this.name=name;
			this.surname=surname;
			this.Age=Age;
			this.Gender=Gender;
			this.Domain=Domain;
			this.Salary=Salary;
			this.Country=Country;
			this.Phone=Phone;
		}
		public Employee(String name,String surname,int Age,String Gender,String Domain,double Salary,String Country,String Phone ) {
			this.name=name;
			this.surname=surname;
			this.Age=Age;
			this.Gender=Gender;
			this.Domain=Domain;
			this.Salary=Salary;
			this.Country=Country;
			this.Phone=Phone;
		}
		
		
		public void setName(String name) {
			this.name=name;
			
		}
		public String getName() {
			return this.name;
		}

		public void setSurname(String surname) {
			this.surname=surname;
			
		}
		public String getSurname() {
			return this.surname;
		}

		public void setAge(int Age) {
			this.Age=Age;
			
		}
		public int getAge() {
			return this.Age;
		}

		public void setGender(String Gender) {
			this.Gender=Gender;
			
		}
		public String getGender() {
			return this.Gender;
		}
		
		public void setDomain(String Domain) {
			this.Domain=Domain;
			
		}
		public String getDomain() {
			return this.Domain;
		}
		
		public void setSalary(double Salary) {
			this.Salary=Salary;
			
		}
		public double getSalary() {
			return this.Salary;
		}
		
		public void setCountry(String Country) {
			this.Country=Country;
			
		}
		public String getCountry() {
			return this.Country;
		}
		
		public void setPhone(String Phone) {
			this.Phone=Phone;
			
		}
		public String getPhone() {
			return this.Phone;
		}
		
		
	
		
	}



	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 1018, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(25, 13, 963, 537);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		

		JPanel panel1 = new JPanel();
		layeredPane.add(panel1, "name_293548241191300");
		panel1.setLayout(null);
		

		JPanel panel2 = new JPanel();
		panel2.setVisible(false);
		layeredPane.add(panel2, "name_293545615164800");
		panel2.setLayout(null);
		
		JPanel panel3 = new JPanel();
		panel3.setVisible(false);
		layeredPane.add(panel3, "name_293543545030300");
		panel3.setLayout(null);
		
		JTextArea jta123 = new JTextArea();
		jta123.setBounds(12, 275, 768, 249);
		panel3.add(jta123);
		
		Button button_3 = new Button("Delete All");
		button_3.setVisible(false);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
					deleteAll();
				} catch(IOException e22) {
					e22.printStackTrace();
				}
				
				
			}
		});
		
		button_3.setBounds(171, 218, 97, 24);
		panel3.add(button_3);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setVisible(false);
		btnAdd.setBounds(499, 156, 105, 51);
		panel3.add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				File inputFile = new File("Test1.txt");
				File tempFile = new File("temp1433.txt");
try {
	
				BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

				String lineToRemove = textField_5.getText().toString();
				String lineToRemove2 = textField_6.getText().toString();
				String currentLine;
                
				while((currentLine = reader.readLine()) != null) {
				    // trim newline when comparing with lineToRemove
				    String trimmedLine = currentLine.trim();
				    if(trimmedLine.equals("Name: "+lineToRemove+" "+"Surname: "+ lineToRemove2)) continue;
				    writer.write(currentLine + System.getProperty("line.separator"));
				}
				writer.close(); 
				reader.close(); 
				boolean successful = tempFile.renameTo(inputFile);
				clearTF();
}catch(IOException e111) {
	e111.printStackTrace();
} 
			}
		});
		btnDelete.setVisible(false);
		btnDelete.setBounds(171, 187, 97, 25);
		panel3.add(btnDelete);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setVisible(false);
		lblName.setBounds(25, 121, 56, 16);
		panel3.add(lblName);
		
		
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setVisible(false);
		lblSurname.setBounds(25, 156, 75, 16);
		panel3.add(lblSurname);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setVisible(false);
		lblAge.setBounds(25, 191, 56, 16);
		panel3.add(lblAge);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setVisible(false);
		lblGender.setBounds(25, 226, 56, 16);
		panel3.add(lblGender);
		
		JLabel lblDomain = new JLabel("Domain:");
		lblDomain.setVisible(false);
		lblDomain.setBounds(267, 121, 56, 16);
		panel3.add(lblDomain);
		
		JLabel lblSalary = new JLabel("Salary:");
		lblSalary.setVisible(false);
		lblSalary.setBounds(267, 156, 56, 16);
		panel3.add(lblSalary);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setVisible(false);
		lblCountry.setBounds(267, 191, 56, 16);
		panel3.add(lblCountry);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setVisible(false);
		lblPhone.setBounds(267, 226, 56, 16);
		panel3.add(lblPhone);
		
		
		
		JButton btnDeleteMenu = new JButton("Delete Menu");
		btnDeleteMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setVisible(true);
				textField_6.setVisible(true);
				textField_7.setVisible(false);
				textField_8.setVisible(false);
				textField_9.setVisible(false);
				textField_10.setVisible(false);
				textField_11.setVisible(false);
				textField_12.setVisible(false);
				lblAge.setVisible(false);
				lblCountry.setVisible(false);
				lblDomain.setVisible(false);
				lblGender.setVisible(false);
				lblName.setVisible(true);
				lblPhone.setVisible(false);
				lblSalary.setVisible(false);
				lblSurname.setVisible(true);
				btnAdd.setVisible(false);
				btnDelete.setVisible(true);
				button_3.setVisible(true);
				clearTF();
			}
		});
		btnDeleteMenu.setBounds(575, 24, 125, 64);
		panel3.add(btnDeleteMenu);

		
		btnAdd.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent e) {
	
				Employee emp = new Employee();		
				emp.setName(textField_5.getText()); 
				emp.setSurname(textField_6.getText());
				emp.setAge(Integer.parseInt(textField_7.getText()));
				emp.setGender(textField_8.getText());
				emp.setDomain(textField_9.getText());
				emp.setSalary(Double.parseDouble(textField_10.getText()));
				emp.setCountry(textField_11.getText());
				emp.setPhone(textField_12.getText());
				
				employeeData.add("Name: " + emp.getName() +
						" Surname: " + emp.getSurname()+ " Age: " +
						emp.getAge()+ " Gender: " + emp.getGender()+
						 " Domain: " + emp.getDomain()+ " Salary: " +
						emp.getSalary()+ " Country: " + emp.getCountry()+
						" Phone: " + emp.getPhone()+"\n");
				
				try {
					write2File(emp);
				} catch (IOException e1) {
				
					e1.printStackTrace();
				}
			employeeData.removeAll(employeeData);
				
                clearTF();
               
                
	
				
			}
		});
		
		
		
		JButton btnAddMenu = new JButton("Add Menu");
		btnAddMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_5.setVisible(true);
				textField_6.setVisible(true);
				textField_7.setVisible(true);
				textField_8.setVisible(true);
				textField_9.setVisible(true);
				textField_10.setVisible(true);
				textField_11.setVisible(true);
				textField_12.setVisible(true);
				lblAge.setVisible(true);
				lblCountry.setVisible(true);
				lblDomain.setVisible(true);
				lblGender.setVisible(true);
				lblName.setVisible(true);
				lblPhone.setVisible(true);
				lblSalary.setVisible(true);
				lblSurname.setVisible(true);
				btnAdd.setVisible(true);
				btnDelete.setVisible(false);
				button_3.setVisible(false);
				clearTF();
				
				
			}
		});
		btnAddMenu.setBounds(112, 24, 120, 64);
		panel3.add(btnAddMenu);
		
		JButton btnUpdateMenu = new JButton("Load Data");
		btnUpdateMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					FileReader reader=new FileReader("Test1.txt");
					BufferedReader br = new BufferedReader(reader);
					try {
						jta123.read(br, null);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						br.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					jta123.requestFocus();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnUpdateMenu.setBounds(335, 24, 120, 64);
		panel3.add(btnUpdateMenu);
		
		textField_5 = new JTextField();
		textField_5.setVisible(false);
		textField_5.setBounds(112, 118, 116, 22);
		panel3.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setVisible(false);
		textField_6.setColumns(10);
		textField_6.setBounds(112, 153, 116, 22);
		panel3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setVisible(false);
		textField_7.setColumns(10);
		textField_7.setBounds(112, 185, 116, 22);
		panel3.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setVisible(false);
		textField_8.setColumns(10);
		textField_8.setBounds(112, 223, 116, 22);
		panel3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setVisible(false);
		textField_9.setColumns(10);
		textField_9.setBounds(335, 118, 116, 22);
		panel3.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setVisible(false);
		textField_10.setColumns(10);
		textField_10.setBounds(335, 153, 116, 22);
		panel3.add(textField_10);
		
     	textField_11 = new JTextField();
		textField_11.setVisible(false);
		textField_11.setBounds(335, 188, 116, 22);
		panel3.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setVisible(false);
		textField_12.setColumns(10);
		textField_12.setBounds(335, 223, 116, 22);
		panel3.add(textField_12);
		
		JButton btnSignOut = new JButton("Sign Out");
		btnSignOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Succesfully Logged Out !");
				clearTF();
				panel3.setVisible(false);
				panel1.setVisible(true);
			}
		});
		btnSignOut.setBounds(854, 13, 97, 36);
		panel3.add(btnSignOut);

		JButton button_1 = new JButton("Go back to login menu");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel2.setVisible(false);
				panel1.setVisible(true);
			}
		});
		button_1.setBounds(757, 13, 194, 25);
		panel2.add(button_1);
		
		JButton button_2 = new JButton("Try to \r\nsign up !");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String password =  textField_2.getText();
					String pconfirm =  textField_1.getText();
					if((password.equals(pconfirm))) {
						
						
						String username=textField_3.getText().toString();
					      try {
					            File register = new File(""+username+".txt");
					            if(register.createNewFile())
					                JOptionPane.showMessageDialog(frame,"Username is available !");  
					    
					            
					            else
					                System.out.println("Error ! This username'"+username+"' already taken !");
					        }
					        catch(IOException io) {
					            io.printStackTrace(); 
					        }
					      
					      FileWriter fw = null;
							try {
								fw = new FileWriter(""+username+".txt");
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		
						
					try {
						fw.write(password);
						JOptionPane.showMessageDialog(frame, "You have succesfully registered ! Directing to login menu !!!");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						panel2.setVisible(false);
						panel1.setVisible(true);
						
					} catch (IOException e) {
				
						e.printStackTrace();
					}
					 try {
							fw.close();
						} catch (IOException e) {
					
							e.printStackTrace();
							
						}
					}
					else {
						JOptionPane.showMessageDialog(frame, "Passwords doesn't match !");
						
					}
				
			}
		});
		button_2.setBounds(219, 144, 119, 25);
		panel2.add(button_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(175, 96, 116, 22);
		panel2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(175, 60, 116, 22);
		panel2.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(175, 25, 116, 22);
		panel2.add(textField_3);
		
		JLabel label_3 = new JLabel("Username:");
		label_3.setBounds(32, 28, 97, 16);
		panel2.add(label_3);
		
		JLabel label_4 = new JLabel("Password:");
		label_4.setBounds(32, 63, 116, 16);
		panel2.add(label_4);
		
		JLabel label_5 = new JLabel("Re-Enter the Password:");
		label_5.setBounds(32, 99, 136, 16);
		panel2.add(label_5);
		
		
		
		JButton button = new JButton("Sign in");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String username=textField1.getText().toString();
			@SuppressWarnings("deprecation")
			String password = passwordField1.getText().toString();
				 try (BufferedReader br = new BufferedReader(new FileReader(""+username+".txt"))) {

						String sCurrentLine;

						while ((sCurrentLine = br.readLine()) != null) {
							if (password.equals(sCurrentLine))

		 {
								JOptionPane.showMessageDialog(frame, "Succesfully logged in ! Directing to main menu!!!");
								panel1.setVisible(false);
								panel3.setVisible(true);
							}
							else {
								JOptionPane.showMessageDialog(frame,"Incorrect password or username");
								
							}
						}

					} catch (IOException e1) {
						e1.printStackTrace();
					}
				
			}
		});
		button.setBounds(214, 152, 97, 25);
		panel1.add(button);
		
		passwordField1 = new JPasswordField();
		passwordField1.setBounds(174, 86, 116, 22);
		panel1.add(passwordField1);
		
		textField1 = new JTextField();
		textField1.setColumns(10);
		textField1.setBounds(174, 51, 116, 22);
		panel1.add(textField1);
		
		JLabel label_1 = new JLabel("Username:");
		label_1.setBounds(85, 51, 77, 16);
		panel1.add(label_1);
		
		JLabel label_2 = new JLabel("Password:");
		label_2.setBounds(85, 94, 77, 16);
		panel1.add(label_2);
		
		
		
		JCheckBox checkBox = new JCheckBox("Show Password");
		checkBox.setBounds(303, 85, 141, 25);
		panel1.add(checkBox);
		
		JButton btnSignup = new JButton("Signup");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel1.setVisible(false);
				panel2.setVisible(true);
			}
		});
		btnSignup.setBounds(105, 152, 97, 25);
		panel1.add(btnSignup);
	}
	public void clearTF() {
		textField_5.setText("");
		textField_6.setText("");
		textField_7.setText("");
		textField_8.setText("");
		textField_9.setText("");
		textField_10.setText("");
		textField_11.setText("");
		textField_12.setText("");
	}

	public void write2File(Employee em) throws IOException {
		int cout=0;
		PrintWriter pw1= new PrintWriter(new FileWriter("Test1.txt",true));
		pw1.append(employeeData.get(cout));
		pw1.close();
		cout++;
		
	}
	public void deleteAll()throws IOException {
		try {
		PrintWriter writer = new PrintWriter("Test1.txt");
		writer.print("");		
		writer.close();
		}catch(IOException e11){
			e11.printStackTrace();
			
		}
	}
}
