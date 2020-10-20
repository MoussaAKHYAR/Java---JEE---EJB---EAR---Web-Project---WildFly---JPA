package sn.senforage.dao;

import java.util.List;

import javax.ejb.Local;

import sn.senforage.entities.Client;

@Local
public interface IClient {
	public int add(Client client);
    public List<Client> clients();
    public int delete(int id, Client client);
}
