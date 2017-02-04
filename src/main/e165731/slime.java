package e165731;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.KeyListener;
import java.lang.*;

class slime extends JPanel implements KeyListener {
    // パネルサイズ
    private static final int WIDTH = 200;
    private static final int HEIGHT = 200;

    // スライムのイメージ
    private Image slimeimage1, slimeimage2, slimeimage3, slimeimage4;
    int count = 0;

    public slime() {
        // パネルがキー操作を受け付けるように登録する
        setFocusable(true);
        addKeyListener(this);

        // パネルの推奨サイズを設定
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        // イメージをロード
        loadImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // スライムのイメージを表示
        g.drawImage(slimeimage1, 0, 0, this);
    }

    public void keyPressed(KeyEvent e) {
        // 押されたキーを調べる
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_RIGHT:
                // 右キーだったらカウント-1してそのカウントの画像表示
                if (count >= 3) {
                    count = 0;
                }else {
                    count++;
                }
                System.out.println(count);
                break;
            case KeyEvent.VK_LEFT:
                // 左キーだったらカウント+1してそのカウントの画像表示
                if (count <= 0){
                    count = 3;
                } else {
                    count--;
                }
                System.out.println(count);
                break;
        }

    }
    public void keyReleased(KeyEvent e) {
    }
    public void keyTyped(KeyEvent e) {
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