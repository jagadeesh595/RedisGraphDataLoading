package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("MONTHSEQ_MonthlyRecapSeq")
public class MonthseqMonthlyRecapSeq implements Serializable {
    private Long id;
    private String mscoidCompanyId;
    private String msrtypSortRecapType;
    private String mspiSortSeqPmtInstr;
    private String msfdSortSeqForOrDom;
    private String msOvSortSeqOvr;
    private String msseqSortSeqLprf;
    private Long msctlDistributorControl;
    private Long msctycCountryCode;
    private Long msdidDistributorId;
    private String msbadaBadAddress;
    private String mscntyCountryDistLives;
    private String mswebrPWebRecapSort;
    private String memberFile;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "MSCOID_CompanyId", nullable = true, length = 15)
    public String getMscoidCompanyId() {
        return mscoidCompanyId;
    }

    public void setMscoidCompanyId(String mscoidCompanyId) {
        this.mscoidCompanyId = mscoidCompanyId;
    }

    // @Basic
    // @Column(name = "MSRTYP_SortRecapType", nullable = true, length = 1)
    public String getMsrtypSortRecapType() {
        return msrtypSortRecapType;
    }

    public void setMsrtypSortRecapType(String msrtypSortRecapType) {
        this.msrtypSortRecapType = msrtypSortRecapType;
    }

    // @Basic
    // @Column(name = "MSPI_SortSeqPmtInstr", nullable = true, length = 1)
    public String getMspiSortSeqPmtInstr() {
        return mspiSortSeqPmtInstr;
    }

    public void setMspiSortSeqPmtInstr(String mspiSortSeqPmtInstr) {
        this.mspiSortSeqPmtInstr = mspiSortSeqPmtInstr;
    }

    // @Basic
    // @Column(name = "MSFD_SortSeqForOrDom", nullable = true, length = 1)
    public String getMsfdSortSeqForOrDom() {
        return msfdSortSeqForOrDom;
    }

    public void setMsfdSortSeqForOrDom(String msfdSortSeqForOrDom) {
        this.msfdSortSeqForOrDom = msfdSortSeqForOrDom;
    }

    // @Basic
    // @Column(name = "MS_OV_SortSeqOvr", nullable = true, length = 1)
    public String getMsOvSortSeqOvr() {
        return msOvSortSeqOvr;
    }

    public void setMsOvSortSeqOvr(String msOvSortSeqOvr) {
        this.msOvSortSeqOvr = msOvSortSeqOvr;
    }

    // @Basic
    // @Column(name = "MSSEQ_SortSeqLprf", nullable = true, length = 1)
    public String getMsseqSortSeqLprf() {
        return msseqSortSeqLprf;
    }

    public void setMsseqSortSeqLprf(String msseqSortSeqLprf) {
        this.msseqSortSeqLprf = msseqSortSeqLprf;
    }

    // @Basic
    // @Column(name = "MSCTL_DistributorControl", nullable = false)
    public Long getMsctlDistributorControl() {
        return msctlDistributorControl;
    }

    public void setMsctlDistributorControl(Long msctlDistributorControl) {
        this.msctlDistributorControl = msctlDistributorControl;
    }

    // @Basic
    // @Column(name = "MSCTYC_CountryCode", nullable = true)
    public Long getMsctycCountryCode() {
        return msctycCountryCode;
    }

    public void setMsctycCountryCode(Long msctycCountryCode) {
        this.msctycCountryCode = msctycCountryCode;
    }

    // @Basic
    // @Column(name = "MSDID_DistributorId", nullable = true)
    public Long getMsdidDistributorId() {
        return msdidDistributorId;
    }

    public void setMsdidDistributorId(Long msdidDistributorId) {
        this.msdidDistributorId = msdidDistributorId;
    }

    // @Basic
    // @Column(name = "MSBADA_BadAddress", nullable = true, length = 1)
    public String getMsbadaBadAddress() {
        return msbadaBadAddress;
    }

    public void setMsbadaBadAddress(String msbadaBadAddress) {
        this.msbadaBadAddress = msbadaBadAddress;
    }

    // @Basic
    // @Column(name = "MSCNTY_CountryDistLives", nullable = true, length = 15)
    public String getMscntyCountryDistLives() {
        return mscntyCountryDistLives;
    }

    public void setMscntyCountryDistLives(String mscntyCountryDistLives) {
        this.mscntyCountryDistLives = mscntyCountryDistLives;
    }

    // @Basic
    // @Column(name = "MSWEBR_PWebRecapSort", nullable = true, length = 1)
    public String getMswebrPWebRecapSort() {
        return mswebrPWebRecapSort;
    }

    public void setMswebrPWebRecapSort(String mswebrPWebRecapSort) {
        this.mswebrPWebRecapSort = mswebrPWebRecapSort;
    }

    // @Basic
    // @Column(name = "MemberFile", nullable = true, length = 255)
    public String getMemberFile() {
        return memberFile;
    }

    public void setMemberFile(String memberFile) {
        this.memberFile = memberFile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MonthseqMonthlyRecapSeq that = (MonthseqMonthlyRecapSeq) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (mscoidCompanyId != null ? !mscoidCompanyId.equals(that.mscoidCompanyId) : that.mscoidCompanyId != null)
            return false;
        if (msrtypSortRecapType != null ? !msrtypSortRecapType.equals(that.msrtypSortRecapType) : that.msrtypSortRecapType != null)
            return false;
        if (mspiSortSeqPmtInstr != null ? !mspiSortSeqPmtInstr.equals(that.mspiSortSeqPmtInstr) : that.mspiSortSeqPmtInstr != null)
            return false;
        if (msfdSortSeqForOrDom != null ? !msfdSortSeqForOrDom.equals(that.msfdSortSeqForOrDom) : that.msfdSortSeqForOrDom != null)
            return false;
        if (msOvSortSeqOvr != null ? !msOvSortSeqOvr.equals(that.msOvSortSeqOvr) : that.msOvSortSeqOvr != null)
            return false;
        if (msseqSortSeqLprf != null ? !msseqSortSeqLprf.equals(that.msseqSortSeqLprf) : that.msseqSortSeqLprf != null)
            return false;
        if (msctlDistributorControl != null ? !msctlDistributorControl.equals(that.msctlDistributorControl) : that.msctlDistributorControl != null)
            return false;
        if (msctycCountryCode != null ? !msctycCountryCode.equals(that.msctycCountryCode) : that.msctycCountryCode != null)
            return false;
        if (msdidDistributorId != null ? !msdidDistributorId.equals(that.msdidDistributorId) : that.msdidDistributorId != null)
            return false;
        if (msbadaBadAddress != null ? !msbadaBadAddress.equals(that.msbadaBadAddress) : that.msbadaBadAddress != null)
            return false;
        if (mscntyCountryDistLives != null ? !mscntyCountryDistLives.equals(that.mscntyCountryDistLives) : that.mscntyCountryDistLives != null)
            return false;
        if (mswebrPWebRecapSort != null ? !mswebrPWebRecapSort.equals(that.mswebrPWebRecapSort) : that.mswebrPWebRecapSort != null)
            return false;
        if (memberFile != null ? !memberFile.equals(that.memberFile) : that.memberFile != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (mscoidCompanyId != null ? mscoidCompanyId.hashCode() : 0);
        result = 31 * result + (msrtypSortRecapType != null ? msrtypSortRecapType.hashCode() : 0);
        result = 31 * result + (mspiSortSeqPmtInstr != null ? mspiSortSeqPmtInstr.hashCode() : 0);
        result = 31 * result + (msfdSortSeqForOrDom != null ? msfdSortSeqForOrDom.hashCode() : 0);
        result = 31 * result + (msOvSortSeqOvr != null ? msOvSortSeqOvr.hashCode() : 0);
        result = 31 * result + (msseqSortSeqLprf != null ? msseqSortSeqLprf.hashCode() : 0);
        result = 31 * result + (msctlDistributorControl != null ? msctlDistributorControl.hashCode() : 0);
        result = 31 * result + (msctycCountryCode != null ? msctycCountryCode.hashCode() : 0);
        result = 31 * result + (msdidDistributorId != null ? msdidDistributorId.hashCode() : 0);
        result = 31 * result + (msbadaBadAddress != null ? msbadaBadAddress.hashCode() : 0);
        result = 31 * result + (mscntyCountryDistLives != null ? mscntyCountryDistLives.hashCode() : 0);
        result = 31 * result + (mswebrPWebRecapSort != null ? mswebrPWebRecapSort.hashCode() : 0);
        result = 31 * result + (memberFile != null ? memberFile.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"MonthseqMonthlyRecapSeq\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"mscoidCompanyId\":\"" + mscoidCompanyId + "\""
                + ",                         \"msrtypSortRecapType\":\"" + msrtypSortRecapType + "\""
                + ",                         \"mspiSortSeqPmtInstr\":\"" + mspiSortSeqPmtInstr + "\""
                + ",                         \"msfdSortSeqForOrDom\":\"" + msfdSortSeqForOrDom + "\""
                + ",                         \"msOvSortSeqOvr\":\"" + msOvSortSeqOvr + "\""
                + ",                         \"msseqSortSeqLprf\":\"" + msseqSortSeqLprf + "\""
                + ",                         \"msctlDistributorControl\":\"" + msctlDistributorControl + "\""
                + ",                         \"msctycCountryCode\":\"" + msctycCountryCode + "\""
                + ",                         \"msdidDistributorId\":\"" + msdidDistributorId + "\""
                + ",                         \"msbadaBadAddress\":\"" + msbadaBadAddress + "\""
                + ",                         \"mscntyCountryDistLives\":\"" + mscntyCountryDistLives + "\""
                + ",                         \"mswebrPWebRecapSort\":\"" + mswebrPWebRecapSort + "\""
                + ",                         \"memberFile\":\"" + memberFile + "\""
                + "}}";
    }
}
