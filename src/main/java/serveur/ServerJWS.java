package serveur;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;


public class ServerJWS {
    public static void main(String[] args) {
        // Spécifiez l'URL à laquelle vous souhaitez publier le service web
        String url ="http://localhost:8084/";
        // Utilisez la classe Endpoint pour publier le service web à l'URL spécifiée
        // et utilisez l'implémentation de la classe "BanqueService" pour gérer les requêtes
        Endpoint.publish(url,new BanqueService());
        // Affiche l'URL à laquelle le service web a été publié
        System.out.println(url);
    }
}