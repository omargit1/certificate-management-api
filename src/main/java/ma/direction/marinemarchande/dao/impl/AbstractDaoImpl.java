package ma.direction.marinemarchande.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import ma.direction.marinemarchande.dao.AbstractDao;
import ma.direction.marinemarchande.dao.AbstractGlobalDao;

/**
 * 
 *  
 * 
 * -----------------------------------
 * 
 * Abstract DAO.
 *
 * @since  
 * @author  
 * 
 * @param <E>
 *            Class of the entity
 * @param <K>
 *            Class of the primary keys
 */
public abstract class AbstractDaoImpl<E, K> extends AbstractGlobalDao implements AbstractDao<E, K> {

    /**
     * SELECT NEW String
     */
    protected static final String SELECT_NEW = "SELECT NEW ";
    
    /**
     * Naturel ID of the entity E
     */
    protected String naturalIdField;

    /**
     * SELECT NEW String
     */
    protected static final String SELECT_NEW_DISTINCT = "SELECT DISTINCT NEW ";
 

    /**
     * Class of the entity.
     */
    private Class<E> clazz;

  

    /**
     * Default constructor.
     *
     * @param pClazz
     *            Class of the entity
     */
    public AbstractDaoImpl(final Class<E> pClazz) {
        this.clazz = pClazz;
    }
    
    public AbstractDaoImpl(Class<E> pClazz, String naturalIdField) {
    	this(pClazz);
        this.naturalIdField = naturalIdField;
    }

    @Override
    public E create(final E t) {
        this.getEntityManager().persist(t);
        return t;
    }

    @Override
    public E update(final E entity) {
        return this.getEntityManager().merge(entity);
    }

    @Override
    public void deleteById(final K id) {
        this.getEntityManager().remove(this.getEntityManager().getReference(this.clazz, id));
    }

    @Override
    public E find(final K id) {
        return this.getEntityManager().find(this.clazz, id);
    }
 
 

    @Override
    public List<E> findAll() {
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("FROM ");
        queryBuilder.append(this.clazz.getSimpleName());

        TypedQuery<E> contentQuery = this.getEntityManager().createQuery(queryBuilder.toString(), this.clazz);

        return contentQuery.getResultList();
    }

    @Override
    public boolean exists(final K id) {
        return this.find(id) != null;

    }
 
 

}
