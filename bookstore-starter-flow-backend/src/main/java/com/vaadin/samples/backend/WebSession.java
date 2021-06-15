package com.vaadin.samples.backend;


import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.UUID;

@SessionScoped
public class WebSession implements Serializable {

    private String foo;

    public WebSession() {
        this.foo = UUID.randomUUID().toString();
    }

    public String getFoo() {
        return foo;
    }
}
