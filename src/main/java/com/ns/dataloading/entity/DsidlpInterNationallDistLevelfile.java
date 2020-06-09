package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "DSIDLP_InterNationallDistLevelfile")
public class DsidlpInterNationallDistLevelfile {
    private Long id;
    private Integer idpyrProcessYear;
    private Integer idpmoProcessMonth;
    private String idtrncTransactionCode;
    private String idictyIssuingCountry;
    private Long idctlDistributorControl;
    private Long idctycDistributorCountryCode;
    private Long iddidDistributorId;
    private Integer idlevlLevel;
    private String iddqmgRecognizedManager;
    private String idchgdChangeDate;
    private String idchgpChangeProgram;
    private String idprocProcessFlag;

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
    @Column(name = "IDPYR_ProcessYear", nullable = true)
    public Integer getIdpyrProcessYear() {
        return idpyrProcessYear;
    }

    public void setIdpyrProcessYear(Integer idpyrProcessYear) {
        this.idpyrProcessYear = idpyrProcessYear;
    }

    @Basic
    @Column(name = "IDPMO_ProcessMonth", nullable = true)
    public Integer getIdpmoProcessMonth() {
        return idpmoProcessMonth;
    }

    public void setIdpmoProcessMonth(Integer idpmoProcessMonth) {
        this.idpmoProcessMonth = idpmoProcessMonth;
    }

    @Basic
    @Column(name = "IDTRNC_TransactionCode", nullable = true, length = 255)
    public String getIdtrncTransactionCode() {
        return idtrncTransactionCode;
    }

    public void setIdtrncTransactionCode(String idtrncTransactionCode) {
        this.idtrncTransactionCode = idtrncTransactionCode;
    }

    @Basic
    @Column(name = "IDICTY_issuingCountry", nullable = true, length = 255)
    public String getIdictyIssuingCountry() {
        return idictyIssuingCountry;
    }

    public void setIdictyIssuingCountry(String idictyIssuingCountry) {
        this.idictyIssuingCountry = idictyIssuingCountry;
    }

    @Basic
    @Column(name = "IDCTL_DistributorControl", nullable = false)
    public Long getIdctlDistributorControl() {
        return idctlDistributorControl;
    }

    public void setIdctlDistributorControl(Long idctlDistributorControl) {
        this.idctlDistributorControl = idctlDistributorControl;
    }

    @Basic
    @Column(name = "IDCTYC_DistributorCountryCode", nullable = true)
    public Long getIdctycDistributorCountryCode() {
        return idctycDistributorCountryCode;
    }

    public void setIdctycDistributorCountryCode(Long idctycDistributorCountryCode) {
        this.idctycDistributorCountryCode = idctycDistributorCountryCode;
    }

    @Basic
    @Column(name = "IDDID_DistributorId", nullable = false)
    public Long getIddidDistributorId() {
        return iddidDistributorId;
    }

    public void setIddidDistributorId(Long iddidDistributorId) {
        this.iddidDistributorId = iddidDistributorId;
    }

    @Basic
    @Column(name = "IDLEVL_Level", nullable = true)
    public Integer getIdlevlLevel() {
        return idlevlLevel;
    }

    public void setIdlevlLevel(Integer idlevlLevel) {
        this.idlevlLevel = idlevlLevel;
    }

    @Basic
    @Column(name = "IDDQMG_RecognizedManager", nullable = true, length = 1)
    public String getIddqmgRecognizedManager() {
        return iddqmgRecognizedManager;
    }

    public void setIddqmgRecognizedManager(String iddqmgRecognizedManager) {
        this.iddqmgRecognizedManager = iddqmgRecognizedManager;
    }

    @Basic
    @Column(name = "IDCHGD_ChangeDate", nullable = true, length = 15)
    public String getIdchgdChangeDate() {
        return idchgdChangeDate;
    }

    public void setIdchgdChangeDate(String idchgdChangeDate) {
        this.idchgdChangeDate = idchgdChangeDate;
    }

    @Basic
    @Column(name = "IDCHGP_ChangeProgram", nullable = true, length = 15)
    public String getIdchgpChangeProgram() {
        return idchgpChangeProgram;
    }

    public void setIdchgpChangeProgram(String idchgpChangeProgram) {
        this.idchgpChangeProgram = idchgpChangeProgram;
    }

    @Basic
    @Column(name = "IDPROC_ProcessFlag", nullable = true, length = 1)
    public String getIdprocProcessFlag() {
        return idprocProcessFlag;
    }

    public void setIdprocProcessFlag(String idprocProcessFlag) {
        this.idprocProcessFlag = idprocProcessFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DsidlpInterNationallDistLevelfile that = (DsidlpInterNationallDistLevelfile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (idpyrProcessYear != null ? !idpyrProcessYear.equals(that.idpyrProcessYear) : that.idpyrProcessYear != null)
            return false;
        if (idpmoProcessMonth != null ? !idpmoProcessMonth.equals(that.idpmoProcessMonth) : that.idpmoProcessMonth != null)
            return false;
        if (idtrncTransactionCode != null ? !idtrncTransactionCode.equals(that.idtrncTransactionCode) : that.idtrncTransactionCode != null)
            return false;
        if (idictyIssuingCountry != null ? !idictyIssuingCountry.equals(that.idictyIssuingCountry) : that.idictyIssuingCountry != null)
            return false;
        if (idctlDistributorControl != null ? !idctlDistributorControl.equals(that.idctlDistributorControl) : that.idctlDistributorControl != null)
            return false;
        if (idctycDistributorCountryCode != null ? !idctycDistributorCountryCode.equals(that.idctycDistributorCountryCode) : that.idctycDistributorCountryCode != null)
            return false;
        if (iddidDistributorId != null ? !iddidDistributorId.equals(that.iddidDistributorId) : that.iddidDistributorId != null)
            return false;
        if (idlevlLevel != null ? !idlevlLevel.equals(that.idlevlLevel) : that.idlevlLevel != null) return false;
        if (iddqmgRecognizedManager != null ? !iddqmgRecognizedManager.equals(that.iddqmgRecognizedManager) : that.iddqmgRecognizedManager != null)
            return false;
        if (idchgdChangeDate != null ? !idchgdChangeDate.equals(that.idchgdChangeDate) : that.idchgdChangeDate != null)
            return false;
        if (idchgpChangeProgram != null ? !idchgpChangeProgram.equals(that.idchgpChangeProgram) : that.idchgpChangeProgram != null)
            return false;
        if (idprocProcessFlag != null ? !idprocProcessFlag.equals(that.idprocProcessFlag) : that.idprocProcessFlag != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (idpyrProcessYear != null ? idpyrProcessYear.hashCode() : 0);
        result = 31 * result + (idpmoProcessMonth != null ? idpmoProcessMonth.hashCode() : 0);
        result = 31 * result + (idtrncTransactionCode != null ? idtrncTransactionCode.hashCode() : 0);
        result = 31 * result + (idictyIssuingCountry != null ? idictyIssuingCountry.hashCode() : 0);
        result = 31 * result + (idctlDistributorControl != null ? idctlDistributorControl.hashCode() : 0);
        result = 31 * result + (idctycDistributorCountryCode != null ? idctycDistributorCountryCode.hashCode() : 0);
        result = 31 * result + (iddidDistributorId != null ? iddidDistributorId.hashCode() : 0);
        result = 31 * result + (idlevlLevel != null ? idlevlLevel.hashCode() : 0);
        result = 31 * result + (iddqmgRecognizedManager != null ? iddqmgRecognizedManager.hashCode() : 0);
        result = 31 * result + (idchgdChangeDate != null ? idchgdChangeDate.hashCode() : 0);
        result = 31 * result + (idchgpChangeProgram != null ? idchgpChangeProgram.hashCode() : 0);
        result = 31 * result + (idprocProcessFlag != null ? idprocProcessFlag.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"DsidlpInterNationallDistLevelfile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"idpyrProcessYear\":\"" + idpyrProcessYear + "\""
                + ",                         \"idpmoProcessMonth\":\"" + idpmoProcessMonth + "\""
                + ",                         \"idtrncTransactionCode\":\"" + idtrncTransactionCode + "\""
                + ",                         \"idictyIssuingCountry\":\"" + idictyIssuingCountry + "\""
                + ",                         \"idctlDistributorControl\":\"" + idctlDistributorControl + "\""
                + ",                         \"idctycDistributorCountryCode\":\"" + idctycDistributorCountryCode + "\""
                + ",                         \"iddidDistributorId\":\"" + iddidDistributorId + "\""
                + ",                         \"idlevlLevel\":\"" + idlevlLevel + "\""
                + ",                         \"iddqmgRecognizedManager\":\"" + iddqmgRecognizedManager + "\""
                + ",                         \"idchgdChangeDate\":\"" + idchgdChangeDate + "\""
                + ",                         \"idchgpChangeProgram\":\"" + idchgpChangeProgram + "\""
                + ",                         \"idprocProcessFlag\":\"" + idprocProcessFlag + "\""
                + "}}";
    }
}
