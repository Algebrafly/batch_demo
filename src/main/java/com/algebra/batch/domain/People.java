package com.algebra.batch.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author al
 * @date 2019/12/11 16:03
 * @description
 */
@Data
@Builder
@NoArgsConstructor
@ToString(doNotUseGetters = true)
@AllArgsConstructor
@Entity
@Table(name = "tb_people")
public class People {

    @Id
    @Column(name = "person_id")
    private String personId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

}
