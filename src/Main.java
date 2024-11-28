import javax.swing.SwingUtilities;
import Controller.KTP_Controller;
import Views.KTP_View;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KTP_Controller controller = new KTP_Controller();
            KTP_View ktpView = new KTP_View(controller);
            ktpView.setVisible(true);
        });
    }
}
