package ir.appservice.view.beanComponents.elementBean;

import ir.appservice.view.beanComponents.BaseBean;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Component
@RequestScope
public class EditorView extends BaseBean {

    private String text;

    private String text2;
}
