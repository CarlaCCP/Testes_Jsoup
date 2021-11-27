package com.viasoft.aplicacao;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class SiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    private String autorizador;
    private String autorizacao;
    private String retornoAutorizacao;
    private String inutilizacao;
    private String consultaProtocolo;
    private String statusServico;
    private String consultaCadatro;
    private String recepcaoEvento;

    public SiteModel() {
    }

    public SiteModel(String autorizador,
                     String autorizacao,
                     String retornoAutorizacao,
                     String inutilizacao,
                     String consultaProtocolo,
                     String statusServico,
                     String consultaCadatro,
                     String recepcaoEvento) {

        this.autorizador = autorizador;
        this.autorizacao = autorizacao;
        this.retornoAutorizacao = retornoAutorizacao;
        this.inutilizacao = inutilizacao;
        this.consultaProtocolo = consultaProtocolo;
        this.statusServico = statusServico;
        this.consultaCadatro = consultaCadatro;
        this.recepcaoEvento = recepcaoEvento;
    }
}


