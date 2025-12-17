package org.springframework.data.repository;
import java. util. List;
@NoRepositoryBean
public interface ListCrudRepository<T, ID> extends CrudRepository<T, ID> {
<S extends T > List<S> saveA11(Iterab1e<S> entities)
List<T> findA11();
ids)