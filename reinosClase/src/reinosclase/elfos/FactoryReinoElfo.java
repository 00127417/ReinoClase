/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinosclase.elfos;

import reinosclase.AbstractReino;
import reinosclase.orco.orco;


/**
 *
 * @author Oscar Lovato
 */
public class FactoryReinoElfo implements AbstractReino{

    @Override
    public elfos getElfo(String type) {
        switch(type){
            case "arquero":
                return new arquero();
            case "mago":
                return new mago();
            case "rey elfo":
                return new ReyElfo();
        }
        return null;
       }

    @Override
    public orco getOrco(String type) {
        return null;
    }
    
    
}
