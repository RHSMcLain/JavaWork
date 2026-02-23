import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Font;

public class UI extends JFrame {
    JLabel guessLabel;
    boolean Gamerunning = false;
    public UI(){
        super();
        setLayout(new BorderLayout());
        //Create a label for the top
        ImageIcon logo = new ImageIcon("spyglass_sm.png");
        JLabel title = new JLabel("Guesser!", logo, SwingConstants.HORIZONTAL);
        title.setFont(new Font("Pirulen", Font.PLAIN, 32));
        getContentPane().add(title,BorderLayout.NORTH);
        //--------  Content Panel -------------
        JPanel content = new JPanel();
        content.add(new JLabel("My Guess: "));
        getContentPane().add(content, BorderLayout.CENTER);


        setPreferredSize(new Dimension(400,400));
        pack();
    }

}
