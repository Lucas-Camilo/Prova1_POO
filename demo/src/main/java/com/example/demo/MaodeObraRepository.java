package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaodeObraRepository extends JpaRepository<MaodeObra, Long>{
    public MaodeObra findByDescricao(String descricao);
}
