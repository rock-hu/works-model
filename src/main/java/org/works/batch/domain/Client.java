package org.works.batch.domain;

import java.math.BigDecimal;
import java.util.List;

public class Client extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6427793677260492350L;
	private BigDecimal incomeRangeLow;
	private BigDecimal incomeRangeHigh;

	private boolean married;

	private int planRetirementAge;

	private long jobCategory;

	private List<Child> children;

	private Spouse spouse;

	private List<Parent> parents;

	public BigDecimal getIncomeRangeLow() {
		return incomeRangeLow;
	}

	public void setIncomeRangeLow(BigDecimal incomeRangeLow) {
		this.incomeRangeLow = incomeRangeLow;
	}

	public BigDecimal getIncomeRangeHigh() {
		return incomeRangeHigh;
	}

	public void setIncomeRangeHigh(BigDecimal incomeRangeHigh) {
		this.incomeRangeHigh = incomeRangeHigh;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public int getPlanRetirementAge() {
		return planRetirementAge;
	}

	public void setPlanRetirementAge(int planRetirementAge) {
		this.planRetirementAge = planRetirementAge;
	}

	public long getJobCategory() {
		return jobCategory;
	}

	public void setJobCategory(long jobCategory) {
		this.jobCategory = jobCategory;
	}

	public List<Child> getChildren() {
		return children;
	}

	public void setChildren(List<Child> children) {
		this.children = children;
	}

	public List<Parent> getParents() {
		return parents;
	}

	public void setParents(List<Parent> parents) {
		this.parents = parents;
	}

	public Spouse getSpouse() {
		return spouse;
	}

	public void setSpouse(Spouse spouse) {
		this.spouse = spouse;
	}

}
