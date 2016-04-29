import java.util.TreeSet;

/**
 * Write a description of class Comprador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comprador extends Utilizador
{
    TreeSet<Imovel> favoritos = new TreeSet<Imovel>();

	/**
 	 * Construtor por parâmetros
 	 */
    public Comprador(String email, String nome, String password, String morada, String dataNascimento, TreeSet<Imovel> favoritos) {
        super(email,nome,password,morada,dataNascimento);
        
        for(Imovel im: favoritos)
            this.favoritos.add(im);
    }

	/**
 	 * Construtor padrão
 	 */
    public Comprador() {
        super();
    }

	/**
 	 * Construtor por cópia
 	 */
    public Comprador(Comprador c) {
        super(c.getEmail(), c.getNome(), c.getPassword(), c.getMorada(), c.getDataNascimento());
    
        for(Imovel im: favoritos)
            this.favoritos.add(im);
    }

	/**
 	 * Obtem imóveis favoritos do utilizador
 	 * @return
 	 */
	public TreeSet<Imovel> getFavoritos() {
		return this.favoritos;
	}

	/**
	 * Verifica se o objeto dado é igual a este.
	 * @param o Objeto
	 */
	public boolean equals(Object o) {
		if (o == this) return true;
		if ( (o == null) || (this.getClass() != o.getClass())) return false;
		else {
			Comprador c = (Comprador) o;
			return super.equals(c) &&
				this.favoritos.equals(c.getFavoritos() );
		}

	}
}
