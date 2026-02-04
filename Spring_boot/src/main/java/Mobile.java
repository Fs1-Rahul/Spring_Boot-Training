// public class Mobile {

//     // Main driver method
//     public static void main(String[] args)
//     {
//         // Manually creating an instance of Jio
//         Sim sim = new Jio();

//         // Calling methods
//         sim.calling();
//         sim.data();
//     }
// }


// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.ApplicationContext;
// import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.stereotype.Component;

// @Component
// public class Mobile {

//     @Autowired
//     private Sim sim;

//     public void useSim() {
//         sim.calling();
//         sim.data();
//     }

//     public static void main(String[] args) {
//         ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class);
//         Mobile mobile = context.getBean(Mobile.class);
//         mobile.useSim();
//     }
// }

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class Mobile {

    @Autowired
    @Qualifier("jioBean") // Use the explicit bean name
    private Sim sim;

    public void useSim() {
        sim.calling();
        sim.data();
    }

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Mobile mobile = context.getBean(Mobile.class);
        mobile.useSim();
    }
}