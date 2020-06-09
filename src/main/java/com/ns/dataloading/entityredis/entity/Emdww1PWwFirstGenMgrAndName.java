package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("EMDWW1P_WWFirstGenMgrAndName")
public class Emdww1PWwFirstGenMgrAndName implements Serializable {
    private Long id;
    private Integer e1PyrProcessingYear;
    private Integer e1PmoProcessingMonth;
    private String e1CntyIsoCountryCode;
    private Long e11Cc1StGenCc;
    private Long e11Id1StGenId;
    private String e1FnamFirstName;
    private String e1LnamLastName;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "E1PYR_ProcessingYear", nullable = true)
    public Integer getE1PyrProcessingYear() {
        return e1PyrProcessingYear;
    }

    public void setE1PyrProcessingYear(Integer e1PyrProcessingYear) {
        this.e1PyrProcessingYear = e1PyrProcessingYear;
    }

    // @Basic
    // @Column(name = "E1PMO_ProcessingMonth", nullable = true)
    public Integer getE1PmoProcessingMonth() {
        return e1PmoProcessingMonth;
    }

    public void setE1PmoProcessingMonth(Integer e1PmoProcessingMonth) {
        this.e1PmoProcessingMonth = e1PmoProcessingMonth;
    }

    // @Basic
    // @Column(name = "E1CNTY_IsoCountryCode", nullable = true, length = 15)
    public String getE1CntyIsoCountryCode() {
        return e1CntyIsoCountryCode;
    }

    public void setE1CntyIsoCountryCode(String e1CntyIsoCountryCode) {
        this.e1CntyIsoCountryCode = e1CntyIsoCountryCode;
    }

    // @Basic
    // @Column(name = "E11CC_1stGenCc", nullable = true)
    public Long getE11Cc1StGenCc() {
        return e11Cc1StGenCc;
    }

    public void setE11Cc1StGenCc(Long e11Cc1StGenCc) {
        this.e11Cc1StGenCc = e11Cc1StGenCc;
    }

    // @Basic
    // @Column(name = "E11ID_1stGenId", nullable = true)
    public Long getE11Id1StGenId() {
        return e11Id1StGenId;
    }

    public void setE11Id1StGenId(Long e11Id1StGenId) {
        this.e11Id1StGenId = e11Id1StGenId;
    }

    // @Basic
    // @Column(name = "E1FNAM_FirstName", nullable = true, length = 255)
    public String getE1FnamFirstName() {
        return e1FnamFirstName;
    }

    public void setE1FnamFirstName(String e1FnamFirstName) {
        this.e1FnamFirstName = e1FnamFirstName;
    }

    // @Basic
    // @Column(name = "E1LNAM_LastName", nullable = true, length = 255)
    public String getE1LnamLastName() {
        return e1LnamLastName;
    }

    public void setE1LnamLastName(String e1LnamLastName) {
        this.e1LnamLastName = e1LnamLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emdww1PWwFirstGenMgrAndName that = (Emdww1PWwFirstGenMgrAndName) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (e1PyrProcessingYear != null ? !e1PyrProcessingYear.equals(that.e1PyrProcessingYear) : that.e1PyrProcessingYear != null)
            return false;
        if (e1PmoProcessingMonth != null ? !e1PmoProcessingMonth.equals(that.e1PmoProcessingMonth) : that.e1PmoProcessingMonth != null)
            return false;
        if (e1CntyIsoCountryCode != null ? !e1CntyIsoCountryCode.equals(that.e1CntyIsoCountryCode) : that.e1CntyIsoCountryCode != null)
            return false;
        if (e11Cc1StGenCc != null ? !e11Cc1StGenCc.equals(that.e11Cc1StGenCc) : that.e11Cc1StGenCc != null)
            return false;
        if (e11Id1StGenId != null ? !e11Id1StGenId.equals(that.e11Id1StGenId) : that.e11Id1StGenId != null)
            return false;
        if (e1FnamFirstName != null ? !e1FnamFirstName.equals(that.e1FnamFirstName) : that.e1FnamFirstName != null)
            return false;
        if (e1LnamLastName != null ? !e1LnamLastName.equals(that.e1LnamLastName) : that.e1LnamLastName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (e1PyrProcessingYear != null ? e1PyrProcessingYear.hashCode() : 0);
        result = 31 * result + (e1PmoProcessingMonth != null ? e1PmoProcessingMonth.hashCode() : 0);
        result = 31 * result + (e1CntyIsoCountryCode != null ? e1CntyIsoCountryCode.hashCode() : 0);
        result = 31 * result + (e11Cc1StGenCc != null ? e11Cc1StGenCc.hashCode() : 0);
        result = 31 * result + (e11Id1StGenId != null ? e11Id1StGenId.hashCode() : 0);
        result = 31 * result + (e1FnamFirstName != null ? e1FnamFirstName.hashCode() : 0);
        result = 31 * result + (e1LnamLastName != null ? e1LnamLastName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"Emdww1PWwFirstGenMgrAndName\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"e1PyrProcessingYear\":\"" + e1PyrProcessingYear + "\""
                + ",                         \"e1PmoProcessingMonth\":\"" + e1PmoProcessingMonth + "\""
                + ",                         \"e1CntyIsoCountryCode\":\"" + e1CntyIsoCountryCode + "\""
                + ",                         \"e11Cc1StGenCc\":\"" + e11Cc1StGenCc + "\""
                + ",                         \"e11Id1StGenId\":\"" + e11Id1StGenId + "\""
                + ",                         \"e1FnamFirstName\":\"" + e1FnamFirstName + "\""
                + ",                         \"e1LnamLastName\":\"" + e1LnamLastName + "\""
                + "}}";
    }

    public Emdww1PWwFirstGenMgrAndName copy() {
        Emdww1PWwFirstGenMgrAndName e1 = new Emdww1PWwFirstGenMgrAndName();
        e1.e1PyrProcessingYear = e1PyrProcessingYear;
        e1.e1PmoProcessingMonth = e1PmoProcessingMonth;
        e1.e1CntyIsoCountryCode = e1CntyIsoCountryCode;
        e1.e11Cc1StGenCc = e11Cc1StGenCc;
        e1.e11Id1StGenId = e11Id1StGenId;
        e1.e1FnamFirstName = e1FnamFirstName;
        e1.e1LnamLastName = e1LnamLastName;
        return e1;
    }


}
