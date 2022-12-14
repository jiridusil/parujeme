package web.parujeme.application.dto;

import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.spring.annotation.UIScope;
import org.springframework.stereotype.Component;

/**
 * @author jdusil
 * @date 2022-08-04 9:23 AM
 */
@UIScope
@Component
public class UserData {

    public String userName;
    public String firstNameString;
    public String lastNameString;
    public TextField firstName = new TextField();
    public EmailField email = new EmailField();
    public DatePicker date = new DatePicker();

    public TextField getFirstName() {
        return firstName;
    }

    public void setFirstName(TextField firstName) {
        this.firstName = firstName;
    }
}
