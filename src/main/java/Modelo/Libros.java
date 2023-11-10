package Modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "libros", schema = "gbp_pracional")
public class Libros {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_libro", nullable = false)
	private long idLibro;

	@Column(name = "isbn_libro")
	private String isbnLiro;

	@Column(name = "titulo_libro")
	private String tituloLibro;

	@Column(name = "edicion_libro")
	private String edicionLibro;

	@Column(name = "cantidad_libro")
	private int cantidadLibro;

	@ManyToOne
	@JoinColumn(name = "id_editorial")
	Editoriales editoriales;

	@ManyToOne
	@JoinColumn(name = "id_genero")
	Generos generos;

	@ManyToOne
	@JoinColumn(name = "id_colecciones")
	Colecciones colecciones;

	@ManyToMany(mappedBy = "prestamoLibro")
	private List<Prestamos> prestamo;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "Rel_Autores_Libros", schema = "gbp_operacional", joinColumns = @JoinColumn(name = "id_libro"), inverseJoinColumns = @JoinColumn(name = "id_autor"))
	private List<Autor> libroAutor;

	// Getters & Setters
	public long getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(long idLibro) {
		this.idLibro = idLibro;
	}

	public String getIsbnLiro() {
		return isbnLiro;
	}

	public void setIsbnLiro(String isbnLiro) {
		this.isbnLiro = isbnLiro;
	}

	public String getTituloLibro() {
		return tituloLibro;
	}

	public void setTituloLibro(String tituloLibro) {
		this.tituloLibro = tituloLibro;
	}

	public String getEdicionLibro() {
		return edicionLibro;
	}

	public void setEdicionLibro(String edicionLibro) {
		this.edicionLibro = edicionLibro;
	}

	public int getCantidadLibro() {
		return cantidadLibro;
	}

	public void setCantidadLibro(int cantidadLibro) {
		this.cantidadLibro = cantidadLibro;
	}

	public Editoriales getEditoriales() {
		return editoriales;
	}

	public void setEditoriales(Editoriales editoriales) {
		this.editoriales = editoriales;
	}

	public Generos getGeneros() {
		return generos;
	}

	public void setGeneros(Generos generos) {
		this.generos = generos;
	}

	public Colecciones getColecciones() {
		return colecciones;
	}

	public void setColecciones(Colecciones colecciones) {
		this.colecciones = colecciones;
	}

	public List<Prestamos> getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(List<Prestamos> prestamo) {
		this.prestamo = prestamo;
	}

	public List<Autor> getLibroAutor() {
		return libroAutor;
	}

	public void setLibroAutor(List<Autor> libroAutor) {
		this.libroAutor = libroAutor;
	}

	// Constuctores
	public Libros(long idLibro, String isbnLiro, String tituloLibro, String edicionLibro, int cantidadLibro,
			Editoriales editoriales, Generos generos, Colecciones colecciones) {
		super();
		this.idLibro = idLibro;
		this.isbnLiro = isbnLiro;
		this.tituloLibro = tituloLibro;
		this.edicionLibro = edicionLibro;
		this.cantidadLibro = cantidadLibro;
		this.editoriales = editoriales;
		this.generos = generos;
		this.colecciones = colecciones;
	}

	public Libros() {
		super();
		// TODO Auto-generated constructor stub
	}
}
