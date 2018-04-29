package main.IBATIS;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.ibatis.sqlmap.client.SqlMapSession;
import com.ibatis.sqlmap.engine.impl.SqlMapExecutorDelegate;
import com.ibatis.sqlmap.engine.mapping.statement.MappedStatement;
import com.ibatis.sqlmap.engine.scope.SessionScope;
import com.ibatis.sqlmap.engine.scope.StatementScope;
import main.IBATIS.domain.Packinfo;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

public class IbatisDynamic {
    public static void main(String[] args) throws IOException, SQLException {
        Reader rd = Resources.getResourceAsReader( "SqlMapConfig.xml" );
        SqlMapClient smc = SqlMapClientBuilder.buildSqlMapClient( rd );
//        SqlMapSession session = smc.openSession();
//        SessionScope sessionScope = new SessionScope();
//        sessionScope.setSqlMapClient(smc);
//        sessionScope.setSqlMapExecutor(smc);
//        sessionScope.setSqlMapTxMgr(session);
//
//        StatementScope statementScope = new StatementScope(sessionScope);
//        sessionScope.incrementRequestStackDepth();
//        SqlMapExecutorDelegate delegate = session.getDelegate();
//        MappedStatement ms = delegate.getMappedStatement(sqlId);
//        ms.initRequest(statementScope);

        Packinfo packinfo = new Packinfo( "179","","","156" );
        System.out.println( packinfo.getPackName() );
        smc.queryForObject("Packinfo.queryByDynamic", packinfo );
    }
}
