package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BOLDRP_LeadershipMgrQualFile")
public class BoldrpLeadershipMgrQualFile {
    private Long id;
    private Long blctlDistributorControl;
    private Long bl1CtlFirstGenMgrControl;
    private Long bl1CtcFirstGenMgrCountryCode;
    private Long bl1DidFirstGenMgrDistId;
    private BigDecimal bl1CcrFirstGenMgrCcr;
    private Long bldctlDownlineMgrControl;
    private BigDecimal bldccrDownlineMgrCCr;
    private Integer bldgenDownlineMgrGen;
    private String bldqmgRecognizedMgr;
    private String blactvActive;
    private String memberFile;

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
    @Column(name = "BLCTL_DistributorControl", nullable = false)
    public Long getBlctlDistributorControl() {
        return blctlDistributorControl;
    }

    public void setBlctlDistributorControl(Long blctlDistributorControl) {
        this.blctlDistributorControl = blctlDistributorControl;
    }

    @Basic
    @Column(name = "BL1CTL_FirstGenMgrControl", nullable = true)
    public Long getBl1CtlFirstGenMgrControl() {
        return bl1CtlFirstGenMgrControl;
    }

    public void setBl1CtlFirstGenMgrControl(Long bl1CtlFirstGenMgrControl) {
        this.bl1CtlFirstGenMgrControl = bl1CtlFirstGenMgrControl;
    }

    @Basic
    @Column(name = "BL1CTC_FirstGenMgrCountryCode", nullable = true)
    public Long getBl1CtcFirstGenMgrCountryCode() {
        return bl1CtcFirstGenMgrCountryCode;
    }

    public void setBl1CtcFirstGenMgrCountryCode(Long bl1CtcFirstGenMgrCountryCode) {
        this.bl1CtcFirstGenMgrCountryCode = bl1CtcFirstGenMgrCountryCode;
    }

    @Basic
    @Column(name = "BL1DID_FirstGenMgrDistId", nullable = true)
    public Long getBl1DidFirstGenMgrDistId() {
        return bl1DidFirstGenMgrDistId;
    }

    public void setBl1DidFirstGenMgrDistId(Long bl1DidFirstGenMgrDistId) {
        this.bl1DidFirstGenMgrDistId = bl1DidFirstGenMgrDistId;
    }

    @Basic
    @Column(name = "BL1CCR_FirstGenMgrCCR", nullable = true, precision = 3)
    public BigDecimal getBl1CcrFirstGenMgrCcr() {
        return bl1CcrFirstGenMgrCcr;
    }

    public void setBl1CcrFirstGenMgrCcr(BigDecimal bl1CcrFirstGenMgrCcr) {
        this.bl1CcrFirstGenMgrCcr = bl1CcrFirstGenMgrCcr;
    }

    @Basic
    @Column(name = "BLDCTL_DownlineMgrControl", nullable = true)
    public Long getBldctlDownlineMgrControl() {
        return bldctlDownlineMgrControl;
    }

    public void setBldctlDownlineMgrControl(Long bldctlDownlineMgrControl) {
        this.bldctlDownlineMgrControl = bldctlDownlineMgrControl;
    }

    @Basic
    @Column(name = "BLDCCR_DownlineMgrCCr", nullable = true, precision = 3)
    public BigDecimal getBldccrDownlineMgrCCr() {
        return bldccrDownlineMgrCCr;
    }

    public void setBldccrDownlineMgrCCr(BigDecimal bldccrDownlineMgrCCr) {
        this.bldccrDownlineMgrCCr = bldccrDownlineMgrCCr;
    }

    @Basic
    @Column(name = "BLDGEN_DownlineMgrGen", nullable = true)
    public Integer getBldgenDownlineMgrGen() {
        return bldgenDownlineMgrGen;
    }

    public void setBldgenDownlineMgrGen(Integer bldgenDownlineMgrGen) {
        this.bldgenDownlineMgrGen = bldgenDownlineMgrGen;
    }

    @Basic
    @Column(name = "BLDQMG_RecognizedMgr", nullable = true, length = 1)
    public String getBldqmgRecognizedMgr() {
        return bldqmgRecognizedMgr;
    }

    public void setBldqmgRecognizedMgr(String bldqmgRecognizedMgr) {
        this.bldqmgRecognizedMgr = bldqmgRecognizedMgr;
    }

    @Basic
    @Column(name = "BLACTV_Active", nullable = true, length = 1)
    public String getBlactvActive() {
        return blactvActive;
    }

    public void setBlactvActive(String blactvActive) {
        this.blactvActive = blactvActive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoldrpLeadershipMgrQualFile that = (BoldrpLeadershipMgrQualFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (blctlDistributorControl != null ? !blctlDistributorControl.equals(that.blctlDistributorControl) : that.blctlDistributorControl != null)
            return false;
        if (bl1CtlFirstGenMgrControl != null ? !bl1CtlFirstGenMgrControl.equals(that.bl1CtlFirstGenMgrControl) : that.bl1CtlFirstGenMgrControl != null)
            return false;
        if (bl1CtcFirstGenMgrCountryCode != null ? !bl1CtcFirstGenMgrCountryCode.equals(that.bl1CtcFirstGenMgrCountryCode) : that.bl1CtcFirstGenMgrCountryCode != null)
            return false;
        if (bl1DidFirstGenMgrDistId != null ? !bl1DidFirstGenMgrDistId.equals(that.bl1DidFirstGenMgrDistId) : that.bl1DidFirstGenMgrDistId != null)
            return false;
        if (bl1CcrFirstGenMgrCcr != null ? !bl1CcrFirstGenMgrCcr.equals(that.bl1CcrFirstGenMgrCcr) : that.bl1CcrFirstGenMgrCcr != null)
            return false;
        if (bldctlDownlineMgrControl != null ? !bldctlDownlineMgrControl.equals(that.bldctlDownlineMgrControl) : that.bldctlDownlineMgrControl != null)
            return false;
        if (bldccrDownlineMgrCCr != null ? !bldccrDownlineMgrCCr.equals(that.bldccrDownlineMgrCCr) : that.bldccrDownlineMgrCCr != null)
            return false;
        if (bldgenDownlineMgrGen != null ? !bldgenDownlineMgrGen.equals(that.bldgenDownlineMgrGen) : that.bldgenDownlineMgrGen != null)
            return false;
        if (bldqmgRecognizedMgr != null ? !bldqmgRecognizedMgr.equals(that.bldqmgRecognizedMgr) : that.bldqmgRecognizedMgr != null)
            return false;
        if (blactvActive != null ? !blactvActive.equals(that.blactvActive) : that.blactvActive != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (blctlDistributorControl != null ? blctlDistributorControl.hashCode() : 0);
        result = 31 * result + (bl1CtlFirstGenMgrControl != null ? bl1CtlFirstGenMgrControl.hashCode() : 0);
        result = 31 * result + (bl1CtcFirstGenMgrCountryCode != null ? bl1CtcFirstGenMgrCountryCode.hashCode() : 0);
        result = 31 * result + (bl1DidFirstGenMgrDistId != null ? bl1DidFirstGenMgrDistId.hashCode() : 0);
        result = 31 * result + (bl1CcrFirstGenMgrCcr != null ? bl1CcrFirstGenMgrCcr.hashCode() : 0);
        result = 31 * result + (bldctlDownlineMgrControl != null ? bldctlDownlineMgrControl.hashCode() : 0);
        result = 31 * result + (bldccrDownlineMgrCCr != null ? bldccrDownlineMgrCCr.hashCode() : 0);
        result = 31 * result + (bldgenDownlineMgrGen != null ? bldgenDownlineMgrGen.hashCode() : 0);
        result = 31 * result + (bldqmgRecognizedMgr != null ? bldqmgRecognizedMgr.hashCode() : 0);
        result = 31 * result + (blactvActive != null ? blactvActive.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "MemberFile", nullable = true, length = 50)
    public String getMemberFile() {
        return memberFile;
    }

    public void setMemberFile(String memberFile) {
        this.memberFile = memberFile;
    }

    @Override
    public String toString() {
        return "{\"BoldrpLeadershipMgrQualFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"blctlDistributorControl\":\"" + blctlDistributorControl + "\""
                + ",                         \"bl1CtlFirstGenMgrControl\":\"" + bl1CtlFirstGenMgrControl + "\""
                + ",                         \"bl1CtcFirstGenMgrCountryCode\":\"" + bl1CtcFirstGenMgrCountryCode + "\""
                + ",                         \"bl1DidFirstGenMgrDistId\":\"" + bl1DidFirstGenMgrDistId + "\""
                + ",                         \"bl1CcrFirstGenMgrCcr\":\"" + bl1CcrFirstGenMgrCcr + "\""
                + ",                         \"bldctlDownlineMgrControl\":\"" + bldctlDownlineMgrControl + "\""
                + ",                         \"bldccrDownlineMgrCCr\":\"" + bldccrDownlineMgrCCr + "\""
                + ",                         \"bldgenDownlineMgrGen\":\"" + bldgenDownlineMgrGen + "\""
                + ",                         \"bldqmgRecognizedMgr\":\"" + bldqmgRecognizedMgr + "\""
                + ",                         \"blactvActive\":\"" + blactvActive + "\""
                + ",                         \"memberFile\":\"" + memberFile + "\""
                + "}}";
    }
}
