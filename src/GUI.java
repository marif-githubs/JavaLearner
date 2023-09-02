import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUIRunner extends JFrame {

    private GridLayout gridLayout;

    void addButton(String text, ActionListener listener) {
        JButton jl = new JButton();
        jl.addActionListener(listener);
        jl.setText(text);
        jl.setLayout(gridLayout);
        add(jl);
        revalidate();
    }

    void addButton(String text) {
        JButton jl = new JButton();
        jl.setText(text);
        jl.setLayout(gridLayout);
        add(jl);
        revalidate();

    }

    void startGUI() {
        gridLayout = new GridLayout(20, 20);
        setLayout(gridLayout);
        setBounds(10, 10, 1200, 500);
        this.setVisible(true);
    }
}

public class GUI {
    public static void main(String[] args) {
        GUIRunner guiRunner = new GUIRunner();
        guiRunner.addButton("jsdgfk");
        guiRunner.addButton("Bhai", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Bhai button Clicked");
            }
        });
        guiRunner.startGUI();

    }
}
