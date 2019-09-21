/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro3maven.pro3;

import Factories.FactoryDao;
import Factories.FactoryService;
import IDao.UsuarioDao;
import Modelos.Log;
import Modelos.LogUsuario;
import Modelos.Usuario;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pabloscotto87
 */
public class Main {

    public static String usuarioLogueado;
    public static Scanner s = new Scanner(System.in);

    public static void main(String[] arg) {
        Log.mapLog.clear();
        boolean salir = false;
        while (!salir) {
            System.out.println("Seleccione Opción");
            System.out.println("L-Login");
            System.out.println("P-Imprime Log");
            System.out.println("S-Salir");
            switch (s.next()) {
                case "L":
                    logueo();
                    break;
                case "P":
                    Log.imprimeLog();
                    break;
                case "S":
                    salir = true;
                    break;
            }
        }
    }

    public static void logueo() {
        //Login
        FactoryService factory = new FactoryService();
        UsuarioDao usuarioDao = factory.crearUsuarioServicio();
        Usuario[] usuarios = usuarioDao.getAll();

        String usuario;
        String pass;
        boolean logueado = false;
        while (!logueado) {
            System.out.println("Ingrese Usuario: ");
            usuario = s.next();
            System.out.println("Ingrese Password: ");
            pass = s.next();
            for (Usuario user : usuarios) {
                if (user.getNombre().equals(usuario) && user.getPass().equals(pass)) {
                    usuarioLogueado = usuario;
                    LogUsuario logUsuario = new LogUsuario(usuarioLogueado, "Logueo", new Date());
                    Log.mapLog.put(Log.mapLog.size(), logUsuario);
                    logueado = true;
                    break;
                }
            }
        }
    }

    public static void menu() {

    }
}
