package career;

import javax.swing.*;

public class ResultPage {

    JFrame frame;

    ResultPage(String career){

        frame = new JFrame("Career Recommendation");

        JLabel title = new JLabel("Recommended Career:");
        title.setBounds(120,40,200,30);

        JLabel careerLabel = new JLabel(career);
        careerLabel.setBounds(140,80,200,30);

        JButton details = new JButton("View Details");
        details.setBounds(120,120,140,30);

        JButton close = new JButton("Close");
        close.setBounds(140,170,100,30);

        // View Details button
        details.addActionListener(e -> {
            new CareerDetails(career);
        });

        // Close button
        close.addActionListener(e -> {
            frame.dispose();
        });

        frame.add(title);
        frame.add(careerLabel);
        frame.add(details);
        frame.add(close);

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}