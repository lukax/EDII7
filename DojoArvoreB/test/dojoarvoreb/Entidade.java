/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dojoarvoreb;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Classe que representa uma entidade genérica
 * Todas as entidades a serem manipuladas devem herdar desta classe
 * @author leomurta
 */
public interface Entidade {    

    /*
     * Salva uma instância de uma entidade no arquivo out
     * @param out Arquivo onde a instância da entidade será salva
     */
    public void salva(RandomAccessFile out) throws IOException;
    
}

