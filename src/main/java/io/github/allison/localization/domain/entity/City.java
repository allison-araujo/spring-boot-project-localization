
package io.github.allison.localization.domain.entity;


        import jakarta.persistence.Column;
        import jakarta.persistence.Entity;
        import jakarta.persistence.Id;
        import jakarta.persistence.Table;
        import lombok.AllArgsConstructor;
        import lombok.Data;
        import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_city")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class City {

    @Id
    @Column(name = "id_city")
    private Long id;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "qty_population")
    private long qty_population;



}
