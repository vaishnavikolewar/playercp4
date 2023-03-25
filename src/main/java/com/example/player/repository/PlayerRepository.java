package com.example.player.repository;

import com.example.player.model.Player;
import java.util.*;

public interface PlayerRepository{
    ArrayList<Player> getAllPlayers();

    Player getPlayerById(int playerId);

    Player addPlayer(Player player);

    Player updatePlayer(int playerId,Player player);

    void deletePlayer(int playerId);

}