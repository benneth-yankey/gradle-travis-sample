package io.turntabl.client;

import java.util.UUID;

public abstract class Client {
    private String name;
    private final String ID = UUID.randomUUID().toString();
    private ServiceLevel serviceLevel;

    public Client(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    public Client(String name, ServiceLevel serviceLevel) {
        this(serviceLevel);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }
}

