package enumerate;

public enum EnumTwo {
	ADD, MODIFY, REMOVE, SEARCH;
	private int values;

	private EnumTwo(int values) {
		this.values = values;
	}

	EnumTwo() {
		// TODO Auto-generated constructor stub
	}

	public int getValues() {
		return values;
	}

	public void setValues(int values) {
		this.values = values;
	}
	
}