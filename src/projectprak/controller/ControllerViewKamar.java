package projectprak.controller;

import projectprak.model.Kamar;
import projectprak.model.ModelKamar;
import projectprak.view.ViewKamar;

/**
 *
 * @author user
 */
public class ControllerViewKamar {
   
public ViewKamar viewKamar() {
        ModelKamar mk = new ModelKamar();
        Kamar[] result = mk.getAll();
        return new ViewKamar(result);
    }
    
}
