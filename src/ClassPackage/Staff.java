package ClassPackage;

 public class Staff {
    private String name;
    private int id;
    private String email;
    private String adresss;
    private Staffs position;

    public Staff(String name, int id, String email, String adresss, Staffs position) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.adresss = adresss;
        this.position = position;
    }
    public Staff() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresss() {
        return adresss;
    }

    public void setAdresss(String adresss) {
        this.adresss = adresss;

    }

    public Staffs getPosition() {
        return position;
    }

    public void setPosition(Staffs position) {
        this.position = position;
    }




}

