package com.jconnect.example.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "test_entity")
@Table()
@Data
public class MyEntity {

    @Id
    private String id;

    @Column(name = "name")
    private String name;
}
