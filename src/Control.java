
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;



public class Control extends JFrame {

	private JTextField guess;
    private JTextField response;
    private JTextField die;
    private JTextField current;
    
    
    public Control()
    {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setTitle("Game Controls");
    	setSize(700,100);
    	JPanel panel = createTurnAndDiePanel();
    	add(panel, BorderLayout.CENTER);
    	
    	panel = createActionPanel();
    	add(panel, BorderLayout.WEST);

    	panel = createGuessPanel();
    	add(panel, BorderLayout.EAST);
  	
    }
    
    private JPanel createTurnAndDiePanel()
    {
    	JPanel panel = new JPanel();
    	die = new JTextField(5);
    	JLabel dieText = new JLabel("Die Roll");
    	
    	current = new JTextField(20);
    	JLabel currentText = new JLabel("Current Player");
    	
    	die.setEditable(false);
    	
    	panel.setLayout( new GridLayout(2,0));
    	panel.add(currentText);
		panel.add(current);
		
		panel.add(dieText);
		panel.add(die);
		panel.setBorder(new TitledBorder (new EtchedBorder(), "Attribute box"));

		return panel;
    }
    
    private JPanel createActionPanel()
    {
    	JButton next = new JButton("Next Player");
    	JButton accuse = new JButton("Accuse");

    	JPanel panel = new JPanel();
    	panel.add(next);
    	panel.add(accuse);
    	
		panel.setLayout(new GridLayout(2, 1));

    	return panel;
    }
    
    
    
    private JPanel createGuessPanel()
    {
    	
    	guess = new JTextField(15);
    	JLabel guessText = new JLabel("Guess");
    	
    	response = new JTextField(15);
    	JLabel responseText = new JLabel("Guess Response");
    	
    	guess.setEditable(false);
    	response.setEditable(false);
    	JPanel panel = new JPanel();
    	panel.setLayout( new GridLayout(2,0));
    	panel.add(guessText);
		panel.add(guess);
		
		panel.add(responseText);
		panel.add(response);
		panel.setBorder(new TitledBorder (new EtchedBorder(), "Guess box"));

		return panel;
    }

    
    public static void main(String[] args) {
		Control gui = new Control();
		gui.setVisible(true);
	}
	
}
