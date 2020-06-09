package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("EMDEMP_EagleManagerDownlineEm")
public class EmdempEagleManagerDownlineEm implements Serializable {
    private Long id;
    private String eecntyIsoCountry;
    private Long eectycCountryCode;
    private Long eedidDistributorId;
    private Long eegenGeneration;
    private Long eeupccUplineCc;
    private Long eeupidDistributorId;
    private Long ee1Cc1StGenCc;
    private Long ee1Id1StGenId;
    private String eechgdLastChangeDate;
    private String eeuserLastChangeUser;
    private String eepgmLastChangePgm;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "EECNTY_IsoCountry", nullable = true, length = 15)
    public String getEecntyIsoCountry() {
        return eecntyIsoCountry;
    }

    public void setEecntyIsoCountry(String eecntyIsoCountry) {
        this.eecntyIsoCountry = eecntyIsoCountry;
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
    // @Column(name = "EEDID_DistributorId", nullable = true)
    public Long getEedidDistributorId() {
        return eedidDistributorId;
    }

    public void setEedidDistributorId(Long eedidDistributorId) {
        this.eedidDistributorId = eedidDistributorId;
    }

    // @Basic
    // @Column(name = "EEGEN_Generation", nullable = true)
    public Long getEegenGeneration() {
        return eegenGeneration;
    }

    public void setEegenGeneration(Long eegenGeneration) {
        this.eegenGeneration = eegenGeneration;
    }

    // @Basic
    // @Column(name = "EEUPCC_UplineCc", nullable = true)
    public Long getEeupccUplineCc() {
        return eeupccUplineCc;
    }

    public void setEeupccUplineCc(Long eeupccUplineCc) {
        this.eeupccUplineCc = eeupccUplineCc;
    }

    // @Basic
    // @Column(name = "EEUPID_DistributorId", nullable = true)
    public Long getEeupidDistributorId() {
        return eeupidDistributorId;
    }

    public void setEeupidDistributorId(Long eeupidDistributorId) {
        this.eeupidDistributorId = eeupidDistributorId;
    }

    // @Basic
    // @Column(name = "EE1CC_1stGenCc", nullable = true)
    public Long getEe1Cc1StGenCc() {
        return ee1Cc1StGenCc;
    }

    public void setEe1Cc1StGenCc(Long ee1Cc1StGenCc) {
        this.ee1Cc1StGenCc = ee1Cc1StGenCc;
    }

    // @Basic
    // @Column(name = "EE1ID_1stGenId", nullable = true)
    public Long getEe1Id1StGenId() {
        return ee1Id1StGenId;
    }

    public void setEe1Id1StGenId(Long ee1Id1StGenId) {
        this.ee1Id1StGenId = ee1Id1StGenId;
    }

    // @Basic
    // @Column(name = "EECHGD_LastChangeDate", nullable = true, length = 15)
    public String getEechgdLastChangeDate() {
        return eechgdLastChangeDate;
    }

    public void setEechgdLastChangeDate(String eechgdLastChangeDate) {
        this.eechgdLastChangeDate = eechgdLastChangeDate;
    }

    // @Basic
    // @Column(name = "EEUSER_LastChangeUser", nullable = true, length = 255)
    public String getEeuserLastChangeUser() {
        return eeuserLastChangeUser;
    }

    public void setEeuserLastChangeUser(String eeuserLastChangeUser) {
        this.eeuserLastChangeUser = eeuserLastChangeUser;
    }

    // @Basic
    // @Column(name = "EEPGM_LastChangePgm", nullable = true, length = 15)
    public String getEepgmLastChangePgm() {
        return eepgmLastChangePgm;
    }

    public void setEepgmLastChangePgm(String eepgmLastChangePgm) {
        this.eepgmLastChangePgm = eepgmLastChangePgm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmdempEagleManagerDownlineEm that = (EmdempEagleManagerDownlineEm) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (eecntyIsoCountry != null ? !eecntyIsoCountry.equals(that.eecntyIsoCountry) : that.eecntyIsoCountry != null)
            return false;
        if (eectycCountryCode != null ? !eectycCountryCode.equals(that.eectycCountryCode) : that.eectycCountryCode != null)
            return false;
        if (eedidDistributorId != null ? !eedidDistributorId.equals(that.eedidDistributorId) : that.eedidDistributorId != null)
            return false;
        if (eegenGeneration != null ? !eegenGeneration.equals(that.eegenGeneration) : that.eegenGeneration != null)
            return false;
        if (eeupccUplineCc != null ? !eeupccUplineCc.equals(that.eeupccUplineCc) : that.eeupccUplineCc != null)
            return false;
        if (eeupidDistributorId != null ? !eeupidDistributorId.equals(that.eeupidDistributorId) : that.eeupidDistributorId != null)
            return false;
        if (ee1Cc1StGenCc != null ? !ee1Cc1StGenCc.equals(that.ee1Cc1StGenCc) : that.ee1Cc1StGenCc != null)
            return false;
        if (ee1Id1StGenId != null ? !ee1Id1StGenId.equals(that.ee1Id1StGenId) : that.ee1Id1StGenId != null)
            return false;
        if (eechgdLastChangeDate != null ? !eechgdLastChangeDate.equals(that.eechgdLastChangeDate) : that.eechgdLastChangeDate != null)
            return false;
        if (eeuserLastChangeUser != null ? !eeuserLastChangeUser.equals(that.eeuserLastChangeUser) : that.eeuserLastChangeUser != null)
            return false;
        if (eepgmLastChangePgm != null ? !eepgmLastChangePgm.equals(that.eepgmLastChangePgm) : that.eepgmLastChangePgm != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (eecntyIsoCountry != null ? eecntyIsoCountry.hashCode() : 0);
        result = 31 * result + (eectycCountryCode != null ? eectycCountryCode.hashCode() : 0);
        result = 31 * result + (eedidDistributorId != null ? eedidDistributorId.hashCode() : 0);
        result = 31 * result + (eegenGeneration != null ? eegenGeneration.hashCode() : 0);
        result = 31 * result + (eeupccUplineCc != null ? eeupccUplineCc.hashCode() : 0);
        result = 31 * result + (eeupidDistributorId != null ? eeupidDistributorId.hashCode() : 0);
        result = 31 * result + (ee1Cc1StGenCc != null ? ee1Cc1StGenCc.hashCode() : 0);
        result = 31 * result + (ee1Id1StGenId != null ? ee1Id1StGenId.hashCode() : 0);
        result = 31 * result + (eechgdLastChangeDate != null ? eechgdLastChangeDate.hashCode() : 0);
        result = 31 * result + (eeuserLastChangeUser != null ? eeuserLastChangeUser.hashCode() : 0);
        result = 31 * result + (eepgmLastChangePgm != null ? eepgmLastChangePgm.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"EmdempEagleManagerDownlineEm\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"eecntyIsoCountry\":\"" + eecntyIsoCountry + "\""
                + ",                         \"eectycCountryCode\":\"" + eectycCountryCode + "\""
                + ",                         \"eedidDistributorId\":\"" + eedidDistributorId + "\""
                + ",                         \"eegenGeneration\":\"" + eegenGeneration + "\""
                + ",                         \"eeupccUplineCc\":\"" + eeupccUplineCc + "\""
                + ",                         \"eeupidDistributorId\":\"" + eeupidDistributorId + "\""
                + ",                         \"ee1Cc1StGenCc\":\"" + ee1Cc1StGenCc + "\""
                + ",                         \"ee1Id1StGenId\":\"" + ee1Id1StGenId + "\""
                + ",                         \"eechgdLastChangeDate\":\"" + eechgdLastChangeDate + "\""
                + ",                         \"eeuserLastChangeUser\":\"" + eeuserLastChangeUser + "\""
                + ",                         \"eepgmLastChangePgm\":\"" + eepgmLastChangePgm + "\""
                + "}}";
    }

    public EmdempEagleManagerDownlineEm copy() {
        EmdempEagleManagerDownlineEm em = new EmdempEagleManagerDownlineEm();
        em.eecntyIsoCountry = eecntyIsoCountry;
        em.eectycCountryCode = eectycCountryCode;
        em.eedidDistributorId = eedidDistributorId;
        em.eegenGeneration = eegenGeneration;
        em.eeupccUplineCc = eeupccUplineCc;
        em.eeupidDistributorId = eeupidDistributorId;
        em.ee1Cc1StGenCc = ee1Cc1StGenCc;
        em.ee1Id1StGenId = ee1Id1StGenId;
        em.eechgdLastChangeDate = eechgdLastChangeDate;
        em.eeuserLastChangeUser = eeuserLastChangeUser;
        em.eepgmLastChangePgm = eepgmLastChangePgm;
        return em;
    }

}
