package ir.appservice.model.converter;

import ir.appservice.model.entity.application.ui.Menu;
import ir.appservice.model.service.MenuService;
import org.springframework.stereotype.Component;

@Component
public class MenuConverter extends BaseConverter<Menu> {

    public MenuConverter(MenuService menuService) {
        super(Menu.class, menuService);
    }
}
