package ma.bankati.dao.MySQL;

import ma.bankati.dao.IDao;
import ma.bankati.model.Client;

import java.util.List;

public class ClientDao implements IDao<Client,Long> {

    @Override
    public Client trouverParId(Long aLong) {
        return null;
    }

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public Client save(Client client) {
        return null;
    }

    @Override
    public Client update(Client client) {
        return null;
    }

    @Override
    public Boolean delete(Client client) {
        return null;
    }

    @Override
    public Boolean deleteById(Long aLong) {
        return null;
    }
}
