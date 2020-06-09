package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "EMWCCP_WorldWideCC")
public class EmwccpWorldWideCc {
    private Long id;
    private Long ewctycCountryCode;
    private Long ewdidDistributorId;
    private Integer ewpyrProcessingYear;
    private Integer ewpmoProcessingMonth;
    private String ewcntyIsoCountryCode;
    private String ewnwmgNewRecMgrFlag;
    private Integer ewbrkyrBreakYear;
    private Integer ewbrkmoBreakMonth;
    private BigDecimal ewtlccYtdTotalCc;
    private BigDecimal ewnwemYtdNewNmcCorEm;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "EWCTYC_CountryCode", nullable = true)
    public Long getEwctycCountryCode() {
        return ewctycCountryCode;
    }

    public void setEwctycCountryCode(Long ewctycCountryCode) {
        this.ewctycCountryCode = ewctycCountryCode;
    }

    @Basic
    @Column(name = "EWDID_DistributorId", nullable = true)
    public Long getEwdidDistributorId() {
        return ewdidDistributorId;
    }

    public void setEwdidDistributorId(Long ewdidDistributorId) {
        this.ewdidDistributorId = ewdidDistributorId;
    }

    @Basic
    @Column(name = "EWPYR_ProcessingYear", nullable = true)
    public Integer getEwpyrProcessingYear() {
        return ewpyrProcessingYear;
    }

    public void setEwpyrProcessingYear(Integer ewpyrProcessingYear) {
        this.ewpyrProcessingYear = ewpyrProcessingYear;
    }

    @Basic
    @Column(name = "EWPMO_ProcessingMonth", nullable = true)
    public Integer getEwpmoProcessingMonth() {
        return ewpmoProcessingMonth;
    }

    public void setEwpmoProcessingMonth(Integer ewpmoProcessingMonth) {
        this.ewpmoProcessingMonth = ewpmoProcessingMonth;
    }

    @Basic
    @Column(name = "EWCNTY_ISOCountryCode", nullable = true, length = 15)
    public String getEwcntyIsoCountryCode() {
        return ewcntyIsoCountryCode;
    }

    public void setEwcntyIsoCountryCode(String ewcntyIsoCountryCode) {
        this.ewcntyIsoCountryCode = ewcntyIsoCountryCode;
    }

    @Basic
    @Column(name = "EWNWMG_NewRecMgrFlag", nullable = true, length = 1)
    public String getEwnwmgNewRecMgrFlag() {
        return ewnwmgNewRecMgrFlag;
    }

    public void setEwnwmgNewRecMgrFlag(String ewnwmgNewRecMgrFlag) {
        this.ewnwmgNewRecMgrFlag = ewnwmgNewRecMgrFlag;
    }

    @Basic
    @Column(name = "EWBRKYR_BreakYear", nullable = true)
    public Integer getEwbrkyrBreakYear() {
        return ewbrkyrBreakYear;
    }

    public void setEwbrkyrBreakYear(Integer ewbrkyrBreakYear) {
        this.ewbrkyrBreakYear = ewbrkyrBreakYear;
    }

    @Basic
    @Column(name = "EWBRKMO_BreakMonth", nullable = true)
    public Integer getEwbrkmoBreakMonth() {
        return ewbrkmoBreakMonth;
    }

    public void setEwbrkmoBreakMonth(Integer ewbrkmoBreakMonth) {
        this.ewbrkmoBreakMonth = ewbrkmoBreakMonth;
    }

    @Basic
    @Column(name = "EWTLCC_YTDTotalCC", nullable = true, precision = 3)
    public BigDecimal getEwtlccYtdTotalCc() {
        return ewtlccYtdTotalCc;
    }

    public void setEwtlccYtdTotalCc(BigDecimal ewtlccYtdTotalCc) {
        this.ewtlccYtdTotalCc = ewtlccYtdTotalCc;
    }

    @Basic
    @Column(name = "EWNWEM_YTDNewNMCCorEM", nullable = true, precision = 3)
    public BigDecimal getEwnwemYtdNewNmcCorEm() {
        return ewnwemYtdNewNmcCorEm;
    }

    public void setEwnwemYtdNewNmcCorEm(BigDecimal ewnwemYtdNewNmcCorEm) {
        this.ewnwemYtdNewNmcCorEm = ewnwemYtdNewNmcCorEm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmwccpWorldWideCc that = (EmwccpWorldWideCc) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ewctycCountryCode != null ? !ewctycCountryCode.equals(that.ewctycCountryCode) : that.ewctycCountryCode != null)
            return false;
        if (ewdidDistributorId != null ? !ewdidDistributorId.equals(that.ewdidDistributorId) : that.ewdidDistributorId != null)
            return false;
        if (ewpyrProcessingYear != null ? !ewpyrProcessingYear.equals(that.ewpyrProcessingYear) : that.ewpyrProcessingYear != null)
            return false;
        if (ewpmoProcessingMonth != null ? !ewpmoProcessingMonth.equals(that.ewpmoProcessingMonth) : that.ewpmoProcessingMonth != null)
            return false;
        if (ewcntyIsoCountryCode != null ? !ewcntyIsoCountryCode.equals(that.ewcntyIsoCountryCode) : that.ewcntyIsoCountryCode != null)
            return false;
        if (ewnwmgNewRecMgrFlag != null ? !ewnwmgNewRecMgrFlag.equals(that.ewnwmgNewRecMgrFlag) : that.ewnwmgNewRecMgrFlag != null)
            return false;
        if (ewbrkyrBreakYear != null ? !ewbrkyrBreakYear.equals(that.ewbrkyrBreakYear) : that.ewbrkyrBreakYear != null)
            return false;
        if (ewbrkmoBreakMonth != null ? !ewbrkmoBreakMonth.equals(that.ewbrkmoBreakMonth) : that.ewbrkmoBreakMonth != null)
            return false;
        if (ewtlccYtdTotalCc != null ? !ewtlccYtdTotalCc.equals(that.ewtlccYtdTotalCc) : that.ewtlccYtdTotalCc != null)
            return false;
        if (ewnwemYtdNewNmcCorEm != null ? !ewnwemYtdNewNmcCorEm.equals(that.ewnwemYtdNewNmcCorEm) : that.ewnwemYtdNewNmcCorEm != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ewctycCountryCode != null ? ewctycCountryCode.hashCode() : 0);
        result = 31 * result + (ewdidDistributorId != null ? ewdidDistributorId.hashCode() : 0);
        result = 31 * result + (ewpyrProcessingYear != null ? ewpyrProcessingYear.hashCode() : 0);
        result = 31 * result + (ewpmoProcessingMonth != null ? ewpmoProcessingMonth.hashCode() : 0);
        result = 31 * result + (ewcntyIsoCountryCode != null ? ewcntyIsoCountryCode.hashCode() : 0);
        result = 31 * result + (ewnwmgNewRecMgrFlag != null ? ewnwmgNewRecMgrFlag.hashCode() : 0);
        result = 31 * result + (ewbrkyrBreakYear != null ? ewbrkyrBreakYear.hashCode() : 0);
        result = 31 * result + (ewbrkmoBreakMonth != null ? ewbrkmoBreakMonth.hashCode() : 0);
        result = 31 * result + (ewtlccYtdTotalCc != null ? ewtlccYtdTotalCc.hashCode() : 0);
        result = 31 * result + (ewnwemYtdNewNmcCorEm != null ? ewnwemYtdNewNmcCorEm.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"EmwccpWorldWideCc\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"ewctycCountryCode\":\"" + ewctycCountryCode + "\""
                + ",                         \"ewdidDistributorId\":\"" + ewdidDistributorId + "\""
                + ",                         \"ewpyrProcessingYear\":\"" + ewpyrProcessingYear + "\""
                + ",                         \"ewpmoProcessingMonth\":\"" + ewpmoProcessingMonth + "\""
                + ",                         \"ewcntyIsoCountryCode\":\"" + ewcntyIsoCountryCode + "\""
                + ",                         \"ewnwmgNewRecMgrFlag\":\"" + ewnwmgNewRecMgrFlag + "\""
                + ",                         \"ewbrkyrBreakYear\":\"" + ewbrkyrBreakYear + "\""
                + ",                         \"ewbrkmoBreakMonth\":\"" + ewbrkmoBreakMonth + "\""
                + ",                         \"ewtlccYtdTotalCc\":\"" + ewtlccYtdTotalCc + "\""
                + ",                         \"ewnwemYtdNewNmcCorEm\":\"" + ewnwemYtdNewNmcCorEm + "\""
                + "}}";
    }
}
