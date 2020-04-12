
package ru.homeEdition.ru;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named     // говорим что будем использовать именованный компонент, имя такое же только ни чего не пишем
@RequestScoped // диапазон действия определяет время жизни
public class Customer {
   
    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAddress() {
        return "conformation";
    }
    
}
