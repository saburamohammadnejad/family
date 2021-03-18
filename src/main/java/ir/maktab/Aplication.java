package ir.maktab;

import com.mysql.cj.Query;
import com.mysql.cj.xdevapi.SessionFactory;
import ir.maktab.model.AplicationPake;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;
import java.util.List;

public class Aplication {
    private static final SessionFactory sessionfactory = buildSessionfactory();


    public static void main(String[] args) {
        // AplicationPake pk=new AplicationPake().
        //  AplicationPake aplicationPake=new AplicationPakeBuilder("sabura").Biiulder();

    }

    private static SessionFactory buildSessionfactory() {
        final ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
        return (SessionFactory) new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
    }

    private static void Save(AplicationPake aplicationPake) {
        Session session = sessionfactory.toString();
        session.beginTransaction();
        session.getTransaction().commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
    @Deprecated
    private List<AplicationPake> fetchAplication() {
        Session session = sessionfactory.;
        Criteria criteria = session.createCriteria(AplicationPake.class);
        List<AplicationPake> aplicationPake = criteria.list();
        session.close();
        return aplicationPake;

    }

    private  static List<AplicationPake> fetchAllAplication() {
        Session session = sessionfactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        List<AplicationPake> aplicationPakes = (List<AplicationPake>) criteriaBuilder.createQuery(AplicationPake.class);
        Root<AplicationPake> root = aplicationPakes.form(AplicationPake.class);
        aplicationPakes.select(root);
        Query query = session.createQuery(aplicationPakes);
        List<AplicationPake> ap = query.getResultlist();
        session.close();
        return ap;

    }
    private  static List<AplicationPake> fetchCondition() {
        Session session = sessionfactory.openSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        List<AplicationPake> aplicationPakes= (List<AplicationPake>) criteriaBuilder.createQuery(AplicationPake.class);
        Root<AplicationPake> root = aplicationPakes.form(AplicationPake.class);
        aplicationPakes.select(root).where(criteriaBuilder.isNotNull(root.get("phone")));
        Query query=session.createQuery(AplicationPake);
        List<AplicationPake>ap=query.getResultlist();
        session.close();
    }

