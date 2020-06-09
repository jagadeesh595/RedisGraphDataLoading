package com.ns.dataloading.entityredis.entity;


import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("WMVUP2")

public class Wmvup2 implements Serializable {
    private Long id;
    private String cntyCountry;
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

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "CNTY_Country", nullable = true, length = 15)
    public String getCntyCountry() {
        return cntyCountry;
    }

    public void setCntyCountry(String cntyCountry) {
        this.cntyCountry = cntyCountry;
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
    // @Column(name = "DSLNAM_LastName", nullable = true, length = 35)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wmvup2 wmvup2 = (Wmvup2) o;

        if (id != null ? !id.equals(wmvup2.id) : wmvup2.id != null) return false;
        if (cntyCountry != null ? !cntyCountry.equals(wmvup2.cntyCountry) : wmvup2.cntyCountry != null) return false;
        if (bonmvup != null ? !bonmvup.equals(wmvup2.bonmvup) : wmvup2.bonmvup != null) return false;
        if (eimvup != null ? !eimvup.equals(wmvup2.eimvup) : wmvup2.eimvup != null) return false;
        if (levl != null ? !levl.equals(wmvup2.levl) : wmvup2.levl != null) return false;
        if (eldsc != null ? !eldsc.equals(wmvup2.eldsc) : wmvup2.eldsc != null) return false;
        if (bldsc != null ? !bldsc.equals(wmvup2.bldsc) : wmvup2.bldsc != null) return false;
        if (dslnamLastName != null ? !dslnamLastName.equals(wmvup2.dslnamLastName) : wmvup2.dslnamLastName != null)
            return false;
        if (disship != null ? !disship.equals(wmvup2.disship) : wmvup2.disship != null) return false;
        if (spnship != null ? !spnship.equals(wmvup2.spnship) : wmvup2.spnship != null) return false;
        if (id12DigitDistributorId != null ? !id12DigitDistributorId.equals(wmvup2.id12DigitDistributorId) : wmvup2.id12DigitDistributorId != null)
            return false;
        if (dslprfLangPrefCode != null ? !dslprfLangPrefCode.equals(wmvup2.dslprfLangPrefCode) : wmvup2.dslprfLangPrefCode != null)
            return false;
        if (dsareaArea != null ? !dsareaArea.equals(wmvup2.dsareaArea) : wmvup2.dsareaArea != null) return false;
        if (email != null ? !email.equals(wmvup2.email) : wmvup2.email != null) return false;
        if (yr != null ? !yr.equals(wmvup2.yr) : wmvup2.yr != null) return false;
        if (mo != null ? !mo.equals(wmvup2.mo) : wmvup2.mo != null) return false;
        if (einbr != null ? !einbr.equals(wmvup2.einbr) : wmvup2.einbr != null) return false;
        if (eiqfyr != null ? !eiqfyr.equals(wmvup2.eiqfyr) : wmvup2.eiqfyr != null) return false;
        if (eiqfmo != null ? !eiqfmo.equals(wmvup2.eiqfmo) : wmvup2.eiqfmo != null) return false;
        if (eifchkyr != null ? !eifchkyr.equals(wmvup2.eifchkyr) : wmvup2.eifchkyr != null) return false;
        if (eifchkmo != null ? !eifchkmo.equals(wmvup2.eifchkmo) : wmvup2.eifchkmo != null) return false;
        if (eiexpyr != null ? !eiexpyr.equals(wmvup2.eiexpyr) : wmvup2.eiexpyr != null) return false;
        if (eiexpmo != null ? !eiexpmo.equals(wmvup2.eiexpmo) : wmvup2.eiexpmo != null) return false;
        if (eirqfy != null ? !eirqfy.equals(wmvup2.eirqfy) : wmvup2.eirqfy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (cntyCountry != null ? cntyCountry.hashCode() : 0);
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
        return result;
    }

    public String toCSV() {
        return
                "\"" + cntyCountry + "\"" + "," +
                        "\"" + bonmvup + "\"" + "," +
                        "\"" + eimvup + "\"" + ","
                        + levl + "," +
                        "\"" + eldsc + "\"" + "," +
                        "\"" + bldsc + "\"" + "," +
                        "\"" + dslnamLastName + "\"" + "," +
                        "\"" + disship + "\"" + "," +
                        "\"" + spnship + "\"" + "," +
                        "\"" + id12DigitDistributorId + "\"" + "," +
                        "\"" + dslprfLangPrefCode + "\"" + "," +
                        "\"" + dsareaArea + "\"" + "," +
                        "\"" + email + "\"" + ","
                        + yr + ","
                        + mo + "," +
                        "\"" + einbr + "\"" + ","
                        + eiqfyr + ","
                        + eiqfmo + ","
                        + eifchkyr + ","
                        + eifchkmo + ","
                        + eiexpyr + ","
                        + eiexpmo + "," +
                        "\"" + eirqfy + "\r\n";
    }

    @Override
    public String toString() {
        return "{\"Wmvup2\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"cntyCountry\":\"" + cntyCountry + "\""
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
                + "}}";
    }
}
