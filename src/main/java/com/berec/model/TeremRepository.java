package com.berec.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeremRepository  extends JpaRepository<Terem, Integer>{

}
