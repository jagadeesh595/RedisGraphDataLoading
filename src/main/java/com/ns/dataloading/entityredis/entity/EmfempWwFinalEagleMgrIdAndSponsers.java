package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("EMFEMP_WWFinalEagleMgrIdAndSponsers")
public class EmfempWwFinalEagleMgrIdAndSponsers implements Serializable {
    private Long id;
    private Integer efpyrProcessYear;
    private String efcntyIsoCountryCode;
    private Long efctycCountryCode;
    private Long efdidDistributorId;
    private Long efspccSponserCountryCode;
    private Long efspidSponId;
    private String effnamFirstName;
    private String eflnamLastName;
    private BigDecimal eftccTotalCc;
    private BigDecimal efnccNewPerOrNmCc;
    private Integer efsupNewSuperVisors;
    private Integer efreqEmRequired;
    private Integer efemEagleManagers;
    private Integer eflvlEagleLvlAchieved;
    private String efchgdLastChangeDate;
    private String efuserLastChangeUser;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "EFPYR_ProcessYear", nullable = true)
    public Integer getEfpyrProcessYear() {
        return efpyrProcessYear;
    }

    public void setEfpyrProcessYear(Integer efpyrProcessYear) {
        this.efpyrProcessYear = efpyrProcessYear;
    }

    // @Basic
    // @Column(name = "EFCNTY_IsoCountryCode", nullable = true, length = 15)
    public String getEfcntyIsoCountryCode() {
        return efcntyIsoCountryCode;
    }

    public void setEfcntyIsoCountryCode(String efcntyIsoCountryCode) {
        this.efcntyIsoCountryCode = efcntyIsoCountryCode;
    }

    // @Basic
    // @Column(name = "EFCTYC_CountryCode", nullable = true)
    public Long getEfctycCountryCode() {
        return efctycCountryCode;
    }

    public void setEfctycCountryCode(Long efctycCountryCode) {
        this.efctycCountryCode = efctycCountryCode;
    }

    // @Basic
    // @Column(name = "EFDID_DistributorId", nullable = true)
    public Long getEfdidDistributorId() {
        return efdidDistributorId;
    }

    public void setEfdidDistributorId(Long efdidDistributorId) {
        this.efdidDistributorId = efdidDistributorId;
    }

    // @Basic
    // @Column(name = "EFSPCC_SponserCountryCode", nullable = true)
    public Long getEfspccSponserCountryCode() {
        return efspccSponserCountryCode;
    }

    public void setEfspccSponserCountryCode(Long efspccSponserCountryCode) {
        this.efspccSponserCountryCode = efspccSponserCountryCode;
    }

    // @Basic
    // @Column(name = "EFSPID_SponId", nullable = true)
    public Long getEfspidSponId() {
        return efspidSponId;
    }

    public void setEfspidSponId(Long efspidSponId) {
        this.efspidSponId = efspidSponId;
    }

    // @Basic
    // @Column(name = "EFFNAM_FirstName", nullable = true, length = 20)
    public String getEffnamFirstName() {
        return effnamFirstName;
    }

    public void setEffnamFirstName(String effnamFirstName) {
        this.effnamFirstName = effnamFirstName;
    }

    // @Basic
    // @Column(name = "EFLNAM_LastName", nullable = true, length = 30)
    public String getEflnamLastName() {
        return eflnamLastName;
    }

    public void setEflnamLastName(String eflnamLastName) {
        this.eflnamLastName = eflnamLastName;
    }

    // @Basic
    // @Column(name = "EFTCC_TotalCc", nullable = true, precision = 3)
    public BigDecimal getEftccTotalCc() {
        return eftccTotalCc;
    }

    public void setEftccTotalCc(BigDecimal eftccTotalCc) {
        this.eftccTotalCc = eftccTotalCc;
    }

    // @Basic
    // @Column(name = "EFNCC_NewPerOrNmCc", nullable = true, precision = 3)
    public BigDecimal getEfnccNewPerOrNmCc() {
        return efnccNewPerOrNmCc;
    }

    public void setEfnccNewPerOrNmCc(BigDecimal efnccNewPerOrNmCc) {
        this.efnccNewPerOrNmCc = efnccNewPerOrNmCc;
    }

    // @Basic
    // @Column(name = "EFSUP_NewSuperVisors", nullable = true)
    public Integer getEfsupNewSuperVisors() {
        return efsupNewSuperVisors;
    }

    public void setEfsupNewSuperVisors(Integer efsupNewSuperVisors) {
        this.efsupNewSuperVisors = efsupNewSuperVisors;
    }

    // @Basic
    // @Column(name = "EFREQ_EmRequired", nullable = true)
    public Integer getEfreqEmRequired() {
        return efreqEmRequired;
    }

    public void setEfreqEmRequired(Integer efreqEmRequired) {
        this.efreqEmRequired = efreqEmRequired;
    }

    // @Basic
    // @Column(name = "EFEM_EagleManagers", nullable = true)
    public Integer getEfemEagleManagers() {
        return efemEagleManagers;
    }

    public void setEfemEagleManagers(Integer efemEagleManagers) {
        this.efemEagleManagers = efemEagleManagers;
    }

    // @Basic
    // @Column(name = "EFLVL_EagleLvlAchieved", nullable = true)
    public Integer getEflvlEagleLvlAchieved() {
        return eflvlEagleLvlAchieved;
    }

    public void setEflvlEagleLvlAchieved(Integer eflvlEagleLvlAchieved) {
        this.eflvlEagleLvlAchieved = eflvlEagleLvlAchieved;
    }

    // @Basic
    // @Column(name = "EFCHGD_LastChangeDate", nullable = true, length = 15)
    public String getEfchgdLastChangeDate() {
        return efchgdLastChangeDate;
    }

    public void setEfchgdLastChangeDate(String efchgdLastChangeDate) {
        this.efchgdLastChangeDate = efchgdLastChangeDate;
    }

    // @Basic
    // @Column(name = "EFUSER_LastChangeUser", nullable = true, length = 15)
    public String getEfuserLastChangeUser() {
        return efuserLastChangeUser;
    }

    public void setEfuserLastChangeUser(String efuserLastChangeUser) {
        this.efuserLastChangeUser = efuserLastChangeUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmfempWwFinalEagleMgrIdAndSponsers that = (EmfempWwFinalEagleMgrIdAndSponsers) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (efpyrProcessYear != null ? !efpyrProcessYear.equals(that.efpyrProcessYear) : that.efpyrProcessYear != null)
            return false;
        if (efcntyIsoCountryCode != null ? !efcntyIsoCountryCode.equals(that.efcntyIsoCountryCode) : that.efcntyIsoCountryCode != null)
            return false;
        if (efctycCountryCode != null ? !efctycCountryCode.equals(that.efctycCountryCode) : that.efctycCountryCode != null)
            return false;
        if (efdidDistributorId != null ? !efdidDistributorId.equals(that.efdidDistributorId) : that.efdidDistributorId != null)
            return false;
        if (efspccSponserCountryCode != null ? !efspccSponserCountryCode.equals(that.efspccSponserCountryCode) : that.efspccSponserCountryCode != null)
            return false;
        if (efspidSponId != null ? !efspidSponId.equals(that.efspidSponId) : that.efspidSponId != null) return false;
        if (effnamFirstName != null ? !effnamFirstName.equals(that.effnamFirstName) : that.effnamFirstName != null)
            return false;
        if (eflnamLastName != null ? !eflnamLastName.equals(that.eflnamLastName) : that.eflnamLastName != null)
            return false;
        if (eftccTotalCc != null ? !eftccTotalCc.equals(that.eftccTotalCc) : that.eftccTotalCc != null) return false;
        if (efnccNewPerOrNmCc != null ? !efnccNewPerOrNmCc.equals(that.efnccNewPerOrNmCc) : that.efnccNewPerOrNmCc != null)
            return false;
        if (efsupNewSuperVisors != null ? !efsupNewSuperVisors.equals(that.efsupNewSuperVisors) : that.efsupNewSuperVisors != null)
            return false;
        if (efreqEmRequired != null ? !efreqEmRequired.equals(that.efreqEmRequired) : that.efreqEmRequired != null)
            return false;
        if (efemEagleManagers != null ? !efemEagleManagers.equals(that.efemEagleManagers) : that.efemEagleManagers != null)
            return false;
        if (eflvlEagleLvlAchieved != null ? !eflvlEagleLvlAchieved.equals(that.eflvlEagleLvlAchieved) : that.eflvlEagleLvlAchieved != null)
            return false;
        if (efchgdLastChangeDate != null ? !efchgdLastChangeDate.equals(that.efchgdLastChangeDate) : that.efchgdLastChangeDate != null)
            return false;
        if (efuserLastChangeUser != null ? !efuserLastChangeUser.equals(that.efuserLastChangeUser) : that.efuserLastChangeUser != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (efpyrProcessYear != null ? efpyrProcessYear.hashCode() : 0);
        result = 31 * result + (efcntyIsoCountryCode != null ? efcntyIsoCountryCode.hashCode() : 0);
        result = 31 * result + (efctycCountryCode != null ? efctycCountryCode.hashCode() : 0);
        result = 31 * result + (efdidDistributorId != null ? efdidDistributorId.hashCode() : 0);
        result = 31 * result + (efspccSponserCountryCode != null ? efspccSponserCountryCode.hashCode() : 0);
        result = 31 * result + (efspidSponId != null ? efspidSponId.hashCode() : 0);
        result = 31 * result + (effnamFirstName != null ? effnamFirstName.hashCode() : 0);
        result = 31 * result + (eflnamLastName != null ? eflnamLastName.hashCode() : 0);
        result = 31 * result + (eftccTotalCc != null ? eftccTotalCc.hashCode() : 0);
        result = 31 * result + (efnccNewPerOrNmCc != null ? efnccNewPerOrNmCc.hashCode() : 0);
        result = 31 * result + (efsupNewSuperVisors != null ? efsupNewSuperVisors.hashCode() : 0);
        result = 31 * result + (efreqEmRequired != null ? efreqEmRequired.hashCode() : 0);
        result = 31 * result + (efemEagleManagers != null ? efemEagleManagers.hashCode() : 0);
        result = 31 * result + (eflvlEagleLvlAchieved != null ? eflvlEagleLvlAchieved.hashCode() : 0);
        result = 31 * result + (efchgdLastChangeDate != null ? efchgdLastChangeDate.hashCode() : 0);
        result = 31 * result + (efuserLastChangeUser != null ? efuserLastChangeUser.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"EmfempWwFinalEagleMgrIdAndSponsers\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"efpyrProcessYear\":\"" + efpyrProcessYear + "\""
                + ",                         \"efcntyIsoCountryCode\":\"" + efcntyIsoCountryCode + "\""
                + ",                         \"efctycCountryCode\":\"" + efctycCountryCode + "\""
                + ",                         \"efdidDistributorId\":\"" + efdidDistributorId + "\""
                + ",                         \"efspccSponserCountryCode\":\"" + efspccSponserCountryCode + "\""
                + ",                         \"efspidSponId\":\"" + efspidSponId + "\""
                + ",                         \"effnamFirstName\":\"" + effnamFirstName + "\""
                + ",                         \"eflnamLastName\":\"" + eflnamLastName + "\""
                + ",                         \"eftccTotalCc\":\"" + eftccTotalCc + "\""
                + ",                         \"efnccNewPerOrNmCc\":\"" + efnccNewPerOrNmCc + "\""
                + ",                         \"efsupNewSuperVisors\":\"" + efsupNewSuperVisors + "\""
                + ",                         \"efreqEmRequired\":\"" + efreqEmRequired + "\""
                + ",                         \"efemEagleManagers\":\"" + efemEagleManagers + "\""
                + ",                         \"eflvlEagleLvlAchieved\":\"" + eflvlEagleLvlAchieved + "\""
                + ",                         \"efchgdLastChangeDate\":\"" + efchgdLastChangeDate + "\""
                + ",                         \"efuserLastChangeUser\":\"" + efuserLastChangeUser + "\""
                + "}}";
    }
}
