package org.example.java2024.entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "phone_numbers")
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name = "phone_number", nullable = false)
    String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    User user; // Mối quan hệ với User
}

