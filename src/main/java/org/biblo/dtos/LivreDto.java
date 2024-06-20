package org.biblo.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class LivreDto {
    private Long idLivre;
    private String titre;
    private  String auteur;
    private Date date;
}
