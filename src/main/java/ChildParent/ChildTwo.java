package ChildParent;

import java.util.Objects;

public class ChildTwo extends Parent{

    int id;
    String name;

    public ChildTwo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ChildTwo(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChildTwo)) return false;
        ChildTwo childTwo = (ChildTwo) o;
        return getId() == childTwo.getId() && Objects.equals(getName(), childTwo.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void go(){
        System.out.println("Interview1");
    }

    public void go3(){
        System.out.println("Swarn");
    }
}
