package es.jpa.hibernate.example.entities;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Poderes")
public class Poderes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "poder")
    private String poder;

    public Poderes(){}

    @ManyToMany
    private Set<Personaje> personajes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
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
        Poderes other = (Poderes) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Poderes [id=" + id + ", poder=" + poder + "]";
    }
}
