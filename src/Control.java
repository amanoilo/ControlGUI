
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class Control extends JFrame {

	private JTextField Guess;
    private JTextField Response;
    private JTextField Die;
    
    
    public Control()
    {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setTitle("Game Controls");
    	setSize(400,400);
    	JPanel panel = createTurnPanel();
    	add(panel, BorderLayout.WEST);
    	
    	panel = createActionPanel();
    	add(panel, BorderLayout.WEST);

    	panel = createDiePanel();
    	add(panel, BorderLayout.EAST);

    	panel = createGuessPanel();
    	add(panel, BorderLayout.EAST);

    	panel = createGuessResultPanel();
    	add(panel, BorderLayout.EAST);    	
    }
    
    private JPanel createTurnPanel()
    {
    	JPanel panel = new JPanel();
    	
    	return panel;
    }
    
    private JPanel createActionPanel()
    {
    	JButton next = new JButton("Next Player");
    	JButton accuse = new JButton("Accuse");

    	JPanel panel = new JPanel();
    	panel.add(next);
    	panel.add(accuse);
    	
		setLayout(new GridLayout(2, 1));

    	return panel;
    }
    
    private JPanel createAccusePanel()
    {
    	JPanel panel = new JPanel();
    	return panel;
    }
    
    private JPanel createDiePanel()
    {
    	JPanel panel = new JPanel();
    	return panel;
    }
    
    private JPanel createGuessPanel()
    {
    	JPanel panel = new JPanel();
    	return panel;
    }
    
    private JPanel createGuessResultPanel()
    {
    	JPanel panel = new JPanel();
    	return panel;
    }
    
    public static void main(String[] args) {
		Control gui = new Control();
		gui.setVisible(true);
	}
	
}
