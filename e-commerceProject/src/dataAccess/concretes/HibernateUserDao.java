package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entity.concretes.User;

public class HibernateUserDao implements UserDao{
	@Override
    public void add(User user) {
        System.out.println("Kullanıcı sisteme eklendi: "
        +user.getFirstName());
    }

    @Override
    public void delete(User user) {
        System.out.println("Kullanıcı sistemden silindi: "
                +user.getFirstName());
    }

    @Override
    public void update(User user) {
        System.out.println("Kullanıcı sistemde güncellendi: "
                +user.getFirstName());
    }

    @Override
    public void login(User user) {

    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
