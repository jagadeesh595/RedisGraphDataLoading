package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "WMVUP1")
public class Wmvup1 {
    private Long id;
    private String id12DigitDistributorId;
    private Long ctlDistributorControl;
    private Long spnSponsorControl;
    private Integer levlLevel;
    private Integer blvlBeginingLevel;
    private Integer bmgrlMgrLevel;
    private Integer bgmlvGemLevel;
    private String bldsc;
    private Integer elvlLevel;
    private Integer emgrlManagerLevel;
    private Integer egmlvGemManagerLevel;
    private String eldsc;
    private Integer yr;
    private Integer mo;
    private String cntyCountry;
    private String bonmvup;
    private String eimvup;
    private String name;
    private String spname;
    private Long dsareaArea;
    private String dslprfLangPrefCode;
    private String dslnamLastName;
    private String dsfnamFirstName;
    private String disship;
    private String spnship;
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
    private Long dsphonPhoneNumber;
    private String email;

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
    @Column(name = "ID_12DigitDistributorId", nullable = true, length = 15)
    public String getId12DigitDistributorId() {
        return id12DigitDistributorId;
    }

    public void setId12DigitDistributorId(String id12DigitDistributorId) {
        this.id12DigitDistributorId = id12DigitDistributorId;
    }

    @Basic
    @Column(name = "CTL_DistributorControl", nullable = false)
    public Long getCtlDistributorControl() {
        return ctlDistributorControl;
    }

    public void setCtlDistributorControl(Long ctlDistributorControl) {
        this.ctlDistributorControl = ctlDistributorControl;
    }

    @Basic
    @Column(name = "SPN_SponsorControl", nullable = true)
    public Long getSpnSponsorControl() {
        return spnSponsorControl;
    }

    public void setSpnSponsorControl(Long spnSponsorControl) {
        this.spnSponsorControl = spnSponsorControl;
    }

    @Basic
    @Column(name = "LEVL_Level", nullable = true)
    public Integer getLevlLevel() {
        return levlLevel;
    }

    public void setLevlLevel(Integer levlLevel) {
        this.levlLevel = levlLevel;
    }

    @Basic
    @Column(name = "BLVL_BeginingLevel", nullable = true)
    public Integer getBlvlBeginingLevel() {
        return blvlBeginingLevel;
    }

    public void setBlvlBeginingLevel(Integer blvlBeginingLevel) {
        this.blvlBeginingLevel = blvlBeginingLevel;
    }

    @Basic
    @Column(name = "BMGRL_MgrLevel", nullable = true)
    public Integer getBmgrlMgrLevel() {
        return bmgrlMgrLevel;
    }

    public void setBmgrlMgrLevel(Integer bmgrlMgrLevel) {
        this.bmgrlMgrLevel = bmgrlMgrLevel;
    }

    @Basic
    @Column(name = "BGMLV_GemLevel", nullable = true)
    public Integer getBgmlvGemLevel() {
        return bgmlvGemLevel;
    }

    public void setBgmlvGemLevel(Integer bgmlvGemLevel) {
        this.bgmlvGemLevel = bgmlvGemLevel;
    }

    @Basic
    @Column(name = "BLDSC", nullable = true, length = 30)
    public String getBldsc() {
        return bldsc;
    }

    public void setBldsc(String bldsc) {
        this.bldsc = bldsc;
    }

    @Basic
    @Column(name = "ELVL_Level", nullable = true)
    public Integer getElvlLevel() {
        return elvlLevel;
    }

    public void setElvlLevel(Integer elvlLevel) {
        this.elvlLevel = elvlLevel;
    }

    @Basic
    @Column(name = "EMGRL_ManagerLevel", nullable = true)
    public Integer getEmgrlManagerLevel() {
        return emgrlManagerLevel;
    }

    public void setEmgrlManagerLevel(Integer emgrlManagerLevel) {
        this.emgrlManagerLevel = emgrlManagerLevel;
    }

    @Basic
    @Column(name = "EGMLV_GemManagerLevel", nullable = true)
    public Integer getEgmlvGemManagerLevel() {
        return egmlvGemManagerLevel;
    }

    public void setEgmlvGemManagerLevel(Integer egmlvGemManagerLevel) {
        this.egmlvGemManagerLevel = egmlvGemManagerLevel;
    }

    @Basic
    @Column(name = "ELDSC", nullable = true, length = 30)
    public String getEldsc() {
        return eldsc;
    }

    public void setEldsc(String eldsc) {
        this.eldsc = eldsc;
    }

    @Basic
    @Column(name = "YR", nullable = true)
    public Integer getYr() {
        return yr;
    }

    public void setYr(Integer yr) {
        this.yr = yr;
    }

    @Basic
    @Column(name = "MO", nullable = true)
    public Integer getMo() {
        return mo;
    }

    public void setMo(Integer mo) {
        this.mo = mo;
    }

    @Basic
    @Column(name = "CNTY_Country", nullable = true, length = 15)
    public String getCntyCountry() {
        return cntyCountry;
    }

    public void setCntyCountry(String cntyCountry) {
        this.cntyCountry = cntyCountry;
    }

    @Basic
    @Column(name = "BONMVUP", nullable = true, length = 1)
    public String getBonmvup() {
        return bonmvup;
    }

    public void setBonmvup(String bonmvup) {
        this.bonmvup = bonmvup;
    }

    @Basic
    @Column(name = "EIMVUP", nullable = true, length = 1)
    public String getEimvup() {
        return eimvup;
    }

    public void setEimvup(String eimvup) {
        this.eimvup = eimvup;
    }

    @Basic
    @Column(name = "NAME", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "SPNAME", nullable = true, length = 255)
    public String getSpname() {
        return spname;
    }

    public void setSpname(String spname) {
        this.spname = spname;
    }

    @Basic
    @Column(name = "DSAREA_Area", nullable = true)
    public Long getDsareaArea() {
        return dsareaArea;
    }

    public void setDsareaArea(Long dsareaArea) {
        this.dsareaArea = dsareaArea;
    }

    @Basic
    @Column(name = "DSLPRF_LangPrefCode", nullable = true, length = 1)
    public String getDslprfLangPrefCode() {
        return dslprfLangPrefCode;
    }

    public void setDslprfLangPrefCode(String dslprfLangPrefCode) {
        this.dslprfLangPrefCode = dslprfLangPrefCode;
    }

    @Basic
    @Column(name = "DSLNAM_LastName", nullable = true, length = 30)
    public String getDslnamLastName() {
        return dslnamLastName;
    }

    public void setDslnamLastName(String dslnamLastName) {
        this.dslnamLastName = dslnamLastName;
    }

    @Basic
    @Column(name = "DSFNAM_FirstName", nullable = true, length = 30)
    public String getDsfnamFirstName() {
        return dsfnamFirstName;
    }

    public void setDsfnamFirstName(String dsfnamFirstName) {
        this.dsfnamFirstName = dsfnamFirstName;
    }

    @Basic
    @Column(name = "DISSHIP", nullable = true, length = 255)
    public String getDisship() {
        return disship;
    }

    public void setDisship(String disship) {
        this.disship = disship;
    }

    @Basic
    @Column(name = "SPNSHIP", nullable = true, length = 255)
    public String getSpnship() {
        return spnship;
    }

    public void setSpnship(String spnship) {
        this.spnship = spnship;
    }

    @Basic
    @Column(name = "EINBR", nullable = true, length = 1)
    public String getEinbr() {
        return einbr;
    }

    public void setEinbr(String einbr) {
        this.einbr = einbr;
    }

    @Basic
    @Column(name = "EIQFYR", nullable = true)
    public Integer getEiqfyr() {
        return eiqfyr;
    }

    public void setEiqfyr(Integer eiqfyr) {
        this.eiqfyr = eiqfyr;
    }

    @Basic
    @Column(name = "EIQFMO", nullable = true)
    public Integer getEiqfmo() {
        return eiqfmo;
    }

    public void setEiqfmo(Integer eiqfmo) {
        this.eiqfmo = eiqfmo;
    }

    @Basic
    @Column(name = "EIFCHKYR", nullable = true)
    public Integer getEifchkyr() {
        return eifchkyr;
    }

    public void setEifchkyr(Integer eifchkyr) {
        this.eifchkyr = eifchkyr;
    }

    @Basic
    @Column(name = "EIFCHKMO", nullable = true)
    public Integer getEifchkmo() {
        return eifchkmo;
    }

    public void setEifchkmo(Integer eifchkmo) {
        this.eifchkmo = eifchkmo;
    }

    @Basic
    @Column(name = "EIEXPYR", nullable = true)
    public Integer getEiexpyr() {
        return eiexpyr;
    }

    public void setEiexpyr(Integer eiexpyr) {
        this.eiexpyr = eiexpyr;
    }

    @Basic
    @Column(name = "EIEXPMO", nullable = true)
    public Integer getEiexpmo() {
        return eiexpmo;
    }

    public void setEiexpmo(Integer eiexpmo) {
        this.eiexpmo = eiexpmo;
    }

    @Basic
    @Column(name = "EIRQFY", nullable = true, length = 1)
    public String getEirqfy() {
        return eirqfy;
    }

    public void setEirqfy(String eirqfy) {
        this.eirqfy = eirqfy;
    }

    @Basic
    @Column(name = "DSADD1_AddressLine1", nullable = true, length = 255)
    public String getDsadd1AddressLine1() {
        return dsadd1AddressLine1;
    }

    public void setDsadd1AddressLine1(String dsadd1AddressLine1) {
        this.dsadd1AddressLine1 = dsadd1AddressLine1;
    }

    @Basic
    @Column(name = "DSADD2_AddressLine2", nullable = true, length = 255)
    public String getDsadd2AddressLine2() {
        return dsadd2AddressLine2;
    }

    public void setDsadd2AddressLine2(String dsadd2AddressLine2) {
        this.dsadd2AddressLine2 = dsadd2AddressLine2;
    }

    @Basic
    @Column(name = "DSADD3_AddressLine3", nullable = true, length = 255)
    public String getDsadd3AddressLine3() {
        return dsadd3AddressLine3;
    }

    public void setDsadd3AddressLine3(String dsadd3AddressLine3) {
        this.dsadd3AddressLine3 = dsadd3AddressLine3;
    }

    @Basic
    @Column(name = "DSADD4_AddressLine4", nullable = true, length = 255)
    public String getDsadd4AddressLine4() {
        return dsadd4AddressLine4;
    }

    public void setDsadd4AddressLine4(String dsadd4AddressLine4) {
        this.dsadd4AddressLine4 = dsadd4AddressLine4;
    }

    @Basic
    @Column(name = "DSCITY_City", nullable = true, length = 255)
    public String getDscityCity() {
        return dscityCity;
    }

    public void setDscityCity(String dscityCity) {
        this.dscityCity = dscityCity;
    }

    @Basic
    @Column(name = "DSSTAT_State", nullable = true, length = 255)
    public String getDsstatState() {
        return dsstatState;
    }

    public void setDsstatState(String dsstatState) {
        this.dsstatState = dsstatState;
    }

    @Basic
    @Column(name = "DSZIPC_ZipCode", nullable = true, length = 255)
    public String getDszipcZipCode() {
        return dszipcZipCode;
    }

    public void setDszipcZipCode(String dszipcZipCode) {
        this.dszipcZipCode = dszipcZipCode;
    }

    @Basic
    @Column(name = "DSPHON_PhoneNumber", nullable = true)
    public Long getDsphonPhoneNumber() {
        return dsphonPhoneNumber;
    }

    public void setDsphonPhoneNumber(Long dsphonPhoneNumber) {
        this.dsphonPhoneNumber = dsphonPhoneNumber;
    }

    @Basic
    @Column(name = "EMAIL", nullable = true, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wmvup1 wmvup1 = (Wmvup1) o;

        if (id != null ? !id.equals(wmvup1.id) : wmvup1.id != null) return false;
        if (id12DigitDistributorId != null ? !id12DigitDistributorId.equals(wmvup1.id12DigitDistributorId) : wmvup1.id12DigitDistributorId != null)
            return false;
        if (ctlDistributorControl != null ? !ctlDistributorControl.equals(wmvup1.ctlDistributorControl) : wmvup1.ctlDistributorControl != null)
            return false;
        if (spnSponsorControl != null ? !spnSponsorControl.equals(wmvup1.spnSponsorControl) : wmvup1.spnSponsorControl != null)
            return false;
        if (levlLevel != null ? !levlLevel.equals(wmvup1.levlLevel) : wmvup1.levlLevel != null) return false;
        if (blvlBeginingLevel != null ? !blvlBeginingLevel.equals(wmvup1.blvlBeginingLevel) : wmvup1.blvlBeginingLevel != null)
            return false;
        if (bmgrlMgrLevel != null ? !bmgrlMgrLevel.equals(wmvup1.bmgrlMgrLevel) : wmvup1.bmgrlMgrLevel != null)
            return false;
        if (bgmlvGemLevel != null ? !bgmlvGemLevel.equals(wmvup1.bgmlvGemLevel) : wmvup1.bgmlvGemLevel != null)
            return false;
        if (bldsc != null ? !bldsc.equals(wmvup1.bldsc) : wmvup1.bldsc != null) return false;
        if (elvlLevel != null ? !elvlLevel.equals(wmvup1.elvlLevel) : wmvup1.elvlLevel != null) return false;
        if (emgrlManagerLevel != null ? !emgrlManagerLevel.equals(wmvup1.emgrlManagerLevel) : wmvup1.emgrlManagerLevel != null)
            return false;
        if (egmlvGemManagerLevel != null ? !egmlvGemManagerLevel.equals(wmvup1.egmlvGemManagerLevel) : wmvup1.egmlvGemManagerLevel != null)
            return false;
        if (eldsc != null ? !eldsc.equals(wmvup1.eldsc) : wmvup1.eldsc != null) return false;
        if (yr != null ? !yr.equals(wmvup1.yr) : wmvup1.yr != null) return false;
        if (mo != null ? !mo.equals(wmvup1.mo) : wmvup1.mo != null) return false;
        if (cntyCountry != null ? !cntyCountry.equals(wmvup1.cntyCountry) : wmvup1.cntyCountry != null) return false;
        if (bonmvup != null ? !bonmvup.equals(wmvup1.bonmvup) : wmvup1.bonmvup != null) return false;
        if (eimvup != null ? !eimvup.equals(wmvup1.eimvup) : wmvup1.eimvup != null) return false;
        if (name != null ? !name.equals(wmvup1.name) : wmvup1.name != null) return false;
        if (spname != null ? !spname.equals(wmvup1.spname) : wmvup1.spname != null) return false;
        if (dsareaArea != null ? !dsareaArea.equals(wmvup1.dsareaArea) : wmvup1.dsareaArea != null) return false;
        if (dslprfLangPrefCode != null ? !dslprfLangPrefCode.equals(wmvup1.dslprfLangPrefCode) : wmvup1.dslprfLangPrefCode != null)
            return false;
        if (dslnamLastName != null ? !dslnamLastName.equals(wmvup1.dslnamLastName) : wmvup1.dslnamLastName != null)
            return false;
        if (dsfnamFirstName != null ? !dsfnamFirstName.equals(wmvup1.dsfnamFirstName) : wmvup1.dsfnamFirstName != null)
            return false;
        if (disship != null ? !disship.equals(wmvup1.disship) : wmvup1.disship != null) return false;
        if (spnship != null ? !spnship.equals(wmvup1.spnship) : wmvup1.spnship != null) return false;
        if (einbr != null ? !einbr.equals(wmvup1.einbr) : wmvup1.einbr != null) return false;
        if (eiqfyr != null ? !eiqfyr.equals(wmvup1.eiqfyr) : wmvup1.eiqfyr != null) return false;
        if (eiqfmo != null ? !eiqfmo.equals(wmvup1.eiqfmo) : wmvup1.eiqfmo != null) return false;
        if (eifchkyr != null ? !eifchkyr.equals(wmvup1.eifchkyr) : wmvup1.eifchkyr != null) return false;
        if (eifchkmo != null ? !eifchkmo.equals(wmvup1.eifchkmo) : wmvup1.eifchkmo != null) return false;
        if (eiexpyr != null ? !eiexpyr.equals(wmvup1.eiexpyr) : wmvup1.eiexpyr != null) return false;
        if (eiexpmo != null ? !eiexpmo.equals(wmvup1.eiexpmo) : wmvup1.eiexpmo != null) return false;
        if (eirqfy != null ? !eirqfy.equals(wmvup1.eirqfy) : wmvup1.eirqfy != null) return false;
        if (dsadd1AddressLine1 != null ? !dsadd1AddressLine1.equals(wmvup1.dsadd1AddressLine1) : wmvup1.dsadd1AddressLine1 != null)
            return false;
        if (dsadd2AddressLine2 != null ? !dsadd2AddressLine2.equals(wmvup1.dsadd2AddressLine2) : wmvup1.dsadd2AddressLine2 != null)
            return false;
        if (dsadd3AddressLine3 != null ? !dsadd3AddressLine3.equals(wmvup1.dsadd3AddressLine3) : wmvup1.dsadd3AddressLine3 != null)
            return false;
        if (dsadd4AddressLine4 != null ? !dsadd4AddressLine4.equals(wmvup1.dsadd4AddressLine4) : wmvup1.dsadd4AddressLine4 != null)
            return false;
        if (dscityCity != null ? !dscityCity.equals(wmvup1.dscityCity) : wmvup1.dscityCity != null) return false;
        if (dsstatState != null ? !dsstatState.equals(wmvup1.dsstatState) : wmvup1.dsstatState != null) return false;
        if (dszipcZipCode != null ? !dszipcZipCode.equals(wmvup1.dszipcZipCode) : wmvup1.dszipcZipCode != null)
            return false;
        if (dsphonPhoneNumber != null ? !dsphonPhoneNumber.equals(wmvup1.dsphonPhoneNumber) : wmvup1.dsphonPhoneNumber != null)
            return false;
        if (email != null ? !email.equals(wmvup1.email) : wmvup1.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (id12DigitDistributorId != null ? id12DigitDistributorId.hashCode() : 0);
        result = 31 * result + (ctlDistributorControl != null ? ctlDistributorControl.hashCode() : 0);
        result = 31 * result + (spnSponsorControl != null ? spnSponsorControl.hashCode() : 0);
        result = 31 * result + (levlLevel != null ? levlLevel.hashCode() : 0);
        result = 31 * result + (blvlBeginingLevel != null ? blvlBeginingLevel.hashCode() : 0);
        result = 31 * result + (bmgrlMgrLevel != null ? bmgrlMgrLevel.hashCode() : 0);
        result = 31 * result + (bgmlvGemLevel != null ? bgmlvGemLevel.hashCode() : 0);
        result = 31 * result + (bldsc != null ? bldsc.hashCode() : 0);
        result = 31 * result + (elvlLevel != null ? elvlLevel.hashCode() : 0);
        result = 31 * result + (emgrlManagerLevel != null ? emgrlManagerLevel.hashCode() : 0);
        result = 31 * result + (egmlvGemManagerLevel != null ? egmlvGemManagerLevel.hashCode() : 0);
        result = 31 * result + (eldsc != null ? eldsc.hashCode() : 0);
        result = 31 * result + (yr != null ? yr.hashCode() : 0);
        result = 31 * result + (mo != null ? mo.hashCode() : 0);
        result = 31 * result + (cntyCountry != null ? cntyCountry.hashCode() : 0);
        result = 31 * result + (bonmvup != null ? bonmvup.hashCode() : 0);
        result = 31 * result + (eimvup != null ? eimvup.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (spname != null ? spname.hashCode() : 0);
        result = 31 * result + (dsareaArea != null ? dsareaArea.hashCode() : 0);
        result = 31 * result + (dslprfLangPrefCode != null ? dslprfLangPrefCode.hashCode() : 0);
        result = 31 * result + (dslnamLastName != null ? dslnamLastName.hashCode() : 0);
        result = 31 * result + (dsfnamFirstName != null ? dsfnamFirstName.hashCode() : 0);
        result = 31 * result + (disship != null ? disship.hashCode() : 0);
        result = 31 * result + (spnship != null ? spnship.hashCode() : 0);
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
        result = 31 * result + (dsphonPhoneNumber != null ? dsphonPhoneNumber.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"Wmvup1\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"id12DigitDistributorId\":\"" + id12DigitDistributorId + "\""
                + ",                         \"ctlDistributorControl\":\"" + ctlDistributorControl + "\""
                + ",                         \"spnSponsorControl\":\"" + spnSponsorControl + "\""
                + ",                         \"levlLevel\":\"" + levlLevel + "\""
                + ",                         \"blvlBeginingLevel\":\"" + blvlBeginingLevel + "\""
                + ",                         \"bmgrlMgrLevel\":\"" + bmgrlMgrLevel + "\""
                + ",                         \"bgmlvGemLevel\":\"" + bgmlvGemLevel + "\""
                + ",                         \"bldsc\":\"" + bldsc + "\""
                + ",                         \"elvlLevel\":\"" + elvlLevel + "\""
                + ",                         \"emgrlManagerLevel\":\"" + emgrlManagerLevel + "\""
                + ",                         \"egmlvGemManagerLevel\":\"" + egmlvGemManagerLevel + "\""
                + ",                         \"eldsc\":\"" + eldsc + "\""
                + ",                         \"yr\":\"" + yr + "\""
                + ",                         \"mo\":\"" + mo + "\""
                + ",                         \"cntyCountry\":\"" + cntyCountry + "\""
                + ",                         \"bonmvup\":\"" + bonmvup + "\""
                + ",                         \"eimvup\":\"" + eimvup + "\""
                + ",                         \"name\":\"" + name + "\""
                + ",                         \"spname\":\"" + spname + "\""
                + ",                         \"dsareaArea\":\"" + dsareaArea + "\""
                + ",                         \"dslprfLangPrefCode\":\"" + dslprfLangPrefCode + "\""
                + ",                         \"dslnamLastName\":\"" + dslnamLastName + "\""
                + ",                         \"dsfnamFirstName\":\"" + dsfnamFirstName + "\""
                + ",                         \"disship\":\"" + disship + "\""
                + ",                         \"spnship\":\"" + spnship + "\""
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
                + ",                         \"dsphonPhoneNumber\":\"" + dsphonPhoneNumber + "\""
                + ",                         \"email\":\"" + email + "\""
                + "}}";
    }
}
