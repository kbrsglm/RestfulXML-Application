package com.mimarasla;
 
import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path(value = "/merkez")
public class merkez {
   //http://localhost:8080/_04_RESTfulXml/rest/merkez/musteri/1
    @GET
   @Path(value = "/musteri/{id}")//
   @Produces(MediaType.APPLICATION_XML)
    
   public Musteri  method4(@PathParam ("id") int id)//1. parametre yukaýda
   //gelen 2. string parametresine gelecek
   {
	   Musteri musterinesnesi=new Musteri();
	   musterinesnesi.setMusteriId(1);
	   musterinesnesi.setMusteriAdi("hakan");
	   musterinesnesi.setMusteriSoyadi("aydan");
		return musterinesnesi;
	}
  //http://localhost:8080/_04_RESTfulXml/rest/merkez/sorgu1
    @GET
	@Path(value = "/sorgu1")
	public String method1() {
		return "Selam ";
	}

  
 
   
}
