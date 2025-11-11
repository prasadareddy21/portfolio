package io.srproperties.portfolio.model;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.Generated;
import lombok.NonNull;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "property")
@NoArgsConstructor(force = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@EqualsAndHashCode
@Getter
@Setter
@Builder(toBuilder = true)
@ToString
@Generated
public class Property  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude
    @Column(name = "prop_id")
    private Long id;

    @Column(name = "prop_adres_l1")
    @Size(max = 500)
    @NonNull
    private String  addressL1;

    @Column(name = "prop_adres_l2")
    @Size(max = 100)
    private String  addressL2;

    @Column(name = "prop_adres_l3")
    @Size(max = 200)
    private String  addressL3;

    @Column(name = "prop_city")
    @Size(max = 20)
    @NonNull
    private String  city;

    @Column(name = "prop_state")
    @Size(max = 20)
    @NonNull
    private String  state;

    @Column(name = "prop_country")
    @Size(max = 20)
    @NonNull
    private String  country;

    @Column(name = "prop_zip")
    @Size(max = 20)
    @NonNull
    private String  zip;

    @Column(name = "prop_status")
    @Size(max = 20)
    private String  propertyStatus;

    @Column(name = "created_by")
    @Size(max = 100)
    @NonNull
    private String  createdBy;

    @Column(name = "updated_by")
    @Size(max = 100)
    private String  updatedBy;

    @Column(name = "created_ts")
    @NonNull
    private LocalDateTime createdDate;

    @Column(name = "updated_ts")
    private LocalDateTime  updatedDate;
}
