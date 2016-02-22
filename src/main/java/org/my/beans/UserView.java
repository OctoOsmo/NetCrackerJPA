package org.my.beans;

import javax.faces.bean.ManagedBean;

/**
 * Created by al on 22.02.2016.
 */

@ManagedBean
public class UserView {

    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
