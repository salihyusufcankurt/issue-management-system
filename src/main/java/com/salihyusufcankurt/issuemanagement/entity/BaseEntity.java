package com.salihyusufcankurt.issuemanagement.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;


@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity implements Serializable {
    // Soru 1 - Serializable interface ini neden implemente ettik ? Nedir bu serializable ?
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "created_by",length = 100)
    private String createdBy;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Column(name = "updated_by",length = 100)
    private String updatedBy;

    @Column(name = "status")
    private Boolean status;


    // @MappedSuperclass anotasyonu diğer sınıfların bu sınıftan türetilmesini sağlıyor

    // @Getter @Setter anotasyonları bildiğin gibi

    // @Column anotasyonu ise bu datanın veritabanında kolon olarak gösterilecek kısmın bilgilerinden oluşuyor.

    // @Temporal(TemporalType.TIMESTAMP) bu veriyi gün ay yıl saat dakika milisaniye olarak tut demiş olduk



}
