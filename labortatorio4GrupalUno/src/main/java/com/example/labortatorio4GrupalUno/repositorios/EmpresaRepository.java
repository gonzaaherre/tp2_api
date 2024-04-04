package com.example.labortatorio4GrupalUno.repositorios;

import com.example.labortatorio4GrupalUno.Entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    @Query("SELECT e FROM Empresa e WHERE LOWER(e.denominacion) LIKE %:param% OR LOWER(e.telefono) LIKE %:param% OR LOWER(e.horarioAtencion) LIKE %:param% OR LOWER(e.quienesSomos) LIKE %:param% OR CAST(e.latitud AS string) LIKE %:param% OR CAST(e.longitud AS string) LIKE %:param% OR LOWER(e.domicilio) LIKE %:param% OR LOWER(e.email) LIKE %:param%")
    public List<Empresa> buscador(String param);
}
