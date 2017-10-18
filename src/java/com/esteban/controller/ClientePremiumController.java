/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esteban.controller;

import com.esteban.modelo.Cliente;
import com.esteban.qualifier.Premium;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class ClientePremiumController {
    
    @Inject
    @Premium
    private Cliente cliente;
    
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente cliente){
        this.cliente= cliente;
    }
    public String navegarAConfirmacion(){
    /*En una aplicacion real, deberiamos 
     salvar los nuevos clientes a la base de datos aqui*/
       return "confirmacion_cliente_premium";
    }
    
}
