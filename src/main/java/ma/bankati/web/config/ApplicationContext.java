package ma.bankati.web.config;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import ma.bankati.dao.DaoFactory;

public class ApplicationContext implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Initialisation de Listner");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }

}
