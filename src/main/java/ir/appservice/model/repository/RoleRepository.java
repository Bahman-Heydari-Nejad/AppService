package ir.appservice.model.repository;

import ir.appservice.model.entity.application.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, String> {


}
