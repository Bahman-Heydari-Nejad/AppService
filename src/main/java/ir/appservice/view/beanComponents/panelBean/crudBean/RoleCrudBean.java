package ir.appservice.view.beanComponents.panelBean.crudBean;

import ir.appservice.model.entity.application.Role;
import ir.appservice.model.service.RoleService;
import ir.appservice.view.beanComponents.panelBean.BaseLazyCrudBean;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Setter
@Getter
@Component
@SessionScope
public class RoleCrudBean extends BaseLazyCrudBean<Role> {

    public RoleCrudBean(RoleService roleService) {
        super(roleService, Role.class);
    }

}
