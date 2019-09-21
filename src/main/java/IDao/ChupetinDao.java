/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDao;

import Modelos.Chupetin;
import java.util.ArrayList;

/**
 *
 * @author pabloscotto87
 */
public interface ChupetinDao {
    public static ArrayList<Chupetin> listaChupetines = new ArrayList<Chupetin>();
    
    public void add(Chupetin user);
    public void update(Chupetin user);
    public void delete(Chupetin user);
    public Chupetin getById(int userId);
    public ArrayList<Chupetin> getAll();
}
