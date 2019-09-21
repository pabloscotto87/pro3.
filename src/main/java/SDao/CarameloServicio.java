/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SDao;

import IDao.CarameloDao;
import Modelos.Caramelo;
import Modelos.Log;
import Modelos.LogUsuario;
import java.util.ArrayList;
import java.util.Date;
import pro3maven.pro3.Main;

/**
 *
 * @author pabloscotto87
 */
public class CarameloServicio implements CarameloDao {

    @Override
    public void add(Caramelo caramelo) {
        listaCaramelos.add(caramelo);
        Log.auditoria("Add Caramelo "+caramelo.getNombre());
    }

    @Override
    public void update(Caramelo caramelo) {
        for (Caramelo c : listaCaramelos) {
            if (c.getId() == caramelo.getId()) {
                c.setFabricante(caramelo.getFabricante());
                c.setCategoria(caramelo.getCategoria());
                c.setColor(caramelo.getColor());
                c.setPrecio(caramelo.getPrecio());
                c.setNombre(caramelo.getNombre());
                Log.auditoria("Update Caramelo " + caramelo.getNombre());
                break;
            }
        }
    }

    @Override
    public void delete(Caramelo caramelo) {
        for (Caramelo c : listaCaramelos) {
            if (c.getId() == caramelo.getId()) {
                listaCaramelos.remove(c);
                Log.auditoria("Delete Caramelo " + caramelo.getNombre());
                break;
            }
        }
    }

    @Override
    public Caramelo getById(int id) {
        Caramelo caramelo = null;
        for (Caramelo c : listaCaramelos) {
            if (c.getId() == id) {
                caramelo = c;
            }
        }
        Log.auditoria("GetById Caramelo "+id);
        return caramelo;
    }

    @Override
    public ArrayList<Caramelo> getAll() {
        Log.auditoria("GetAll Caramelos");
        return listaCaramelos;
    }

}
