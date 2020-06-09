package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("CBWCCP_WorldWideCC")
public class CbwccpWorldWideCc implements Serializable {
    private  Long id;
    private @Indexed
    Long bwctycCountryCode;
    private @Indexed Long bwdidDistributorId;
    private @Indexed Integer bwpyrProcessingYear;
    private @Indexed Integer bwpmoProcessingMonth;
    private @Indexed String bwcntyIsoCountryCode;
    private @Indexed String bwnwmgNewRecMgrFlag;
    private @Indexed Integer bwbrkyrBreakYear;
    private @Indexed Integer bwbrkmoBreakMonth;
    private @Indexed BigDecimal bwtlccYtdTotalCc;
    private @Indexed BigDecimal bwpnccYtdPerOrNmCc;
    private @Indexed BigDecimal bwnwpsYtdNewNmCCorCb;
    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "BWCTYC_CountryCode", nullable = true)
    public Long getBwctycCountryCode() {
        return bwctycCountryCode;
    }

    public void setBwctycCountryCode(Long bwctycCountryCode) {
        this.bwctycCountryCode = bwctycCountryCode;
    }

    // @Basic
    // @Column(name = "BWDID_DistributorId", nullable = true)
    public Long getBwdidDistributorId() {
        return bwdidDistributorId;
    }

    public void setBwdidDistributorId(Long bwdidDistributorId) {
        this.bwdidDistributorId = bwdidDistributorId;
    }

    // @Basic
    // @Column(name = "BWPYR_ProcessingYear", nullable = true)
    public Integer getBwpyrProcessingYear() {
        return bwpyrProcessingYear;
    }

    public void setBwpyrProcessingYear(Integer bwpyrProcessingYear) {
        this.bwpyrProcessingYear = bwpyrProcessingYear;
    }

    // @Basic
    // @Column(name = "BWPMO_ProcessingMonth", nullable = true)
    public Integer getBwpmoProcessingMonth() {
        return bwpmoProcessingMonth;
    }

    public void setBwpmoProcessingMonth(Integer bwpmoProcessingMonth) {
        this.bwpmoProcessingMonth = bwpmoProcessingMonth;
    }

    // @Basic
    // @Column(name = "BWCNTY_ISOCountryCode", nullable = true, length = 15)
    public String getBwcntyIsoCountryCode() {
        return bwcntyIsoCountryCode;
    }

    public void setBwcntyIsoCountryCode(String bwcntyIsoCountryCode) {
        this.bwcntyIsoCountryCode = bwcntyIsoCountryCode;
    }

    // @Basic
    // @Column(name = "BWNWMG_NewRecMgrFlag", nullable = true, length = 1)
    public String getBwnwmgNewRecMgrFlag() {
        return bwnwmgNewRecMgrFlag;
    }

    public void setBwnwmgNewRecMgrFlag(String bwnwmgNewRecMgrFlag) {
        this.bwnwmgNewRecMgrFlag = bwnwmgNewRecMgrFlag;
    }

    // @Basic
    // @Column(name = "BWBRKYR_BreakYear", nullable = true)
    public Integer getBwbrkyrBreakYear() {
        return bwbrkyrBreakYear;
    }

    public void setBwbrkyrBreakYear(Integer bwbrkyrBreakYear) {
        this.bwbrkyrBreakYear = bwbrkyrBreakYear;
    }

    // @Basic
    // @Column(name = "BWBRKMO_BreakMonth", nullable = true)
    public Integer getBwbrkmoBreakMonth() {
        return bwbrkmoBreakMonth;
    }

    public void setBwbrkmoBreakMonth(Integer bwbrkmoBreakMonth) {
        this.bwbrkmoBreakMonth = bwbrkmoBreakMonth;
    }

    // @Basic
    // @Column(name = "BWTLCC_YTDTotalCC", nullable = true, precision = 3)
    public BigDecimal getBwtlccYtdTotalCc() {
        return bwtlccYtdTotalCc;
    }

    public void setBwtlccYtdTotalCc(BigDecimal bwtlccYtdTotalCc) {
        this.bwtlccYtdTotalCc = bwtlccYtdTotalCc;
    }

    // @Basic
    // @Column(name = "BWPNCC_YTDPerOrNmCC", nullable = true, precision = 3)
    public BigDecimal getBwpnccYtdPerOrNmCc() {
        return bwpnccYtdPerOrNmCc;
    }

    public void setBwpnccYtdPerOrNmCc(BigDecimal bwpnccYtdPerOrNmCc) {
        this.bwpnccYtdPerOrNmCc = bwpnccYtdPerOrNmCc;
    }

    // @Basic
    // @Column(name = "BWNWPS_YTDNewNmCCorCB", nullable = true, precision = 3)
    public BigDecimal getBwnwpsYtdNewNmCCorCb() {
        return bwnwpsYtdNewNmCCorCb;
    }

    public void setBwnwpsYtdNewNmCCorCb(BigDecimal bwnwpsYtdNewNmCCorCb) {
        this.bwnwpsYtdNewNmCCorCb = bwnwpsYtdNewNmCCorCb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbwccpWorldWideCc that = (CbwccpWorldWideCc) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bwctycCountryCode != null ? !bwctycCountryCode.equals(that.bwctycCountryCode) : that.bwctycCountryCode != null)
            return false;
        if (bwdidDistributorId != null ? !bwdidDistributorId.equals(that.bwdidDistributorId) : that.bwdidDistributorId != null)
            return false;
        if (bwpyrProcessingYear != null ? !bwpyrProcessingYear.equals(that.bwpyrProcessingYear) : that.bwpyrProcessingYear != null)
            return false;
        if (bwpmoProcessingMonth != null ? !bwpmoProcessingMonth.equals(that.bwpmoProcessingMonth) : that.bwpmoProcessingMonth != null)
            return false;
        if (bwcntyIsoCountryCode != null ? !bwcntyIsoCountryCode.equals(that.bwcntyIsoCountryCode) : that.bwcntyIsoCountryCode != null)
            return false;
        if (bwnwmgNewRecMgrFlag != null ? !bwnwmgNewRecMgrFlag.equals(that.bwnwmgNewRecMgrFlag) : that.bwnwmgNewRecMgrFlag != null)
            return false;
        if (bwbrkyrBreakYear != null ? !bwbrkyrBreakYear.equals(that.bwbrkyrBreakYear) : that.bwbrkyrBreakYear != null)
            return false;
        if (bwbrkmoBreakMonth != null ? !bwbrkmoBreakMonth.equals(that.bwbrkmoBreakMonth) : that.bwbrkmoBreakMonth != null)
            return false;
        if (bwtlccYtdTotalCc != null ? !bwtlccYtdTotalCc.equals(that.bwtlccYtdTotalCc) : that.bwtlccYtdTotalCc != null)
            return false;
        if (bwpnccYtdPerOrNmCc != null ? !bwpnccYtdPerOrNmCc.equals(that.bwpnccYtdPerOrNmCc) : that.bwpnccYtdPerOrNmCc != null)
            return false;
        if (bwnwpsYtdNewNmCCorCb != null ? !bwnwpsYtdNewNmCCorCb.equals(that.bwnwpsYtdNewNmCCorCb) : that.bwnwpsYtdNewNmCCorCb != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bwctycCountryCode != null ? bwctycCountryCode.hashCode() : 0);
        result = 31 * result + (bwdidDistributorId != null ? bwdidDistributorId.hashCode() : 0);
        result = 31 * result + (bwpyrProcessingYear != null ? bwpyrProcessingYear.hashCode() : 0);
        result = 31 * result + (bwpmoProcessingMonth != null ? bwpmoProcessingMonth.hashCode() : 0);
        result = 31 * result + (bwcntyIsoCountryCode != null ? bwcntyIsoCountryCode.hashCode() : 0);
        result = 31 * result + (bwnwmgNewRecMgrFlag != null ? bwnwmgNewRecMgrFlag.hashCode() : 0);
        result = 31 * result + (bwbrkyrBreakYear != null ? bwbrkyrBreakYear.hashCode() : 0);
        result = 31 * result + (bwbrkmoBreakMonth != null ? bwbrkmoBreakMonth.hashCode() : 0);
        result = 31 * result + (bwtlccYtdTotalCc != null ? bwtlccYtdTotalCc.hashCode() : 0);
        result = 31 * result + (bwpnccYtdPerOrNmCc != null ? bwpnccYtdPerOrNmCc.hashCode() : 0);
        result = 31 * result + (bwnwpsYtdNewNmCCorCb != null ? bwnwpsYtdNewNmCCorCb.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"CbwccpWorldWideCc\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bwctycCountryCode\":\"" + bwctycCountryCode + "\""
                + ",                         \"bwdidDistributorId\":\"" + bwdidDistributorId + "\""
                + ",                         \"bwpyrProcessingYear\":\"" + bwpyrProcessingYear + "\""
                + ",                         \"bwpmoProcessingMonth\":\"" + bwpmoProcessingMonth + "\""
                + ",                         \"bwcntyIsoCountryCode\":\"" + bwcntyIsoCountryCode + "\""
                + ",                         \"bwnwmgNewRecMgrFlag\":\"" + bwnwmgNewRecMgrFlag + "\""
                + ",                         \"bwbrkyrBreakYear\":\"" + bwbrkyrBreakYear + "\""
                + ",                         \"bwbrkmoBreakMonth\":\"" + bwbrkmoBreakMonth + "\""
                + ",                         \"bwtlccYtdTotalCc\":\"" + bwtlccYtdTotalCc + "\""
                + ",                         \"bwpnccYtdPerOrNmCc\":\"" + bwpnccYtdPerOrNmCc + "\""
                + ",                         \"bwnwpsYtdNewNmCCorCb\":\"" + bwnwpsYtdNewNmCCorCb + "\""
                + "}}";
    }
}
