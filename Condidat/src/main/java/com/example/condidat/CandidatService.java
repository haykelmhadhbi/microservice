package com.example.condidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidatService {

    @Autowired
    private CondidatRepository condidatRepository;

    public Condidat addCandidat(Condidat candidate) {
        return condidatRepository.save(candidate);
    }
    public Condidat updateCandidat(int id, Condidat newCandidat) {
        if (condidatRepository.findById(id).isPresent()) {
            Condidat existingCandidat = condidatRepository.findById(id).get();
            existingCandidat.setNom(newCandidat.getNom());
            existingCandidat.setPronom(newCandidat.getPronom());
            existingCandidat.setEmail(newCandidat.getEmail());
            return condidatRepository.save(existingCandidat);
        } else
            return null;
    }
    public String deleteCandidat(int id) {
        if (condidatRepository.findById(id).isPresent()) {
            condidatRepository.deleteById(id);
            return "candidat supprimé";
        } else
            return "candidat non supprimé";
    }
    }

