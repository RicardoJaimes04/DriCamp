/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dricamp.logic;

import com.mycompany.dricamp.persistencia.ControladoraPersistencia;
import java.util.List;



/**
 *
 * @author Svensson
 */
public class Controladora {
    
    
    
    
    ControladoraPersistencia controlPersis;

    public Controladora() {
        
        controlPersis=new ControladoraPersistencia();
        
    }
    
    
    
    

    public String validarUsuario(String usuario, String contrasena) {

        String mensaje="";
        List<Cliente> listaCliente= controlPersis.traerUsuarios();
        for(Cliente cli:listaCliente){
            if (cli.getNombre().equals(usuario)){
                if(cli.getContrasena().equals(contrasena)){
                    mensaje="Usuario y contrasena correcta";
                    
                }else{
                    mensaje="Contrasena incorrecta";
                }
            
            }else{
                mensaje="Usuario no encontrado";
            }
            
        }

    
    return mensaje;

        
    }

      }
    

