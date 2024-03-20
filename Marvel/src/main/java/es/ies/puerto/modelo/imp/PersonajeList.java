package es.ies.puerto.modelo.imp;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "personajes")
public class PersonajeList {
    
    @ElementList(inline = true)
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
