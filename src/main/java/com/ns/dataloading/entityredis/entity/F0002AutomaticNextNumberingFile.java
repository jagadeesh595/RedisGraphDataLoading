package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;

import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("F0002_AutomaticNextNumberingFile")
public class F0002AutomaticNextNumberingFile implements Serializable {
    private Long id;
    private String nnsySystemCode;
    private String nnud01UserDesc1;
    private String nnud02UserDesc2;
    private String nnud03UserDesc3;
    private String nnud04UserDesc4;
    private String nnud05UserDesc5;
    private String nnud06UserDesc6;
    private String nnud07UserDesc7;
    private String nnud08UserDesc8;
    private String nnud09UserDesc9;
    private String nnud10UserDesc10;
    private Long nnn001NextNumber1;
    private Long nnn002NextNumber2;
    private Long nnn003NextNumber3;
    private Long nnn004NextNumber4;
    private Long nnn005NextNumber5;
    private Long nnn006NextNumber6;
    private Long nnn007NextNumber7;
    private Long nnn008NextNumber8;
    private Long nnn009NextNumber9;
    private Long nnn010NextNumber10;
    private String nnck01CheckDigit1;
    private String nnck02CheckDigit2;
    private String nnck03CheckDigit3;
    private String nnck04CheckDigit4;
    private String nnck05CheckDigit5;
    private String nnck06CheckDigit6;
    private String nnck07CheckDigit7;
    private String nnck08CheckDigit8;
    private String nnck09CheckDigit9;
    private String nnck10CheckDigit10;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "NNSY_SystemCode", nullable = true, length = 15)
    public String getNnsySystemCode() {
        return nnsySystemCode;
    }

    public void setNnsySystemCode(String nnsySystemCode) {
        this.nnsySystemCode = nnsySystemCode;
    }

    // @Basic
    // @Column(name = "NNUD01_UserDesc1", nullable = true, length = 15)
    public String getNnud01UserDesc1() {
        return nnud01UserDesc1;
    }

    public void setNnud01UserDesc1(String nnud01UserDesc1) {
        this.nnud01UserDesc1 = nnud01UserDesc1;
    }

    // @Basic
    // @Column(name = "NNUD02_UserDesc2", nullable = true, length = 15)
    public String getNnud02UserDesc2() {
        return nnud02UserDesc2;
    }

    public void setNnud02UserDesc2(String nnud02UserDesc2) {
        this.nnud02UserDesc2 = nnud02UserDesc2;
    }

    // @Basic
    // @Column(name = "NNUD03_UserDesc3", nullable = true, length = 15)
    public String getNnud03UserDesc3() {
        return nnud03UserDesc3;
    }

    public void setNnud03UserDesc3(String nnud03UserDesc3) {
        this.nnud03UserDesc3 = nnud03UserDesc3;
    }

    // @Basic
    // @Column(name = "NNUD04_UserDesc4", nullable = true, length = 15)
    public String getNnud04UserDesc4() {
        return nnud04UserDesc4;
    }

    public void setNnud04UserDesc4(String nnud04UserDesc4) {
        this.nnud04UserDesc4 = nnud04UserDesc4;
    }

    // @Basic
    // @Column(name = "NNUD05_UserDesc5", nullable = true, length = 15)
    public String getNnud05UserDesc5() {
        return nnud05UserDesc5;
    }

    public void setNnud05UserDesc5(String nnud05UserDesc5) {
        this.nnud05UserDesc5 = nnud05UserDesc5;
    }

    // @Basic
    // @Column(name = "NNUD06_UserDesc6", nullable = true, length = 15)
    public String getNnud06UserDesc6() {
        return nnud06UserDesc6;
    }

    public void setNnud06UserDesc6(String nnud06UserDesc6) {
        this.nnud06UserDesc6 = nnud06UserDesc6;
    }

    // @Basic
    // @Column(name = "NNUD07_UserDesc7", nullable = true, length = 15)
    public String getNnud07UserDesc7() {
        return nnud07UserDesc7;
    }

    public void setNnud07UserDesc7(String nnud07UserDesc7) {
        this.nnud07UserDesc7 = nnud07UserDesc7;
    }

    // @Basic
    // @Column(name = "NNUD08_UserDesc8", nullable = true, length = 15)
    public String getNnud08UserDesc8() {
        return nnud08UserDesc8;
    }

    public void setNnud08UserDesc8(String nnud08UserDesc8) {
        this.nnud08UserDesc8 = nnud08UserDesc8;
    }

    // @Basic
    // @Column(name = "NNUD09_UserDesc9", nullable = true, length = 15)
    public String getNnud09UserDesc9() {
        return nnud09UserDesc9;
    }

    public void setNnud09UserDesc9(String nnud09UserDesc9) {
        this.nnud09UserDesc9 = nnud09UserDesc9;
    }

    // @Basic
    // @Column(name = "NNUD10_UserDesc10", nullable = true, length = 15)
    public String getNnud10UserDesc10() {
        return nnud10UserDesc10;
    }

    public void setNnud10UserDesc10(String nnud10UserDesc10) {
        this.nnud10UserDesc10 = nnud10UserDesc10;
    }

    // @Basic
    // @Column(name = "NNN001_NextNumber1", nullable = true)
    public Long getNnn001NextNumber1() {
        return nnn001NextNumber1;
    }

    public void setNnn001NextNumber1(Long nnn001NextNumber1) {
        this.nnn001NextNumber1 = nnn001NextNumber1;
    }

    // @Basic
    // @Column(name = "NNN002_NextNumber2", nullable = true)
    public Long getNnn002NextNumber2() {
        return nnn002NextNumber2;
    }

    public void setNnn002NextNumber2(Long nnn002NextNumber2) {
        this.nnn002NextNumber2 = nnn002NextNumber2;
    }

    // @Basic
    // @Column(name = "NNN003_NextNumber3", nullable = true)
    public Long getNnn003NextNumber3() {
        return nnn003NextNumber3;
    }

    public void setNnn003NextNumber3(Long nnn003NextNumber3) {
        this.nnn003NextNumber3 = nnn003NextNumber3;
    }

    // @Basic
    // @Column(name = "NNN004_NextNumber4", nullable = true)
    public Long getNnn004NextNumber4() {
        return nnn004NextNumber4;
    }

    public void setNnn004NextNumber4(Long nnn004NextNumber4) {
        this.nnn004NextNumber4 = nnn004NextNumber4;
    }

    // @Basic
    // @Column(name = "NNN005_NextNumber5", nullable = true)
    public Long getNnn005NextNumber5() {
        return nnn005NextNumber5;
    }

    public void setNnn005NextNumber5(Long nnn005NextNumber5) {
        this.nnn005NextNumber5 = nnn005NextNumber5;
    }

    // @Basic
    // @Column(name = "NNN006_NextNumber6", nullable = true)
    public Long getNnn006NextNumber6() {
        return nnn006NextNumber6;
    }

    public void setNnn006NextNumber6(Long nnn006NextNumber6) {
        this.nnn006NextNumber6 = nnn006NextNumber6;
    }

    // @Basic
    // @Column(name = "NNN007_NextNumber7", nullable = true)
    public Long getNnn007NextNumber7() {
        return nnn007NextNumber7;
    }

    public void setNnn007NextNumber7(Long nnn007NextNumber7) {
        this.nnn007NextNumber7 = nnn007NextNumber7;
    }

    // @Basic
    // @Column(name = "NNN008_NextNumber8", nullable = true)
    public Long getNnn008NextNumber8() {
        return nnn008NextNumber8;
    }

    public void setNnn008NextNumber8(Long nnn008NextNumber8) {
        this.nnn008NextNumber8 = nnn008NextNumber8;
    }

    // @Basic
    // @Column(name = "NNN009_NextNumber9", nullable = true)
    public Long getNnn009NextNumber9() {
        return nnn009NextNumber9;
    }

    public void setNnn009NextNumber9(Long nnn009NextNumber9) {
        this.nnn009NextNumber9 = nnn009NextNumber9;
    }

    // @Basic
    // @Column(name = "NNN010_NextNumber10", nullable = true)
    public Long getNnn010NextNumber10() {
        return nnn010NextNumber10;
    }

    public void setNnn010NextNumber10(Long nnn010NextNumber10) {
        this.nnn010NextNumber10 = nnn010NextNumber10;
    }

    // @Basic
    // @Column(name = "NNCK01_CheckDigit1", nullable = true, length = 15)
    public String getNnck01CheckDigit1() {
        return nnck01CheckDigit1;
    }

    public void setNnck01CheckDigit1(String nnck01CheckDigit1) {
        this.nnck01CheckDigit1 = nnck01CheckDigit1;
    }

    // @Basic
    // @Column(name = "NNCK02_CheckDigit2", nullable = true, length = 15)
    public String getNnck02CheckDigit2() {
        return nnck02CheckDigit2;
    }

    public void setNnck02CheckDigit2(String nnck02CheckDigit2) {
        this.nnck02CheckDigit2 = nnck02CheckDigit2;
    }

    // @Basic
    // @Column(name = "NNCK03_CheckDigit3", nullable = true, length = 15)
    public String getNnck03CheckDigit3() {
        return nnck03CheckDigit3;
    }

    public void setNnck03CheckDigit3(String nnck03CheckDigit3) {
        this.nnck03CheckDigit3 = nnck03CheckDigit3;
    }

    // @Basic
    // @Column(name = "NNCK04_CheckDigit4", nullable = true, length = 15)
    public String getNnck04CheckDigit4() {
        return nnck04CheckDigit4;
    }

    public void setNnck04CheckDigit4(String nnck04CheckDigit4) {
        this.nnck04CheckDigit4 = nnck04CheckDigit4;
    }

    // @Basic
    // @Column(name = "NNCK05_CheckDigit5", nullable = true, length = 15)
    public String getNnck05CheckDigit5() {
        return nnck05CheckDigit5;
    }

    public void setNnck05CheckDigit5(String nnck05CheckDigit5) {
        this.nnck05CheckDigit5 = nnck05CheckDigit5;
    }

    // @Basic
    // @Column(name = "NNCK06_CheckDigit6", nullable = true, length = 15)
    public String getNnck06CheckDigit6() {
        return nnck06CheckDigit6;
    }

    public void setNnck06CheckDigit6(String nnck06CheckDigit6) {
        this.nnck06CheckDigit6 = nnck06CheckDigit6;
    }

    // @Basic
    // @Column(name = "NNCK07_CheckDigit7", nullable = true, length = 15)
    public String getNnck07CheckDigit7() {
        return nnck07CheckDigit7;
    }

    public void setNnck07CheckDigit7(String nnck07CheckDigit7) {
        this.nnck07CheckDigit7 = nnck07CheckDigit7;
    }

    // @Basic
    // @Column(name = "NNCK08_CheckDigit8", nullable = true, length = 15)
    public String getNnck08CheckDigit8() {
        return nnck08CheckDigit8;
    }

    public void setNnck08CheckDigit8(String nnck08CheckDigit8) {
        this.nnck08CheckDigit8 = nnck08CheckDigit8;
    }

    // @Basic
    // @Column(name = "NNCK09_CheckDigit9", nullable = true, length = 15)
    public String getNnck09CheckDigit9() {
        return nnck09CheckDigit9;
    }

    public void setNnck09CheckDigit9(String nnck09CheckDigit9) {
        this.nnck09CheckDigit9 = nnck09CheckDigit9;
    }

    // @Basic
    // @Column(name = "NNCK10_CheckDigit10", nullable = true, length = 15)
    public String getNnck10CheckDigit10() {
        return nnck10CheckDigit10;
    }

    public void setNnck10CheckDigit10(String nnck10CheckDigit10) {
        this.nnck10CheckDigit10 = nnck10CheckDigit10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        F0002AutomaticNextNumberingFile that = (F0002AutomaticNextNumberingFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nnsySystemCode != null ? !nnsySystemCode.equals(that.nnsySystemCode) : that.nnsySystemCode != null)
            return false;
        if (nnud01UserDesc1 != null ? !nnud01UserDesc1.equals(that.nnud01UserDesc1) : that.nnud01UserDesc1 != null)
            return false;
        if (nnud02UserDesc2 != null ? !nnud02UserDesc2.equals(that.nnud02UserDesc2) : that.nnud02UserDesc2 != null)
            return false;
        if (nnud03UserDesc3 != null ? !nnud03UserDesc3.equals(that.nnud03UserDesc3) : that.nnud03UserDesc3 != null)
            return false;
        if (nnud04UserDesc4 != null ? !nnud04UserDesc4.equals(that.nnud04UserDesc4) : that.nnud04UserDesc4 != null)
            return false;
        if (nnud05UserDesc5 != null ? !nnud05UserDesc5.equals(that.nnud05UserDesc5) : that.nnud05UserDesc5 != null)
            return false;
        if (nnud06UserDesc6 != null ? !nnud06UserDesc6.equals(that.nnud06UserDesc6) : that.nnud06UserDesc6 != null)
            return false;
        if (nnud07UserDesc7 != null ? !nnud07UserDesc7.equals(that.nnud07UserDesc7) : that.nnud07UserDesc7 != null)
            return false;
        if (nnud08UserDesc8 != null ? !nnud08UserDesc8.equals(that.nnud08UserDesc8) : that.nnud08UserDesc8 != null)
            return false;
        if (nnud09UserDesc9 != null ? !nnud09UserDesc9.equals(that.nnud09UserDesc9) : that.nnud09UserDesc9 != null)
            return false;
        if (nnud10UserDesc10 != null ? !nnud10UserDesc10.equals(that.nnud10UserDesc10) : that.nnud10UserDesc10 != null)
            return false;
        if (nnn001NextNumber1 != null ? !nnn001NextNumber1.equals(that.nnn001NextNumber1) : that.nnn001NextNumber1 != null)
            return false;
        if (nnn002NextNumber2 != null ? !nnn002NextNumber2.equals(that.nnn002NextNumber2) : that.nnn002NextNumber2 != null)
            return false;
        if (nnn003NextNumber3 != null ? !nnn003NextNumber3.equals(that.nnn003NextNumber3) : that.nnn003NextNumber3 != null)
            return false;
        if (nnn004NextNumber4 != null ? !nnn004NextNumber4.equals(that.nnn004NextNumber4) : that.nnn004NextNumber4 != null)
            return false;
        if (nnn005NextNumber5 != null ? !nnn005NextNumber5.equals(that.nnn005NextNumber5) : that.nnn005NextNumber5 != null)
            return false;
        if (nnn006NextNumber6 != null ? !nnn006NextNumber6.equals(that.nnn006NextNumber6) : that.nnn006NextNumber6 != null)
            return false;
        if (nnn007NextNumber7 != null ? !nnn007NextNumber7.equals(that.nnn007NextNumber7) : that.nnn007NextNumber7 != null)
            return false;
        if (nnn008NextNumber8 != null ? !nnn008NextNumber8.equals(that.nnn008NextNumber8) : that.nnn008NextNumber8 != null)
            return false;
        if (nnn009NextNumber9 != null ? !nnn009NextNumber9.equals(that.nnn009NextNumber9) : that.nnn009NextNumber9 != null)
            return false;
        if (nnn010NextNumber10 != null ? !nnn010NextNumber10.equals(that.nnn010NextNumber10) : that.nnn010NextNumber10 != null)
            return false;
        if (nnck01CheckDigit1 != null ? !nnck01CheckDigit1.equals(that.nnck01CheckDigit1) : that.nnck01CheckDigit1 != null)
            return false;
        if (nnck02CheckDigit2 != null ? !nnck02CheckDigit2.equals(that.nnck02CheckDigit2) : that.nnck02CheckDigit2 != null)
            return false;
        if (nnck03CheckDigit3 != null ? !nnck03CheckDigit3.equals(that.nnck03CheckDigit3) : that.nnck03CheckDigit3 != null)
            return false;
        if (nnck04CheckDigit4 != null ? !nnck04CheckDigit4.equals(that.nnck04CheckDigit4) : that.nnck04CheckDigit4 != null)
            return false;
        if (nnck05CheckDigit5 != null ? !nnck05CheckDigit5.equals(that.nnck05CheckDigit5) : that.nnck05CheckDigit5 != null)
            return false;
        if (nnck06CheckDigit6 != null ? !nnck06CheckDigit6.equals(that.nnck06CheckDigit6) : that.nnck06CheckDigit6 != null)
            return false;
        if (nnck07CheckDigit7 != null ? !nnck07CheckDigit7.equals(that.nnck07CheckDigit7) : that.nnck07CheckDigit7 != null)
            return false;
        if (nnck08CheckDigit8 != null ? !nnck08CheckDigit8.equals(that.nnck08CheckDigit8) : that.nnck08CheckDigit8 != null)
            return false;
        if (nnck09CheckDigit9 != null ? !nnck09CheckDigit9.equals(that.nnck09CheckDigit9) : that.nnck09CheckDigit9 != null)
            return false;
        if (nnck10CheckDigit10 != null ? !nnck10CheckDigit10.equals(that.nnck10CheckDigit10) : that.nnck10CheckDigit10 != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nnsySystemCode != null ? nnsySystemCode.hashCode() : 0);
        result = 31 * result + (nnud01UserDesc1 != null ? nnud01UserDesc1.hashCode() : 0);
        result = 31 * result + (nnud02UserDesc2 != null ? nnud02UserDesc2.hashCode() : 0);
        result = 31 * result + (nnud03UserDesc3 != null ? nnud03UserDesc3.hashCode() : 0);
        result = 31 * result + (nnud04UserDesc4 != null ? nnud04UserDesc4.hashCode() : 0);
        result = 31 * result + (nnud05UserDesc5 != null ? nnud05UserDesc5.hashCode() : 0);
        result = 31 * result + (nnud06UserDesc6 != null ? nnud06UserDesc6.hashCode() : 0);
        result = 31 * result + (nnud07UserDesc7 != null ? nnud07UserDesc7.hashCode() : 0);
        result = 31 * result + (nnud08UserDesc8 != null ? nnud08UserDesc8.hashCode() : 0);
        result = 31 * result + (nnud09UserDesc9 != null ? nnud09UserDesc9.hashCode() : 0);
        result = 31 * result + (nnud10UserDesc10 != null ? nnud10UserDesc10.hashCode() : 0);
        result = 31 * result + (nnn001NextNumber1 != null ? nnn001NextNumber1.hashCode() : 0);
        result = 31 * result + (nnn002NextNumber2 != null ? nnn002NextNumber2.hashCode() : 0);
        result = 31 * result + (nnn003NextNumber3 != null ? nnn003NextNumber3.hashCode() : 0);
        result = 31 * result + (nnn004NextNumber4 != null ? nnn004NextNumber4.hashCode() : 0);
        result = 31 * result + (nnn005NextNumber5 != null ? nnn005NextNumber5.hashCode() : 0);
        result = 31 * result + (nnn006NextNumber6 != null ? nnn006NextNumber6.hashCode() : 0);
        result = 31 * result + (nnn007NextNumber7 != null ? nnn007NextNumber7.hashCode() : 0);
        result = 31 * result + (nnn008NextNumber8 != null ? nnn008NextNumber8.hashCode() : 0);
        result = 31 * result + (nnn009NextNumber9 != null ? nnn009NextNumber9.hashCode() : 0);
        result = 31 * result + (nnn010NextNumber10 != null ? nnn010NextNumber10.hashCode() : 0);
        result = 31 * result + (nnck01CheckDigit1 != null ? nnck01CheckDigit1.hashCode() : 0);
        result = 31 * result + (nnck02CheckDigit2 != null ? nnck02CheckDigit2.hashCode() : 0);
        result = 31 * result + (nnck03CheckDigit3 != null ? nnck03CheckDigit3.hashCode() : 0);
        result = 31 * result + (nnck04CheckDigit4 != null ? nnck04CheckDigit4.hashCode() : 0);
        result = 31 * result + (nnck05CheckDigit5 != null ? nnck05CheckDigit5.hashCode() : 0);
        result = 31 * result + (nnck06CheckDigit6 != null ? nnck06CheckDigit6.hashCode() : 0);
        result = 31 * result + (nnck07CheckDigit7 != null ? nnck07CheckDigit7.hashCode() : 0);
        result = 31 * result + (nnck08CheckDigit8 != null ? nnck08CheckDigit8.hashCode() : 0);
        result = 31 * result + (nnck09CheckDigit9 != null ? nnck09CheckDigit9.hashCode() : 0);
        result = 31 * result + (nnck10CheckDigit10 != null ? nnck10CheckDigit10.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"F0002AutomaticNextNumberingFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"nnsySystemCode\":\"" + nnsySystemCode + "\""
                + ",                         \"nnud01UserDesc1\":\"" + nnud01UserDesc1 + "\""
                + ",                         \"nnud02UserDesc2\":\"" + nnud02UserDesc2 + "\""
                + ",                         \"nnud03UserDesc3\":\"" + nnud03UserDesc3 + "\""
                + ",                         \"nnud04UserDesc4\":\"" + nnud04UserDesc4 + "\""
                + ",                         \"nnud05UserDesc5\":\"" + nnud05UserDesc5 + "\""
                + ",                         \"nnud06UserDesc6\":\"" + nnud06UserDesc6 + "\""
                + ",                         \"nnud07UserDesc7\":\"" + nnud07UserDesc7 + "\""
                + ",                         \"nnud08UserDesc8\":\"" + nnud08UserDesc8 + "\""
                + ",                         \"nnud09UserDesc9\":\"" + nnud09UserDesc9 + "\""
                + ",                         \"nnud10UserDesc10\":\"" + nnud10UserDesc10 + "\""
                + ",                         \"nnn001NextNumber1\":\"" + nnn001NextNumber1 + "\""
                + ",                         \"nnn002NextNumber2\":\"" + nnn002NextNumber2 + "\""
                + ",                         \"nnn003NextNumber3\":\"" + nnn003NextNumber3 + "\""
                + ",                         \"nnn004NextNumber4\":\"" + nnn004NextNumber4 + "\""
                + ",                         \"nnn005NextNumber5\":\"" + nnn005NextNumber5 + "\""
                + ",                         \"nnn006NextNumber6\":\"" + nnn006NextNumber6 + "\""
                + ",                         \"nnn007NextNumber7\":\"" + nnn007NextNumber7 + "\""
                + ",                         \"nnn008NextNumber8\":\"" + nnn008NextNumber8 + "\""
                + ",                         \"nnn009NextNumber9\":\"" + nnn009NextNumber9 + "\""
                + ",                         \"nnn010NextNumber10\":\"" + nnn010NextNumber10 + "\""
                + ",                         \"nnck01CheckDigit1\":\"" + nnck01CheckDigit1 + "\""
                + ",                         \"nnck02CheckDigit2\":\"" + nnck02CheckDigit2 + "\""
                + ",                         \"nnck03CheckDigit3\":\"" + nnck03CheckDigit3 + "\""
                + ",                         \"nnck04CheckDigit4\":\"" + nnck04CheckDigit4 + "\""
                + ",                         \"nnck05CheckDigit5\":\"" + nnck05CheckDigit5 + "\""
                + ",                         \"nnck06CheckDigit6\":\"" + nnck06CheckDigit6 + "\""
                + ",                         \"nnck07CheckDigit7\":\"" + nnck07CheckDigit7 + "\""
                + ",                         \"nnck08CheckDigit8\":\"" + nnck08CheckDigit8 + "\""
                + ",                         \"nnck09CheckDigit9\":\"" + nnck09CheckDigit9 + "\""
                + ",                         \"nnck10CheckDigit10\":\"" + nnck10CheckDigit10 + "\""
                + "}}";
    }
}
