package fr.toto.controller;

import java.util.ArrayList;

public abstract class AbstractControleur {

    protected Object data;

    public AbstractControleur (Object data) {
        this.data = data;
    }

    public abstract void control(ArrayList<String> arrayList);
}
