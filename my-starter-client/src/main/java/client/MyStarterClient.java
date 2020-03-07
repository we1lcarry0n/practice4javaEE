package client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import library.MyLibraryClass;

@SpringBootApplication
public class MyStarterClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(MyStarterClient.class, args);

        MyLibraryClass myLibraryClassByClass = applicationContext.getBean(MyLibraryClass.class);
        myLibraryClassByClass.printInfo();

        MyLibraryClass myLibraryClass = (MyLibraryClass) applicationContext.getBean("myLibraryClass");
        MyLibraryClass myClass = (MyLibraryClass) applicationContext.getBean("myClass");
        myLibraryClass.printInfo();
    }

}
