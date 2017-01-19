package lesson13ClassWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



public class Zoo {
	
	private String name;
	private List<Animal>list;
	
	public Zoo(String name) {
		this.name = name;
		this.list = new ArrayList<Animal>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Animal> getList() {
		return list;
	}
	public void setList(List<Animal> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Zoo [name=" + name + ", list=" + list + "]";
		
	}
	
	public void add(Animal animal){
		list.add(animal);
	}
	
	public void removeByName(String name){
		Iterator<Animal>iter = list.iterator();
		while(iter.hasNext()){
			if(iter.next().getName().equals(name)){
				iter.remove();
			}
		}
		System.out.println(list);
	}
	
	public void removeByType(String type){
		Iterator<Animal>iter = list.iterator();
		while(iter.hasNext()){
			if(iter.next().getType().equals(type)){
				iter.remove();
			}
		}
		System.out.println(list);
	}
	
	
	public void sortByName(){
		Collections.sort(list, new Comparator<Animal>() {
			public int compare(Animal o1, Animal o2) {
                return o1.toString().compareTo(o2.toString());
        }

		});
	}
	
	public void sortByType(){
		Collections.sort(list, new Comparator<Animal>() {
			public int compare(Animal o1, Animal o2) {
                return o1.getType().toString().compareTo(o2.getType().toString());
        }

		});
	}
	
	public void sortByAge(){
		Collections.sort(list, new Comparator<Animal>() {
			public int compare(Animal o1, Animal o2) {
				if(o1.getAge()>o2.getAge()){
					return 1;
				}else if(o1.getAge()<o2.getAge()){
					return -1;
				}else{
					return 0;
				}
        }

		});
	}
	
	public void sortByAll(){
		list.sort(new SortByName().thenComparing(new SortByType().thenComparing(new SortByAge())));
	}
	
}
