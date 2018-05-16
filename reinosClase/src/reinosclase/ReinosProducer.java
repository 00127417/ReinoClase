/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinosclase;

import reinosclase.elfos.FactoryReinoElfo;
import reinosclase.orco.FactoryReinoOrco;

/**
 *
 * @author Oscar Lovato
 */
public class ReinosProducer {
    public static AbstractReino getReino(String type){
        switch (type){
            case "elfo":
                return  new FactoryReinoElfo();
            case "orco":
                return new FactoryReinoOrco();
        }
        return null;
    }
}
