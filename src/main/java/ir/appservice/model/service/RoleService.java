package ir.appservice.model.service;

import ir.appservice.model.entity.application.Role;
import ir.appservice.model.repository.RoleRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;

@Service
@ApplicationScope
public class RoleService extends CrudService<Role> {

    public RoleService(RoleRepository roleRepository) {
        super(roleRepository, Role.class);
    }

}
