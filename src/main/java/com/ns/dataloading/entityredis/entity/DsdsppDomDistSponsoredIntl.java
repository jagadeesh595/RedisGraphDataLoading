package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("DSDSPP_DomDistSponsoredIntl")
public class DsdsppDomDistSponsoredIntl implements Serializable {
    private Long id;
    private String dpcntyCountryCode;
    private Long dpctlDistributorControl;
    private Long dpctycDistributorCtyc;
    private Long dpdidDistributorId;
    private String dpedatEnteredDate;
    private String dpprccLoadProcessed;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "DPCNTY_CountryCode", nullable = true, length = 15)
    public String getDpcntyCountryCode() {
        return dpcntyCountryCode;
    }

    public void setDpcntyCountryCode(String dpcntyCountryCode) {
        this.dpcntyCountryCode = dpcntyCountryCode;
    }

    // @Basic
    // @Column(name = "DPCTL_DistributorControl", nullable = false)
    public Long getDpctlDistributorControl() {
        return dpctlDistributorControl;
    }

    public void setDpctlDistributorControl(Long dpctlDistributorControl) {
        this.dpctlDistributorControl = dpctlDistributorControl;
    }

    // @Basic
    // @Column(name = "DPCTYC_DistributorCtyc", nullable = true)
    public Long getDpctycDistributorCtyc() {
        return dpctycDistributorCtyc;
    }

    public void setDpctycDistributorCtyc(Long dpctycDistributorCtyc) {
        this.dpctycDistributorCtyc = dpctycDistributorCtyc;
    }

    // @Basic
    // @Column(name = "DPDID_DistributorId", nullable = true)
    public Long getDpdidDistributorId() {
        return dpdidDistributorId;
    }

    public void setDpdidDistributorId(Long dpdidDistributorId) {
        this.dpdidDistributorId = dpdidDistributorId;
    }

    // @Basic
    // @Column(name = "DPEDAT_EnteredDate", nullable = true, length = 15)
    public String getDpedatEnteredDate() {
        return dpedatEnteredDate;
    }

    public void setDpedatEnteredDate(String dpedatEnteredDate) {
        this.dpedatEnteredDate = dpedatEnteredDate;
    }

    // @Basic
    // @Column(name = "DPPRCC_LoadProcessed", nullable = true, length = 1)
    public String getDpprccLoadProcessed() {
        return dpprccLoadProcessed;
    }

    public void setDpprccLoadProcessed(String dpprccLoadProcessed) {
        this.dpprccLoadProcessed = dpprccLoadProcessed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DsdsppDomDistSponsoredIntl that = (DsdsppDomDistSponsoredIntl) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dpcntyCountryCode != null ? !dpcntyCountryCode.equals(that.dpcntyCountryCode) : that.dpcntyCountryCode != null)
            return false;
        if (dpctlDistributorControl != null ? !dpctlDistributorControl.equals(that.dpctlDistributorControl) : that.dpctlDistributorControl != null)
            return false;
        if (dpctycDistributorCtyc != null ? !dpctycDistributorCtyc.equals(that.dpctycDistributorCtyc) : that.dpctycDistributorCtyc != null)
            return false;
        if (dpdidDistributorId != null ? !dpdidDistributorId.equals(that.dpdidDistributorId) : that.dpdidDistributorId != null)
            return false;
        if (dpedatEnteredDate != null ? !dpedatEnteredDate.equals(that.dpedatEnteredDate) : that.dpedatEnteredDate != null)
            return false;
        if (dpprccLoadProcessed != null ? !dpprccLoadProcessed.equals(that.dpprccLoadProcessed) : that.dpprccLoadProcessed != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dpcntyCountryCode != null ? dpcntyCountryCode.hashCode() : 0);
        result = 31 * result + (dpctlDistributorControl != null ? dpctlDistributorControl.hashCode() : 0);
        result = 31 * result + (dpctycDistributorCtyc != null ? dpctycDistributorCtyc.hashCode() : 0);
        result = 31 * result + (dpdidDistributorId != null ? dpdidDistributorId.hashCode() : 0);
        result = 31 * result + (dpedatEnteredDate != null ? dpedatEnteredDate.hashCode() : 0);
        result = 31 * result + (dpprccLoadProcessed != null ? dpprccLoadProcessed.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DsdsppDomDistSponsoredIntl\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"dpcntyCountryCode\":\"" + dpcntyCountryCode + "\""
                + ",                         \"dpctlDistributorControl\":\"" + dpctlDistributorControl + "\""
                + ",                         \"dpctycDistributorCtyc\":\"" + dpctycDistributorCtyc + "\""
                + ",                         \"dpdidDistributorId\":\"" + dpdidDistributorId + "\""
                + ",                         \"dpedatEnteredDate\":\"" + dpedatEnteredDate + "\""
                + ",                         \"dpprccLoadProcessed\":\"" + dpprccLoadProcessed + "\""
                + "}}";
    }
}
