package org.example;

import java.util.*;

/**
 * Esta clase contiene solo un atributo, que consiste en una lista de contactos
 * @author 1º DAM ENTORNOS DE DESARROLLO
 * @version 1.0 04/03/2024
 * @see Persona
 */
public class Agenda implements IAgenda {
    private List<Persona> contacts; // Lista de Persona

    /**
     * Constructor sin parametros que muestra la lista de contactos
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Metodo para añadir un contacto a la lista,comprueba si existe para no añadirlo y si no existe se añade
     * @param name String que comprueba si el nomnbre existe en la lista
     * @param phone String que añade el numero a la lista si no existe
     */
    @Override
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Metodo para eliminar un contacto
     * @param name String que recibe para eliminar el contacto de la lista
     */
    @Override
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Metodo para modificar el numero de un contacto
     * @param name String que recibe el nombre a modificar
     * @param oldPhone String que recibe el contacto a eliminar
     * @param newPhone String que recibe el contacto a insertar
     */
    @Override
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     *
     * @return devuelve un contacto
     */
    @Override
    public List<Persona> getContacts() {
        return this.contacts;
    }
}