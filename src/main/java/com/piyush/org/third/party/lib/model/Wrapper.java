package com.piyush.org.third.party.lib.model;

import javax.xml.bind.annotation.XmlAnyElement;
import java.util.ArrayList;
import java.util.List;

public class Wrapper<T> {

    private List<T> items;

    public Wrapper() {
        items = new ArrayList<T>();
    }

    public Wrapper(List<T> items) {
        this.items = items;
    }

    @XmlAnyElement(lax=true)
    public List<T> getItems() {
        return items;
    }
}
