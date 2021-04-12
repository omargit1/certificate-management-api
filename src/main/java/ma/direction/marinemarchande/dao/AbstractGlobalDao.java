package ma.direction.marinemarchande.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

/**
 *  
 * 
 * -----------------------------------
 * 
 * (Description)
 *
 * @since  
 * @author 
 */
public abstract class AbstractGlobalDao {

    /** select new object */
    public static final String SELECT_NEW = "SELECT NEW ";

    /** SELECT KEYWORD */
    public static final String SELECT = "SELECT ";

    /** DELETE KEYWORD */
    public static final String DELETE = "DELETE ";

    /** UPDATE KEYWORD */
    public static final String UPDATE = "UPDATE ";

    /** DELETE KEYWORD */
    public static final String INSERT = "INSERT INTO ";

    /** DISTINCT KEYWORD */
    public static final String DISTINCT = " DISTINCT ";

    /** COUNT KEYWORD */
    public static final String COUNT = " COUNT ";

    /** SET KEYWORD */
    public static final String SET = " SET ";

    /** FROM KEYWORD */
    public static final String FROM = " FROM ";

    /** INNER JOIN KEYWORD */
    public static final String INNER_JOIN = " INNER JOIN ";

    /** LEFT JOIN KEYWORD */
    public static final String LEFT_JOIN = " LEFT JOIN ";

    /** LEFT OUTER JOIN KEYWORD */
    public static final String LEFT_OUTER_JOIN = " LEFT OUTER JOIN ";

    /** JOIN KEYWORD */
    public static final String JOIN = " JOIN ";

    /** ON KEYWORD */
    public static final String ON = " ON ";

    /**
     * APOSTROPHE KEYWORD
     */
    public static final String APOSTROPHE = "'";

    /**
     * WHERE KEYWORD
     */
    public static final String WHERE = " WHERE ";

    /** LENGTH KEYWORD */
    public static final String LENGTH = " LENGTH ";

    /** ( KEYWORD */
    public static final String PARO = " ( ";

    /** ) KEYWORD */
    public static final String PARF = " ) ";

    /** : KEYWORD */
    public static final String COLON = ":";

    /** . KEYWORD */
    public static final String DOT = ".";

    /** BETWEEN KEYWORD */
    public static final String BETWEEN = " BETWEEN ";

    /** COMMA, KEYWORD */
    public static final String COMMA = ", ";

    /** AND KEYWORD */
    public static final String AND = " AND ";

    /** AND NOT KEYWORD */
    public static final String AND_NOT = " AND NOT ";

    /** IN KEYWORD */
    public static final String IN = " IN ";

    /** NOT IN KEYWORD */
    public static final String NOT_IN = " NOT IN ";

    /** OR KEYWORD */
    public static final String OR = " OR ";

    /** = KEYWORD */
    public static final String EQUALS = " = ";

    /** = DIFFERENT */
    public static final String DIFFERENT = " != ";

    /** ORDER BY KEYWORD */
    public static final String ORDERBY = " ORDER BY ";

    /** GROUP BY KEYWORD */
    public static final String GROUPBY = " GROUP BY ";

    /** UNION KEYWORD */
    public static final String UNION = " UNION ";

    /**
     * UNION KEYWORD
     */
    public static final String UNION_ALL = " UNION ALL ";
    /**
     * INTERSECT KEYWORD
     */
    public static final String INTERSECT = " INTERSECT ";
    /**
     * MINUS KEYWORD
     */
    public static final String MINUS = " MINUS ";

    /** ORDER BY KEYWORD */
    public static final String DESC = " DESC ";

    /** ORDER BY KEYWORD */
    public static final String ASC = " ASC ";

    /**
     * AS KEYWORD
     */
    public static final String AS = " AS ";

    /**
     * IS NULL KEYWORD
     */
    public static final String ISNULL = " IS NULL ";

    /** IS NOT NULL KEYWORD */
    public static final String ISNOTNULL = " IS NOT NULL ";

    /** espace */
    public static final String SPACE = " ";

    /** pourcent % KEYWORD */
    public static final String POURCENT = "%";

    /** LIKE */
    public static final String LIKE = " LIKE ";

    /** FOR UPDATE */
    public static final String FOR_UPDATE = " FOR UPDATE ";

    /** Entity manager for persistence. */
    @PersistenceContext(type = PersistenceContextType.TRANSACTION)
    private EntityManager entityManager;

    /**
     * Get the entity manager.
     *
     * @return the entity manager
     */
    public final EntityManager getEntityManager() {
        return this.entityManager;
    }

}
