package com.sistema.examenes.servicios;

import com.sistema.examenes.entidades.Categoria;

import java.util.Set;

public interface CategoriaService {

    Categoria agregarCategoria(Categoria categoria);
    Categoria actualizarCategoria(Categoria categoria);
    Set<Categoria> ObtenerCategorias();
    Categoria obtenerCategoria(Long categoriaId);
    void eliminarCategoria(Long categoriaId);
}
