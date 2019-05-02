package com.salihyusufcankurt.issuemanagement.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Table(name = "project")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Project extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "project-code", unique = true)
    private String projectCode;

    @Column(name = "project-name", length = 200)
    private String projectName;

    @JoinColumn(name = "manager_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User manager;

}
