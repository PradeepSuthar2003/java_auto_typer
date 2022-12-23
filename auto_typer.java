import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.AWTException;

class Typer {
    String str = "acdef";
    char ch[] = this.str.toCharArray();
    Robot rb;

    Typer() {
        try {
            this.rb = new Robot();
        } catch (AWTException e) {
            System.out.println("Someting get worng !");
        }
    }

    void writer() {

        for (int i = 0; i < str.length(); i++) {
            if (ch[i] == 'a' || ch[i] == 'A') {
                rb.keyPress(KeyEvent.VK_A);
                rb.keyRelease(KeyEvent.VK_A);
            }

            if (ch[i] == 'b' || ch[i] == 'B') {
                rb.keyPress(KeyEvent.VK_B);
                rb.keyRelease(KeyEvent.VK_B);
            }

            if (ch[i] == 'c' || ch[i] == 'C') {
                rb.keyPress(KeyEvent.VK_C);
                rb.keyRelease(KeyEvent.VK_C);
            }

            if (ch[i] == 'd' || ch[i] == 'D') {
                rb.keyPress(KeyEvent.VK_D);
                rb.keyRelease(KeyEvent.VK_D);
            }

            if (ch[i] == 'e' || ch[i] == 'E') {
                rb.keyPress(KeyEvent.VK_E);
                rb.keyRelease(KeyEvent.VK_E);
            }

            if (ch[i] == 'f' || ch[i] == 'F') {
                rb.keyPress(KeyEvent.VK_F);
                rb.keyRelease(KeyEvent.VK_F);
            }

            // add all key event condition here ---
        }

    }
}

class auto_typer {
    public static void main(String[] args) {
        Typer tp = new Typer();
        tp.writer();
    }
}
