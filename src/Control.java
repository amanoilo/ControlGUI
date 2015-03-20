
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
    	setSize(100,300);
    	JPanel panel = createTurnPanel();
    	add(panel, BorderLayout.WEST);
    	
    	panel = createNextPlayerPanel();
    	add(panel, BorderLayout.WEST);

    	panel = createAccusePanel();
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
    
    private JPanel createNextPlayerPanel()
    {
    	JButton next = new JButton("Next Player");
    	JPanel panel = new JPanel();
    	panel.add(next);
    	return panel;
    }
    
    private JPanel createAccusePanel()
    {
    	JButton accuse = new JButton("Make an Accusation");
    	JPanel panel = new JPanel();
    	panel.add(accuse);
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
