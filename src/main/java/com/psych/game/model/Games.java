package com.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "games")
public class Games extends Auditable {

    @Setter
    @Getter
    @NotNull
    private int numRounds;

    @Setter
    @Getter
    private int currRound;

    @Getter
    @Setter
    @ManyToOne
    @NotNull
    private Player leader;

    @Getter
    @Setter
    @ManyToMany
    @NotNull
    private List<Player> players;

    @Setter
    @Getter
    private Game_Status game_status = Game_Status.JOINING;

    @Setter
    @Getter
    @NotNull
    private Game_mode game_mode;

    @Getter
    @Setter
    @ManyToMany
    private Map<Player, Stats> playerStats;

    @Setter
    @Getter
    @OneToMany(mappedBy = "game")
    private List<Round> rounds;
}
