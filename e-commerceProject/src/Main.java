import Business.abstracts.UserService;
import Business.concretes.UserManager;
import core.GoogleSignUpMngrAdapter;
import dataAccess.concretes.HibernateUserDao;
import entity.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService=new UserManager(new HibernateUserDao(), 
			new GoogleSignUpMngrAdapter());
		User user=new User(1, "ali", "ak", "aliak@gmail.com", "ali123");
		userService.signUp(user);

	}

}
