package ir.appservice.model.repository;

import ir.appservice.model.entity.domain.Document;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends CrudRepository<Document, String> {

}
