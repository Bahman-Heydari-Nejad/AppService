package ir.appservice.model.repository;

import ir.appservice.model.entity.domain.NaturalPerson;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NaturalPersonRepository extends CrudRepository<NaturalPerson, String> {

    List<NaturalPerson> findByAccountIsNull();
}
