public class TaskService {
    public void creerTache(String titre) {
        System.out.println("Tâche créée : " + titre);
    }
    public void modifierTache(String ancienTitre, String nouveauTitre) {
        System.out.println("Tâche modifiée : " + ancienTitre + " devient " + nouveauTitre);
    }

    public void assignerTache(String tache, String utilisateur) {
        System.out.println(tache + " a été assignée à " + utilisateur);
    }
    public void changerStatut(String tache, String statut) {
        if (statut.equals("À faire") || statut.equals("En cours") || statut.equals("Terminée")) {
            System.out.println("Statut de la tâche " + tache + " : " + statut);
        } else {
            System.out.println("Statut invalide !");
        }
    }
    public void supprimerTache(String titre) {
        System.out.println("Tâche supprimée : " + titre);
    }
}
    
