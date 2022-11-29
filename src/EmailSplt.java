public class EmailSplt {
    public static void main(String[] args) {

        System.out.println(getEmailUserName("mary@vafa.com"));
    }
    public static String getEmailUserName(String email){
        String[] emailParts = email.split("@");
        return emailParts[1];
    }
}
