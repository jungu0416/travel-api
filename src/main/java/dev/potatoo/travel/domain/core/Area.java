package dev.potatoo.travel.domain.core;

import com.sun.istack.NotNull;
import dev.potatoo.travel.area.request.ApiRequest;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Getter
@Table(name = "area")
@EntityListeners(AuditingEntityListener.class)
public class Area {

    @Id
    private String location;

    private String area;

    @CreatedDate
    @Column(updatable = false)
    private Instant insertDate;

    @LastModifiedDate
    private Instant modifiedDate;

//    public void insertArea(ApiRequest apiRequest) {
//        this.location = apiRequest.getLocation();
//        this.area = "Y";
//    }

//    public void updateArea(ApiRequest apiRequest) {
//        this.location = apiRequest.getLocation();
//        this.area = "N";
//    }


}
