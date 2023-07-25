package designPattens;

public class BuilderPattern {


    static class Person {
        private String name;
        private int age;
        private String address;
        private String phoneNumber;


        private Person() {
        }



        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }


        static class Builder {
            private String name;
            private int age;
            private String address;
            private String phoneNumber;


            public Builder setName(String name) {
                this.name = name;
                return this;
            }

            public Builder setAge(int age) {
                this.age = age;
                return this;
            }

            public Builder setAddress(String address) {
                this.address = address;
                return this;
            }

            public Builder setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }


            public Person build() {
                Person person = new Person();
                person.name = this.name;
                person.age = this.age;
                person.address = this.address;
                person.phoneNumber = this.phoneNumber;
                return person;
            }
        }
    }



        public static void main(String[] args) {

            Person person = new Person.Builder()
                    .setName("Ram sahoo")
                    .setAge(23)
                    .setAddress("Bhubaneswar")
                    .setPhoneNumber("987654321")
                    .build();


            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Address: " + person.getAddress());
            System.out.println("Phone Number: " + person.getPhoneNumber());
        }
    }


