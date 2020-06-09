package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("EMDWXP_WWNewSupervisorList")
public class EmdwxpWwNewSupervisorList implements Serializable {
    private Long id;
    private String excntyProcessingCountry;
    private Integer expyrProcessingYear;
    private Integer expmoProcessingMonth;
    private Long exctycCountryCode;
    private Long exdidDistributorId;
    private Long exdwccDwnlnCtryCd;
    private Long exdwidDwnlnId;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "EXCNTY_ProcessingCountry", nullable = true, length = 15)
    public String getExcntyProcessingCountry() {
        return excntyProcessingCountry;
    }

    public void setExcntyProcessingCountry(String excntyProcessingCountry) {
        this.excntyProcessingCountry = excntyProcessingCountry;
    }

    // @Basic
    // @Column(name = "EXPYR_ProcessingYear", nullable = true)
    public Integer getExpyrProcessingYear() {
        return expyrProcessingYear;
    }

    public void setExpyrProcessingYear(Integer expyrProcessingYear) {
        this.expyrProcessingYear = expyrProcessingYear;
    }

    // @Basic
    // @Column(name = "EXPMO_ProcessingMonth", nullable = true)
    public Integer getExpmoProcessingMonth() {
        return expmoProcessingMonth;
    }

    public void setExpmoProcessingMonth(Integer expmoProcessingMonth) {
        this.expmoProcessingMonth = expmoProcessingMonth;
    }

    // @Basic
    // @Column(name = "EXCTYC_CountryCode", nullable = true)
    public Long getExctycCountryCode() {
        return exctycCountryCode;
    }

    public void setExctycCountryCode(Long exctycCountryCode) {
        this.exctycCountryCode = exctycCountryCode;
    }

    // @Basic
    // @Column(name = "EXDID_DistributorId", nullable = true)
    public Long getExdidDistributorId() {
        return exdidDistributorId;
    }

    public void setExdidDistributorId(Long exdidDistributorId) {
        this.exdidDistributorId = exdidDistributorId;
    }

    // @Basic
    // @Column(name = "EXDWCC_DwnlnCtryCd", nullable = true)
    public Long getExdwccDwnlnCtryCd() {
        return exdwccDwnlnCtryCd;
    }

    public void setExdwccDwnlnCtryCd(Long exdwccDwnlnCtryCd) {
        this.exdwccDwnlnCtryCd = exdwccDwnlnCtryCd;
    }

    // @Basic
    // @Column(name = "EXDWID_DwnlnId", nullable = true)
    public Long getExdwidDwnlnId() {
        return exdwidDwnlnId;
    }

    public void setExdwidDwnlnId(Long exdwidDwnlnId) {
        this.exdwidDwnlnId = exdwidDwnlnId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmdwxpWwNewSupervisorList that = (EmdwxpWwNewSupervisorList) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (excntyProcessingCountry != null ? !excntyProcessingCountry.equals(that.excntyProcessingCountry) : that.excntyProcessingCountry != null)
            return false;
        if (expyrProcessingYear != null ? !expyrProcessingYear.equals(that.expyrProcessingYear) : that.expyrProcessingYear != null)
            return false;
        if (expmoProcessingMonth != null ? !expmoProcessingMonth.equals(that.expmoProcessingMonth) : that.expmoProcessingMonth != null)
            return false;
        if (exctycCountryCode != null ? !exctycCountryCode.equals(that.exctycCountryCode) : that.exctycCountryCode != null)
            return false;
        if (exdidDistributorId != null ? !exdidDistributorId.equals(that.exdidDistributorId) : that.exdidDistributorId != null)
            return false;
        if (exdwccDwnlnCtryCd != null ? !exdwccDwnlnCtryCd.equals(that.exdwccDwnlnCtryCd) : that.exdwccDwnlnCtryCd != null)
            return false;
        if (exdwidDwnlnId != null ? !exdwidDwnlnId.equals(that.exdwidDwnlnId) : that.exdwidDwnlnId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (excntyProcessingCountry != null ? excntyProcessingCountry.hashCode() : 0);
        result = 31 * result + (expyrProcessingYear != null ? expyrProcessingYear.hashCode() : 0);
        result = 31 * result + (expmoProcessingMonth != null ? expmoProcessingMonth.hashCode() : 0);
        result = 31 * result + (exctycCountryCode != null ? exctycCountryCode.hashCode() : 0);
        result = 31 * result + (exdidDistributorId != null ? exdidDistributorId.hashCode() : 0);
        result = 31 * result + (exdwccDwnlnCtryCd != null ? exdwccDwnlnCtryCd.hashCode() : 0);
        result = 31 * result + (exdwidDwnlnId != null ? exdwidDwnlnId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"EmdwxpWwNewSupervisorList\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"excntyProcessingCountry\":\"" + excntyProcessingCountry + "\""
                + ",                         \"expyrProcessingYear\":\"" + expyrProcessingYear + "\""
                + ",                         \"expmoProcessingMonth\":\"" + expmoProcessingMonth + "\""
                + ",                         \"exctycCountryCode\":\"" + exctycCountryCode + "\""
                + ",                         \"exdidDistributorId\":\"" + exdidDistributorId + "\""
                + ",                         \"exdwccDwnlnCtryCd\":\"" + exdwccDwnlnCtryCd + "\""
                + ",                         \"exdwidDwnlnId\":\"" + exdwidDwnlnId + "\""
                + "}}";
    }
}
