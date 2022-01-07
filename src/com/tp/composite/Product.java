package com.tp.composite;

public class Product extends Component{

	public Product(int i){
        level = i;
    }

	@Override
	public int getLevel() {
		return level;
	}

}
