package com.tp.composite;

import java.util.ArrayList;
import java.util.List;

public class Category extends Component{

	public Category(int i){
        level = i;
    }

	List<Component> components= new ArrayList<>();

	 public void addComponent(Component com){
		 components.add(level, com) ;
	 }
	 
	 public void deleteComponent(Component com, int level){
		 
		 if (com.getLevel() > level) {
				 components.remove(com) ;
				 System.out.println("component removed !");
		 }else {
			 System.out.println("Nothing was removed !");
		 }
		 
	 }
		 
	@Override
	public int getLevel() {
		int sum = 0;
		for(Component component : components)
		sum = sum + component.getLevel();
		return sum;
	}

}
