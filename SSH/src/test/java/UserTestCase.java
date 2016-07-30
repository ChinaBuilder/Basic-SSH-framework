import com.kaishengit.Service.UserService;
import com.kaishengit.pojo.User;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.transaction.annotation.Transactional;
import javax.inject.Inject;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTestCase {


    @Inject
    private SessionFactory sessionFactory;

    @Inject
    private UserService userService;

    @Test
    public void userTest(){
      User user = userService.findUserByName("admin");
        System.out.println(user);

    }

    @Test
    public void roleTest(){
        userService.findRoleByRoleid(1);
    }
}
