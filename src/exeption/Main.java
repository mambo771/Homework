package exeption;

public class Main {
    private static final String VALIDATE_PATTERN = "^[a-zA-Z0-9-_]+$";

    public static void main(String[] args) {
        check("login","pass","pass");
        check("loginloginloginloginloginloginloginloginloginloginlogin","pass","pass");
        check("login","passpasspasspasspasspasspasspasspasspasspass","pass");
        check("login","pass","pass2");
        check("login%%%%%","pass","pass");
        check("login","pass%%%%%","pass");
    }

    private static void check(String login, String pass, String confirmPas) {
        try {
            checkLogin(login);
            checkPass(pass, confirmPas);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка с введенным логином: "+ e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка с введенным паролем: "+ e.getMessage());
        }

    }

    private static void checkLogin(String login) throws WrongLoginException {
        if (!login.matches(VALIDATE_PATTERN)) {
            throw new WrongLoginException(" Логин содержит в себе только латинские буквы, цифры и знак подчеркивания. ");

        }
        if (login.length() > 20) {
            throw new WrongLoginException(" Логин не может быть длинее 20 символов ");
        }
    }

    private static void checkPass(String pass, String confirmPass) throws WrongPasswordException {
        if (!pass.matches(VALIDATE_PATTERN)) {
            throw new WrongPasswordException(" Пароль содержит в себе только латинские буквы, цифры и знак подчеркивания. ");

        }
        if (pass.length() > 20) {
            throw new WrongPasswordException(" Пароль не может быть длинее 20 символов ");
        }
        if (!pass.equals(confirmPass)) {
            throw new WrongPasswordException(" Пароли не совпадают");
        }
    }
}
