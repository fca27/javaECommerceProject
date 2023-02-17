package dataAccess.abstracts;

import java.util.List;

import entity.concretes.User;

public interface UserDao {
	public void add(User user);
    public void delete(User user);
    public void update(User user);
    public void login(User user);

    List<User> getAll();
}
