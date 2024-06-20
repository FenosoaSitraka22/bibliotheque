package org.biblo.web;

import lombok.AllArgsConstructor;
import org.biblo.dtos.LivreDto;
import org.biblo.services.LivreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
public class LivreController {
    private LivreService livreService;

    //CREATE
    @PostMapping("/livres")
    public  LivreDto saveLivre(@RequestBody LivreDto livreDto){
        return livreService.insertLivre(livreDto);
    }
    //READ
    @RequestMapping("/livres")
    public List<LivreDto> livres(){
        return  livreService.getLivres();
    }
    //READ
    @GetMapping("/livres/{idLivre}")
    public  LivreDto getLivre(@PathVariable(name="idLivre")Long id){
        return  livreService.getLivre(id);
    }
    //UPDATE
    @PutMapping("/livres/{idLivre}")
    public  LivreDto updateLivre(@PathVariable(name = "idLivre")Long id, @RequestBody LivreDto livreDto){
        livreDto.setIdLivre(id);
        return  livreService.updateLivre(livreDto);
    }
    //DELETE
    @DeleteMapping("/livres/{idLivre}")
    public void deleteLivre(@PathVariable(name = "idLivre")Long id){
        livreService.deleteLivre(id);
    }
}
