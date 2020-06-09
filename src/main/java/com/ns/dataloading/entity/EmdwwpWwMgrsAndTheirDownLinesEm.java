package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "EMDWWP_WWMgrsAndTheirDownLinesEm")
public class EmdwwpWwMgrsAndTheirDownLinesEm {
    private Long id;
    private Integer edpyrProcessingYear;
    private Integer edpmoProcessingMonth;
    private String edcntyIsoCountry;
    private Long edctycCountryCode;
    private Long eddidDistributorId;
    private Long ed1CcFirstGenCc;
    private Long ed1IdFirstGenId;
    private Long edgenGeneration;
    private Long eddwccDwnlnCtryCd;
    private Long eddwidDwnlnId;
    private String edfnamFirstName;
    private String edlnamLastName;
    private BigDecimal edtccTotalCc;
    private BigDecimal ednccNewPerOrNmCc;
    private Long edsupNewSuperVisors;
    private Long edreqEmRequired;
    private Long edemEagleMgrs;

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
    @Column(name = "EDPYR_ProcessingYear", nullable = true)
    public Integer getEdpyrProcessingYear() {
        return edpyrProcessingYear;
    }

    public void setEdpyrProcessingYear(Integer edpyrProcessingYear) {
        this.edpyrProcessingYear = edpyrProcessingYear;
    }

    @Basic
    @Column(name = "EDPMO_ProcessingMonth", nullable = true)
    public Integer getEdpmoProcessingMonth() {
        return edpmoProcessingMonth;
    }

    public void setEdpmoProcessingMonth(Integer edpmoProcessingMonth) {
        this.edpmoProcessingMonth = edpmoProcessingMonth;
    }

    @Basic
    @Column(name = "EDCNTY_IsoCountry", nullable = true, length = 15)
    public String getEdcntyIsoCountry() {
        return edcntyIsoCountry;
    }

    public void setEdcntyIsoCountry(String edcntyIsoCountry) {
        this.edcntyIsoCountry = edcntyIsoCountry;
    }

    @Basic
    @Column(name = "EDCTYC_CountryCode", nullable = true)
    public Long getEdctycCountryCode() {
        return edctycCountryCode;
    }

    public void setEdctycCountryCode(Long edctycCountryCode) {
        this.edctycCountryCode = edctycCountryCode;
    }

    @Basic
    @Column(name = "EDDID_DistributorId", nullable = true)
    public Long getEddidDistributorId() {
        return eddidDistributorId;
    }

    public void setEddidDistributorId(Long eddidDistributorId) {
        this.eddidDistributorId = eddidDistributorId;
    }

    @Basic
    @Column(name = "ED1CC_FirstGenCc", nullable = true)
    public Long getEd1CcFirstGenCc() {
        return ed1CcFirstGenCc;
    }

    public void setEd1CcFirstGenCc(Long ed1CcFirstGenCc) {
        this.ed1CcFirstGenCc = ed1CcFirstGenCc;
    }

    @Basic
    @Column(name = "ED1ID_FirstGenId", nullable = true)
    public Long getEd1IdFirstGenId() {
        return ed1IdFirstGenId;
    }

    public void setEd1IdFirstGenId(Long ed1IdFirstGenId) {
        this.ed1IdFirstGenId = ed1IdFirstGenId;
    }

    @Basic
    @Column(name = "EDGEN_Generation", nullable = true)
    public Long getEdgenGeneration() {
        return edgenGeneration;
    }

    public void setEdgenGeneration(Long edgenGeneration) {
        this.edgenGeneration = edgenGeneration;
    }

    @Basic
    @Column(name = "EDDWCC_DwnlnCtryCd", nullable = true)
    public Long getEddwccDwnlnCtryCd() {
        return eddwccDwnlnCtryCd;
    }

    public void setEddwccDwnlnCtryCd(Long eddwccDwnlnCtryCd) {
        this.eddwccDwnlnCtryCd = eddwccDwnlnCtryCd;
    }

    @Basic
    @Column(name = "EDDWID_DwnlnId", nullable = true)
    public Long getEddwidDwnlnId() {
        return eddwidDwnlnId;
    }

    public void setEddwidDwnlnId(Long eddwidDwnlnId) {
        this.eddwidDwnlnId = eddwidDwnlnId;
    }

    @Basic
    @Column(name = "EDFNAM_FirstName", nullable = true, length = 255)
    public String getEdfnamFirstName() {
        return edfnamFirstName;
    }

    public void setEdfnamFirstName(String edfnamFirstName) {
        this.edfnamFirstName = edfnamFirstName;
    }

    @Basic
    @Column(name = "EDLNAM_LastName", nullable = true, length = 255)
    public String getEdlnamLastName() {
        return edlnamLastName;
    }

    public void setEdlnamLastName(String edlnamLastName) {
        this.edlnamLastName = edlnamLastName;
    }

    @Basic
    @Column(name = "EDTCC_TotalCc", nullable = true, precision = 3)
    public BigDecimal getEdtccTotalCc() {
        return edtccTotalCc;
    }

    public void setEdtccTotalCc(BigDecimal edtccTotalCc) {
        this.edtccTotalCc = edtccTotalCc;
    }

    @Basic
    @Column(name = "EDNCC_NewPerOrNmCc", nullable = true, precision = 3)
    public BigDecimal getEdnccNewPerOrNmCc() {
        return ednccNewPerOrNmCc;
    }

    public void setEdnccNewPerOrNmCc(BigDecimal ednccNewPerOrNmCc) {
        this.ednccNewPerOrNmCc = ednccNewPerOrNmCc;
    }

    @Basic
    @Column(name = "EDSUP_NewSuperVisors", nullable = true)
    public Long getEdsupNewSuperVisors() {
        return edsupNewSuperVisors;
    }

    public void setEdsupNewSuperVisors(Long edsupNewSuperVisors) {
        this.edsupNewSuperVisors = edsupNewSuperVisors;
    }

    @Basic
    @Column(name = "EDREQ_EmRequired", nullable = true)
    public Long getEdreqEmRequired() {
        return edreqEmRequired;
    }

    public void setEdreqEmRequired(Long edreqEmRequired) {
        this.edreqEmRequired = edreqEmRequired;
    }

    @Basic
    @Column(name = "EDEM_EagleMgrs", nullable = true)
    public Long getEdemEagleMgrs() {
        return edemEagleMgrs;
    }

    public void setEdemEagleMgrs(Long edemEagleMgrs) {
        this.edemEagleMgrs = edemEagleMgrs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmdwwpWwMgrsAndTheirDownLinesEm that = (EmdwwpWwMgrsAndTheirDownLinesEm) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (edpyrProcessingYear != null ? !edpyrProcessingYear.equals(that.edpyrProcessingYear) : that.edpyrProcessingYear != null)
            return false;
        if (edpmoProcessingMonth != null ? !edpmoProcessingMonth.equals(that.edpmoProcessingMonth) : that.edpmoProcessingMonth != null)
            return false;
        if (edcntyIsoCountry != null ? !edcntyIsoCountry.equals(that.edcntyIsoCountry) : that.edcntyIsoCountry != null)
            return false;
        if (edctycCountryCode != null ? !edctycCountryCode.equals(that.edctycCountryCode) : that.edctycCountryCode != null)
            return false;
        if (eddidDistributorId != null ? !eddidDistributorId.equals(that.eddidDistributorId) : that.eddidDistributorId != null)
            return false;
        if (ed1CcFirstGenCc != null ? !ed1CcFirstGenCc.equals(that.ed1CcFirstGenCc) : that.ed1CcFirstGenCc != null)
            return false;
        if (ed1IdFirstGenId != null ? !ed1IdFirstGenId.equals(that.ed1IdFirstGenId) : that.ed1IdFirstGenId != null)
            return false;
        if (edgenGeneration != null ? !edgenGeneration.equals(that.edgenGeneration) : that.edgenGeneration != null)
            return false;
        if (eddwccDwnlnCtryCd != null ? !eddwccDwnlnCtryCd.equals(that.eddwccDwnlnCtryCd) : that.eddwccDwnlnCtryCd != null)
            return false;
        if (eddwidDwnlnId != null ? !eddwidDwnlnId.equals(that.eddwidDwnlnId) : that.eddwidDwnlnId != null)
            return false;
        if (edfnamFirstName != null ? !edfnamFirstName.equals(that.edfnamFirstName) : that.edfnamFirstName != null)
            return false;
        if (edlnamLastName != null ? !edlnamLastName.equals(that.edlnamLastName) : that.edlnamLastName != null)
            return false;
        if (edtccTotalCc != null ? !edtccTotalCc.equals(that.edtccTotalCc) : that.edtccTotalCc != null) return false;
        if (ednccNewPerOrNmCc != null ? !ednccNewPerOrNmCc.equals(that.ednccNewPerOrNmCc) : that.ednccNewPerOrNmCc != null)
            return false;
        if (edsupNewSuperVisors != null ? !edsupNewSuperVisors.equals(that.edsupNewSuperVisors) : that.edsupNewSuperVisors != null)
            return false;
        if (edreqEmRequired != null ? !edreqEmRequired.equals(that.edreqEmRequired) : that.edreqEmRequired != null)
            return false;
        if (edemEagleMgrs != null ? !edemEagleMgrs.equals(that.edemEagleMgrs) : that.edemEagleMgrs != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (edpyrProcessingYear != null ? edpyrProcessingYear.hashCode() : 0);
        result = 31 * result + (edpmoProcessingMonth != null ? edpmoProcessingMonth.hashCode() : 0);
        result = 31 * result + (edcntyIsoCountry != null ? edcntyIsoCountry.hashCode() : 0);
        result = 31 * result + (edctycCountryCode != null ? edctycCountryCode.hashCode() : 0);
        result = 31 * result + (eddidDistributorId != null ? eddidDistributorId.hashCode() : 0);
        result = 31 * result + (ed1CcFirstGenCc != null ? ed1CcFirstGenCc.hashCode() : 0);
        result = 31 * result + (ed1IdFirstGenId != null ? ed1IdFirstGenId.hashCode() : 0);
        result = 31 * result + (edgenGeneration != null ? edgenGeneration.hashCode() : 0);
        result = 31 * result + (eddwccDwnlnCtryCd != null ? eddwccDwnlnCtryCd.hashCode() : 0);
        result = 31 * result + (eddwidDwnlnId != null ? eddwidDwnlnId.hashCode() : 0);
        result = 31 * result + (edfnamFirstName != null ? edfnamFirstName.hashCode() : 0);
        result = 31 * result + (edlnamLastName != null ? edlnamLastName.hashCode() : 0);
        result = 31 * result + (edtccTotalCc != null ? edtccTotalCc.hashCode() : 0);
        result = 31 * result + (ednccNewPerOrNmCc != null ? ednccNewPerOrNmCc.hashCode() : 0);
        result = 31 * result + (edsupNewSuperVisors != null ? edsupNewSuperVisors.hashCode() : 0);
        result = 31 * result + (edreqEmRequired != null ? edreqEmRequired.hashCode() : 0);
        result = 31 * result + (edemEagleMgrs != null ? edemEagleMgrs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"EmdwwpWwMgrsAndTheirDownLinesEm\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"edpyrProcessingYear\":\"" + edpyrProcessingYear + "\""
                + ",                         \"edpmoProcessingMonth\":\"" + edpmoProcessingMonth + "\""
                + ",                         \"edcntyIsoCountry\":\"" + edcntyIsoCountry + "\""
                + ",                         \"edctycCountryCode\":\"" + edctycCountryCode + "\""
                + ",                         \"eddidDistributorId\":\"" + eddidDistributorId + "\""
                + ",                         \"ed1CcFirstGenCc\":\"" + ed1CcFirstGenCc + "\""
                + ",                         \"ed1IdFirstGenId\":\"" + ed1IdFirstGenId + "\""
                + ",                         \"edgenGeneration\":\"" + edgenGeneration + "\""
                + ",                         \"eddwccDwnlnCtryCd\":\"" + eddwccDwnlnCtryCd + "\""
                + ",                         \"eddwidDwnlnId\":\"" + eddwidDwnlnId + "\""
                + ",                         \"edfnamFirstName\":\"" + edfnamFirstName + "\""
                + ",                         \"edlnamLastName\":\"" + edlnamLastName + "\""
                + ",                         \"edtccTotalCc\":\"" + edtccTotalCc + "\""
                + ",                         \"ednccNewPerOrNmCc\":\"" + ednccNewPerOrNmCc + "\""
                + ",                         \"edsupNewSuperVisors\":\"" + edsupNewSuperVisors + "\""
                + ",                         \"edreqEmRequired\":\"" + edreqEmRequired + "\""
                + ",                         \"edemEagleMgrs\":\"" + edemEagleMgrs + "\""
                + "}}";
    }

    public EmdwwpWwMgrsAndTheirDownLinesEm copy() {
        EmdwwpWwMgrsAndTheirDownLinesEm e = new EmdwwpWwMgrsAndTheirDownLinesEm();
        e.edpyrProcessingYear = edpyrProcessingYear;
        e.edpmoProcessingMonth = edpmoProcessingMonth;
        e.edcntyIsoCountry = edcntyIsoCountry;
        e.edctycCountryCode = edctycCountryCode;
        e.eddidDistributorId = eddidDistributorId;
        e.ed1CcFirstGenCc = ed1CcFirstGenCc;
        e.ed1IdFirstGenId = ed1IdFirstGenId;
        e.edgenGeneration = edgenGeneration;
        e.eddwccDwnlnCtryCd = eddwccDwnlnCtryCd;
        e.eddwidDwnlnId = eddwidDwnlnId;
        e.edfnamFirstName = edfnamFirstName;
        e.edlnamLastName = edlnamLastName;
        e.edtccTotalCc = edtccTotalCc;
        e.ednccNewPerOrNmCc = ednccNewPerOrNmCc;
        e.edsupNewSuperVisors = edsupNewSuperVisors;
        e.edreqEmRequired = edreqEmRequired;
        e.edemEagleMgrs = edemEagleMgrs;
        return e;
    }


}
