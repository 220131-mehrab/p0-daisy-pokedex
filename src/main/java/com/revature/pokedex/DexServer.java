package com.revature.pokedex;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class DexServer {
    private Tomcat server;

    public DexServer(DexService dexService) {
        Tomcat server = new Tomcat();
        server.setBaseDir(System.getProperty("java.io.tmpfir"));
        server.getConnector();
        server.addContext("",null);
        server.addServlet("", "dexServlet", dexService).addMapping("/");
        try {
            server.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
