package com.example.grrs.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "guests")
@Data
@NoArgsConstructor
public class Guest {
    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @JsonProperty("id")
    @Column(name = "id")
    private String id;

    @Column(name = "firstname")
    @JsonProperty("firstName")
    private String firstName;

    @Column(name="lastname")
    @JsonProperty("lastName")
    private String lastName;

    @Column(name = "arrivingdate")
    @JsonProperty("arrivingDate")
    private String arrivingDate;
}
