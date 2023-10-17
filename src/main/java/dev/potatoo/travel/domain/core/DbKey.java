package dev.potatoo.travel.domain.core;

import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Table(name = "DBKEY")
@EntityListeners(AuditingEntityListener.class)
public class DbKey {
    @Id
    String dbKey;

}
