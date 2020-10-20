package sn.senforage.dao;

import java.util.List;

import sn.senforage.entities.Client;

public interface IClient {
	public int add(Client client);
    public List<Client> clients();
    public int delete(int id, Client client);
}
