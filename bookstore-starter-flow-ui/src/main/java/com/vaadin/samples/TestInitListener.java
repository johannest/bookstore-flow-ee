package com.vaadin.samples;

import com.vaadin.flow.server.ServiceInitEvent;
import com.vaadin.flow.server.VaadinService;
import com.vaadin.flow.server.VaadinServiceInitListener;
import com.vaadin.samples.authentication.AccessControl;
import com.vaadin.samples.authentication.LoginScreen;
import com.vaadin.samples.backend.WebSession;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.CDI;
import javax.inject.Inject;

/**
 * This class is used to listen to BeforeEnter event of all UIs in order to
 * check whether a user is signed in or not before allowing entering any page.
 * It is registered in a file named
 * com.vaadin.flow.server.VaadinServiceInitListener in META-INF/services.
 */
public class TestInitListener implements VaadinServiceInitListener {

    @Override
    public void serviceInit(ServiceInitEvent serviceInitEvent) {
        VaadinService service = serviceInitEvent.getSource();

        WebSession webSession = CDI.current().select(WebSession.class).get();

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println(webSession.getFoo());
    }

}
