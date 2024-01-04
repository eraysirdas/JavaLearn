package collections.set.TreeSet;

public class StudentTreeSet {
    private String name;
    private int note;

    public StudentTreeSet(String name,int note){
        this.name=name;
        this.note=note;
    }
    public int getNote(){
        return note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
