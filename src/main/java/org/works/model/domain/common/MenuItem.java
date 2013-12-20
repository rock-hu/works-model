package org.works.model.domain.common;

import java.io.Serializable;

public class MenuItem implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long menuItemId;
	private String parentName;
	private String name;
	private String titleCode;
	private String description;
	private String location;
	private String target;
	private String onclick;
	private String onmouseover;
	private String onmouseout;
	private String image;
	private String altImageCode;
	private String tooltipCode;

	private String page;
	private String width;
	private String height;
	private String forward;
	private String action;

	public Long getMenuItemId() {
		return menuItemId;
	}

	public void setMenuItemId(Long menuItemId) {
		this.menuItemId = menuItemId;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitleCode() {
		return titleCode;
	}

	public void setTitleCode(String titleCode) {
		this.titleCode = titleCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getOnclick() {
		return onclick;
	}

	public void setOnclick(String onclick) {
		this.onclick = onclick;
	}

	public String getOnmouseover() {
		return onmouseover;
	}

	public void setOnmouseover(String onmouseover) {
		this.onmouseover = onmouseover;
	}

	public String getOnmouseout() {
		return onmouseout;
	}

	public void setOnmouseout(String onmouseout) {
		this.onmouseout = onmouseout;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getAltImageCode() {
		return altImageCode;
	}

	public void setAltImageCode(String altImageCode) {
		this.altImageCode = altImageCode;
	}

	public String getTooltipCode() {
		return tooltipCode;
	}

	public void setTooltipCode(String tooltipCode) {
		this.tooltipCode = tooltipCode;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getForward() {
		return forward;
	}

	public void setForward(String forward) {
		this.forward = forward;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
