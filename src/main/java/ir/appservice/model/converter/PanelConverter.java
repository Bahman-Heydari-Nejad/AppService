package ir.appservice.model.converter;

import ir.appservice.model.entity.application.ui.Panel;
import ir.appservice.model.service.PanelService;
import org.springframework.stereotype.Component;

@Component
public class PanelConverter extends BaseConverter<Panel> {

    public PanelConverter(PanelService panelService) {
        super(Panel.class, panelService);
    }
}
