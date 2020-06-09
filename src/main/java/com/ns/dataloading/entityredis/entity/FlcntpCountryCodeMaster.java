package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("FLCNTP_CountryCodeMaster")
public class FlcntpCountryCodeMaster implements Serializable {
    private Long id;
    private String ctcntyCountryCode;
    private String ctdescCountryDesc;
    private String ct10421042SCountryCode;
    private BigDecimal ctwhpcWithHoldingPerc;
    private String ctopcyOperatingCountryCode;
    private String cta2AbIsoA2Code;
    private String ctisoIsoNumber;
    private String ctuserEnteredByUser;
    private String ctedteDateEntered;
    private String ctstatActiveOrInActive;
    private Long ctcsidCodeCharSetId;
    private String ctaltdForeignLangDesc;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "CTCNTY_CountryCode", nullable = true, length = 15)
    public String getCtcntyCountryCode() {
        return ctcntyCountryCode;
    }

    public void setCtcntyCountryCode(String ctcntyCountryCode) {
        this.ctcntyCountryCode = ctcntyCountryCode;
    }

    // @Basic
    // @Column(name = "CTDESC_CountryDesc", nullable = true, length = 255)
    public String getCtdescCountryDesc() {
        return ctdescCountryDesc;
    }

    public void setCtdescCountryDesc(String ctdescCountryDesc) {
        this.ctdescCountryDesc = ctdescCountryDesc;
    }

    // @Basic
    // @Column(name = "CT1042_1042sCountryCode", nullable = true, length = 15)
    public String getCt10421042SCountryCode() {
        return ct10421042SCountryCode;
    }

    public void setCt10421042SCountryCode(String ct10421042SCountryCode) {
        this.ct10421042SCountryCode = ct10421042SCountryCode;
    }

    // @Basic
    // @Column(name = "CTWHPC_WithHoldingPerc", nullable = true, precision = 1)
    public BigDecimal getCtwhpcWithHoldingPerc() {
        return ctwhpcWithHoldingPerc;
    }

    public void setCtwhpcWithHoldingPerc(BigDecimal ctwhpcWithHoldingPerc) {
        this.ctwhpcWithHoldingPerc = ctwhpcWithHoldingPerc;
    }

    // @Basic
    // @Column(name = "CTOPCY_OperatingCountryCode", nullable = true, length = 15)
    public String getCtopcyOperatingCountryCode() {
        return ctopcyOperatingCountryCode;
    }

    public void setCtopcyOperatingCountryCode(String ctopcyOperatingCountryCode) {
        this.ctopcyOperatingCountryCode = ctopcyOperatingCountryCode;
    }

    // @Basic
    // @Column(name = "CTA2AB_IsoA2Code", nullable = true, length = 15)
    public String getCta2AbIsoA2Code() {
        return cta2AbIsoA2Code;
    }

    public void setCta2AbIsoA2Code(String cta2AbIsoA2Code) {
        this.cta2AbIsoA2Code = cta2AbIsoA2Code;
    }

    // @Basic
    // @Column(name = "CTISO_ISONumber", nullable = true, length = 15)
    public String getCtisoIsoNumber() {
        return ctisoIsoNumber;
    }

    public void setCtisoIsoNumber(String ctisoIsoNumber) {
        this.ctisoIsoNumber = ctisoIsoNumber;
    }

    // @Basic
    // @Column(name = "CTUSER_EnteredByUser", nullable = true, length = 15)
    public String getCtuserEnteredByUser() {
        return ctuserEnteredByUser;
    }

    public void setCtuserEnteredByUser(String ctuserEnteredByUser) {
        this.ctuserEnteredByUser = ctuserEnteredByUser;
    }

    // @Basic
    // @Column(name = "CTEDTE_DateEntered", nullable = true, length = 15)
    public String getCtedteDateEntered() {
        return ctedteDateEntered;
    }

    public void setCtedteDateEntered(String ctedteDateEntered) {
        this.ctedteDateEntered = ctedteDateEntered;
    }

    // @Basic
    // @Column(name = "CTSTAT_ActiveOrInActive", nullable = true, length = 1)
    public String getCtstatActiveOrInActive() {
        return ctstatActiveOrInActive;
    }

    public void setCtstatActiveOrInActive(String ctstatActiveOrInActive) {
        this.ctstatActiveOrInActive = ctstatActiveOrInActive;
    }

    // @Basic
    // @Column(name = "CTCSID_CodeCharSetId", nullable = true)
    public Long getCtcsidCodeCharSetId() {
        return ctcsidCodeCharSetId;
    }

    public void setCtcsidCodeCharSetId(Long ctcsidCodeCharSetId) {
        this.ctcsidCodeCharSetId = ctcsidCodeCharSetId;
    }

    // @Basic
    // @Column(name = "CTALTD_ForeignLangDesc", nullable = true, length = 255)
    public String getCtaltdForeignLangDesc() {
        return ctaltdForeignLangDesc;
    }

    public void setCtaltdForeignLangDesc(String ctaltdForeignLangDesc) {
        this.ctaltdForeignLangDesc = ctaltdForeignLangDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlcntpCountryCodeMaster that = (FlcntpCountryCodeMaster) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ctcntyCountryCode != null ? !ctcntyCountryCode.equals(that.ctcntyCountryCode) : that.ctcntyCountryCode != null)
            return false;
        if (ctdescCountryDesc != null ? !ctdescCountryDesc.equals(that.ctdescCountryDesc) : that.ctdescCountryDesc != null)
            return false;
        if (ct10421042SCountryCode != null ? !ct10421042SCountryCode.equals(that.ct10421042SCountryCode) : that.ct10421042SCountryCode != null)
            return false;
        if (ctwhpcWithHoldingPerc != null ? !ctwhpcWithHoldingPerc.equals(that.ctwhpcWithHoldingPerc) : that.ctwhpcWithHoldingPerc != null)
            return false;
        if (ctopcyOperatingCountryCode != null ? !ctopcyOperatingCountryCode.equals(that.ctopcyOperatingCountryCode) : that.ctopcyOperatingCountryCode != null)
            return false;
        if (cta2AbIsoA2Code != null ? !cta2AbIsoA2Code.equals(that.cta2AbIsoA2Code) : that.cta2AbIsoA2Code != null)
            return false;
        if (ctisoIsoNumber != null ? !ctisoIsoNumber.equals(that.ctisoIsoNumber) : that.ctisoIsoNumber != null)
            return false;
        if (ctuserEnteredByUser != null ? !ctuserEnteredByUser.equals(that.ctuserEnteredByUser) : that.ctuserEnteredByUser != null)
            return false;
        if (ctedteDateEntered != null ? !ctedteDateEntered.equals(that.ctedteDateEntered) : that.ctedteDateEntered != null)
            return false;
        if (ctstatActiveOrInActive != null ? !ctstatActiveOrInActive.equals(that.ctstatActiveOrInActive) : that.ctstatActiveOrInActive != null)
            return false;
        if (ctcsidCodeCharSetId != null ? !ctcsidCodeCharSetId.equals(that.ctcsidCodeCharSetId) : that.ctcsidCodeCharSetId != null)
            return false;
        if (ctaltdForeignLangDesc != null ? !ctaltdForeignLangDesc.equals(that.ctaltdForeignLangDesc) : that.ctaltdForeignLangDesc != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ctcntyCountryCode != null ? ctcntyCountryCode.hashCode() : 0);
        result = 31 * result + (ctdescCountryDesc != null ? ctdescCountryDesc.hashCode() : 0);
        result = 31 * result + (ct10421042SCountryCode != null ? ct10421042SCountryCode.hashCode() : 0);
        result = 31 * result + (ctwhpcWithHoldingPerc != null ? ctwhpcWithHoldingPerc.hashCode() : 0);
        result = 31 * result + (ctopcyOperatingCountryCode != null ? ctopcyOperatingCountryCode.hashCode() : 0);
        result = 31 * result + (cta2AbIsoA2Code != null ? cta2AbIsoA2Code.hashCode() : 0);
        result = 31 * result + (ctisoIsoNumber != null ? ctisoIsoNumber.hashCode() : 0);
        result = 31 * result + (ctuserEnteredByUser != null ? ctuserEnteredByUser.hashCode() : 0);
        result = 31 * result + (ctedteDateEntered != null ? ctedteDateEntered.hashCode() : 0);
        result = 31 * result + (ctstatActiveOrInActive != null ? ctstatActiveOrInActive.hashCode() : 0);
        result = 31 * result + (ctcsidCodeCharSetId != null ? ctcsidCodeCharSetId.hashCode() : 0);
        result = 31 * result + (ctaltdForeignLangDesc != null ? ctaltdForeignLangDesc.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"FlcntpCountryCodeMaster\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"ctcntyCountryCode\":\"" + ctcntyCountryCode + "\""
                + ",                         \"ctdescCountryDesc\":\"" + ctdescCountryDesc + "\""
                + ",                         \"ct10421042SCountryCode\":\"" + ct10421042SCountryCode + "\""
                + ",                         \"ctwhpcWithHoldingPerc\":\"" + ctwhpcWithHoldingPerc + "\""
                + ",                         \"ctopcyOperatingCountryCode\":\"" + ctopcyOperatingCountryCode + "\""
                + ",                         \"cta2AbIsoA2Code\":\"" + cta2AbIsoA2Code + "\""
                + ",                         \"ctisoIsoNumber\":\"" + ctisoIsoNumber + "\""
                + ",                         \"ctuserEnteredByUser\":\"" + ctuserEnteredByUser + "\""
                + ",                         \"ctedteDateEntered\":\"" + ctedteDateEntered + "\""
                + ",                         \"ctstatActiveOrInActive\":\"" + ctstatActiveOrInActive + "\""
                + ",                         \"ctcsidCodeCharSetId\":\"" + ctcsidCodeCharSetId + "\""
                + ",                         \"ctaltdForeignLangDesc\":\"" + ctaltdForeignLangDesc + "\""
                + "}}";
    }
}
