package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "BOEXCP_BonusRateExchangeFile")
public class BoexcpBonusRateExchangeFile {
    private Long id;
    private Integer expyrProcessYear;
    private Integer expmoProcessMonth;
    private BigDecimal exrateExchangeRate;
    private String exfrcuFromCurrency;
    private String extocuToCurrency;

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
    @Column(name = "EXPYR_ProcessYear", nullable = true)
    public Integer getExpyrProcessYear() {
        return expyrProcessYear;
    }

    public void setExpyrProcessYear(Integer expyrProcessYear) {
        this.expyrProcessYear = expyrProcessYear;
    }

    @Basic
    @Column(name = "EXPMO_ProcessMonth", nullable = true)
    public Integer getExpmoProcessMonth() {
        return expmoProcessMonth;
    }

    public void setExpmoProcessMonth(Integer expmoProcessMonth) {
        this.expmoProcessMonth = expmoProcessMonth;
    }

    @Basic
    @Column(name = "EXRATE_ExchangeRate", nullable = true, precision = 3)
    public BigDecimal getExrateExchangeRate() {
        return exrateExchangeRate;
    }

    public void setExrateExchangeRate(BigDecimal exrateExchangeRate) {
        this.exrateExchangeRate = exrateExchangeRate;
    }

    @Basic
    @Column(name = "EXFRCU_FromCurrency", nullable = true, length = 255)
    public String getExfrcuFromCurrency() {
        return exfrcuFromCurrency;
    }

    public void setExfrcuFromCurrency(String exfrcuFromCurrency) {
        this.exfrcuFromCurrency = exfrcuFromCurrency;
    }

    @Basic
    @Column(name = "EXTOCU_ToCurrency", nullable = true, length = 255)
    public String getExtocuToCurrency() {
        return extocuToCurrency;
    }

    public void setExtocuToCurrency(String extocuToCurrency) {
        this.extocuToCurrency = extocuToCurrency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BoexcpBonusRateExchangeFile that = (BoexcpBonusRateExchangeFile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (expyrProcessYear != null ? !expyrProcessYear.equals(that.expyrProcessYear) : that.expyrProcessYear != null)
            return false;
        if (expmoProcessMonth != null ? !expmoProcessMonth.equals(that.expmoProcessMonth) : that.expmoProcessMonth != null)
            return false;
        if (exrateExchangeRate != null ? !exrateExchangeRate.equals(that.exrateExchangeRate) : that.exrateExchangeRate != null)
            return false;
        if (exfrcuFromCurrency != null ? !exfrcuFromCurrency.equals(that.exfrcuFromCurrency) : that.exfrcuFromCurrency != null)
            return false;
        if (extocuToCurrency != null ? !extocuToCurrency.equals(that.extocuToCurrency) : that.extocuToCurrency != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (expyrProcessYear != null ? expyrProcessYear.hashCode() : 0);
        result = 31 * result + (expmoProcessMonth != null ? expmoProcessMonth.hashCode() : 0);
        result = 31 * result + (exrateExchangeRate != null ? exrateExchangeRate.hashCode() : 0);
        result = 31 * result + (exfrcuFromCurrency != null ? exfrcuFromCurrency.hashCode() : 0);
        result = 31 * result + (extocuToCurrency != null ? extocuToCurrency.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "{\"BoexcpBonusRateExchangeFile\":{"
                + "                        \"id\":\"" + id + "\""
                + ",                         \"expyrProcessYear\":\"" + expyrProcessYear + "\""
                + ",                         \"expmoProcessMonth\":\"" + expmoProcessMonth + "\""
                + ",                         \"exrateExchangeRate\":\"" + exrateExchangeRate + "\""
                + ",                         \"exfrcuFromCurrency\":\"" + exfrcuFromCurrency + "\""
                + ",                         \"extocuToCurrency\":\"" + extocuToCurrency + "\""
                + "}}";
    }
}
