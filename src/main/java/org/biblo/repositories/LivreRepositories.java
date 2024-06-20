package org.biblo.repositories;

import org.biblo.entities.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepositories extends JpaRepository<Livre,Long> {
    public Livre getLivreById(Long id);
    void deleteById(Long id);
}
