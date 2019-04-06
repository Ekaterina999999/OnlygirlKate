
public class Player {
	private String name;
	private Boolean condition;
	private boolean result;
	
	public Player(String name, Boolean condition) {
		super();
		this.name = name;
		this.condition = condition;
	}

	public String getName() {
		return name;
	}
	
	public Boolean isCondition() {
		return condition;
	}

	public boolean isResult() {
		return result;
	}
	
	public void setResult(boolean result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return " Player " + name;
	}
}
