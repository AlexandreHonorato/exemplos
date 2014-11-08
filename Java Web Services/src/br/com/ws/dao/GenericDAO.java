package br.com.ws.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO<T, ID extends Serializable> {
	
	/** Persiste o objeto dentro do banco de dados 
	 * @param object
	 */
	public ID create(T object);
	
	/** Retorna um objeto anteriormente persistido no banco 
     *  através da chave primary Id
     * @param id
     */
	public T read(ID id);
	
	/** Grava as alterações realizadas no Objeto */
	public void update(T object);
	
	/** Apaga o objeto do banco de dados */
	public void delete(T object);
	
	/** Retorna lista de objetos */
	public List<T> list();  

}