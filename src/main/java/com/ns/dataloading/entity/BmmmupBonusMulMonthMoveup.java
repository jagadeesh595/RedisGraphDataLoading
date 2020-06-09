package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BMMMUP_BonusMulMonthMoveup")
public class BmmmupBonusMulMonthMoveup {
    private Long id;
    private Integer ujpyrProcYear;
    private Integer ujpmoProcMonth;
    private Long ujctlDistributorControl;
    private String ujqfyMultMthQual;
    private String ujmmmoNbMoQual;
    private Integer ujmmsymMultMthMovupStrYrMo;
    private BigDecimal ujmmm3Cc3MoQualCc;
    private BigDecimal ujmmm4Cc4MoQualCc;
    private BigDecimal ujp3MccPrvMth3CCs;
    private BigDecimal ujp4MccPrvMth4CCs;
    private String ujp1acfActiveFlagMonth1;
    private String ujp2AcfActiveFlagMth2;
    private String ujp3AcfActiveFlagMth3;
    private String ujp4AcfActiveFlagMth4;
    private String ujdqmgRecMgrFlag;
    private Long ujordOrdNum;
    private Integer ujcactmoNbConsecActMth;
    private Integer ujnmrecgNbMoRecognized;
    private Long ujord2OrderRecognized;
    private String ujmovuMoveUpFlag;
    private String ujfmovuFirstMoveUpFlag;
    private String ujumovuUnRecMgrMoveUpFlag;
    private String ujrmovuRecMgrMoveupFlag;
    private BigDecimal ujpuccPushUpCases;
    private BigDecimal ujnonpuccNonPushUpCases;


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
    @Column(name = "UJPYR_ProcYear", nullable = true)
    public Integer getUjpyrProcYear() {
        return ujpyrProcYear;
    }

    public void setUjpyrProcYear(Integer ujpyrProcYear) {
        this.ujpyrProcYear = ujpyrProcYear;
    }

    @Basic
    @Column(name = "UJPMO_ProcMonth", nullable = true)
    public Integer getUjpmoProcMonth() {
        return ujpmoProcMonth;
    }

    public void setUjpmoProcMonth(Integer ujpmoProcMonth) {
        this.ujpmoProcMonth = ujpmoProcMonth;
    }

    @Basic
    @Column(name = "UJCTL_DistributorControl", nullable = true)
    public Long getUjctlDistributorControl() {
        return ujctlDistributorControl;
    }

    public void setUjctlDistributorControl(Long ujctlDistributorControl) {
        this.ujctlDistributorControl = ujctlDistributorControl;
    }

    @Basic
    @Column(name = "UJQFY_MultMthQual", nullable = true, length = 1)
    public String getUjqfyMultMthQual() {
        return ujqfyMultMthQual;
    }

    public void setUjqfyMultMthQual(String ujqfyMultMthQual) {
        this.ujqfyMultMthQual = ujqfyMultMthQual;
    }

    @Basic
    @Column(name = "UJMMMO_NbMoQual", nullable = true, length = 1)
    public String getUjmmmoNbMoQual() {
        return ujmmmoNbMoQual;
    }

    public void setUjmmmoNbMoQual(String ujmmmoNbMoQual) {
        this.ujmmmoNbMoQual = ujmmmoNbMoQual;
    }

    @Basic
    @Column(name = "UJMMSYM_MultMthMovupStrYrMo", nullable = true)
    public Integer getUjmmsymMultMthMovupStrYrMo() {
        return ujmmsymMultMthMovupStrYrMo;
    }

    public void setUjmmsymMultMthMovupStrYrMo(Integer ujmmsymMultMthMovupStrYrMo) {
        this.ujmmsymMultMthMovupStrYrMo = ujmmsymMultMthMovupStrYrMo;
    }

    @Basic
    @Column(name = "UJMMM3CC_3MoQualCC", nullable = true, precision = 3)
    public BigDecimal getUjmmm3Cc3MoQualCc() {
        return ujmmm3Cc3MoQualCc;
    }

    public void setUjmmm3Cc3MoQualCc(BigDecimal ujmmm3Cc3MoQualCc) {
        this.ujmmm3Cc3MoQualCc = ujmmm3Cc3MoQualCc;
    }

    @Basic
    @Column(name = "UJMMM4CC_4MoQualCC", nullable = true, precision = 3)
    public BigDecimal getUjmmm4Cc4MoQualCc() {
        return ujmmm4Cc4MoQualCc;
    }

    public void setUjmmm4Cc4MoQualCc(BigDecimal ujmmm4Cc4MoQualCc) {
        this.ujmmm4Cc4MoQualCc = ujmmm4Cc4MoQualCc;
    }

    @Basic
    @Column(name = "UJP3MCC_PrvMth3CCs", nullable = true, precision = 3)
    public BigDecimal getUjp3MccPrvMth3CCs() {
        return ujp3MccPrvMth3CCs;
    }

    public void setUjp3MccPrvMth3CCs(BigDecimal ujp3MccPrvMth3CCs) {
        this.ujp3MccPrvMth3CCs = ujp3MccPrvMth3CCs;
    }

    @Basic
    @Column(name = "UJP4MCC_PrvMth4CCs", nullable = true, precision = 3)
    public BigDecimal getUjp4MccPrvMth4CCs() {
        return ujp4MccPrvMth4CCs;
    }

    public void setUjp4MccPrvMth4CCs(BigDecimal ujp4MccPrvMth4CCs) {
        this.ujp4MccPrvMth4CCs = ujp4MccPrvMth4CCs;
    }

    @Column(name = "UJP1ACF_ActiveFlagMonth1", length = 1)
    public String getUjp1acfActiveFlagMonth1() {
        return this.ujp1acfActiveFlagMonth1;
    }

    public void setUjp1acfActiveFlagMonth1(String ujp1acfActiveFlagMonth1) {
        this.ujp1acfActiveFlagMonth1 = ujp1acfActiveFlagMonth1;
    }

    @Basic
    @Column(name = "UJP2ACF_ActiveFlagMth2", nullable = true, length = 1)
    public String getUjp2AcfActiveFlagMth2() {
        return ujp2AcfActiveFlagMth2;
    }

    public void setUjp2AcfActiveFlagMth2(String ujp2AcfActiveFlagMth2) {
        this.ujp2AcfActiveFlagMth2 = ujp2AcfActiveFlagMth2;
    }

    @Basic
    @Column(name = "UJP3ACF_ActiveFlagMth3", nullable = true, length = 1)
    public String getUjp3AcfActiveFlagMth3() {
        return ujp3AcfActiveFlagMth3;
    }

    public void setUjp3AcfActiveFlagMth3(String ujp3AcfActiveFlagMth3) {
        this.ujp3AcfActiveFlagMth3 = ujp3AcfActiveFlagMth3;
    }

    @Basic
    @Column(name = "UJP4ACF_ActiveFlagMth4", nullable = true, length = 1)
    public String getUjp4AcfActiveFlagMth4() {
        return ujp4AcfActiveFlagMth4;
    }

    public void setUjp4AcfActiveFlagMth4(String ujp4AcfActiveFlagMth4) {
        this.ujp4AcfActiveFlagMth4 = ujp4AcfActiveFlagMth4;
    }

    @Basic
    @Column(name = "UJDQMG_RecMgrFlag", nullable = true, length = 1)
    public String getUjdqmgRecMgrFlag() {
        return ujdqmgRecMgrFlag;
    }

    public void setUjdqmgRecMgrFlag(String ujdqmgRecMgrFlag) {
        this.ujdqmgRecMgrFlag = ujdqmgRecMgrFlag;
    }

    @Basic
    @Column(name = "UJORD_OrdNum", nullable = true)
    public Long getUjordOrdNum() {
        return ujordOrdNum;
    }

    public void setUjordOrdNum(Long ujordOrdNum) {
        this.ujordOrdNum = ujordOrdNum;
    }

    @Basic
    @Column(name = "UJCACTMO_NbConsecActMth", nullable = true)
    public Integer getUjcactmoNbConsecActMth() {
        return ujcactmoNbConsecActMth;
    }

    public void setUjcactmoNbConsecActMth(Integer ujcactmoNbConsecActMth) {
        this.ujcactmoNbConsecActMth = ujcactmoNbConsecActMth;
    }

    @Basic
    @Column(name = "UJNMRECG_NbMoRecognized", nullable = true)
    public Integer getUjnmrecgNbMoRecognized() {
        return ujnmrecgNbMoRecognized;
    }

    public void setUjnmrecgNbMoRecognized(Integer ujnmrecgNbMoRecognized) {
        this.ujnmrecgNbMoRecognized = ujnmrecgNbMoRecognized;
    }

    @Basic
    @Column(name = "UJORD2_OrderRecognized", nullable = true)
    public Long getUjord2OrderRecognized() {
        return ujord2OrderRecognized;
    }

    public void setUjord2OrderRecognized(Long ujord2OrderRecognized) {
        this.ujord2OrderRecognized = ujord2OrderRecognized;
    }

    @Column(name = "UJMOVU_MoveUpFlag", length = 1)
    public String getUjmovuMoveUpFlag() {
        return this.ujmovuMoveUpFlag;
    }

    public void setUjmovuMoveUpFlag(String ujmovuMoveUpFlag) {
        this.ujmovuMoveUpFlag = ujmovuMoveUpFlag;
    }

    @Column(name = "UJFMOVU_FirstMoveUpFlag", length = 1)
    public String getUjfmovuFirstMoveUpFlag() {
        return this.ujfmovuFirstMoveUpFlag;
    }

    public void setUjfmovuFirstMoveUpFlag(String ujfmovuFirstMoveUpFlag) {
        this.ujfmovuFirstMoveUpFlag = ujfmovuFirstMoveUpFlag;
    }

    @Column(name = "UJUMOVU_UnRecMgrMoveUpFlag", length = 1)
    public String getUjumovuUnRecMgrMoveUpFlag() {
        return this.ujumovuUnRecMgrMoveUpFlag;
    }

    public void setUjumovuUnRecMgrMoveUpFlag(String ujumovuUnRecMgrMoveUpFlag) {
        this.ujumovuUnRecMgrMoveUpFlag = ujumovuUnRecMgrMoveUpFlag;
    }

    @Column(name = "UJRMOVU_RecMgrMoveupFlag", length = 1)
    public String getUjrmovuRecMgrMoveupFlag() {
        return this.ujrmovuRecMgrMoveupFlag;
    }

    public void setUjrmovuRecMgrMoveupFlag(String ujrmovuRecMgrMoveupFlag) {
        this.ujrmovuRecMgrMoveupFlag = ujrmovuRecMgrMoveupFlag;
    }

    @Column(name = "UJPUCC_PushUpCases", precision = 10, scale = 3)
    public BigDecimal getUjpuccPushUpCases() {
        return this.ujpuccPushUpCases;
    }

    public void setUjpuccPushUpCases(BigDecimal ujpuccPushUpCases) {
        this.ujpuccPushUpCases = ujpuccPushUpCases;
    }

    @Column(name = "UJNONPUCC_NonPushUpCases", precision = 10, scale = 3)
    public BigDecimal getUjnonpuccNonPushUpCases() {
        return this.ujnonpuccNonPushUpCases;
    }

    public void setUjnonpuccNonPushUpCases(BigDecimal ujnonpuccNonPushUpCases) {
        this.ujnonpuccNonPushUpCases = ujnonpuccNonPushUpCases;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BmmmupBonusMulMonthMoveup that = (BmmmupBonusMulMonthMoveup) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ujpyrProcYear != null ? !ujpyrProcYear.equals(that.ujpyrProcYear) : that.ujpyrProcYear != null)
            return false;
        if (ujpmoProcMonth != null ? !ujpmoProcMonth.equals(that.ujpmoProcMonth) : that.ujpmoProcMonth != null)
            return false;
        if (ujctlDistributorControl != null ? !ujctlDistributorControl.equals(that.ujctlDistributorControl) : that.ujctlDistributorControl != null)
            return false;
        if (ujqfyMultMthQual != null ? !ujqfyMultMthQual.equals(that.ujqfyMultMthQual) : that.ujqfyMultMthQual != null)
            return false;
        if (ujmmmoNbMoQual != null ? !ujmmmoNbMoQual.equals(that.ujmmmoNbMoQual) : that.ujmmmoNbMoQual != null)
            return false;
        if (ujmmsymMultMthMovupStrYrMo != null ? !ujmmsymMultMthMovupStrYrMo.equals(that.ujmmsymMultMthMovupStrYrMo) : that.ujmmsymMultMthMovupStrYrMo != null)
            return false;
        if (ujmmm3Cc3MoQualCc != null ? !ujmmm3Cc3MoQualCc.equals(that.ujmmm3Cc3MoQualCc) : that.ujmmm3Cc3MoQualCc != null)
            return false;
        if (ujmmm4Cc4MoQualCc != null ? !ujmmm4Cc4MoQualCc.equals(that.ujmmm4Cc4MoQualCc) : that.ujmmm4Cc4MoQualCc != null)
            return false;
        if (ujp3MccPrvMth3CCs != null ? !ujp3MccPrvMth3CCs.equals(that.ujp3MccPrvMth3CCs) : that.ujp3MccPrvMth3CCs != null)
            return false;
        if (ujp4MccPrvMth4CCs != null ? !ujp4MccPrvMth4CCs.equals(that.ujp4MccPrvMth4CCs) : that.ujp4MccPrvMth4CCs != null)
            return false;
        if (ujp2AcfActiveFlagMth2 != null ? !ujp2AcfActiveFlagMth2.equals(that.ujp2AcfActiveFlagMth2) : that.ujp2AcfActiveFlagMth2 != null)
            return false;
        if (ujp3AcfActiveFlagMth3 != null ? !ujp3AcfActiveFlagMth3.equals(that.ujp3AcfActiveFlagMth3) : that.ujp3AcfActiveFlagMth3 != null)
            return false;
        if (ujp4AcfActiveFlagMth4 != null ? !ujp4AcfActiveFlagMth4.equals(that.ujp4AcfActiveFlagMth4) : that.ujp4AcfActiveFlagMth4 != null)
            return false;
        if (ujdqmgRecMgrFlag != null ? !ujdqmgRecMgrFlag.equals(that.ujdqmgRecMgrFlag) : that.ujdqmgRecMgrFlag != null)
            return false;
        if (ujordOrdNum != null ? !ujordOrdNum.equals(that.ujordOrdNum) : that.ujordOrdNum != null) return false;
        if (ujcactmoNbConsecActMth != null ? !ujcactmoNbConsecActMth.equals(that.ujcactmoNbConsecActMth) : that.ujcactmoNbConsecActMth != null)
            return false;
        if (ujnmrecgNbMoRecognized != null ? !ujnmrecgNbMoRecognized.equals(that.ujnmrecgNbMoRecognized) : that.ujnmrecgNbMoRecognized != null)
            return false;
        if (ujord2OrderRecognized != null ? !ujord2OrderRecognized.equals(that.ujord2OrderRecognized) : that.ujord2OrderRecognized != null)
            return false;
        if (ujp1acfActiveFlagMonth1 != null ? !ujp1acfActiveFlagMonth1.equals(that.ujp1acfActiveFlagMonth1) : that.ujp1acfActiveFlagMonth1 != null)
            return false;
        if (ujmovuMoveUpFlag != null ? !ujmovuMoveUpFlag.equals(that.ujp1acfActiveFlagMonth1) : that.ujmovuMoveUpFlag != null)
            return false;
        if (ujfmovuFirstMoveUpFlag != null ? !ujfmovuFirstMoveUpFlag.equals(that.ujfmovuFirstMoveUpFlag) : that.ujfmovuFirstMoveUpFlag != null)
            return false;
        if (ujumovuUnRecMgrMoveUpFlag != null ? !ujumovuUnRecMgrMoveUpFlag.equals(that.ujumovuUnRecMgrMoveUpFlag) : that.ujumovuUnRecMgrMoveUpFlag != null)
            return false;
        if (ujrmovuRecMgrMoveupFlag != null ? !ujrmovuRecMgrMoveupFlag.equals(that.ujrmovuRecMgrMoveupFlag) : that.ujrmovuRecMgrMoveupFlag != null)
            return false;
        if (ujpuccPushUpCases != null ? !ujpuccPushUpCases.equals(that.ujpuccPushUpCases) : that.ujpuccPushUpCases != null)
            return false;
        if (ujnonpuccNonPushUpCases != null ? !ujnonpuccNonPushUpCases.equals(that.ujnonpuccNonPushUpCases) : that.ujnonpuccNonPushUpCases != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ujpyrProcYear != null ? ujpyrProcYear.hashCode() : 0);
        result = 31 * result + (ujpmoProcMonth != null ? ujpmoProcMonth.hashCode() : 0);
        result = 31 * result + (ujctlDistributorControl != null ? ujctlDistributorControl.hashCode() : 0);
        result = 31 * result + (ujqfyMultMthQual != null ? ujqfyMultMthQual.hashCode() : 0);
        result = 31 * result + (ujmmmoNbMoQual != null ? ujmmmoNbMoQual.hashCode() : 0);
        result = 31 * result + (ujmmsymMultMthMovupStrYrMo != null ? ujmmsymMultMthMovupStrYrMo.hashCode() : 0);
        result = 31 * result + (ujmmm3Cc3MoQualCc != null ? ujmmm3Cc3MoQualCc.hashCode() : 0);
        result = 31 * result + (ujmmm4Cc4MoQualCc != null ? ujmmm4Cc4MoQualCc.hashCode() : 0);
        result = 31 * result + (ujp3MccPrvMth3CCs != null ? ujp3MccPrvMth3CCs.hashCode() : 0);
        result = 31 * result + (ujp4MccPrvMth4CCs != null ? ujp4MccPrvMth4CCs.hashCode() : 0);
        result = 31 * result + (ujp2AcfActiveFlagMth2 != null ? ujp2AcfActiveFlagMth2.hashCode() : 0);
        result = 31 * result + (ujp3AcfActiveFlagMth3 != null ? ujp3AcfActiveFlagMth3.hashCode() : 0);
        result = 31 * result + (ujp4AcfActiveFlagMth4 != null ? ujp4AcfActiveFlagMth4.hashCode() : 0);
        result = 31 * result + (ujdqmgRecMgrFlag != null ? ujdqmgRecMgrFlag.hashCode() : 0);
        result = 31 * result + (ujordOrdNum != null ? ujordOrdNum.hashCode() : 0);
        result = 31 * result + (ujcactmoNbConsecActMth != null ? ujcactmoNbConsecActMth.hashCode() : 0);
        result = 31 * result + (ujnmrecgNbMoRecognized != null ? ujnmrecgNbMoRecognized.hashCode() : 0);
        result = 31 * result + (ujord2OrderRecognized != null ? ujord2OrderRecognized.hashCode() : 0);
        result = 31 * result + (ujp1acfActiveFlagMonth1 != null ? ujp1acfActiveFlagMonth1.hashCode() : 0);
        result = 31 * result + (ujmovuMoveUpFlag != null ? ujmovuMoveUpFlag.hashCode() : 0);
        result = 31 * result + (ujfmovuFirstMoveUpFlag != null ? ujfmovuFirstMoveUpFlag.hashCode() : 0);
        result = 31 * result + (ujumovuUnRecMgrMoveUpFlag != null ? ujumovuUnRecMgrMoveUpFlag.hashCode() : 0);
        result = 31 * result + (ujrmovuRecMgrMoveupFlag != null ? ujrmovuRecMgrMoveupFlag.hashCode() : 0);
        result = 31 * result + (ujpuccPushUpCases != null ? ujpuccPushUpCases.hashCode() : 0);
        result = 31 * result + (ujnonpuccNonPushUpCases != null ? ujnonpuccNonPushUpCases.hashCode() : 0);
        return result;
    }

    public BmmmupBonusMulMonthMoveup initBmmmup() {
        BmmmupBonusMulMonthMoveup bmmmupBonusMulMonthMoveup = new BmmmupBonusMulMonthMoveup();
        bmmmupBonusMulMonthMoveup.setUjpyrProcYear(0);
        bmmmupBonusMulMonthMoveup.setUjpmoProcMonth(0);
        bmmmupBonusMulMonthMoveup.setUjctlDistributorControl(0L);
        bmmmupBonusMulMonthMoveup.setUjqfyMultMthQual("");
        bmmmupBonusMulMonthMoveup.setUjmmmoNbMoQual("");
        bmmmupBonusMulMonthMoveup.setUjmmsymMultMthMovupStrYrMo(0);
        bmmmupBonusMulMonthMoveup.setUjmmm3Cc3MoQualCc(BigDecimal.ZERO);
        bmmmupBonusMulMonthMoveup.setUjmmm4Cc4MoQualCc(BigDecimal.ZERO);
        bmmmupBonusMulMonthMoveup.setUjp3MccPrvMth3CCs(BigDecimal.ZERO);
        bmmmupBonusMulMonthMoveup.setUjp4MccPrvMth4CCs(BigDecimal.ZERO);
        bmmmupBonusMulMonthMoveup.setUjp2AcfActiveFlagMth2("");
        bmmmupBonusMulMonthMoveup.setUjp3AcfActiveFlagMth3("");
        bmmmupBonusMulMonthMoveup.setUjp4AcfActiveFlagMth4("");
        bmmmupBonusMulMonthMoveup.setUjdqmgRecMgrFlag("");
        bmmmupBonusMulMonthMoveup.setUjordOrdNum(0L);
        bmmmupBonusMulMonthMoveup.setUjcactmoNbConsecActMth(0);
        bmmmupBonusMulMonthMoveup.setUjnmrecgNbMoRecognized(0);
        bmmmupBonusMulMonthMoveup.setUjord2OrderRecognized(0L);
        bmmmupBonusMulMonthMoveup.setUjp1acfActiveFlagMonth1("");
        bmmmupBonusMulMonthMoveup.setUjmovuMoveUpFlag("");
        bmmmupBonusMulMonthMoveup.setUjfmovuFirstMoveUpFlag("");
        bmmmupBonusMulMonthMoveup.setUjumovuUnRecMgrMoveUpFlag("");
        bmmmupBonusMulMonthMoveup.setUjrmovuRecMgrMoveupFlag("");
        bmmmupBonusMulMonthMoveup.setUjpuccPushUpCases(BigDecimal.ZERO);
        bmmmupBonusMulMonthMoveup.setUjnonpuccNonPushUpCases(BigDecimal.ZERO);
        return bmmmupBonusMulMonthMoveup;
    }

    public BmmmupBonusMulMonthMoveup copy() {
        BmmmupBonusMulMonthMoveup b = new BmmmupBonusMulMonthMoveup();
        b.ujpyrProcYear = ujpyrProcYear;
        b.ujpmoProcMonth = ujpmoProcMonth;
        b.ujctlDistributorControl = ujctlDistributorControl;
        b.ujqfyMultMthQual = ujqfyMultMthQual;
        b.ujmmmoNbMoQual = ujmmmoNbMoQual;
        b.ujmmsymMultMthMovupStrYrMo = ujmmsymMultMthMovupStrYrMo;
        b.ujmmm3Cc3MoQualCc = ujmmm3Cc3MoQualCc;
        b.ujmmm4Cc4MoQualCc = ujmmm4Cc4MoQualCc;
        b.ujp3MccPrvMth3CCs = ujp3MccPrvMth3CCs;
        b.ujp4MccPrvMth4CCs = ujp4MccPrvMth4CCs;
        b.ujp2AcfActiveFlagMth2 = ujp2AcfActiveFlagMth2;
        b.ujp3AcfActiveFlagMth3 = ujp3AcfActiveFlagMth3;
        b.ujp4AcfActiveFlagMth4 = ujp4AcfActiveFlagMth4;
        b.ujdqmgRecMgrFlag = ujdqmgRecMgrFlag;
        b.ujordOrdNum = ujordOrdNum;
        b.ujcactmoNbConsecActMth = ujcactmoNbConsecActMth;
        b.ujnmrecgNbMoRecognized = ujnmrecgNbMoRecognized;
        b.ujord2OrderRecognized = ujord2OrderRecognized;
        b.ujp1acfActiveFlagMonth1 = ujp1acfActiveFlagMonth1;
        b.ujmovuMoveUpFlag = ujmovuMoveUpFlag;
        b.ujfmovuFirstMoveUpFlag = ujfmovuFirstMoveUpFlag;
        b.ujumovuUnRecMgrMoveUpFlag = ujumovuUnRecMgrMoveUpFlag;
        b.ujrmovuRecMgrMoveupFlag = ujrmovuRecMgrMoveupFlag;
        b.ujpuccPushUpCases = ujpuccPushUpCases;
        b.ujnonpuccNonPushUpCases = ujnonpuccNonPushUpCases;
        return b;
    }
    @Override
    public String toString() {
        return "{\"BmmmupBonusMulMonthMoveup\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"ujpyrProcYear\":\"" + ujpyrProcYear + "\""
                + ",                         \"ujpmoProcMonth\":\"" + ujpmoProcMonth + "\""
                + ",                         \"ujctlDistributorControl\":\"" + ujctlDistributorControl + "\""
                + ",                         \"ujqfyMultMthQual\":\"" + ujqfyMultMthQual + "\""
                + ",                         \"ujmmmoNbMoQual\":\"" + ujmmmoNbMoQual + "\""
                + ",                         \"ujmmsymMultMthMovupStrYrMo\":\"" + ujmmsymMultMthMovupStrYrMo + "\""
                + ",                         \"ujmmm3Cc3MoQualCc\":\"" + ujmmm3Cc3MoQualCc + "\""
                + ",                         \"ujmmm4Cc4MoQualCc\":\"" + ujmmm4Cc4MoQualCc + "\""
                + ",                         \"ujp3MccPrvMth3CCs\":\"" + ujp3MccPrvMth3CCs + "\""
                + ",                         \"ujp4MccPrvMth4CCs\":\"" + ujp4MccPrvMth4CCs + "\""
                + ",                         \"ujp2AcfActiveFlagMth2\":\"" + ujp2AcfActiveFlagMth2 + "\""
                + ",                         \"ujp3AcfActiveFlagMth3\":\"" + ujp3AcfActiveFlagMth3 + "\""
                + ",                         \"ujp4AcfActiveFlagMth4\":\"" + ujp4AcfActiveFlagMth4 + "\""
                + ",                         \"ujdqmgRecMgrFlag\":\"" + ujdqmgRecMgrFlag + "\""
                + ",                         \"ujordOrdNum\":\"" + ujordOrdNum + "\""
                + ",                         \"ujcactmoNbConsecActMth\":\"" + ujcactmoNbConsecActMth + "\""
                + ",                         \"ujnmrecgNbMoRecognized\":\"" + ujnmrecgNbMoRecognized + "\""
                + ",                         \"ujord2OrderRecognized\":\"" + ujord2OrderRecognized + "\""
                + ",                         \"ujp1acfActiveFlagMonth1\":\"" + ujp1acfActiveFlagMonth1 + "\""
                + ",                         \"ujmovuMoveUpFlag\":\"" + ujmovuMoveUpFlag + "\""
                + ",                         \"ujfmovuFirstMoveUpFlag\":\"" + ujfmovuFirstMoveUpFlag + "\""
                + ",                         \"ujumovuUnRecMgrMoveUpFlag\":\"" + ujumovuUnRecMgrMoveUpFlag + "\""
                + ",                         \"ujrmovuRecMgrMoveupFlag\":\"" + ujrmovuRecMgrMoveupFlag + "\""
                + ",                         \"ujpuccPushUpCases\":\"" + ujpuccPushUpCases + "\""
                + ",                         \"ujnonpuccNonPushUpCases\":\"" + ujnonpuccNonPushUpCases + "\""
                + "}}";
    }
}
