/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SDao;

import IDao.ChupetinDao;
import Modelos.Chupetin;
import Modelos.Log;
import java.util.ArrayList;

/**
 *
 * @author pabloscotto87
 */
public class ChupetinServicio implements ChupetinDao {

    @Override
    public void add(Chupetin chupetin) {
        listaChupetines.add(chupetin);
        Log.auditoria("Add chupetin " + chupetin.getNombre());
    }

    @Override
    public void update(Chupetin chupetin) {
        for (Chupetin c : listaChupetines) {
            if (c.getId() == chupetin.getId()) {
                c.setFabricante(chupetin.getFabricante());
                c.setCategoria(chupetin.getCategoria());
                c.setConChicle(chupetin.isConChicle());
                c.setSabor(chupetin.getSabor());
                c.setNombre(chupetin.getNombre());
                Log.auditoria("Update chupetin " + chupetin.getNombre());
                break;
            }
        }
    }

    @Override
    public void delete(Chupetin chupetin) {
        for (Chupetin c : listaChupetines) {
            if (c.getId() == chupetin.getId()) {
                listaChupetines.remove(c);
                Log.auditoria("Delete chupetin " + chupetin.getNombre());
                break;
            }
        }
    }

    @Override
    public Chupetin getById(int id) {
        Chupetin chupetin = null;
        for (Chupetin c : listaChupetines) {
            if (c.getId() == id) {
                chupetin = c;
            }
        }
        Log.auditoria("GetById chupetin "+id);
        return chupetin;
    }

    @Override
    public ArrayList<Chupetin> getAll() {
        Log.auditoria("GetAll chupetines");
        return listaChupetines;
    }

}
