package e165731;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

class slime extends JPanel {
    // パネルサイズ
    private static final int WIDTH = 200;
    private static final int HEIGHT = 200;

    // スライムのイメージ
    private Image slimeimage1, slimeimage2, slimeimage3, slimeimage4;

    public slime() {
        // パネルの推奨サイズを設定
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        // イメージをロード
        loadImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // スライムのイメージを表示
        g.drawImage(slimeimage1, 0, 0, this);
        g.drawImage(slimeimage2, 200, 0, this);
        g.drawImage(slimeimage3, 400, 0, this);
        g.drawImage(slimeimage4, 600, 0, this);
    }

    private void loadImage() {//ファイルのロード
        ImageIcon icon = new ImageIcon(getClass().getResource("slime1.jpg"));
        slimeimage1 = icon.getImage();
        icon = new ImageIcon(getClass().getResource("slime2.jpg"));
        slimeimage2 = icon.getImage();
        icon = new ImageIcon(getClass().getResource("slime3.jpg"));
        slimeimage3 = icon.getImage();
        icon = new ImageIcon(getClass().getResource("slime4.jpg"));
        slimeimage4 = icon.getImage();
    }
}