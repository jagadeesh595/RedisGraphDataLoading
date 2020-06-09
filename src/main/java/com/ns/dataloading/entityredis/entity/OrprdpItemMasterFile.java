package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("ORPRDP_ItemMasterFile")
public class OrprdpItemMasterFile implements Serializable {
    private Long id;
    private String propcyOperatingCountry;
    private String prcntyCountryCode;
    private String prprdProductNumber;
    private Integer prppcPiecesPerCase;
    private BigDecimal preqfCcEquivalenceCcFactor;
    private String prdscItemDescription;
    private String prds2ItemBriefDescription;
    private String prtypeProductType;
    private String prflcsFullCaseSalesYorN;
    private String prptaxItemTaxGroup;
    private BigDecimal prcstItemValue;
    private BigDecimal prwghtItemWeight;
    private String prjit1ErpItemNumber;
    private String pravapAvaProductNumber;
    private String praflgActiveOrInActiveFlag;
    private String prcatItemCategory;
    private String pruomUnitOfMeasure;
    private String pruowUnitOfWeight;
    private String pradteCreatedOnDate;
    private String prausrCreatedByUser;
    private String prcdteMaintainedOnDate;
    private String prcusrMaintainedByUser;
    private String prrevRevisionNumber;
    private BigDecimal preqfuEquivalentFactorOrUnit;
    private BigDecimal prcstuCostOrUnit;
    private BigDecimal prwgtuWeightOrUnit;
    private String prspitSupplierItemNumber;
    private String prmskuMultiSkuItemYorN;
    private BigDecimal prswgtShippingWeight;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "PROPCY_OperatingCountry", nullable = true, length = 15)
    public String getPropcyOperatingCountry() {
        return propcyOperatingCountry;
    }

    public void setPropcyOperatingCountry(String propcyOperatingCountry) {
        this.propcyOperatingCountry = propcyOperatingCountry;
    }

    // @Basic
    // @Column(name = "PRCNTY_CountryCode", nullable = true, length = 15)
    public String getPrcntyCountryCode() {
        return prcntyCountryCode;
    }

    public void setPrcntyCountryCode(String prcntyCountryCode) {
        this.prcntyCountryCode = prcntyCountryCode;
    }

    // @Basic
    // @Column(name = "PRPRD_ProductNumber", nullable = true, length = 15)
    public String getPrprdProductNumber() {
        return prprdProductNumber;
    }

    public void setPrprdProductNumber(String prprdProductNumber) {
        this.prprdProductNumber = prprdProductNumber;
    }

    // @Basic
    // @Column(name = "PRPPC_PiecesPerCase", nullable = true)
    public Integer getPrppcPiecesPerCase() {
        return prppcPiecesPerCase;
    }

    public void setPrppcPiecesPerCase(Integer prppcPiecesPerCase) {
        this.prppcPiecesPerCase = prppcPiecesPerCase;
    }

    // @Basic
    // @Column(name = "PREQF_CCEquivalenceCCFactor", nullable = true, precision = 3)
    public BigDecimal getPreqfCcEquivalenceCcFactor() {
        return preqfCcEquivalenceCcFactor;
    }

    public void setPreqfCcEquivalenceCcFactor(BigDecimal preqfCcEquivalenceCcFactor) {
        this.preqfCcEquivalenceCcFactor = preqfCcEquivalenceCcFactor;
    }

    // @Basic
    // @Column(name = "PRDSC_ItemDescription", nullable = true, length = 255)
    public String getPrdscItemDescription() {
        return prdscItemDescription;
    }

    public void setPrdscItemDescription(String prdscItemDescription) {
        this.prdscItemDescription = prdscItemDescription;
    }

    // @Basic
    // @Column(name = "PRDS2_ItemBriefDescription", nullable = true, length = 255)
    public String getPrds2ItemBriefDescription() {
        return prds2ItemBriefDescription;
    }

    public void setPrds2ItemBriefDescription(String prds2ItemBriefDescription) {
        this.prds2ItemBriefDescription = prds2ItemBriefDescription;
    }

    // @Basic
    // @Column(name = "PRTYPE_ProductType", nullable = true, length = 1)
    public String getPrtypeProductType() {
        return prtypeProductType;
    }

    public void setPrtypeProductType(String prtypeProductType) {
        this.prtypeProductType = prtypeProductType;
    }

    // @Basic
    // @Column(name = "PRFLCS_FullCaseSalesYorN", nullable = true, length = 1)
    public String getPrflcsFullCaseSalesYorN() {
        return prflcsFullCaseSalesYorN;
    }

    public void setPrflcsFullCaseSalesYorN(String prflcsFullCaseSalesYorN) {
        this.prflcsFullCaseSalesYorN = prflcsFullCaseSalesYorN;
    }

    // @Basic
    // @Column(name = "PRPTAX_ItemTaxGroup", nullable = true, length = 15)
    public String getPrptaxItemTaxGroup() {
        return prptaxItemTaxGroup;
    }

    public void setPrptaxItemTaxGroup(String prptaxItemTaxGroup) {
        this.prptaxItemTaxGroup = prptaxItemTaxGroup;
    }

    // @Basic
    // @Column(name = "PRCST_ItemValue", nullable = true, precision = 2)
    public BigDecimal getPrcstItemValue() {
        return prcstItemValue;
    }

    public void setPrcstItemValue(BigDecimal prcstItemValue) {
        this.prcstItemValue = prcstItemValue;
    }

    // @Basic
    // @Column(name = "PRWGHT_ItemWeight", nullable = true, precision = 4)
    public BigDecimal getPrwghtItemWeight() {
        return prwghtItemWeight;
    }

    public void setPrwghtItemWeight(BigDecimal prwghtItemWeight) {
        this.prwghtItemWeight = prwghtItemWeight;
    }

    // @Basic
    // @Column(name = "PRJIT1_ErpItemNumber", nullable = true, length = 255)
    public String getPrjit1ErpItemNumber() {
        return prjit1ErpItemNumber;
    }

    public void setPrjit1ErpItemNumber(String prjit1ErpItemNumber) {
        this.prjit1ErpItemNumber = prjit1ErpItemNumber;
    }

    // @Basic
    // @Column(name = "PRAVAP_AvaProductNumber", nullable = true, length = 255)
    public String getPravapAvaProductNumber() {
        return pravapAvaProductNumber;
    }

    public void setPravapAvaProductNumber(String pravapAvaProductNumber) {
        this.pravapAvaProductNumber = pravapAvaProductNumber;
    }

    // @Basic
    // @Column(name = "PRAFLG_ActiveOrInActiveFlag", nullable = true, length = 1)
    public String getPraflgActiveOrInActiveFlag() {
        return praflgActiveOrInActiveFlag;
    }

    public void setPraflgActiveOrInActiveFlag(String praflgActiveOrInActiveFlag) {
        this.praflgActiveOrInActiveFlag = praflgActiveOrInActiveFlag;
    }

    // @Basic
    // @Column(name = "PRCAT_ItemCategory", nullable = true, length = 15)
    public String getPrcatItemCategory() {
        return prcatItemCategory;
    }

    public void setPrcatItemCategory(String prcatItemCategory) {
        this.prcatItemCategory = prcatItemCategory;
    }

    // @Basic
    // @Column(name = "PRUOM_UnitOfMeasure", nullable = true, length = 1)
    public String getPruomUnitOfMeasure() {
        return pruomUnitOfMeasure;
    }

    public void setPruomUnitOfMeasure(String pruomUnitOfMeasure) {
        this.pruomUnitOfMeasure = pruomUnitOfMeasure;
    }

    // @Basic
    // @Column(name = "PRUOW_UnitOfWeight", nullable = true, length = 1)
    public String getPruowUnitOfWeight() {
        return pruowUnitOfWeight;
    }

    public void setPruowUnitOfWeight(String pruowUnitOfWeight) {
        this.pruowUnitOfWeight = pruowUnitOfWeight;
    }

    // @Basic
    // @Column(name = "PRADTE_CreatedOnDate", nullable = true, length = 15)
    public String getPradteCreatedOnDate() {
        return pradteCreatedOnDate;
    }

    public void setPradteCreatedOnDate(String pradteCreatedOnDate) {
        this.pradteCreatedOnDate = pradteCreatedOnDate;
    }

    // @Basic
    // @Column(name = "PRAUSR_CreatedByUser", nullable = true, length = 255)
    public String getPrausrCreatedByUser() {
        return prausrCreatedByUser;
    }

    public void setPrausrCreatedByUser(String prausrCreatedByUser) {
        this.prausrCreatedByUser = prausrCreatedByUser;
    }

    // @Basic
    // @Column(name = "PRCDTE_MaintainedOnDate", nullable = true, length = 15)
    public String getPrcdteMaintainedOnDate() {
        return prcdteMaintainedOnDate;
    }

    public void setPrcdteMaintainedOnDate(String prcdteMaintainedOnDate) {
        this.prcdteMaintainedOnDate = prcdteMaintainedOnDate;
    }

    // @Basic
    // @Column(name = "PRCUSR_MaintainedByUser", nullable = true, length = 255)
    public String getPrcusrMaintainedByUser() {
        return prcusrMaintainedByUser;
    }

    public void setPrcusrMaintainedByUser(String prcusrMaintainedByUser) {
        this.prcusrMaintainedByUser = prcusrMaintainedByUser;
    }

    // @Basic
    // @Column(name = "PRREV_RevisionNumber", nullable = true, length = 255)
    public String getPrrevRevisionNumber() {
        return prrevRevisionNumber;
    }

    public void setPrrevRevisionNumber(String prrevRevisionNumber) {
        this.prrevRevisionNumber = prrevRevisionNumber;
    }

    // @Basic
    // @Column(name = "PREQFU_EquivalentFactorOrUnit", nullable = true, precision = 3)
    public BigDecimal getPreqfuEquivalentFactorOrUnit() {
        return preqfuEquivalentFactorOrUnit;
    }

    public void setPreqfuEquivalentFactorOrUnit(BigDecimal preqfuEquivalentFactorOrUnit) {
        this.preqfuEquivalentFactorOrUnit = preqfuEquivalentFactorOrUnit;
    }

    // @Basic
    // @Column(name = "PRCSTU_CostOrUnit", nullable = true, precision = 2)
    public BigDecimal getPrcstuCostOrUnit() {
        return prcstuCostOrUnit;
    }

    public void setPrcstuCostOrUnit(BigDecimal prcstuCostOrUnit) {
        this.prcstuCostOrUnit = prcstuCostOrUnit;
    }

    // @Basic
    // @Column(name = "PRWGTU_WeightOrUnit", nullable = true, precision = 4)
    public BigDecimal getPrwgtuWeightOrUnit() {
        return prwgtuWeightOrUnit;
    }

    public void setPrwgtuWeightOrUnit(BigDecimal prwgtuWeightOrUnit) {
        this.prwgtuWeightOrUnit = prwgtuWeightOrUnit;
    }

    // @Basic
    // @Column(name = "PRSPIT_SupplierItemNumber", nullable = true, length = 255)
    public String getPrspitSupplierItemNumber() {
        return prspitSupplierItemNumber;
    }

    public void setPrspitSupplierItemNumber(String prspitSupplierItemNumber) {
        this.prspitSupplierItemNumber = prspitSupplierItemNumber;
    }

    // @Basic
    // @Column(name = "PRMSKU_MultiSkuItemYorN", nullable = true, length = 1)
    public String getPrmskuMultiSkuItemYorN() {
        return prmskuMultiSkuItemYorN;
    }

    public void setPrmskuMultiSkuItemYorN(String prmskuMultiSkuItemYorN) {
        this.prmskuMultiSkuItemYorN = prmskuMultiSkuItemYorN;
    }

    // @Basic
    // @Column(name = "PRSWGT_ShippingWeight", nullable = true, precision = 4)
    public BigDecimal getPrswgtShippingWeight() {
        return prswgtShippingWeight;
    }

    public void setPrswgtShippingWeight(BigDecimal prswgtShippingWeight) {
        this.prswgtShippingWeight = prswgtShippingWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrprdpItemMasterFile that = (OrprdpItemMasterFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (propcyOperatingCountry != null ? !propcyOperatingCountry.equals(that.propcyOperatingCountry) : that.propcyOperatingCountry != null)
            return false;
        if (prcntyCountryCode != null ? !prcntyCountryCode.equals(that.prcntyCountryCode) : that.prcntyCountryCode != null)
            return false;
        if (prprdProductNumber != null ? !prprdProductNumber.equals(that.prprdProductNumber) : that.prprdProductNumber != null)
            return false;
        if (prppcPiecesPerCase != null ? !prppcPiecesPerCase.equals(that.prppcPiecesPerCase) : that.prppcPiecesPerCase != null)
            return false;
        if (preqfCcEquivalenceCcFactor != null ? !preqfCcEquivalenceCcFactor.equals(that.preqfCcEquivalenceCcFactor) : that.preqfCcEquivalenceCcFactor != null)
            return false;
        if (prdscItemDescription != null ? !prdscItemDescription.equals(that.prdscItemDescription) : that.prdscItemDescription != null)
            return false;
        if (prds2ItemBriefDescription != null ? !prds2ItemBriefDescription.equals(that.prds2ItemBriefDescription) : that.prds2ItemBriefDescription != null)
            return false;
        if (prtypeProductType != null ? !prtypeProductType.equals(that.prtypeProductType) : that.prtypeProductType != null)
            return false;
        if (prflcsFullCaseSalesYorN != null ? !prflcsFullCaseSalesYorN.equals(that.prflcsFullCaseSalesYorN) : that.prflcsFullCaseSalesYorN != null)
            return false;
        if (prptaxItemTaxGroup != null ? !prptaxItemTaxGroup.equals(that.prptaxItemTaxGroup) : that.prptaxItemTaxGroup != null)
            return false;
        if (prcstItemValue != null ? !prcstItemValue.equals(that.prcstItemValue) : that.prcstItemValue != null)
            return false;
        if (prwghtItemWeight != null ? !prwghtItemWeight.equals(that.prwghtItemWeight) : that.prwghtItemWeight != null)
            return false;
        if (prjit1ErpItemNumber != null ? !prjit1ErpItemNumber.equals(that.prjit1ErpItemNumber) : that.prjit1ErpItemNumber != null)
            return false;
        if (pravapAvaProductNumber != null ? !pravapAvaProductNumber.equals(that.pravapAvaProductNumber) : that.pravapAvaProductNumber != null)
            return false;
        if (praflgActiveOrInActiveFlag != null ? !praflgActiveOrInActiveFlag.equals(that.praflgActiveOrInActiveFlag) : that.praflgActiveOrInActiveFlag != null)
            return false;
        if (prcatItemCategory != null ? !prcatItemCategory.equals(that.prcatItemCategory) : that.prcatItemCategory != null)
            return false;
        if (pruomUnitOfMeasure != null ? !pruomUnitOfMeasure.equals(that.pruomUnitOfMeasure) : that.pruomUnitOfMeasure != null)
            return false;
        if (pruowUnitOfWeight != null ? !pruowUnitOfWeight.equals(that.pruowUnitOfWeight) : that.pruowUnitOfWeight != null)
            return false;
        if (pradteCreatedOnDate != null ? !pradteCreatedOnDate.equals(that.pradteCreatedOnDate) : that.pradteCreatedOnDate != null)
            return false;
        if (prausrCreatedByUser != null ? !prausrCreatedByUser.equals(that.prausrCreatedByUser) : that.prausrCreatedByUser != null)
            return false;
        if (prcdteMaintainedOnDate != null ? !prcdteMaintainedOnDate.equals(that.prcdteMaintainedOnDate) : that.prcdteMaintainedOnDate != null)
            return false;
        if (prcusrMaintainedByUser != null ? !prcusrMaintainedByUser.equals(that.prcusrMaintainedByUser) : that.prcusrMaintainedByUser != null)
            return false;
        if (prrevRevisionNumber != null ? !prrevRevisionNumber.equals(that.prrevRevisionNumber) : that.prrevRevisionNumber != null)
            return false;
        if (preqfuEquivalentFactorOrUnit != null ? !preqfuEquivalentFactorOrUnit.equals(that.preqfuEquivalentFactorOrUnit) : that.preqfuEquivalentFactorOrUnit != null)
            return false;
        if (prcstuCostOrUnit != null ? !prcstuCostOrUnit.equals(that.prcstuCostOrUnit) : that.prcstuCostOrUnit != null)
            return false;
        if (prwgtuWeightOrUnit != null ? !prwgtuWeightOrUnit.equals(that.prwgtuWeightOrUnit) : that.prwgtuWeightOrUnit != null)
            return false;
        if (prspitSupplierItemNumber != null ? !prspitSupplierItemNumber.equals(that.prspitSupplierItemNumber) : that.prspitSupplierItemNumber != null)
            return false;
        if (prmskuMultiSkuItemYorN != null ? !prmskuMultiSkuItemYorN.equals(that.prmskuMultiSkuItemYorN) : that.prmskuMultiSkuItemYorN != null)
            return false;
        if (prswgtShippingWeight != null ? !prswgtShippingWeight.equals(that.prswgtShippingWeight) : that.prswgtShippingWeight != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (propcyOperatingCountry != null ? propcyOperatingCountry.hashCode() : 0);
        result = 31 * result + (prcntyCountryCode != null ? prcntyCountryCode.hashCode() : 0);
        result = 31 * result + (prprdProductNumber != null ? prprdProductNumber.hashCode() : 0);
        result = 31 * result + (prppcPiecesPerCase != null ? prppcPiecesPerCase.hashCode() : 0);
        result = 31 * result + (preqfCcEquivalenceCcFactor != null ? preqfCcEquivalenceCcFactor.hashCode() : 0);
        result = 31 * result + (prdscItemDescription != null ? prdscItemDescription.hashCode() : 0);
        result = 31 * result + (prds2ItemBriefDescription != null ? prds2ItemBriefDescription.hashCode() : 0);
        result = 31 * result + (prtypeProductType != null ? prtypeProductType.hashCode() : 0);
        result = 31 * result + (prflcsFullCaseSalesYorN != null ? prflcsFullCaseSalesYorN.hashCode() : 0);
        result = 31 * result + (prptaxItemTaxGroup != null ? prptaxItemTaxGroup.hashCode() : 0);
        result = 31 * result + (prcstItemValue != null ? prcstItemValue.hashCode() : 0);
        result = 31 * result + (prwghtItemWeight != null ? prwghtItemWeight.hashCode() : 0);
        result = 31 * result + (prjit1ErpItemNumber != null ? prjit1ErpItemNumber.hashCode() : 0);
        result = 31 * result + (pravapAvaProductNumber != null ? pravapAvaProductNumber.hashCode() : 0);
        result = 31 * result + (praflgActiveOrInActiveFlag != null ? praflgActiveOrInActiveFlag.hashCode() : 0);
        result = 31 * result + (prcatItemCategory != null ? prcatItemCategory.hashCode() : 0);
        result = 31 * result + (pruomUnitOfMeasure != null ? pruomUnitOfMeasure.hashCode() : 0);
        result = 31 * result + (pruowUnitOfWeight != null ? pruowUnitOfWeight.hashCode() : 0);
        result = 31 * result + (pradteCreatedOnDate != null ? pradteCreatedOnDate.hashCode() : 0);
        result = 31 * result + (prausrCreatedByUser != null ? prausrCreatedByUser.hashCode() : 0);
        result = 31 * result + (prcdteMaintainedOnDate != null ? prcdteMaintainedOnDate.hashCode() : 0);
        result = 31 * result + (prcusrMaintainedByUser != null ? prcusrMaintainedByUser.hashCode() : 0);
        result = 31 * result + (prrevRevisionNumber != null ? prrevRevisionNumber.hashCode() : 0);
        result = 31 * result + (preqfuEquivalentFactorOrUnit != null ? preqfuEquivalentFactorOrUnit.hashCode() : 0);
        result = 31 * result + (prcstuCostOrUnit != null ? prcstuCostOrUnit.hashCode() : 0);
        result = 31 * result + (prwgtuWeightOrUnit != null ? prwgtuWeightOrUnit.hashCode() : 0);
        result = 31 * result + (prspitSupplierItemNumber != null ? prspitSupplierItemNumber.hashCode() : 0);
        result = 31 * result + (prmskuMultiSkuItemYorN != null ? prmskuMultiSkuItemYorN.hashCode() : 0);
        result = 31 * result + (prswgtShippingWeight != null ? prswgtShippingWeight.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"OrprdpItemMasterFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"propcyOperatingCountry\":\"" + propcyOperatingCountry + "\""
                + ",                         \"prcntyCountryCode\":\"" + prcntyCountryCode + "\""
                + ",                         \"prprdProductNumber\":\"" + prprdProductNumber + "\""
                + ",                         \"prppcPiecesPerCase\":\"" + prppcPiecesPerCase + "\""
                + ",                         \"preqfCcEquivalenceCcFactor\":\"" + preqfCcEquivalenceCcFactor + "\""
                + ",                         \"prdscItemDescription\":\"" + prdscItemDescription + "\""
                + ",                         \"prds2ItemBriefDescription\":\"" + prds2ItemBriefDescription + "\""
                + ",                         \"prtypeProductType\":\"" + prtypeProductType + "\""
                + ",                         \"prflcsFullCaseSalesYorN\":\"" + prflcsFullCaseSalesYorN + "\""
                + ",                         \"prptaxItemTaxGroup\":\"" + prptaxItemTaxGroup + "\""
                + ",                         \"prcstItemValue\":\"" + prcstItemValue + "\""
                + ",                         \"prwghtItemWeight\":\"" + prwghtItemWeight + "\""
                + ",                         \"prjit1ErpItemNumber\":\"" + prjit1ErpItemNumber + "\""
                + ",                         \"pravapAvaProductNumber\":\"" + pravapAvaProductNumber + "\""
                + ",                         \"praflgActiveOrInActiveFlag\":\"" + praflgActiveOrInActiveFlag + "\""
                + ",                         \"prcatItemCategory\":\"" + prcatItemCategory + "\""
                + ",                         \"pruomUnitOfMeasure\":\"" + pruomUnitOfMeasure + "\""
                + ",                         \"pruowUnitOfWeight\":\"" + pruowUnitOfWeight + "\""
                + ",                         \"pradteCreatedOnDate\":\"" + pradteCreatedOnDate + "\""
                + ",                         \"prausrCreatedByUser\":\"" + prausrCreatedByUser + "\""
                + ",                         \"prcdteMaintainedOnDate\":\"" + prcdteMaintainedOnDate + "\""
                + ",                         \"prcusrMaintainedByUser\":\"" + prcusrMaintainedByUser + "\""
                + ",                         \"prrevRevisionNumber\":\"" + prrevRevisionNumber + "\""
                + ",                         \"preqfuEquivalentFactorOrUnit\":\"" + preqfuEquivalentFactorOrUnit + "\""
                + ",                         \"prcstuCostOrUnit\":\"" + prcstuCostOrUnit + "\""
                + ",                         \"prwgtuWeightOrUnit\":\"" + prwgtuWeightOrUnit + "\""
                + ",                         \"prspitSupplierItemNumber\":\"" + prspitSupplierItemNumber + "\""
                + ",                         \"prmskuMultiSkuItemYorN\":\"" + prmskuMultiSkuItemYorN + "\""
                + ",                         \"prswgtShippingWeight\":\"" + prswgtShippingWeight + "\""
                + "}}";
    }
}
