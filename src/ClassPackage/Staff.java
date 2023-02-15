package ClassPackage;


import java.util.List;

public abstract class Staff {
    private String name;
    private int id;


    public Staff(String name, int id) {
        this.name = name;
        this.id = id;

    }
    public Staff(){
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



    public abstract int Fire(List<Cashier> cashier);

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", id=" + id +

                '}';
    }
}
