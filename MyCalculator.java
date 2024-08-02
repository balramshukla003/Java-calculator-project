import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyCalculator extends Frame {

    MyCalculator(){

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
        setLayout(null);
        setTitle("MyCalculator");
        setSize(500,700);
        TextField t1=new TextField();
        t1.setBounds(20,125,460,25);
        add(t1);
        Button b1=new Button(" 9 ");
        b1.setBounds(20,150,150,25);
        add(b1);
    }

    public static void main(String[] args) {
        MyCalculator mY=new MyCalculator();
    }
}