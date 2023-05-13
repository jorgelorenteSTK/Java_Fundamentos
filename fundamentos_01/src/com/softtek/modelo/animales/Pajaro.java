package com.softtek.modelo.animales;

public class Pajaro extends Animal{
    @Override
    public String comer() {
        return "El pájaro come gusanos";
    }

    @Override
    public String moverse() {
        return "El pájaro vuela con sus alas";
    }
}
