package service;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import metier.Compte;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@WebService
public class BanqueService {
    // Méthode pour convertir un montant en une autre devise avec un taux de change fixe
    @WebMethod
    public double conversion(@WebParam(name = "montant") double montant) {
        return montant * 3.36;
    }
    // Méthode pour obtenir une liste de comptes factices
    @WebMethod
    public List<Compte> getComptes() {
        // Création d'une liste de comptes
        List<Compte> comptes = new ArrayList<>();

        // Création de deux comptes factices avec des valeurs spécifiques
        Compte c1 = new Compte(10, 10.5, new Date());
        Compte c2 = new Compte(9, 15.5, new Date());

        // Ajout des comptes à la liste
        comptes.add(c1);
        comptes.add(c2);

        // Renvoi de la liste de comptes
        return comptes;
    }
}

