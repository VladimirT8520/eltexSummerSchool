package ru.nsk.eltex.compareto;

public class Man implements Comparable<Man>{
    private String name;
    private Integer age;

        Man(String name, Integer age){
            this.name = name;
            this.age = age;
        }

        Integer getAge(){return age;}
        String getName(){return name;}
    public int compareTo(Man p) {
        Integer result = age.compareTo(p.getAge());
        return result;

    }
    public String toString(){
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
    }
}
