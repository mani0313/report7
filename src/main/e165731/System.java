package e165731;

import java.awt.Container;
import javax.swing.JFrame;

    public class System extends JFrame {
        public System() {
            // タイトルを設定
            setTitle("スライムがぐるぐるするだけ");

            // パネルを作成
            slime panel = new slime();
            Container contentPane = getContentPane();
            contentPane.add(panel);

            // パネルサイズに合わせてフレームサイズを自動設定
            pack();
        }

        public static void main(String[] args) {
            System frame = new System();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    }
