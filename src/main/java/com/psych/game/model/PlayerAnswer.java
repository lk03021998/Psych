package com.psych.game.model;

import com.psych.game.Constants;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name= "playerAnswers")
public class PlayerAnswer extends Auditable{
    @Getter
    @Setter
    @NotBlank
    @Column(length = Constants.MAX_ANSWER_LENGTH)
    private String answer;

    @Getter @Setter @NotNull
    private Round round;

    @Getter @Setter @NotNull
    private Player player;
}
