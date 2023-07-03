package dev.potatoo.travel.domain.core;

import dev.potatoo.travel.area.request.ApiRequest;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Area {

    @Id
    private String location;

    private String area;

    //private String insertDate;
    //private String modifiedDate;

    public void insertArea(ApiRequest apiRequest) {
        this.location = apiRequest.getLocation();
        this.area = "Y";
    }

    public void updateArea(ApiRequest apiRequest) {
        this.location = apiRequest.getLocation();
        this.area = "N";
    }


}
