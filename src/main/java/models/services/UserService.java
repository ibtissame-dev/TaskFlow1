public class UserService {
    public void creerUtilisateur(String nom, String email) {
        System.out.println("Utilisateur créé : " + nom);
    }

    public boolean connecterUtilisateur(String email, String motDePasse) {
        System.out.println("Connexion de : " + email);
        return true;
    }

    public void obtenirUtilisateurParId(int id) {
        System.out.println("Utilisateur ID : " + id);
    }
}