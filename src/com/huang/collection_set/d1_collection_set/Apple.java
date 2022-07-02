package com.huang.collection_set.d1_collection_set;

public class Apple implements Comparable<Apple>{ //生成这个comparable alt + enter 生成这个方法
    private String name;
    private String color;
    private double price;
    private int weight;

    public Apple() {
    }

    public Apple(String name, String color, double price, int weight) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    /**
     方式一：类自定义比较规则
     o1.compareTo(o2)
     * @param o
     * @return
     */
    @Override
    public int compareTo(Apple o) {
        // 按照重量进行比较的
        return this.weight - o.weight ; // 去重重量重复的元素
        // return this.weight - o.weight >= 0 ? 1 : -1; // 保留重量重复的元素
    }
}
