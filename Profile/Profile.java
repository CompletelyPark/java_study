package Profile;


public class Profile {
	
	protected String name;
	protected String gen;
	protected String mobile;
	protected String e_mail;
	protected String home;
	protected String friend;
	protected String memo;
	protected String birth;
	
	
	public Profile() {
	}
	
	public Profile(String name, String gen, String mobile, String e_mail, String home, String friend, String memo,
			String birth, String etc) {
		this.name = name;
		this.gen = gen;
		this.mobile = mobile;
		this.e_mail = e_mail;
		this.home = home;
		this.friend = friend;
		this.memo = memo;
		this.birth = birth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
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

	@Override
	public String toString() {
		return "Profile [name=" + name + ", gen=" + gen + ", mobile=" + mobile + ", e_mail=" + e_mail + ", home=" + home
				+ ", friend=" + friend + ", memo=" + memo + ", birth=" + birth + "]\n";
	}
	

	
}
