package sn.senforage.dao;

import java.util.List;

import javax.ejb.Stateless;

import sn.senforage.entities.User;

@Stateless
public class UserImpl implements IUser {

	@Override
	public int add(User utilisateur) {
		
		return 0;
	}

	@Override
	public List<User> users() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getLogin(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(int id, User utilisateur) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
