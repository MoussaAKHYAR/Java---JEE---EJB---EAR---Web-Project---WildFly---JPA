package sn.senforage.dao;

import java.util.List;

import javax.ejb.Local;

import sn.senforage.entities.User;

@Local
public interface IUser {
	public int add(User user);
    public List<User> users();
    public User getLogin(String email, String password);
    public int delete(int id, User user);
    public User get(int id);
}
