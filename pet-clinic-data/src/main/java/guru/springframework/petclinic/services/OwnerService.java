package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
    
}
