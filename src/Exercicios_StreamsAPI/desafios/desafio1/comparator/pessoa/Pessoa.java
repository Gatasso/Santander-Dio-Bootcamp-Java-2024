package Exercicios_StreamsAPI.desafios.desafio1.comparator.pessoa;

public class Pessoa {
    private String name;
    private int age;
    private double salary;
    private boolean hasHair;

    public Pessoa(String name, int age, double salary, boolean hasHair) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hasHair = hasHair;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isHasHair() {
        return hasHair;
    }

    @Override
    public String toString() {
        return "Pessoa" +
                "{" + name + ", " + age + " anos" + ", salario= R$" + salary + ", tem cabelo? (" + hasHair +
                ")}";
    }
}
