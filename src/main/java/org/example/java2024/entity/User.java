package org.example.java2024.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "name", nullable = false)
    String userName;

    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "role", nullable = false)
    String role;

    @OneToMany(mappedBy = "user") // Thêm mối quan hệ với PhoneNumber
    List<PhoneNumber> phoneNumbers;
}
