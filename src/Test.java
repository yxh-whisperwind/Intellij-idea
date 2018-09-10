import mapper.SexMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.Role;

import java.io.IOException;
import java.util.List;

public class Test {

    public static void main (String[] args) throws IOException{
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            sqlSession.commit(false);
            SexMapper sexMapper = sqlSession.getMapper(SexMapper.class);
            List<Role> list = sexMapper.findRoles("802","");
            for (Role role:list) {
                try {
                    System.out.println(role.getId()+"\t"+role.getSexEnum().getSex());
                } catch (NullPointerException e) {
                    System.out.println(role.getId());
                   // e.printStackTrace();
                }
            }

        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }



    }
}
