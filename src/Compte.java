public class Compte {
    private long num;
    private String nomClient;
    private Double solde;

    public Compte() {
    }

    public Compte(long num, String nomClient, Double solde) {
        this.num = num;
        this.nomClient = nomClient;
        this.solde = solde;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public void afficherCompteInfo() {
        System.out.println("Numéro de compte: " + getNomClient());
        System.out.println("Nom du client: " + getNomClient());
        System.out.println("Solde du compte: " + getSolde());
    }
    public void retirer(double montant) {
        if (montant > getSolde()) {
            this.solde -= montant;

            System.out.println("Votre retrait de " + montant + " est un échec");
        }
        else {
            System.out.println("Retrait de " + montant + " effectué.");
            System.out.println("Votre nouveau solde est : " + getSolde());
        }
    }

    public void deposer(double montant){
        this.solde += montant;
        System.out.println("Votre dépot de: " + montant + " est réussi");
    }
}





