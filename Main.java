package lesson13ClassWork;

import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("�������");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ������ �������� \n2. �������� �������� �� ���� \n3. �������� �������� �� ���� \n4. ³���������� �� ���� \n5. ³���������� �� ���� \n6. ³���������� �� ������ \n0. ��������� ��������");
		int i;
		while(true){
			i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("������ ����� �������� ��� �� ��");
				System.out.println();
				zoo.add(new Animal(sc.next(),sc.next(),sc.nextInt()));
				zoo.add(new Animal(sc.next(),sc.next(),sc.nextInt()));
				zoo.add(new Animal(sc.next(),sc.next(),sc.nextInt()));
				zoo.add(new Animal(sc.next(),sc.next(),sc.nextInt()));
				zoo.add(new Animal(sc.next(),sc.next(),sc.nextInt()));
				break;

			case 2:
				System.out.println("������ ����� �������� ��� ������ ��������");
				zoo.removeByName(sc.next());
				break;
				
			case 3:
				System.out.println("������ ��� �������� ��� ������ ��������");
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
				zoo.sortByAge();
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
