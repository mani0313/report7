package e165731;

import java.awt.Container;
import javax.swing.*;

public class Main extends JFrame {
        public static JPanel panel;

        public Main() {
            // タイトルを設定
            setTitle("スライムがぐるぐるするだけ");

            // パネルを作成
            panel = new slime();
            Container contentPane = getContentPane();
            contentPane.add(panel);

            // パネルサイズに合わせてフレームサイズを自動設定
            pack();
        }

        public static void main(String[] args) {
            Main frame = new Main();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    }
