package Project1;

import java.awt.GridLayout;
import javax.swing.*; 

public class DateGUI {
    public void createAndShowGUI(String unsorted, String[] sorted, int counter) {
        //Create and set up the window.
        JFrame frame = new JFrame("Project 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100, 100);//width, height);
        frame.setLocation(200, 200);//x, y);
        frame.setLayout(new GridLayout(1, 2));

        JTextArea leftSide = new JTextArea(5, 20);
        leftSide.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(leftSide);
        frame.getContentPane().add(scrollPane); 
        JTextArea rightSide = new JTextArea(5, 20);
        rightSide.setEditable(false);
        frame.getContentPane().add(rightSide);

        String sortedLong = "";

        for (int i = 0; i < counter; i++){
            sortedLong += sorted[i] + "\n";
        }
        leftSide.setText(unsorted);
        rightSide.setText(sortedLong);

        frame.pack();
        frame.setVisible(true);
    }
}
