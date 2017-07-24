import javax.swing.*;
import java.awt.*;

/**
 * Created by Paul on 7/16/2017.
 */
public class ImageBoard  extends JPanel {

    private Image bardejov;

    public ImageBoard() {
        initBoard();
    };

    private void initBoard() {
        loadImage();

        int w = bardejov.getWidth(this);
        int h = bardejov.getHeight(this);
        setPreferredSize(new Dimension(w, h));
    }

    private void loadImage() {
        ImageIcon ii = new ImageIcon("bardejov.jpg");
        bardejov = ii.getImage();
    }



    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(bardejov, 0, 0, null);
    }
}
