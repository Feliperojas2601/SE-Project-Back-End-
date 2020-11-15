package com.javalimos.CronosUN.repositorio;

import com.javalimos.CronosUN.modelo.HorarioInscripcion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioInscripcionRepository extends CrudRepository<HorarioInscripcion, Integer> {

}