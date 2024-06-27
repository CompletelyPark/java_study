/*
 * 	주소록 관리
 * 	1. 1장의 명함 클래스 (이름, 성별, 핸드폰 번호, 메일주소, 집주소, 
 * 					친분분류 (학교 친구, 직장 동료, 동호회, 거래처, 가족/친지, 기타),
 * 					메모, 생일, 기타 등등)
 * 	
 * 	2. 주소록 관리 클래스 - ProfileManager 
 * 					ArrayList<Profile> profiles
 * 		생성자, 검색, 추가, 수정, 삭제
 * 
 * 	3. ProfileTest_main.java
 * 		main(){
 * 			Scanner 객체를 이용해 메뉴 구성하고 기능 구성
 * 		}
 * 	
 * 
 */


public class Profile {
	
	private String name;
	private char gen;
	private String mobile;
	private String e_mail;
	private String home;
	private String friend;
	private String memo;
	private String birth;
	private String etc;
	
	
	
	public Profile(String name, char gen, String mobile, String e_mail, String home, String friend, String memo,
			String birth, String etc) {
		super();
		this.name = name;
		this.gen = gen;
		this.mobile = mobile;
		this.e_mail = e_mail;
		this.home = home;
		this.friend = friend;
		this.memo = memo;
		this.birth = birth;
		this.etc = etc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	
	public String getFriend() {
		return friend;
	}
	public void setFriend(String friend) {
		this.friend = friend;
	}
	
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public String getEtc() {
		return etc;
	}
	public void setEtc(String etc) {
		this.etc = etc;
	}

	
	@Override
	public String toString() {
		return "Profile [name=" + name + ", gen=" + gen + ", mobile=" + mobile + ", e_mail=" + e_mail + ", home=" + home
				+ ", friend=" + friend + ", memo=" + memo + ", birth=" + birth + ", etc=" + etc + "]";
	}
	
	
}
