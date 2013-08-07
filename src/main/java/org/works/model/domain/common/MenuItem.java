package org.works.model.domain.common;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

@Entity
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
@Table(name = "T_MENU_ITEM")
public class MenuItem implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "menu_item_id_seq_gen")
	@SequenceGenerator(name = "menu_item_id_seq_gen", sequenceName = "MENU_ITEM_SEQ")
	@Column(name = "MENU_ITEM_ID")
	private Long menuItemId;
	@Column
	private String parentName;
	@Column(unique = true, nullable = false)
	private String name;
	@Column
	private String titleCode;
	@Column
	private String description;
	@Column
	private String location;
	@Column
	private String target;
	@Column
	private String onclick;
	@Column
	private String onmouseover;
	@Column
	private String onmouseout;
	@Column
	private String image;
	@Column
	private String altImageCode;
	@Column
	private String tooltipCode;

	@Column
	private String page;
	@Column
	private String width;
	@Column
	private String height;
	@Column
	private String forward;
	@Column
	private String action;
}
