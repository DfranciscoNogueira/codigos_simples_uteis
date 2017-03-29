import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaEmail {

    private static Pattern pattern;

    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[_A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static void main(String[] args) {

        String emailValido = "diego@gmail.com";
        String emailInvalido = "diegogmailcom";

        System.out.println(validate(emailInvalido));
        System.out.println(validate(emailValido));

    }

    static {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    /**
     * Validar e-mail com expressão regular
     * 
     * @param email
     *            a ser validado
     * @return returna true se o email for válido, false se inválido
     *
     */
    public static boolean validate(final String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
