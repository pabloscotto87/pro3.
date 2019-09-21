/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import pro3maven.pro3.Main;

/**
 *
 * @author pabloscotto87
 */
public class Log {

    public static Map<Integer, LogUsuario> mapLog = new HashMap<Integer, LogUsuario>();

    public static void imprimeLog() {
        Iterator<Map.Entry<Integer, LogUsuario>> entries = mapLog.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, LogUsuario> entry = entries.next();
            LogUsuario log = (LogUsuario) entry.getValue();
            System.out.println(entry.getKey() + "- Usuario: " + log.getUsuario() + " Acción: " + log.getMetodo());
        }
    }

    public static void auditoria(String metodo) {
        LogUsuario log = new LogUsuario(Main.usuarioLogueado, metodo, new Date());
        Log.mapLog.put(Log.mapLog.size(), log);
    }
}
