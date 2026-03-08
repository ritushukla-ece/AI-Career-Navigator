package career;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class navigator {
    public static class LoginPage {

        JFrame frame;
        JTextField usernameField;
        JPasswordField passwordField;
        JButton loginButton;

        LoginPage() {

            frame = new JFrame("AI Career Navigator Login");

            JLabel userLabel = new JLabel("Username:");
            userLabel.setBounds(50, 50, 100, 30);
            frame.add(userLabel);

            usernameField = new JTextField();
            usernameField.setBounds(150, 50, 150, 30);
            frame.add(usernameField);

            JLabel passLabel = new JLabel("Password:");
            passLabel.setBounds(50, 100, 100, 30);
            frame.add(passLabel);

            passwordField = new JPasswordField();
            passwordField.setBounds(150, 100, 150, 30);
            frame.add(passwordField);

            loginButton = new JButton("Login");
            loginButton.setBounds(150, 150, 100, 30);
            frame.add(loginButton);

            loginButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    String username = usernameField.getText();
                    String password = new String(passwordField.getPassword());

                    if(username.equals("admin") && password.equals("1234")) {

                        frame.dispose();
                        new Dashboard();

                    } else {

                        JOptionPane.showMessageDialog(frame, "Invalid Username or Password");

                    }
                }
            });

            frame.setSize(400,300);
            frame.setLayout(null);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
}
