package ir.appservice.view.beanComponents.panelBean.crudBean;

import ir.appservice.model.entity.application.ui.Menu;
import ir.appservice.model.service.MenuService;
import ir.appservice.view.beanComponents.panelBean.BaseLazyCrudBean;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Setter
@Getter
@Component
@SessionScope
public class MenuCrudBean extends BaseLazyCrudBean<Menu> {

    public MenuCrudBean(MenuService menuService) {
        super(menuService, Menu.class);
    }
}
