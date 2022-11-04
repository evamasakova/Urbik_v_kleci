package com.company;

import com.company.entities.Player;
import com.company.entities.Race;

import java.util.Locale;

public class Game {

    private final String gameName = "Urbikova cesta klecí";
    private final double version = 0.1;
    private final String author = "Masakova Jr.";
    private Dialog dialog;
    private Player player;

    public Game() {
        dialog = new Dialog();
        player = new Player();
    }

    public void start() {
        dialog.welcome(gameName, version, author);
        welcomeMenu();
        storyIntro();
    }

    private void welcomeMenu() {
        dialog.say("Vitej v poklidnem mestecku. V mestecku bydli tisice lidi. Je cas na vyber tve postavy! ");
        dialog.say("Zvol si svoji rasu.", "red");
        for (Race value : Race.values()) {
            dialog.say(value.toString(), "red");
        }
        selectRace();
    }

    private void selectRace() {
        String userInput = dialog.userInput();
        boolean check = false;
        for (Race value : Race.values()) {
            if (userInput.trim().equalsIgnoreCase(value.toString())){
                check = true;
                player.setRace(value);
                break;
            }
        }
        if(!check){
            selectRace();
            return;
        }

    }

    private void storyIntro(){
        dialog.say("zvolil sis " + player.getRace(), "red");
        dialog.say("-----------------------------", "white");
        dialog.say("Hra začíná", "white");
        dialog.say("-----------------------------");
        dialog.say("Hey. You! You're finally awake. Vítej v kleci, sumo zápasníku. ", "red");

    }


}
