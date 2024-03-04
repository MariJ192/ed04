package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase contiene dos atributos y define un contacto de agenda
 * @author 1º DAM ENTORNOS DE DESARROLLO
 * @version 1.0 04/03/2024
 */
class Contacto {
    private String name;
    private List<String> phones;

    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    public String getName() {
        return this.name;
    }

    public List<String> getPhones() {
        return this.phones;
    }
}