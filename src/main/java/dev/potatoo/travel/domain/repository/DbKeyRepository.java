package dev.potatoo.travel.domain.repository;

import dev.potatoo.travel.domain.core.DbKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbKeyRepository extends JpaRepository<DbKey, Long> {
}
