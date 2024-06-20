package org.biblo.services;

import org.biblo.dtos.LivreDto;
import org.biblo.entities.Livre;

import java.util.List;

public interface LivreService {
    LivreDto updateLivre(LivreDto livreDto);

    LivreDto insertLivre(LivreDto livreDto);

    void  deleteLivre(Long idLivre);

    List<LivreDto> getLivres();

    LivreDto getLivre(Long idLivre);
}
