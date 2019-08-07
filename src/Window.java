import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Window implements ActionListener{

	// declare the SWING components
	private JFrame frame;
	
	private JLabel nameL;
	private JLabel idL;
	private JLabel deptL;
	
	private JTextField name;
	private JTextField id;
	
	private JComboBox department;
	
	private JButton submit;
	private JButton clear;
	
	private JMenuBar menu;
	private JMenu file;
	private JMenuItem exit;
	
	
	public Window(){
		// initialize the SWING components
		frame = new JFrame();
		frame.setTitle("Sample Window");
		
		nameL = new JLabel("Name");
		idL = new JLabel("ID");
		deptL = new JLabel("Department");
		
		name = new JTextField();
		id = new JTextField();
		
		String [] options = {"ECE", "ENV", "ENG"};
		department = new JComboBox(options);
		
		submit = new JButton("Submit");
		submit.addActionListener(this);
		clear = new JButton("Clear");
		clear.addActionListener(this);
		
		menu = new JMenuBar();
		file = new JMenu("File");
		exit = new JMenuItem("Exit");
		exit.addActionListener(this);
		
		// set layout of the frame
		GridLayout g = new GridLayout(4, 2);
		frame.setLayout(g);
		
		// add components to the frame
		frame.add(nameL);
		frame.add(name);
		frame.add(idL);
		frame.add(id);
		frame.add(deptL);
		frame.add(department);
		frame.add(submit);
		frame.add(clear);
		
		// set the menubar
		file.add(exit);
		menu.add(file);
		frame.setJMenuBar(menu);
		
		// finalize the frame properties
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to make sure that the program closes when the frame closes
		frame.setSize(400, 300);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == submit){
			String n = name.getText();
			String i = id.getText();
			String d = department.getSelectedItem().toString();
			System.out.println(n + " " + i + " " + d);
		}
		
		if(e.getSource() == clear){
			name.setText("");
			id.setText("");
			department.setSelectedIndex(0); // to reset the combobox to its first element
		}
		
		if(e.getSource() == exit){
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new Window();
	}
}
