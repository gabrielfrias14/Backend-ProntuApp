package com.prontuapp.api.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "consultas")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String especialidade;

    private String status;

    private String observacoes;

    private String receita;

    @Column(name = "medico_nome")
    private String medicoNome;

    private Boolean retorno;

    private String cid10;

    @Column(name = "atendimento_telemedicina")
    private Boolean atendimentoTelemedicina;

    private LocalDateTime data;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    public Consulta() {
    }

    public Long getId() {
        return id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    public String getMedicoNome() {
        return medicoNome;
    }

    public void setMedicoNome(String medicoNome) {
        this.medicoNome = medicoNome;
    }

    public Boolean getRetorno() {
        return retorno;
    }

    public void setRetorno(Boolean retorno) {
        this.retorno = retorno;
    }

    public String getCid10() {
        return cid10;
    }

    public void setCid10(String cid10) {
        this.cid10 = cid10;
    }

    public Boolean getAtendimentoTelemedicina() {
        return atendimentoTelemedicina;
    }

    public void setAtendimentoTelemedicina(Boolean atendimentoTelemedicina) {
        this.atendimentoTelemedicina = atendimentoTelemedicina;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}