package mapper;

import org.apache.ibatis.annotations.Param;
import pojo.Role;

import java.util.List;

public interface RoleMapper {
    Role getRole(Integer id);
    int deleteRole(Integer id);
    int insertRole(Role role);
    int updateRole(Role role);
    List<Role> findRoles(@Param("roleName")String roleName,@Param("note")String note);
    List<Role> selectId(List<Integer> list);
}
