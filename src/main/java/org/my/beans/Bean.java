package org.my.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by al on 22.02.2016.
 */

@ManagedBean
@RequestScoped
public class Bean {

    private String text;
    private Integer number;

    public void submit() {
        System.out.println("Submitted values: " + text + ", " + number);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
