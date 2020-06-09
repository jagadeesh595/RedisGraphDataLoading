package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "ORPRCP_ItemPriceFile")
public class OrprcpItemPriceFile {
    private Long id;
    private String paopcyOperatingCountry;
    private String pacmpyCompanyCode;
    private String paprdItemNumber;
    private String paptypPriceType;
    private Long papamtUnitAmount;
    private String paadteCreatedOnDate;
    private String paausrCreatedByUser;
    private String pacdteMaintainedOnDate;
    private String pacusrMaintainedByUser;
    private String parevRevisionNumber;
    private String pauomUnitOfMeasure;
    private String paskuItemSku;

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
    @Column(name = "PAOPCY_OperatingCountry", nullable = true, length = 15)
    public String getPaopcyOperatingCountry() {
        return paopcyOperatingCountry;
    }

    public void setPaopcyOperatingCountry(String paopcyOperatingCountry) {
        this.paopcyOperatingCountry = paopcyOperatingCountry;
    }

    @Basic
    @Column(name = "PACMPY_CompanyCode", nullable = true, length = 15)
    public String getPacmpyCompanyCode() {
        return pacmpyCompanyCode;
    }

    public void setPacmpyCompanyCode(String pacmpyCompanyCode) {
        this.pacmpyCompanyCode = pacmpyCompanyCode;
    }

    @Basic
    @Column(name = "PAPRD_ItemNumber", nullable = true, length = 15)
    public String getPaprdItemNumber() {
        return paprdItemNumber;
    }

    public void setPaprdItemNumber(String paprdItemNumber) {
        this.paprdItemNumber = paprdItemNumber;
    }

    @Basic
    @Column(name = "PAPTYP_PriceType", nullable = true, length = 15)
    public String getPaptypPriceType() {
        return paptypPriceType;
    }

    public void setPaptypPriceType(String paptypPriceType) {
        this.paptypPriceType = paptypPriceType;
    }

    @Basic
    @Column(name = "PAPAMT_UnitAmount", nullable = true)
    public Long getPapamtUnitAmount() {
        return papamtUnitAmount;
    }

    public void setPapamtUnitAmount(Long papamtUnitAmount) {
        this.papamtUnitAmount = papamtUnitAmount;
    }

    @Basic
    @Column(name = "PAADTE_CreatedOnDate", nullable = true, length = 15)
    public String getPaadteCreatedOnDate() {
        return paadteCreatedOnDate;
    }

    public void setPaadteCreatedOnDate(String paadteCreatedOnDate) {
        this.paadteCreatedOnDate = paadteCreatedOnDate;
    }

    @Basic
    @Column(name = "PAAUSR_CreatedByUser", nullable = true, length = 255)
    public String getPaausrCreatedByUser() {
        return paausrCreatedByUser;
    }

    public void setPaausrCreatedByUser(String paausrCreatedByUser) {
        this.paausrCreatedByUser = paausrCreatedByUser;
    }

    @Basic
    @Column(name = "PACDTE_MaintainedOnDate", nullable = true, length = 15)
    public String getPacdteMaintainedOnDate() {
        return pacdteMaintainedOnDate;
    }

    public void setPacdteMaintainedOnDate(String pacdteMaintainedOnDate) {
        this.pacdteMaintainedOnDate = pacdteMaintainedOnDate;
    }

    @Basic
    @Column(name = "PACUSR_MaintainedByUser", nullable = true, length = 255)
    public String getPacusrMaintainedByUser() {
        return pacusrMaintainedByUser;
    }

    public void setPacusrMaintainedByUser(String pacusrMaintainedByUser) {
        this.pacusrMaintainedByUser = pacusrMaintainedByUser;
    }

    @Basic
    @Column(name = "PAREV_RevisionNumber", nullable = true, length = 255)
    public String getParevRevisionNumber() {
        return parevRevisionNumber;
    }

    public void setParevRevisionNumber(String parevRevisionNumber) {
        this.parevRevisionNumber = parevRevisionNumber;
    }

    @Basic
    @Column(name = "PAUOM_UnitOfMeasure", nullable = true, length = 1)
    public String getPauomUnitOfMeasure() {
        return pauomUnitOfMeasure;
    }

    public void setPauomUnitOfMeasure(String pauomUnitOfMeasure) {
        this.pauomUnitOfMeasure = pauomUnitOfMeasure;
    }

    @Basic
    @Column(name = "PASKU_ItemSku", nullable = true, length = 255)
    public String getPaskuItemSku() {
        return paskuItemSku;
    }

    public void setPaskuItemSku(String paskuItemSku) {
        this.paskuItemSku = paskuItemSku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrprcpItemPriceFile that = (OrprcpItemPriceFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (paopcyOperatingCountry != null ? !paopcyOperatingCountry.equals(that.paopcyOperatingCountry) : that.paopcyOperatingCountry != null)
            return false;
        if (pacmpyCompanyCode != null ? !pacmpyCompanyCode.equals(that.pacmpyCompanyCode) : that.pacmpyCompanyCode != null)
            return false;
        if (paprdItemNumber != null ? !paprdItemNumber.equals(that.paprdItemNumber) : that.paprdItemNumber != null)
            return false;
        if (paptypPriceType != null ? !paptypPriceType.equals(that.paptypPriceType) : that.paptypPriceType != null)
            return false;
        if (papamtUnitAmount != null ? !papamtUnitAmount.equals(that.papamtUnitAmount) : that.papamtUnitAmount != null)
            return false;
        if (paadteCreatedOnDate != null ? !paadteCreatedOnDate.equals(that.paadteCreatedOnDate) : that.paadteCreatedOnDate != null)
            return false;
        if (paausrCreatedByUser != null ? !paausrCreatedByUser.equals(that.paausrCreatedByUser) : that.paausrCreatedByUser != null)
            return false;
        if (pacdteMaintainedOnDate != null ? !pacdteMaintainedOnDate.equals(that.pacdteMaintainedOnDate) : that.pacdteMaintainedOnDate != null)
            return false;
        if (pacusrMaintainedByUser != null ? !pacusrMaintainedByUser.equals(that.pacusrMaintainedByUser) : that.pacusrMaintainedByUser != null)
            return false;
        if (parevRevisionNumber != null ? !parevRevisionNumber.equals(that.parevRevisionNumber) : that.parevRevisionNumber != null)
            return false;
        if (pauomUnitOfMeasure != null ? !pauomUnitOfMeasure.equals(that.pauomUnitOfMeasure) : that.pauomUnitOfMeasure != null)
            return false;
        if (paskuItemSku != null ? !paskuItemSku.equals(that.paskuItemSku) : that.paskuItemSku != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (paopcyOperatingCountry != null ? paopcyOperatingCountry.hashCode() : 0);
        result = 31 * result + (pacmpyCompanyCode != null ? pacmpyCompanyCode.hashCode() : 0);
        result = 31 * result + (paprdItemNumber != null ? paprdItemNumber.hashCode() : 0);
        result = 31 * result + (paptypPriceType != null ? paptypPriceType.hashCode() : 0);
        result = 31 * result + (papamtUnitAmount != null ? papamtUnitAmount.hashCode() : 0);
        result = 31 * result + (paadteCreatedOnDate != null ? paadteCreatedOnDate.hashCode() : 0);
        result = 31 * result + (paausrCreatedByUser != null ? paausrCreatedByUser.hashCode() : 0);
        result = 31 * result + (pacdteMaintainedOnDate != null ? pacdteMaintainedOnDate.hashCode() : 0);
        result = 31 * result + (pacusrMaintainedByUser != null ? pacusrMaintainedByUser.hashCode() : 0);
        result = 31 * result + (parevRevisionNumber != null ? parevRevisionNumber.hashCode() : 0);
        result = 31 * result + (pauomUnitOfMeasure != null ? pauomUnitOfMeasure.hashCode() : 0);
        result = 31 * result + (paskuItemSku != null ? paskuItemSku.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"OrprcpItemPriceFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"paopcyOperatingCountry\":\"" + paopcyOperatingCountry + "\""
                + ",                         \"pacmpyCompanyCode\":\"" + pacmpyCompanyCode + "\""
                + ",                         \"paprdItemNumber\":\"" + paprdItemNumber + "\""
                + ",                         \"paptypPriceType\":\"" + paptypPriceType + "\""
                + ",                         \"papamtUnitAmount\":\"" + papamtUnitAmount + "\""
                + ",                         \"paadteCreatedOnDate\":\"" + paadteCreatedOnDate + "\""
                + ",                         \"paausrCreatedByUser\":\"" + paausrCreatedByUser + "\""
                + ",                         \"pacdteMaintainedOnDate\":\"" + pacdteMaintainedOnDate + "\""
                + ",                         \"pacusrMaintainedByUser\":\"" + pacusrMaintainedByUser + "\""
                + ",                         \"parevRevisionNumber\":\"" + parevRevisionNumber + "\""
                + ",                         \"pauomUnitOfMeasure\":\"" + pauomUnitOfMeasure + "\""
                + ",                         \"paskuItemSku\":\"" + paskuItemSku + "\""
                + "}}";
    }
}
