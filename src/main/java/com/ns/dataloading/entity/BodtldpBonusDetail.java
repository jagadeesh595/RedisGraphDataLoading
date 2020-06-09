package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by rpalamakula on 16-08-2017.
 */
@Entity
@Table(name = "BODTLDP_BonusDetail")
public class BodtldpBonusDetail {
    private Long id;
    private Long bddstrDistCtrl;
    private Long bdordOrderNum;
    private Long bdseqDetailSeq;
    private Long bdspnrSponsorCtrl;
    private Integer bddlevDistLev;
    private Integer bdslevSponsorLev;
    private BigDecimal bdccCasCre;
    private String bdalphAlphSortOrd;
    private String bdordtOrderDate;
    private String bdnewfNewDistCcFlag;
    private String bdaplfApplDistCasCre;
    private String memberFile;

    public BodtldpBonusDetail() {
    }

    ;

    public BodtldpBonusDetail(Long bddstrDistCtrl, Long bdordOrderNum, Long bdseqDetailSeq, Long bdspnrSponsorCtrl, Integer bddlevDistLev, Integer bdslevSponsorLev, BigDecimal bdccCasCre) {
        this.id = id;
        this.bddstrDistCtrl = bddstrDistCtrl;
        this.bdordOrderNum = bdordOrderNum;
        this.bdseqDetailSeq = bdseqDetailSeq;
        this.bdspnrSponsorCtrl = bdspnrSponsorCtrl;
        this.bddlevDistLev = bddlevDistLev;
        this.bdslevSponsorLev = bdslevSponsorLev;
        this.bdccCasCre = bdccCasCre;
    }

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
    @Column(name = "BDDSTR_DistCtrl", nullable = false)
    public Long getBddstrDistCtrl() {
        return bddstrDistCtrl;
    }

    public void setBddstrDistCtrl(Long bddstrDistCtrl) {
        this.bddstrDistCtrl = bddstrDistCtrl;
    }

    @Basic
    @Column(name = "BDORD_OrderNum", nullable = true)
    public Long getBdordOrderNum() {
        return bdordOrderNum;
    }

    public void setBdordOrderNum(Long bdordOrderNum) {
        this.bdordOrderNum = bdordOrderNum;
    }

    @Basic
    @Column(name = "BDSEQ_DetailSeq", nullable = true)
    public Long getBdseqDetailSeq() {
        return bdseqDetailSeq;
    }

    public void setBdseqDetailSeq(Long bdseqDetailSeq) {
        this.bdseqDetailSeq = bdseqDetailSeq;
    }

    @Basic
    @Column(name = "BDSPNR_SponsorCtrl", nullable = true)
    public Long getBdspnrSponsorCtrl() {
        return bdspnrSponsorCtrl;
    }

    public void setBdspnrSponsorCtrl(Long bdspnrSponsorCtrl) {
        this.bdspnrSponsorCtrl = bdspnrSponsorCtrl;
    }

    @Basic
    @Column(name = "BDDLEV_DistLev", nullable = true)
    public Integer getBddlevDistLev() {
        return bddlevDistLev;
    }

    public void setBddlevDistLev(Integer bddlevDistLev) {
        this.bddlevDistLev = bddlevDistLev;
    }

    @Basic
    @Column(name = "BDSLEV_SponsorLev", nullable = true)
    public Integer getBdslevSponsorLev() {
        return bdslevSponsorLev;
    }

    public void setBdslevSponsorLev(Integer bdslevSponsorLev) {
        this.bdslevSponsorLev = bdslevSponsorLev;
    }

    @Basic
    @Column(name = "BDCC_CasCre", nullable = true, precision = 3)
    public BigDecimal getBdccCasCre() {
        return bdccCasCre;
    }

    public void setBdccCasCre(BigDecimal bdccCasCre) {
        this.bdccCasCre = bdccCasCre;
    }

    @Basic
    @Column(name = "BDALPH_AlphSortOrd", nullable = true, length = 255)
    public String getBdalphAlphSortOrd() {
        return bdalphAlphSortOrd;
    }

    public void setBdalphAlphSortOrd(String bdalphAlphSortOrd) {
        this.bdalphAlphSortOrd = bdalphAlphSortOrd;
    }

    @Basic
    @Column(name = "BDORDT_OrderDate", nullable = true, length = 10)
    public String getBdordtOrderDate() {
        return bdordtOrderDate;
    }

    public void setBdordtOrderDate(String bdordtOrderDate) {
        this.bdordtOrderDate = bdordtOrderDate;
    }

    @Basic
    @Column(name = "BDNEWF_NewDistCcFlag", nullable = true, length = 1)
    public String getBdnewfNewDistCcFlag() {
        return bdnewfNewDistCcFlag;
    }

    public void setBdnewfNewDistCcFlag(String bdnewfNewDistCcFlag) {
        this.bdnewfNewDistCcFlag = bdnewfNewDistCcFlag;
    }

    @Basic
    @Column(name = "BDAPLF_ApplDistCasCre", nullable = true, precision = 3, length = 10)
    public String getBdaplfApplDistCasCre() {
        return bdaplfApplDistCasCre;
    }

    public void setBdaplfApplDistCasCre(String bdaplfApplDistCasCre) {
        this.bdaplfApplDistCasCre = bdaplfApplDistCasCre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BodtldpBonusDetail that = (BodtldpBonusDetail) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bddstrDistCtrl != null ? !bddstrDistCtrl.equals(that.bddstrDistCtrl) : that.bddstrDistCtrl != null)
            return false;
        if (bdordOrderNum != null ? !bdordOrderNum.equals(that.bdordOrderNum) : that.bdordOrderNum != null)
            return false;
        if (bdseqDetailSeq != null ? !bdseqDetailSeq.equals(that.bdseqDetailSeq) : that.bdseqDetailSeq != null)
            return false;
        if (bdspnrSponsorCtrl != null ? !bdspnrSponsorCtrl.equals(that.bdspnrSponsorCtrl) : that.bdspnrSponsorCtrl != null)
            return false;
        if (bddlevDistLev != null ? !bddlevDistLev.equals(that.bddlevDistLev) : that.bddlevDistLev != null)
            return false;
        if (bdslevSponsorLev != null ? !bdslevSponsorLev.equals(that.bdslevSponsorLev) : that.bdslevSponsorLev != null)
            return false;
        if (bdccCasCre != null ? !bdccCasCre.equals(that.bdccCasCre) : that.bdccCasCre != null) return false;
        if (bdalphAlphSortOrd != null ? !bdalphAlphSortOrd.equals(that.bdalphAlphSortOrd) : that.bdalphAlphSortOrd != null)
            return false;
        if (bdordtOrderDate != null ? !bdordtOrderDate.equals(that.bdordtOrderDate) : that.bdordtOrderDate != null)
            return false;
        if (bdnewfNewDistCcFlag != null ? !bdnewfNewDistCcFlag.equals(that.bdnewfNewDistCcFlag) : that.bdnewfNewDistCcFlag != null)
            return false;
        if (bdaplfApplDistCasCre != null ? !bdaplfApplDistCasCre.equals(that.bdaplfApplDistCasCre) : that.bdaplfApplDistCasCre != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bddstrDistCtrl != null ? bddstrDistCtrl.hashCode() : 0);
        result = 31 * result + (bdordOrderNum != null ? bdordOrderNum.hashCode() : 0);
        result = 31 * result + (bdseqDetailSeq != null ? bdseqDetailSeq.hashCode() : 0);
        result = 31 * result + (bdspnrSponsorCtrl != null ? bdspnrSponsorCtrl.hashCode() : 0);
        result = 31 * result + (bddlevDistLev != null ? bddlevDistLev.hashCode() : 0);
        result = 31 * result + (bdslevSponsorLev != null ? bdslevSponsorLev.hashCode() : 0);
        result = 31 * result + (bdccCasCre != null ? bdccCasCre.hashCode() : 0);
        result = 31 * result + (bdalphAlphSortOrd != null ? bdalphAlphSortOrd.hashCode() : 0);
        result = 31 * result + (bdordtOrderDate != null ? bdordtOrderDate.hashCode() : 0);
        result = 31 * result + (bdnewfNewDistCcFlag != null ? bdnewfNewDistCcFlag.hashCode() : 0);
        result = 31 * result + (bdaplfApplDistCasCre != null ? bdaplfApplDistCasCre.hashCode() : 0);
        return result;
    }

    public BodtldpBonusDetail copy() {
        BodtldpBonusDetail bdlp = new BodtldpBonusDetail();
        bdlp.setBddstrDistCtrl(bddstrDistCtrl);
        bdlp.setBdordOrderNum(bdordOrderNum);
        bdlp.setBdseqDetailSeq(bdseqDetailSeq);
        bdlp.setBdspnrSponsorCtrl(bdspnrSponsorCtrl);
        bdlp.setBddlevDistLev(bddlevDistLev);
        bdlp.setBdslevSponsorLev(bdslevSponsorLev);
        bdlp.setBdccCasCre(bdccCasCre);
        bdlp.setBdalphAlphSortOrd(bdalphAlphSortOrd);
        bdlp.setBdordtOrderDate(bdordtOrderDate);
        bdlp.setBdnewfNewDistCcFlag(bdnewfNewDistCcFlag);
        bdlp.setBdaplfApplDistCasCre(bdaplfApplDistCasCre);
        return bdlp;
    }

    @Basic
    @Column(name = "MemberFile", nullable = true, length = 10)
    public String getMemberFile() {
        return memberFile;
    }

    public void setMemberFile(String memberFile) {
        this.memberFile = memberFile;
    }

    @Override
    public String toString() {
        return "{\"BodtldpBonusDetail\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bddstrDistCtrl\":\"" + bddstrDistCtrl + "\""
                + ",                         \"bdordOrderNum\":\"" + bdordOrderNum + "\""
                + ",                         \"bdseqDetailSeq\":\"" + bdseqDetailSeq + "\""
                + ",                         \"bdspnrSponsorCtrl\":\"" + bdspnrSponsorCtrl + "\""
                + ",                         \"bddlevDistLev\":\"" + bddlevDistLev + "\""
                + ",                         \"bdslevSponsorLev\":\"" + bdslevSponsorLev + "\""
                + ",                         \"bdccCasCre\":\"" + bdccCasCre + "\""
                + ",                         \"bdalphAlphSortOrd\":\"" + bdalphAlphSortOrd + "\""
                + ",                         \"bdordtOrderDate\":\"" + bdordtOrderDate + "\""
                + ",                         \"bdnewfNewDistCcFlag\":\"" + bdnewfNewDistCcFlag + "\""
                + ",                         \"bdaplfApplDistCasCre\":\"" + bdaplfApplDistCasCre + "\""
                + ",                         \"memberFile\":\"" + memberFile + "\""
                + "}}";
    }

}
