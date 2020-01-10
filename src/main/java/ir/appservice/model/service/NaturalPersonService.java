package ir.appservice.model.service;

import ir.appservice.model.entity.domain.NaturalPerson;
import ir.appservice.model.repository.NaturalPersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.List;

@Service
@ApplicationScope
public class NaturalPersonService extends CrudService<NaturalPerson> {

    public NaturalPersonService(NaturalPersonRepository naturalPersonRepository) {
        super(naturalPersonRepository, NaturalPerson.class);
    }

    public NaturalPersonRepository getNaturalPersonRepository() {
        return (NaturalPersonRepository) this.crudRepository;
    }

    public List<NaturalPerson> listWithoutAccount() {
        return this.getNaturalPersonRepository().findByAccountIsNull();
    }
}
