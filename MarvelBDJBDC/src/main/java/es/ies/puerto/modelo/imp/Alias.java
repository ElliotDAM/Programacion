package es.ies.puerto.modelo.imp;

public class Alias {
    private int id;
    private int personaje_id;
    private String alias;
    
    public Alias(int id, int personaje_id, String alias) {
        this.id = id;
        this.personaje_id = personaje_id;
        this.alias = alias;
    }

    public Alias() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonaje_id() {
        return personaje_id;
    }

    public void setPersonaje_id(int personaje_id) {
        this.personaje_id = personaje_id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alias other = (Alias) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Alias [id=" + id + ", personaje_id=" + personaje_id + ", alias=" + alias + "]";
    }

    
}
