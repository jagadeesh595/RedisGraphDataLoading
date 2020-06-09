package com.ns.dataloading.repository;

import com.ns.dataloading.entity.Bor999WkVital5Promo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Qualifier("Bor999WkVital5")
@Repository
public interface Bor999WkVital5PromoRepositorymysql extends JpaRepository<Bor999WkVital5Promo,Long> {
}
