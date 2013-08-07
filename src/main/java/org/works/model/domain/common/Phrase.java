package org.works.model.domain.common;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.AbstractAuditable;
import org.works.model.domain.user.User;

@Entity
@Table(name = "T_PHRASE")
public class Phrase extends AbstractAuditable<User, PhraseKey> {
	// @EmbeddedId
	// private PhraseKey phraseKey;

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
