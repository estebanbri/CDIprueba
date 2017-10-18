/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esteban.modelo;



import com.esteban.qualifier.Premium;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
@Premium
public class ClientePremium extends Cliente {
    
   private Integer codigoDescuento;

    public Integer getCodigoDescuento() {
        return codigoDescuento;
    }

    public void setCodigoDescuento(Integer codigoDescuento) {
        this.codigoDescuento = codigoDescuento;
    }
   
   
    
}
