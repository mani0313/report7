package e165731;

import java.awt.*;
import java.awt.image.*;
import javax.swing.JFrame;
import javax.imageio.*;
import java.net.*;
import java.io.*;

public class test extends JFrame {
    private static final long serialVersionUID = 1L;
    private BufferedImage moguraImage;

    public test() {
        try {
            URL url = new URL("http://msyk.net/keio/JavaBook/eclipse-indigo/mogura.gif");
            moguraImage = ImageIO.read(url);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.getContentPane().add(new ImageCanvas(moguraImage));
        this.setBounds(0 ,0, 400, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new test();
    }
}

class ImageCanvas extends Canvas
{
    private static final long serialVersionUID = 1L;
    Image presenImage;
    int w, h;

    public ImageCanvas(Image img) {
        presenImage = img;
        w = presenImage.getWidth(this);
        h = presenImage.getHeight(this);
        this.setSize(w, h);
    }
    public void paint(Graphics g) {
        g.drawImage(presenImage, 0, 0, this);
    }
}