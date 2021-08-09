package DesignPattern.Structurel.Factory;

public abstract class Pizza {
    String name, dough, sauce;

    public void prepare() {
        System.out.println("    Prepare");
    }

    public void bake() {
        System.out.println("    Bake");
    }

    public void cut() {
        System.out.println("    Cut Into Triangle Slices");
    }

    public void box() {
        System.out.println("    Box");
    }

    public String getName() {
        return name;
    }
    public void printDescription(){
        System.out.println(name+"\n"+dough+"\n"+sauce);
    }
}
