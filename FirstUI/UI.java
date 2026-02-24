import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Random;

public class UI extends JFrame {
    JLabel guessLabel, winLabel;
    int min = 1, max = 101, myGuess;
    Random rn;
    public UI(){
        super();
        rn = new Random();
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
        myGuess = calcGuess();
        guessLabel = new JLabel(myGuess + "");
        content.add(guessLabel);
        //------------ Win Panel -----------------
        JPanel winPanel = new JPanel();
        winLabel = new JLabel("You pick a number between 1 and 100. I guess it.");
            //add winLabel to winPanel, and add winPanel to Content
        winPanel.add(winLabel);
        content.add(winPanel);
        //Now for our buttons
        JPanel buttonsPanel = new JPanel();
        JButton cmdDown = new JButton("V");
        cmdDown.addActionListener(e -> {
            //this is a lambda expression
            max = myGuess;
            myGuess = calcGuess();
            guessLabel.setText(myGuess + "");

            System.out.println("Down");
            System.out.println("------");
        });

        JButton cmdCorrect = new JButton("Correct");
        cmdCorrect.addActionListener(e -> {
            winLabel.setText("Ha!  I win.  You fool! You fell victim to one of the classic blunders....Never go in against a computer when GUESS is on the line!");
            System.out.println("Correct");
        });
        JButton cmdUp = new JButton("^");
        cmdUp.addActionListener(e -> {
            min = myGuess;
            myGuess = calcGuess();
            guessLabel.setText(myGuess + "");

            System.out.println("Up");
        });
        buttonsPanel.add(cmdDown);
        buttonsPanel.add(cmdCorrect);
        buttonsPanel.add(cmdUp);
        getContentPane().add(buttonsPanel, BorderLayout.SOUTH);
        setPreferredSize(new Dimension(400,400));
        pack();
    }
    int calcGuess(){
        // int guess = (min + max) / 2;
        //find the range
        int range = max - min;        
        //get the random number
        int guess = rn.nextInt(range);

        //add the min to it
        guess = guess + min;
        System.out.println(guess);
        return guess;
        
    }

}
