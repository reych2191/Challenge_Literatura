package com.challenge.literatura;

import com.challenge.literatura.modelos.ReqFilter;
import com.challenge.literatura.modelos.ReqFinal;
import com.challenge.literatura.service.ConsumoApi;
import com.challenge.literatura.service.ConversionReq;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class LiteraturaApplication implements CommandLineRunner {

	//@Autowired
	//private SerieRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(LiteraturaApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {

	var men = new Menu();
	men.menu();

	}

}


















