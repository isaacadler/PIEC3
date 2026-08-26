package org.dibpt.patepontointeligenteweb.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "dispositivos")
public class Dispositivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(length = 255)
    private String descricao;


    @Column(name = "sensor_nfc_id", unique = true, length = 50)
    private String sensorNfcId;

    @Column(nullable = false)
    private LocalDateTime dataCadastro;

    @Column(nullable = false)
    private Boolean ativo = true;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pessoa_responsavel_id", nullable = false)
    private Pessoa pessoaResponsavel;

    public Dispositivo() {
        this.dataCadastro = LocalDateTime.now();
    }

    public Dispositivo(String nome, String descricao, String sensorNfcId, Pessoa pessoaResponsavel) {
        this.nome = nome;
        this.descricao = descricao;
        this.sensorNfcId = sensorNfcId;
        this.pessoaResponsavel = pessoaResponsavel;
        this.dataCadastro = LocalDateTime.now();
        this.ativo = true;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSensorNfcId() {
        return sensorNfcId;
    }

    public void setSensorNfcId(String sensorNfcId) {
        this.sensorNfcId = sensorNfcId;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Pessoa getPessoaResponsavel() {
        return pessoaResponsavel;
    }

    public void setPessoaResponsavel(Pessoa pessoaResponsavel) {
        this.pessoaResponsavel = pessoaResponsavel;
    }
}