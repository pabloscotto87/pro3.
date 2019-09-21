/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import IDao.*;
import SDao.*;

/**
 *
 * @author pabloscotto87
 */
public class FactoryDao {    
    public UsuarioDao crearUsuarioDao(){
        return new UsuarioServicio();
    }
    public CarameloDao crearCarameloDao(){
        return new CarameloServicio();
    }
    public ChupetinDao crearChupetinDao(){
        return new ChupetinServicio();
    }
}
