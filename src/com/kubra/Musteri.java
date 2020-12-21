package com.mimarasla;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="musteri")
public class Musteri {

	
	int musteriId;
	String musteriAdi;
	String musteriSoyadi;
	
	@XmlElement(name="id")
	@XmlAttribute(name="id")//atribute kullanýnca özelleþmis hale geliyor
	public int getMusteriId() {
		return musteriId;
	}
	public void setMusteriId(int musteriId) {
		this.musteriId = musteriId;
	}
	@XmlElement(name="adi")
	public String getMusteriAdi() {
		return musteriAdi;
	}
	public void setMusteriAdi(String musteriAdi) {
		this.musteriAdi = musteriAdi;
	}
	@XmlElement(name="soyadi")
	public String getMusteriSoyadi() {
		return musteriSoyadi;
	}
	public void setMusteriSoyadi(String musteriSoyadi) {
		this.musteriSoyadi = musteriSoyadi;
	}
}
