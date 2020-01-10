package ir.appservice.model.validator;

import ir.appservice.model.entity.application.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class AuthenticationValidator implements Validator<Account> {

    private final Logger logger = LoggerFactory.getLogger(AuthenticationValidator.class);

    @Override
    public void validate(FacesContext context, UIComponent component, Account value) throws ValidatorException {

    }

}
