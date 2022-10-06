package com.example.demoproject.hero;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:3000")
@RestController
public class Controller {

    @Autowired
    private HeroService heroService;
    @Autowired
    private VillainService villainService;


    @GetMapping("/hero-health")
    public int getHeroHealth(){
        return heroService.returnHealth();
    }

    @GetMapping("/villain-health")
    public int getVillainHealth(){
        return villainService.returnHealth();
    }

    @PostMapping("/hero-weapon-one")
    public void villainShotByGunOne(){
        villainService.shotByGunOne();
    }

    @PostMapping("/hero-weapon-two")
    public void villainShotByGunTwo(){
        villainService.shotByGunTwo();
    }

    @PostMapping("/villain-weapon-one")
    public void shotByGunOne(){
        heroService.shotByGunOne();

    }

    @PostMapping("/villain-weapon-two")
    public void shotByGunTwo(){
        heroService.shotByGunTwo();

    }

    @PostMapping("/villain-heal-spell")
    public void villainHeal(){
        villainService.getHealed();
    }

    @PostMapping("/hero-heal-spell")
    public void HeroHeal(){
        heroService.getHealed();
    }

    @PostMapping("/armour")
    public void armour(){
        villainService.setArmour(true);
    }



}
