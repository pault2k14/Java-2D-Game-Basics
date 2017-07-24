import javax.swing.*;
import java.awt.*;

/**
 * Created by Paul on 7/16/2017.
 */
public class ImageExample extends JFrame {

    public ImageExample() {
        initUI();
    }

    private void initUI() {

        add(new ImageBoard());
        pack();

        setTitle("Bardejov");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ImageExample ex = new ImageExample();
                ex.setVisible(true);
            }
        });
    }

}
