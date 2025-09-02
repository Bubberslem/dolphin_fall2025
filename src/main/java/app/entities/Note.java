package app.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Entity

public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String note;
    @Column(nullable = false)
    private LocalDate created;
    @Column(nullable = false)
    private String createdBy;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @Setter
    private Person person;

    @PrePersist
    void prePersist() {
        this.created = LocalDate.now();
    }
}
