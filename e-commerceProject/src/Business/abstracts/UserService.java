package Business.abstracts;

import entity.concretes.User;

public interface UserService {
	public void signUp(User user);
    public void confirm(User user);
}
