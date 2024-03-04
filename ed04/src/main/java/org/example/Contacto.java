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

    /**
     * Este metodo consta de dos parametros y en uno de ellos hay un ArrayList para recorrer en su caso los numeros de telefono
     * @param name String que almacena el nombre del contacto
     * @param phone String recibe los numeros de contacto
     *
     */
    public Contacto(String name, String phone) {
        this.setName(name);
        this.setPhones(new ArrayList<>());
        this.getPhones().add(phone);
    }

    /**
     *
     * @return devuelve el nombre del contacto
     */
    public String getName() {
        return this.name;
    }


    /**
     *
     * @return devuelve una lista de numeros(String) de contactos
     */
    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}