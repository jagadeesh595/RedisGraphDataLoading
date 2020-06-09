package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("EMEWWP_WWEagleManagerIDsandSponsor")
public class EmewwpWwEagleManagerIDsandSponsor implements Serializable {
    private Long id;
    private Integer eepyrProcessingYear;
    private Integer eepmoProcessingMonth;
    private String eecntyIsoCntryCode;
    private Long eectycCountryCode;
    private Long eedidDistId;
    private Long eespccSponCtrCode;
    private Long eespidSponId;
    private String eefnamFirstName;
    private String eelnamLastName;
    private BigDecimal eetccTotalCc;
    private BigDecimal eenccNewPerNmCc;
    private Integer eesupNewSuperVisors;
    private Integer eereqEmRequired;
    private Integer eeemEagleMgrs;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "EEPYR_ProcessingYear", nullable = true)
    public Integer getEepyrProcessingYear() {
        return eepyrProcessingYear;
    }

    public void setEepyrProcessingYear(Integer eepyrProcessingYear) {
        this.eepyrProcessingYear = eepyrProcessingYear;
    }

    // @Basic
    // @Column(name = "EEPMO_ProcessingMonth", nullable = true)
    public Integer getEepmoProcessingMonth() {
        return eepmoProcessingMonth;
    }

    public void setEepmoProcessingMonth(Integer eepmoProcessingMonth) {
        this.eepmoProcessingMonth = eepmoProcessingMonth;
    }

    // @Basic
    // @Column(name = "EECNTY_IsoCntryCode", nullable = true, length = 15)
    public String getEecntyIsoCntryCode() {
        return eecntyIsoCntryCode;
    }

    public void setEecntyIsoCntryCode(String eecntyIsoCntryCode) {
        this.eecntyIsoCntryCode = eecntyIsoCntryCode;
    }

    // @Basic
    // @Column(name = "EECTYC_CountryCode", nullable = true)
    public Long getEectycCountryCode() {
        return eectycCountryCode;
    }

    public void setEectycCountryCode(Long eectycCountryCode) {
        this.eectycCountryCode = eectycCountryCode;
    }

    // @Basic
    // @Column(name = "EEDID_DistId", nullable = true)
    public Long getEedidDistId() {
        return eedidDistId;
    }

    public void setEedidDistId(Long eedidDistId) {
        this.eedidDistId = eedidDistId;
    }

    // @Basic
    // @Column(name = "EESPCC_SponCtrCode", nullable = true)
    public Long getEespccSponCtrCode() {
        return eespccSponCtrCode;
    }

    public void setEespccSponCtrCode(Long eespccSponCtrCode) {
        this.eespccSponCtrCode = eespccSponCtrCode;
    }

    // @Basic
    // @Column(name = "EESPID_SponId", nullable = true)
    public Long getEespidSponId() {
        return eespidSponId;
    }

    public void setEespidSponId(Long eespidSponId) {
        this.eespidSponId = eespidSponId;
    }

    // @Basic
    // @Column(name = "EEFNAM_FirstName", nullable = true, length = 255)
    public String getEefnamFirstName() {
        return eefnamFirstName;
    }

    public void setEefnamFirstName(String eefnamFirstName) {
        this.eefnamFirstName = eefnamFirstName;
    }

    // @Basic
    // @Column(name = "EELNAM_LastName", nullable = true, length = 255)
    public String getEelnamLastName() {
        return eelnamLastName;
    }

    public void setEelnamLastName(String eelnamLastName) {
        this.eelnamLastName = eelnamLastName;
    }

    // @Basic
    // @Column(name = "EETCC_TotalCc", nullable = true, precision = 3)
    public BigDecimal getEetccTotalCc() {
        return eetccTotalCc;
    }

    public void setEetccTotalCc(BigDecimal eetccTotalCc) {
        this.eetccTotalCc = eetccTotalCc;
    }

    // @Basic
    // @Column(name = "EENCC_NewPerNmCc", nullable = true, precision = 3)
    public BigDecimal getEenccNewPerNmCc() {
        return eenccNewPerNmCc;
    }

    public void setEenccNewPerNmCc(BigDecimal eenccNewPerNmCc) {
        this.eenccNewPerNmCc = eenccNewPerNmCc;
    }

    // @Basic
    // @Column(name = "EESUP_NewSuperVisors", nullable = true)
    public Integer getEesupNewSuperVisors() {
        return eesupNewSuperVisors;
    }

    public void setEesupNewSuperVisors(Integer eesupNewSuperVisors) {
        this.eesupNewSuperVisors = eesupNewSuperVisors;
    }

    // @Basic
    // @Column(name = "EEREQ_EmRequired", nullable = true)
    public Integer getEereqEmRequired() {
        return eereqEmRequired;
    }

    public void setEereqEmRequired(Integer eereqEmRequired) {
        this.eereqEmRequired = eereqEmRequired;
    }

    // @Basic
    // @Column(name = "EEEM_EagleMgrs", nullable = true)
    public Integer getEeemEagleMgrs() {
        return eeemEagleMgrs;
    }

    public void setEeemEagleMgrs(Integer eeemEagleMgrs) {
        this.eeemEagleMgrs = eeemEagleMgrs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmewwpWwEagleManagerIDsandSponsor that = (EmewwpWwEagleManagerIDsandSponsor) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (eepyrProcessingYear != null ? !eepyrProcessingYear.equals(that.eepyrProcessingYear) : that.eepyrProcessingYear != null)
            return false;
        if (eepmoProcessingMonth != null ? !eepmoProcessingMonth.equals(that.eepmoProcessingMonth) : that.eepmoProcessingMonth != null)
            return false;
        if (eecntyIsoCntryCode != null ? !eecntyIsoCntryCode.equals(that.eecntyIsoCntryCode) : that.eecntyIsoCntryCode != null)
            return false;
        if (eectycCountryCode != null ? !eectycCountryCode.equals(that.eectycCountryCode) : that.eectycCountryCode != null)
            return false;
        if (eedidDistId != null ? !eedidDistId.equals(that.eedidDistId) : that.eedidDistId != null) return false;
        if (eespccSponCtrCode != null ? !eespccSponCtrCode.equals(that.eespccSponCtrCode) : that.eespccSponCtrCode != null)
            return false;
        if (eespidSponId != null ? !eespidSponId.equals(that.eespidSponId) : that.eespidSponId != null) return false;
        if (eefnamFirstName != null ? !eefnamFirstName.equals(that.eefnamFirstName) : that.eefnamFirstName != null)
            return false;
        if (eelnamLastName != null ? !eelnamLastName.equals(that.eelnamLastName) : that.eelnamLastName != null)
            return false;
        if (eetccTotalCc != null ? !eetccTotalCc.equals(that.eetccTotalCc) : that.eetccTotalCc != null) return false;
        if (eenccNewPerNmCc != null ? !eenccNewPerNmCc.equals(that.eenccNewPerNmCc) : that.eenccNewPerNmCc != null)
            return false;
        if (eesupNewSuperVisors != null ? !eesupNewSuperVisors.equals(that.eesupNewSuperVisors) : that.eesupNewSuperVisors != null)
            return false;
        if (eereqEmRequired != null ? !eereqEmRequired.equals(that.eereqEmRequired) : that.eereqEmRequired != null)
            return false;
        if (eeemEagleMgrs != null ? !eeemEagleMgrs.equals(that.eeemEagleMgrs) : that.eeemEagleMgrs != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (eepyrProcessingYear != null ? eepyrProcessingYear.hashCode() : 0);
        result = 31 * result + (eepmoProcessingMonth != null ? eepmoProcessingMonth.hashCode() : 0);
        result = 31 * result + (eecntyIsoCntryCode != null ? eecntyIsoCntryCode.hashCode() : 0);
        result = 31 * result + (eectycCountryCode != null ? eectycCountryCode.hashCode() : 0);
        result = 31 * result + (eedidDistId != null ? eedidDistId.hashCode() : 0);
        result = 31 * result + (eespccSponCtrCode != null ? eespccSponCtrCode.hashCode() : 0);
        result = 31 * result + (eespidSponId != null ? eespidSponId.hashCode() : 0);
        result = 31 * result + (eefnamFirstName != null ? eefnamFirstName.hashCode() : 0);
        result = 31 * result + (eelnamLastName != null ? eelnamLastName.hashCode() : 0);
        result = 31 * result + (eetccTotalCc != null ? eetccTotalCc.hashCode() : 0);
        result = 31 * result + (eenccNewPerNmCc != null ? eenccNewPerNmCc.hashCode() : 0);
        result = 31 * result + (eesupNewSuperVisors != null ? eesupNewSuperVisors.hashCode() : 0);
        result = 31 * result + (eereqEmRequired != null ? eereqEmRequired.hashCode() : 0);
        result = 31 * result + (eeemEagleMgrs != null ? eeemEagleMgrs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"EmewwpWwEagleManagerIDsandSponsor\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"eepyrProcessingYear\":\"" + eepyrProcessingYear + "\""
                + ",                         \"eepmoProcessingMonth\":\"" + eepmoProcessingMonth + "\""
                + ",                         \"eecntyIsoCntryCode\":\"" + eecntyIsoCntryCode + "\""
                + ",                         \"eectycCountryCode\":\"" + eectycCountryCode + "\""
                + ",                         \"eedidDistId\":\"" + eedidDistId + "\""
                + ",                         \"eespccSponCtrCode\":\"" + eespccSponCtrCode + "\""
                + ",                         \"eespidSponId\":\"" + eespidSponId + "\""
                + ",                         \"eefnamFirstName\":\"" + eefnamFirstName + "\""
                + ",                         \"eelnamLastName\":\"" + eelnamLastName + "\""
                + ",                         \"eetccTotalCc\":\"" + eetccTotalCc + "\""
                + ",                         \"eenccNewPerNmCc\":\"" + eenccNewPerNmCc + "\""
                + ",                         \"eesupNewSuperVisors\":\"" + eesupNewSuperVisors + "\""
                + ",                         \"eereqEmRequired\":\"" + eereqEmRequired + "\""
                + ",                         \"eeemEagleMgrs\":\"" + eeemEagleMgrs + "\""
                + "}}";
    }
}
