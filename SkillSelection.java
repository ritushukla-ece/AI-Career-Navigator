package career;

import javax.swing.*;
import java.awt.event.*;

public class SkillSelection {

    JFrame frame;

    JCheckBox javaSkill, pythonSkill, sqlSkill, htmlSkill;
    JButton submitButton;

    SkillSelection(){

        frame = new JFrame("Select Your Skills");

        JLabel title = new JLabel("Choose Your Skills");
        title.setBounds(120,30,200,30);

        javaSkill = new JCheckBox("Java");
        javaSkill.setBounds(50,80,100,30);

        pythonSkill = new JCheckBox("Python");
        pythonSkill.setBounds(200,80,100,30);

        sqlSkill = new JCheckBox("SQL");
        sqlSkill.setBounds(50,120,100,30);

        htmlSkill = new JCheckBox("HTML/CSS");
        htmlSkill.setBounds(200,120,100,30);

        submitButton = new JButton("Submit");
        submitButton.setBounds(120,180,120,40);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String career = "No suggestion";

                if(javaSkill.isSelected())
                    career = "Software Developer";

                if(pythonSkill.isSelected() && sqlSkill.isSelected())
                    career = "Data Analyst";

                if(htmlSkill.isSelected())
                    career = "Web Developer";

                new ResultPage(career);
                frame.dispose();
            }
        });

        frame.add(title);
        frame.add(javaSkill);
        frame.add(pythonSkill);
        frame.add(sqlSkill);
        frame.add(htmlSkill);
        frame.add(submitButton);

        frame.setSize(400,300);
        frame.setLayout(null);
        frame.setVisible(true);

    }
}