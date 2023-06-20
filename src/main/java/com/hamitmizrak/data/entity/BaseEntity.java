package com.hamitmizrak.data.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

// Lombok
@Getter @Setter

// Auditing
@EntityListeners(AuditingEntityListener.class)

// Super Class
@MappedSuperclass
public class BaseEntity {

    // Common Property
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",updatable = false)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name="system_created_date",updatable = false,insertable = true)
    private Date systemCreatedDate;

    // Auditing
    @CreatedBy
    @Column(name="created_modified_by")
    private String createdModifiedBy;

    @CreatedDate
    @Column(name="created_date")
    private Date createdDate;

    @LastModifiedBy
    @Column(name="last_modified_by")
    private String lastModifiedBy;

    @LastModifiedDate
    @Column(name="update_date")
    private Date updateDate;
}
