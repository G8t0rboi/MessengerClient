import javax.swing.JFrame;

public class ClientTest {

    public static void main(String[] args) {
        Client boi;
        boi = new Client("127.0.0.1");
        boi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boi.startRunning();
    }
}
