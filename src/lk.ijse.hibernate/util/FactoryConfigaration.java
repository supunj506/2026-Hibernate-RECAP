import org.hibernate.SessionFactory;
import java.lang.module.Configuration;

public class FactoryConfigaration {
    private static FactoryConfigaration factoryConfigaration;
    private SessionFactory sessionFactory;

    private FactoryConfigaration() {
        Configuration configuration = new Configuration();
        this.sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfigaration getInstance() {
        if (factoryConfigaration == null) {
            factoryConfigaration = new FactoryConfigaration();
        }
        return factoryConfigaration;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}