package career;

import javax.swing.*;

public class LearningResources {

    JFrame frame;

    LearningResources(String career){

        frame = new JFrame("Learning Resources");

        JLabel title = new JLabel("Best Learning Resources");
        title.setBounds(120,30,200,30);

        JTextArea resources = new JTextArea();
        resources.setBounds(40,80,300,120);

        if(career.equals("Software Developer")){
            resources.setText("Learn From:\n\nLeetCode\nHackerRank\nGeeksforGeeks\nUdemy Java Courses");
        }
        else if(career.equals("Data Analyst")){
            resources.setText("Learn From:\n\nKaggle\nCoursera\nGoogle Data Analytics\nExcel + Power BI");
        }
        else if(career.equals("Web Developer")){
            resources.setText("Learn From:\n\nFreeCodeCamp\nMDN Docs\nUdemy Web Development");
        }

        JButton close = new JButton("Close");
        close.setBounds(140,210,100,30);

        close.addActionListener(e -> frame.dispose());

        frame.add(title);
        frame.add(resources);
        frame.add(close);

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}