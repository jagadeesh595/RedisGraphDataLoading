package com.ns.dataloading.entityredis.entity;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@RedisHash("DISTACC_DailyAreaCCDownloadFile")
public class DistaccDailyAreaCcDownloadFile implements Serializable {
    private  Long id;
    private @Indexed
    String aregnRegion;
    private @Indexed Long aareaArea;
    private @Indexed String aadescAreaDescriotion;
    private @Indexed Integer acpmthCurrMth;
    private @Indexed Integer acpyrCurrYr;
    private @Indexed BigDecimal acpphyCurrMthParaPhyc;
    private @Indexed BigDecimal acdphyCurrMthDaraPhyc;
    private @Indexed BigDecimal acpcscCurrMthParaCasc;
    private @Indexed BigDecimal acdcscCurrMthDaraCasc;
    private @Indexed Integer appmthPriMth;
    private @Indexed Integer appyrPriYr;
    private @Indexed BigDecimal appphyPriMthParaPhyc;
    private @Indexed BigDecimal apdphyPriMthDaraPhyc;
    private @Indexed BigDecimal appcscPriMthParaCasc;
    private @Indexed BigDecimal apdcscPriMthDaraCasc;
    private @Indexed String ausridUserId;
    private @Indexed String apswrdPassword;

    @Id
 // @GeneratedValue(strategy = GenerationType.IDENTITY)// @Column(name = "ID", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // @Basic
    // @Column(name = "AREGN_Region", nullable = true, length = 255)
    public String getAregnRegion() {
        return aregnRegion;
    }

    public void setAregnRegion(String aregnRegion) {
        this.aregnRegion = aregnRegion;
    }

    // @Basic
    // @Column(name = "AAREA_Area", nullable = true)
    public Long getAareaArea() {
        return aareaArea;
    }

    public void setAareaArea(Long aareaArea) {
        this.aareaArea = aareaArea;
    }

    // @Basic
    // @Column(name = "AADESC_AreaDescriotion", nullable = true, length = 255)
    public String getAadescAreaDescriotion() {
        return aadescAreaDescriotion;
    }

    public void setAadescAreaDescriotion(String aadescAreaDescriotion) {
        this.aadescAreaDescriotion = aadescAreaDescriotion;
    }

    // @Basic
    // @Column(name = "ACPMTH_CurrMth", nullable = true)
    public Integer getAcpmthCurrMth() {
        return acpmthCurrMth;
    }

    public void setAcpmthCurrMth(Integer acpmthCurrMth) {
        this.acpmthCurrMth = acpmthCurrMth;
    }

    // @Basic
    // @Column(name = "ACPYR_CurrYr", nullable = true)
    public Integer getAcpyrCurrYr() {
        return acpyrCurrYr;
    }

    public void setAcpyrCurrYr(Integer acpyrCurrYr) {
        this.acpyrCurrYr = acpyrCurrYr;
    }

    // @Basic
    // @Column(name = "ACPPHY_CurrMthParaPhyc", nullable = true, precision = 3)
    public BigDecimal getAcpphyCurrMthParaPhyc() {
        return acpphyCurrMthParaPhyc;
    }

    public void setAcpphyCurrMthParaPhyc(BigDecimal acpphyCurrMthParaPhyc) {
        this.acpphyCurrMthParaPhyc = acpphyCurrMthParaPhyc;
    }

    // @Basic
    // @Column(name = "ACDPHY_CurrMthDaraPhyc", nullable = true, precision = 3)
    public BigDecimal getAcdphyCurrMthDaraPhyc() {
        return acdphyCurrMthDaraPhyc;
    }

    public void setAcdphyCurrMthDaraPhyc(BigDecimal acdphyCurrMthDaraPhyc) {
        this.acdphyCurrMthDaraPhyc = acdphyCurrMthDaraPhyc;
    }

    // @Basic
    // @Column(name = "ACPCSC_CurrMthParaCasc", nullable = true, precision = 3)
    public BigDecimal getAcpcscCurrMthParaCasc() {
        return acpcscCurrMthParaCasc;
    }

    public void setAcpcscCurrMthParaCasc(BigDecimal acpcscCurrMthParaCasc) {
        this.acpcscCurrMthParaCasc = acpcscCurrMthParaCasc;
    }

    // @Basic
    // @Column(name = "ACDCSC_CurrMthDaraCasc", nullable = true, precision = 3)
    public BigDecimal getAcdcscCurrMthDaraCasc() {
        return acdcscCurrMthDaraCasc;
    }

    public void setAcdcscCurrMthDaraCasc(BigDecimal acdcscCurrMthDaraCasc) {
        this.acdcscCurrMthDaraCasc = acdcscCurrMthDaraCasc;
    }

    // @Basic
    // @Column(name = "APPMTH_PriMth", nullable = true)
    public Integer getAppmthPriMth() {
        return appmthPriMth;
    }

    public void setAppmthPriMth(Integer appmthPriMth) {
        this.appmthPriMth = appmthPriMth;
    }

    // @Basic
    // @Column(name = "APPYR_PriYr", nullable = true)
    public Integer getAppyrPriYr() {
        return appyrPriYr;
    }

    public void setAppyrPriYr(Integer appyrPriYr) {
        this.appyrPriYr = appyrPriYr;
    }

    // @Basic
    // @Column(name = "APPPHY_PriMthParaPhyc", nullable = true, precision = 3)
    public BigDecimal getAppphyPriMthParaPhyc() {
        return appphyPriMthParaPhyc;
    }

    public void setAppphyPriMthParaPhyc(BigDecimal appphyPriMthParaPhyc) {
        this.appphyPriMthParaPhyc = appphyPriMthParaPhyc;
    }

    // @Basic
    // @Column(name = "APDPHY_PriMthDaraPhyc", nullable = true, precision = 3)
    public BigDecimal getApdphyPriMthDaraPhyc() {
        return apdphyPriMthDaraPhyc;
    }

    public void setApdphyPriMthDaraPhyc(BigDecimal apdphyPriMthDaraPhyc) {
        this.apdphyPriMthDaraPhyc = apdphyPriMthDaraPhyc;
    }

    // @Basic
    // @Column(name = "APPCSC_PriMthParaCasc", nullable = true, precision = 3)
    public BigDecimal getAppcscPriMthParaCasc() {
        return appcscPriMthParaCasc;
    }

    public void setAppcscPriMthParaCasc(BigDecimal appcscPriMthParaCasc) {
        this.appcscPriMthParaCasc = appcscPriMthParaCasc;
    }

    // @Basic
    // @Column(name = "APDCSC_PriMthDaraCasc", nullable = true, precision = 3)
    public BigDecimal getApdcscPriMthDaraCasc() {
        return apdcscPriMthDaraCasc;
    }

    public void setApdcscPriMthDaraCasc(BigDecimal apdcscPriMthDaraCasc) {
        this.apdcscPriMthDaraCasc = apdcscPriMthDaraCasc;
    }

    // @Basic
    // @Column(name = "AUSRID_UserId", nullable = true, length = 255)
    public String getAusridUserId() {
        return ausridUserId;
    }

    public void setAusridUserId(String ausridUserId) {
        this.ausridUserId = ausridUserId;
    }

    // @Basic
    // @Column(name = "APSWRD_Password", nullable = true, length = 15)
    public String getApswrdPassword() {
        return apswrdPassword;
    }

    public void setApswrdPassword(String apswrdPassword) {
        this.apswrdPassword = apswrdPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DistaccDailyAreaCcDownloadFile that = (DistaccDailyAreaCcDownloadFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (aregnRegion != null ? !aregnRegion.equals(that.aregnRegion) : that.aregnRegion != null) return false;
        if (aareaArea != null ? !aareaArea.equals(that.aareaArea) : that.aareaArea != null) return false;
        if (aadescAreaDescriotion != null ? !aadescAreaDescriotion.equals(that.aadescAreaDescriotion) : that.aadescAreaDescriotion != null)
            return false;
        if (acpmthCurrMth != null ? !acpmthCurrMth.equals(that.acpmthCurrMth) : that.acpmthCurrMth != null)
            return false;
        if (acpyrCurrYr != null ? !acpyrCurrYr.equals(that.acpyrCurrYr) : that.acpyrCurrYr != null) return false;
        if (acpphyCurrMthParaPhyc != null ? !acpphyCurrMthParaPhyc.equals(that.acpphyCurrMthParaPhyc) : that.acpphyCurrMthParaPhyc != null)
            return false;
        if (acdphyCurrMthDaraPhyc != null ? !acdphyCurrMthDaraPhyc.equals(that.acdphyCurrMthDaraPhyc) : that.acdphyCurrMthDaraPhyc != null)
            return false;
        if (acpcscCurrMthParaCasc != null ? !acpcscCurrMthParaCasc.equals(that.acpcscCurrMthParaCasc) : that.acpcscCurrMthParaCasc != null)
            return false;
        if (acdcscCurrMthDaraCasc != null ? !acdcscCurrMthDaraCasc.equals(that.acdcscCurrMthDaraCasc) : that.acdcscCurrMthDaraCasc != null)
            return false;
        if (appmthPriMth != null ? !appmthPriMth.equals(that.appmthPriMth) : that.appmthPriMth != null) return false;
        if (appyrPriYr != null ? !appyrPriYr.equals(that.appyrPriYr) : that.appyrPriYr != null) return false;
        if (appphyPriMthParaPhyc != null ? !appphyPriMthParaPhyc.equals(that.appphyPriMthParaPhyc) : that.appphyPriMthParaPhyc != null)
            return false;
        if (apdphyPriMthDaraPhyc != null ? !apdphyPriMthDaraPhyc.equals(that.apdphyPriMthDaraPhyc) : that.apdphyPriMthDaraPhyc != null)
            return false;
        if (appcscPriMthParaCasc != null ? !appcscPriMthParaCasc.equals(that.appcscPriMthParaCasc) : that.appcscPriMthParaCasc != null)
            return false;
        if (apdcscPriMthDaraCasc != null ? !apdcscPriMthDaraCasc.equals(that.apdcscPriMthDaraCasc) : that.apdcscPriMthDaraCasc != null)
            return false;
        if (ausridUserId != null ? !ausridUserId.equals(that.ausridUserId) : that.ausridUserId != null) return false;
        if (apswrdPassword != null ? !apswrdPassword.equals(that.apswrdPassword) : that.apswrdPassword != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (aregnRegion != null ? aregnRegion.hashCode() : 0);
        result = 31 * result + (aareaArea != null ? aareaArea.hashCode() : 0);
        result = 31 * result + (aadescAreaDescriotion != null ? aadescAreaDescriotion.hashCode() : 0);
        result = 31 * result + (acpmthCurrMth != null ? acpmthCurrMth.hashCode() : 0);
        result = 31 * result + (acpyrCurrYr != null ? acpyrCurrYr.hashCode() : 0);
        result = 31 * result + (acpphyCurrMthParaPhyc != null ? acpphyCurrMthParaPhyc.hashCode() : 0);
        result = 31 * result + (acdphyCurrMthDaraPhyc != null ? acdphyCurrMthDaraPhyc.hashCode() : 0);
        result = 31 * result + (acpcscCurrMthParaCasc != null ? acpcscCurrMthParaCasc.hashCode() : 0);
        result = 31 * result + (acdcscCurrMthDaraCasc != null ? acdcscCurrMthDaraCasc.hashCode() : 0);
        result = 31 * result + (appmthPriMth != null ? appmthPriMth.hashCode() : 0);
        result = 31 * result + (appyrPriYr != null ? appyrPriYr.hashCode() : 0);
        result = 31 * result + (appphyPriMthParaPhyc != null ? appphyPriMthParaPhyc.hashCode() : 0);
        result = 31 * result + (apdphyPriMthDaraPhyc != null ? apdphyPriMthDaraPhyc.hashCode() : 0);
        result = 31 * result + (appcscPriMthParaCasc != null ? appcscPriMthParaCasc.hashCode() : 0);
        result = 31 * result + (apdcscPriMthDaraCasc != null ? apdcscPriMthDaraCasc.hashCode() : 0);
        result = 31 * result + (ausridUserId != null ? ausridUserId.hashCode() : 0);
        result = 31 * result + (apswrdPassword != null ? apswrdPassword.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DistaccDailyAreaCcDownloadFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"aregnRegion\":\"" + aregnRegion + "\""
                + ",                         \"aareaArea\":\"" + aareaArea + "\""
                + ",                         \"aadescAreaDescriotion\":\"" + aadescAreaDescriotion + "\""
                + ",                         \"acpmthCurrMth\":\"" + acpmthCurrMth + "\""
                + ",                         \"acpyrCurrYr\":\"" + acpyrCurrYr + "\""
                + ",                         \"acpphyCurrMthParaPhyc\":\"" + acpphyCurrMthParaPhyc + "\""
                + ",                         \"acdphyCurrMthDaraPhyc\":\"" + acdphyCurrMthDaraPhyc + "\""
                + ",                         \"acpcscCurrMthParaCasc\":\"" + acpcscCurrMthParaCasc + "\""
                + ",                         \"acdcscCurrMthDaraCasc\":\"" + acdcscCurrMthDaraCasc + "\""
                + ",                         \"appmthPriMth\":\"" + appmthPriMth + "\""
                + ",                         \"appyrPriYr\":\"" + appyrPriYr + "\""
                + ",                         \"appphyPriMthParaPhyc\":\"" + appphyPriMthParaPhyc + "\""
                + ",                         \"apdphyPriMthDaraPhyc\":\"" + apdphyPriMthDaraPhyc + "\""
                + ",                         \"appcscPriMthParaCasc\":\"" + appcscPriMthParaCasc + "\""
                + ",                         \"apdcscPriMthDaraCasc\":\"" + apdcscPriMthDaraCasc + "\""
                + ",                         \"ausridUserId\":\"" + ausridUserId + "\""
                + ",                         \"apswrdPassword\":\"" + apswrdPassword + "\""
                + "}}";
    }
}
