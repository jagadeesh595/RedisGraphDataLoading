package com.ns.dataloading.repository;

import com.ns.dataloading.entity.RunConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Runconfigmysql extends JpaRepository<RunConfig,Long> {
}
