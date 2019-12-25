package com.psych.game.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "questions")
public class Question extends Auditable{
    @Setter
    @Getter
    @NotBlank
    private String  questionText;

    @Setter
    @Getter
    @NotBlank
    private String correctAnswer;

    @Setter
    @Getter
    @NotNull
    private Game_mode gameMode ;

    @OneToMany(mappedBy = "question")
    @Getter @Setter
    private List<EllenAnswer> EllenAnswers;
}
