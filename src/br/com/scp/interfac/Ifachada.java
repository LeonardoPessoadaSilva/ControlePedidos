/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scp.interfac;

import br.com.scp.model.Cliente;

/**
 *
 * @author Leonardo
 */
public interface Ifachada {
    
    void salvarClienteDAO (Cliente pmodelCliente)throws Exception;
    
}
