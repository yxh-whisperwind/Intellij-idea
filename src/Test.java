import mapper.RoleMapper;
import org.apache.ibatis.session.SqlSession;
import pojo.Role;

import java.io.IOException;

public class Test {

    public static void main (String[] args) throws IOException{
        SqlSession sqlSession = null;
        try {
            sqlSession = SqlSessionFactoryUtils.openSqlSession();
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            Role role = roleMapper.getRole(1);
            sqlSession.commit();
            System.out.println(role.roleName);
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }



    }
}
