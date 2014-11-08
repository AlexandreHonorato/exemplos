package br.com.ws.service;

import javax.xml.ws.Endpoint;

public class PersonServicePublisher {

	/*
	 * Publicador do servico
	 * 
	 * */
	public static void main(String[] args) {
		int port = 9876;
		String url  = "http://localhost:" +port+ "/personservice";
		System.out.println("Publishing service on " + url);
		Endpoint.publish(url, new PersonServiceImpl());
	}
}
