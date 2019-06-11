package com.stylefeng.guns.rest.modular.film.handler;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.*;
import java.util.Arrays;

@MappedTypes(String.class)
public class StringToInt implements TypeHandler<int []> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, int[] ints, JdbcType jdbcType) throws SQLException {
        if(null==ints){
           preparedStatement.setNull(i,Types.VARCHAR);
        }else {
            StringBuffer stringBuffer = new StringBuffer();
            for (int e : ints) {
                stringBuffer.append("#");
                stringBuffer.append(e);
            }
            stringBuffer.append("#");
            preparedStatement.setString(i, String.valueOf(stringBuffer));
        }
    }

    @Override
    public int[] getResult(ResultSet resultSet, String s) throws SQLException {
        String string = resultSet.getString(s);
        String substring = string.substring(1, string.length() - 1);
        String[] split = substring.split("#");
        int length = split.length;
        int [] result = new int[length];
        for (int i = 0; i <split.length ; i++) {
            result[i]= Integer.parseInt(split[i]);
        }
        return  result;
    }

    @Override
    public int[] getResult(ResultSet resultSet, int i) throws SQLException {
        String string = resultSet.getString(i);
        String substring = string.substring(1, string.length() - 1);
        String[] split = substring.split("#");
        int length = split.length;
        int [] result = new int[length];
        for (int j = 0; j <split.length ; j++) {
            result[j]= Integer.parseInt(split[j]);
        }
        return  result;
    }

    @Override
    public int[] getResult(CallableStatement callableStatement, int i) throws SQLException {
        String string = callableStatement.getString(i);
        String substring = string.substring(1, string.length() - 1);
        String[] split = substring.split("#");
        int length = split.length;
        int [] result = new int[length];
        for (int j = 0; j <split.length ; j++) {
            result[j]= Integer.parseInt(split[j]);
        }
        return  result;
    }
}
