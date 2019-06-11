package com.stylefeng.guns.rest.modular.film.handler;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.*;

@MappedTypes(String[].class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class StringToList extends BaseTypeHandler<String[]> {


    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, String[] strings, JdbcType jdbcType) throws SQLException {
        if (null == strings) {
            preparedStatement.setNull(i, Types.VARCHAR);
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            for (String e : strings) {
                stringBuffer.append(e);
            }
            preparedStatement.setString(i, String.valueOf(stringBuffer));
        }
    }

    @Override
    public String[] getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String string = resultSet.getString(s);
        String[] split = string.split(",");

        return split;
    }

    @Override
    public String[] getNullableResult(ResultSet resultSet, int i) throws SQLException {
        String string = resultSet.getString(i);
        String[] split = string.split(",");
        return split;
    }

    @Override
    public String[] getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        String string = callableStatement.getString(i);
        if(null==string){return null;}
        String[] split = string.split(",");
        return split;
    }
}
