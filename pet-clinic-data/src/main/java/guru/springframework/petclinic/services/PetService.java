package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet Pet);

    Set<Pet> findAll();
}
