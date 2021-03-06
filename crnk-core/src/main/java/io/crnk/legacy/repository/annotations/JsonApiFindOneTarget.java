package io.crnk.legacy.repository.annotations;

import io.crnk.legacy.queryParams.QueryParams;

import java.io.Serializable;
import java.lang.annotation.*;

/**
 * <p>
 * Method annotated with this annotation will be used to perform find one relationship repository on a particular
 * document. The method must be defined in a class annotated with {@link JsonApiRelationshipRepository}.
 * </p>
 * <p>
 * The requirements for the method parameters are as follows:
 * </p>
 * <ol>
 * <li>An identifier of a source document</li>
 * <li>Relationship's field name</li>
 * </ol>
 * <p>
 * The return value must be a resources of {@link JsonApiRelationshipRepository#target()} type.
 * </p>
 *
 * @see io.crnk.legacy.repository.RelationshipRepository#findOneTarget(Serializable, String, QueryParams)
 * @deprecated Make use of ResourceRepositoryV2 and related classes
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface JsonApiFindOneTarget {
}
