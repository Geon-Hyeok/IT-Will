package association;

// 엔진정보(연료 타입, 배기량)를 저장하기 위한 클래스
public class Engine {
	private String fuelType;
	private int displacement;

	public Engine() {

	}

	public Engine(String fuelType, int displacement) {
		super();
		this.fuelType = fuelType;
		this.displacement = displacement;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}

	// 엔진정보(필드값)를 출력하는 메소드
	public void displayEngine() {
		System.out.println("연료타입 = " + fuelType);
		System.out.println("배기량 = " + displacement);

	}

}
