package typeHandler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;
import pojo.SexEnum;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedJdbcTypes(JdbcType.INTEGER)
@MappedTypes({SexEnum.class})
public class SexTypeHandler implements TypeHandler<SexEnum> {

    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, SexEnum sexEnum, JdbcType jdbcType) throws SQLException {
        preparedStatement.setInt(i,sexEnum.getId());
    }

    @Override
    public SexEnum getResult(ResultSet resultSet, String s) throws SQLException {
        Object id = resultSet.getObject(s);
        if (id == null) {
            return null;
        }
        return SexEnum.getSexEnumById((Integer) id);
    }

    @Override
    public SexEnum getResult(ResultSet resultSet, int i) throws SQLException {
        Object id = resultSet.getObject(i);
        if (id==null) {
            return null;
        }
        return SexEnum.getSexEnumById((Integer) id);
    }

    @Override
    public SexEnum getResult(CallableStatement callableStatement, int i) throws SQLException {
       Object id = callableStatement.getObject(i);
        return SexEnum.getSexEnumById((Integer) id);
    }
}
