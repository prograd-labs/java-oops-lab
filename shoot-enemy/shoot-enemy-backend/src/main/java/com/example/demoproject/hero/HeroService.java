package com.example.demoproject.hero;

import org.springframework.stereotype.Service;

@Service
public class HeroService {
    private int health = 100;
    public int returnHealth() {
        return getHealth();
    }

    public void shotByGunOne() {
        if(health<=0){
            this.health = 100;
        }
        else {
            this.health -= 30;
        }
    }

    public void shotByGunTwo() {
        if(health<=0){
            this.health = 100;
        }
        else {
            this.health -= 50;
        }
    }

    public void getHealed() {

        this.health+=50;
        if(health>=100){
            this.health = 100;
        }

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
