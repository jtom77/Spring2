package com.javatechig;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void init() throws ServletException {
        // Servlet initialization code here
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        String s = request.getQueryString();

        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();

        if("baudelaire".equalsIgnoreCase(s)) {
            out.println("<h2>" + Messenger.printMessage() + "</h2>");
            out.println("<p>C'est la mort qui console, helás, et qui fait vivre<br/>");
            out.println("C'est le but de la vie, et c'est le seul espoir<br/>");
            out.println("Qui, comme un élixir nous monte et nous enivre;<br/>");
            out.println("Et nous donne le coeur de marcher jusq'au soir.<" + "p/>");
            out.println("<p>À travers la têmpete, et la neige, et le givre,<br/>");
            out.println("C'est la clarté vibrante à notre horizon noir;<br/>");
            out.println("C'est l'auberge fameuse inscrite sur le livre,<br/>");
            out.println("Où l'on pourra manger, et dormir et s'asseoir;<p/>");
            out.println("<p>C'est un Ange qui tient dans ses doigts magnétiques<br/>");
            out.println("Le sommeil et le don des rêves extatiques,<br/>");
            out.println("Et qui refait le lit des gens pauvres et nus.<p/>");
            out.println("<p>C'est la gloire des Dieux, c'est le grenier mystique,<br/>"+
                    "C'est la bourse du pauvre et sa patrie antique,<br/>" +
                    "C'est le portique ouvert sur les Cieux inconnus!</p>");
        } else if("benn".equalsIgnoreCase( s )) {
            out.println("<h2>Wenn ein Gesicht</h2>");
            out.println("<p>Wenn ein Gesicht, das man als junges kannte,<br/>" +
                    "Und dem man Glanz und Tränen weggeküsst<br/>" +
                    "Sich in den ersten Zug des Alters wandte<br/>" +
                    "Den frühen Zauber lebend eingebüßt.<p/>" +
                    "<p>Der Bogen einst, dem jeder Pfeil gelungen,<br/>" +
                    "Gefiedert lag das Rohr im Blau.<br/>" +
                    "Die Cymbel auch, die jedes Lied gesungen<br/>" +
                    "Funkelnde Schale - Wiesen im Dämmergrau.<p/>" +
                    "<p>Dem ersten Zug der zweite schon im Bunde,<br/>" +
                    "Ach, an der Stirne hält sie schon die Wacht,<br/>" +
                    "Die einsame, die letzte Stunde<br/>" +
                    "Das ganze liebe Antlitz dann in Nacht." );
        } else {
            out.println("<h2>So a Riesenschmarrn</h2>");
        }

        // Set response content type

    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void destroy() {
        // resource release
        super.destroy();
    }
}