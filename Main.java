package lesson13ClassWork;

import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Çîîïàðê");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Äîäàòè òâàðèíêó \n2. Âèäàëèòè òâàðèíêó ïî íàçâ³ \n3. Âèäàëèòè òâàðèíêó ïî òèïó \n4. Â³äñîðòóâàòè ïî ³ìåí³ \n5. Â³äñîðòóâàòè ïî òèïó \n6. Â³äñîðòóâàòè ïî âñüîìó \n0. Âèêëþ÷èòè ïðîãðàìó");
		int i;
		while(true){
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("Ââåä³òü íàçâó òâàðèíêè òèï òà â³ê");
				System.out.println();
				zoo.add(new Animal(sc.next(),sc.next(),sc.nextInt()));
				zoo.add(new Animal(sc.next(),sc.next(),sc.nextInt()));
				zoo.add(new Animal(sc.next(),sc.next(),sc.nextInt()));
				zoo.add(new Animal(sc.next(),sc.next(),sc.nextInt()));
				zoo.add(new Animal(sc.next(),sc.next(),sc.nextInt()));
				break;

			case 2:
				System.out.println("Ââåä³òü íàçâó òâàðèíêè ÿêó õî÷åòå âèäàëèòè");
				zoo.removeByName(sc.next());
				break;
				
			case 3:
				System.out.println("Ââåä³òü òèï òâàðèíêè ÿêó õî÷åòå âèäàëèòè");
				zoo.removeByType(sc.next());
				break;
				
			case 4:
				zoo.sortByName();
				for(Animal animal : zoo.getList()){
					System.out.println(animal);
				}
				break;
				
			case 5:	
				zoo.sortByType();
				for(Animal animal : zoo.getList()){
					System.out.println(animal);
				}
				break;
				
			case 6:	
//				zoo.getList().sort(new SortByName().thenComparing(new SortByType()).thenComparing(new SortByAge()));
// 				zoo.sortByAge();
				for(Animal animal : zoo.getList()){
					System.out.println(animal);
				}
				break;
				
			case 7:
				System.exit(0);
			}
		}

	}

}
