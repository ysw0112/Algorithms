package javaStudy.thread;

import java.util.ArrayList;
import java.util.List;

public class WaitNotifyThread {

    public static void main(String[] args) {

    }

    static class Customer implements Runnable {
        private Table table;
        private String food;

        public Customer(Table table, String food) {
            this.table = table;
            this.food = food;
        }

        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                if(eatFood()){
                    System.out.println(name + " ate a " + food);
                }else{
                    System.out.println(name + " failed to eat.");
                }
            }
        }

        private boolean eatFood() {
            return table.remove(food);
        }
    }

    static class Table{
        String[] dishNames = {"donut","donut","burger"};
        final int MAX_FOOD = 6;

        private List<String> dishes = new ArrayList<>();

        public void add(String dish){
            if(dishes.size() >= MAX_FOOD){
                return;
            }
            dishes.add(dish);
            System.out.println("Dishes: "+dishes.toString());
        }

        public boolean remove(String dishName){
            for(int i=0; i<dishes.size(); i++){
                if(dishName.equalsIgnoreCase(dishes.get(i))){
                    dishes.remove(i);
                    return true;
                }
            }
            return false;
        }
        public int dishNum() {
            return dishNames.length;
        }
    }

    static class Cook implements Runnable{
        private Table table;

        @Override
        public void run() {

        }
    }
}
