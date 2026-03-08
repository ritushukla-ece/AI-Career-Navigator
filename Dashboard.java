package career;

import javax.swing.*;

public class Dashboard {

    JFrame frame;

    Dashboard() {

        frame = new JFrame("Dashboard");

        JLabel title = new JLabel("AI Career Navigator");
        title.setBounds(120,30,200,30);

        JButton startTest = new JButton("Start Career Test");
        startTest.setBounds(100,100,200,40);

        JButton exit = new JButton("Exit");
        exit.setBounds(100,160,200,40);

        frame.add(title);
        frame.add(startTest);
        startTest.addActionListener(e -> {

            new SkillSelection();
            frame.dispose();

        });
        frame.add(exit);

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}