package Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="editoriales", schema="gbp_operacional")
public class Editoriales {

	//Atributos
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_editorial",nullable=false)
	private long idEditorial;
	
	@Column (name="nombre_editorial")
	private String nombreEditorial;
	
	//Getters & Setters
	public long getIdEditorial() {
		return idEditorial;
	}
	public void setIdEditorial(long idEditorial) {
		this.idEditorial = idEditorial;
	}
	public String getNombreEditorial() {
		return nombreEditorial;
	}
	public void setNombreEditorial(String nombreEditorial) {
		this.nombreEditorial = nombreEditorial;
	}
	
	//Constructores
	public Editoriales() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Editoriales(long idEditorial, String nombreEditorial) {
		super();
		this.idEditorial = idEditorial;
		this.nombreEditorial = nombreEditorial;
	}
	
}
