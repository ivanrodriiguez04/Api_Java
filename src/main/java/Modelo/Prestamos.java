package Modelo;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "prestamos", schema = "gbp_pracional")
public class Prestamos {
	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prestamo", nullable = false)
	private long idPrestamo;

	@Column(name = "fch_inicio_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchInicioPrestamo;

	@Column(name = "fch_fin_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchFinPrestamo;

	@Column(name = "fch_entrega_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchEntregaPrestamo;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "id_libro")
	Libros libros;

	@ManyToOne
	@JoinColumn(name = "id_estado_prestamo")
	Estado_Prestamo estado_prestamo;

	// Getters & Setters
	public long getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(long idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Calendar getFchInicioPrestamo() {
		return fchInicioPrestamo;
	}

	public void setFchInicioPrestamo(Calendar fchInicioPrestamo) {
		this.fchInicioPrestamo = fchInicioPrestamo;
	}

	public Calendar getFchFinPrestamo() {
		return fchFinPrestamo;
	}

	public void setFchFinPrestamo(Calendar fchFinPrestamo) {
		this.fchFinPrestamo = fchFinPrestamo;
	}

	public Calendar getFchEntregaPrestamo() {
		return fchEntregaPrestamo;
	}

	public void setFchEntregaPrestamo(Calendar fchEntregaPrestamo) {
		this.fchEntregaPrestamo = fchEntregaPrestamo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Libros getLibros() {
		return libros;
	}

	public void setLibros(Libros libros) {
		this.libros = libros;
	}

	public Estado_Prestamo getEstado_prestamo() {
		return estado_prestamo;
	}

	public void setEstado_prestamo(Estado_Prestamo estado_prestamo) {
		this.estado_prestamo = estado_prestamo;
	}

	// Constructores
	public Prestamos(long idPrestamo, Calendar fchInicioPrestamo, Calendar fchFinPrestamo, Calendar fchEntregaPrestamo,
			Usuario usuario, Libros libros, Estado_Prestamo estado_prestamo) {
		super();
		this.idPrestamo = idPrestamo;
		this.fchInicioPrestamo = fchInicioPrestamo;
		this.fchFinPrestamo = fchFinPrestamo;
		this.fchEntregaPrestamo = fchEntregaPrestamo;
		this.usuario = usuario;
		this.libros = libros;
		this.estado_prestamo = estado_prestamo;
	}

	public Prestamos() {
		super();
		// TODO Auto-generated constructor stub
	}

}
