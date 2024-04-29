package es.ies.puerto.mapper;

import es.ies.puerto.intercambio.PersonajeInt;
import es.ies.puerto.modelo.db.entidades.Personaje;

public class MapperPersonaje {
    
    public static Personaje personajeIntToPersonajeEntity(PersonajeInt personajeInt){
        Personaje personaje = null;
        if(personajeInt == null){
            return null;
        }
        personaje = new Personaje();
        personaje.setId(personajeInt.getId());
        personaje.setAlias(MapperAlias.aliasIntToAliasEntity(personajeInt.getAliasInt()));
        return personaje;
    }

    public static PersonajeInt personajeEntityToPersonajeInt(Personaje personaje){
        PersonajeInt personajeInt = null;
        if(personaje == null){
            return null;
        }
        personajeInt = new PersonajeInt();
        personajeInt.setId(personaje.getId());
        personajeInt.setAliasInt(MapperAlias.aliasEntityToAliasInt(personaje.getAlias()));
        return personajeInt;
    }

    
}
