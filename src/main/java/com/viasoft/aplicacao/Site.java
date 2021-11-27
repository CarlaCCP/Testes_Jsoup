package com.viasoft.aplicacao;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Site {

    private String autorizador;
    private String autorizacao;
    private String retornoAutorizacao;
    private String inutilizacao;
    private String consultaProtocolo;
    private String statusServico;
    private String consultaCadatro;
    private String recepcaoEvento;


    public String getAutorizador() {
        return autorizador;
    }

    public void setAutorizador(String autorizador) {
        this.autorizador = autorizador;
    }

    public String getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(String autorizacao) {
        this.autorizacao = autorizacao;
    }

    public String getRetornoAutorizacao() {
        return retornoAutorizacao;
    }

    public void setRetornoAutorizacao(String retornoAutorizacao) {
        this.retornoAutorizacao = retornoAutorizacao;
    }

    public String getInutilizacao() {
        return inutilizacao;
    }

    public void setInutilizacao(String inutilizacao) {
        this.inutilizacao = inutilizacao;
    }

    public String getConsultaProtocolo() {
        return consultaProtocolo;
    }

    public void setConsultaProtocolo(String consultaProtocolo) {
        this.consultaProtocolo = consultaProtocolo;
    }

    public String getStatusServico() {
        return statusServico;
    }

    public void setStatusServico(String statusServico) {
        this.statusServico = statusServico;
    }

    public String getConsultaCadatro() {
        return consultaCadatro;
    }

    public void setConsultaCadatro(String consultaCadatro) {
        this.consultaCadatro = consultaCadatro;
    }

    public String getRecepcaoEvento() {
        return recepcaoEvento;
    }

    public void setRecepcaoEvento(String recepcaoEvento) {
        this.recepcaoEvento = recepcaoEvento;
    }

    public SiteModel toModel (String autorizador,
                              String autorizacao,
                              String retornoAutorizacao,
                              String inutilizacao,
                              String consultaProtocolo,
                              String statusServico,
                              String consultaCadatro,
                              String recepcaoEvento){
        SiteModel site = new SiteModel(autorizador,
                autorizacao,
                retornoAutorizacao,
                inutilizacao,
                consultaProtocolo,
                statusServico,
                consultaCadatro,
                recepcaoEvento);
        return  site;
    }
}
