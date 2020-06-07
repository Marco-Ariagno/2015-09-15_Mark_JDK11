package it.polito.tdp.anagrammi.db;

public class TestDAO {

	public static void main(String args[]) {
		ParoleDAO dao = new ParoleDAO() ;
		
		int parole = dao.contaParole() ;
		
		System.out.format("Trovate %d parole\n", parole) ;
	}

}
