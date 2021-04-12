package ma.direction.marinemarchande.dao;

import java.util.List;

import javax.persistence.EntityManager;
 

/**
 * Definition of methods for all DAO.
 *
 * @param <E>
 *            Class of the entity
 * @param <K>
 *            Class of the primary key
 * @author  
 */
public interface AbstractDao<E, K> {

    /**
     * Find an entity by primary key.
     *
     * @param id
     *            Identifier of the entity
     * @return Detail of the entity
     */
    E find(K id);

    /**
     * Find all entities.
     *
     * @return List of entities
     */
    List<E> findAll();
 
    /**
     * Create an entity.
     *
     * @param entity
     *            The entity to create
     * @return The entity created
     */
    E create(E entity);

    /**
     * Update an entity.
     *
     * @param entity
     *            The entity to update
     * @return THe entity updated
     */
    E update(E entity);

    /**
     * Delete an entity.
     *
     * @param id
     *            Identifier of the entity
     */
    void deleteById(K id);

    /**
     * Check if an entity exist.
     *
     * @param id
     *            Identifier of the entity
     * @return <code>true</code> if the entity exists else otherwise
     */
    boolean exists(K id);

    /**
     * 
     * @return EntityManager
     */
    EntityManager getEntityManager();
 
}
