import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("ใส่ตัวเลข 1 ตัว", "0" );
        JOptionPane.showMessageDialog(null, "message", "title", JOptionPane.INFORMATION_MESSAGE);
        int ans = JOptionPane.showConfirmDialog(null
                , "รักหรือป่าว"
                , "ถามเธอ", JOptionPane.YES_NO_OPTION);
        if (ans==JOptionPane.YES_NO_OPTION){
            JOptionPane.showConfirmDialog(null, "รักนะจุ๊บๆ");
        }else {
            JOptionPane.showConfirmDialog(null, "จำไว้เลย");
        }

    }
}
