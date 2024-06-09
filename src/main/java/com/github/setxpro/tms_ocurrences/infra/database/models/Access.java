package com.github.setxpro.tms_ocurrences.infra.database.models;

import com.github.setxpro.tms_ocurrences.domain.enums.RoleShippingCompany;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "access_partner")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Access {
    @Id
    private Long id;
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private RoleShippingCompany role;
}
