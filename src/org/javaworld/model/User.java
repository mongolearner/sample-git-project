package org.javaworld.model;

public class User {
    
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        
    }
    
    
    public int age;
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }
    
    
    
    

}
