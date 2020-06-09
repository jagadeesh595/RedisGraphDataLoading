package com.ns.dataloading.repository;

import com.ns.dataloading.entity.DspwvpWaiver;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Qualifier("Dspwvp")
@Repository
public interface DspwvpWaiverRepositorymysql extends JpaRepository<DspwvpWaiver,Long> {
}
