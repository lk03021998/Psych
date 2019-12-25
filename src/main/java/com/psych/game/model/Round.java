package com.psych.game.model;

import lombok.Getter;
import lombok.Setter;
import org.aspectj.weaver.patterns.TypePatternQuestions;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Map;

@Entity
@Table(name = "rounds")
public class Round extends Auditable{
    @ManyToOne
    @Getter @Setter
    private Games game;

    @ManyToOne
    @Setter
    @Getter
    private Question question;

    @Getter @Setter @NotNull
    private int roundNumber;


    @Getter @Setter @NotNull @ManyToMany
    private Map<Player, PlayerAnswer> playerPlayerAnswers;
}
