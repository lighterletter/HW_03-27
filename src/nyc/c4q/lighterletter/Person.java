package nyc.c4q.lighterletter;

/**
 * Created by c4q-john on 3/25/15.
 */
public class Person {

    /**
     * A Person class
     */

        private String name;
        private String phoneNumber;
        private String city;

        public Person(){
        }

        public Person(String name){
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
