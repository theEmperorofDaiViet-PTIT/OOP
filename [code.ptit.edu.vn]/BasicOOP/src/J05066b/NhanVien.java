package J05066b;

public class NhanVien implements Comparable<NhanVien> {
    private String rank, level, id, name;
    public NhanVien(String code ,String name) {
        this.rank = code.substring(0,2);
        this.level = code.substring(2, 4);
        this.id = code.substring(4);
        this.name = name.trim();
    }
    public String getRank() {
        return rank;
    }
    public void setRank() {
        rank = "NV";
    }
    public int getID() {
        return Integer.parseInt(id);
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return name + " " + rank + " " + id + " " + level;
    }
    public int compareTo(NhanVien o) {
        if(o.level.compareTo(this.level) != 0) return o.level.compareTo(this.level);
        else return this.id.compareTo(o.id);
    }
}

