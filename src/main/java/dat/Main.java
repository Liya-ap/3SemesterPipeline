package dat;

import dat.config.HibernateConfig;
import io.javalin.Javalin;
import jakarta.persistence.EntityManagerFactory;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory("pipeline");

        Javalin app = Javalin.create().start(7070);

        app.get("/", ctx -> ctx.result("Hello World"));
    }
}