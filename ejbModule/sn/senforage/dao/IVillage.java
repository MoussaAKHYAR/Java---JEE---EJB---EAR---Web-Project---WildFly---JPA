package sn.senforage.dao;

import java.util.List;

import javax.ejb.Local;

import sn.senforage.entities.Village;

@Local
public interface IVillage {
    public int add(Village village);
    public List<Village> villages();
    public int delete(int id, Village village);
    public Village getVillageByName(String nomVillage);
    public Village get(int id);
}
