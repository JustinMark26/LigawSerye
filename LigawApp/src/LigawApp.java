import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LigawApp extends JFrame {
    private JButton yesButton;
    private JButton noButton;
    private JLabel questionLabel;
    private Random random;

    public LigawApp() {
        // Set up the JFrame
        setTitle("Pwede ba kitang ligawan?");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Use absolute positioning

        // Initialize random for random button movement
        random = new Random();

        // Create the question label
        questionLabel = new JLabel("Pwede ba kitang ligawan?");
        questionLabel.setBounds(100, 50, 250, 30);
        add(questionLabel);

        // Create the "Yes" button
        yesButton = new JButton("Yes");
        yesButton.setBounds(100, 100, 80, 30);
        add(yesButton);

        // Create the "No" button
        noButton = new JButton("No");
        noButton.setBounds(200, 100, 80, 30);
        add(noButton);

        // Add action listener for "Yes" button
        yesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Show message dialog when "Yes" is clicked
                JOptionPane.showMessageDialog(LigawApp.this, "yays thankyouu!! hangout tayu next time pag uwi ko");
            }
        });

        // Add action listener for "No" button
        noButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Move "No" button to a random position on the screen when clicked
                int x = random.nextInt(getWidth() - noButton.getWidth());
                int y = random.nextInt(getHeight() - noButton.getHeight() - 50); // Subtract for window title bar
                noButton.setLocation(x, y);
            }
        });

        // Center the window on the screen
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(() -> new LigawApp());
    }
}
