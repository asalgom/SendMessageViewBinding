package com.example.ViewBinding.data;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.Objects;

/**@author Antonio Salado
 * Clase person que recoge informacion de una persona
 */
public class Person implements Serializable, Parcelable {

    public static final String KEY = "Person";
    private String Name;
    private String SudName;
    private String nif;

    public Person() {
    }

    public Person(String name, String sudName, String nif) {
        Name = name;
        SudName = sudName;
        this.nif = nif;
    }



    //region getsetter y setter de los atributos
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSudName() {
        return SudName;
    }

    public void setSudName(String sudName) {
        SudName = sudName;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    //endregion

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", SudName='" + SudName + '\'' +
                ", nif='" + nif + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;//doucasting  isInstansOf()
        return Objects.equals(nif, person.nif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif);
    }


    protected Person(Parcel in) {
        Name = in.readString();
        SudName = in.readString();
        nif = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(Name);
        parcel.writeString(SudName);
        parcel.writeString(nif);
    }
}
