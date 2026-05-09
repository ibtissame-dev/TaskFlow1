public class public NomUtils  {

    public static boolean validerMembre(String nom) {

        if (nom == null)
            return false;

        return !nom.isEmpty();
    }
}