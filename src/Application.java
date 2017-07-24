import javax.swing.*;
import java.awt.*;

/**
 * Created by Paul on 7/16/2017.
 */
public class Application extends JFrame {

    public Application() {
        initUI();
    }

    private void initUI() {
        add(new DonutBoard());

        setSize(250, 200);

        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Application ex = new Application();
                ex.setVisible(true);
            }
        });
    }
}