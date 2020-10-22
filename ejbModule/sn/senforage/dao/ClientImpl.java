package sn.senforage.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.senforage.entities.Client;

@Stateless
public class ClientImpl implements IClient{

private EntityManager em;
	
    public ClientImpl() {
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("SenforageEJB");
		em = emf.createEntityManager();
	}

	@Override
    public int add(Client client) {
		try {
			em.getTransaction().begin();
			em.persist(client);
			em.getTransaction().commit();
			return 1;
		}catch (Exception ex){
			ex.printStackTrace();
			return  0;
		}
    }

    @Override
    public List<Client> clients() {
    	return em.createQuery("SELECT c FROM Client c").getResultList();    }

	@Override
	public int delete(int id, Client client) {
		try {
			em.getTransaction().begin();
			client = em.find(Client.class,id);
			em.remove(client);
			em.getTransaction().commit();
			return 1;
		}catch (Exception ex)
		{
			ex.printStackTrace();
			return 0;
		}	}

}
