package projectprak.view;

import java.awt.event.ActionEvent;
import projectprak.controller.ControllerCheckout;

/**
 *
 * @author user
 */
public class ViewCheckOut extends CekKode {
    ControllerCheckout controllerCheckout = new ControllerCheckout();
    public ViewCheckOut() {
        super("CHECK OUT KODE", "check out berhasil!");
    }

   @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == super.buttonOk) {
            this.controllerCheckout.checkOut(this.getFkode().getText(),this);
        }
    }
}
