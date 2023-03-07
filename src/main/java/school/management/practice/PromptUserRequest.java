package school.management.practice;

import javax.swing.*;

public class PromptUserRequest {
    private JPanel rootPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("PromptUserRequest");
        frame.setContentPane(new PromptUserRequest().rootPanel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
