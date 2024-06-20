package org.biblo.mapper;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.biblo.dtos.LivreDto;
import org.biblo.entities.Livre;
import org.springframework.beans.BeanUtils;
@Data @NoArgsConstructor
public class LivreMapper {

    public LivreDto fromLivre(Livre livre){
        LivreDto livreDto = new LivreDto();
        //copier les attribut de l'objet livre vers LivreDto
        BeanUtils.copyProperties(livre,livreDto);
        return  livreDto;
    }

    public Livre fromLivreDto(LivreDto livreDto){
        Livre livre = new Livre();
        BeanUtils.copyProperties(livreDto,livre);
        return  livre;
    }
}
