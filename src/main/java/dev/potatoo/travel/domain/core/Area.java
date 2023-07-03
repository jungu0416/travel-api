package dev.potatoo.travel.domain.core;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Area {

    @Id
    private String location;

    private String area;

}
