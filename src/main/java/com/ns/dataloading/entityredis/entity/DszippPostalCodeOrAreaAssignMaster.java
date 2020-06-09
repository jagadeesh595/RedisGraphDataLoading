package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("DSZIPP_PostalCodeOrAreaAssignMaster")
public class DszippPostalCodeOrAreaAssignMaster implements Serializable {
    private Long id;
    private String zplowcLowZipCode;
    private String zphigcHighZipCode;
    private Long zpareaArea;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "ZPLOWC_LowZipCode", nullable = true, length = 10)
    public String getZplowcLowZipCode() {
        return zplowcLowZipCode;
    }

    public void setZplowcLowZipCode(String zplowcLowZipCode) {
        this.zplowcLowZipCode = zplowcLowZipCode;
    }

    // @Basic
    // @Column(name = "ZPHIGC_HighZipCode", nullable = true, length = 10)
    public String getZphigcHighZipCode() {
        return zphigcHighZipCode;
    }

    public void setZphigcHighZipCode(String zphigcHighZipCode) {
        this.zphigcHighZipCode = zphigcHighZipCode;
    }

    // @Basic
    // @Column(name = "ZPAREA_Area", nullable = true)
    public Long getZpareaArea() {
        return zpareaArea;
    }

    public void setZpareaArea(Long zpareaArea) {
        this.zpareaArea = zpareaArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DszippPostalCodeOrAreaAssignMaster that = (DszippPostalCodeOrAreaAssignMaster) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (zplowcLowZipCode != null ? !zplowcLowZipCode.equals(that.zplowcLowZipCode) : that.zplowcLowZipCode != null)
            return false;
        if (zphigcHighZipCode != null ? !zphigcHighZipCode.equals(that.zphigcHighZipCode) : that.zphigcHighZipCode != null)
            return false;
        if (zpareaArea != null ? !zpareaArea.equals(that.zpareaArea) : that.zpareaArea != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (zplowcLowZipCode != null ? zplowcLowZipCode.hashCode() : 0);
        result = 31 * result + (zphigcHighZipCode != null ? zphigcHighZipCode.hashCode() : 0);
        result = 31 * result + (zpareaArea != null ? zpareaArea.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DszippPostalCodeOrAreaAssignMaster\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"zplowcLowZipCode\":\"" + zplowcLowZipCode + "\""
                + ",                         \"zphigcHighZipCode\":\"" + zphigcHighZipCode + "\""
                + ",                         \"zpareaArea\":\"" + zpareaArea + "\""
                + "}}";
    }
}
