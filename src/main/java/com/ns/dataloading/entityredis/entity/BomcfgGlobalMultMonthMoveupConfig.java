package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("BOMCFG_GlobalMultMonthMoveupConfig")
public class BomcfgGlobalMultMonthMoveupConfig implements Serializable {
    private Long id;
    private String icopcyOpCmpy;
    private BigDecimal iccthrCaseCrThreshold;
    private Integer icmnbamMaxNbActMonthsBack;
    private Integer icstryrStartYear;
    private Integer icstrmoStartMonth;
    private String icedteEntryDate;
    private String iceusrEntryUser;
    private String iccdteChangeDate;
    private String iccusrChangeUser;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "ICOPCY_OpCmpy", nullable = true, length = 15)
    public String getIcopcyOpCmpy() {
        return icopcyOpCmpy;
    }

    public void setIcopcyOpCmpy(String icopcyOpCmpy) {
        this.icopcyOpCmpy = icopcyOpCmpy;
    }

    // @Basic
    // @Column(name = "ICCTHR_CaseCrThreshold", nullable = true, precision = 3)
    public BigDecimal getIccthrCaseCrThreshold() {
        return iccthrCaseCrThreshold;
    }

    public void setIccthrCaseCrThreshold(BigDecimal iccthrCaseCrThreshold) {
        this.iccthrCaseCrThreshold = iccthrCaseCrThreshold;
    }

    // @Basic
    // @Column(name = "ICMNBAM_MaxNbActMonthsBack", nullable = true)
    public Integer getIcmnbamMaxNbActMonthsBack() {
        return icmnbamMaxNbActMonthsBack;
    }

    public void setIcmnbamMaxNbActMonthsBack(Integer icmnbamMaxNbActMonthsBack) {
        this.icmnbamMaxNbActMonthsBack = icmnbamMaxNbActMonthsBack;
    }

    // @Basic
    // @Column(name = "ICSTRYR_StartYear", nullable = true)
    public Integer getIcstryrStartYear() {
        return icstryrStartYear;
    }

    public void setIcstryrStartYear(Integer icstryrStartYear) {
        this.icstryrStartYear = icstryrStartYear;
    }

    // @Basic
    // @Column(name = "ICSTRMO_StartMonth", nullable = true)
    public Integer getIcstrmoStartMonth() {
        return icstrmoStartMonth;
    }

    public void setIcstrmoStartMonth(Integer icstrmoStartMonth) {
        this.icstrmoStartMonth = icstrmoStartMonth;
    }

    // @Basic
    // @Column(name = "ICEDTE_EntryDate", nullable = true, length = 15)
    public String getIcedteEntryDate() {
        return icedteEntryDate;
    }

    public void setIcedteEntryDate(String icedteEntryDate) {
        this.icedteEntryDate = icedteEntryDate;
    }

    // @Basic
    // @Column(name = "ICEUSR_EntryUser", nullable = true, length = 15)
    public String getIceusrEntryUser() {
        return iceusrEntryUser;
    }

    public void setIceusrEntryUser(String iceusrEntryUser) {
        this.iceusrEntryUser = iceusrEntryUser;
    }

    // @Basic
    // @Column(name = "ICCDTE_ChangeDate", nullable = true, length = 15)
    public String getIccdteChangeDate() {
        return iccdteChangeDate;
    }

    public void setIccdteChangeDate(String iccdteChangeDate) {
        this.iccdteChangeDate = iccdteChangeDate;
    }

    // @Basic
    // @Column(name = "ICCUSR_ChangeUser", nullable = true, length = 15)
    public String getIccusrChangeUser() {
        return iccusrChangeUser;
    }

    public void setIccusrChangeUser(String iccusrChangeUser) {
        this.iccusrChangeUser = iccusrChangeUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BomcfgGlobalMultMonthMoveupConfig that = (BomcfgGlobalMultMonthMoveupConfig) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (icopcyOpCmpy != null ? !icopcyOpCmpy.equals(that.icopcyOpCmpy) : that.icopcyOpCmpy != null) return false;
        if (iccthrCaseCrThreshold != null ? !iccthrCaseCrThreshold.equals(that.iccthrCaseCrThreshold) : that.iccthrCaseCrThreshold != null)
            return false;
        if (icmnbamMaxNbActMonthsBack != null ? !icmnbamMaxNbActMonthsBack.equals(that.icmnbamMaxNbActMonthsBack) : that.icmnbamMaxNbActMonthsBack != null)
            return false;
        if (icstryrStartYear != null ? !icstryrStartYear.equals(that.icstryrStartYear) : that.icstryrStartYear != null)
            return false;
        if (icstrmoStartMonth != null ? !icstrmoStartMonth.equals(that.icstrmoStartMonth) : that.icstrmoStartMonth != null)
            return false;
        if (icedteEntryDate != null ? !icedteEntryDate.equals(that.icedteEntryDate) : that.icedteEntryDate != null)
            return false;
        if (iceusrEntryUser != null ? !iceusrEntryUser.equals(that.iceusrEntryUser) : that.iceusrEntryUser != null)
            return false;
        if (iccdteChangeDate != null ? !iccdteChangeDate.equals(that.iccdteChangeDate) : that.iccdteChangeDate != null)
            return false;
        if (iccusrChangeUser != null ? !iccusrChangeUser.equals(that.iccusrChangeUser) : that.iccusrChangeUser != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (icopcyOpCmpy != null ? icopcyOpCmpy.hashCode() : 0);
        result = 31 * result + (iccthrCaseCrThreshold != null ? iccthrCaseCrThreshold.hashCode() : 0);
        result = 31 * result + (icmnbamMaxNbActMonthsBack != null ? icmnbamMaxNbActMonthsBack.hashCode() : 0);
        result = 31 * result + (icstryrStartYear != null ? icstryrStartYear.hashCode() : 0);
        result = 31 * result + (icstrmoStartMonth != null ? icstrmoStartMonth.hashCode() : 0);
        result = 31 * result + (icedteEntryDate != null ? icedteEntryDate.hashCode() : 0);
        result = 31 * result + (iceusrEntryUser != null ? iceusrEntryUser.hashCode() : 0);
        result = 31 * result + (iccdteChangeDate != null ? iccdteChangeDate.hashCode() : 0);
        result = 31 * result + (iccusrChangeUser != null ? iccusrChangeUser.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BomcfgGlobalMultMonthMoveupConfig\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"icopcyOpCmpy\":\"" + icopcyOpCmpy + "\""
                + ",                         \"iccthrCaseCrThreshold\":\"" + iccthrCaseCrThreshold + "\""
                + ",                         \"icmnbamMaxNbActMonthsBack\":\"" + icmnbamMaxNbActMonthsBack + "\""
                + ",                         \"icstryrStartYear\":\"" + icstryrStartYear + "\""
                + ",                         \"icstrmoStartMonth\":\"" + icstrmoStartMonth + "\""
                + ",                         \"icedteEntryDate\":\"" + icedteEntryDate + "\""
                + ",                         \"iceusrEntryUser\":\"" + iceusrEntryUser + "\""
                + ",                         \"iccdteChangeDate\":\"" + iccdteChangeDate + "\""
                + ",                         \"iccusrChangeUser\":\"" + iccusrChangeUser + "\""
                + "}}";
    }
}
