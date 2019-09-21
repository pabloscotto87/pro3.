/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SDao;

import IDao.UsuarioDao;
import Modelos.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import pro3maven.pro3.Main;

/**
 *
 * @author pabloscotto87
 */
public class UsuarioServicio implements UsuarioDao {

    private static Usuario[] usuarios = new Usuario[2];

    @Override
    public void add(Usuario user) {
        usuarios[user.getPosicion()] = user;
    }

    @Override
    public void update(Usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario getById(int userId) {
        return usuarios[userId];
    }

    @Override
    public Usuario[] getAll() {
        Properties p = new Properties();
        try {
            p.load(new FileInputStream("application.properties"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i = 0;
        Enumeration e = p.propertyNames();
        while (e.hasMoreElements()) {
            String nombre = (String) e.nextElement();
            String pass = p.getProperty(nombre);
            Usuario user = new Usuario(i,nombre,pass);
            add(user);
            i++;
        }
        return usuarios;
    }

}
