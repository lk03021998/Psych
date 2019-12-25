package com.psych.game.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.validator.constraints.URL;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "Players")
public class Player extends Auditable {

    @Setter
    @Getter
    @NotBlank
    private String name ;

    @Getter @Setter @URL
    private  String PsychFaceURL;

    @Getter @Setter @URL
    private String playerPic;

    @OneToOne
    @Getter @Setter
    private  Stats stats;

    @ManyToMany(mappedBy = "players")
    @Getter @Setter
    private List<Games> gamesList;

}
