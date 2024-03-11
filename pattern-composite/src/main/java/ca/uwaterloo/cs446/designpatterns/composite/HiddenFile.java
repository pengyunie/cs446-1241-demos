package ca.uwaterloo.cs446.designpatterns.composite;

public class HiddenFile extends File {

    public HiddenFile(String name) {
        super(name);
    }
    
    @Override
    public String ls() {
        return "";
    }
}
