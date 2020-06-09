package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("WMVUP3")

public class Wmvup3 implements Serializable {
    private Long id;
    private String cnty;
    private String bonmvup;
    private String eimvup;
    private Integer levl;
    private String eldsc;
    private String bldsc;
    private String dslnamLastName;
    private String disship;
    private String spnship;
    private String id12DigitDistributorId;
    private String dslprfLangPrefCode;
    private Long dsareaArea;
    private String email;
    private Integer yr;
    private Integer mo;
    private String einbr;
    private Integer eiqfyr;
    private Integer eiqfmo;
    private Integer eifchkyr;
    private Integer eifchkmo;
    private Integer eiexpyr;
    private Integer eiexpmo;
    private String eirqfy;
    private String dsadd1AddressLine1;
    private String dsadd2AddressLine2;
    private String dsadd3AddressLine3;
    private String dsadd4AddressLine4;
    private String dscityCity;
    private String dsstatState;
    private String dszipcZipCode;
    private Long dsphonPhone;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "CNTY", nullable = true, length = 15)
    public String getCnty() {
        return cnty;
    }

    public void setCnty(String cnty) {
        this.cnty = cnty;
    }

    // @Basic
    // @Column(name = "BONMVUP", nullable = true, length = 1)
    public String getBonmvup() {
        return bonmvup;
    }

    public void setBonmvup(String bonmvup) {
        this.bonmvup = bonmvup;
    }

    // @Basic
    // @Column(name = "EIMVUP", nullable = true, length = 1)
    public String getEimvup() {
        return eimvup;
    }

    public void setEimvup(String eimvup) {
        this.eimvup = eimvup;
    }

    // @Basic
    // @Column(name = "LEVL", nullable = true)
    public Integer getLevl() {
        return levl;
    }

    public void setLevl(Integer levl) {
        this.levl = levl;
    }

    // @Basic
    // @Column(name = "ELDSC", nullable = true, length = 35)
    public String getEldsc() {
        return eldsc;
    }

    public void setEldsc(String eldsc) {
        this.eldsc = eldsc;
    }

    // @Basic
    // @Column(name = "BLDSC", nullable = true, length = 35)
    public String getBldsc() {
        return bldsc;
    }

    public void setBldsc(String bldsc) {
        this.bldsc = bldsc;
    }

    // @Basic
    // @Column(name = "DSLNAM_LastName", nullable = true, length = 255)
    public String getDslnamLastName() {
        return dslnamLastName;
    }

    public void setDslnamLastName(String dslnamLastName) {
        this.dslnamLastName = dslnamLastName;
    }

    // @Basic
    // @Column(name = "DISSHIP", nullable = true, length = 255)
    public String getDisship() {
        return disship;
    }

    public void setDisship(String disship) {
        this.disship = disship;
    }

    // @Basic
    // @Column(name = "SPNSHIP", nullable = true, length = 255)
    public String getSpnship() {
        return spnship;
    }

    public void setSpnship(String spnship) {
        this.spnship = spnship;
    }

    // @Basic
    // @Column(name = "ID_12DigitDistributorId", nullable = true, length = 50)
    public String getId12DigitDistributorId() {
        return id12DigitDistributorId;
    }

    public void setId12DigitDistributorId(String id12DigitDistributorId) {
        this.id12DigitDistributorId = id12DigitDistributorId;
    }

    // @Basic
    // @Column(name = "DSLPRF_LangPrefCode", nullable = true, length = 1)
    public String getDslprfLangPrefCode() {
        return dslprfLangPrefCode;
    }

    public void setDslprfLangPrefCode(String dslprfLangPrefCode) {
        this.dslprfLangPrefCode = dslprfLangPrefCode;
    }

    // @Basic
    // @Column(name = "DSAREA_Area", nullable = true)
    public Long getDsareaArea() {
        return dsareaArea;
    }

    public void setDsareaArea(Long dsareaArea) {
        this.dsareaArea = dsareaArea;
    }

    // @Basic
    // @Column(name = "EMAIL", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // @Basic
    // @Column(name = "YR", nullable = true)
    public Integer getYr() {
        return yr;
    }

    public void setYr(Integer yr) {
        this.yr = yr;
    }

    // @Basic
    // @Column(name = "MO", nullable = true)
    public Integer getMo() {
        return mo;
    }

    public void setMo(Integer mo) {
        this.mo = mo;
    }

    // @Basic
    // @Column(name = "EINBR", nullable = true, length = 1)
    public String getEinbr() {
        return einbr;
    }

    public void setEinbr(String einbr) {
        this.einbr = einbr;
    }

    // @Basic
    // @Column(name = "EIQFYR", nullable = true)
    public Integer getEiqfyr() {
        return eiqfyr;
    }

    public void setEiqfyr(Integer eiqfyr) {
        this.eiqfyr = eiqfyr;
    }

    // @Basic
    // @Column(name = "EIQFMO", nullable = true)
    public Integer getEiqfmo() {
        return eiqfmo;
    }

    public void setEiqfmo(Integer eiqfmo) {
        this.eiqfmo = eiqfmo;
    }

    // @Basic
    // @Column(name = "EIFCHKYR", nullable = true)
    public Integer getEifchkyr() {
        return eifchkyr;
    }

    public void setEifchkyr(Integer eifchkyr) {
        this.eifchkyr = eifchkyr;
    }

    // @Basic
    // @Column(name = "EIFCHKMO", nullable = true)
    public Integer getEifchkmo() {
        return eifchkmo;
    }

    public void setEifchkmo(Integer eifchkmo) {
        this.eifchkmo = eifchkmo;
    }

    // @Basic
    // @Column(name = "EIEXPYR", nullable = true)
    public Integer getEiexpyr() {
        return eiexpyr;
    }

    public void setEiexpyr(Integer eiexpyr) {
        this.eiexpyr = eiexpyr;
    }

    // @Basic
    // @Column(name = "EIEXPMO", nullable = true)
    public Integer getEiexpmo() {
        return eiexpmo;
    }

    public void setEiexpmo(Integer eiexpmo) {
        this.eiexpmo = eiexpmo;
    }

    // @Basic
    // @Column(name = "EIRQFY", nullable = true, length = 1)
    public String getEirqfy() {
        return eirqfy;
    }

    public void setEirqfy(String eirqfy) {
        this.eirqfy = eirqfy;
    }

    // @Basic
    // @Column(name = "DSADD1_AddressLine1", nullable = true, length = 255)
    public String getDsadd1AddressLine1() {
        return dsadd1AddressLine1;
    }

    public void setDsadd1AddressLine1(String dsadd1AddressLine1) {
        this.dsadd1AddressLine1 = dsadd1AddressLine1;
    }

    // @Basic
    // @Column(name = "DSADD2_AddressLine2", nullable = true, length = 255)
    public String getDsadd2AddressLine2() {
        return dsadd2AddressLine2;
    }

    public void setDsadd2AddressLine2(String dsadd2AddressLine2) {
        this.dsadd2AddressLine2 = dsadd2AddressLine2;
    }

    // @Basic
    // @Column(name = "DSADD3_AddressLine3", nullable = true, length = 255)
    public String getDsadd3AddressLine3() {
        return dsadd3AddressLine3;
    }

    public void setDsadd3AddressLine3(String dsadd3AddressLine3) {
        this.dsadd3AddressLine3 = dsadd3AddressLine3;
    }

    // @Basic
    // @Column(name = "DSADD4_AddressLine4", nullable = true, length = 255)
    public String getDsadd4AddressLine4() {
        return dsadd4AddressLine4;
    }

    public void setDsadd4AddressLine4(String dsadd4AddressLine4) {
        this.dsadd4AddressLine4 = dsadd4AddressLine4;
    }

    // @Basic
    // @Column(name = "DSCITY_City", nullable = true, length = 35)
    public String getDscityCity() {
        return dscityCity;
    }

    public void setDscityCity(String dscityCity) {
        this.dscityCity = dscityCity;
    }

    // @Basic
    // @Column(name = "DSSTAT_State", nullable = true, length = 35)
    public String getDsstatState() {
        return dsstatState;
    }

    public void setDsstatState(String dsstatState) {
        this.dsstatState = dsstatState;
    }

    // @Basic
    // @Column(name = "DSZIPC_ZipCode", nullable = true, length = 35)
    public String getDszipcZipCode() {
        return dszipcZipCode;
    }

    public void setDszipcZipCode(String dszipcZipCode) {
        this.dszipcZipCode = dszipcZipCode;
    }

    // @Basic
    // @Column(name = "DSPHON_Phone", nullable = true)
    public Long getDsphonPhone() {
        return dsphonPhone;
    }

    public void setDsphonPhone(Long dsphonPhone) {
        this.dsphonPhone = dsphonPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wmvup3 wmvup3 = (Wmvup3) o;

        if (id != null ? !id.equals(wmvup3.id) : wmvup3.id != null) return false;
        if (cnty != null ? !cnty.equals(wmvup3.cnty) : wmvup3.cnty != null) return false;
        if (bonmvup != null ? !bonmvup.equals(wmvup3.bonmvup) : wmvup3.bonmvup != null) return false;
        if (eimvup != null ? !eimvup.equals(wmvup3.eimvup) : wmvup3.eimvup != null) return false;
        if (levl != null ? !levl.equals(wmvup3.levl) : wmvup3.levl != null) return false;
        if (eldsc != null ? !eldsc.equals(wmvup3.eldsc) : wmvup3.eldsc != null) return false;
        if (bldsc != null ? !bldsc.equals(wmvup3.bldsc) : wmvup3.bldsc != null) return false;
        if (dslnamLastName != null ? !dslnamLastName.equals(wmvup3.dslnamLastName) : wmvup3.dslnamLastName != null)
            return false;
        if (disship != null ? !disship.equals(wmvup3.disship) : wmvup3.disship != null) return false;
        if (spnship != null ? !spnship.equals(wmvup3.spnship) : wmvup3.spnship != null) return false;
        if (id12DigitDistributorId != null ? !id12DigitDistributorId.equals(wmvup3.id12DigitDistributorId) : wmvup3.id12DigitDistributorId != null)
            return false;
        if (dslprfLangPrefCode != null ? !dslprfLangPrefCode.equals(wmvup3.dslprfLangPrefCode) : wmvup3.dslprfLangPrefCode != null)
            return false;
        if (dsareaArea != null ? !dsareaArea.equals(wmvup3.dsareaArea) : wmvup3.dsareaArea != null) return false;
        if (email != null ? !email.equals(wmvup3.email) : wmvup3.email != null) return false;
        if (yr != null ? !yr.equals(wmvup3.yr) : wmvup3.yr != null) return false;
        if (mo != null ? !mo.equals(wmvup3.mo) : wmvup3.mo != null) return false;
        if (einbr != null ? !einbr.equals(wmvup3.einbr) : wmvup3.einbr != null) return false;
        if (eiqfyr != null ? !eiqfyr.equals(wmvup3.eiqfyr) : wmvup3.eiqfyr != null) return false;
        if (eiqfmo != null ? !eiqfmo.equals(wmvup3.eiqfmo) : wmvup3.eiqfmo != null) return false;
        if (eifchkyr != null ? !eifchkyr.equals(wmvup3.eifchkyr) : wmvup3.eifchkyr != null) return false;
        if (eifchkmo != null ? !eifchkmo.equals(wmvup3.eifchkmo) : wmvup3.eifchkmo != null) return false;
        if (eiexpyr != null ? !eiexpyr.equals(wmvup3.eiexpyr) : wmvup3.eiexpyr != null) return false;
        if (eiexpmo != null ? !eiexpmo.equals(wmvup3.eiexpmo) : wmvup3.eiexpmo != null) return false;
        if (eirqfy != null ? !eirqfy.equals(wmvup3.eirqfy) : wmvup3.eirqfy != null) return false;
        if (dsadd1AddressLine1 != null ? !dsadd1AddressLine1.equals(wmvup3.dsadd1AddressLine1) : wmvup3.dsadd1AddressLine1 != null)
            return false;
        if (dsadd2AddressLine2 != null ? !dsadd2AddressLine2.equals(wmvup3.dsadd2AddressLine2) : wmvup3.dsadd2AddressLine2 != null)
            return false;
        if (dsadd3AddressLine3 != null ? !dsadd3AddressLine3.equals(wmvup3.dsadd3AddressLine3) : wmvup3.dsadd3AddressLine3 != null)
            return false;
        if (dsadd4AddressLine4 != null ? !dsadd4AddressLine4.equals(wmvup3.dsadd4AddressLine4) : wmvup3.dsadd4AddressLine4 != null)
            return false;
        if (dscityCity != null ? !dscityCity.equals(wmvup3.dscityCity) : wmvup3.dscityCity != null) return false;
        if (dsstatState != null ? !dsstatState.equals(wmvup3.dsstatState) : wmvup3.dsstatState != null) return false;
        if (dszipcZipCode != null ? !dszipcZipCode.equals(wmvup3.dszipcZipCode) : wmvup3.dszipcZipCode != null)
            return false;
        if (dsphonPhone != null ? !dsphonPhone.equals(wmvup3.dsphonPhone) : wmvup3.dsphonPhone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cnty != null ? cnty.hashCode() : 0);
        result = 31 * result + (bonmvup != null ? bonmvup.hashCode() : 0);
        result = 31 * result + (eimvup != null ? eimvup.hashCode() : 0);
        result = 31 * result + (levl != null ? levl.hashCode() : 0);
        result = 31 * result + (eldsc != null ? eldsc.hashCode() : 0);
        result = 31 * result + (bldsc != null ? bldsc.hashCode() : 0);
        result = 31 * result + (dslnamLastName != null ? dslnamLastName.hashCode() : 0);
        result = 31 * result + (disship != null ? disship.hashCode() : 0);
        result = 31 * result + (spnship != null ? spnship.hashCode() : 0);
        result = 31 * result + (id12DigitDistributorId != null ? id12DigitDistributorId.hashCode() : 0);
        result = 31 * result + (dslprfLangPrefCode != null ? dslprfLangPrefCode.hashCode() : 0);
        result = 31 * result + (dsareaArea != null ? dsareaArea.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (yr != null ? yr.hashCode() : 0);
        result = 31 * result + (mo != null ? mo.hashCode() : 0);
        result = 31 * result + (einbr != null ? einbr.hashCode() : 0);
        result = 31 * result + (eiqfyr != null ? eiqfyr.hashCode() : 0);
        result = 31 * result + (eiqfmo != null ? eiqfmo.hashCode() : 0);
        result = 31 * result + (eifchkyr != null ? eifchkyr.hashCode() : 0);
        result = 31 * result + (eifchkmo != null ? eifchkmo.hashCode() : 0);
        result = 31 * result + (eiexpyr != null ? eiexpyr.hashCode() : 0);
        result = 31 * result + (eiexpmo != null ? eiexpmo.hashCode() : 0);
        result = 31 * result + (eirqfy != null ? eirqfy.hashCode() : 0);
        result = 31 * result + (dsadd1AddressLine1 != null ? dsadd1AddressLine1.hashCode() : 0);
        result = 31 * result + (dsadd2AddressLine2 != null ? dsadd2AddressLine2.hashCode() : 0);
        result = 31 * result + (dsadd3AddressLine3 != null ? dsadd3AddressLine3.hashCode() : 0);
        result = 31 * result + (dsadd4AddressLine4 != null ? dsadd4AddressLine4.hashCode() : 0);
        result = 31 * result + (dscityCity != null ? dscityCity.hashCode() : 0);
        result = 31 * result + (dsstatState != null ? dsstatState.hashCode() : 0);
        result = 31 * result + (dszipcZipCode != null ? dszipcZipCode.hashCode() : 0);
        result = 31 * result + (dsphonPhone != null ? dsphonPhone.hashCode() : 0);
        return result;
    }

    public String toCSV() {
        return
                "\"" + cnty + "\"" + "," +
                        "\"" + bonmvup + "\"" + "," +
                        "\"" + eimvup + "\"" + "," +
                        +levl + "," +
                        "\"" + eldsc + "\"" + "," +
                        "\"" + bldsc + "\"" + "," +
                        "\"" + dslnamLastName + "\"" + "," +
                        "\"" + disship + "\"" + "," +
                        "\"" + spnship + "\"" + "," +
                        "\"" + id12DigitDistributorId + "\"" + "," +
                        "\"" + dslprfLangPrefCode + "\"" + "," +
                        +dsareaArea + "," +
                        "\"" + email + "\"" + "," +
                        +yr + "," +
                        +mo + "," +
                        "\"" + einbr + "\"" + "," +
                        +eiqfyr + "," +
                        +eiqfmo + "," +
                        +eifchkyr + "," +
                        +eifchkmo + "," +
                        +eiexpyr + "," +
                        +eiexpmo + "," +
                        "\"" + eirqfy + "\"" + "," +
                        "\"" + dsadd1AddressLine1 + "\"" + "," +
                        "\"" + dsadd2AddressLine2 + "\"" + "," +
                        "\"" + dsadd3AddressLine3 + "\"" + "," +
                        "\"" + dsadd4AddressLine4 + "\"" + "," +
                        "\"" + dscityCity + "\"" + "," +
                        "\"" + dsstatState + "\"" + "," +
                        "\"" + dszipcZipCode + "\"" + "," +
                        +dsphonPhone + "\r\n";
    }

    @Override
    public String toString() {
        return "{\"Wmvup3\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"cnty\":\"" + cnty + "\""
                + ",                         \"bonmvup\":\"" + bonmvup + "\""
                + ",                         \"eimvup\":\"" + eimvup + "\""
                + ",                         \"levl\":\"" + levl + "\""
                + ",                         \"eldsc\":\"" + eldsc + "\""
                + ",                         \"bldsc\":\"" + bldsc + "\""
                + ",                         \"dslnamLastName\":\"" + dslnamLastName + "\""
                + ",                         \"disship\":\"" + disship + "\""
                + ",                         \"spnship\":\"" + spnship + "\""
                + ",                         \"id12DigitDistributorId\":\"" + id12DigitDistributorId + "\""
                + ",                         \"dslprfLangPrefCode\":\"" + dslprfLangPrefCode + "\""
                + ",                         \"dsareaArea\":\"" + dsareaArea + "\""
                + ",                         \"email\":\"" + email + "\""
                + ",                         \"yr\":\"" + yr + "\""
                + ",                         \"mo\":\"" + mo + "\""
                + ",                         \"einbr\":\"" + einbr + "\""
                + ",                         \"eiqfyr\":\"" + eiqfyr + "\""
                + ",                         \"eiqfmo\":\"" + eiqfmo + "\""
                + ",                         \"eifchkyr\":\"" + eifchkyr + "\""
                + ",                         \"eifchkmo\":\"" + eifchkmo + "\""
                + ",                         \"eiexpyr\":\"" + eiexpyr + "\""
                + ",                         \"eiexpmo\":\"" + eiexpmo + "\""
                + ",                         \"eirqfy\":\"" + eirqfy + "\""
                + ",                         \"dsadd1AddressLine1\":\"" + dsadd1AddressLine1 + "\""
                + ",                         \"dsadd2AddressLine2\":\"" + dsadd2AddressLine2 + "\""
                + ",                         \"dsadd3AddressLine3\":\"" + dsadd3AddressLine3 + "\""
                + ",                         \"dsadd4AddressLine4\":\"" + dsadd4AddressLine4 + "\""
                + ",                         \"dscityCity\":\"" + dscityCity + "\""
                + ",                         \"dsstatState\":\"" + dsstatState + "\""
                + ",                         \"dszipcZipCode\":\"" + dszipcZipCode + "\""
                + ",                         \"dsphonPhone\":\"" + dsphonPhone + "\""
                + "}}";
    }
}
