import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;

public class myGUI {
    public static void main(String[] args) {
        FirstFrame jFrame = new FirstFrame();
        jFrame.init();
        jFrame.showUI();
    }
}

class FirstFrame {

    JFrame window;
    Boolean isInitiated = false;
    private GridLayout gridLayout;

    void init(){
        window = new JFrame();
        gridLayout = new GridLayout(10,2, 10,10);

        window.setLayout(gridLayout);
        window.setSize(400, 400);

        addComponents();

        isInitiated = true;
    }

    private void addComponents() {

        JLabel labelOne, labelTwo;
        JButton buttonOne, buttonTwo;

        labelOne = new JLabel("Label 1");
        labelTwo = new JLabel("Label 2");

        buttonOne = new JButton("Button 1");

        buttonTwo = new JButton("Button 2");

        Component[] components = {labelOne, labelTwo, buttonOne, buttonTwo, new JButton("Button 2"), new JButton("Button 2"), new JButton("Button 2"), new JButton("Button 2"), new JButton("Button 2"), new JButton("Button 2"), new JButton("Button 2"), new JButton("Button 2"), new JButton("Button 2"), new JButton("Button 2"), new JButton("Button 2"), new JButton("Button 2"), new JButton("Button 2"), new JButton("Button 2"), new JButton("Button 2"), new JButton("Button 2"), new JButton("Button 2")};

        for (Component component : components) {
            window.add(component);
        }
    }

    void showUI(){
        if (!isInitiated) {
            System.out.println("Class is not fully initiated");
            return;
        }
        window.setVisible(true);
    }
}

