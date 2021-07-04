package projectprak.view;

import java.awt.event.ActionEvent;
import projectprak.controller.ControllerCheckout;
import projectprak.controller.ControllerMenuUtama;

/**
 *
 * @author user
 */
public class ViewCheckOut extends CekKode {
    ControllerCheckout controllerCheckout = new ControllerCheckout();
    ControllerMenuUtama controllerMenuUtama = new ControllerMenuUtama();
    
    public ViewCheckOut() {
        super("CHECK OUT KODE", "check out berhasil!");
    }

   @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == super.buttonOk) {
            this.controllerCheckout.checkOut(this.getFkode().getText(),this);
        }
        if (e.getSource() == bback) {
            controllerMenuUtama.viewMenuUtama(this);
        }
    }
}
