import javax.swing.*;
import java.awt.*;

/**
 * Created by Paul on 7/16/2017.
 */
public class DonutExample extends JFrame {

    public DonutExample() {
        initUI();
    }

    private void initUI() {
        add(new DonutBoard());

        setSize(250, 200);

        setTitle("Donut Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                DonutExample ex = new DonutExample();
                ex.setVisible(true);
            }
        });
    }

}
