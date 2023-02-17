package core;

import entity.concretes.User;
import google.GoogleSignUpManager;

public class GoogleSignUpMngrAdapter implements SignUpService{

	@Override
	public void signUp(User user) {
		GoogleSignUpManager googleSignUpManager=new GoogleSignUpManager();
		googleSignUpManager.signUp(user);
	}
	
}
