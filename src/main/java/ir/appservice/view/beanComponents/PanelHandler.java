package ir.appservice.view.beanComponents;

import ir.appservice.model.entity.application.ui.Panel;
import ir.appservice.model.service.PanelService;
import ir.appservice.view.beanComponents.panelBean.BasePanelBean;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.faces.context.FacesContext;
import java.io.IOException;
import java.util.Map;

@Setter
@Getter
@Component
@SessionScope
public class PanelHandler extends BaseBean {

    private SessionBean sessionBean;
    private PanelService panelService;
    private Panel activePanel;

    public PanelHandler(SessionBean sessionBean, PanelService panelService) {
        this.sessionBean = sessionBean;
        this.panelService = panelService;

        setDefaultPanel();
    }

    public void openPanel(String id) {
        Panel panel = panelService.get(id);

        if (sessionBean.isAuthorized(panel)) {
            activePanel = panel;
        } else {
            error("Access Denied!", "You have not allowed to access this panel.", null);
            setDefaultPanel();
        }

        Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
        for (Map.Entry<String, Object> panelBean : sessionMap.entrySet()) {
            if (panelBean.getValue().toString().startsWith(BasePanelBean.class.getPackage().getName())) {
                sessionMap.remove(panelBean.getKey());
                logger.trace(String.format("Bean \"%s\"=\"%s\" removed.", panelBean.getKey(), panelBean.getValue()));
            }
        }
        logger.trace(String.format("Active Panel: %s", activePanel.getDisplayName()));
    }

    public void setDefaultPanel() {
        try {
            activePanel = sessionBean.getAccount().getPanels().get(0);
        } catch (ArrayIndexOutOfBoundsException e) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("/");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


}
