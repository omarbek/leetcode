package interview;

public class Qwe {

    private String name;
    private int items;

    public Qwe(String name, int items) {
        this.name = name;
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        Qwe qwe = (Qwe) o;
        if (this.name.equals(qwe.getName()) && this.items == qwe.items) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ss.Qwe{" +
                "name='" + name + '\'' +
                ", items=" + items +
                '}';
    }
}
