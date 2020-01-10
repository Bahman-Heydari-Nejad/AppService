package ir.appservice.model.converter;

import ir.appservice.model.entity.application.Role;
import ir.appservice.model.service.RoleService;
import org.springframework.stereotype.Component;

@Component
public class RoleConverter extends BaseConverter<Role> {

    public RoleConverter(RoleService roleService) {
        super(Role.class, roleService);
    }
}
