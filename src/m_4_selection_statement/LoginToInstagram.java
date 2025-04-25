package m_4_selection_statement;

public class LoginToInstagram {
    public static void main(String[] args) {

        String url="https://www.instagram.com/";

        String username="admin";

        String password= "12345";

        if (url=="https://www.instagram.com/"){
            if (username=="admin" & password=="12345"){

                System.out.println("Successfully logged in");

            }else {
                System.out.println("Wrong username or password");
            }
        }else {
            System.out.println("Wrong Url");
        }

    }
}
