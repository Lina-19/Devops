package ma.bankati.web.controllers.console;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ma.bankati.presentation.CreditController;
import ma.bankati.presentation.ICreditController;

import java.io.IOException;


@WebServlet(urlPatterns = "/credits" ,loadOnStartup = 1)
public class CreditControleur extends HttpServlet {
    ICreditController service;


     public CreditControleur(){
         System.out.println("Inctanciation de la servlet ^_^");
     }

    @Override
    public void init() throws ServletException {
        System.out.println("INITIALISATION de la servlet ^_^");
        service=new CreditController();
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Methode service appele : "+request.getMethod());

        var idstr=request.getParameter("idclient");
        int id = Integer.parseInt(idstr);

    }

    @Override
    public void destroy() {
        System.out.println("DESTRUCTION de la servlet ^_^");
    }
}
