public class ProjectService {
    public void creerProjet(String nom) {
        System.out.println("Projet créé : " + nom);
    }
    public void ajouterMembre(String projet, String utilisateur) {
        System.out.println(utilisateur + "  a etait ajouté au projet " + projet);
    }

    public void rejoindreProjet(String projet, String utilisateur) {
        System.out.println(utilisateur + " a rejoint le projet " + projet);
    }
     public void supprimerProjet(String nom) {
        System.out.println("Projet supprimé : " + nom);
    }
    public void supprimerMembre(String projet, String utilisateur) {
        System.out.println(utilisateur + "  a été supprimé  " + projet);
}
}