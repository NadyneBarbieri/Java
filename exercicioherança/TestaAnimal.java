package br.com.exercicioherança;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Cavalo c1 = new Cavalo();
		Cachorro c2 = new Cachorro();
		Preguiça p1 = new Preguiça();
		
		c1.setCorrer("Cavalo correndo...");
		c1.setNome("Pé de pano");
		c1.setIdade(10);
		
		c2.setCorrer("Cachorro correndo...");
		c2.setNome("Rex");
		c2.setIdade(10);
		
		p1.setSubir("preguiça Subindo na Arvore...");
		p1.setNome("Milgrau");
		p1.setIdade(10);
		
		System.out.println("Nome do cavalo:"+ c1.getNome());
		System.out.println("Idade do cavalo: "+ c1.getIdade());
		System.out.println("Cavalo correndo..."+ c1.getCorrer());
		System.out.println();
	
		System.out.println("Nome do cachorro:"+ c2.getNome());
		System.out.println("Idade do cavalo: "+ c2.getIdade());
		System.out.println("Cavalo correndo..."+ c2.getCorrer());
		System.out.println();
	
		System.out.println("Nome da pregiça:"+ p1.getNome());
		System.out.println("Idade do cavalo:"+ p1.getIdade());
		System.out.println("Preguiça Subindo na arvore..."+ p1.getSubir());
	

	}

}
