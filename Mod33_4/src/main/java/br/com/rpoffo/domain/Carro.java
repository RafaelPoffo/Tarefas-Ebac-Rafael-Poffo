package br.com.rpoffo.domain;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "TB_CARRO")
public class Carro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
    @SequenceGenerator(name = "carro_seq", sequenceName = "sq_carro", initialValue = 1, allocationSize = 1)
    private Long id;
    
    @Column(name = "MODELO", length = 50, nullable = false)
    private String modelo;
    
    @ManyToOne
    @JoinColumn(name = "id_marca_fk", foreignKey = @ForeignKey(name = "fk_carro_marca"), referencedColumnName = "id", nullable = false)
    private Marca marca;
    
    @ManyToMany
    @JoinTable(name = "CARRO_ACESSORIO",
               joinColumns = @JoinColumn(name = "carro_id"),
               inverseJoinColumns = @JoinColumn(name = "acessorio_id"))
    private List<Acessorio> acessorios;
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public Marca getMarca() {
        return marca;
    }
    
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
    
    public List<Acessorio> getAcessorios() {
        return acessorios;
    }
    
    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }
}
