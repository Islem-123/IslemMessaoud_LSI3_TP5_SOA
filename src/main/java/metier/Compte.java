package metier;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;
// La classe Compte représente un compte bancaire avec un code, un solde et une date de création.
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    // Attributs privés de la classe Compte
    private int code;
    private double solde;
    @XmlTransient
    private Date datecreat;
    // Constructeur par défaut sans paramètres
    public Compte() {}
    // Constructeur avec paramètres pour initialiser les attributs lors de la création d'un objet Compte
    public Compte(int code, double solde, Date datecreat) {
        this.code = code;
        this.solde = solde;
        this.datecreat = datecreat;
    }
    // Méthode getter pour obtenir le code du compte
    public int getCode() {
        return code;
    }
    // Méthode setter pour définir le code du compte
    public void setCode(int code) {
        this.code = code;
    }
    // Méthode getter pour obtenir le solde du compte
    public double getSolde() {
        return solde;
    }
    // Méthode setter pour définir le solde du compte
    public void setSolde(double solde) {
        this.solde = solde;
    }
    // Méthode getter pour obtenir la date de création du compte
    public Date getDatecreat() {
        return datecreat;
    }
    // Méthode setter pour définir la date de création du compte
    public void setDatecreat(Date datecreat) {
        this.datecreat = datecreat;

    }}

