package com.psych.game.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class Employee extends Auditable {

    @Setter
    @Getter
    @NotBlank
    private String name ;

    @Setter
    @Getter
    @NotBlank
    @Email
    private String email ;

    @Setter
    @Getter
    @NotBlank
    private String Address ;

    @Setter
    @Getter
    @NotBlank
    private String phoneNum ;
}
