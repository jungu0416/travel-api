package dev.potatoo.travel.domain.repository;

import dev.potatoo.travel.domain.core.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {

    List<Area> findAllByArea(String y);

    Area findByLocation(String location);
}
