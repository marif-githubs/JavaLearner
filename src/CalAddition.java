import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalAddition {
    public static void main(String[] args) {
        calculatorGUI cal = new calculatorGUI();
        cal.init();
    }
}
class calculatorGUI{
    JFrame window;
    GridLayout gridLayout;
    JLabel l1 = new JLabel("CALCULATOR");
    JTextField tf1 = new JTextField(20);
    JTextField tf2 = new JTextField(20);
    JButton b1 = new JButton("add");
    int a, b;
    void init(){
        window = new JFrame();
        window.setVisible(true);
        window.setSize(400,400);
        gridLayout = new GridLayout(10,10,10,10);
        window.setLayout(gridLayout);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        components();
    }
    void components(){

        window.add(l1);
        window.add(tf1);
        window.add(tf2);
        window.add(b1);
        window.revalidate();
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                a = Integer.parseInt(tf1.getText());
                b = Integer.parseInt(tf2.getText());
                add();

            }
        });

    }
    void add(){
        int c ;
        String value;
        c = a + b;
        value = String.valueOf(c);
        JLabel result = new JLabel(value);
        window.remove(tf1);
        window.remove(tf2);
        window.remove(b1);
        window.revalidate();
        window.add(result);
        window.revalidate();

    }
}