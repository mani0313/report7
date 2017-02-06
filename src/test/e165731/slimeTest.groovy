package e165731

import org.junit.Test
import sun.jvm.hotspot.debugger.win32.coff.TestDebugInfo

import javax.swing.JPanel
import java.awt.Container
import java.awt.event.KeyEvent
import java.awt.event.KeyListener;

/**
 * Created by e165731 on 2017/02/06.
 */
class slimeTest extends JPanel implements KeyListener {
    @Override
    void keyTyped(KeyEvent e) {

    }

    @Override
    void keyReleased(KeyEvent e) {

    }

    @Test
    public void keyPressed(KeyEvent e) throws Exception{
        slime panel = new slime();
        Container contentPane = getContentPane();
        contentPane.add(panel);
        panel.keyPressed();
    }


}
