# The Dolphin JPA Exercise Notes

## Gode ting at huske på i/m JPA og Lombok

1. Opret config.properties
```plaintext
DB_NAME=dolphin
DB_USERNAME=postgres
DB_PASSWORD=postgres
```

2. Opret en database i postgres

3. Opret en EntityManagerFactory i Main og kør for at lave tabellerne

```java
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();

```
## Lombok
```plaintext
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Entity
@ToString.Exclude
@EqualsAndHashCode.Exclude
```

## JPA Annotationer
``` plaintext
@Entity
@Id
@OneToOne
@ManyToOne
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(nullable = false)
@MapsId
@PrePersist
```


