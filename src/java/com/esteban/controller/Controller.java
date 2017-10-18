/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esteban.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import com.esteban.modelo.Cliente;
import javax.inject.Inject;

/**
 *
 * @author esteban
 */
@Named
@RequestScoped
public class Controller {
    
    @Inject
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
       return "confirmacion";
    }
    
}
