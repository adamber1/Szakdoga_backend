package com.berec.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VetitesService {

    @Autowired
    private VetitesRepository vetitesRepo;

    public List<Vetites> listAll() {
        return vetitesRepo.findAll();
    }

    public void save(Vetites vetites) {
        vetitesRepo.save(vetites);
    }

    public Vetites get(Integer id) {
        return vetitesRepo.findById(id).get();
    }

    public void delete(Integer id) {
        vetitesRepo.deleteById(id);
    }
}