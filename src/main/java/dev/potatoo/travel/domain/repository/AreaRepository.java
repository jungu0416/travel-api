package dev.potatoo.travel.domain.repository;

import dev.potatoo.travel.domain.core.Area;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaRepository extends JpaRepository<Area, Long> {

}
