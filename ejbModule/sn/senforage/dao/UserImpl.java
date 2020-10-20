package sn.senforage.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.senforage.entities.User;

@Stateless
public class UserImpl implements IUser {

	@PersistenceContext(unitName="SenforageEJB")
    private EntityManager em;
    @Override
    public User getLogin(String email, String password)
    {
        try {
            return (User)em
                    .createQuery("select u from User u where u.email=:e and u.password=:p")
                    .setParameter("e",email)
                    .setParameter("p",password)
                    .getSingleResult();

        }catch (Exception e)
        {
            return null;
        }
    }
    @Override
    public int add(User user)
    {
    	try {
			em.persist(user);
			return 1;
		} catch(Exception ex) {
			ex.printStackTrace();
			return 0;
		}
    }

    @Override
    public int delete(int id, User user)
    {
        int ok;
        try {
            em.getTransaction().begin();
            user = em.find(User.class,id);
            em.remove(user);
            em.getTransaction().commit();
            ok = 1;
        }catch (Exception ex)
        {
            ok = 0;
            ex.printStackTrace();
        }
        return ok;
    }

    @Override
    public List<User> users()
    {
    	try {
			return em.createQuery("SELECT u FROM User u").getResultList();
		} catch(Exception ex) {
			ex.printStackTrace();
			return null;
		}
    }

    @Override
    public User get(int id)

    {
        return em.find(User.class,id);
    }

}
