package com.ns.dataloading.entity;

import javax.persistence.*;
import java.math.BigDecimal;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "YE630P_WorkTableForAnnualWriteOffs")
public class Ye630pWorktableforannualwriteoffs implements java.io.Serializable {

	private Long id;
	private Long ywctlDistributorControl;
	private BigDecimal ywbalDebtBalance;

	public Ye630pWorktableforannualwriteoffs() {
	}

	public Ye630pWorktableforannualwriteoffs(Long ywctlDistributorControl, BigDecimal ywbalDebtBalance) {
		this.ywctlDistributorControl = ywctlDistributorControl;
		this.ywbalDebtBalance = ywbalDebtBalance;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "YWCTL_DistributorControl")
	public Long getYwctlDistributorControl() {
		return this.ywctlDistributorControl;
	}

	public void setYwctlDistributorControl(Long ywctlDistributorControl) {
		this.ywctlDistributorControl = ywctlDistributorControl;
	}

	@Column(name = "YWBAL_DebtBalance", precision = 10, scale = 3)
	public BigDecimal getYwbalDebtBalance() {
		return this.ywbalDebtBalance;
	}

	public void setYwbalDebtBalance(BigDecimal ywbalDebtBalance) {
		this.ywbalDebtBalance = ywbalDebtBalance;
	}

}
