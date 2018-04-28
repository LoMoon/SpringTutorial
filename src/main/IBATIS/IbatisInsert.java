package main.IBATIS;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import main.IBATIS.domain.Packinfo;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public class IbatisInsert {
    public static void main(String[] args) throws IOException, SQLException {
        Reader rd = Resources.getResourceAsReader( "SqlMapConfig.xml" );
        SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient( rd );
        System.out.println( "开始ibitais" );
        Packinfo packinfo = new Packinfo( "158","456" ,"789","147" );
        smc.insert("Packinfo.insert" , packinfo );
        System.out.println( "第一s次ibitasi成功" );

        packinfo.setPackName("上门服务");
        smc.update( "Packinfo.update", packinfo );

        List<Packinfo> packinfos = smc.queryForList( "Packinfo.query" );
        for( Packinfo packinfo1: packinfos ){
            System.out.print("  " + packinfo1.getSignId());
            System.out.print("  " + packinfo1.getPackName());
            System.out.print("  " + packinfo1.getPackType());
            System.out.print("  " + packinfo1.getPackid());
            System.out.println("");
        }

//        smc.delete( "Packinfo.delete", "123" );

        Packinfo packinfo1 = (Packinfo) smc.queryForObject( "Packinfo.queryByResult","158" );
        System.out.println( packinfo.getPackid() );
        System.out.println( packinfo.getPackName() );
        System.out.println( packinfo.getPackType() );
        System.out.println( packinfo.getSignId() );
    }
}
