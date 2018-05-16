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
public interface AbstractReino {
    elfos getElfo(String type);
    orco getOrco(String type);
}
