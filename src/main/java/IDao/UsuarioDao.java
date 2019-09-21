/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IDao;

import Modelos.Usuario;

/**
 *
 * @author pabloscotto87
 */
public interface UsuarioDao {
    public void add(Usuario user);
    public void update(Usuario user);
    public void delete(Usuario user);
    public Usuario getById(int userId);
    public Usuario[] getAll();
}
