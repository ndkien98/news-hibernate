import config.HibernateConfig;
import entity.UserEntity;
import org.hibernate.Session;

public class Main {


    public static void main(String[] args) {

        Session session =  HibernateConfig.getSessionFactory().openSession();
        session.beginTransaction();

        UserEntity userEntity = new UserEntity();
        userEntity.setId(3);
        userEntity.setFullName("Nguyễn Đắc Kiên");

        session.saveOrUpdate(userEntity);
        Integer userId = (Integer) session.save(userEntity);

        session.getTransaction().commit();
        UserEntity userSaved = session.find(UserEntity.class,userId);
        System.out.printf(userSaved.toString());

    }
}
