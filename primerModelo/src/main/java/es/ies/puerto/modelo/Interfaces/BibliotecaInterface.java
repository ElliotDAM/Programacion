package es.ies.puerto.modelo.Interfaces;

import java.util.List;

import es.ies.puerto.modelo.entity.BibliotecaEntity;
import es.ies.puerto.modelo.entity.LibroEntity;

public interface BibliotecaInterface {
    public BibliotecaEntity buscarBiblioteca(int id);
    public BibliotecaEntity buscarBiblioteca(BibliotecaEntity bibliotecaEntity);
    public BibliotecaEntity actualizarBiblioteca(BibliotecaEntity bibliotecaEntity);
    public BibliotecaEntity eliminarBiblioteca(BibliotecaEntity bibliotecaEntity);

    public List<LibroEntity> buscarLibrosBiblioteca(BibliotecaEntity bibliotecaEntity);
}
