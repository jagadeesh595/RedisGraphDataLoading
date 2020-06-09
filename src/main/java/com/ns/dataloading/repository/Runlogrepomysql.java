package com.ns.dataloading.repository;

import com.ns.dataloading.entity.RunLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Runlogrepomysql extends JpaRepository<RunLog,Long> {
}
