package ir.appservice.view.beanComponents.panelBean.crudBean;

import ir.appservice.model.entity.application.ui.Panel;
import ir.appservice.model.service.PanelService;
import ir.appservice.view.beanComponents.panelBean.BaseLazyCrudBean;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Setter
@Getter
@Component
@SessionScope
public class PanelCrudBean extends BaseLazyCrudBean<Panel> {

    public PanelCrudBean(PanelService panelService) {
        super(panelService, Panel.class);
    }
}
