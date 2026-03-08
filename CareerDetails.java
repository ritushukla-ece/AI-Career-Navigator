package career;

import javax.swing.*;

public class CareerDetails {

    JFrame frame;

    CareerDetails(String career){

        frame = new JFrame("Career Details");

        JLabel title = new JLabel("Career Details");
        title.setBounds(140,20,200,30);

        JTextArea details = new JTextArea();
        details.setBounds(40,70,300,120);

        if(career.equals("Software Developer")){
            details.setText("Software Developer\n\nSkills Needed:\nJava, DSA, Problem Solving\n\nTools:\nGit, IntelliJ IDEA");
        }
        else if(career.equals("Data Analyst")){
            details.setText("Data Analyst\n\nSkills Needed:\nPython, SQL, Excel\n\nTools:\nPower BI, Kaggle");
        }
        else if(career.equals("Web Developer")){
            details.setText("Web Developer\n\nSkills Needed:\nHTML, CSS, JavaScript\n\nTools:\nVS Code, Git");
        }

        JButton resources = new JButton("Learning Resources");
        resources.setBounds(110,200,170,30);

        JButton close = new JButton("Close");
        close.setBounds(150,240,100,30);

        // Learning Resources button
        resources.addActionListener(e -> {
            new LearningResources(career);
        });

        // Close button
        close.addActionListener(e -> {
            frame.dispose();
        });

        frame.add(title);
        frame.add(details);
        frame.add(resources);
        frame.add(close);

        frame.setSize(400,350);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}