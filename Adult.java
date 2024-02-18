public class Adult {
	private String name;
	private String profession;
	private final long ID;

	public Adult(String name, String profession, long ID) {
		setName(name);
		setProfession(profession);
		this.ID = ID;
	}

	public Adult(String name, long ID) {
		this(name, "" , ID);
	}

	public Adult(Adult other) {
		this(other.name, other.profession, other.ID);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProfession (String profession) {
		this.profession = profession;
	}

	public String getName() {
		return name;
	}

	public String getProfession() {
		return profession;
	}

	public long getID() {
		return ID;
	}

	public void show() {
		System.out.print("\t- Name : " + name +
				"\t- ID : " + ID);
		if (!profession.equals(" ")) {
			System.out.print(
					"\t- Profession: " + profession);
			System.out.println();
		}
	}
}
