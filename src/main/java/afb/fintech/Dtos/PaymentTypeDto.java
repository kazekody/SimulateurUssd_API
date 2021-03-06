package afb.fintech.Dtos;


public class PaymentTypeDto {

	String code;
	String name;
	/**
	 * 
	 */
	public PaymentTypeDto() {
		super();
	}
	/**
	 * @param code
	 * @param name
	 */
	public PaymentTypeDto(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}
