/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reinosclase.orco;

import reinosclase.AbstractReino;
import reinosclase.elfos.elfos;

/**
 *
 * @author Oscar Lovato
 */
public class FactoryReinoOrco implements AbstractReino{

    @Override
    public elfos getElfo(String type) {
        return null;
    }

    @Override
    public orco getOrco(String type) {
        switch(type){
            case "hechicero":
                return new hechicero();
            case "lanzador":
                return new lanzador();
            case "bestia mayor":
                return new BestiaMayor();
        }
        return null;
    }
    
}
