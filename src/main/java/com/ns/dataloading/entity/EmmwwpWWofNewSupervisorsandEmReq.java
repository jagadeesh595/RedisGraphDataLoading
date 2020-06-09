package com.ns.dataloading.entity;

import javax.persistence.*;

@Entity
@Table(name = "EMMWWP_WWofNewSupervisorsandEMReq")
public class EmmwwpWWofNewSupervisorsandEmReq {
    private Long id;
    private Integer empyrProcessingYear;
    private Integer empmoProcessingMonth;
    private String emcntyIsoCntryCode;
    private Long emctycCountryCode;
    private Long emdidDistId;
    private Integer emsupNewSuperVisors;
    private Integer emreqEmRequired;

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
    @Column(name = "EMPYR_ProcessingYear", nullable = true)
    public Integer getEmpyrProcessingYear() {
        return empyrProcessingYear;
    }

    public void setEmpyrProcessingYear(Integer empyrProcessingYear) {
        this.empyrProcessingYear = empyrProcessingYear;
    }

    @Basic
    @Column(name = "EMPMO_ProcessingMonth", nullable = true)
    public Integer getEmpmoProcessingMonth() {
        return empmoProcessingMonth;
    }

    public void setEmpmoProcessingMonth(Integer empmoProcessingMonth) {
        this.empmoProcessingMonth = empmoProcessingMonth;
    }

    @Basic
    @Column(name = "EMCNTY_IsoCntryCode", nullable = true, length = 15)
    public String getEmcntyIsoCntryCode() {
        return emcntyIsoCntryCode;
    }

    public void setEmcntyIsoCntryCode(String emcntyIsoCntryCode) {
        this.emcntyIsoCntryCode = emcntyIsoCntryCode;
    }

    @Basic
    @Column(name = "EMCTYC_CountryCode", nullable = true)
    public Long getEmctycCountryCode() {
        return emctycCountryCode;
    }

    public void setEmctycCountryCode(Long emctycCountryCode) {
        this.emctycCountryCode = emctycCountryCode;
    }

    @Basic
    @Column(name = "EMDID_DistId", nullable = true)
    public Long getEmdidDistId() {
        return emdidDistId;
    }

    public void setEmdidDistId(Long emdidDistId) {
        this.emdidDistId = emdidDistId;
    }

    @Basic
    @Column(name = "EMSUP_NewSuperVisors", nullable = true)
    public Integer getEmsupNewSuperVisors() {
        return emsupNewSuperVisors;
    }

    public void setEmsupNewSuperVisors(Integer emsupNewSuperVisors) {
        this.emsupNewSuperVisors = emsupNewSuperVisors;
    }

    @Basic
    @Column(name = "EMREQ_EmRequired", nullable = true)
    public Integer getEmreqEmRequired() {
        return emreqEmRequired;
    }

    public void setEmreqEmRequired(Integer emreqEmRequired) {
        this.emreqEmRequired = emreqEmRequired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmmwwpWWofNewSupervisorsandEmReq that = (EmmwwpWWofNewSupervisorsandEmReq) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (empyrProcessingYear != null ? !empyrProcessingYear.equals(that.empyrProcessingYear) : that.empyrProcessingYear != null)
            return false;
        if (empmoProcessingMonth != null ? !empmoProcessingMonth.equals(that.empmoProcessingMonth) : that.empmoProcessingMonth != null)
            return false;
        if (emcntyIsoCntryCode != null ? !emcntyIsoCntryCode.equals(that.emcntyIsoCntryCode) : that.emcntyIsoCntryCode != null)
            return false;
        if (emctycCountryCode != null ? !emctycCountryCode.equals(that.emctycCountryCode) : that.emctycCountryCode != null)
            return false;
        if (emdidDistId != null ? !emdidDistId.equals(that.emdidDistId) : that.emdidDistId != null) return false;
        if (emsupNewSuperVisors != null ? !emsupNewSuperVisors.equals(that.emsupNewSuperVisors) : that.emsupNewSuperVisors != null)
            return false;
        if (emreqEmRequired != null ? !emreqEmRequired.equals(that.emreqEmRequired) : that.emreqEmRequired != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (empyrProcessingYear != null ? empyrProcessingYear.hashCode() : 0);
        result = 31 * result + (empmoProcessingMonth != null ? empmoProcessingMonth.hashCode() : 0);
        result = 31 * result + (emcntyIsoCntryCode != null ? emcntyIsoCntryCode.hashCode() : 0);
        result = 31 * result + (emctycCountryCode != null ? emctycCountryCode.hashCode() : 0);
        result = 31 * result + (emdidDistId != null ? emdidDistId.hashCode() : 0);
        result = 31 * result + (emsupNewSuperVisors != null ? emsupNewSuperVisors.hashCode() : 0);
        result = 31 * result + (emreqEmRequired != null ? emreqEmRequired.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"EmmwwpWWofNewSupervisorsandEmReq\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"empyrProcessingYear\":\"" + empyrProcessingYear + "\""
                + ",                         \"empmoProcessingMonth\":\"" + empmoProcessingMonth + "\""
                + ",                         \"emcntyIsoCntryCode\":\"" + emcntyIsoCntryCode + "\""
                + ",                         \"emctycCountryCode\":\"" + emctycCountryCode + "\""
                + ",                         \"emdidDistId\":\"" + emdidDistId + "\""
                + ",                         \"emsupNewSuperVisors\":\"" + emsupNewSuperVisors + "\""
                + ",                         \"emreqEmRequired\":\"" + emreqEmRequired + "\""
                + "}}";
    }

    public EmmwwpWWofNewSupervisorsandEmReq copy() {
        EmmwwpWWofNewSupervisorsandEmReq e = new EmmwwpWWofNewSupervisorsandEmReq();
        e.empyrProcessingYear = empyrProcessingYear;
        e.empmoProcessingMonth = empmoProcessingMonth;
        e.emcntyIsoCntryCode = emcntyIsoCntryCode;
        e.emctycCountryCode = emctycCountryCode;
        e.emdidDistId = emdidDistId;
        e.emsupNewSuperVisors = emsupNewSuperVisors;
        e.emreqEmRequired = emreqEmRequired;
        return e;
    }

}
