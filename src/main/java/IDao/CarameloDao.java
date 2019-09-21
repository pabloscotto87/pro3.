/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDao;

import Modelos.Caramelo;
import java.util.ArrayList;

/**
 *
 * @author pabloscotto87
 */
public interface CarameloDao {
    public static ArrayList<Caramelo> listaCaramelos = new ArrayList<Caramelo>();
    
    public void add(Caramelo user);
    public void update(Caramelo user);
    public void delete(Caramelo user);
    public Caramelo getById(int userId);
    public ArrayList<Caramelo> getAll();  
}
