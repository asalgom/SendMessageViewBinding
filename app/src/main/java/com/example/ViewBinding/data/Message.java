package com.example.ViewBinding.data;


/**@author Antonio Salado
 * En esta clase sera para el mensaje cual sera su remitente y su destinatario
 */
import android.text.Editable;

import java.io.Serializable;
import java.util.Objects;

public class Message implements Serializable {
    public static final Object KEY = "message";
    private int id;
    private String contenido;
    private Person sender;
    private Person addressee;

    public Message() {
    }


    public Message(int id, String contenido, Person sender, Person addressee) {
        this.id = id;
        this.contenido = String.valueOf(contenido);
        this.sender = sender;
        this.addressee = addressee;

    }

    //region get y set


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Person getAddressee() {
        return addressee;
    }

    public void setAddressee(Person addressee) {
        this.addressee = addressee;
    }


    //endregion


    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", contenido='" + contenido + '\'' +
                ", sender=" + sender +
                ", addressee=" + addressee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return id == message.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
