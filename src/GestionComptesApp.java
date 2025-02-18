public class GestionComptesApp {

    public static void main(String[] args) {

        Compte c1 = new Compte( 11111, "Ahmed", 20000.0);
        Compte c2 = new Compte( 22222, "Hajar", 30000.0);

       c1.retirer(19000.0);
       c2.retirer(45000.0);
       c1.deposer(15000.0);

    }
}
