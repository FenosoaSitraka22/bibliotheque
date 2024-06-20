package org.biblo.services;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.biblo.dtos.LivreDto;
import org.biblo.entities.Livre;
import org.biblo.mapper.LivreMapper;
import org.biblo.repositories.LivreRepositories;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Data @AllArgsConstructor
@NoArgsConstructor
public class LivreServiceImpl implements LivreService{
    private LivreRepositories livreRepositories;
    private LivreMapper livreMapper;


    @Override
    public LivreDto updateLivre(LivreDto livreDto) {
        livreRepositories.save(livreMapper.fromLivreDto(livreDto));
        return livreDto;
    }

    @Override
    public LivreDto insertLivre(LivreDto livreDto) {
        livreRepositories.save(livreMapper.fromLivreDto(livreDto));

        return livreDto;
    }

    @Override
    public void deleteLivre(Long idLivre) {
        livreRepositories.deleteById(idLivre);
    }

    @Override
    public List<LivreDto> getLivres() {
        List<LivreDto>  listLivresDto = new ArrayList<>();
        livreRepositories.findAll().forEach(livre -> {
            listLivresDto.add(livreMapper.fromLivre(livre));
        });

        return listLivresDto;
    }

    @Override
    public LivreDto getLivre(Long idLivre) {
        return livreMapper.fromLivre(livreRepositories.getLivreById(idLivre));
    }
}
