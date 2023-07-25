package designPattens;
import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {


    // Observer interface
    interface Observer {
        void update(String message);
    }

    // Subject (Observable) class
    static class MessagingService {
        private List<Observer> observers = new ArrayList<>();

        public void addObserver(Observer observer) {
            observers.add(observer);
        }

        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }

        public void sendMessage(String message) {
            notifyObservers(message);
        }

        private void notifyObservers(String message) {
            for (Observer observer : observers) {
                observer.update(message);
            }
        }
    }

    // Concrete Observer classes
    static class User implements Observer {
        private String name;

        public User(String name) {
            this.name = name;
        }

        @Override
        public void update(String message) {
            System.out.println(name + " received a message: " + message);
        }
    }

    // Client code

        public static void main(String[] args) {

            MessagingService messagingService = new MessagingService();


            User user1 = new User("Ram");
            User user2 = new User("sita");
            User user3 = new User("hari");


            messagingService.addObserver(user1);
            messagingService.addObserver(user2);
            messagingService.addObserver(user3);


            messagingService.sendMessage("Hello, world!");


        }
    }



