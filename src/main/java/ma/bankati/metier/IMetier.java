package ma.bankati.metier;

import ma.bankati.model.Credit;

public interface IMetier {
    Credit calculer_Mensualite(Long idCredit) throws Exception;
}
