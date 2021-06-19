package projectprak.view;

import java.awt.event.ActionEvent;
import projectprak.controller.ControllerCheckin;

/**
 *
 * @author user
 */
public class ViewCheckIn extends CekKode {
    ControllerCheckin controllerCheckin = new ControllerCheckin();
    public ViewCheckIn() {
        super("CHECK IN KODE", "check in berhasil!");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == super.buttonOk) {
            
            this.controllerCheckin.checkIn(this.getFkode().getText(),this);
        }
    }
}
