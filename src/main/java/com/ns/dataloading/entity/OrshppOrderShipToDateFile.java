package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "ORSHPP_OrderShipToDateFile")
public class OrshppOrderShipToDateFile {
    private Long id;
    private Long rcctlAssignedDistCtrl;
    private Integer rcpyrProcessYear;
    private Integer rcpmoProcessingMonth;
    private Long rcparaPurchaceArea;
    private Long rcenvEnvelope;
    private Long rcordOrderNumber;
    private String rcodatOrderDate;
    private String rcnameRetailCustomerName;
    private String rcadd1AddressLine1;
    private String rcadd2AddressLine2;
    private String rcadd3AddressLine3;
    private String rcadd4AddressLine4;
    private String rccityCity;
    private String rcsteState;
    private String rccntyCountry;
    private String rczipcZipCode;
    private String rccoidCompanyId;
    private Long rcphonPhone;
    private String rcctacContactCode;
    private Long rcgeocGeographicCode;
    private Long rcotypOrderTypeCode;
    private String rcmthdShipMethod;

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
    @Column(name = "RCCTL_AssignedDistCtrl", nullable = false)
    public Long getRcctlAssignedDistCtrl() {
        return rcctlAssignedDistCtrl;
    }

    public void setRcctlAssignedDistCtrl(Long rcctlAssignedDistCtrl) {
        this.rcctlAssignedDistCtrl = rcctlAssignedDistCtrl;
    }

    @Basic
    @Column(name = "RCPYR_ProcessYear", nullable = true)
    public Integer getRcpyrProcessYear() {
        return rcpyrProcessYear;
    }

    public void setRcpyrProcessYear(Integer rcpyrProcessYear) {
        this.rcpyrProcessYear = rcpyrProcessYear;
    }

    @Basic
    @Column(name = "RCPMO_ProcessingMonth", nullable = true)
    public Integer getRcpmoProcessingMonth() {
        return rcpmoProcessingMonth;
    }

    public void setRcpmoProcessingMonth(Integer rcpmoProcessingMonth) {
        this.rcpmoProcessingMonth = rcpmoProcessingMonth;
    }

    @Basic
    @Column(name = "RCPARA_PurchaceArea", nullable = true)
    public Long getRcparaPurchaceArea() {
        return rcparaPurchaceArea;
    }

    public void setRcparaPurchaceArea(Long rcparaPurchaceArea) {
        this.rcparaPurchaceArea = rcparaPurchaceArea;
    }

    @Basic
    @Column(name = "RCENV_Envelope", nullable = true)
    public Long getRcenvEnvelope() {
        return rcenvEnvelope;
    }

    public void setRcenvEnvelope(Long rcenvEnvelope) {
        this.rcenvEnvelope = rcenvEnvelope;
    }

    @Basic
    @Column(name = "RCORD_OrderNumber", nullable = true)
    public Long getRcordOrderNumber() {
        return rcordOrderNumber;
    }

    public void setRcordOrderNumber(Long rcordOrderNumber) {
        this.rcordOrderNumber = rcordOrderNumber;
    }

    @Basic
    @Column(name = "RCODAT_OrderDate", nullable = true, length = 15)
    public String getRcodatOrderDate() {
        return rcodatOrderDate;
    }

    public void setRcodatOrderDate(String rcodatOrderDate) {
        this.rcodatOrderDate = rcodatOrderDate;
    }

    @Basic
    @Column(name = "RCNAME_RetailCustomerName", nullable = true, length = 255)
    public String getRcnameRetailCustomerName() {
        return rcnameRetailCustomerName;
    }

    public void setRcnameRetailCustomerName(String rcnameRetailCustomerName) {
        this.rcnameRetailCustomerName = rcnameRetailCustomerName;
    }

    @Basic
    @Column(name = "RCADD1_AddressLine1", nullable = true, length = 255)
    public String getRcadd1AddressLine1() {
        return rcadd1AddressLine1;
    }

    public void setRcadd1AddressLine1(String rcadd1AddressLine1) {
        this.rcadd1AddressLine1 = rcadd1AddressLine1;
    }

    @Basic
    @Column(name = "RCADD2_AddressLine2", nullable = true, length = 255)
    public String getRcadd2AddressLine2() {
        return rcadd2AddressLine2;
    }

    public void setRcadd2AddressLine2(String rcadd2AddressLine2) {
        this.rcadd2AddressLine2 = rcadd2AddressLine2;
    }

    @Basic
    @Column(name = "RCADD3_AddressLine3", nullable = true, length = 255)
    public String getRcadd3AddressLine3() {
        return rcadd3AddressLine3;
    }

    public void setRcadd3AddressLine3(String rcadd3AddressLine3) {
        this.rcadd3AddressLine3 = rcadd3AddressLine3;
    }

    @Basic
    @Column(name = "RCADD4_AddressLine4", nullable = true, length = 255)
    public String getRcadd4AddressLine4() {
        return rcadd4AddressLine4;
    }

    public void setRcadd4AddressLine4(String rcadd4AddressLine4) {
        this.rcadd4AddressLine4 = rcadd4AddressLine4;
    }

    @Basic
    @Column(name = "RCCITY_City", nullable = true, length = 255)
    public String getRccityCity() {
        return rccityCity;
    }

    public void setRccityCity(String rccityCity) {
        this.rccityCity = rccityCity;
    }

    @Basic
    @Column(name = "RCSTE_State", nullable = true, length = 5)
    public String getRcsteState() {
        return rcsteState;
    }

    public void setRcsteState(String rcsteState) {
        this.rcsteState = rcsteState;
    }

    @Basic
    @Column(name = "RCCNTY_Country", nullable = true, length = 5)
    public String getRccntyCountry() {
        return rccntyCountry;
    }

    public void setRccntyCountry(String rccntyCountry) {
        this.rccntyCountry = rccntyCountry;
    }

    @Basic
    @Column(name = "RCZIPC_ZipCode", nullable = true, length = 255)
    public String getRczipcZipCode() {
        return rczipcZipCode;
    }

    public void setRczipcZipCode(String rczipcZipCode) {
        this.rczipcZipCode = rczipcZipCode;
    }

    @Basic
    @Column(name = "RCCOID_CompanyId", nullable = true, length = 5)
    public String getRccoidCompanyId() {
        return rccoidCompanyId;
    }

    public void setRccoidCompanyId(String rccoidCompanyId) {
        this.rccoidCompanyId = rccoidCompanyId;
    }

    @Basic
    @Column(name = "RCPHON_Phone", nullable = true)
    public Long getRcphonPhone() {
        return rcphonPhone;
    }

    public void setRcphonPhone(Long rcphonPhone) {
        this.rcphonPhone = rcphonPhone;
    }

    @Basic
    @Column(name = "RCCTAC_ContactCode", nullable = true, length = 1)
    public String getRcctacContactCode() {
        return rcctacContactCode;
    }

    public void setRcctacContactCode(String rcctacContactCode) {
        this.rcctacContactCode = rcctacContactCode;
    }

    @Basic
    @Column(name = "RCGEOC_GeographicCode", nullable = true)
    public Long getRcgeocGeographicCode() {
        return rcgeocGeographicCode;
    }

    public void setRcgeocGeographicCode(Long rcgeocGeographicCode) {
        this.rcgeocGeographicCode = rcgeocGeographicCode;
    }

    @Basic
    @Column(name = "RCOTYP_OrderTypeCode", nullable = true)
    public Long getRcotypOrderTypeCode() {
        return rcotypOrderTypeCode;
    }

    public void setRcotypOrderTypeCode(Long rcotypOrderTypeCode) {
        this.rcotypOrderTypeCode = rcotypOrderTypeCode;
    }

    @Basic
    @Column(name = "RCMTHD_ShipMethod", nullable = true, length = 15)
    public String getRcmthdShipMethod() {
        return rcmthdShipMethod;
    }

    public void setRcmthdShipMethod(String rcmthdShipMethod) {
        this.rcmthdShipMethod = rcmthdShipMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrshppOrderShipToDateFile that = (OrshppOrderShipToDateFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (rcctlAssignedDistCtrl != null ? !rcctlAssignedDistCtrl.equals(that.rcctlAssignedDistCtrl) : that.rcctlAssignedDistCtrl != null)
            return false;
        if (rcpyrProcessYear != null ? !rcpyrProcessYear.equals(that.rcpyrProcessYear) : that.rcpyrProcessYear != null)
            return false;
        if (rcpmoProcessingMonth != null ? !rcpmoProcessingMonth.equals(that.rcpmoProcessingMonth) : that.rcpmoProcessingMonth != null)
            return false;
        if (rcparaPurchaceArea != null ? !rcparaPurchaceArea.equals(that.rcparaPurchaceArea) : that.rcparaPurchaceArea != null)
            return false;
        if (rcenvEnvelope != null ? !rcenvEnvelope.equals(that.rcenvEnvelope) : that.rcenvEnvelope != null)
            return false;
        if (rcordOrderNumber != null ? !rcordOrderNumber.equals(that.rcordOrderNumber) : that.rcordOrderNumber != null)
            return false;
        if (rcodatOrderDate != null ? !rcodatOrderDate.equals(that.rcodatOrderDate) : that.rcodatOrderDate != null)
            return false;
        if (rcnameRetailCustomerName != null ? !rcnameRetailCustomerName.equals(that.rcnameRetailCustomerName) : that.rcnameRetailCustomerName != null)
            return false;
        if (rcadd1AddressLine1 != null ? !rcadd1AddressLine1.equals(that.rcadd1AddressLine1) : that.rcadd1AddressLine1 != null)
            return false;
        if (rcadd2AddressLine2 != null ? !rcadd2AddressLine2.equals(that.rcadd2AddressLine2) : that.rcadd2AddressLine2 != null)
            return false;
        if (rcadd3AddressLine3 != null ? !rcadd3AddressLine3.equals(that.rcadd3AddressLine3) : that.rcadd3AddressLine3 != null)
            return false;
        if (rcadd4AddressLine4 != null ? !rcadd4AddressLine4.equals(that.rcadd4AddressLine4) : that.rcadd4AddressLine4 != null)
            return false;
        if (rccityCity != null ? !rccityCity.equals(that.rccityCity) : that.rccityCity != null) return false;
        if (rcsteState != null ? !rcsteState.equals(that.rcsteState) : that.rcsteState != null) return false;
        if (rccntyCountry != null ? !rccntyCountry.equals(that.rccntyCountry) : that.rccntyCountry != null)
            return false;
        if (rczipcZipCode != null ? !rczipcZipCode.equals(that.rczipcZipCode) : that.rczipcZipCode != null)
            return false;
        if (rccoidCompanyId != null ? !rccoidCompanyId.equals(that.rccoidCompanyId) : that.rccoidCompanyId != null)
            return false;
        if (rcphonPhone != null ? !rcphonPhone.equals(that.rcphonPhone) : that.rcphonPhone != null) return false;
        if (rcctacContactCode != null ? !rcctacContactCode.equals(that.rcctacContactCode) : that.rcctacContactCode != null)
            return false;
        if (rcgeocGeographicCode != null ? !rcgeocGeographicCode.equals(that.rcgeocGeographicCode) : that.rcgeocGeographicCode != null)
            return false;
        if (rcotypOrderTypeCode != null ? !rcotypOrderTypeCode.equals(that.rcotypOrderTypeCode) : that.rcotypOrderTypeCode != null)
            return false;
        if (rcmthdShipMethod != null ? !rcmthdShipMethod.equals(that.rcmthdShipMethod) : that.rcmthdShipMethod != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (rcctlAssignedDistCtrl != null ? rcctlAssignedDistCtrl.hashCode() : 0);
        result = 31 * result + (rcpyrProcessYear != null ? rcpyrProcessYear.hashCode() : 0);
        result = 31 * result + (rcpmoProcessingMonth != null ? rcpmoProcessingMonth.hashCode() : 0);
        result = 31 * result + (rcparaPurchaceArea != null ? rcparaPurchaceArea.hashCode() : 0);
        result = 31 * result + (rcenvEnvelope != null ? rcenvEnvelope.hashCode() : 0);
        result = 31 * result + (rcordOrderNumber != null ? rcordOrderNumber.hashCode() : 0);
        result = 31 * result + (rcodatOrderDate != null ? rcodatOrderDate.hashCode() : 0);
        result = 31 * result + (rcnameRetailCustomerName != null ? rcnameRetailCustomerName.hashCode() : 0);
        result = 31 * result + (rcadd1AddressLine1 != null ? rcadd1AddressLine1.hashCode() : 0);
        result = 31 * result + (rcadd2AddressLine2 != null ? rcadd2AddressLine2.hashCode() : 0);
        result = 31 * result + (rcadd3AddressLine3 != null ? rcadd3AddressLine3.hashCode() : 0);
        result = 31 * result + (rcadd4AddressLine4 != null ? rcadd4AddressLine4.hashCode() : 0);
        result = 31 * result + (rccityCity != null ? rccityCity.hashCode() : 0);
        result = 31 * result + (rcsteState != null ? rcsteState.hashCode() : 0);
        result = 31 * result + (rccntyCountry != null ? rccntyCountry.hashCode() : 0);
        result = 31 * result + (rczipcZipCode != null ? rczipcZipCode.hashCode() : 0);
        result = 31 * result + (rccoidCompanyId != null ? rccoidCompanyId.hashCode() : 0);
        result = 31 * result + (rcphonPhone != null ? rcphonPhone.hashCode() : 0);
        result = 31 * result + (rcctacContactCode != null ? rcctacContactCode.hashCode() : 0);
        result = 31 * result + (rcgeocGeographicCode != null ? rcgeocGeographicCode.hashCode() : 0);
        result = 31 * result + (rcotypOrderTypeCode != null ? rcotypOrderTypeCode.hashCode() : 0);
        result = 31 * result + (rcmthdShipMethod != null ? rcmthdShipMethod.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"OrshppOrderShipToDateFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"rcctlAssignedDistCtrl\":\"" + rcctlAssignedDistCtrl + "\""
                + ",                         \"rcpyrProcessYear\":\"" + rcpyrProcessYear + "\""
                + ",                         \"rcpmoProcessingMonth\":\"" + rcpmoProcessingMonth + "\""
                + ",                         \"rcparaPurchaceArea\":\"" + rcparaPurchaceArea + "\""
                + ",                         \"rcenvEnvelope\":\"" + rcenvEnvelope + "\""
                + ",                         \"rcordOrderNumber\":\"" + rcordOrderNumber + "\""
                + ",                         \"rcodatOrderDate\":\"" + rcodatOrderDate + "\""
                + ",                         \"rcnameRetailCustomerName\":\"" + rcnameRetailCustomerName + "\""
                + ",                         \"rcadd1AddressLine1\":\"" + rcadd1AddressLine1 + "\""
                + ",                         \"rcadd2AddressLine2\":\"" + rcadd2AddressLine2 + "\""
                + ",                         \"rcadd3AddressLine3\":\"" + rcadd3AddressLine3 + "\""
                + ",                         \"rcadd4AddressLine4\":\"" + rcadd4AddressLine4 + "\""
                + ",                         \"rccityCity\":\"" + rccityCity + "\""
                + ",                         \"rcsteState\":\"" + rcsteState + "\""
                + ",                         \"rccntyCountry\":\"" + rccntyCountry + "\""
                + ",                         \"rczipcZipCode\":\"" + rczipcZipCode + "\""
                + ",                         \"rccoidCompanyId\":\"" + rccoidCompanyId + "\""
                + ",                         \"rcphonPhone\":\"" + rcphonPhone + "\""
                + ",                         \"rcctacContactCode\":\"" + rcctacContactCode + "\""
                + ",                         \"rcgeocGeographicCode\":\"" + rcgeocGeographicCode + "\""
                + ",                         \"rcotypOrderTypeCode\":\"" + rcotypOrderTypeCode + "\""
                + ",                         \"rcmthdShipMethod\":\"" + rcmthdShipMethod + "\""
                + "}}";
    }
}
