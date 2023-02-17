package Business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Business.abstracts.UserService;
import core.SignUpService;
import dataAccess.abstracts.UserDao;
import entity.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
    private SignUpService signUpService;

    public UserManager(UserDao userDao, SignUpService signUpService) {
        this.userDao = userDao;
        this.signUpService = signUpService;
    }

    @Override
    public void signUp(User user) {
        if(user.getFirstName().length() < 1){
            System.out.println("Lütfen Geçerli İsim Giriniz!");
            return;
        }
        if(user.getPassword().length() < 6){
            System.out.println("Sifreniz 6 Karakterden Büyük Olmalıdır ");
            return;
        }

        final String emailPattern = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        final Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(user.geteMail());
        if (matcher.matches()) {
            System.out.println(user.geteMail() + " gecerli.");
        } else {
            System.out.println(user.geteMail() + " UYARI! Gecersiz bir email girdiniz.");
            return;
        }


        this.userDao.add(user);
        this.signUpService.signUp(user);
    }

    @Override
    public void confirm(User user) {

    }
}
