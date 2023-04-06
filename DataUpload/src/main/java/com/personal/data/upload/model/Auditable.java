package com.personal.data.upload.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
abstract class Auditable<U> {

    @CreatedDate
	@Column(name="CREATED_AT", nullable = false, updatable = false)
    protected Date createdAt;

    @LastModifiedDate
	@Column(name="UPDATED_AT")
    protected Date updatedAt;

    public Date getCreatedDate() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}