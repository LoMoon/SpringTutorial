package main.IBATIS;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import main.IBATIS.domain.Packinfo;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

public class IbatisInsert {
    public static void main(String[] args) throws IOException, SQLException {
        Reader rd = Resources.getResourceAsReader( "SqlMapConfig.xml" );
        SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient( rd );
        System.out.println( "开始ibitais" );
        Packinfo packinfo = new Packinfo( "123","456" ,"789","147" );
        smc.insert("Packinfo.insert" , packinfo );
        System.out.println( "第一次ibitasi成功" );
    }
}
