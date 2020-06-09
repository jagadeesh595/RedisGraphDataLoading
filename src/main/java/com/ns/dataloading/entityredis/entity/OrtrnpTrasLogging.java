package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.*;
import java.io.Serializable;

@RedisHash("ORTRNP_TrasLogging")
public class OrtrnpTrasLogging implements Serializable {
    private Long id;
    private String ptopcyOperatingCountry;
    private String ptcmpyCompanyCode;
    private String pttrcdTransCode;
    private Long pttrnTrans;

    @Id
    // @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "PTOPCY_OperatingCountry", nullable = true, length = 15)
    public String getPtopcyOperatingCountry() {
        return ptopcyOperatingCountry;
    }

    public void setPtopcyOperatingCountry(String ptopcyOperatingCountry) {
        this.ptopcyOperatingCountry = ptopcyOperatingCountry;
    }

    // @Basic
    // @Column(name = "PTCMPY_CompanyCode", nullable = true, length = 15)
    public String getPtcmpyCompanyCode() {
        return ptcmpyCompanyCode;
    }

    public void setPtcmpyCompanyCode(String ptcmpyCompanyCode) {
        this.ptcmpyCompanyCode = ptcmpyCompanyCode;
    }

    // @Basic
    // @Column(name = "PTTRCD_TransCode", nullable = true, length = 15)
    public String getPttrcdTransCode() {
        return pttrcdTransCode;
    }

    public void setPttrcdTransCode(String pttrcdTransCode) {
        this.pttrcdTransCode = pttrcdTransCode;
    }

    // @Basic
    // @Column(name = "PTTRN_Trans", nullable = true)
    public Long getPttrnTrans() {
        return pttrnTrans;
    }

    public void setPttrnTrans(Long pttrnTrans) {
        this.pttrnTrans = pttrnTrans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrtrnpTrasLogging that = (OrtrnpTrasLogging) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ptopcyOperatingCountry != null ? !ptopcyOperatingCountry.equals(that.ptopcyOperatingCountry) : that.ptopcyOperatingCountry != null)
            return false;
        if (ptcmpyCompanyCode != null ? !ptcmpyCompanyCode.equals(that.ptcmpyCompanyCode) : that.ptcmpyCompanyCode != null)
            return false;
        if (pttrcdTransCode != null ? !pttrcdTransCode.equals(that.pttrcdTransCode) : that.pttrcdTransCode != null)
            return false;
        if (pttrnTrans != null ? !pttrnTrans.equals(that.pttrnTrans) : that.pttrnTrans != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ptopcyOperatingCountry != null ? ptopcyOperatingCountry.hashCode() : 0);
        result = 31 * result + (ptcmpyCompanyCode != null ? ptcmpyCompanyCode.hashCode() : 0);
        result = 31 * result + (pttrcdTransCode != null ? pttrcdTransCode.hashCode() : 0);
        result = 31 * result + (pttrnTrans != null ? pttrnTrans.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"OrtrnpTrasLogging\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"ptopcyOperatingCountry\":\"" + ptopcyOperatingCountry + "\""
                + ",                         \"ptcmpyCompanyCode\":\"" + ptcmpyCompanyCode + "\""
                + ",                         \"pttrcdTransCode\":\"" + pttrcdTransCode + "\""
                + ",                         \"pttrnTrans\":\"" + pttrnTrans + "\""
                + "}}";
    }
}
