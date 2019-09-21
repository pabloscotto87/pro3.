/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import IDao.CarameloDao;
import IDao.ChupetinDao;
import IDao.UsuarioDao;
import SDao.UsuarioServicio;

/**
 *
 * @author pabloscotto87
 */
public class FactoryService {
    FactoryDao dao = new FactoryDao();
    
    public UsuarioDao crearUsuarioServicio() {
        return dao.crearUsuarioDao();
    }
    public ChupetinDao crearChupetinServicio() {
        return dao.crearChupetinDao();
    }
    public CarameloDao crearCarameloServicio() {
        return dao.crearCarameloDao();
    }
}
