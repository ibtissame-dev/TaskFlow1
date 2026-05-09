public class TestUtils {
    public static void main(String[] args) {

        
        System.out.println("Nom Tests:");
        System.out.println(NomUtils.validerMembre("Siham")); 
        System.out.println(NomUtils.validerMembre(""));       
        System.out.println(NomUtils.validerMembre(null));     

    
        System.out.println("Email Tests:");
        System.out.println(ValidationUtils.verifierEmail("test@gmail.com")); 
        System.out.println(ValidationUtils.verifierEmail("testgmail.com"));   
        System.out.println(ValidationUtils.verifierEmail(null));              
    }
}