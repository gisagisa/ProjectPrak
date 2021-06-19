package projectprak.view;

import java.awt.event.ActionEvent;
import projectprak.controller.ControllerCancel;

/**
 *
 * @author user
 */
public class ViewCancel extends CekKode{
    ControllerCancel controllerCancel = new ControllerCancel();
    public ViewCancel(){
        super("CANCEL KODE","cancel berhasil!"); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == super.buttonOk) {
            this.controllerCancel.delete(this.getFkode().getText(),this);
        }
    }
}

