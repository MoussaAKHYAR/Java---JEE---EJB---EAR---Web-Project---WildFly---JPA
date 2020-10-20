package sn.senforage.dao;

import java.util.List;

import sn.senforage.entities.User;

public interface IUser {
	public int add(User utilisateur);
    public List<User> users();
    public User getLogin(String email, String password);
    public int delete(int id, User utilisateur);
    public User get(int id);
}
