package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by rpalamakula on 16-08-2017.
 */
@RedisHash("BOFITP_FitStartOrder")
public class BofitpFitStartOrder implements Serializable {
    private  Long id;
    private @Indexed
    String bfcoidCompId;
    private @Indexed Long bfctlDistCtrl;
    private @Indexed Long bfordOrderNum;
    private @Indexed Integer bfpyrYear;
    private @Indexed Integer bfpmoMonth;
    private @Indexed String bfodatOrderDate;
    private @Indexed BigDecimal bfordccOderCasCre;
    private @Indexed BigDecimal bfndpccNdpcc;
    private @Indexed BigDecimal bfwhlccWhlcc;
    private @Indexed String bfpdatCreatedDate;
    private @Indexed String bfcusrLstChangeUser;
    private @Indexed Long bfordsOrderSrcCode;
    private @Indexed Long bfshpsShippingSrcCode;
    private @Indexed Long bfotypOrderTypeCode;
    private @Indexed String bfedteEntryTimeStamp;
    private @Indexed String bfcdteChangeTimeStamp;
    private @Indexed String bflitpLiteraturePakYOrN;
    private @Indexed String bflngSyjLang;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "BFCOID_CompId", nullable = false, length = 255)
    public String getBfcoidCompId() {
        return bfcoidCompId;
    }

    public void setBfcoidCompId(String bfcoidCompId) {
        this.bfcoidCompId = bfcoidCompId;
    }

    // @Basic
    // @Column(name = "BFCTL_DistCtrl", nullable = false)
    public Long getBfctlDistCtrl() {
        return bfctlDistCtrl;
    }

    public void setBfctlDistCtrl(Long bfctlDistCtrl) {
        this.bfctlDistCtrl = bfctlDistCtrl;
    }

    // @Basic
    // @Column(name = "BFORD_OrderNum", nullable = false)
    public Long getBfordOrderNum() {
        return bfordOrderNum;
    }

    public void setBfordOrderNum(Long bfordOrderNum) {
        this.bfordOrderNum = bfordOrderNum;
    }

    // @Basic
    // @Column(name = "BFPYR_Year", nullable = true)
    public Integer getBfpyrYear() {
        return bfpyrYear;
    }

    public void setBfpyrYear(Integer bfpyrYear) {
        this.bfpyrYear = bfpyrYear;
    }

    // @Basic
    // @Column(name = "BFPMO_Month", nullable = true)
    public Integer getBfpmoMonth() {
        return bfpmoMonth;
    }

    public void setBfpmoMonth(Integer bfpmoMonth) {
        this.bfpmoMonth = bfpmoMonth;
    }

    // @Basic
    // @Column(name = "BFODAT_OrderDate", nullable = true, length = 10)
    public String getBfodatOrderDate() {
        return bfodatOrderDate;
    }

    public void setBfodatOrderDate(String bfodatOrderDate) {
        this.bfodatOrderDate = bfodatOrderDate;
    }

    // @Basic
    // @Column(name = "BFORDCC_OderCasCre", nullable = true, precision = 3)
    public BigDecimal getBfordccOderCasCre() {
        return bfordccOderCasCre;
    }

    public void setBfordccOderCasCre(BigDecimal bfordccOderCasCre) {
        this.bfordccOderCasCre = bfordccOderCasCre;
    }

    // @Basic
    // @Column(name = "BFNDPCC_NDPCC", nullable = true, precision = 3)
    public BigDecimal getBfndpccNdpcc() {
        return bfndpccNdpcc;
    }

    public void setBfndpccNdpcc(BigDecimal bfndpccNdpcc) {
        this.bfndpccNdpcc = bfndpccNdpcc;
    }

    // @Basic
    // @Column(name = "BFWHLCC_WHLCC", nullable = true, precision = 3)
    public BigDecimal getBfwhlccWhlcc() {
        return bfwhlccWhlcc;
    }

    public void setBfwhlccWhlcc(BigDecimal bfwhlccWhlcc) {
        this.bfwhlccWhlcc = bfwhlccWhlcc;
    }

    // @Basic
    // @Column(name = "BFPDAT_CreatedDate", nullable = true, length = 10)
    public String getBfpdatCreatedDate() {
        return bfpdatCreatedDate;
    }

    public void setBfpdatCreatedDate(String bfpdatCreatedDate) {
        this.bfpdatCreatedDate = bfpdatCreatedDate;
    }

    // @Basic
    // @Column(name = "BFCUSR_LstChangeUser", nullable = true, length = 255)
    public String getBfcusrLstChangeUser() {
        return bfcusrLstChangeUser;
    }

    public void setBfcusrLstChangeUser(String bfcusrLstChangeUser) {
        this.bfcusrLstChangeUser = bfcusrLstChangeUser;
    }

    // @Basic
    // @Column(name = "BFORDS_OrderSrcCode", nullable = true)
    public Long getBfordsOrderSrcCode() {
        return bfordsOrderSrcCode;
    }

    public void setBfordsOrderSrcCode(Long bfordsOrderSrcCode) {
        this.bfordsOrderSrcCode = bfordsOrderSrcCode;
    }

    // @Basic
    // @Column(name = "BFSHPS_ShippingSrcCode", nullable = true)
    public Long getBfshpsShippingSrcCode() {
        return bfshpsShippingSrcCode;
    }

    public void setBfshpsShippingSrcCode(Long bfshpsShippingSrcCode) {
        this.bfshpsShippingSrcCode = bfshpsShippingSrcCode;
    }

    // @Basic
    // @Column(name = "BFOTYP_OrderTypeCode", nullable = true)
    public Long getBfotypOrderTypeCode() {
        return bfotypOrderTypeCode;
    }

    public void setBfotypOrderTypeCode(Long bfotypOrderTypeCode) {
        this.bfotypOrderTypeCode = bfotypOrderTypeCode;
    }

    // @Basic
    // @Column(name = "BFEDTE_EntryTimeStamp", nullable = true, length = 255)
    public String getBfedteEntryTimeStamp() {
        return bfedteEntryTimeStamp;
    }

    public void setBfedteEntryTimeStamp(String bfedteEntryTimeStamp) {
        this.bfedteEntryTimeStamp = bfedteEntryTimeStamp;
    }

    // @Basic
    // @Column(name = "BFCDTE_ChangeTimeStamp", nullable = true, length = 255)
    public String getBfcdteChangeTimeStamp() {
        return bfcdteChangeTimeStamp;
    }

    public void setBfcdteChangeTimeStamp(String bfcdteChangeTimeStamp) {
        this.bfcdteChangeTimeStamp = bfcdteChangeTimeStamp;
    }

    // @Basic
    // @Column(name = "BFLITP_LiteraturePakYOrN", nullable = true, length = 1)
    public String getBflitpLiteraturePakYOrN() {
        return bflitpLiteraturePakYOrN;
    }

    public void setBflitpLiteraturePakYOrN(String bflitpLiteraturePakYOrN) {
        this.bflitpLiteraturePakYOrN = bflitpLiteraturePakYOrN;
    }

    // @Basic
    // @Column(name = "BFLNG_SyjLang", nullable = true, length = 1)
    public String getBflngSyjLang() {
        return bflngSyjLang;
    }

    public void setBflngSyjLang(String bflngSyjLang) {
        this.bflngSyjLang = bflngSyjLang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BofitpFitStartOrder that = (BofitpFitStartOrder) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (bfcoidCompId != null ? !bfcoidCompId.equals(that.bfcoidCompId) : that.bfcoidCompId != null) return false;
        if (bfctlDistCtrl != null ? !bfctlDistCtrl.equals(that.bfctlDistCtrl) : that.bfctlDistCtrl != null)
            return false;
        if (bfordOrderNum != null ? !bfordOrderNum.equals(that.bfordOrderNum) : that.bfordOrderNum != null)
            return false;
        if (bfpyrYear != null ? !bfpyrYear.equals(that.bfpyrYear) : that.bfpyrYear != null) return false;
        if (bfpmoMonth != null ? !bfpmoMonth.equals(that.bfpmoMonth) : that.bfpmoMonth != null) return false;
        if (bfodatOrderDate != null ? !bfodatOrderDate.equals(that.bfodatOrderDate) : that.bfodatOrderDate != null)
            return false;
        if (bfordccOderCasCre != null ? !bfordccOderCasCre.equals(that.bfordccOderCasCre) : that.bfordccOderCasCre != null)
            return false;
        if (bfndpccNdpcc != null ? !bfndpccNdpcc.equals(that.bfndpccNdpcc) : that.bfndpccNdpcc != null) return false;
        if (bfwhlccWhlcc != null ? !bfwhlccWhlcc.equals(that.bfwhlccWhlcc) : that.bfwhlccWhlcc != null) return false;
        if (bfpdatCreatedDate != null ? !bfpdatCreatedDate.equals(that.bfpdatCreatedDate) : that.bfpdatCreatedDate != null)
            return false;
        if (bfcusrLstChangeUser != null ? !bfcusrLstChangeUser.equals(that.bfcusrLstChangeUser) : that.bfcusrLstChangeUser != null)
            return false;
        if (bfordsOrderSrcCode != null ? !bfordsOrderSrcCode.equals(that.bfordsOrderSrcCode) : that.bfordsOrderSrcCode != null)
            return false;
        if (bfshpsShippingSrcCode != null ? !bfshpsShippingSrcCode.equals(that.bfshpsShippingSrcCode) : that.bfshpsShippingSrcCode != null)
            return false;
        if (bfotypOrderTypeCode != null ? !bfotypOrderTypeCode.equals(that.bfotypOrderTypeCode) : that.bfotypOrderTypeCode != null)
            return false;
        if (bfedteEntryTimeStamp != null ? !bfedteEntryTimeStamp.equals(that.bfedteEntryTimeStamp) : that.bfedteEntryTimeStamp != null)
            return false;
        if (bfcdteChangeTimeStamp != null ? !bfcdteChangeTimeStamp.equals(that.bfcdteChangeTimeStamp) : that.bfcdteChangeTimeStamp != null)
            return false;
        if (bflitpLiteraturePakYOrN != null ? !bflitpLiteraturePakYOrN.equals(that.bflitpLiteraturePakYOrN) : that.bflitpLiteraturePakYOrN != null)
            return false;
        if (bflngSyjLang != null ? !bflngSyjLang.equals(that.bflngSyjLang) : that.bflngSyjLang != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (bfcoidCompId != null ? bfcoidCompId.hashCode() : 0);
        result = 31 * result + (bfctlDistCtrl != null ? bfctlDistCtrl.hashCode() : 0);
        result = 31 * result + (bfordOrderNum != null ? bfordOrderNum.hashCode() : 0);
        result = 31 * result + (bfpyrYear != null ? bfpyrYear.hashCode() : 0);
        result = 31 * result + (bfpmoMonth != null ? bfpmoMonth.hashCode() : 0);
        result = 31 * result + (bfodatOrderDate != null ? bfodatOrderDate.hashCode() : 0);
        result = 31 * result + (bfordccOderCasCre != null ? bfordccOderCasCre.hashCode() : 0);
        result = 31 * result + (bfndpccNdpcc != null ? bfndpccNdpcc.hashCode() : 0);
        result = 31 * result + (bfwhlccWhlcc != null ? bfwhlccWhlcc.hashCode() : 0);
        result = 31 * result + (bfpdatCreatedDate != null ? bfpdatCreatedDate.hashCode() : 0);
        result = 31 * result + (bfcusrLstChangeUser != null ? bfcusrLstChangeUser.hashCode() : 0);
        result = 31 * result + (bfordsOrderSrcCode != null ? bfordsOrderSrcCode.hashCode() : 0);
        result = 31 * result + (bfshpsShippingSrcCode != null ? bfshpsShippingSrcCode.hashCode() : 0);
        result = 31 * result + (bfotypOrderTypeCode != null ? bfotypOrderTypeCode.hashCode() : 0);
        result = 31 * result + (bfedteEntryTimeStamp != null ? bfedteEntryTimeStamp.hashCode() : 0);
        result = 31 * result + (bfcdteChangeTimeStamp != null ? bfcdteChangeTimeStamp.hashCode() : 0);
        result = 31 * result + (bflitpLiteraturePakYOrN != null ? bflitpLiteraturePakYOrN.hashCode() : 0);
        result = 31 * result + (bflngSyjLang != null ? bflngSyjLang.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BofitpFitStartOrder\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"bfcoidCompId\":\"" + bfcoidCompId + "\""
                + ",                         \"bfctlDistCtrl\":\"" + bfctlDistCtrl + "\""
                + ",                         \"bfordOrderNum\":\"" + bfordOrderNum + "\""
                + ",                         \"bfpyrYear\":\"" + bfpyrYear + "\""
                + ",                         \"bfpmoMonth\":\"" + bfpmoMonth + "\""
                + ",                         \"bfodatOrderDate\":\"" + bfodatOrderDate + "\""
                + ",                         \"bfordccOderCasCre\":\"" + bfordccOderCasCre + "\""
                + ",                         \"bfndpccNdpcc\":\"" + bfndpccNdpcc + "\""
                + ",                         \"bfwhlccWhlcc\":\"" + bfwhlccWhlcc + "\""
                + ",                         \"bfpdatCreatedDate\":\"" + bfpdatCreatedDate + "\""
                + ",                         \"bfcusrLstChangeUser\":\"" + bfcusrLstChangeUser + "\""
                + ",                         \"bfordsOrderSrcCode\":\"" + bfordsOrderSrcCode + "\""
                + ",                         \"bfshpsShippingSrcCode\":\"" + bfshpsShippingSrcCode + "\""
                + ",                         \"bfotypOrderTypeCode\":\"" + bfotypOrderTypeCode + "\""
                + ",                         \"bfedteEntryTimeStamp\":\"" + bfedteEntryTimeStamp + "\""
                + ",                         \"bfcdteChangeTimeStamp\":\"" + bfcdteChangeTimeStamp + "\""
                + "}}";
    }

}
