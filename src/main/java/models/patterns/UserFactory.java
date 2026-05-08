public class UserFactory {

    public static User createUser(String role){

        if(role.equals("ADMIN")){
            return new User();
        }

        return new User();
    }
}