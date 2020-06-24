/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * @author HP-USER
 *
 */
@SuppressWarnings("serial")
public class CashierDto implements Serializable {

	private String code;
	private String age;
	private String name;
	private String userCode;
	private String userName;
	private String accountNo;
	private Double solde;
	
	/**
	 * Default Constructor
	 */
	public CashierDto() {}

	/**
	 * @param code
	 * @param name
	 * @param userCode
	 * @param userName
	 * @param accountNo
	 * @param solde
	 */
	public CashierDto(String code, String age, String name, String userCode, String userName, String accountNo, Double solde) {
		super();
		this.code = code;
		this.age = age;
		this.name = name;
		this.userCode = userCode;
		this.userName = userName;
		this.accountNo = accountNo;
		this.solde = solde;
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

	/**
	 * @return the userCode
	 */
	public String getUserCode() {
		return userCode;
	}

	/**
	 * @param userCode the userCode to set
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}

	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * @return the solde
	 */
	public Double getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(Double solde) {
		this.solde = solde;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

}
