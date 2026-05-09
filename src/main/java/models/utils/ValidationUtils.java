public static boolean ValidationUtils(String email) {
    if (email == null) return false;

    return email.contains("@");
}