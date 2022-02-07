package programJar;
import java.util.ArrayList;

public class ArrList {

	public static void main(String[] args) {
		
		//ArrayList = Arrays dinâmicas
		
		//Podem ter o seu tamanho variável e seus elementos podem ser adicionados ou removidos.
		//Podem representar uma coleção de quelquer tipo de dado, não somente de dados primitivos.
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("Temaki");
		food.add("Hamburguer");
		food.add("hot Dog");
		
		food.set(2, "Sushi");
		food.remove(1);
		
		//add() = Adicionar Elementos
		//remove() = Remover Elementos
		//set() = Substitui elementos de determinada posição
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		System.out.println();
		
		
		//2D ArrayLists = Arrays dinâmicas composto por Arrays dinâmicas
		
		ArrayList<ArrayList<String>> foodList = new ArrayList();
		
		ArrayList<String> doce = new ArrayList<String>();
		doce.add("Donut");
		doce.add("Chocolate");
		doce.add("Cookie");
		
		ArrayList<String> salgado = new ArrayList<String>();
		salgado.add("Coxinha");
		salgado.add("Empada");
		salgado.add("Pizza");
		
		ArrayList<String> drinks = new ArrayList<String>();
		drinks.add("Vodka");
		
		foodList.add(doce);
		foodList.add(salgado);
		foodList.add(drinks);
		foodList.add(food);
		
		System.out.println(foodList.get(0).get(1));		//2° elemento de 'doce'
		System.out.println(foodList.get(3).get(1));		//2° elemento de 'food'
		System.out.println(foodList.get(2).get(0));		//1° elemento de 'drinks'
	}
}
