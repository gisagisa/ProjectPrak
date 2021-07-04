package projectprak.view;

import java.awt.event.ActionEvent;
import projectprak.controller.ControllerCancel;
import projectprak.controller.ControllerMenuUtama;

/**
 *
 * @author user
 */
public class ViewCancel extends CekKode{
    ControllerCancel controllerCancel = new ControllerCancel();
    ControllerMenuUtama controllerMenuUtama = new ControllerMenuUtama();
    
    public ViewCancel(){
        super("CANCEL KODE","cancel berhasil!"); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == super.buttonOk) {
            this.controllerCancel.delete(this.getFkode().getText(),this);
        }
        if (e.getSource() == bback) {
            controllerMenuUtama.viewMenuUtama(this);
        }
    }
}

