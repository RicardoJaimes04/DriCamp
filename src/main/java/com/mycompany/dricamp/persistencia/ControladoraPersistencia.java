/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dricamp.persistencia;

import com.mycompany.dricamp.logic.Cliente;
import java.util.List;

/**
 *
 * @author Svensson
 */
public class ControladoraPersistencia {
    
    
    ClienteJpaController cliJpa= new ClienteJpaController();

    public List<Cliente> traerUsuarios() {
  
        List<Cliente>listaCliente= cliJpa.findClienteEntities();
        
        return listaCliente;
    }
    
    
    
    
    
}
