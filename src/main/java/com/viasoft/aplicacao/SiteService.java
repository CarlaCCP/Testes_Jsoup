package com.viasoft.aplicacao;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;



@Component
public class SiteService {

    @Autowired
    private SiteRepository repository;

    @Scheduled(fixedDelay =60000)
    //5 minutos = 300000
    public void salvaEstados () throws IOException {
        Document doc = Jsoup.connect("https://www.nfe.fazenda.gov.br/portal/disponibilidade.aspx").get();
        Element content = doc.getElementById("ctl00_ContentPlaceHolder1_gdvDisponibilidade2");
        Elements classe = content.getElementsByClass("linhaImparCentralizada");
        //Elements links = doc.select("[src]");
        Elements estados = content.getElementsByTag("td").next();
        String novoLink = content.select("[src]").text();
        //Elements links = content.getElementsByTag("img").next();
        Elements status = classe.select("[src]");
        //System.out.println(classe.select("[src]"));

        int contador = 0;
       for (Element st : status){
           contador++;
           System.out.println(st);
       }
        System.out.println(contador);
    }

}
