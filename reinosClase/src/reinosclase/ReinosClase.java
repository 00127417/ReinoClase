/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinosclase;

import reinosclase.elfos.elfos;
import reinosclase.orco.orco;

/**
 *
 * @author Oscar Lovato
 */
public class ReinosClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractReino reino,reino2;
        reino=ReinosProducer.getReino("elfo");
        reino2=ReinosProducer.getReino("orco");
        elfos arquero=reino.getElfo("arquero");
        arquero.atacar();
        orco lanzador=reino2.getOrco("lanzador");
        lanzador.atacar();
        elfos mago=reino.getElfo("mago");
        mago.atacar();
        orco hechicero=reino2.getOrco("hechicero");
        hechicero.atacar();
        elfos reyElfo=reino.getElfo("rey elfo");
        reyElfo.atacar();
        orco reyOrco=reino2.getOrco("bestia mayor");
        reyOrco.atacar();
    }
    
}
