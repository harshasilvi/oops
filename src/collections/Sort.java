package collections;

public class Sort implements  Comparable<Sort> {

        private String name;
        private String phonumber;
        private int id;

        public int compareTo(Sort s){
            return this.id-s.id;
        }


    @Override
    public String toString() {
        return "Sort{" +
                "name='" + name + '\'' +
                ", phonumber='" + phonumber + '\'' +
                ", id=" + id +
                '}';
    }

    Sort(String name, String phonumber, int id){
            this.name=name;
            this.phonumber=phonumber;
            this.id=id;
        }

        public String getName(){
            return name;
        }
        public String getphonumber(){
            return phonumber;
        }
        public int getid(){
            return id;
        }
    }

