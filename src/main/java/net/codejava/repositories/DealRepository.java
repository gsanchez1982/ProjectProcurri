package net.codejava.repositories;

import net.codejava.entity.Deals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DealRepository extends JpaRepository<Deals, Long> {

}
