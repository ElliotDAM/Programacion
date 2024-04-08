package es.ies.puerto.modelo.imp;

import java.util.List;

public class PersonajeList {
    

    private List<Personaje> personajes;

    public PersonajeList(){}

    public PersonajeList(List<Personaje> personajes){
        this.personajes = personajes;
    }

    public List<Personaje> getPersonajes(){
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes){
        this.personajes = personajes;
    }
}
