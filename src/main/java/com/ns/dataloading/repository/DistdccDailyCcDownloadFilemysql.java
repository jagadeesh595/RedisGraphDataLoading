package com.ns.dataloading.repository;

import com.ns.dataloading.entity.DistdccDailyCcDownloadFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DistdccDailyCcDownloadFilemysql extends JpaRepository<DistdccDailyCcDownloadFile,Long> {
}
