package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "DSADRP_RegionalAddress")
public class DsadrpRegionalAddress {
    private Long id;
    private Long dactlDistributorControl;
    private String dacntyCountryCode;
    private String dartypRecordType;
    private String dasubtAddressSubType;
    private String dacpflCheckPrintFlag;
    private String darpflRecapPrintFlag;
    private String daadr1AddrToAddress1;
    private String daadr2AddrToAddress2;
    private String daadr3AddrToAddress3;
    private String daadr4AddrToAddress4;
    private String daactyAddrToCity;
    private String daasteAddrToState;
    private String daactrAddrToCountry;
    private String daazipAddrToZip;
    private String dabadfBadAddrFlag;
    private String dasobjSetUpFlag;
    private String dasusrSetUpUser;
    private String dastimSetUpTimeStamp;
    private String daltimLastChangeTimeStamp;
    private String dalusrLastChangeUser;

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
    @Column(name = "DACTL_DistributorControl", nullable = false)
    public Long getDactlDistributorControl() {
        return dactlDistributorControl;
    }

    public void setDactlDistributorControl(Long dactlDistributorControl) {
        this.dactlDistributorControl = dactlDistributorControl;
    }

    @Basic
    @Column(name = "DACNTY_CountryCode", nullable = true, length = 15)
    public String getDacntyCountryCode() {
        return dacntyCountryCode;
    }

    public void setDacntyCountryCode(String dacntyCountryCode) {
        this.dacntyCountryCode = dacntyCountryCode;
    }

    @Basic
    @Column(name = "DARTYP_RecordType", nullable = true, length = 1)
    public String getDartypRecordType() {
        return dartypRecordType;
    }

    public void setDartypRecordType(String dartypRecordType) {
        this.dartypRecordType = dartypRecordType;
    }

    @Basic
    @Column(name = "DASUBT_AddressSubType", nullable = true, length = 1)
    public String getDasubtAddressSubType() {
        return dasubtAddressSubType;
    }

    public void setDasubtAddressSubType(String dasubtAddressSubType) {
        this.dasubtAddressSubType = dasubtAddressSubType;
    }

    @Basic
    @Column(name = "DACPFL_CheckPrintFlag", nullable = true, length = 1)
    public String getDacpflCheckPrintFlag() {
        return dacpflCheckPrintFlag;
    }

    public void setDacpflCheckPrintFlag(String dacpflCheckPrintFlag) {
        this.dacpflCheckPrintFlag = dacpflCheckPrintFlag;
    }

    @Basic
    @Column(name = "DARPFL_RecapPrintFlag", nullable = true, length = 1)
    public String getDarpflRecapPrintFlag() {
        return darpflRecapPrintFlag;
    }

    public void setDarpflRecapPrintFlag(String darpflRecapPrintFlag) {
        this.darpflRecapPrintFlag = darpflRecapPrintFlag;
    }

    @Basic
    @Column(name = "DAADR1_AddrToAddress1", nullable = true, length = 255)
    public String getDaadr1AddrToAddress1() {
        return daadr1AddrToAddress1;
    }

    public void setDaadr1AddrToAddress1(String daadr1AddrToAddress1) {
        this.daadr1AddrToAddress1 = daadr1AddrToAddress1;
    }

    @Basic
    @Column(name = "DAADR2_AddrToAddress2", nullable = true, length = 255)
    public String getDaadr2AddrToAddress2() {
        return daadr2AddrToAddress2;
    }

    public void setDaadr2AddrToAddress2(String daadr2AddrToAddress2) {
        this.daadr2AddrToAddress2 = daadr2AddrToAddress2;
    }

    @Basic
    @Column(name = "DAADR3_AddrToAddress3", nullable = true, length = 255)
    public String getDaadr3AddrToAddress3() {
        return daadr3AddrToAddress3;
    }

    public void setDaadr3AddrToAddress3(String daadr3AddrToAddress3) {
        this.daadr3AddrToAddress3 = daadr3AddrToAddress3;
    }

    @Basic
    @Column(name = "DAADR4_AddrToAddress4", nullable = true, length = 255)
    public String getDaadr4AddrToAddress4() {
        return daadr4AddrToAddress4;
    }

    public void setDaadr4AddrToAddress4(String daadr4AddrToAddress4) {
        this.daadr4AddrToAddress4 = daadr4AddrToAddress4;
    }

    @Basic
    @Column(name = "DAACTY_AddrToCity", nullable = true, length = 255)
    public String getDaactyAddrToCity() {
        return daactyAddrToCity;
    }

    public void setDaactyAddrToCity(String daactyAddrToCity) {
        this.daactyAddrToCity = daactyAddrToCity;
    }

    @Basic
    @Column(name = "DAASTE_AddrToState", nullable = true, length = 15)
    public String getDaasteAddrToState() {
        return daasteAddrToState;
    }

    public void setDaasteAddrToState(String daasteAddrToState) {
        this.daasteAddrToState = daasteAddrToState;
    }

    @Basic
    @Column(name = "DAACTR_AddrToCountry", nullable = true, length = 15)
    public String getDaactrAddrToCountry() {
        return daactrAddrToCountry;
    }

    public void setDaactrAddrToCountry(String daactrAddrToCountry) {
        this.daactrAddrToCountry = daactrAddrToCountry;
    }

    @Basic
    @Column(name = "DAAZIP_AddrToZip", nullable = true, length = 15)
    public String getDaazipAddrToZip() {
        return daazipAddrToZip;
    }

    public void setDaazipAddrToZip(String daazipAddrToZip) {
        this.daazipAddrToZip = daazipAddrToZip;
    }

    @Basic
    @Column(name = "DABADF_BadAddrFlag", nullable = true, length = 1)
    public String getDabadfBadAddrFlag() {
        return dabadfBadAddrFlag;
    }

    public void setDabadfBadAddrFlag(String dabadfBadAddrFlag) {
        this.dabadfBadAddrFlag = dabadfBadAddrFlag;
    }

    @Basic
    @Column(name = "DASOBJ_SetUpFlag", nullable = true, length = 25)
    public String getDasobjSetUpFlag() {
        return dasobjSetUpFlag;
    }

    public void setDasobjSetUpFlag(String dasobjSetUpFlag) {
        this.dasobjSetUpFlag = dasobjSetUpFlag;
    }

    @Basic
    @Column(name = "DASUSR_SetUpUser", nullable = true, length = 15)
    public String getDasusrSetUpUser() {
        return dasusrSetUpUser;
    }

    public void setDasusrSetUpUser(String dasusrSetUpUser) {
        this.dasusrSetUpUser = dasusrSetUpUser;
    }

    @Basic
    @Column(name = "DASTIM_SetUpTimeStamp", nullable = true, length = 26)
    public String getDastimSetUpTimeStamp() {
        return dastimSetUpTimeStamp;
    }

    public void setDastimSetUpTimeStamp(String dastimSetUpTimeStamp) {
        this.dastimSetUpTimeStamp = dastimSetUpTimeStamp;
    }

    @Basic
    @Column(name = "DALTIM_LastChangeTimeStamp", nullable = true, length = 26)
    public String getDaltimLastChangeTimeStamp() {
        return daltimLastChangeTimeStamp;
    }

    public void setDaltimLastChangeTimeStamp(String daltimLastChangeTimeStamp) {
        this.daltimLastChangeTimeStamp = daltimLastChangeTimeStamp;
    }

    @Basic
    @Column(name = "DALUSR_LastChangeUser", nullable = true, length = 26)
    public String getDalusrLastChangeUser() {
        return dalusrLastChangeUser;
    }

    public void setDalusrLastChangeUser(String dalusrLastChangeUser) {
        this.dalusrLastChangeUser = dalusrLastChangeUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DsadrpRegionalAddress that = (DsadrpRegionalAddress) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (dactlDistributorControl != null ? !dactlDistributorControl.equals(that.dactlDistributorControl) : that.dactlDistributorControl != null)
            return false;
        if (dacntyCountryCode != null ? !dacntyCountryCode.equals(that.dacntyCountryCode) : that.dacntyCountryCode != null)
            return false;
        if (dartypRecordType != null ? !dartypRecordType.equals(that.dartypRecordType) : that.dartypRecordType != null)
            return false;
        if (dasubtAddressSubType != null ? !dasubtAddressSubType.equals(that.dasubtAddressSubType) : that.dasubtAddressSubType != null)
            return false;
        if (dacpflCheckPrintFlag != null ? !dacpflCheckPrintFlag.equals(that.dacpflCheckPrintFlag) : that.dacpflCheckPrintFlag != null)
            return false;
        if (darpflRecapPrintFlag != null ? !darpflRecapPrintFlag.equals(that.darpflRecapPrintFlag) : that.darpflRecapPrintFlag != null)
            return false;
        if (daadr1AddrToAddress1 != null ? !daadr1AddrToAddress1.equals(that.daadr1AddrToAddress1) : that.daadr1AddrToAddress1 != null)
            return false;
        if (daadr2AddrToAddress2 != null ? !daadr2AddrToAddress2.equals(that.daadr2AddrToAddress2) : that.daadr2AddrToAddress2 != null)
            return false;
        if (daadr3AddrToAddress3 != null ? !daadr3AddrToAddress3.equals(that.daadr3AddrToAddress3) : that.daadr3AddrToAddress3 != null)
            return false;
        if (daadr4AddrToAddress4 != null ? !daadr4AddrToAddress4.equals(that.daadr4AddrToAddress4) : that.daadr4AddrToAddress4 != null)
            return false;
        if (daactyAddrToCity != null ? !daactyAddrToCity.equals(that.daactyAddrToCity) : that.daactyAddrToCity != null)
            return false;
        if (daasteAddrToState != null ? !daasteAddrToState.equals(that.daasteAddrToState) : that.daasteAddrToState != null)
            return false;
        if (daactrAddrToCountry != null ? !daactrAddrToCountry.equals(that.daactrAddrToCountry) : that.daactrAddrToCountry != null)
            return false;
        if (daazipAddrToZip != null ? !daazipAddrToZip.equals(that.daazipAddrToZip) : that.daazipAddrToZip != null)
            return false;
        if (dabadfBadAddrFlag != null ? !dabadfBadAddrFlag.equals(that.dabadfBadAddrFlag) : that.dabadfBadAddrFlag != null)
            return false;
        if (dasobjSetUpFlag != null ? !dasobjSetUpFlag.equals(that.dasobjSetUpFlag) : that.dasobjSetUpFlag != null)
            return false;
        if (dasusrSetUpUser != null ? !dasusrSetUpUser.equals(that.dasusrSetUpUser) : that.dasusrSetUpUser != null)
            return false;
        if (dastimSetUpTimeStamp != null ? !dastimSetUpTimeStamp.equals(that.dastimSetUpTimeStamp) : that.dastimSetUpTimeStamp != null)
            return false;
        if (daltimLastChangeTimeStamp != null ? !daltimLastChangeTimeStamp.equals(that.daltimLastChangeTimeStamp) : that.daltimLastChangeTimeStamp != null)
            return false;
        if (dalusrLastChangeUser != null ? !dalusrLastChangeUser.equals(that.dalusrLastChangeUser) : that.dalusrLastChangeUser != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dactlDistributorControl != null ? dactlDistributorControl.hashCode() : 0);
        result = 31 * result + (dacntyCountryCode != null ? dacntyCountryCode.hashCode() : 0);
        result = 31 * result + (dartypRecordType != null ? dartypRecordType.hashCode() : 0);
        result = 31 * result + (dasubtAddressSubType != null ? dasubtAddressSubType.hashCode() : 0);
        result = 31 * result + (dacpflCheckPrintFlag != null ? dacpflCheckPrintFlag.hashCode() : 0);
        result = 31 * result + (darpflRecapPrintFlag != null ? darpflRecapPrintFlag.hashCode() : 0);
        result = 31 * result + (daadr1AddrToAddress1 != null ? daadr1AddrToAddress1.hashCode() : 0);
        result = 31 * result + (daadr2AddrToAddress2 != null ? daadr2AddrToAddress2.hashCode() : 0);
        result = 31 * result + (daadr3AddrToAddress3 != null ? daadr3AddrToAddress3.hashCode() : 0);
        result = 31 * result + (daadr4AddrToAddress4 != null ? daadr4AddrToAddress4.hashCode() : 0);
        result = 31 * result + (daactyAddrToCity != null ? daactyAddrToCity.hashCode() : 0);
        result = 31 * result + (daasteAddrToState != null ? daasteAddrToState.hashCode() : 0);
        result = 31 * result + (daactrAddrToCountry != null ? daactrAddrToCountry.hashCode() : 0);
        result = 31 * result + (daazipAddrToZip != null ? daazipAddrToZip.hashCode() : 0);
        result = 31 * result + (dabadfBadAddrFlag != null ? dabadfBadAddrFlag.hashCode() : 0);
        result = 31 * result + (dasobjSetUpFlag != null ? dasobjSetUpFlag.hashCode() : 0);
        result = 31 * result + (dasusrSetUpUser != null ? dasusrSetUpUser.hashCode() : 0);
        result = 31 * result + (dastimSetUpTimeStamp != null ? dastimSetUpTimeStamp.hashCode() : 0);
        result = 31 * result + (daltimLastChangeTimeStamp != null ? daltimLastChangeTimeStamp.hashCode() : 0);
        result = 31 * result + (dalusrLastChangeUser != null ? dalusrLastChangeUser.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DsadrpRegionalAddress\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"dactlDistributorControl\":\"" + dactlDistributorControl + "\""
                + ",                         \"dacntyCountryCode\":\"" + dacntyCountryCode + "\""
                + ",                         \"dartypRecordType\":\"" + dartypRecordType + "\""
                + ",                         \"dasubtAddressSubType\":\"" + dasubtAddressSubType + "\""
                + ",                         \"dacpflCheckPrintFlag\":\"" + dacpflCheckPrintFlag + "\""
                + ",                         \"darpflRecapPrintFlag\":\"" + darpflRecapPrintFlag + "\""
                + ",                         \"daadr1AddrToAddress1\":\"" + daadr1AddrToAddress1 + "\""
                + ",                         \"daadr2AddrToAddress2\":\"" + daadr2AddrToAddress2 + "\""
                + ",                         \"daadr3AddrToAddress3\":\"" + daadr3AddrToAddress3 + "\""
                + ",                         \"daadr4AddrToAddress4\":\"" + daadr4AddrToAddress4 + "\""
                + ",                         \"daactyAddrToCity\":\"" + daactyAddrToCity + "\""
                + ",                         \"daasteAddrToState\":\"" + daasteAddrToState + "\""
                + ",                         \"daactrAddrToCountry\":\"" + daactrAddrToCountry + "\""
                + ",                         \"daazipAddrToZip\":\"" + daazipAddrToZip + "\""
                + ",                         \"dabadfBadAddrFlag\":\"" + dabadfBadAddrFlag + "\""
                + ",                         \"dasobjSetUpFlag\":\"" + dasobjSetUpFlag + "\""
                + ",                         \"dasusrSetUpUser\":\"" + dasusrSetUpUser + "\""
                + ",                         \"dastimSetUpTimeStamp\":\"" + dastimSetUpTimeStamp + "\""
                + ",                         \"daltimLastChangeTimeStamp\":\"" + daltimLastChangeTimeStamp + "\""
                + ",                         \"dalusrLastChangeUser\":\"" + dalusrLastChangeUser + "\""
                + "}}";
    }
}
