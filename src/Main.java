 /**
  * This a main class to test Person.java
  * and javadocs
  * @author     Drew Belloff, Dharma Vyas, kamron Mason
  * @version    1.0
  * Date:       4/12/2026
  * Assignment: Group Task 5
  */
        public class Main {

            //https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html
            //part 1 : description
            //part 2 : tage list
            //How to run javadoc
            //1. cmd line: javadoc -d doc src\* or  javadoc -d doc src\* -author -version

            //2 Intellij IDEA IDE

            /**
             * This is a main method
             *
             * @param args stores incoming the command line arg for the program
             */
            public static void main(String[] args) {
                Person person = new Person("Samuel");
                System.out.println(person.getName());

            }
        }

