package ir.appservice.model.repository;

import ir.appservice.model.entity.application.Email;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends CrudRepository<Email, String> {

}
