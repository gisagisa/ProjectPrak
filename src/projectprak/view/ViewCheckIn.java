package projectprak.view;

import java.awt.event.ActionEvent;
import projectprak.controller.ControllerCheckin;
import projectprak.controller.ControllerMenuUtama;

/**
 *
 * @author user
 */
public class ViewCheckIn extends CekKode {
    ControllerCheckin controllerCheckin = new ControllerCheckin();
    ControllerMenuUtama controllerMenuUtama = new ControllerMenuUtama();
    
    public ViewCheckIn() {
        super("CHECK IN KODE", "check in berhasil!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == super.buttonOk) {
            
            this.controllerCheckin.checkIn(this.getFkode().getText(),this);
        }
        if (e.getSource() == bback) {
            controllerMenuUtama.viewMenuUtama(this);
        }
    }
}
